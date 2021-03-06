package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Long;

@NodeInfo(shortName = "wrap")
public abstract class WasmWrapNode extends WasmUnaryNode {

    @Specialization
    protected int wrap(long num) {
        return (new Long(num)).intValue();
    }
}
