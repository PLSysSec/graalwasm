package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;

@NodeInfo(shortName = "extend_s")
public abstract class WasmExtendSignedNode extends WasmUnaryNode {

    @Specialization
    protected long extend_s(int num) {
        return (new Integer(num).longValue());
    }
}
