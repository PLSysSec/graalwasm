package com.oracle.truffle.wasm.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "signature", description = "The node implementing a function signature")
public final class WasmFunctionSignatureNode extends WasmStatementNode {

    @Child private int numParams;
    @Child private int numResults; // TODO perf better w @child or w final?
    // to differentiate between diff wasm types and their positions, might need to declare a matrix...
    // TODO is position part of validation?
    //@Child private String[] params;
    //@Child private String[] results;

    public WasmFunctionSignatureNode(int numParams, int numResults) {
        this.numParams = numParams;
        this.numResults = numResults;
    }

    public int getNumParams() {
        return numParams;
    }

    public int getNumResults() {
        return numResults;
    }

    public void executeVoid(VirtualFrame virtualFrame) {
        return;
    }
}
