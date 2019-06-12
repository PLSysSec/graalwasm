package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

@NodeInfo(shortName = "store")
@NodeChild("offset")
@NodeChild("align")
public abstract class WasmStoreNode extends WasmExpressionNode {

    @Specialization
    protected int store(int offset, int align) {
        return -1;
    }

    @Specialization
    protected long store(long offset, long align) {
        return -1;
    }

    @Specialization
    protected float store(float offset, float align) {
        return -1;
    }

    @Specialization
    protected double store(double offset, double align) {
        return -1;
    }
}