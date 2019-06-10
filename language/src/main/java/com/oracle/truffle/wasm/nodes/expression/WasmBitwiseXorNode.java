package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "xor")
public abstract class WasmBitwiseXorNode extends WasmBinaryNode {

    @Specialization
    protected int xor(int left, int right) {
        return left ^ right;
    }

    @Specialization
    protected long xor(long left, long right) {
        return left ^ right;
    }
}