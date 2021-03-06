package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Float;

@NodeInfo(shortName = "promote")
public abstract class WasmPromoteNode extends WasmUnaryNode {

    @Specialization
    protected double promote(float num) {
        return (new Float(num)).doubleValue();
    }
}