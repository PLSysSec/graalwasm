package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.nodes.WasmUnaryNode;

import java.lang.Float;
import java.lang.Double;

@NodeInfo(shortName = "i64_trunc_s")
public abstract class WasmTruncSignedLongNode extends WasmUnaryNode {

    @Specialization
    protected long i64_trunc_s(float num) {
        return (new Float(num)).longValue();
    }

    @Specialization
    protected long i64_trunc_s(double num) {
        return (new Double(num)).longValue();
    }
}