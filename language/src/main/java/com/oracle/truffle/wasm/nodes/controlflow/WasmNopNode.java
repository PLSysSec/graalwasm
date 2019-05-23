package com.oracle.truffle.wasm.nodes.controlflow;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.ImplicitCast;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;

@NodeInfo(shortName = "nop", description = "The node implementing a nop statement")
public final class WasmNopNode extends WasmStatementNode {

    @Override
    public void executeVoid(VirtualFrame frame) {
        return;
    }
}
