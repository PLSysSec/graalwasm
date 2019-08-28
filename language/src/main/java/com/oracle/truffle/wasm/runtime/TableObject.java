package com.oracle.truffle.wasm.runtime;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;

import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;

@ExportLibrary(InteropLibrary.class)
@SuppressWarnings("static-method")
public final class TableObject implements TruffleObject {

    //private final String name;
    private int min;
    private int max = -1;

    private int[] table; // FIXME use ArrayList if non-primitive type needed
    //private ArrayList<> table; // FIXME hold fxn ptrs ?????? how to store? hold fxn signatures? "opaque values" == signature object?

    protected TableObject(int min, int max) {
        this.min = min;
        if (max != -1) { this.max = max; }
        table = new int[this.min];
    }

    @ExportMessage
    public boolean hasArrayElements() { return true; }

    @ExportMessage
    protected boolean isArrayElementReadable(long index) {
        return index >= 0 && index < table.length; //getArraySize();
    }

    @ExportMessage
    public int getArraySize() {
        return table.length;
    }

    public int getMinSize() {
        return min;
    }

    public int getMaxSize() {
        return max;
    }

    //@ExportMessage
    public int readElement(long index) throws InvalidArrayIndexException {
        if (!isArrayElementReadable(index)) {
            CompilerDirectives.transferToInterpreter();
            throw InvalidArrayIndexException.create(index);
        }
        return table[(int) index];
    }

    //@ExportMessage
    public void writeElement(long index, int value) throws InvalidArrayIndexException {
        if (!isArrayElementReadable(index)) {
            CompilerDirectives.transferToInterpreter();
            throw InvalidArrayIndexException.create(index);
        }
        table[(int) index] = value;
    }

    public int grow(int toGrow) {
        int delta = toGrow;
        int newSize = table.length + delta;
        int[] newTable = new int[newSize];
        for (int i = 0; i < table.length; i++) {
            newTable[i] = table[i];
        }
        int oldSize = table.length;
        table = newTable;
        return oldSize;
    }

    @ExportMessage
    Object readArrayElement(long index) throws InvalidArrayIndexException {
        if (!isArrayElementReadable(index)) {
            CompilerDirectives.transferToInterpreter();
            throw InvalidArrayIndexException.create(index);
        }
        return table[(int) index];
    }
}
