package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "rotl")
public abstract class WasmRotateLeftNode extends WasmBinaryNode {

    @Specialization
    protected int rotl(int num, int amt) {
        int k = amt % 32;
        return Integer.rotateLeft(num, k);
    }

    @Specialization
    protected long rotl(long num, long amt) {
        int k = (int) amt % 32;
        long first = Long.rotateLeft(num, k);
        k = (int) (amt - k) % 32;
        return Long.rotateLeft(first, k);
    }

    @Fallback
    protected Object typeError(Object num, Object amt) {
        throw WasmException.typeError(this, num, amt);
    }
}
