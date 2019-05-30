package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "f32_convert_s")
public abstract class WasmConvertSignedFloatNode extends WasmUnaryNode {

    @Specialization
    protected float f32_convert_s(int num) {
        return (new Integer(num)).floatValue();
    }

    @Specialization
    protected float f32_convert_s(long num) {
        return (new Long(num)).floatValue();
    }
}
