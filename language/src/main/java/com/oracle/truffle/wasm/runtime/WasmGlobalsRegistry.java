package com.oracle.truffle.wasm.runtime;

import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

import java.lang.Integer;

public final class WasmGlobalsRegistry {

    private GlobalsObject globalsObject = new GlobalsObject();

    public WasmGlobalsRegistry() {}

    public WasmGlobal lookup(String name, WasmExpressionNode value, boolean mutable, boolean createIfNotPresent) {
        WasmGlobal result = globalsObject.globals.get(name);
        if (result == null && createIfNotPresent) {
            result = new WasmGlobal(name, value, mutable);
            globalsObject.globals.put(name, result);
        }
        return result;
    }

    public GlobalsObject getGlobalsObject() {
        return globalsObject;
    }

    public WasmGlobal register(String name, WasmExpressionNode value, boolean mutable) {
        return lookup(name, value, mutable, true);
    }

    public void setValue(String name, WasmExpressionNode value) {
        WasmGlobal global = globalsObject.globals.get(name);
        if (global != null) {
            global.setValue(value);
            return;
        }

        throw new RuntimeException("global does not exist (setval operation)");
    }

    public GlobalsObject getGlobalObject() { return globalsObject; }
}
