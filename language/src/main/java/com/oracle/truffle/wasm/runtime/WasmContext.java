/*
 * Copyright (c) 2012, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.wasm.runtime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.Scope;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.Env;
import com.oracle.truffle.api.dsl.NodeFactory;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.instrumentation.AllocationReporter;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.object.DynamicObject;
import com.oracle.truffle.api.object.Layout;
import com.oracle.truffle.api.object.Shape;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.builtins.WasmBuiltinNode;
import com.oracle.truffle.wasm.builtins.WasmDefineFunctionBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmEvalBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmGetSizeBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmHasSizeBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmHelloEqualsWorldBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmImportBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmIsExecutableBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmIsNullBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmNanoTimeBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmNewObjectBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmPrintlnBuiltin;
import com.oracle.truffle.wasm.builtins.WasmPrintlnBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmReadlnBuiltin;
import com.oracle.truffle.wasm.builtins.WasmReadlnBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmStackTraceBuiltinFactory;
import com.oracle.truffle.wasm.builtins.WasmWrapPrimitiveBuiltinFactory;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmRootNode;
import com.oracle.truffle.wasm.nodes.local.WasmReadArgumentNode;

/**
 * The run-time state of Wasm during execution. The context is created by the {@link WasmLanguage}. It
 * is used, for example, by {@link WasmBuiltinNode#getContext() builtin functions}.
 * <p>
 * It would be an error to have two different context instances during the execution of one script.
 * However, if two separate scripts run in one Java VM at the same time, they have a different
 * context. Therefore, the context is not a singleton.
 */
public final class WasmContext {

    private static final Source BUILTIN_SOURCE = Source.newBuilder(WasmLanguage.ID, "", "Wasm builtin").build();
    static final Layout LAYOUT = Layout.createLayout();

    private final Env env;
    private final BufferedReader input;
    private final PrintWriter output;
    private final WasmFunctionRegistry functionRegistry;
    private final Shape emptyShape;
    private final WasmLanguage language;
    private final AllocationReporter allocationReporter;
    private final Iterable<Scope> topScopes; // Cache the top scopes

    public WasmContext(WasmLanguage language, TruffleLanguage.Env env, List<NodeFactory<? extends WasmBuiltinNode>> externalBuiltins) {
        this.env = env;
        this.input = new BufferedReader(new InputStreamReader(env.in()));
        this.output = new PrintWriter(env.out(), true);
        this.language = language;
        this.allocationReporter = env.lookup(AllocationReporter.class);
        this.functionRegistry = new WasmFunctionRegistry(language);
        this.topScopes = Collections.singleton(Scope.newBuilder("global", functionRegistry.getFunctionsObject()).build());
        installBuiltins();
        for (NodeFactory<? extends WasmBuiltinNode> builtin : externalBuiltins) {
            installBuiltin(builtin);
        }
        this.emptyShape = LAYOUT.createShape(WasmObjectType.SINGLETON);
    }

    /**
     * Return the current Truffle environment.
     */
    public Env getEnv() {
        return env;
    }

    /**
     * Returns the default input, i.e., the source for the {@link WasmReadlnBuiltin}. To allow unit
     * testing, we do not use {@link System#in} directly.
     */
    public BufferedReader getInput() {
        return input;
    }

    /**
     * The default default, i.e., the output for the {@link WasmPrintlnBuiltin}. To allow unit
     * testing, we do not use {@link System#out} directly.
     */
    public PrintWriter getOutput() {
        return output;
    }

    /**
     * Returns the registry of all functions that are currently defined.
     */
    public WasmFunctionRegistry getFunctionRegistry() {
        return functionRegistry;
    }

    public Iterable<Scope> getTopScopes() {
        return topScopes;
    }

    /**
     * Adds all builtin functions to the {@link WasmFunctionRegistry}. This method lists all
     * {@link WasmBuiltinNode builtin implementation classes}.
     */
    private void installBuiltins() {
        installBuiltin(WasmReadlnBuiltinFactory.getInstance());
        installBuiltin(WasmPrintlnBuiltinFactory.getInstance());
        installBuiltin(WasmNanoTimeBuiltinFactory.getInstance());
        installBuiltin(WasmDefineFunctionBuiltinFactory.getInstance());
        installBuiltin(WasmStackTraceBuiltinFactory.getInstance());
        installBuiltin(WasmHelloEqualsWorldBuiltinFactory.getInstance());
        installBuiltin(WasmNewObjectBuiltinFactory.getInstance());
        installBuiltin(WasmEvalBuiltinFactory.getInstance());
        installBuiltin(WasmImportBuiltinFactory.getInstance());
        installBuiltin(WasmGetSizeBuiltinFactory.getInstance());
        installBuiltin(WasmHasSizeBuiltinFactory.getInstance());
        installBuiltin(WasmIsExecutableBuiltinFactory.getInstance());
        installBuiltin(WasmIsNullBuiltinFactory.getInstance());
        installBuiltin(WasmWrapPrimitiveBuiltinFactory.getInstance());
    }

