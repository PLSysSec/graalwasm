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

/*
 * The parser and lexer need to be generated using "mx create-wasm-parser".
 */

grammar WasmLanguage;

@parser::header
{
// DO NOT MODIFY - generated from WasmLanguage.g4 using "mx create-wasm-parser"

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.Map;

import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmRootNode;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;
import com.oracle.truffle.wasm.parser.WasmParseError;
}

@lexer::header
{
// DO NOT MODIFY - generated from WasmLanguage.g4 using "mx create-wasm-parser"
}

@parser::members
{
private WasmNodeFactory factory;
private Source source;

private static final class BailoutErrorListener extends BaseErrorListener {
    private final Source source;
    BailoutErrorListener(Source source) {
        this.source = source;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        throwParseError(source, line, charPositionInLine, (Token) offendingSymbol, msg);
    }
}

public void SemErr(Token token, String message) {
    assert token != null;
    throwParseError(source, token.getLine(), token.getCharPositionInLine(), token, message);
}

private static void throwParseError(Source source, int line, int charPositionInLine, Token token, String message) {
    int col = charPositionInLine + 1;
    String location = "-- line " + line + " col " + col + ": ";
    int length = token == null ? 1 : Math.max(token.getStopIndex() - token.getStartIndex(), 0);
    throw new WasmParseError(source, line, col, length, String.format("Error(s) parsing script:%n" + location + message));
}

public static Map<String, RootCallTarget> parseWasm(WasmLanguage language, Source source) {
    WasmLanguageLexer lexer = new WasmLanguageLexer(CharStreams.fromString(source.getCharacters().toString()));
    WasmLanguageParser parser = new WasmLanguageParser(new CommonTokenStream(lexer));
    lexer.removeErrorListeners();
    parser.removeErrorListeners();
    BailoutErrorListener listener = new BailoutErrorListener(source);
    lexer.addErrorListener(listener);
    parser.addErrorListener(listener);
    parser.factory = new WasmNodeFactory(language, source);
    parser.source = source;
    parser.wasmlanguage();
    return parser.factory.getAllFunctions();
}
}

/*
Copyright (c) 2019 Renata Hodovan.
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

// parser grammar WatParser;

// options { tokenVocab=WatLexer; }

wasmlanguage
  : module
  ;


value
  : INT | FLOAT
  ;

/* Auxiliaries */

name
  : STRING
  ;

/* Types */

value_type
  : VALUE_TYPE
  ;

elem_type
  : FUNCREF
  ;

global_type
  : value_type | LPAR MUT value_type RPAR
  ;

def_type
  : LPAR FUNC func_type RPAR
  ;

func_type
  : (LPAR (RESULT value_type* | PARAM value_type* | PARAM bind_var value_type) RPAR)*
  ;

table_type
  : NAT NAT? elem_type
  ;

memory_type
  : NAT NAT?
  ;

type_use
  : LPAR TYPE var RPAR
  ;

/* Immediates */

literal
  : NAT | INT | FLOAT
  ;

var
  : NAT | VAR
  ;

bind_var
  : VAR
  ;

/* Instructions & Expressions */

instr [Stack<WasmStatementNode> body] returns [WasmStatementNode result]
  : plain_instr[body]                                 { $result = $plain_instr.result; }
  //| call_instr_instr                            //{ $result = $call_instr_instr.result; }
  //| block_instr                                 //{ $result = $block_instr.result; }
  | expr[body]                                        { $result = $expr.result; }
  ;

