package com.oracle.truffle.wasm.nodes.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;

@NodeInfo(shortName = "unreachable", description = "The node implementing an unreachable statement")
public class WasmUnreachableNode extends WasmStatementNode {

    public WasmUnreachableNode() {}

    @Override
    public void executeVoid(VirtualFrame frame) {
        // TODO TRAP
        return;
    }
}
