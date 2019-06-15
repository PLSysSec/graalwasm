package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage.ContextReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;
import com.oracle.truffle.wasm.runtime.WasmContext;

import java.lang.Byte;

@NodeInfo(shortName = "load")
public final class WasmLoadNode extends WasmUnaryNode {

    @CompilerDirectives.CompilationFinal // TODO is this actually correct since memory can grow?
    private final ContextReference<WasmContext> reference;
    private WasmExpressionNode offset;
    private WasmExpressionNode align;
    private WasmExpressionNode index;

    public WasmLoadNode(WasmLanguage language, WasmExpressionNode offset, WasmExpressionNode align, WasmExpressionNode index) {
        this.reference = language.getContextReference();
        this.offset = offset;
        this.align = align;
        this.index = index;
    }

    @Override
    public Byte executeGeneric(VirtualFrame frame) {
        Byte result;
        int idx;
        try {
            idx = index.executeInt(frame);
            result = Byte.valueOf(reference.get().getMemoryRegistry().getMemoryObject().readElement(idx));
        } catch (UnexpectedResultException e) {
            System.out.println("unexpected result: cannot read the operand value (index) of load operation");
            result = null;
        } catch (InvalidArrayIndexException e) {
            System.out.println("invalid array index: attempted in load operation");
            result = null;
        }
        return result;
    }
}
