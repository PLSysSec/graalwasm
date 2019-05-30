package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;

@NodeInfo(shortName = "reinterpret_i32")
public abstract class WasmReinterpret32ITFNode extends WasmUnaryNode {

    @Specialization
    protected float reinterpret_i32(int num) {
        return (new Integer(num)).floatValue();
    }
}
