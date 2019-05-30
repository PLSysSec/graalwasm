package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "f32_convert_u")
public abstract class WasmConvertUnsignedFloatNode extends WasmUnaryNode {

    @Specialization
    protected float f32_convert_u(int num) {
        return (new Integer(num)).floatValue();
    }

    @Specialization
    protected float f32_convert_u(long num) {
        return (new Long(num)).floatValue(); // FIXME need to zero-extend
    }
}