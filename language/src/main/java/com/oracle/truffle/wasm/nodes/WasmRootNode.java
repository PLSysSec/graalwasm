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
package com.oracle.truffle.wasm.nodes;

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.builtins.WasmBuiltinNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmFunctionBodyNode;

/**
 * The root of all Wasm execution trees. It is a Truffle requirement that the tree root extends the
 * class {@link RootNode}. This class is used for both builtin and user-defined functions. For
 * builtin functions, the {@link #bodyNode} is a subclass of {@link WasmBuiltinNode}. For user-defined
 * functions, the {@link #bodyNode} is a {@link WasmFunctionBodyNode}.
 */
@NodeInfo(language = "Wasm", description = "The root of all Wasm execution trees")
public class WasmRootNode extends RootNode {
    /** The function body that is executed, and specialized during execution. */
    @Child private WasmExpressionNode bodyNode;

    /** The name of the function, for printing purposes only. */
    private final String name;

    /** The index of the function, for printing purposes, if there is no String name. */
    private final Integer index;

    @CompilationFinal private boolean isCloningAllowed;

    private final SourceSection sourceSection;

    public WasmRootNode(WasmLanguage language, FrameDescriptor frameDescriptor, WasmExpressionNode bodyNode, SourceSection sourceSection, String name, Integer index) {
        super(language, frameDescriptor);
        this.bodyNode = bodyNode;
        this.name = name;
        this.index = index;
        this.sourceSection = sourceSection;
    }

    @Override
    public SourceSection getSourceSection() {
        return sourceSection;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        assert lookupContextReference(WasmLanguage.class).get() != null;
        return bodyNode.executeGeneric(frame);
    }

    public WasmExpressionNode getBodyNode() {
        return bodyNode;
    }

    @Override
    public String getName() {
        if (name != null) {
            return name;
        } else {
            return getIndex().toString();
        }
    }

    public Integer getIndex() {
        return index;
    }

    public void setCloningAllowed(boolean isCloningAllowed) {
        this.isCloningAllowed = isCloningAllowed;
    }

    @Override
    public boolean isCloningAllowed() {
        return isCloningAllowed;
    }

    @Override
    public String toString() {
        return name != null ? "root " + name : "root (index) " + index;
    }
}
