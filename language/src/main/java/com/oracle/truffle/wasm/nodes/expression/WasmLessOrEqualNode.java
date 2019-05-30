package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

import java.lang.Float;
import java.lang.Double;

@NodeInfo(shortName = "le")
public abstract class WasmLessOrEqualNode extends WasmBinaryNode {

    @Specialization
    protected boolean le(float left, float right) {
        if (Float.compare(left, right) <= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Specialization
    protected boolean le(double left, double right) {
        if (Double.compare(left, right) <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
