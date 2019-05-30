package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Long;

@NodeInfo(shortName = "reinterpret_i64")
public abstract class WasmReinterpret64ITFNode extends WasmUnaryNode {

    @Specialization
    protected double reinterpret_i64(long num) {
        return (new Long(num)).doubleValue();
    }
}
