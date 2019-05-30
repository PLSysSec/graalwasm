package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Double;

@NodeInfo(shortName = "nearest")
public abstract class WasmNearestNode extends WasmUnaryNode {

    @Specialization
    protected float nearest(float num) {
        return Math.round(num);
    }

    @Specialization
    protected double nearest(double num) {
        return Math.round(num);
    }
}