package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Float;
import java.lang.Double;

@NodeInfo(shortName = "nearest")
public abstract class WasmNearestNode extends WasmUnaryNode {

    @Specialization
    protected float nearest(float num) {
        if (Float.isNaN(num) || Float.isInfinite(num) || num == +0 || num == -0) {
            return num;
        } else if (num > 0 && num <= 0.5) {
            return +0;
        } else if (num < 0 && num >= -0.5) {
            return -0;
        } else {
            float rnd = Math.round(num);
            if ((rnd - num) == (num - rnd + 1)) { // num is equidistant to both whole numbers
                if (rnd % 2 == 0) { // ties go to even
                    return rnd;
                } else if (rnd > num) { // even is smaller
                    return rnd - 1;
                }
            }
            return rnd;
        }
    }

    @Specialization
    protected double nearest(double num) {
        if (Double.isNaN(num) || Double.isInfinite(num) || num == +0 || num == -0) {
            return num;
        } else if (num > 0 && num <= 0.5) {
            return +0;
        } else if (num < 0 && num >= -0.5) {
            return -0;
        } else {
            double rnd = Math.round(num);
            if ((rnd - num) == (num - rnd + 1)) { // num is equidistant to both whole numbers
                if (rnd % 2 == 0) { // ties go to even
                    return rnd;
                } else if (rnd > num) { // even is smaller
                    return rnd - 1;
                }
            }
            return rnd;
        }
    }
}