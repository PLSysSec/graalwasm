/*
 * Copyright (c) 2012, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.wasm.parser;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Integer;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.wasm.builtins.WasmPrintlnBuiltin;
import com.oracle.truffle.wasm.builtins.WasmPrintlnBuiltinFactory;
import com.oracle.truffle.wasm.nodes.WasmFunctionSignatureNode;
import com.oracle.truffle.wasm.nodes.expression.*;
import com.oracle.truffle.wasm.nodes.global.WasmReadGlobalVariableNode;
import com.oracle.truffle.wasm.nodes.global.WasmWriteGlobalVariableNode;
import com.oracle.truffle.wasm.nodes.local.*;
import com.oracle.truffle.wasm.nodes.util.WasmUnboxNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmRootNode;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmBlockNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmBreakNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmContinueNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmDebuggerNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmFunctionBodyNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmIfNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmNopNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmReturnNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmWhileNode;
import com.oracle.truffle.wasm.nodes.controlflow.WasmUnreachableNode;
import com.oracle.truffle.wasm.nodes.memory.WasmLoadNode;
import com.oracle.truffle.wasm.nodes.memory.WasmMemoryGrowNode;
import com.oracle.truffle.wasm.nodes.memory.WasmMemorySizeNode;
import com.oracle.truffle.wasm.nodes.memory.WasmStoreNode;
import com.oracle.truffle.wasm.nodes.parametric.WasmDropNode;
import com.oracle.truffle.wasm.nodes.parametric.WasmSelectNode;
import com.oracle.truffle.wasm.runtime.WasmContext;
import com.oracle.truffle.wasm.nodes.util.WasmUnboxNodeGen;

/**
 * Helper class used by the Wasm {@link Parser} to create nodes. The code is factored out of the
 * automatically generated parser to keep the attributed grammar of Wasm small.
 */
public class WasmNodeFactory {

    /**
     * Local variable names that are visible in the current block. Variables are not visible outside
     * of their defining block, to prevent the usage of undefined variables. Because of that, we can
     * decide during parsing if a name references a local variable or is a function name.
     */
    static class LexicalScope {
        protected final LexicalScope outer;
        protected final Map<Integer, FrameSlot> locals;
        protected final Map<String, Integer> indices;

        LexicalScope(LexicalScope outer) {
            this.outer = outer;
            this.locals = new HashMap<>();
            this.indices = new HashMap<>();
            if (outer != null) {
                locals.putAll(outer.locals);
            }
        }
    }

    /* State while parsing a source unit. */
    private final Source source;
    private final Map<Integer, RootCallTarget> allFunctions;
    private final Map<String, Integer> indices;
    private final Map<Integer, WasmFunctionSignatureNode> signatureMap;
    private boolean memoryRegistered = false;

    /* State while parsing a function. */
    private int functionStartPos;
    private String functionName;
    private Integer functionIndex;
    private int functionBodyStartPos; // includes parameter list
    private int parameterCount;
    private int localCount;
    private int globalCount = 0;
    private int functionCount = 0; // FIXME was 14... is there a fxnl difference?
    private FrameDescriptor frameDescriptor;
    private List<WasmStatementNode> methodNodes;

    /* State while parsing a block. */
    private LexicalScope lexicalScope;
    private final WasmLanguage language;

    public WasmNodeFactory(WasmLanguage language, Source source) {
        this.language = language;
        this.source = source;
        this.allFunctions = new HashMap<>();
        this.indices = new HashMap<>();
        this.signatureMap = new HashMap<>();
    }

    public Map<Integer, RootCallTarget> getAllFunctions() {
        return allFunctions;
    }

    public Integer getIndex(String name) {
        return indices.get(name);
    }

    public void startFunction(Token nameToken, Token bodyStartToken) {
        assert functionStartPos == 0;
        assert functionName == null;
        assert functionBodyStartPos == 0;
        assert parameterCount == 0;
        assert localCount == 0;
        assert frameDescriptor == null;
        assert lexicalScope == null;

        functionIndex = new Integer(functionCount++); // FIXME functionIndex var not reset to 0.... important?
        if (nameToken != null) {
            functionStartPos = nameToken.getStartIndex();
            functionName = nameToken.getText();
            indices.put(functionName, functionIndex);
        } else {
            functionStartPos = bodyStartToken.getStartIndex();
        }
        functionBodyStartPos = bodyStartToken.getStartIndex();
        frameDescriptor = new FrameDescriptor();
        methodNodes = new ArrayList<>();
        startBlock();
    }

