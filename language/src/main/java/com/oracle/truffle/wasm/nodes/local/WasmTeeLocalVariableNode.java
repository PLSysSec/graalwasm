package com.oracle.truffle.wasm.nodes.local;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

public final class WasmTeeLocalVariableNode extends WasmExpressionNode {

    private final WasmExpressionNode setNode;
    private final WasmExpressionNode getNode;

    public WasmTeeLocalVariableNode(WasmExpressionNode setNode, WasmExpressionNode getNode) {
        this.setNode = setNode;
        this.getNode = getNode;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        setNode.executeGeneric(frame);
        return getNode.executeGeneric(frame);
    }
}
