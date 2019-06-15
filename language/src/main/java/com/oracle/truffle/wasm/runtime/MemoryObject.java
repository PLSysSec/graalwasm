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

import java.util.HashMap;
import java.util.Map;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;

import java.lang.Integer;

@ExportLibrary(InteropLibrary.class)
@SuppressWarnings("static-method")
public final class MemoryObject implements TruffleObject { // DynamicObject?

    /**
     * Sizes are in units of page size.
     */
    private static final int PAGESIZE = 65536;
    private final String name;
    private int min;
    private int max = -1;

    private byte[] memory;

    protected MemoryObject(String name, int min, int max) {
        this.name = name;
        this.min = min * PAGESIZE;
        if (max != -1) this.max = max * PAGESIZE;
        memory = new byte[this.min];
    }

    @ExportMessage
    public boolean hasArrayElements() { return true; }

    @ExportMessage
    protected boolean isArrayElementReadable(long index) {
        return index >= 0 && index < memory.length; //getArraySize();
    }

    @ExportMessage
    public int getArraySize() {
        return memory.length / PAGESIZE;
    }

    public int getMinSize() {
        return min / PAGESIZE;
    }

    public int getMaxSize() {
        return max / PAGESIZE;
    }

    //@ExportMessage
    public byte readElement(long index) throws InvalidArrayIndexException {
        long idx = index;// * PAGESIZE;
        if (!isArrayElementReadable(idx)) {
            CompilerDirectives.transferToInterpreter();
            throw InvalidArrayIndexException.create(index);
        }
        return memory[(int) idx];
    }

    //@ExportMessage
    public void writeElement(long index, byte value) throws InvalidArrayIndexException {
        long idx = index;// * PAGESIZE;
        if (!isArrayElementReadable(idx)) {
            CompilerDirectives.transferToInterpreter();
            throw InvalidArrayIndexException.create(index);
        }
        memory[(int) idx] = value;
    }

    @ExportMessage
    public Object readArrayElement(long index) throws InvalidArrayIndexException {
        long idx = index;// * PAGESIZE;
        if (!isArrayElementReadable(idx)) {
            CompilerDirectives.transferToInterpreter();
            throw InvalidArrayIndexException.create(index);
        }
        return memory[(int) idx];
    }

    public int grow(int toGrow) {
        int delta = toGrow * PAGESIZE;
        int newSize = memory.length + delta;
        byte[] newMemory = new byte[newSize];
        for (int i = 0; i < memory.length; i++) {
            newMemory[i] = memory[i];
        }
        int oldSize = memory.length;
        memory = newMemory;
        return oldSize;
    }
}