    public void addFormalParameter(Token nameToken) {
        /*
         * Method parameters are assigned to local variables at the beginning of the method. This
         * ensures that accesses to parameters are specialized the same way as local variables are
         * specialized.
         */
        final WasmReadArgumentNode readArg = new WasmReadArgumentNode(parameterCount);
        WasmExpressionNode assignment;
        if (nameToken == null) {
            assignment = createAssignment(createIndexLiteral(null, false), readArg, parameterCount);
        } else {
            assignment = createAssignment(createStringLiteral(nameToken, false), readArg, parameterCount);
        }
        methodNodes.add(assignment);
        parameterCount++;
    }

    public void finishFunction(WasmStatementNode bodyNode) {
        if (bodyNode == null) {
            // a state update that would otherwise be performed by finishBlock
            lexicalScope = lexicalScope.outer;
        } else {
            methodNodes.add(bodyNode);
            final int bodyEndPos = bodyNode.getSourceEndIndex();
            final SourceSection functionSrc = source.createSection(functionStartPos, bodyEndPos - functionStartPos);
            final WasmStatementNode methodBlock = finishBlock(methodNodes, functionBodyStartPos, bodyEndPos - functionBodyStartPos);
            assert lexicalScope == null : "Wrong scoping of blocks in parser";

            final WasmFunctionBodyNode functionBodyNode = new WasmFunctionBodyNode(methodBlock);
            functionBodyNode.setSourceSection(functionSrc.getCharIndex(), functionSrc.getCharLength());

            final WasmRootNode rootNode = new WasmRootNode(language, frameDescriptor, functionBodyNode, functionSrc, functionName, functionIndex); // FIXME
            allFunctions.put(functionIndex, Truffle.getRuntime().createCallTarget(rootNode));
        }

        functionStartPos = 0;
        functionName = null;
        functionBodyStartPos = 0;
        parameterCount = 0;
        localCount = 0;
        frameDescriptor = null;
        lexicalScope = null;
    }

    public void startBlock() {
        lexicalScope = new LexicalScope(lexicalScope);
    }

    public WasmStatementNode finishBlock(List<WasmStatementNode> bodyNodes, int startPos, int length) {
        lexicalScope = lexicalScope.outer;

        if (containsNull(bodyNodes)) {
            return null;
        }

        List<WasmStatementNode> flattenedNodes = new ArrayList<>(bodyNodes.size());
        flattenBlocks(bodyNodes, flattenedNodes);
        for (WasmStatementNode statement : flattenedNodes) {
            if (statement.hasSource() && !isHaltInCondition(statement)) {
                statement.addStatementTag();
            }
        }
        WasmBlockNode blockNode = new WasmBlockNode(flattenedNodes.toArray(new WasmStatementNode[flattenedNodes.size()]));
        blockNode.setSourceSection(startPos, length);
        return blockNode;
    }

    private static boolean isHaltInCondition(WasmStatementNode statement) {
        return (statement instanceof WasmIfNode) || (statement instanceof WasmWhileNode);
    }

    private void flattenBlocks(Iterable<? extends WasmStatementNode> bodyNodes, List<WasmStatementNode> flattenedNodes) {
        for (WasmStatementNode n : bodyNodes) {
            if (n instanceof WasmBlockNode) {
                flattenBlocks(((WasmBlockNode) n).getStatements(), flattenedNodes);
            } else {
                flattenedNodes.add(n);
            }
        }
    }

    public void createSignature(Token nameToken, int funcIndex, int numParams, int numResults) {
        final WasmFunctionSignatureNode signatureNode = new WasmFunctionSignatureNode(numParams, numResults);
        if (nameToken != null) {
            srcFromToken(signatureNode, nameToken);
            indices.put(nameToken.getText(), funcIndex);
        }
        signatureMap.put(funcIndex, signatureNode); // TODO will also need a table of all func types when impl that later
    }

    public WasmFunctionSignatureNode getSignature(Integer funcIndex) {
        return signatureMap.get(funcIndex);
    }

    /**
     * Returns an {@link WasmDebuggerNode} for the given token.
     *
     * @param debuggerToken The token containing the debugger node's info.
     * @return A WasmDebuggerNode for the given token.
     */
    WasmStatementNode createDebugger(Token debuggerToken) {
        final WasmDebuggerNode debuggerNode = new WasmDebuggerNode();
        srcFromToken(debuggerNode, debuggerToken);
        return debuggerNode;
    }

