package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "shr_s")
public abstract class WasmShiftRightSignedNode extends WasmBinaryNode {

    @Specialization
    protected int shr_s(int num, int amt) {
         int k = amt % 32;
         return num >> k;
    }

    @Specialization
    protected long shr_s(long num, long amt) {
         long k = amt % 64;
         return num >> k;
    }

    @Fallback
    protected Object typeError(Object num, Object amt) {
                throw WasmException.typeError(this, num, amt);
        }
}
