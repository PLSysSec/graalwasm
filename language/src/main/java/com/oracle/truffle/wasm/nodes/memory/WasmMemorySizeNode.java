package com.oracle.truffle.wasm.nodes.memory;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

@NodeInfo(shortName = "mem_size")
public abstract class WasmMemorySizeNode extends WasmExpressionNode {

    @Specialization
    protected long size() {
        return -1;
    }
}
