package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Double;

@NodeInfo(shortName = "reinterpret_f64")
public abstract class WasmReinterpret64FTINode extends WasmUnaryNode {

    @Specialization
    protected long reinterpret_f64(double num) {
        return Double.doubleToRawLongBits(num);
    }
}
