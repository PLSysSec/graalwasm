package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "div")
public abstract class WasmDivNode extends WasmBinaryNode {

    @Specialization
    protected float div(float left, float right) {
        return left / right; // FIXME checks
    }

    @Specialization
    protected double div(double left, double right) {
        return left / right; // FIXME checks
    }
}
