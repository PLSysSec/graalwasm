/*
 * Copyright (c) 2012, 2019, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.wasm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Scope;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextPolicy;
import com.oracle.truffle.api.debug.DebuggerTags;
import com.oracle.truffle.api.dsl.NodeFactory;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.instrumentation.ProvidedTags;
import com.oracle.truffle.api.instrumentation.StandardTags;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.RootNode;
import com.oracle.truffle.api.object.DynamicObject;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.wasm.builtins.WasmBuiltinNode;
import com.oracle.truffle.wasm.builtins.WasmDefineFunctionBuiltin;
import com.oracle.truffle.wasm.builtins.WasmNanoTimeBuiltin;
import com.oracle.truffle.wasm.builtins.WasmPrintlnBuiltin;
import com.oracle.truffle.wasm.builtins.WasmReadlnBuiltin;
import com.oracle.truffle.wasm.builtins.WasmStackTraceBuiltin;
import com.oracle.truffle.wasm.nodes.WasmEvalRootNode;
import com.oracle.truffle.wasm.nodes.WasmTypes;
import com.oracle.truffle.wasm.nodes.controlflow.WasmBlockNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmBreakNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmContinueNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmDebuggerNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmIfNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmReturnNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmWhileNode;
import com.oracle.truffle.wasm.nodes.expression.WasmAddNode;
import com.oracle.truffle.wasm.nodes.expression.WasmBigIntegerLiteralNode;
import com.oracle.truffle.wasm.nodes.expression.WasmDivNode;
import com.oracle.truffle.wasm.nodes.expression.WasmEqualNode;
import com.oracle.truffle.wasm.nodes.expression.WasmFunctionLiteralNode;
import com.oracle.truffle.wasm.nodes.expression.WasmInvokeNode;
import com.oracle.truffle.wasm.nodes.expression.WasmLessOrEqualNode;
import com.oracle.truffle.wasm.nodes.expression.WasmLessThanNode;
import com.oracle.truffle.wasm.nodes.expression.WasmLogicalAndNode;
import com.oracle.truffle.wasm.nodes.expression.WasmLogicalOrNode;
import com.oracle.truffle.wasm.nodes.expression.WasmMulNode;
import com.oracle.truffle.wasm.nodes.expression.WasmReadPropertyNode;
import com.oracle.truffle.wasm.nodes.expression.WasmStringLiteralNode;
import com.oracle.truffle.wasm.nodes.expression.WasmSubNode;
import com.oracle.truffle.wasm.nodes.expression.WasmWritePropertyNode;
import com.oracle.truffle.wasm.nodes.local.WasmLexicalScope;
import com.oracle.truffle.wasm.nodes.local.WasmReadLocalVariableNode;
import com.oracle.truffle.wasm.nodes.local.WasmWriteLocalVariableNode;
import com.oracle.truffle.wasm.parser.WasmNodeFactory;
import com.oracle.truffle.wasm.parser.WasmLanguageLexer;
import com.oracle.truffle.wasm.parser.WasmLanguageParser;
import com.oracle.truffle.wasm.runtime.WasmBigNumber;
import com.oracle.truffle.wasm.runtime.WasmContext;
import com.oracle.truffle.wasm.runtime.WasmFunction;
import com.oracle.truffle.wasm.runtime.WasmFunctionRegistry;
import com.oracle.truffle.wasm.runtime.WasmNull;

/**
 * Wasm is a simple language to demonstrate and showcase features of Truffle. The implementation is as
 * simple and clean as possible in order to help understanding the ideas and concepts of Truffle.
 * The language has first class functions, and objects are key-value stores.
 * <p>
 * Wasm is dynamically typed, i.e., there are no type names specified by the programmer. Wasm is
 * strongly typed, i.e., there is no automatic conversion between types. If an operation is not
 * available for the types encountered at run time, a type error is reported and execution is
 * stopped. For example, {@code 4 - "2"} results in a type error because subtraction is only defined
 * for numbers.
 *
 * <p>
 * <b>Types:</b>
 * <ul>
 * <li>Number: arbitrary precision integer numbers. The implementation uses the Java primitive type
 * {@code long} to represent numbers that fit into the 64 bit range, and {@link WasmBigNumber} for
 * numbers that exceed the range. Using a primitive type such as {@code long} is crucial for
 * performance.
 * <li>Boolean: implemented as the Java primitive type {@code boolean}.
 * <li>String: implemented as the Java standard type {@link String}.
 * <li>Function: implementation type {@link WasmFunction}.
 * <li>Object: efficient implementation using the object model provided by Truffle. The
 * implementation type of objects is a subclass of {@link DynamicObject}.
 * <li>Null (with only one value {@code null}): implemented as the singleton
 * {@link WasmNull#SINGLETON}.
 * </ul>
 * The class {@link WasmTypes} lists these types for the Truffle DSL, i.e., for type-specialized
 * operations that are specified using Truffle DSL annotations.
 *
 * <p>
 * <b>Language concepts:</b>
 * <ul>
 * <li>Literals for {@link WasmBigIntegerLiteralNode numbers} , {@link WasmStringLiteralNode strings},
 * and {@link WasmFunctionLiteralNode functions}.
 * <li>Basic arithmetic, logical, and comparison operations: {@link WasmAddNode +}, {@link WasmSubNode
 * -}, {@link WasmMulNode *}, {@link WasmDivNode /}, {@link WasmLogicalAndNode logical and},
 * {@link WasmLogicalOrNode logical or}, {@link WasmEqualNode ==}, !=, {@link WasmLessThanNode &lt;},
 * {@link WasmLessOrEqualNode &le;}, &gt;, &ge;.
 * <li>Local variables: local variables must be defined (via a {@link WasmWriteLocalVariableNode
 * write}) before they can be used (by a {@link WasmReadLocalVariableNode read}). Local variables are
 * not visible outside of the block where they were first defined.
 * <li>Basic control flow statements: {@link WasmBlockNode blocks}, {@link WasmIfNode if},
 * {@link WasmWhileNode while} with {@link WasmBreakNode break} and {@link WasmContinueNode continue},
 * {@link WasmReturnNode return}.
 * <li>Debugging control: {@link WasmDebuggerNode debugger} statement uses
 * {@link DebuggerTags#AlwaysHalt} tag to halt the execution when run under the debugger.
 * <li>Function calls: {@link WasmInvokeNode invocations} are efficiently implemented with
 * {@link WasmDispatchNode polymorphic inline caches}.
 * <li>Object access: {@link WasmReadPropertyNode} uses {@link WasmReadPropertyCacheNode} as the
 * polymorphic inline cache for property reads. {@link WasmWritePropertyNode} uses
 * {@link WasmWritePropertyCacheNode} as the polymorphic inline cache for property writes.
 * </ul>
 *
 * <p>
 * <b>Syntax and parsing:</b><br>
 * The syntax is described as an attributed grammar. The {@link WasmLanguageParser} and
 * {@link WasmLanguageLexer} are automatically generated by ANTLR 4. The grammar contains semantic
 * actions that build the AST for a method. To keep these semantic actions short, they are mostly
 * calls to the {@link WasmNodeFactory} that performs the actual node creation. All functions found in
 * the Wasm source are added to the {@link WasmFunctionRegistry}, which is accessible from the
 * {@link WasmContext}.
 *
 * <p>
 * <b>Builtin functions:</b><br>
 * Library functions that are available to every Wasm source without prior definition are called
 * builtin functions. They are added to the {@link WasmFunctionRegistry} when the {@link WasmContext} is
 * created. Some of the current builtin functions are
 * <ul>
 * <li>{@link WasmReadlnBuiltin readln}: Read a String from the {@link WasmContext#getInput() standard
 * input}.
 * <li>{@link WasmPrintlnBuiltin println}: Write a value to the {@link WasmContext#getOutput() standard
 * output}.
 * <li>{@link WasmNanoTimeBuiltin nanoTime}: Returns the value of a high-resolution time, in
 * nanoseconds.
 * <li>{@link WasmDefineFunctionBuiltin defineFunction}: Parses the functions provided as a String
 * argument and adds them to the function registry. Functions that are already defined are replaced
 * with the new version.
 * <li>{@link WasmStackTraceBuiltin stckTrace}: Print all function activations with all local
 * variables.
 * </ul>
 */