    public void installBuiltin(NodeFactory<? extends WasmBuiltinNode> factory) {
        /*
         * The builtin node factory is a class that is automatically generated by the Truffle DSL.
         * The signature returned by the factory reflects the signature of the @Specialization
         *
         * methods in the builtin classes.
         */
        int argumentCount = factory.getExecutionSignature().size();
        WasmExpressionNode[] argumentNodes = new WasmExpressionNode[argumentCount];
        /*
         * Builtin functions are like normal functions, i.e., the arguments are passed in as an
         * Object[] array encapsulated in WasmArguments. A WasmReadArgumentNode extracts a parameter
         * from this array.
         */
        for (int i = 0; i < argumentCount; i++) {
            argumentNodes[i] = new WasmReadArgumentNode(i);
        }
        /* Instantiate the builtin node. This node performs the actual functionality. */
        WasmBuiltinNode builtinBodyNode = factory.createNode((Object) argumentNodes);
        builtinBodyNode.addRootTag();
        /* The name of the builtin function is specified via an annotation on the node class. */
        String name = lookupNodeInfo(builtinBodyNode.getClass()).shortName();
        builtinBodyNode.setUnavailableSourceSection();

        /* Wrap the builtin in a RootNode. Truffle requires all AST to start with a RootNode. */
        WasmRootNode rootNode = new WasmRootNode(language, new FrameDescriptor(), builtinBodyNode, BUILTIN_SOURCE.createUnavailableSection(), name);

        /* Register the builtin function in our function registry. */
        getFunctionRegistry().register(name, Truffle.getRuntime().createCallTarget(rootNode));
    }

    public static NodeInfo lookupNodeInfo(Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        NodeInfo info = clazz.getAnnotation(NodeInfo.class);
        if (info != null) {
            return info;
        } else {
            return lookupNodeInfo(clazz.getSuperclass());
        }
    }

    /*
     * Methods for object creation / object property access.
     */
    public AllocationReporter getAllocationReporter() {
        return allocationReporter;
    }

    /**
     * Allocate an empty object. All new objects initially have no properties. Properties are added
     * when they are first stored, i.e., the store triggers a shape change of the object.
     */
    public DynamicObject createObject(AllocationReporter reporter) {
        DynamicObject object = null;
        reporter.onEnter(null, 0, AllocationReporter.SIZE_UNKNOWN);
        object = emptyShape.newInstance();
        reporter.onReturnValue(object, 0, AllocationReporter.SIZE_UNKNOWN);
        return object;
    }

    public static boolean isWasmObject(Object value) {
        /*
         * LAYOUT.getType() returns a concrete implementation class, i.e., a class that is more
         * precise than the base class DynamicObject. This makes the type check faster.
         */
        return LAYOUT.getType().isInstance(value) && LAYOUT.getType().cast(value).getShape().getObjectType() == WasmObjectType.SINGLETON;
    }

    /*
     * Methods for language interoperability.
     */

    public static Object fromForeignValue(Object a) {
        if (a instanceof Integer || a instanceof Long || a instanceof Float || a instanceof Double || a instanceof Boolean) {//(a instanceof Long || a instanceof WasmBigNumber || a instanceof String || a instanceof Boolean) {
            return a;
        } else if (a instanceof String) {
            return a.hashCode();
        } else if (a instanceof Character) {
            return String.valueOf(a);
        } else if (a instanceof Number) {
            return fromForeignNumber(a);
        } else if (a instanceof TruffleObject) {
            return a;
        } else if (a instanceof WasmContext) {
            return a;
        }
        CompilerDirectives.transferToInterpreter();
        throw new IllegalStateException(a + " is not a Truffle value");
    }

    @TruffleBoundary
    private static long fromForeignNumber(Object a) {
        return ((Number) a).longValue(); // TODO why long?
    }

    public CallTarget parse(Source source) {
        return env.parse(source);
    }

    /**
     * Returns an object that contains bindings that were exported across all used languages. To
     * read or write from this object the {@link TruffleObject interop} API can be used.
     */
    public TruffleObject getPolyglotBindings() {
        return (TruffleObject) env.getPolyglotBindings();
    }

    public static WasmContext getCurrent() {
        return WasmLanguage.getCurrentContext();
    }

}
