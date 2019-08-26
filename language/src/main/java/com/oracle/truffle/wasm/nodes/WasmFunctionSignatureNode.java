package com.oracle.truffle.wasm.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import java.util.ArrayList;

@NodeInfo(shortName = "signature", description = "The node implementing a function signature")
public final class WasmFunctionSignatureNode extends WasmStatementNode {

    @Child private ArrayList<String> params;
    @Child private ArrayList<String> results;

    public WasmFunctionSignatureNode(ArrayList<String> params, ArrayList<String> results) {
        this.params = params;
        this.results = results;
    }

    public int getNumParams() {
        return params.size();
    }

    public String getParamTypeAt(int index) {
        return params.get(index);
    }

    public ArrayList<String> getParams() { return params; }

    public int getNumResults() {
        return results.size();
    }

    public String getResultTypeAt(int index) {
        return results.get(index);
    }

    public ArrayList<String> getResults() { return results; }

    public void executeVoid(VirtualFrame virtualFrame) {
        return;
    }
}
