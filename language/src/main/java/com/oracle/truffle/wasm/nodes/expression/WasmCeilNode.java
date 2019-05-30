package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Double;

@NodeInfo(shortName = "ceil")
public abstract class WasmCeilNode extends WasmUnaryNode {

    @Specialization
    protected float ceil(float num) {
        return (new Double(Math.ceil(num))).floatValue(); // FIXME cast from double -> float = loss of prec
    }

    @Specialization
    protected double ceil(double num) {
        return Math.ceil(num);
    }
}
