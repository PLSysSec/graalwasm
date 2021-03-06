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
package com.oracle.truffle.wasm.nodes.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.profiles.BranchProfile;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmFunctionSignatureNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmBlockNode;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmRootNode;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;
import com.oracle.truffle.wasm.nodes.expression.WasmIntegerLiteralNode;
import com.oracle.truffle.wasm.runtime.WasmNull;

import java.util.ArrayList;

/**
 * The body of a user-defined Wasm function. This is the node referenced by a {@link WasmRootNode} for
 * user-defined functions. It handles the return value of a function: the {@link WasmReturnNode return
 * statement} throws an {@link WasmReturnException exception} with the return value. This node catches
 * the exception. If the method ends without an explicit {@code return}, return the
 * {@link WasmNull#SINGLETON default null value}.
 */
@NodeInfo(shortName = "body")
public final class WasmFunctionBodyNode extends WasmExpressionNode {

    /** The body of the function. */
    @Child private WasmStatementNode bodyNode;
    private ArrayList<String> expResults;

    /**
     * Profiling information, collected by the interpreter, capturing whether the function had an
     * {@link WasmReturnNode explicit return statement}. This allows the compiler to generate better
     * code.
     */
    private final BranchProfile exceptionTaken = BranchProfile.create();
    private final BranchProfile nullTaken = BranchProfile.create();

    public WasmFunctionBodyNode(WasmStatementNode bodyNode, ArrayList<String> expResults) {
        this.bodyNode = bodyNode;
        this.expResults = expResults;
        addRootTag();
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        try {
            /* Execute the function body. */
            bodyNode.executeVoid(frame);

        } catch (WasmReturnException ex) {
            /*
             * In the interpreter, record profiling information that the function has an explicit
             * return.
             */
            exceptionTaken.enter();
            /* The exception transports the actual return value. */
            return ex.getResult();
        }

        ArrayList<Object> actResults = ((WasmBlockNode) bodyNode).getResultList();
        if (actResults.size() > 1) {
            throw new RuntimeException("refine result collection");
        }

        /*
         * In the interpreter, record profiling information that the function ends without an
         * explicit return.
         */
        if (actResults.isEmpty() && expResults.isEmpty()) {
            nullTaken.enter();
            /* Return the default null value. */
            return WasmNull.SINGLETON;
        } else {
            /* Return result from stack */
            int numExp = expResults.size();
            int numAct = actResults.size();
            if (numAct != numExp) { // numExp should not exceed 1, so numAct should not either
                throw new RuntimeException("actual and expected number of results differ");
            }

            Object result = actResults.get(0);
            String type = expResults.get(0);

            // Type check result against function signature
            switch (type) {
                case "i32":
                    if (!(result instanceof Integer)) {
                        throw new RuntimeException("expected [i32] but got [" + result.getClass() + "]");
                    }
                    break;
                case "i64":
                    if (!(result instanceof Long)) {
                        throw new RuntimeException("expected [i64] but got [" + result.getClass() + "]");
                    }
                    break;
                case "f32":
                    if (!(result instanceof Float)) {
                        throw new RuntimeException("expected [f32] but got [" + result.getClass() + "]");
                    }
                    break;
                case "f64":
                    if (!(result instanceof Double)) {
                        throw new RuntimeException("expected [f64] but got [" + result.getClass() + "]");
                    }
                    break;
            }

            return result;
        }
    }

    private String getTypeString(Class cls) {
        return ""; // TODO
    }
}
