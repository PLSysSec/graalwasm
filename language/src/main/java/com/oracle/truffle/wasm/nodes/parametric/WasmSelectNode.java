package com.oracle.truffle.wasm.nodes.parametric;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

@NodeInfo(shortName = "select", description = "The node implementing a select statement")
public class WasmSelectNode extends WasmExpressionNode {

    public WasmSelectNode() {}

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return null;
    }
}
