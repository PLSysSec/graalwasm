package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "or")
public abstract class WasmBitwiseOrNode extends WasmBinaryNode {

    @Specialization
    protected int or(int left, int right) {
        return left | right;
    }

    @Specialization
    protected long or(long left, long right) {
        return left | right;
    }
}