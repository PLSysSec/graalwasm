package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

@NodeInfo(shortName = "neg")
public abstract class WasmNegNode extends WasmUnaryNode {

    @Specialization
    protected float neg(float num) {
        return -num;
    }

    @Specialization
    protected double neg(double num) {
        return -num;
    }
}