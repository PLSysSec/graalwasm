package com.oracle.truffle.wasm.runtime;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;

@ExportLibrary(InteropLibrary.class)
@SuppressWarnings("static-method")
public final class GlobalsObject implements TruffleObject {

    //private boolean mutable = false;

    final Map<String, WasmGlobal> globals = new HashMap<>();

    GlobalsObject() {}

    @ExportMessage
    boolean hasMembers() {
        return true;
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    Object readMember(String member) {
        return globals.get(member);
    }

    /*@ExportMessage
    @CompilerDirectives.TruffleBoundary
    void writeMember(String member, WasmGlobal value) {
        return globals.put(member, value);
    }*/

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    boolean isMemberReadable(String member) {
        return globals.containsKey(member);
    }

    @ExportMessage
    @CompilerDirectives.TruffleBoundary
    Object getMembers(@SuppressWarnings("unused") boolean includeInternal) {
        return new GlobalsObject.GlobalsNamesObject(globals.keySet().toArray());
    }

    public static boolean isInstance(TruffleObject obj) {
        return obj instanceof GlobalsObject;
    }

    @ExportLibrary(InteropLibrary.class)
    static final class GlobalsNamesObject implements TruffleObject {

        private final Object[] names;

        GlobalsNamesObject(Object[] names) {
            this.names = names;
        }

        @ExportMessage
        boolean hasArrayElements() {
            return true;
        }

        @ExportMessage
        boolean isArrayElementReadable(long index) {
            return index >= 0 && index < names.length;
        }

        @ExportMessage
        long getArraySize() {
            return names.length;
        }

        @ExportMessage
        Object readArrayElement(long index) throws InvalidArrayIndexException {
            if (!isArrayElementReadable(index)) {
                CompilerDirectives.transferToInterpreter();
                throw InvalidArrayIndexException.create(index);
            }
            return names[(int) index];
        }
    }
}
