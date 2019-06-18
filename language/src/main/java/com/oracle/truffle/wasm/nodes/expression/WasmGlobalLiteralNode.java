package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.runtime.GlobalsObject;
import com.oracle.truffle.wasm.runtime.MemoryObject;
import com.oracle.truffle.wasm.runtime.WasmContext;
import com.oracle.truffle.wasm.runtime.WasmGlobal;

import java.lang.Integer;

public final class WasmGlobalLiteralNode extends WasmExpressionNode {

    /**
     * The resolved function. During parsing (in the constructor of this node), we do not have the
     * {@link WasmContext} available yet, so the lookup can only be done at {@link #executeGeneric
     * first execution}. The {@link CompilerDirectives.CompilationFinal} annotation ensures that the function can still
     * be constant folded during compilation.
     */
    @CompilerDirectives.CompilationFinal
    private WasmGlobal cachedGlobal;

    private final TruffleLanguage.ContextReference<WasmContext> reference;

    private String name;
    private Integer index;
    private WasmExpressionNode value;
    private boolean mutable;

    public WasmGlobalLiteralNode(WasmLanguage language, String name, Integer index, WasmExpressionNode value, boolean mutable) {
        this.reference = language.getContextReference();
        this.name = name;
        this.index = index;
        this.value = value;
        this.mutable = mutable;
    }

    @Override
    public WasmGlobal executeGeneric(VirtualFrame frame) {
        if (cachedGlobal == null) {
            /* We are about to change a @CompilationFinal field. */
            CompilerDirectives.transferToInterpreterAndInvalidate();
            /* First execution of the node: lookup the global in the global registry. */
            cachedGlobal = reference.get().getGlobalsRegistry().lookup(name, index, value, mutable, false);
        }
        return cachedGlobal;
    }
}