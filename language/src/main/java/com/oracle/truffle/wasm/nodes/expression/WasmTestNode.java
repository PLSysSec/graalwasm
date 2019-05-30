package com.oracle.truffle.wasm.nodes.expression;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.wasm.WasmException;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;

@NodeChild("node")
@NodeInfo(shortName = "test", description = "The node implementing a test expression")
public abstract class WasmTestNode extends WasmExpressionNode {

    @Specialization
    protected boolean test(int value) {
        if (value == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Specialization
    protected boolean test(long value) { // TODO works?
        if (value == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Fallback
    protected Object typeError(Object value) {
        throw WasmException.typeError(this, value);
    }
}
