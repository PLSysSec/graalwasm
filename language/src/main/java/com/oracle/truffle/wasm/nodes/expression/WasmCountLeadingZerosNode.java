package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "clz")
public abstract class WasmCountLeadingZerosNode extends WasmUnaryNode {

    @Specialization
    protected int clz(int num) {
        return Integer.numberOfLeadingZeros(num);
    }

    @Specialization
    protected long clz(long num) {
        return Long.numberOfLeadingZeros(num);
    }
}