plain_instr [Stack<WasmStatementNode> body] returns [WasmStatementNode result]
  : UNREACHABLE                                 { $result = factory.createUnreachable($UNREACHABLE); }
  | NOP                                         { $result = factory.createNop($NOP); }
  | DROP                                        { $result = factory.createDrop($DROP); }
  | SELECT                                      { $result = factory.createSelect($SELECT); }
  | BR var                                      //{ $result = factory.createBranch(); }
  | BR_IF var                                   //{ $result = factory.createBranchIf(); }
  | BR_TABLE var+                               //{ $result = factory.createBranchTable(); }
  | RETURN                                      { $result = factory.createReturn($RETURN, null); }
  | CALL var                                    //{ $result = factory.createCall(); }
  | LOCAL_GET var                               //{ $result = factory.createLocalGet(); }
  | LOCAL_SET var                               //{ $result = factory.createLocalSet(); }
  | LOCAL_TEE var                               //{ $result = factory.createLocalTee(); }
  | GLOBAL_GET var                              //{ $result = factory.createGlobalGet(); }
  | GLOBAL_SET var                              //{ $result = factory.createGlobalSet(); }
  | LOAD OFFSET_EQ_NAT? ALIGN_EQ_NAT?           //{ $result = factory.createLoad(); }
  | STORE OFFSET_EQ_NAT? ALIGN_EQ_NAT?          //{ $result = factory.createStore(); }
  | MEMORY_SIZE                                 //{ $result = factory.createMemory(); }
  | MEMORY_GROW                                 //{ $result = factory.createGrowMemory(); }
  | CONST NAT                                   { $result = factory.createNumericLiteral($NAT); }
  //| CONST literal                               { $result = factory.createNumericLiteral($literal); }
  | TEST                                        //{ $result = factory.createTest(); }
  | COMPARE                                     //{ $result = factory.createCompare(); }
  | UNARY                                       //{ $result = factory.createUnary($UNARY); }
  | BINARY                                      { WasmStatementNode arg1 = body.pop();
                                                  WasmStatementNode arg2 = body.pop();
                                                  $result = factory.createBinary($BINARY, (WasmExpressionNode) arg1, (WasmExpressionNode) arg2); } // TODO where could this casting fail?
  | CONVERT                                     //{ $result = factory.createConvert(); }
  ;

/*
call_instr
  : CALL_INDIRECT type_use? call_instr_params
  ;

call_instr_params
  : (LPAR PARAM value_type* RPAR)* (LPAR RESULT value_type* RPAR)*
  ;

call_instr_instr
  : CALL_INDIRECT type_use? call_instr_params_instr
  ;

call_instr_params_instr
  : (LPAR PARAM value_type* RPAR)* call_instr_results_instr
  ;

call_instr_results_instr
  : (LPAR RESULT value_type* RPAR)* instr
  ;

block_instr
  : (BLOCK | LOOP) bind_var? block END bind_var?
  | IF bind_var? block (ELSE bind_var? instr_list[null])? END bind_var?
  ;

block_type
  : LPAR RESULT value_type RPAR
  ;

block
  : block_type? instr_list[null]
  ;
*/
expr [Stack<WasmStatementNode> body] returns [WasmStatementNode result]
  : LPAR expr1[body] RPAR                             { $result = $expr1.result; }
  ;

expr1 [Stack<WasmStatementNode> body] returns [WasmStatementNode result]
  : plain_instr[body]
    (expr[body])* //TODO might need to update body before passing it to future expressions
  //| CALL_INDIRECT call_expr_type
  //| BLOCK bind_var? block
  //| LOOP bind_var? block
  //| IF bind_var? if_block
  ;
/*
call_expr_type
  : type_use? call_expr_params
  ;

call_expr_params
  : (LPAR PARAM value_type* RPAR)* call_expr_results
  ;

call_expr_results
  : (LPAR RESULT value_type* RPAR)* expr*
  ;

if_block
  : block_type if_block
  | expr* LPAR THEN instr_list[null] RPAR (LPAR ELSE instr_list[null] RPAR)?
  ;
*/
instr_list [Stack<WasmStatementNode> body] returns [Stack<WasmStatementNode> result]
  :
    (
    instr[body]                                 { body.push($instr.result); }
    )*
    //call_instr?                                 { body.push($call_instr.result); }
                                                { $result = body; }
  ;

const_expr
  : instr_list[null]
  ;

/* Functions */

func
  : LPAR FUNC VAR?                              { factory.startFunction($VAR, $LPAR); }
    func_fields                                 { factory.finishFunction($func_fields.result); }
    RPAR
  ;

func_fields returns [WasmStatementNode result]
  : type_use? func_fields_body                  { $result = $func_fields_body.result; }
  // TODO create new block here?? + body List?
  // TODO finishBlock will flatten => WasmStatementNode
  // TODO trying to resolve BLOCK CREATION with PARENS: I NEED PARENSSS EITHER THAT OR NO NEW BLOCK/SCOPE
  | inline_import type_use? func_fields_import
  | inline_export func_fields
  ;

func_fields_import
  : (LPAR PARAM value_type* RPAR | LPAR PARAM bind_var value_type RPAR) func_fields_import_result
  ;

