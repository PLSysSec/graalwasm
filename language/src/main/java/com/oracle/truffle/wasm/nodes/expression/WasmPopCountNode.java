package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "popcnt")
public abstract class WasmPopCountNode extends WasmUnaryNode {

    @Specialization
    protected int popcnt(int num) {
        return Integer.bitCount(num);
    }

    @Specialization
    protected long popcnt(long num) {
        return Long.bitCount(num);
    }
}