package com.oracle.truffle.wasm.runtime;

public final class WasmTableRegistry {

    private TableObject tableObject;

    public WasmTableRegistry() {}

    public TableObject lookup(String name, int min, int max, boolean createIfNotPresent) {
        TableObject result = tableObject; // disregards params and simply returns existing table if try to register more... ok behavior?
        if (result == null && createIfNotPresent) {
            result = new TableObject(min, max);
            tableObject = result;
        }
        return result;
    }

    public TableObject getTableObject() {
        return tableObject;
    }

    public TableObject register(String name, int min, int max) {
        return lookup(name, min, max, true);
    }

    public int growTable(int toGrow) {
        int oldSize = getTableObject().getArraySize();
        int max = getTableObject().getMaxSize();
        if (oldSize + toGrow < max || max == -1) {
            getTableObject().grow(toGrow);
            return oldSize;
        } else {
            return -1;
        }
    }
}
