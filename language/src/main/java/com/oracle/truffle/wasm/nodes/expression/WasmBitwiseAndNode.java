package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "and")
public abstract class WasmBitwiseAndNode extends WasmBinaryNode {

    @Specialization
    protected int add(int left, int right) {
        return left & right;
    }

    @Specialization
    protected long add(long left, long right) {
        return left & right;
    }
}
