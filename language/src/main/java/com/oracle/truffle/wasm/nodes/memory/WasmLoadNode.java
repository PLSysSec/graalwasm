package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

@NodeInfo(shortName = "load")
@NodeChild("offset")
@NodeChild("align")
public abstract class WasmLoadNode extends WasmExpressionNode {

    @Specialization
    protected int load(int offset, int align) {
        return -1;
    }

    @Specialization
    protected long load(long offset, long align) {
        return -1;
    }

    @Specialization
    protected float load(float offset, float align) {
        return -1;
    }

    @Specialization
    protected double load(double offset, double align) {
        return -1;
    }
}
