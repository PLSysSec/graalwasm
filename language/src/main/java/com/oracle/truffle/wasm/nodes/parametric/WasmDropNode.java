package com.oracle.truffle.wasm.nodes.parametric;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.ImplicitCast;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;

@NodeInfo(shortName = "drop", description = "The node implementing a drop statement")
public final class WasmDropNode extends WasmStatementNode {

    @Override
    public void executeVoid(VirtualFrame frame) {
        // remove the top of the stack
        return;
    }
}
