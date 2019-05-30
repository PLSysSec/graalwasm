package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;

@NodeInfo(shortName = "min")
public abstract class WasmMinNode extends WasmBinaryNode {

    @Specialization
    protected int min(int left, int right) {
        return Integer.min(left, right);
    }

    @Specialization
    protected long min(long left, long right) {
        return Long.min(left, right);
    }

    @Specialization
    protected float min(float left, float right) {
        return Float.min(left, right);
    }

    @Specialization
    protected double min(double left, double right) {
        return Double.min(left, right);
    }

    @Fallback
    protected Object typeError(Object left, Object right) {
        throw WasmException.typeError(this, left, right);
    }
}
