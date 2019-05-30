package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "max")
public abstract class WasmMaxNode extends WasmBinaryNode {

    @Specialization
    protected int max(int left, int right) {
        return Integer.max(left, right);
    }

    @Specialization
    protected long max(long left, long right) {
        return Long.max(left, right);
    }

    @Fallback
    protected Object typeError(Object left, Object right) {
        throw WasmException.typeError(this, left, right);
    }
}