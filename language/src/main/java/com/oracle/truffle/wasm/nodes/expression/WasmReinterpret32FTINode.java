package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Float;

@NodeInfo(shortName = "reinterpret_f32")
public abstract class WasmReinterpret32FTINode extends WasmUnaryNode {

    @Specialization
    protected int reinterpret_f32(float num) {
        return Float.floatToRawIntBits(num);
    }
}
