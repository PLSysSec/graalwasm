package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.runtime.WasmContext;

@NodeInfo(shortName = "store")
@NodeChild("offset")
@NodeChild("align")
public final class WasmStoreNode extends WasmExpressionNode {

    @CompilerDirectives.CompilationFinal // TODO is this actually correct since memory can grow?
    private final TruffleLanguage.ContextReference<WasmContext> reference;
    private WasmExpressionNode offset;
    private WasmExpressionNode align;
    private WasmExpressionNode value;
    private WasmExpressionNode index;

    public WasmStoreNode(WasmLanguage language, WasmExpressionNode offset, WasmExpressionNode align, WasmExpressionNode value, WasmExpressionNode index) {
        this.reference = language.getContextReference();
        this.offset = offset;
        this.align = align;
        this.value = value;
        this.index = index;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        executeVoid(frame);
        return null; // TODO
    }

    @Override
    public void executeVoid(VirtualFrame frame) {
        //Byte result;
        int idx;
        byte val;
        try {
            idx = index.executeInt(frame);
            val = (byte) value.executeInt(frame);
            reference.get().getMemoryRegistry().getMemoryObject().writeElement(idx, val);
            //result = Byte.valueOf(reference.get().getMemoryRegistry().getMemoryObject().readElement(idx));
        } catch (UnexpectedResultException e) {
            System.out.println("unexpected exception: cannot read the operand value(s) (index and/or value) of store operation");
            //result = null;
        } catch (InvalidArrayIndexException e) {
            System.out.println("invalid array index: attempted in store operation");
            //result = null;
        }
        //return result;
    }
}