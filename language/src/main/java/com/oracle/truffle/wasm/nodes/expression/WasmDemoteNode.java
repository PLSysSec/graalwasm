package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Double;

@NodeInfo(shortName = "demote")
public abstract class WasmDemoteNode extends WasmUnaryNode {

    @Specialization
    protected float demote(double num) {
        return (new Double(num)).floatValue();
    }
}
