/*
 * Copyright (c) 2015, 2018, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.wasm.nodes.util;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmTypes;
import com.oracle.truffle.wasm.runtime.WasmBigNumber;
import com.oracle.truffle.wasm.runtime.WasmFunction;
import com.oracle.truffle.wasm.runtime.WasmNull;

/**
 * The node to normalize any value to an Wasm value. This is useful to reduce the number of values
 * expression nodes need to expect.
 */
@TypeSystemReference(WasmTypes.class)
@NodeChild
public abstract class WasmUnboxNode extends WasmExpressionNode {

    static final int LIMIT = 5;

    /*@Specialization
    protected static String fromString(String value) {
        return value;
    }*/

    @Specialization
    protected static boolean fromBoolean(boolean value) {
        return value;
    }

    @Specialization
    protected static int fromInt(int value) {
        return value;
    }

    @Specialization
    protected static long fromLong(long value) {
        return value;
    }

    @Specialization
    protected static float fromFloat(float value) {
        return value;
    }

    @Specialization
    protected static double fromDouble(double value) {
        return value;
    }

    /*@Specialization
    protected static WasmBigNumber fromBigNumber(WasmBigNumber value) {
        return value;
    }

    @Specialization
    protected static WasmFunction fromFunction(WasmFunction value) {
        return value;
    }

    @Specialization
    protected static WasmNull fromFunction(WasmNull value) {
        return value;
    }*/

    @Specialization(limit = "LIMIT")
    public static Object fromForeign(Object value, @CachedLibrary("value") InteropLibrary interop) {
        try {
            if (interop.fitsInLong(value)) {
                return interop.asLong(value);
            } else if (interop.fitsInDouble(value)) {
                return (long) interop.asDouble(value);
            } else if (interop.isString(value)) {
                return interop.asString(value);
            } else if (interop.isBoolean(value)) {
                return interop.asBoolean(value);
            } else {
                return value;
            }
        } catch (UnsupportedMessageException e) {
            CompilerDirectives.transferToInterpreter();
            throw new AssertionError();
        }
    }

}
