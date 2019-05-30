package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "f64_convert_u")
public abstract class WasmConvertUnsignedDoubleNode extends WasmUnaryNode {

    @Specialization
    protected double f64_convert_u(int num) {
        return (new Integer(num)).doubleValue(); // FIXME need to zero-extend
    }

    @Specialization
    protected double f64_convert_u(long num) {
        return (new Long(num)).doubleValue();
    }
}