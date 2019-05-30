package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmBinaryNode;

@NodeInfo(shortName = "le")
public abstract class WasmLessOrEqualNode extends WasmBinaryNode {
}
