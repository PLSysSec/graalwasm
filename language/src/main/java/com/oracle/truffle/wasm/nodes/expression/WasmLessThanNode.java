package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

import java.lang.Float;
import java.lang.Double;

@NodeInfo(shortName = "lt")
public abstract class WasmLessThanNode extends WasmBinaryNode {

    @Specialization
    protected boolean lt(float left, float right) {
        if (Float.compare(left, right) < 0) {
            return true;
        } else {
            return false;
        }
    }

    @Specialization
    protected boolean lt(double left, double right) {
        if (Double.compare(left, right) < 0) {
            return true;
        } else {
            return false;
        }
    }
}
