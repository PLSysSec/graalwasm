package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Float;
import java.lang.Double;

@NodeInfo(shortName = "trunc")
public abstract class WasmTruncNode extends WasmUnaryNode {

    @Specialization
    protected float trunc(float num) {
        return (new Float(num)).intValue();
    }

    @Specialization
    protected double trunc(double num) {
        return (new Double(num)).intValue();
    }
}