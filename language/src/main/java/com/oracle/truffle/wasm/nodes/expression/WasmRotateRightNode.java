package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "rotr")
public abstract class WasmRotateRightNode extends WasmBinaryNode {

    @Specialization
    protected int rotr(int num, int amt) {
        int k = amt % 32;
        return Integer.rotateRight(num, k);
    }

    @Specialization
    protected long rotr(long num, long amt) {
        int k = (int) amt % 32;
        long first = Long.rotateRight(num, k);
        k = (int) (amt - k) % 32;
        return Long.rotateRight(first, k);
    }

    @Fallback
    protected Object typeError(Object num, Object amt) {
        throw WasmException.typeError(this, num, amt);
    }
}
