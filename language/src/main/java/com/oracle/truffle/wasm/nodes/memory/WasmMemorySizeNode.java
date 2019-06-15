package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.CompilerDirectives;
//import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextReference;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.runtime.MemoryObject;
import com.oracle.truffle.wasm.runtime.WasmContext;
import com.oracle.truffle.wasm.runtime.WasmMemoryRegistry;

import java.lang.Integer;

@NodeInfo(shortName = "mem_size")
public final class WasmMemorySizeNode extends WasmExpressionNode {

    @CompilerDirectives.CompilationFinal // TODO is this actually correct since memory can grow?
    private final ContextReference<WasmContext> reference;

    public WasmMemorySizeNode(WasmLanguage language) {
        this.reference = language.getContextReference();
    }

    @Override
    public Integer executeGeneric(VirtualFrame frame) {
        return Integer.valueOf(reference.get().getMemoryRegistry().getMemoryObject().getArraySize());
    }
}
