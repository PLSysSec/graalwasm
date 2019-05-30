package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "f64_convert_s")
public abstract class WasmConvertSignedDoubleNode extends WasmUnaryNode {

    @Specialization
    protected double f64_convert_s(int num) {
        return (new Integer(num)).doubleValue();
    }

    @Specialization
    protected double f64_convert_s(long num) {
        return (new Long(num)).doubleValue();
    }
}
