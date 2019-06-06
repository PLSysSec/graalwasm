package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

@NodeInfo(shortName = "abs")
public abstract class WasmAbsNode extends WasmUnaryNode {

    @Specialization
    protected int abs(int num) { return Math.abs(num); }

    @Specialization
    protected float abs(float num) {
        return Math.abs(num);
    }

    @Specialization
    protected double abs(double num) {
        return Math.abs(num);
    }
}