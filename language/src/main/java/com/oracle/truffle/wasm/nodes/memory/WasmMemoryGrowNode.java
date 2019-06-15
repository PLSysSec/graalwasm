package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage.ContextReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;
import com.oracle.truffle.wasm.runtime.WasmContext;

import java.lang.Integer;

@NodeInfo(shortName = "mem_grow")
public final class WasmMemoryGrowNode extends WasmUnaryNode {

    @CompilerDirectives.CompilationFinal // TODO is this actually correct since memory can grow?
    private final ContextReference<WasmContext> reference;
    private WasmExpressionNode delta;

    public WasmMemoryGrowNode(WasmLanguage language, WasmExpressionNode delta) {
        this.reference = language.getContextReference();
        this.delta = delta;
    }

    @Override
    public Integer executeGeneric(VirtualFrame frame) {
        Integer result;
        int growVal;
        try {
            growVal = delta.executeInt(frame);
            result = Integer.valueOf(reference.get().getMemoryRegistry().growMemory(growVal));
        } catch (UnexpectedResultException e) {
            System.out.println("cannot read the operand value of memory.grow operation");
            result = null;
        }
        return result;
    }
}