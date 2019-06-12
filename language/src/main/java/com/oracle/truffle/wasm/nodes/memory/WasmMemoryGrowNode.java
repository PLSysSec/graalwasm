package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

@NodeInfo(shortName = "mem_grow")
public abstract class WasmMemoryGrowNode extends WasmUnaryNode {

    @Specialization
    protected int grow(int delta) {
        return -1;
    }

    @Specialization
    protected long grow(long delta) {
        return -1;
    }
}
