package com.oracle.truffle.wasm.runtime;

import java.lang.Integer;

public final class WasmMemoryRegistry {

    private MemoryObject memoryObject;

    public WasmMemoryRegistry() {}

    public MemoryObject lookup(String name, int min, int max, boolean createIfNotPresent) {
        MemoryObject result = memoryObject; // disregards params and simply returns existing memory if try to register more... ok behavior?
        if (result == null && createIfNotPresent) {
            result = new MemoryObject(name, min, max);
            memoryObject = result;
        }
        return result;
    }

    public MemoryObject getMemoryObject() {
        return memoryObject;
    }

    public MemoryObject register(String name, int min, int max) {
        return lookup(name, min, max, true);
    }

    public int growMemory(int toGrow) {
        int oldSize = getMemoryObject().getArraySize();
        int max = getMemoryObject().getMaxSize();
        if (oldSize + toGrow < max || max == -1) {
            getMemoryObject().grow(toGrow);
            return oldSize;
        } else {
            return -1;
        }
    }
}
