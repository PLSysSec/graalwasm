package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

@NodeInfo(shortName = "test", description = "The node implementing a test expression")
public class WasmTestNode extends WasmExpressionNode {

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return null;
    }
}