    /**
     * Returns an {@link WasmIfNode} for the given parameters.
     *
     * @param ifToken The token containing the if node's info
     * @param conditionNode The condition node of this if statement
     * @param thenPartNode The then part of the if
     * @param elsePartNode The else part of the if (null if no else part)
     * @return An WasmIfNode for the given parameters. null if either conditionNode or thenPartNode is
     *         null.
     */
    public WasmStatementNode createIf(Token ifToken, WasmExpressionNode conditionNode, WasmStatementNode thenPartNode, WasmStatementNode elsePartNode) {
        if (conditionNode == null || thenPartNode == null) {
            return null;
        }

        conditionNode.addStatementTag();
        final int start = ifToken.getStartIndex();
        final int end = elsePartNode == null ? thenPartNode.getSourceEndIndex() : elsePartNode.getSourceEndIndex();
        final WasmIfNode ifNode = new WasmIfNode(conditionNode, thenPartNode, elsePartNode);
        ifNode.setSourceSection(start, end - start);
        return ifNode;
    }

    /**
     * Returns an {@link WasmReturnNode} for the given parameters.
     *
     * @param t The token containing the return node's info
     * @param valueNode The value of the return (null if not returning a value)
     * @return An WasmReturnNode for the given parameters.
     */
    public WasmStatementNode createReturn(Token t, WasmExpressionNode valueNode) {
        final int start = t.getStartIndex();
        final int length = t.getText().length();
        final WasmReturnNode returnNode = new WasmReturnNode(valueNode);
        returnNode.setSourceSection(start, length);
        return returnNode;
    }

    public WasmExpressionNode createPrint(Token t, WasmExpressionNode valueNode) {
        final WasmExpressionNode valueUnboxed = WasmUnboxNodeGen.create(valueNode);
        final WasmExpressionNode[] arr = {valueUnboxed};
        final WasmExpressionNode printNode = WasmPrintlnBuiltinFactory.create(arr);
        srcFromToken(printNode, t);
        return printNode;
    }

    /**
     * Returns an {@link WasmBreakNode} for the given token.
     *
     * @param breakToken The token containing the break node's info.
     * @return A WasmBreakNode for the given token.
     */
    public WasmStatementNode createBreak(Token breakToken) {
        final WasmBreakNode breakNode = new WasmBreakNode();
        srcFromToken(breakNode, breakToken);
        return breakNode;
    }

    /**
     * Returns an {@link WasmContinueNode} for the given token.
     *
     * @param continueToken The token containing the continue node's info.
     * @return A WasmContinueNode built using the given token.
     */
    public WasmStatementNode createContinue(Token continueToken) {
        final WasmContinueNode continueNode = new WasmContinueNode();
        srcFromToken(continueNode, continueToken);
        return continueNode;
    }

    public WasmStatementNode createUnreachable(Token u) {
        final WasmUnreachableNode unreachableNode = new WasmUnreachableNode();
        srcFromToken(unreachableNode, u);
        return unreachableNode;
    }

    public WasmStatementNode createNop(Token n) {
        final WasmNopNode nopNode = new WasmNopNode();
        srcFromToken(nopNode, n);
        return nopNode;
    }

    public WasmStatementNode createDrop(Token d) {
        final WasmDropNode dropNode = new WasmDropNode();
        srcFromToken(dropNode, d);
        return dropNode;
    }

    public WasmStatementNode createSelect(Token s) {
        final WasmSelectNode selectNode = new WasmSelectNode();
        srcFromToken(selectNode, s);
        return selectNode;
    }

    public WasmExpressionNode createTest(Token opToken, WasmExpressionNode node) {
        if (node == null) {
            return null;
        }
        final WasmExpressionNode nodeUnboxed = WasmUnboxNodeGen.create(node);

        final WasmExpressionNode result;
        switch (opToken.getText().substring(4)) {
            case "eqz":
                result = WasmTestNodeGen.create(nodeUnboxed);
                break;
            default:
                throw new RuntimeException("unexpected operation: " + opToken.getText());
        }

        int start = node.getSourceCharIndex();
        int length = opToken.getStopIndex() - start;
        result.setSourceSection(start, length);
        result.addExpressionTag();

        return result;
    }

