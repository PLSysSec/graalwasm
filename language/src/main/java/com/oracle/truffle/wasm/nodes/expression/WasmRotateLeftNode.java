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
        return Integer.rotateLeft(num, amt);
    }

    @Specialization
    protected long rotl(long num, int amt) {
        return Long.rotateLeft(num, amt);
    }

    @Fallback
    protected Object typeError(Object num, Object amt) {
        throw WasmException.typeError(this, num, amt);
    }
}