@TruffleLanguage.Registration(id = WasmLanguage.ID, name = "Wasm", defaultMimeType = WasmLanguage.MIME_TYPE, characterMimeTypes = WasmLanguage.MIME_TYPE, contextPolicy = ContextPolicy.SHARED, fileTypeDetectors = WasmFileDetector.class)
@ProvidedTags({StandardTags.CallTag.class, StandardTags.StatementTag.class, StandardTags.RootTag.class, StandardTags.ExpressionTag.class, DebuggerTags.AlwaysHalt.class})
public final class WasmLanguage extends TruffleLanguage<WasmContext> {
    public static volatile int counter;

    public static final String ID = "wasm";
    public static final String MIME_TYPE = "application/x-wasm";

    public WasmLanguage() {
        counter++;
    }

    @Override
    protected WasmContext createContext(Env env) {
        return new WasmContext(this, env, new ArrayList<>(EXTERNAL_BUILTINS));
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        Source source = request.getSource();
        Map<String, RootCallTarget> functions;
        /*
         * Parse the provided source. At this point, we do not have a WasmContext yet. Registration of
         * the functions with the WasmContext happens lazily in WasmEvalRootNode.
         */
        if (request.getArgumentNames().isEmpty()) {
            functions = WasmLanguageParser.parseWasm(this, source);
        } else {
            Source requestedSource = request.getSource();
            StringBuilder sb = new StringBuilder();
            sb.append("function main(");
            String sep = "";
            for (String argumentName : request.getArgumentNames()) {
                sb.append(sep);
                sb.append(argumentName);
                sep = ",";
            }
            sb.append(") { return ");
            sb.append(request.getSource().getCharacters());
            sb.append(";}");
            String language = requestedSource.getLanguage() == null ? ID : requestedSource.getLanguage();
            Source decoratedSource = Source.newBuilder(language, sb.toString(), request.getSource().getName()).build();
            functions = WasmLanguageParser.parseWasm(this, decoratedSource);
        }

        RootCallTarget main = functions.get("main");
        RootNode evalMain;
        if (main != null) {
            /*
             * We have a main function, so "evaluating" the parsed source means invoking that main
             * function. However, we need to lazily register functions into the WasmContext first, so
             * we cannot use the original WasmRootNode for the main function. Instead, we create a new
             * WasmEvalRootNode that does everything we need.
             */
            evalMain = new WasmEvalRootNode(this, main, functions);
        } else {
            /*
             * Even without a main function, "evaluating" the parsed source needs to register the
             * functions into the WasmContext.
             */
            evalMain = new WasmEvalRootNode(this, null, functions);
        }
        return Truffle.getRuntime().createCallTarget(evalMain);
    }

