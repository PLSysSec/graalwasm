package com.oracle.truffle.wasm.nodes.global;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.runtime.WasmContext;
import com.oracle.truffle.wasm.runtime.WasmGlobal;

@NodeInfo(shortName = "global_read")
public final class WasmReadGlobalVariableNode extends WasmExpressionNode {

    private final String globalName;

    @CompilerDirectives.CompilationFinal
    private WasmGlobal cachedGlobal;

    private final TruffleLanguage.ContextReference<WasmContext> reference;

    public WasmReadGlobalVariableNode(WasmLanguage language, String globalName) {
        this.globalName = globalName;
        reference = language.getContextReference();
    }

    @Override
    public WasmGlobal executeGeneric(VirtualFrame frame) {
        if (cachedGlobal == null) {
            /* We are about to change a @CompilationFinal field. */
            CompilerDirectives.transferToInterpreterAndInvalidate();
            /* First execution of the node: lookup the function in the function registry. */
            cachedGlobal = reference.get().getGlobalsRegistry().lookup(globalName, null,false, false);
        }
        return cachedGlobal;
    }
}
