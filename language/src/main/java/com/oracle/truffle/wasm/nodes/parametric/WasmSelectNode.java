package com.oracle.truffle.wasm.nodes.parametric;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;

@NodeInfo(shortName = "select", description = "The node implementing a select statement")
public class WasmSelectNode extends WasmStatementNode {

    public WasmSelectNode() {}

    @Override
    public void executeVoid(VirtualFrame frame) {
        return;
    }
}
