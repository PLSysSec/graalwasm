package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

@NodeInfo(shortName = "index")
public final class WasmIndexLiteralNode extends WasmExpressionNode {

    private final int index;

    public WasmIndexLiteralNode(int index) { this.index = index; }

    @Override
    public Integer executeGeneric(VirtualFrame frame) { return index; }
}
