package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

import java.lang.Integer;
import java.lang.Long;

@NodeInfo(shortName = "rotr")
public abstract class WasmRotateRightNode extends WasmBinaryNode {

    @Specialization
    protected int rotr(int num, int amt) {
        return Integer.rotateRight(num, amt);
    } // TODO check unsigned?

    @Specialization
    protected long rotr(long num, int amt) {
        return Long.rotateRight(num, amt);
    } // TODO check unsigned?

    @Fallback
    protected Object typeError(Object num, Object amt) {
        throw WasmException.typeError(this, num, amt);
    }
}
