package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Integer;

@NodeInfo(shortName = "extend_u")
public abstract class WasmExtendUnsignedNode extends WasmUnaryNode {

    @Specialization
    protected long extend_u(int num) {
        return Integer.toUnsignedLong(num);
    }
}