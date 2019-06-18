package com.oracle.truffle.wasm.runtime;

import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;

public final class WasmGlobalsRegistry {

    private GlobalsObject globalsObject = new GlobalsObject();
    private final Map<String, Integer> indices = new HashMap<>();

    public WasmGlobalsRegistry() {}

    public WasmGlobal lookup(String name, Integer index, WasmExpressionNode value, boolean mutable, boolean createIfNotPresent) {
        WasmGlobal result = globalsObject.globals.get(index);
        if (result == null && createIfNotPresent) {
            result = new WasmGlobal(name, index, value, mutable);
            globalsObject.globals.put(index, result);
            if (name != null) mapStringToIndex(name, index);
        }
        return result;
    }

    public GlobalsObject getGlobalsObject() {
        return globalsObject;
    }

    public WasmGlobal register(String name, Integer index, WasmExpressionNode value, boolean mutable) {
        return lookup(name, index, value, mutable, true);
    }

    public void setValue(String name, Integer index, WasmExpressionNode value) {
        WasmGlobal global;
        if (index != null) {
            global = globalsObject.globals.get(index);
        } else {
            Integer indexFromName = getIndex(name);
            global = globalsObject.globals.get(indexFromName);
        }
        if (global != null) {
            global.setValue(value);
            return;
        }

        throw new RuntimeException("attempting to set a non-existent global");
    }

    public void mapStringToIndex(String name, Integer index) {
        indices.put(name, index);
    }

    public Integer getIndex(String name) {
        return indices.get(name);
    }

    public GlobalsObject getGlobalObject() { return globalsObject; }
}
