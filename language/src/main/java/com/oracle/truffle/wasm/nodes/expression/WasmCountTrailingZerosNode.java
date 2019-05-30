package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "ctz")
public abstract class WasmCountTrailingZerosNode extends WasmUnaryNode {

    @Specialization
    protected int ctz(int num) {
        return Integer.numberOfTrailingZeros(num);
    }

    @Specialization
    protected long ctz(long num) {
        return Long.numberOfTrailingZeros(num);
    }
}