    /*
     * Still necessary for the old Wasm TCK to pass. We should remove with the old TCK. New language
     * should not override this.
     */
    @SuppressWarnings("deprecation")
    @Override
    protected Object findExportedSymbol(WasmContext context, String globalName, boolean onlyExplicit) {
        return context.getFunctionRegistry().lookup(globalName, false);
    }

    @Override
    protected boolean isVisible(WasmContext context, Object value) {
        return !InteropLibrary.getFactory().getUncached(value).isNull(value);
    }

    @Override
    protected boolean isObjectOfLanguage(Object object) {
        if (!(object instanceof TruffleObject)) {
            return false;
        } else if (object instanceof WasmBigNumber || object instanceof WasmFunction || object instanceof WasmNull) {
            return true;
        } else if (WasmContext.isWasmObject(object)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected String toString(WasmContext context, Object value) {
        return toString(value);
    }

    public static String toString(Object value) {
        try {
            if (value == null) {
                return "ANY";
            }
            InteropLibrary interop = InteropLibrary.getFactory().getUncached(value);
            if (interop.fitsInLong(value)) {
                return Long.toString(interop.asLong(value));
            } else if (interop.isBoolean(value)) {
                return Boolean.toString(interop.asBoolean(value));
            } else if (interop.isString(value)) {
                return interop.asString(value);
            } else if (interop.isNull(value)) {
                return "NULL";
            } else if (interop.isExecutable(value)) {
                if (value instanceof WasmFunction) {
                    return ((WasmFunction) value).getName();
                } else {
                    return "Function";
                }
            } else if (interop.hasMembers(value)) {
                return "Object";
            } else if (value instanceof WasmBigNumber) {
                return value.toString();
            } else {
                return "Unsupported";
            }
        } catch (UnsupportedMessageException e) {
            CompilerDirectives.transferToInterpreter();
            throw new AssertionError();
        }
    }

    @Override
    protected Object findMetaObject(WasmContext context, Object value) {
        return getMetaObject(value);
    }

    public static String getMetaObject(Object value) {
        if (value == null) {
            return "ANY";
        }
        InteropLibrary interop = InteropLibrary.getFactory().getUncached(value);
        if (interop.isNumber(value) || value instanceof WasmBigNumber) {
            return "Number";
        } else if (interop.isBoolean(value)) {
            return "Boolean";
        } else if (interop.isString(value)) {
            return "String";
        } else if (interop.isNull(value)) {
            return "NULL";
        } else if (interop.isExecutable(value)) {
            return "Function";
        } else if (interop.hasMembers(value)) {
            return "Object";
        } else {
            return "Unsupported";
        }
    }

    @Override
    protected SourceSection findSourceLocation(WasmContext context, Object value) {
        if (value instanceof WasmFunction) {
            return ((WasmFunction) value).getDeclaredLocation();
        }
        return null;
    }

    @Override
    public Iterable<Scope> findLocalScopes(WasmContext context, Node node, Frame frame) {
        final WasmLexicalScope scope = WasmLexicalScope.createScope(node);
        return new Iterable<Scope>() {
            @Override
            public Iterator<Scope> iterator() {
                return new Iterator<Scope>() {
                    private WasmLexicalScope previousScope;
                    private WasmLexicalScope nextScope = scope;

                    @Override
                    public boolean hasNext() {
                        if (nextScope == null) {
                            nextScope = previousScope.findParent();
                        }
                        return nextScope != null;
                    }

                    @Override
                    public Scope next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Scope vscope = Scope.newBuilder(nextScope.getName(), nextScope.getVariables(frame)).node(nextScope.getNode()).arguments(nextScope.getArguments(frame)).build();
                        previousScope = nextScope;
                        nextScope = null;
                        return vscope;
                    }
                };
            }
        };
    }

    @Override
    protected Iterable<Scope> findTopScopes(WasmContext context) {
        return context.getTopScopes();
    }

    public static WasmContext getCurrentContext() {
        return getCurrentContext(WasmLanguage.class);
    }

    private static final List<NodeFactory<? extends WasmBuiltinNode>> EXTERNAL_BUILTINS = Collections.synchronizedList(new ArrayList<>());

    public static void installBuiltin(NodeFactory<? extends WasmBuiltinNode> builtin) {
        EXTERNAL_BUILTINS.add(builtin);
    }

}
