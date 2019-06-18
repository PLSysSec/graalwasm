package com.oracle.truffle.wasm.nodes.global;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.runtime.WasmContext;
import com.oracle.truffle.wasm.runtime.WasmGlobal;

import java.lang.Integer;

@NodeInfo(shortName = "global_write")
public final class WasmWriteGlobalVariableNode extends WasmExpressionNode {

    private final String globalName;
    private final Integer globalIndex;
    private final WasmExpressionNode value;

    @CompilerDirectives.CompilationFinal
    private WasmGlobal cachedGlobal;

    private final TruffleLanguage.ContextReference<WasmContext> reference;

    public WasmWriteGlobalVariableNode(WasmLanguage language, String globalName, Integer globalIndex, WasmExpressionNode value) {
        reference = language.getContextReference();
        this.globalName = globalName;
        if (globalIndex == null) {
            this.globalIndex = reference.get().getGlobalsRegistry().getIndex(globalName);
        } else {
            this.globalIndex = globalIndex;
        }
        this.value = value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        executeVoid(frame);
        return null; // FIXME
    }

    @Override
    public void executeVoid(VirtualFrame frame) { // TODO how does caching work when you're writing... maybe try reading first? which is more expensive? maybe can see if the read node has a cached value?
        reference.get().getGlobalsRegistry().setValue(globalName, globalIndex, value);
    }
}