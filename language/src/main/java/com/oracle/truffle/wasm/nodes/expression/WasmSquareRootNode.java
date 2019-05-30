package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Double;

@NodeInfo(shortName = "sqrt")
public abstract class WasmSquareRootNode extends WasmUnaryNode {

    @Specialization
    protected float sqrt(float num) {
        return (new Double(Math.sqrt(num))).floatValue(); // FIXME cast from double -> float = loss of prec
    }

    @Specialization
    protected double sqrt(double num) {
        return Math.sqrt(num);
    }
}