    public WasmExpressionNode createCompare(Token opToken, WasmExpressionNode rightNode, WasmExpressionNode leftNode) {
        if (leftNode == null || rightNode == null) {
            return null;
        }
        final WasmExpressionNode leftUnboxed = WasmUnboxNodeGen.create(leftNode);
        final WasmExpressionNode rightUnboxed = WasmUnboxNodeGen.create(rightNode);

        final WasmExpressionNode result;
        switch (opToken.getText().substring(4)) {
            case "eq":
                result = WasmEqualNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "ne":
                result = WasmLogicalNotNodeGen.create(WasmEqualNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            case "lt_s":
                result = WasmLessThanSignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "lt_u":
                result = WasmLessThanUnsignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "lt":
                result = WasmLessThanNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "le_s":
                result = WasmLessOrEqualSignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "le_u":
                result = WasmLessOrEqualUnsignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "le":
                result = WasmLessOrEqualNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "gt_s":
                result = WasmLogicalNotNodeGen.create(WasmLessOrEqualSignedNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            case "gt_u":
                result = WasmLogicalNotNodeGen.create(WasmLessOrEqualUnsignedNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            case "gt":
                result = WasmLogicalNotNodeGen.create(WasmLessOrEqualNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            case "ge_s":
                result = WasmLogicalNotNodeGen.create(WasmLessThanSignedNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            case "ge_u":
                result = WasmLogicalNotNodeGen.create(WasmLessThanUnsignedNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            case "ge":
                result = WasmLogicalNotNodeGen.create(WasmLessThanNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            default:
                throw new RuntimeException("unexpected operation: " + opToken.getText());
        }

        int start = leftNode.getSourceCharIndex();
        int length = opToken.getStopIndex() - start;
        result.setSourceSection(start, length);
        result.addExpressionTag();

        return result;
    }

    public WasmExpressionNode createUnary(Token opToken, WasmExpressionNode node) {
        if (node == null) {
            return null;
        }
        final WasmExpressionNode nodeUnboxed = WasmUnboxNodeGen.create(node);

        final WasmExpressionNode result;
        switch (opToken.getText().substring(4)) {
            case "clz":
                result = WasmCountLeadingZerosNodeGen.create(nodeUnboxed);
                break;
            case "ctz":
                result = WasmCountTrailingZerosNodeGen.create(nodeUnboxed);
                break;
            case "popcnt":
                result = WasmPopCountNodeGen.create(nodeUnboxed);
                break;
            case "neg":
                result = WasmNegNodeGen.create(nodeUnboxed);
                break;
            case "abs":
                result = WasmAbsNodeGen.create(nodeUnboxed);
                break;
            case "sqrt":
                result = WasmSquareRootNodeGen.create(nodeUnboxed);
                break;
            case "ceil":
                result = WasmCeilNodeGen.create(nodeUnboxed);
                break;
            case "floor":
                result = WasmFloorNodeGen.create(nodeUnboxed);
                break;
            case "trunc":
                result = WasmTruncNodeGen.create(nodeUnboxed);
                break;
            case "nearest":
                result = WasmNearestNodeGen.create(nodeUnboxed);
                break;
            default:
                throw new RuntimeException("unexpected operation: " + opToken.getText());
        }

        int start = node.getSourceCharIndex();
        int length = opToken.getStopIndex() - start;
        result.setSourceSection(start, length);
        result.addExpressionTag();

        return result;
    }

    /**
     * Returns the corresponding subclass of {@link WasmExpressionNode} for binary expressions. </br>
     * These nodes are currently not instrumented.
     *
     * @param opToken The operator of the binary expression
     * @param leftNode The left node of the expression
     * @param rightNode The right node of the expression
     * @return A subclass of WasmExpressionNode using the given parameters based on the given opToken.
     *         null if either leftNode or rightNode is null.
     */
    public WasmExpressionNode createBinary(Token opToken, WasmExpressionNode rightNode, WasmExpressionNode leftNode) {
        if (leftNode == null || rightNode == null) {
            return null;
        }
        final WasmExpressionNode leftUnboxed = WasmUnboxNodeGen.create(leftNode);
        final WasmExpressionNode rightUnboxed = WasmUnboxNodeGen.create(rightNode);

        final WasmExpressionNode result;
        switch (opToken.getText().substring(4)) {
            case "add":
                result = WasmAddNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "mul":
                result = WasmMulNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "div_s":
                result = WasmDivSignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "div_u":
                result = WasmDivUnsignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "div":
                result = WasmDivNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "sub":
                result = WasmSubNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "rem_s":
                result = WasmRemSignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "rem_u":
                result = WasmRemUnsignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "and":
                result = WasmBitwiseAndNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "or":
                result = WasmBitwiseOrNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "xor":
                result = WasmBitwiseXorNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "shl":
                result = WasmShiftLeftNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "shr_s":
                result = WasmShiftRightSignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "shr_u":
                result = WasmShiftRightUnsignedNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "rotl":
                result = WasmRotateLeftNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "rotr":
                result = WasmRotateRightNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "min":
                result = WasmMinNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            case "max":
                result = WasmLogicalNotNodeGen.create(WasmMinNodeGen.create(leftUnboxed, rightUnboxed));
                break;
            case "copysign":
                result = WasmCopySignNodeGen.create(leftUnboxed, rightUnboxed);
                break;
            default:
                throw new RuntimeException("unexpected operation: " + opToken.getText());
        }

        int start = leftNode.getSourceCharIndex();
        int length = opToken.getStopIndex() - start;
        result.setSourceSection(start, length);
        result.addExpressionTag();

        return result;
    }

    public WasmExpressionNode createConvert(Token opToken, WasmExpressionNode node) {
        if (node == null) {
            return null;
        }
        final WasmExpressionNode nodeUnboxed = WasmUnboxNodeGen.create(node);

        final WasmExpressionNode result;
        switch (opToken.getText().substring(4)) {
            case "wrap_i64":
                result = WasmWrapNodeGen.create(nodeUnboxed);
                break;
            case "extend_i32_s":
                result = WasmExtendSignedNodeGen.create(nodeUnboxed);
                break;
            case "extend_i32_u":
                result = WasmExtendUnsignedNodeGen.create(nodeUnboxed);
                break;
            case "demote_f64":
                result = WasmDemoteNodeGen.create(nodeUnboxed);
                break;
            case "promote_f32":
                result = WasmPromoteNodeGen.create(nodeUnboxed);
                break;
            case "trunc_f32_s":
            case "trunc_f64_s":
                if ((opToken.getText().substring(0, 3)).compareTo("i32") == 0) {
                    result = WasmTruncSignedIntNodeGen.create(nodeUnboxed);
                } else {
                    result = WasmTruncSignedLongNodeGen.create(nodeUnboxed);
                }
                break;
            case "trunc_f32_u":
            case "trunc_f64_u":
                if ((opToken.getText().substring(0, 3)).compareTo("i32") == 0) {
                    result = WasmTruncUnsignedIntNodeGen.create(nodeUnboxed);
                } else {
                    result = WasmTruncUnsignedLongNodeGen.create(nodeUnboxed);
                }
                break;
            case "convert_i32_s":
            case "convert_i64_s":
                if ((opToken.getText().substring(0, 3)).compareTo("f32") == 0) {
                    result = WasmConvertSignedFloatNodeGen.create(nodeUnboxed);
                } else {
                    result = WasmConvertSignedDoubleNodeGen.create(nodeUnboxed);
                }
                break;
            case "convert_i32_u":
            case "convert_i64_u":
                if ((opToken.getText().substring(0, 3)).compareTo("f32") == 0) {
                    result = WasmConvertUnsignedFloatNodeGen.create(nodeUnboxed);
                } else {
                    result = WasmConvertUnsignedDoubleNodeGen.create(nodeUnboxed);
                }
                break;
            case "reinterpret_i32":
                result = WasmReinterpret32ITFNodeGen.create(nodeUnboxed);
                break;
            case "reinterpret_i64":
                result = WasmReinterpret64ITFNodeGen.create(nodeUnboxed);
                break;
            case "reinterpret_f32":
                result = WasmReinterpret32FTINodeGen.create(nodeUnboxed);
                break;
            case "reinterpret_f64":
                result = WasmReinterpret64FTINodeGen.create(nodeUnboxed);
                break;
            default:
                throw new RuntimeException("unexpected operation: " + opToken.getText());
        }

        int start = node.getSourceCharIndex();
        int length = opToken.getStopIndex() - start;
        result.setSourceSection(start, length);
        result.addExpressionTag();

        return result;
    }

    /**
     * Returns an {@link WasmInvokeNode} for the given parameters.
     *
     * @param functionNode The function being called
     * @param parameterNodes The parameters of the function call
     * @param finalToken A token used to determine the end of the sourceSelection for this call
     * @return An WasmInvokeNode for the given parameters. null if functionNode or any of the
     *         parameterNodes are null.
     */
    public WasmExpressionNode createCall(WasmExpressionNode functionNode, List<WasmExpressionNode> parameterNodes, Token finalToken) {
        if (functionNode == null || containsNull(parameterNodes)) {
            return null;
        }
        final WasmExpressionNode result = new WasmInvokeNode(functionNode, parameterNodes.toArray(new WasmExpressionNode[parameterNodes.size()]));

        final int startPos = functionNode.getSourceCharIndex();
        final int endPos = finalToken.getStartIndex() + finalToken.getText().length();
        result.setSourceSection(startPos, endPos - startPos); // FIXME
        result.addExpressionTag();

        return result;
    }

    public WasmExpressionNode createCallIndirect() {
        // TODO lookup fxn table
        return null;
    }

    /**
     * Returns an {@link WasmWriteLocalVariableNode} for the given parameters.
     *
     * @param nameNode The name of the variable being assigned
     * @param valueNode The value to be assigned
     * @return An WasmExpressionNode for the given parameters. null if nameNode or valueNode is null.
     */
    public WasmExpressionNode createAssignment(WasmExpressionNode nameNode, WasmExpressionNode valueNode) {
        return createAssignment(nameNode, valueNode, null);
    }

    /**
     * Returns an {@link WasmWriteLocalVariableNode} for the given parameters.
     *
     * @param nameNode The name of the variable being assigned
     * @param valueNode The value to be assigned
     * @param argumentIndex null or index of the argument the assignment is assigning
     * @return An WasmExpressionNode for the given parameters. null if nameNode or valueNode is null.
     */
    public WasmExpressionNode createAssignment(WasmExpressionNode nameNode, WasmExpressionNode valueNode, Integer argumentIndex) {
        if (nameNode == null || valueNode == null) {
            return null;
        }

        String name;
        Integer index;
        if (nameNode instanceof WasmIndexLiteralNode) {
            index = ((WasmIndexLiteralNode) nameNode).executeGeneric(null);
        } else {
            name = ((WasmStringLiteralNode) nameNode).executeGeneric(null);
            index = lexicalScope.indices.get(name);
        }
        FrameSlot frameSlot = frameDescriptor.findOrAddFrameSlot(
                        index,
                        argumentIndex,
                        FrameSlotKind.Illegal);
        lexicalScope.locals.put(index, frameSlot);
        final WasmExpressionNode result = WasmWriteLocalVariableNodeGen.create(valueNode, frameSlot);

        if (valueNode.hasSource()) {
            final int start = valueNode.getSourceCharIndex();
            final int length = nameNode.getSourceEndIndex() - start;
            result.setSourceSection(start, length);
        }
        result.addExpressionTag();

        return result;
    }

    public WasmExpressionNode createLocal(Token l, Token nameToken, Token type) {
        WasmExpressionNode index = createIndexLiteral(null, false);
        localCount++;
        WasmExpressionNode value = createNumericLiteral(type, null);

        Integer idx;
        try {
            idx = new Integer(index.executeInt(null));
        } catch (UnexpectedResultException e) {
            System.out.println("unexpected result: could not resolve index of local");
            return null;
        }
        if (nameToken != null) lexicalScope.indices.put(nameToken.getText(), idx); // map string name to index

        FrameSlot frameSlot = frameDescriptor.findOrAddFrameSlot(
                idx,
                null,
                FrameSlotKind.Illegal);
        lexicalScope.locals.put(idx, frameSlot);
        final WasmExpressionNode result = WasmWriteLocalVariableNodeGen.create(value, frameSlot);

        srcFromToken(result, l);
        return result;
    }

    /**
     * Returns a {@link WasmReadLocalVariableNode} if this read is a local variable or a
     * {@link WasmFunctionLiteralNode} if this read is global. In Wasm, the only global names are
     * functions.
     *
     * @param nameNode The name of the variable/function being read
     * @return either:
     *         <ul>
     *         <li>A WasmReadLocalVariableNode representing the local variable being read.</li>
     *         <li>A WasmFunctionLiteralNode representing the function definition.</li>
     *         <li>null if nameNode is null.</li>
     *         </ul>
     */
    public WasmExpressionNode createRead(WasmExpressionNode nameNode, boolean function) {
        if (nameNode == null) {
            return null;
        }

        String name = null; // TODO functions should rely on indices too
        Integer index;
        if (nameNode instanceof WasmIndexLiteralNode) {
            index = ((WasmIndexLiteralNode) nameNode).executeGeneric(null);
        } else {
            name = ((WasmStringLiteralNode) nameNode).executeGeneric(null);
            index = lexicalScope.indices.get(name);
        }
        final WasmExpressionNode result;
        final FrameSlot frameSlot = lexicalScope.locals.get(index);
        if (frameSlot != null) {
            /* Read of a local variable. */
            result = WasmReadLocalVariableNodeGen.create(frameSlot);
        } else {
            /* Read of a global name. In our language, the only global names are functions. */
            if (function) {
                result = new WasmFunctionLiteralNode(language, name, index);
            }
            else {
                result = new WasmReadGlobalVariableNode(language, name, index);
            }
        }
        result.setSourceSection(nameNode.getSourceCharIndex(), nameNode.getSourceLength());
        result.addExpressionTag();
        return result;
    }

    public WasmExpressionNode createWrite(WasmExpressionNode nameNode, WasmExpressionNode valueNode) {
        if (nameNode == null) {
            return nameNode;
        }

        String name = null;
        Integer index = null;
        if (nameNode instanceof WasmIndexLiteralNode) {
            index = ((WasmIndexLiteralNode) nameNode).executeGeneric(null);
        } else {
            name = ((WasmStringLiteralNode) nameNode).executeGeneric(null);
        }
        final WasmExpressionNode result = new WasmWriteGlobalVariableNode(language, name, index, valueNode);
        result.setSourceSection(valueNode.getSourceCharIndex(), nameNode.getSourceEndIndex() - valueNode.getSourceCharIndex() + 1);
        result.addExpressionTag();
        return result;
    }

    public WasmExpressionNode createTee(WasmExpressionNode nameNode, WasmExpressionNode valueNode) {
        final WasmExpressionNode set = createAssignment(nameNode, valueNode);
        final WasmExpressionNode get = createRead(nameNode, false);
        final WasmExpressionNode result = new WasmTeeLocalVariableNode(set, get);
        return result;
    }

    public WasmExpressionNode createIndexLiteral(Token indexToken, boolean fromGlobal) {
        final WasmIndexLiteralNode result;
        if (fromGlobal) {
            if (indexToken == null) {
                result = new WasmIndexLiteralNode(globalCount); // newly decl global
            } else {
                result = new WasmIndexLiteralNode(Integer.parseUnsignedInt(indexToken.getText())); // access previously declared global
                srcFromToken(result, indexToken);
            }
        } else {
            if (indexToken == null) {
                result = new WasmIndexLiteralNode(parameterCount + localCount); // newly decl param/local
            } else {
                result = new WasmIndexLiteralNode(Integer.parseUnsignedInt(indexToken.getText())); // access previously declared param/local
                srcFromToken(result, indexToken);
            }
        }
        result.addExpressionTag();
        return result;
    }

    public WasmExpressionNode createStringLiteral(Token literalToken, boolean removeQuotes) {
        /* Remove the trailing and ending " */
        String literal = literalToken.getText();
        if (removeQuotes) {
            assert literal.length() >= 2 && literal.startsWith("\"") && literal.endsWith("\"");
            literal = literal.substring(1, literal.length() - 1);
        }

        final WasmStringLiteralNode result = new WasmStringLiteralNode(literal.intern());
        srcFromToken(result, literalToken);
        result.addExpressionTag();
        return result;
    }

    public WasmExpressionNode createNumericLiteral(Token opToken, Token literalToken) {
        WasmExpressionNode result;
        String value;
        if (literalToken == null) {
            switch (opToken.getText().substring(0, 3)) {
                case "i32":
                case "i64":
                    value = "0";
                    break;
                case "f32":
                case "f64":
                    value = "+0";
                    break;
                default:
                    throw new RuntimeException("unexpected type: " + opToken.getText().substring(0, 3));
            }
        } else {
            value = literalToken.getText();
        }
        switch (opToken.getText().substring(0, 3)) {
            case "i32":
                result = new WasmIntegerLiteralNode(Integer.parseUnsignedInt(value)); // TODO is decode better? parses as unsigned.... but handles hex
                break;
            case "i64":
                result = new WasmLongLiteralNode(Long.parseUnsignedLong(value));
                break;
            case "f32":
                result = new WasmFloatLiteralNode(Float.parseFloat(value));
                break;
            case "f64":
                result = new WasmDoubleLiteralNode(Double.parseDouble(value));
                break;
            default:
                throw new RuntimeException("unexpected type: " + opToken.getText().substring(0, 3));
            }
        if (literalToken != null) {
            srcFromToken(result, literalToken);
        }
        result.addExpressionTag();
        return result;
    }

    public WasmExpressionNode createParenExpression(WasmExpressionNode expressionNode, int start, int length) {
        if (expressionNode == null) {
            return null;
        }

        final WasmParenExpressionNode result = new WasmParenExpressionNode(expressionNode);
        result.setSourceSection(start, length);
        return result;
    }

    /**
     * Returns an {@link WasmReadPropertyNode} for the given parameters.
     *
     * @param receiverNode The receiver of the property access
     * @param nameNode The name of the property being accessed
     * @return An WasmExpressionNode for the given parameters. null if receiverNode or nameNode is
     *         null.
     */
    public WasmExpressionNode createReadProperty(WasmExpressionNode receiverNode, WasmExpressionNode nameNode) {
        if (receiverNode == null || nameNode == null) {
            return null;
        }

        final WasmExpressionNode result = WasmReadPropertyNodeGen.create(receiverNode, nameNode);

        final int startPos = receiverNode.getSourceCharIndex();
        final int endPos = nameNode.getSourceEndIndex();
        result.setSourceSection(startPos, endPos - startPos);
        result.addExpressionTag();

        return result;
    }

    /**
     * Returns an {@link WasmWritePropertyNode} for the given parameters.
     *
     * @param receiverNode The receiver object of the property assignment
     * @param nameNode The name of the property being assigned
     * @param valueNode The value to be assigned
     * @return An WasmExpressionNode for the given parameters. null if receiverNode, nameNode or
     *         valueNode is null.
     */
    public WasmExpressionNode createWriteProperty(WasmExpressionNode receiverNode, WasmExpressionNode nameNode, WasmExpressionNode valueNode) {
        if (receiverNode == null || nameNode == null || valueNode == null) {
            return null;
        }

        final WasmExpressionNode result = WasmWritePropertyNodeGen.create(receiverNode, nameNode, valueNode);

        final int start = receiverNode.getSourceCharIndex();
        final int length = valueNode.getSourceEndIndex() - start;
        result.setSourceSection(start, length);
        result.addExpressionTag();

        return result;
    }

    public WasmStatementNode createGlobal(Token g, Token name, WasmExpressionNode value, boolean mutable) {
        final WasmExpressionNode result;
        WasmExpressionNode index = createIndexLiteral(null, true);
        globalCount++;

        Integer idx;
        try {
            idx = new Integer(index.executeInt(null));
        } catch (UnexpectedResultException e) {
            System.out.println("unexpected result: could not resolve index of global");
            return null;
        }

        String nm = name == null ? null : name.getText();
        result = new WasmGlobalLiteralNode(language, nm, idx, value, mutable);
        language.getContextReference().get().getGlobalsRegistry().register(nm, idx, value, mutable);
        srcFromToken(result, g);

        return result;
    }

    public WasmStatementNode createMemory(Token m, Token name, int min, int max) {
        final WasmExpressionNode result;

        if (!memoryRegistered) {
            String nm = name == null ? "" : name.getText();
            result = new WasmMemoryLiteralNode(language, nm, min, max);
            language.getContextReference().get().getMemoryRegistry().register(nm, min, max);
        } else {
            throw new RuntimeException("multiple memories cannot be created");
        }

        srcFromToken(result, m);
        return result;
    }

    public WasmExpressionNode createMemorySize(Token s) {
        final WasmExpressionNode result = new WasmMemorySizeNode(language);
        srcFromToken(result, s);
        return result;
    }

    public WasmExpressionNode createMemoryGrow(Token g, WasmExpressionNode delta) {
        final WasmExpressionNode deltaUnboxed = WasmUnboxNodeGen.create(delta);
        final WasmExpressionNode result = new WasmMemoryGrowNode(language, deltaUnboxed);
        srcFromToken(result, g);
        return result;
    }

    public WasmExpressionNode createLoad(Token l, Token offset, Token align, WasmExpressionNode index) {
        WasmExpressionNode o = new WasmIntegerLiteralNode(0); // TODO handle diff sizes?
        WasmExpressionNode a = new WasmIntegerLiteralNode(0);

        if (align != null) {
            a = new WasmIntegerLiteralNode(Integer.parseUnsignedInt(align.getText().substring(6)));
        }
        if (offset != null) {
            o = new WasmIntegerLiteralNode(Integer.parseUnsignedInt(offset.getText().substring(7)));
        }

        final WasmExpressionNode result = new WasmLoadNode(language, o, a, index);
        return result;
    }

    public WasmExpressionNode createStore(Token s, Token offset, Token align, WasmExpressionNode value, WasmExpressionNode index) {
        WasmExpressionNode o = new WasmIntegerLiteralNode(0); // TODO handle diff sizes?
        WasmExpressionNode a = new WasmIntegerLiteralNode(0);

        if (align != null) {
            a = new WasmIntegerLiteralNode(Integer.parseUnsignedInt(align.getText().substring(6)));
        }
        if (offset != null) {
            o = new WasmIntegerLiteralNode(Integer.parseUnsignedInt(offset.getText().substring(7)));
        }

        final WasmExpressionNode result = new WasmStoreNode(language, o, a, value, index);
        return result;
    }

    /**
     * Creates source description of a single token.
     */
    private static void srcFromToken(WasmStatementNode node, Token token) {
        node.setSourceSection(token.getStartIndex(), token.getText().length());
    }

    /**
     * Checks whether a list contains a null.
     */
    private static boolean containsNull(List<?> list) {
        for (Object e : list) {
            if (e == null) {
                return true;
            }
        }
        return false;
    }
}
