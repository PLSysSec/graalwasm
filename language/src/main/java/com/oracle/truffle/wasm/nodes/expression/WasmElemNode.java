package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.InvalidArrayIndexException;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.runtime.TableObject;
import com.oracle.truffle.wasm.runtime.WasmContext;

import java.util.ArrayList;
import java.lang.Integer;

public final class WasmElemNode extends WasmStatementNode {

    private final TruffleLanguage.ContextReference<WasmContext> reference;
    private final WasmExpressionNode offsetNode;
    private final ArrayList<Integer> funcIndices;
    private final TableObject table;

    public WasmElemNode(WasmLanguage language, WasmExpressionNode offsetNode, ArrayList<Integer> funcIndices) {
        this.reference = language.getContextReference();
        this.offsetNode = offsetNode;
        this.funcIndices = funcIndices;
        this.table = reference.get().getTableRegistry().getTableObject();

        // try statically
        int offset;
        try {
            offset = offsetNode.executeInt(null);
            for (int i = 0; i < this.funcIndices.size(); i++) {
                table.writeElement(offset + i, this.funcIndices.get(i));
            }
        } catch (UnexpectedResultException e) {
            System.err.println("unexpected exception: cannot read the operand value(s) (offset) of elem segment");
        } catch (InvalidArrayIndexException e) {
            System.err.println("link failure: elements segment does not fit table"); // FIXME provide line numbers for this elem segment
        }
    }

    public void executeVoid(VirtualFrame frame) {}
}
