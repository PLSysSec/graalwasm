package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Double;

@NodeInfo(shortName = "floor")
public abstract class WasmFloorNode extends WasmUnaryNode {

    @Specialization
    protected float floor(float num) {
        return (new Double(Math.floor(num))).floatValue(); // FIXME cast from double -> float = loss of prec
    }

    @Specialization
    protected double floor(double num) {
        return Math.floor(num);
    }
}