func_fields_import_result
  : (LPAR RESULT value_type* RPAR)*
  ;

func_fields_body returns [WasmStatementNode result]
  : (
    LPAR PARAM value_type* RPAR
    | LPAR PARAM VAR value_type RPAR
    )*
    func_result_body                            { $result = $func_result_body.result; }
  ;

func_result_body returns [WasmStatementNode result]
  : (LPAR RESULT value_type* RPAR)* func_body   { $result = $func_body.result; }
  ; // apparently part of "validation rules" => should I handle this? TODO handle mismatch

func_body returns [WasmStatementNode result]
  :                                             { factory.startBlock();
                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); }
                                                  //List<WasmStatementNode> body = new ArrayList<>(); }
    (
    LPAR LOCAL value_type* RPAR                 // TODO add to body
    | LPAR LOCAL bind_var value_type RPAR       // TODO add to body
    )*
    s=LPAR
    res=instr_list[body]
    e=RPAR                                      { $result = factory.finishBlock(new ArrayList($res.result), $s.getStartIndex(), $e.getStopIndex() - $s.getStartIndex() + 1); }
  ;

/* Tables, Memories & Globals */

offset
  : LPAR OFFSET const_expr RPAR
  //| expr
  ;

elem
  : LPAR ELEM var? offset var* RPAR
  ;

table
  : LPAR TABLE bind_var? table_fields RPAR
  ;

table_fields
  : table_type
  | inline_import table_type
  | inline_export table_fields
  | elem_type LPAR ELEM var* RPAR
  ;

data
  : LPAR DATA var? offset STRING* RPAR
  ;

memory
  : LPAR MEMORY bind_var? memory_fields RPAR
  ;

memory_fields
  : memory_type
  | inline_import memory_type
  | inline_export memory_fields
  | LPAR DATA STRING* RPAR
  ;

sglobal
  : LPAR GLOBAL bind_var? global_fields RPAR
  ;

global_fields
  : global_type const_expr
  | inline_import global_type
  | inline_export global_fields
  ;

/* Imports & Exports */

import_desc
  : LPAR FUNC bind_var? type_use RPAR
  | LPAR FUNC bind_var? func_type RPAR
  | LPAR TABLE bind_var? table_type RPAR
  | LPAR MEMORY bind_var? memory_type RPAR
  | LPAR GLOBAL bind_var? global_type RPAR
  ;

simport
  :  LPAR IMPORT name name import_desc RPAR
  ;

inline_import
  : LPAR IMPORT name name RPAR
  ;

export_desc
  : LPAR FUNC var RPAR
  | LPAR TABLE var RPAR
  | LPAR MEMORY var RPAR
  | LPAR GLOBAL var RPAR
  ;

export
  : LPAR EXPORT name export_desc RPAR
  ;

inline_export
  : LPAR EXPORT name RPAR
  ;

/* Modules */

type_
  : def_type
  ;

type_def
  : LPAR TYPE bind_var? type_ RPAR
  ;

start
  : LPAR START var RPAR
  ;

module_field
  : type_def
  | sglobal
  | table
  | memory
  | func
  | elem
  | data
  | start
  | simport
  | export
  ;

module_
  : LPAR MODULE VAR? module_field* RPAR
  ;

/* Scripts */

script_module
  : module_
  | LPAR MODULE VAR? (BIN | QUOTE) STRING* RPAR
  ;

action
  : LPAR INVOKE VAR? name const_list RPAR
  | LPAR GET VAR? name RPAR
  ;

assertion
  : LPAR ASSERT_MALFORMED script_module STRING RPAR
  | LPAR ASSERT_INVALID script_module STRING RPAR
  | LPAR ASSERT_UNLINKABLE script_module STRING RPAR
  | LPAR ASSERT_TRAP script_module STRING RPAR
  | LPAR ASSERT_RETURN action const_list RPAR
  | LPAR ASSERT_RETURN_CANONICAL_NAN action RPAR
  | LPAR ASSERT_RETURN_ARITHMETIC_NAN action RPAR
  | LPAR ASSERT_TRAP action STRING RPAR
  | LPAR ASSERT_EXHAUSTION action STRING RPAR
  ;

cmd
  : action
  | assertion
  | script_module
  | LPAR REGISTER name VAR? RPAR
  | meta
  ;

