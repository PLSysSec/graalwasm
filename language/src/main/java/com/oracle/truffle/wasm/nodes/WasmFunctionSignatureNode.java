package com.oracle.truffle.wasm.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import java.util.ArrayList;

@NodeInfo(shortName = "signature", description = "The node implementing a function signature")
public final class WasmFunctionSignatureNode extends WasmStatementNode {

    private final ArrayList<String> params;
    private final ArrayList<String> results;

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

    public boolean equals(WasmFunctionSignatureNode node) {
        int parLen1 = this.getNumParams();
        int parLen2 = node.getNumParams();
        if (parLen1 != parLen2) return false;

        int resLen1 = this.getNumResults();
        int resLen2 = node.getNumResults();
        if (resLen1 != resLen2) return false;

        ArrayList<String> p1 = this.getParams();
        ArrayList<String> p2 = node.getParams();
        for (int i = 0; i < parLen1; i++) {
            String s1 = p1.get(i);
            String s2 = p2.get(i);
            if (s2.compareTo(s2) != 0) return false;
        }

        ArrayList<String> r1 = this.getResults();
        ArrayList<String> r2 = node.getResults();
        for (int i = 0; i < resLen1; i++) {
            String s1 = r1.get(i);
            String s2 = r2.get(i);
            if (s2.compareTo(s2) != 0) return false;
        }

        return true;
    }

    public void executeVoid(VirtualFrame virtualFrame) {
        return;
    }
}
