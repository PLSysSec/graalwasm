package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.runtime.WasmContext;
import com.oracle.truffle.wasm.runtime.MemoryObject;

public final class WasmMemoryLiteralNode extends WasmExpressionNode {

    /**
     * The resolved function. During parsing (in the constructor of this node), we do not have the
     * {@link WasmContext} available yet, so the lookup can only be done at {@link #executeGeneric
     * first execution}. The {@link CompilerDirectives.CompilationFinal} annotation ensures that the function can still
     * be constant folded during compilation.
     */
   // @CompilerDirectives.CompilationFinal // TODO is this actually correct since memory can grow?
    private MemoryObject cachedMemory;

    private final TruffleLanguage.ContextReference<WasmContext> reference;

    private String name;
    private int min;
    private int max;

    public WasmMemoryLiteralNode(WasmLanguage language, String name, int min, int max) {
        this.reference = language.getContextReference();
        this.name = name;
        this.min = min;
        this.max = max;
    }

    @Override
    public MemoryObject executeGeneric(VirtualFrame frame) {
        if (cachedMemory == null) {
            /* We are about to change a @CompilationFinal field. */
            CompilerDirectives.transferToInterpreterAndInvalidate();
            /* First execution of the node: lookup the function in the function registry. */
            cachedMemory = reference.get().getMemoryRegistry().lookup(name, min, max, true);
        }
        return cachedMemory;
    }
}
