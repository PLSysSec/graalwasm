package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "copySign")
public abstract class WasmCopySignNode extends WasmBinaryNode {

    @Specialization
    protected float copySign(float left, float right) {
        return Math.copySign(left, right);
    }

    @Specialization
    protected double copySign(double left, double right) {
        return Math.copySign(left, right);
    }
}