meta
  : LPAR SCRIPT VAR? cmd* RPAR
  | LPAR INPUT VAR? STRING RPAR
  | LPAR OUTPUT VAR? STRING RPAR
  | LPAR OUTPUT VAR? RPAR
  ;

wconst
  : LPAR CONST literal RPAR
  ;

const_list
  : wconst*
  ;

script
  : cmd* EOF
  | module_field+ EOF
  ;

module
  : module_ EOF
  | module_field* EOF
  ;

/*
Copyright (c) 2019 Renata Hodovan.
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

// lexer grammar WatLexer;

LPAR : '(' ;
RPAR : ')' ;

NAT : Nat ;
INT : Int ;
FLOAT : Float ;
STRING : String ;
VALUE_TYPE : NXX ;
CONST : NXX '.const' ;

FUNCREF: 'funcref' ;
MUT: 'mut' ;

NOP: 'nop' ;
UNREACHABLE: 'unreachable' ;
DROP: 'drop' ;
BLOCK: 'block' ;
LOOP: 'loop' ;
END: 'end' ;
BR: 'br' ;
BR_IF: 'br_if' ;
BR_TABLE: 'br_table' ;
RETURN: 'return' ;
IF: 'if' ;
THEN: 'then' ;
ELSE: 'else' ;
SELECT: 'select' ;
CALL: 'call' ;
CALL_INDIRECT: 'call_indirect' ;

LOCAL_GET: 'get_local' ;
LOCAL_SET: 'set_local' ;
LOCAL_TEE: 'tee_local' ;
GLOBAL_GET: 'get_global' ;
GLOBAL_SET: 'set_global' ;

LOAD : NXX '.load' (MEM_SIZE '_' SIGN)? ;
STORE : NXX '.store' (MEM_SIZE)? ;

OFFSET_EQ_NAT : 'offset=' Nat ;
ALIGN_EQ_NAT : 'align=' Nat ;

UNARY
  : IXX '.clz'
  | IXX '.ctz'
  | IXX '.popcnt'
  | FXX '.neg'
  | FXX '.abs'
  | FXX '.sqrt'
  | FXX '.ceil'
  | FXX '.floor'
  | FXX '.trunc'
  | FXX '.nearest'
  ;

BINARY
  : IXX '.add'
  | IXX '.sub'
  | IXX '.mul'
  | IXX '.div_s'
  | IXX '.div_u'
  | IXX '.rem_s'
  | IXX '.rem_u'
  | IXX '.and'
  | IXX '.or'
  | IXX '.xor'
  | IXX '.shl'
  | IXX '.shr_s'
  | IXX '.shr_u'
  | IXX '.rotl'
  | IXX '.rotr'
  | FXX '.add'
  | FXX '.sub'
  | FXX '.mul'
  | FXX '.div'
  | FXX '.min'
  | FXX '.max'
  | FXX '.copysign'
  ;

TEST
  : IXX '.eqz'
  ;

COMPARE
  : IXX '.eq'
  | IXX '.ne'
  | IXX '.lt_s'
  | IXX '.lt_u'
  | IXX '.le_s'
  | IXX '.le_u'
  | IXX '.gt_s'
  | IXX '.gt_u'
  | IXX '.ge_s'
  | IXX '.ge_u'
  | FXX '.eq'
  | FXX '.ne'
  | FXX '.lt'
  | FXX '.le'
  | FXX '.gt'
  | FXX '.ge'
  ;

CONVERT
  : 'i32.wrap_i64'
  | 'i64.extend_i32_s'
  | 'i64.extend_i32_u'
  | 'f32.demote_f64'
  | 'f64.promote_f32'
  | IXX '.trunc_f32_s'
  | IXX '.trunc_f32_u'
  | IXX '.trunc_f64_s'
  | IXX '.trunc_f64_u'
  | FXX '.convert_i32_s'
  | FXX '.convert_i32_u'
  | FXX '.convert_i64_s'
  | FXX '.convert_i64_u'
  | 'f32.reinterpret_i32'
  | 'f64.reinterpret_i64'
  | 'i32.reinterpret_f32'
  | 'i64.reinterpret_f64'
  ;

MEMORY_SIZE : 'memory.size' ;
MEMORY_GROW : 'memory.grow' ;

TYPE: 'type' ;
FUNC: 'func' ;
START: 'start' ;
PARAM: 'param' ;
RESULT: 'result' ;
LOCAL: 'local' ;
GLOBAL: 'global' ;
TABLE: 'table' ;
MEMORY: 'memory' ;
ELEM: 'elem' ;
DATA: 'data' ;
OFFSET: 'offset' ;
IMPORT: 'import' ;
EXPORT: 'export' ;

MODULE : 'module' ;
BIN : 'binary' ;
QUOTE : 'quote' ;

SCRIPT: 'script' ;
REGISTER: 'register' ;
INVOKE: 'invoke' ;
GET: 'get' ;
ASSERT_MALFORMED: 'assert_malformed' ;
ASSERT_INVALID: 'assert_invalid' ;
ASSERT_UNLINKABLE: 'assert_unlinkable' ;
ASSERT_RETURN: 'assert_return' ;
ASSERT_RETURN_CANONICAL_NAN: 'assert_return_canonical_nan' ;
ASSERT_RETURN_ARITHMETIC_NAN: 'assert_return_arithmetic_nan' ;
ASSERT_TRAP: 'assert_trap' ;
ASSERT_EXHAUSTION: 'assert_exhaustion' ;
INPUT: 'input' ;
OUTPUT: 'output' ;

VAR : Name ;

SPACE
  : [ \t\r\n] -> skip
  ;

COMMENT
  : ( '(;' .*? ';)'
  | ';;' .*? '\n')-> skip
  ;

fragment Symbol
  : '.' | '+' | '-' | '*' | '/' | '\\' | '^' | '~' | '=' | '<' | '>' | '!' | '?' | '@' | '#' | '$' | '%' | '&' | '|' | ':' | '\'' | '`'
  ;

fragment Num
  : Digit ('_'? Digit)*
  ;

fragment HexNum
  : HexDigit ('_'? HexDigit)*
  ;

fragment Sign
  : '+' | '-'
  ;

fragment Digit
  : [0-9]
  ;

fragment HexDigit
  : [0-9a-fA-F]
  ;

fragment Letter
  : [a-zA-Z]
  ;

fragment Nat : Num | ('0x' HexNum) ;
fragment Int : Sign Nat ;
fragment Frac : Num ;
fragment HexFrac : HexNum ;

fragment Float
  : Sign? Num '.' Frac?
  | Sign? Num ('.' Frac?)? ('e' | 'E') Sign? Num
  | Sign? '0x' HexNum '.' HexFrac?
  | Sign? '0x' HexNum ('.' HexFrac?)? ('p' | 'P') Sign? Num
  | Sign? 'inf'
  | Sign? 'nan'
  | Sign? 'nan:' '0x' HexNum
  ;

fragment String
  : '"' ( Char | '\n' | '\t' | '\\' | '\'' | '\\' HexDigit HexDigit | '\\u{' HexDigit+ '}' )* '"'
  ;

fragment Name
  : '$' (Letter | Digit | '_' | Symbol)+
  ;

fragment Escape : [nrt'"\\] ;

fragment IXX : 'i' ('32' | '64') ;
fragment FXX : 'f' ('32' | '64') ;
fragment NXX : IXX | FXX ;
fragment MIXX : 'i' ('8' | '16' | '32' | '64') ;
fragment MFXX : 'f' ('32' | '64') ;
fragment SIGN : 's' | 'u' ;
fragment MEM_SIZE : '8' | '16' | '32' ;

fragment Char : ~["'\\\u0000-\u001f\u007f-\u00ff] ;
fragment Ascii : [\u0000-\u007f] ;
fragment Ascii_no_nl : [\u0000-\u0009\u000b-\u007f] ;
fragment Utf8Cont : [\u0080-\u00bf] ;
fragment Utf8 : Ascii | Utf8Enc ;
fragment Utf8_no_nl : Ascii_no_nl | Utf8Enc ;

fragment Utf8Enc
  : [\u00c2-\u00df] Utf8Cont
  | [\u00e0] [\u00a0-\u00bf] Utf8Cont
  | [\u00ed] [\u0080-\u009f] Utf8Cont
  | [\u00e1-\u00ec\u00ee-\u00ef] Utf8Cont Utf8Cont
  | [\u00f0] [\u0090-\u00bf] Utf8Cont Utf8Cont
  | [\u00f4] [\u0080-\u008f] Utf8Cont Utf8Cont
  | [\u00f1-\u00f3] Utf8Cont Utf8Cont Utf8Cont
  ;
