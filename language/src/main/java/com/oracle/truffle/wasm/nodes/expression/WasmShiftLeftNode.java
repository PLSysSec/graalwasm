package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "shl")
public abstract class WasmShiftLeftNode extends WasmBinaryNode {

    @Specialization
    protected int shl(int num, int amt) {
        int k = amt % 32;
        return num << k;
    }

    @Specialization
    protected long shl(long num, long amt) {
        long k = amt % 64;
        return num << k;
    }

    @Fallback
    protected Object typeError(Object num, Object amt) {
        throw WasmException.typeError(this, num, amt);
    }
}