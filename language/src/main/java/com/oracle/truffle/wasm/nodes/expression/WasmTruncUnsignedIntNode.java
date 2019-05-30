package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Float;
import java.lang.Double;

@NodeInfo(shortName = "i32_trunc_u")
public abstract class WasmTruncUnsignedIntNode extends WasmUnaryNode {

    @Specialization
    protected int i32_trunc_u(float num) {
        return (new Float(num)).intValue();
    }

    @Specialization
    protected int i32_trunc_u(double num) {
        return (new Double(num)).intValue();
    }
}