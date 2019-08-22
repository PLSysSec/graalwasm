// Generated from language/src/main/java/com/oracle/truffle/wasm/parser/WasmLanguage.g4 by ANTLR 4.7.1
package com.oracle.truffle.wasm.parser;

// DO NOT MODIFY - generated from WasmLanguage.g4 using "mx create-wasm-parser"

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.Map;

import java.lang.Integer;
import java.lang.Boolean;

import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmRootNode;
import com.oracle.truffle.wasm.nodes.WasmStatementNode;
import com.oracle.truffle.wasm.nodes.WasmFunctionSignatureNode;
import com.oracle.truffle.wasm.parser.WasmParseError;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WasmLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, NAT=3, INT=4, FLOAT=5, STRING=6, VALUE_TYPE=7, CONST=8, 
		FUNCREF=9, MUT=10, PRINT=11, NOP=12, UNREACHABLE=13, DROP=14, BLOCK=15, 
		LOOP=16, END=17, BR=18, BR_IF=19, BR_TABLE=20, RETURN=21, IF=22, THEN=23, 
		ELSE=24, SELECT=25, CALL=26, CALL_INDIRECT=27, LOCAL_GET=28, LOCAL_SET=29, 
		LOCAL_TEE=30, GLOBAL_GET=31, GLOBAL_SET=32, LOAD=33, STORE=34, OFFSET_EQ_NAT=35, 
		ALIGN_EQ_NAT=36, UNARY=37, BINARY=38, TEST=39, COMPARE=40, CONVERT=41, 
		MEMORY_SIZE=42, MEMORY_GROW=43, TYPE=44, FUNC=45, START=46, PARAM=47, 
		RESULT=48, LOCAL=49, GLOBAL=50, TABLE=51, MEMORY=52, ELEM=53, DATA=54, 
		OFFSET=55, IMPORT=56, EXPORT=57, MODULE=58, BIN=59, QUOTE=60, SCRIPT=61, 
		REGISTER=62, INVOKE=63, GET=64, ASSERT_MALFORMED=65, ASSERT_INVALID=66, 
		ASSERT_UNLINKABLE=67, ASSERT_RETURN=68, ASSERT_RETURN_CANONICAL_NAN=69, 
		ASSERT_RETURN_ARITHMETIC_NAN=70, ASSERT_TRAP=71, ASSERT_EXHAUSTION=72, 
		INPUT=73, OUTPUT=74, VAR=75, SPACE=76, COMMENT=77;
	public static final int
		RULE_wasmfuncpass = 0, RULE_moduleFP = 1, RULE_module_fieldFP = 2, RULE_module_FP = 3, 
		RULE_funcFP = 4, RULE_func_fieldsFP = 5, RULE_func_fields_bodyFP = 6, 
		RULE_func_result_bodyFP = 7, RULE_wasmlanguage = 8, RULE_value = 9, RULE_name = 10, 
		RULE_value_type = 11, RULE_elem_type = 12, RULE_global_type = 13, RULE_def_type = 14, 
		RULE_func_type = 15, RULE_table_type = 16, RULE_memory_type = 17, RULE_type_use = 18, 
		RULE_literal = 19, RULE_var = 20, RULE_bind_var = 21, RULE_instr = 22, 
		RULE_plain_instr = 23, RULE_call_instr = 24, RULE_call_instr_params = 25, 
		RULE_call_instr_instr = 26, RULE_call_instr_params_instr = 27, RULE_call_instr_results_instr = 28, 
		RULE_block_instr = 29, RULE_block_type = 30, RULE_block = 31, RULE_instr_list = 32, 
		RULE_const_expr = 33, RULE_func = 34, RULE_func_fields = 35, RULE_func_fields_import = 36, 
		RULE_func_fields_import_result = 37, RULE_func_fields_body = 38, RULE_func_result_body = 39, 
		RULE_func_body = 40, RULE_offset = 41, RULE_elem = 42, RULE_table = 43, 
		RULE_table_fields = 44, RULE_data = 45, RULE_memory = 46, RULE_memory_fields = 47, 
		RULE_sglobal = 48, RULE_global_fields = 49, RULE_import_desc = 50, RULE_simport = 51, 
		RULE_inline_import = 52, RULE_export_desc = 53, RULE_export = 54, RULE_inline_export = 55, 
		RULE_type_ = 56, RULE_type_def = 57, RULE_start = 58, RULE_module_field = 59, 
		RULE_module_ = 60, RULE_script_module = 61, RULE_action = 62, RULE_assertion = 63, 
		RULE_cmd = 64, RULE_meta = 65, RULE_wconst = 66, RULE_const_list = 67, 
		RULE_script = 68, RULE_module = 69;
	public static final String[] ruleNames = {
		"wasmfuncpass", "moduleFP", "module_fieldFP", "module_FP", "funcFP", "func_fieldsFP", 
		"func_fields_bodyFP", "func_result_bodyFP", "wasmlanguage", "value", "name", 
		"value_type", "elem_type", "global_type", "def_type", "func_type", "table_type", 
		"memory_type", "type_use", "literal", "var", "bind_var", "instr", "plain_instr", 
		"call_instr", "call_instr_params", "call_instr_instr", "call_instr_params_instr", 
		"call_instr_results_instr", "block_instr", "block_type", "block", "instr_list", 
		"const_expr", "func", "func_fields", "func_fields_import", "func_fields_import_result", 
		"func_fields_body", "func_result_body", "func_body", "offset", "elem", 
		"table", "table_fields", "data", "memory", "memory_fields", "sglobal", 
		"global_fields", "import_desc", "simport", "inline_import", "export_desc", 
		"export", "inline_export", "type_", "type_def", "start", "module_field", 
		"module_", "script_module", "action", "assertion", "cmd", "meta", "wconst", 
		"const_list", "script", "module"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, null, null, null, null, "'funcref'", "'mut'", 
		"'println'", "'nop'", "'unreachable'", "'drop'", "'block'", "'loop'", 
		"'end'", "'br'", "'br_if'", "'br_table'", "'return'", "'if'", "'then'", 
		"'else'", "'select'", "'call'", "'call_indirect'", "'local.get'", "'local.set'", 
		"'local.tee'", "'global.get'", "'global.set'", null, null, null, null, 
		null, null, null, null, null, "'memory.size'", "'memory.grow'", "'type'", 
		"'func'", "'start'", "'param'", "'result'", "'local'", "'global'", "'table'", 
		"'memory'", "'elem'", "'data'", "'offset'", "'import'", "'export'", "'module'", 
		"'binary'", "'quote'", "'script'", "'register'", "'invoke'", "'get'", 
		"'assert_malformed'", "'assert_invalid'", "'assert_unlinkable'", "'assert_return'", 
		"'assert_return_canonical_nan'", "'assert_return_arithmetic_nan'", "'assert_trap'", 
		"'assert_exhaustion'", "'input'", "'output'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAR", "RPAR", "NAT", "INT", "FLOAT", "STRING", "VALUE_TYPE", "CONST", 
		"FUNCREF", "MUT", "PRINT", "NOP", "UNREACHABLE", "DROP", "BLOCK", "LOOP", 
		"END", "BR", "BR_IF", "BR_TABLE", "RETURN", "IF", "THEN", "ELSE", "SELECT", 
		"CALL", "CALL_INDIRECT", "LOCAL_GET", "LOCAL_SET", "LOCAL_TEE", "GLOBAL_GET", 
		"GLOBAL_SET", "LOAD", "STORE", "OFFSET_EQ_NAT", "ALIGN_EQ_NAT", "UNARY", 
		"BINARY", "TEST", "COMPARE", "CONVERT", "MEMORY_SIZE", "MEMORY_GROW", 
		"TYPE", "FUNC", "START", "PARAM", "RESULT", "LOCAL", "GLOBAL", "TABLE", 
		"MEMORY", "ELEM", "DATA", "OFFSET", "IMPORT", "EXPORT", "MODULE", "BIN", 
		"QUOTE", "SCRIPT", "REGISTER", "INVOKE", "GET", "ASSERT_MALFORMED", "ASSERT_INVALID", 
		"ASSERT_UNLINKABLE", "ASSERT_RETURN", "ASSERT_RETURN_CANONICAL_NAN", "ASSERT_RETURN_ARITHMETIC_NAN", 
		"ASSERT_TRAP", "ASSERT_EXHAUSTION", "INPUT", "OUTPUT", "VAR", "SPACE", 
		"COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WasmLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private WasmNodeFactory factory;
	private Source source;
	private static int numFunc = 0;

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

	public static Map<Integer, RootCallTarget> parseWasm(WasmLanguage language, Source source) {
	    WasmLanguageLexer lexer = new WasmLanguageLexer(CharStreams.fromString(source.getCharacters().toString()));
	    WasmLanguageParser parser = new WasmLanguageParser(new CommonTokenStream(lexer));
	    lexer.removeErrorListeners();
	    parser.removeErrorListeners();
	    BailoutErrorListener listener = new BailoutErrorListener(source);
	    lexer.addErrorListener(listener);
	    parser.addErrorListener(listener);
	    parser.factory = new WasmNodeFactory(language, source);
	    parser.source = source;
	    parser.wasmfuncpass();
	    parser.reset();
	    parser.wasmlanguage();
	    return parser.factory.getAllFunctions();
	}

	public WasmLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WasmfuncpassContext extends ParserRuleContext {
		public ModuleFPContext moduleFP() {
			return getRuleContext(ModuleFPContext.class,0);
		}
		public WasmfuncpassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wasmfuncpass; }
	}

	public final WasmfuncpassContext wasmfuncpass() throws RecognitionException {
		WasmfuncpassContext _localctx = new WasmfuncpassContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wasmfuncpass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			moduleFP();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleFPContext extends ParserRuleContext {
		public Module_FPContext module_FP() {
			return getRuleContext(Module_FPContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WasmLanguageParser.EOF, 0); }
		public List<Module_fieldFPContext> module_fieldFP() {
			return getRuleContexts(Module_fieldFPContext.class);
		}
		public Module_fieldFPContext module_fieldFP(int i) {
			return getRuleContext(Module_fieldFPContext.class,i);
		}
		public ModuleFPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleFP; }
	}

	public final ModuleFPContext moduleFP() throws RecognitionException {
		ModuleFPContext _localctx = new ModuleFPContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleFP);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				module_FP();
				setState(143);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(145);
					module_fieldFP();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_fieldFPContext extends ParserRuleContext {
		public FuncFPContext funcFP() {
			return getRuleContext(FuncFPContext.class,0);
		}
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Module_fieldFPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_fieldFP; }
	}

	public final Module_fieldFPContext module_fieldFP() throws RecognitionException {
		Module_fieldFPContext _localctx = new Module_fieldFPContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module_fieldFP);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				funcFP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				type_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_FPContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode MODULE() { return getToken(WasmLanguageParser.MODULE, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public List<Module_fieldFPContext> module_fieldFP() {
			return getRuleContexts(Module_fieldFPContext.class);
		}
		public Module_fieldFPContext module_fieldFP(int i) {
			return getRuleContext(Module_fieldFPContext.class,i);
		}
		public Module_FPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_FP; }
	}

	public final Module_FPContext module_FP() throws RecognitionException {
		Module_FPContext _localctx = new Module_FPContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_module_FP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LPAR);
			setState(159);
			match(MODULE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(160);
				match(VAR);
				}
			}

			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(163);
				module_fieldFP();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncFPContext extends ParserRuleContext {
		public Bind_varContext bind_var;
		public Func_fieldsFPContext func_fieldsFP;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode FUNC() { return getToken(WasmLanguageParser.FUNC, 0); }
		public Func_fieldsFPContext func_fieldsFP() {
			return getRuleContext(Func_fieldsFPContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public FuncFPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFP; }
	}

	public final FuncFPContext funcFP() throws RecognitionException {
		FuncFPContext _localctx = new FuncFPContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcFP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(LPAR);
			setState(172);
			match(FUNC);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(173);
				((FuncFPContext)_localctx).bind_var = bind_var();
				}
				break;
			}
			setState(176);
			((FuncFPContext)_localctx).func_fieldsFP = func_fieldsFP();
			 factory.createSignature((((FuncFPContext)_localctx).bind_var!=null?(((FuncFPContext)_localctx).bind_var.start):null), numFunc++, ((FuncFPContext)_localctx).func_fieldsFP.numPar, ((FuncFPContext)_localctx).func_fieldsFP.numRes); 
			setState(178);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_fieldsFPContext extends ParserRuleContext {
		public int numPar;
		public int numRes;
		public Func_fields_bodyFPContext func_fields_bodyFP;
		public Func_fields_bodyFPContext func_fields_bodyFP() {
			return getRuleContext(Func_fields_bodyFPContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Func_fieldsFPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fieldsFP; }
	}

	public final Func_fieldsFPContext func_fieldsFP() throws RecognitionException {
		Func_fieldsFPContext _localctx = new Func_fieldsFPContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_fieldsFP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(180);
				type_use();
				}
				break;
			}
			setState(183);
			((Func_fieldsFPContext)_localctx).func_fields_bodyFP = func_fields_bodyFP();
			 ((Func_fieldsFPContext)_localctx).numPar =  ((Func_fieldsFPContext)_localctx).func_fields_bodyFP.numPar; ((Func_fieldsFPContext)_localctx).numRes =  ((Func_fieldsFPContext)_localctx).func_fields_bodyFP.numRes; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_fields_bodyFPContext extends ParserRuleContext {
		public int numPar;
		public int numRes;
		public Func_result_bodyFPContext func_result_bodyFP;
		public Func_result_bodyFPContext func_result_bodyFP() {
			return getRuleContext(Func_result_bodyFPContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> PARAM() { return getTokens(WasmLanguageParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(WasmLanguageParser.PARAM, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<TerminalNode> VAR() { return getTokens(WasmLanguageParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(WasmLanguageParser.VAR, i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Func_fields_bodyFPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields_bodyFP; }
	}

	public final Func_fields_bodyFPContext func_fields_bodyFP() throws RecognitionException {
		Func_fields_bodyFPContext _localctx = new Func_fields_bodyFPContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_fields_bodyFP);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 int numPar = 0; 
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(187);
						match(LPAR);
						setState(188);
						match(PARAM);
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(189);
							value_type();
							}
							}
							setState(194);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						 numPar++; 
						setState(196);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(197);
						match(LPAR);
						setState(198);
						match(PARAM);
						setState(199);
						match(VAR);
						setState(200);
						value_type();
						setState(201);
						match(RPAR);
						 numPar++; 
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(209);
			((Func_fields_bodyFPContext)_localctx).func_result_bodyFP = func_result_bodyFP();
			 ((Func_fields_bodyFPContext)_localctx).numPar =  numPar; ((Func_fields_bodyFPContext)_localctx).numRes =  ((Func_fields_bodyFPContext)_localctx).func_result_bodyFP.numRes; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_result_bodyFPContext extends ParserRuleContext {
		public int numRes;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode RESULT() { return getToken(WasmLanguageParser.RESULT, 0); }
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Func_result_bodyFPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_result_bodyFP; }
	}

	public final Func_result_bodyFPContext func_result_bodyFP() throws RecognitionException {
		Func_result_bodyFPContext _localctx = new Func_result_bodyFPContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_result_bodyFP);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 int numRes = 0; 
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(213);
				match(LPAR);
				setState(214);
				match(RESULT);
				setState(215);
				value_type();
				 numRes++; 
				setState(217);
				match(RPAR);
				}
				break;
			}
			 ((Func_result_bodyFPContext)_localctx).numRes =  numRes; 
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(222);
					matchWildcard();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WasmlanguageContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public WasmlanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wasmlanguage; }
	}

	public final WasmlanguageContext wasmlanguage() throws RecognitionException {
		WasmlanguageContext _localctx = new WasmlanguageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_wasmlanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			module();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(WasmLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(WasmLanguageParser.FLOAT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WasmLanguageParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_typeContext extends ParserRuleContext {
		public TerminalNode VALUE_TYPE() { return getToken(WasmLanguageParser.VALUE_TYPE, 0); }
		public Value_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_type; }
	}

	public final Value_typeContext value_type() throws RecognitionException {
		Value_typeContext _localctx = new Value_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(VALUE_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elem_typeContext extends ParserRuleContext {
		public TerminalNode FUNCREF() { return getToken(WasmLanguageParser.FUNCREF, 0); }
		public Elem_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_type; }
	}

	public final Elem_typeContext elem_type() throws RecognitionException {
		Elem_typeContext _localctx = new Elem_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elem_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FUNCREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_typeContext extends ParserRuleContext {
		public Boolean result;
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode MUT() { return getToken(WasmLanguageParser.MUT, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Global_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_type; }
	}

	public final Global_typeContext global_type() throws RecognitionException {
		Global_typeContext _localctx = new Global_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_global_type);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				value_type();
				 ((Global_typeContext)_localctx).result =  new Boolean(false); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(LPAR);
				setState(242);
				match(MUT);
				setState(243);
				value_type();
				setState(244);
				match(RPAR);
				 ((Global_typeContext)_localctx).result =  new Boolean(true); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_typeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode FUNC() { return getToken(WasmLanguageParser.FUNC, 0); }
		public Func_typeContext func_type() {
			return getRuleContext(Func_typeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Def_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_type; }
	}

	public final Def_typeContext def_type() throws RecognitionException {
		Def_typeContext _localctx = new Def_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_def_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LPAR);
			setState(250);
			match(FUNC);
			setState(251);
			func_type();
			setState(252);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_typeContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<TerminalNode> RESULT() { return getTokens(WasmLanguageParser.RESULT); }
		public TerminalNode RESULT(int i) {
			return getToken(WasmLanguageParser.RESULT, i);
		}
		public List<TerminalNode> PARAM() { return getTokens(WasmLanguageParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(WasmLanguageParser.PARAM, i);
		}
		public List<Bind_varContext> bind_var() {
			return getRuleContexts(Bind_varContext.class);
		}
		public Bind_varContext bind_var(int i) {
			return getRuleContext(Bind_varContext.class,i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(254);
				match(LPAR);
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(255);
					match(RESULT);
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(256);
						value_type();
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(262);
					match(PARAM);
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(263);
						value_type();
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(269);
					match(PARAM);
					setState(270);
					bind_var();
					setState(271);
					value_type();
					}
					break;
				}
				setState(275);
				match(RPAR);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_typeContext extends ParserRuleContext {
		public List<TerminalNode> NAT() { return getTokens(WasmLanguageParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(WasmLanguageParser.NAT, i);
		}
		public Elem_typeContext elem_type() {
			return getRuleContext(Elem_typeContext.class,0);
		}
		public Table_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type; }
	}

	public final Table_typeContext table_type() throws RecognitionException {
		Table_typeContext _localctx = new Table_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_table_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(NAT);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(282);
				match(NAT);
				}
			}

			setState(285);
			elem_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Memory_typeContext extends ParserRuleContext {
		public Integer result;
		public Token min;
		public Token max;
		public List<TerminalNode> NAT() { return getTokens(WasmLanguageParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(WasmLanguageParser.NAT, i);
		}
		public Memory_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_type; }
	}

	public final Memory_typeContext memory_type() throws RecognitionException {
		Memory_typeContext _localctx = new Memory_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memory_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((Memory_typeContext)_localctx).min = match(NAT);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(288);
				((Memory_typeContext)_localctx).max = match(NAT);
				}
			}

			 ((Memory_typeContext)_localctx).result =  Integer.parseUnsignedInt(((Memory_typeContext)_localctx).min.getText()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_useContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode TYPE() { return getToken(WasmLanguageParser.TYPE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Type_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_use; }
	}

	public final Type_useContext type_use() throws RecognitionException {
		Type_useContext _localctx = new Type_useContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(LPAR);
			setState(294);
			match(TYPE);
			setState(295);
			var();
			setState(296);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(WasmLanguageParser.NAT, 0); }
		public TerminalNode INT() { return getToken(WasmLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(WasmLanguageParser.FLOAT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAT) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(WasmLanguageParser.NAT, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==NAT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bind_varContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public Bind_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind_var; }
	}

	public final Bind_varContext bind_var() throws RecognitionException {
		Bind_varContext _localctx = new Bind_varContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bind_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public Plain_instrContext plain_instr;
		public Call_instr_instrContext call_instr_instr;
		public Block_instrContext block_instr;
		public Plain_instrContext plain_instr() {
			return getRuleContext(Plain_instrContext.class,0);
		}
		public Call_instr_instrContext call_instr_instr() {
			return getRuleContext(Call_instr_instrContext.class,0);
		}
		public Block_instrContext block_instr() {
			return getRuleContext(Block_instrContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InstrContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_instr; }
	}

	public final InstrContext instr(Stack<WasmStatementNode> body) throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState(), body);
		enterRule(_localctx, 44, RULE_instr);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case PRINT:
			case NOP:
			case UNREACHABLE:
			case DROP:
			case BR:
			case BR_IF:
			case BR_TABLE:
			case RETURN:
			case SELECT:
			case CALL:
			case LOCAL_GET:
			case LOCAL_SET:
			case LOCAL_TEE:
			case GLOBAL_GET:
			case GLOBAL_SET:
			case LOAD:
			case STORE:
			case UNARY:
			case BINARY:
			case TEST:
			case COMPARE:
			case CONVERT:
			case MEMORY_SIZE:
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((InstrContext)_localctx).call_instr_instr = call_instr_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).call_instr_instr.result; 
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((InstrContext)_localctx).block_instr = block_instr();
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).block_instr.result; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Plain_instrContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public Token UNREACHABLE;
		public Token PRINT;
		public Token NOP;
		public Token DROP;
		public Token SELECT;
		public Token RETURN;
		public Token VAR;
		public Token NAT;
		public VarContext var;
		public Token LOAD;
		public Token OFFSET_EQ_NAT;
		public Token ALIGN_EQ_NAT;
		public Token STORE;
		public Token MEMORY_SIZE;
		public Token MEMORY_GROW;
		public Token CONST;
		public LiteralContext literal;
		public Token TEST;
		public Token COMPARE;
		public Token UNARY;
		public Token BINARY;
		public Token CONVERT;
		public TerminalNode UNREACHABLE() { return getToken(WasmLanguageParser.UNREACHABLE, 0); }
		public TerminalNode PRINT() { return getToken(WasmLanguageParser.PRINT, 0); }
		public TerminalNode NOP() { return getToken(WasmLanguageParser.NOP, 0); }
		public TerminalNode DROP() { return getToken(WasmLanguageParser.DROP, 0); }
		public TerminalNode SELECT() { return getToken(WasmLanguageParser.SELECT, 0); }
		public TerminalNode BR() { return getToken(WasmLanguageParser.BR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode BR_IF() { return getToken(WasmLanguageParser.BR_IF, 0); }
		public TerminalNode BR_TABLE() { return getToken(WasmLanguageParser.BR_TABLE, 0); }
		public TerminalNode RETURN() { return getToken(WasmLanguageParser.RETURN, 0); }
		public TerminalNode CALL() { return getToken(WasmLanguageParser.CALL, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public TerminalNode NAT() { return getToken(WasmLanguageParser.NAT, 0); }
		public TerminalNode LOCAL_GET() { return getToken(WasmLanguageParser.LOCAL_GET, 0); }
		public TerminalNode LOCAL_SET() { return getToken(WasmLanguageParser.LOCAL_SET, 0); }
		public TerminalNode LOCAL_TEE() { return getToken(WasmLanguageParser.LOCAL_TEE, 0); }
		public TerminalNode GLOBAL_GET() { return getToken(WasmLanguageParser.GLOBAL_GET, 0); }
		public TerminalNode GLOBAL_SET() { return getToken(WasmLanguageParser.GLOBAL_SET, 0); }
		public TerminalNode LOAD() { return getToken(WasmLanguageParser.LOAD, 0); }
		public TerminalNode OFFSET_EQ_NAT() { return getToken(WasmLanguageParser.OFFSET_EQ_NAT, 0); }
		public TerminalNode ALIGN_EQ_NAT() { return getToken(WasmLanguageParser.ALIGN_EQ_NAT, 0); }
		public TerminalNode STORE() { return getToken(WasmLanguageParser.STORE, 0); }
		public TerminalNode MEMORY_SIZE() { return getToken(WasmLanguageParser.MEMORY_SIZE, 0); }
		public TerminalNode MEMORY_GROW() { return getToken(WasmLanguageParser.MEMORY_GROW, 0); }
		public TerminalNode CONST() { return getToken(WasmLanguageParser.CONST, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TEST() { return getToken(WasmLanguageParser.TEST, 0); }
		public TerminalNode COMPARE() { return getToken(WasmLanguageParser.COMPARE, 0); }
		public TerminalNode UNARY() { return getToken(WasmLanguageParser.UNARY, 0); }
		public TerminalNode BINARY() { return getToken(WasmLanguageParser.BINARY, 0); }
		public TerminalNode CONVERT() { return getToken(WasmLanguageParser.CONVERT, 0); }
		public Plain_instrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Plain_instrContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_plain_instr; }
	}

	public final Plain_instrContext plain_instr(Stack<WasmStatementNode> body) throws RecognitionException {
		Plain_instrContext _localctx = new Plain_instrContext(_ctx, getState(), body);
		enterRule(_localctx, 46, RULE_plain_instr);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				((Plain_instrContext)_localctx).PRINT = match(PRINT);
				 ((Plain_instrContext)_localctx).result =  factory.createPrint(((Plain_instrContext)_localctx).PRINT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				match(BR);
				setState(326);
				var();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				match(BR_IF);
				setState(328);
				var();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				match(BR_TABLE);
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(330);
					var();
					}
					}
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(337);
				match(CALL);
				setState(338);
				((Plain_instrContext)_localctx).VAR = match(VAR);
				 String funcName = ((Plain_instrContext)_localctx).VAR.getText();
				                                                          Integer funcIndex = factory.getIndex(funcName);
				                                                          int numArgs = factory.getSignature(funcIndex).getNumParams();
				                                                          List<WasmExpressionNode> params = new ArrayList<>();
				                                                          for (int i = 0; i < numArgs; i++) {
				                                                            params.add((WasmExpressionNode) body.pop());
				                                                          } // FIXME still need to check ret
				                                                          ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createStringLiteral(((Plain_instrContext)_localctx).VAR, false), true), params, ((Plain_instrContext)_localctx).VAR); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(340);
				match(CALL);
				setState(341);
				((Plain_instrContext)_localctx).NAT = match(NAT);
				 Integer funcIndex = Integer.parseUnsignedInt(((Plain_instrContext)_localctx).NAT.getText());
				                                                          int numArgs = factory.getSignature(funcIndex).getNumParams();
				                                                          List<WasmExpressionNode> params = new ArrayList<>();
				                                                          for (int i = 0; i < numArgs; i++) {
				                                                            params.add((WasmExpressionNode) body.pop());
				                                                          } // FIXME still need to check ret
				                                                          ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createIndexLiteral(((Plain_instrContext)_localctx).NAT, false), true), params, ((Plain_instrContext)_localctx).NAT); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(343);
				match(LOCAL_GET);
				setState(344);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(347);
				match(LOCAL_SET);
				setState(348);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(351);
				match(LOCAL_TEE);
				setState(352);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') {
				                                                            WasmExpressionNode str = factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false);
				                                                            ((Plain_instrContext)_localctx).result =  factory.createTee(str, (WasmExpressionNode) body.pop());
				                                                          } else {
				                                                            WasmExpressionNode idx = factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false);
				                                                            ((Plain_instrContext)_localctx).result =  factory.createTee(idx, (WasmExpressionNode) body.pop());
				                                                          } 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(355);
				match(GLOBAL_GET);
				setState(356);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), false);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(359);
				match(GLOBAL_SET);
				setState(360);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(363);
				((Plain_instrContext)_localctx).LOAD = match(LOAD);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(364);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(367);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createLoad(((Plain_instrContext)_localctx).LOAD, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(371);
				((Plain_instrContext)_localctx).STORE = match(STORE);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(372);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(375);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createStore(((Plain_instrContext)_localctx).STORE, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(379);
				((Plain_instrContext)_localctx).MEMORY_SIZE = match(MEMORY_SIZE);
				 ((Plain_instrContext)_localctx).result =  factory.createMemorySize(((Plain_instrContext)_localctx).MEMORY_SIZE); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(381);
				((Plain_instrContext)_localctx).MEMORY_GROW = match(MEMORY_GROW);
				 ((Plain_instrContext)_localctx).result =  factory.createMemoryGrow(((Plain_instrContext)_localctx).MEMORY_GROW, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(383);
				((Plain_instrContext)_localctx).CONST = match(CONST);
				setState(384);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).CONST, (((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(387);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(389);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(391);
				((Plain_instrContext)_localctx).UNARY = match(UNARY);
				 ((Plain_instrContext)_localctx).result =  factory.createUnary(((Plain_instrContext)_localctx).UNARY, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(393);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(395);
				((Plain_instrContext)_localctx).CONVERT = match(CONVERT);
				 ((Plain_instrContext)_localctx).result =  factory.createConvert(((Plain_instrContext)_localctx).CONVERT, (WasmExpressionNode) body.pop()); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_instrContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public Call_instr_paramsContext call_instr_params;
		public TerminalNode CALL_INDIRECT() { return getToken(WasmLanguageParser.CALL_INDIRECT, 0); }
		public Call_instr_paramsContext call_instr_params() {
			return getRuleContext(Call_instr_paramsContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Call_instrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Call_instrContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_call_instr; }
	}

	public final Call_instrContext call_instr(Stack<WasmStatementNode> body) throws RecognitionException {
		Call_instrContext _localctx = new Call_instrContext(_ctx, getState(), body);
		enterRule(_localctx, 48, RULE_call_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(CALL_INDIRECT);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(400);
				type_use();
				}
				break;
			}
			setState(403);
			((Call_instrContext)_localctx).call_instr_params = call_instr_params(body);
			 ((Call_instrContext)_localctx).result =  ((Call_instrContext)_localctx).call_instr_params.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_instr_paramsContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> PARAM() { return getTokens(WasmLanguageParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(WasmLanguageParser.PARAM, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<TerminalNode> RESULT() { return getTokens(WasmLanguageParser.RESULT); }
		public TerminalNode RESULT(int i) {
			return getToken(WasmLanguageParser.RESULT, i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Call_instr_paramsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Call_instr_paramsContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_call_instr_params; }
	}

	public final Call_instr_paramsContext call_instr_params(Stack<WasmStatementNode> body) throws RecognitionException {
		Call_instr_paramsContext _localctx = new Call_instr_paramsContext(_ctx, getState(), body);
		enterRule(_localctx, 50, RULE_call_instr_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(406);
					match(LPAR);
					setState(407);
					match(PARAM);
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(408);
						value_type();
						}
						}
						setState(413);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(414);
					match(RPAR);
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(420);
				match(LPAR);
				setState(421);
				match(RESULT);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(422);
					value_type();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(RPAR);
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_instr_instrContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public Call_instr_params_instrContext call_instr_params_instr;
		public TerminalNode CALL_INDIRECT() { return getToken(WasmLanguageParser.CALL_INDIRECT, 0); }
		public Call_instr_params_instrContext call_instr_params_instr() {
			return getRuleContext(Call_instr_params_instrContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Call_instr_instrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Call_instr_instrContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_call_instr_instr; }
	}

	public final Call_instr_instrContext call_instr_instr(Stack<WasmStatementNode> body) throws RecognitionException {
		Call_instr_instrContext _localctx = new Call_instr_instrContext(_ctx, getState(), body);
		enterRule(_localctx, 52, RULE_call_instr_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(CALL_INDIRECT);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(435);
				type_use();
				}
				break;
			}
			setState(438);
			((Call_instr_instrContext)_localctx).call_instr_params_instr = call_instr_params_instr(body);
			 ((Call_instr_instrContext)_localctx).result =  ((Call_instr_instrContext)_localctx).call_instr_params_instr.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_instr_params_instrContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public Call_instr_results_instrContext call_instr_results_instr;
		public Call_instr_results_instrContext call_instr_results_instr() {
			return getRuleContext(Call_instr_results_instrContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> PARAM() { return getTokens(WasmLanguageParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(WasmLanguageParser.PARAM, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Call_instr_params_instrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Call_instr_params_instrContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_call_instr_params_instr; }
	}

	public final Call_instr_params_instrContext call_instr_params_instr(Stack<WasmStatementNode> body) throws RecognitionException {
		Call_instr_params_instrContext _localctx = new Call_instr_params_instrContext(_ctx, getState(), body);
		enterRule(_localctx, 54, RULE_call_instr_params_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					match(LPAR);
					setState(442);
					match(PARAM);
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(443);
						value_type();
						}
						}
						setState(448);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(449);
					match(RPAR);
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(455);
			((Call_instr_params_instrContext)_localctx).call_instr_results_instr = call_instr_results_instr(body);
			 ((Call_instr_params_instrContext)_localctx).result =  ((Call_instr_params_instrContext)_localctx).call_instr_results_instr.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_instr_results_instrContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public InstrContext instr;
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> RESULT() { return getTokens(WasmLanguageParser.RESULT); }
		public TerminalNode RESULT(int i) {
			return getToken(WasmLanguageParser.RESULT, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Call_instr_results_instrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Call_instr_results_instrContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_call_instr_results_instr; }
	}

	public final Call_instr_results_instrContext call_instr_results_instr(Stack<WasmStatementNode> body) throws RecognitionException {
		Call_instr_results_instrContext _localctx = new Call_instr_results_instrContext(_ctx, getState(), body);
		enterRule(_localctx, 56, RULE_call_instr_results_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(458);
				match(LPAR);
				setState(459);
				match(RESULT);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(460);
					value_type();
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				match(RPAR);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			((Call_instr_results_instrContext)_localctx).instr = instr(body);
			 ((Call_instr_results_instrContext)_localctx).result =  ((Call_instr_results_instrContext)_localctx).instr.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_instrContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Token l;
		public Bind_varContext bv1;
		public BlockContext block;
		public Bind_varContext bv2;
		public Instr_listContext res;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(WasmLanguageParser.END, 0); }
		public TerminalNode BLOCK() { return getToken(WasmLanguageParser.BLOCK, 0); }
		public TerminalNode LOOP() { return getToken(WasmLanguageParser.LOOP, 0); }
		public List<Bind_varContext> bind_var() {
			return getRuleContexts(Bind_varContext.class);
		}
		public Bind_varContext bind_var(int i) {
			return getRuleContext(Bind_varContext.class,i);
		}
		public TerminalNode IF() { return getToken(WasmLanguageParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(WasmLanguageParser.ELSE, 0); }
		public Instr_listContext instr_list() {
			return getRuleContext(Instr_listContext.class,0);
		}
		public Block_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_instr; }
	}

	public final Block_instrContext block_instr() throws RecognitionException {
		Block_instrContext _localctx = new Block_instrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block_instr);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				((Block_instrContext)_localctx).l = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BLOCK || _la==LOOP) ) {
					((Block_instrContext)_localctx).l = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(476);
					((Block_instrContext)_localctx).bv1 = bind_var();
					}
				}

				 if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("block") == 0 && (((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null), "block has label at beginning"); } 
				setState(480);
				((Block_instrContext)_localctx).block = block();
				setState(481);
				match(END);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(482);
					((Block_instrContext)_localctx).bv2 = bind_var();
					}
				}

				 else if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("loop") == 0 && (((Block_instrContext)_localctx).bv2!=null?(((Block_instrContext)_localctx).bv2.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv2!=null?(((Block_instrContext)_localctx).bv2.start):null), "loop has label at end"); }
				                                          else { ((Block_instrContext)_localctx).result =  ((Block_instrContext)_localctx).block.result; } 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(IF);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(488);
					bind_var();
					}
				}

				setState(491);
				block();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					 factory.startBlock();
					                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
					setState(493);
					match(ELSE);
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(494);
						bind_var();
						}
					}

					setState(497);
					((Block_instrContext)_localctx).res = instr_list(body);
					}
				}

				setState(500);
				match(END);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(501);
					bind_var();
					}
				}

				 ((Block_instrContext)_localctx).result =  factory.finishBlock(new ArrayList(((Block_instrContext)_localctx).res.result), (((Block_instrContext)_localctx).res!=null?(((Block_instrContext)_localctx).res.start):null).getStartIndex(), (((Block_instrContext)_localctx).res!=null?(((Block_instrContext)_localctx).res.stop):null).getStopIndex() - (((Block_instrContext)_localctx).res!=null?(((Block_instrContext)_localctx).res.start):null).getStartIndex() + 1); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_typeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode RESULT() { return getToken(WasmLanguageParser.RESULT, 0); }
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Block_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_type; }
	}

	public final Block_typeContext block_type() throws RecognitionException {
		Block_typeContext _localctx = new Block_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(LPAR);
			setState(509);
			match(RESULT);
			setState(510);
			value_type();
			setState(511);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Block_typeContext t;
		public Instr_listContext res;
		public Instr_listContext instr_list() {
			return getRuleContext(Instr_listContext.class,0);
		}
		public Block_typeContext block_type() {
			return getRuleContext(Block_typeContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(514);
				((BlockContext)_localctx).t = block_type();
				}
			}

			setState(517);
			((BlockContext)_localctx).res = instr_list(body);
			 if ((((BlockContext)_localctx).t!=null?(((BlockContext)_localctx).t.start):null) != null) {}
			                                                          ((BlockContext)_localctx).result =  factory.finishBlock(new ArrayList(((BlockContext)_localctx).res.result), (((BlockContext)_localctx).res!=null?(((BlockContext)_localctx).res.start):null).getStartIndex(), (((BlockContext)_localctx).res!=null?(((BlockContext)_localctx).res.stop):null).getStopIndex() - (((BlockContext)_localctx).res!=null?(((BlockContext)_localctx).res.start):null).getStartIndex() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_listContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public Stack<WasmStatementNode> result;
		public InstrContext instr;
		public Call_instrContext call_instr;
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Call_instrContext call_instr() {
			return getRuleContext(Call_instrContext.class,0);
		}
		public Instr_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Instr_listContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_instr_list; }
	}

	public final Instr_listContext instr_list(Stack<WasmStatementNode> body) throws RecognitionException {
		Instr_listContext _localctx = new Instr_listContext(_ctx, getState(), body);
		enterRule(_localctx, 64, RULE_instr_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					((Instr_listContext)_localctx).instr = instr(body);
					 body.push(((Instr_listContext)_localctx).instr.result); 
					}
					} 
				}
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CALL_INDIRECT) {
				{
				setState(528);
				((Instr_listContext)_localctx).call_instr = call_instr(body);
				}
			}

			 if ((((Instr_listContext)_localctx).call_instr!=null?(((Instr_listContext)_localctx).call_instr.start):null) != null) body.push(((Instr_listContext)_localctx).call_instr.result); 
			 ((Instr_listContext)_localctx).result =  body; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_exprContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Instr_listContext res;
		public Instr_listContext instr_list() {
			return getRuleContext(Instr_listContext.class,0);
		}
		public Const_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_expr; }
	}

	public final Const_exprContext const_expr() throws RecognitionException {
		Const_exprContext _localctx = new Const_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_const_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(535);
			((Const_exprContext)_localctx).res = instr_list(body);
			 ((Const_exprContext)_localctx).result =  (WasmExpressionNode) body.pop();
			                                                  factory.finishBlock(new ArrayList(((Const_exprContext)_localctx).res.result), (((Const_exprContext)_localctx).res!=null?(((Const_exprContext)_localctx).res.start):null).getStartIndex(), (((Const_exprContext)_localctx).res!=null?(((Const_exprContext)_localctx).res.stop):null).getStopIndex() - (((Const_exprContext)_localctx).res!=null?(((Const_exprContext)_localctx).res.start):null).getStartIndex() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public Token LPAR;
		public Bind_varContext bind_var;
		public Func_fieldsContext func_fields;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode FUNC() { return getToken(WasmLanguageParser.FUNC, 0); }
		public Func_fieldsContext func_fields() {
			return getRuleContext(Func_fieldsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(539);
			match(FUNC);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(540);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(544);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(546);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_fieldsContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Func_fields_bodyContext func_fields_body;
		public Func_fields_importContext func_fields_import;
		public Func_fieldsContext func_fields;
		public Func_fields_bodyContext func_fields_body() {
			return getRuleContext(Func_fields_bodyContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Inline_importContext inline_import() {
			return getRuleContext(Inline_importContext.class,0);
		}
		public Func_fields_importContext func_fields_import() {
			return getRuleContext(Func_fields_importContext.class,0);
		}
		public Inline_exportContext inline_export() {
			return getRuleContext(Inline_exportContext.class,0);
		}
		public Func_fieldsContext func_fields() {
			return getRuleContext(Func_fieldsContext.class,0);
		}
		public Func_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields; }
	}

	public final Func_fieldsContext func_fields() throws RecognitionException {
		Func_fieldsContext _localctx = new Func_fieldsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_func_fields);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(548);
					type_use();
					}
					break;
				}
				setState(551);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				inline_import();
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(555);
					type_use();
					}
					break;
				}
				setState(558);
				((Func_fieldsContext)_localctx).func_fields_import = func_fields_import();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_import.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				inline_export();
				setState(562);
				((Func_fieldsContext)_localctx).func_fields = func_fields();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields.result; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_fields_importContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Func_fields_import_resultContext func_fields_import_result;
		public Func_fields_import_resultContext func_fields_import_result() {
			return getRuleContext(Func_fields_import_resultContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode PARAM() { return getToken(WasmLanguageParser.PARAM, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Func_fields_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields_import; }
	}

	public final Func_fields_importContext func_fields_import() throws RecognitionException {
		Func_fields_importContext _localctx = new Func_fields_importContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_func_fields_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(567);
				match(LPAR);
				setState(568);
				match(PARAM);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(569);
					value_type();
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(576);
				match(LPAR);
				setState(577);
				match(PARAM);
				setState(578);
				bind_var();
				setState(579);
				value_type();
				setState(580);
				match(RPAR);
				}
				break;
			}
			setState(584);
			((Func_fields_importContext)_localctx).func_fields_import_result = func_fields_import_result();
			 ((Func_fields_importContext)_localctx).result =  ((Func_fields_importContext)_localctx).func_fields_import_result.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_fields_import_resultContext extends ParserRuleContext {
		public WasmStatementNode result;
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> RESULT() { return getTokens(WasmLanguageParser.RESULT); }
		public TerminalNode RESULT(int i) {
			return getToken(WasmLanguageParser.RESULT, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Func_fields_import_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields_import_result; }
	}

	public final Func_fields_import_resultContext func_fields_import_result() throws RecognitionException {
		Func_fields_import_resultContext _localctx = new Func_fields_import_resultContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_func_fields_import_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(587);
				match(LPAR);
				setState(588);
				match(RESULT);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(589);
					value_type();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(RPAR);
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_fields_bodyContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Token VAR;
		public Func_result_bodyContext func_result_body;
		public Func_result_bodyContext func_result_body() {
			return getRuleContext(Func_result_bodyContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> PARAM() { return getTokens(WasmLanguageParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(WasmLanguageParser.PARAM, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<TerminalNode> VAR() { return getTokens(WasmLanguageParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(WasmLanguageParser.VAR, i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Func_fields_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields_body; }
	}

	public final Func_fields_bodyContext func_fields_body() throws RecognitionException {
		Func_fields_bodyContext _localctx = new Func_fields_bodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_func_fields_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(601);
						match(LPAR);
						setState(602);
						match(PARAM);
						setState(606);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(603);
							value_type();
							}
							}
							setState(608);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						 factory.addFormalParameter(null); 
						setState(610);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(611);
						match(LPAR);
						setState(612);
						match(PARAM);
						setState(613);
						((Func_fields_bodyContext)_localctx).VAR = match(VAR);
						setState(614);
						value_type();
						setState(615);
						match(RPAR);
						 factory.addFormalParameter(((Func_fields_bodyContext)_localctx).VAR); 
						}
						break;
					}
					} 
				}
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(623);
			((Func_fields_bodyContext)_localctx).func_result_body = func_result_body();
			 ((Func_fields_bodyContext)_localctx).result =  ((Func_fields_bodyContext)_localctx).func_result_body.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_result_bodyContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Func_bodyContext func_body;
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode RESULT() { return getToken(WasmLanguageParser.RESULT, 0); }
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Func_result_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_result_body; }
	}

	public final Func_result_bodyContext func_result_body() throws RecognitionException {
		Func_result_bodyContext _localctx = new Func_result_bodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_func_result_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(626);
				match(LPAR);
				setState(627);
				match(RESULT);
				setState(628);
				value_type();
				setState(629);
				match(RPAR);
				}
				break;
			}
			setState(633);
			((Func_result_bodyContext)_localctx).func_body = func_body();
			 ((Func_result_bodyContext)_localctx).result =  ((Func_result_bodyContext)_localctx).func_body.result; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_bodyContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Token LOCAL;
		public Value_typeContext value_type;
		public Bind_varContext bind_var;
		public Instr_listContext res;
		public Instr_listContext instr_list() {
			return getRuleContext(Instr_listContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public List<TerminalNode> LOCAL() { return getTokens(WasmLanguageParser.LOCAL); }
		public TerminalNode LOCAL(int i) {
			return getToken(WasmLanguageParser.LOCAL, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<Bind_varContext> bind_var() {
			return getRuleContexts(Bind_varContext.class);
		}
		public Bind_varContext bind_var(int i) {
			return getRuleContext(Bind_varContext.class,i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(637);
					match(LPAR);
					setState(638);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(639);
						((Func_bodyContext)_localctx).value_type = value_type();
						}
						}
						setState(644);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, null, (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					setState(646);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(647);
					match(LPAR);
					setState(648);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(649);
					((Func_bodyContext)_localctx).bind_var = bind_var();
					setState(650);
					((Func_bodyContext)_localctx).value_type = value_type();
					setState(651);
					match(RPAR);
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, (((Func_bodyContext)_localctx).bind_var!=null?(((Func_bodyContext)_localctx).bind_var.start):null), (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					}
					break;
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659);
			((Func_bodyContext)_localctx).res = instr_list(body);
			 ((Func_bodyContext)_localctx).result =  factory.finishBlock(new ArrayList(((Func_bodyContext)_localctx).res.result), (((Func_bodyContext)_localctx).res!=null?(((Func_bodyContext)_localctx).res.start):null).getStartIndex(), (((Func_bodyContext)_localctx).res!=null?(((Func_bodyContext)_localctx).res.stop):null).getStopIndex() - (((Func_bodyContext)_localctx).res!=null?(((Func_bodyContext)_localctx).res.start):null).getStartIndex() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode OFFSET() { return getToken(WasmLanguageParser.OFFSET, 0); }
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(LPAR);
			setState(663);
			match(OFFSET);
			setState(664);
			const_expr();
			setState(665);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode ELEM() { return getToken(WasmLanguageParser.ELEM, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(LPAR);
			setState(668);
			match(ELEM);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(669);
				var();
				}
			}

			setState(672);
			offset();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(673);
				var();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode TABLE() { return getToken(WasmLanguageParser.TABLE, 0); }
		public Table_fieldsContext table_fields() {
			return getRuleContext(Table_fieldsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(LPAR);
			setState(682);
			match(TABLE);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(683);
				bind_var();
				}
			}

			setState(686);
			table_fields();
			setState(687);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_fieldsContext extends ParserRuleContext {
		public Table_typeContext table_type() {
			return getRuleContext(Table_typeContext.class,0);
		}
		public Inline_importContext inline_import() {
			return getRuleContext(Inline_importContext.class,0);
		}
		public Inline_exportContext inline_export() {
			return getRuleContext(Inline_exportContext.class,0);
		}
		public Table_fieldsContext table_fields() {
			return getRuleContext(Table_fieldsContext.class,0);
		}
		public Elem_typeContext elem_type() {
			return getRuleContext(Elem_typeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode ELEM() { return getToken(WasmLanguageParser.ELEM, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Table_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_fields; }
	}

	public final Table_fieldsContext table_fields() throws RecognitionException {
		Table_fieldsContext _localctx = new Table_fieldsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_table_fields);
		int _la;
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				table_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				inline_import();
				setState(691);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				inline_export();
				setState(694);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
				elem_type();
				setState(697);
				match(LPAR);
				setState(698);
				match(ELEM);
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(699);
					var();
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(705);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode DATA() { return getToken(WasmLanguageParser.DATA, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(WasmLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(WasmLanguageParser.STRING, i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(LPAR);
			setState(710);
			match(DATA);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(711);
				var();
				}
			}

			setState(714);
			offset();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(715);
				match(STRING);
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemoryContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Token MEMORY;
		public Bind_varContext bind_var;
		public Memory_fieldsContext memory_fields;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode MEMORY() { return getToken(WasmLanguageParser.MEMORY, 0); }
		public Memory_fieldsContext memory_fields() {
			return getRuleContext(Memory_fieldsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public MemoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory; }
	}

	public final MemoryContext memory() throws RecognitionException {
		MemoryContext _localctx = new MemoryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(LPAR);
			setState(724);
			((MemoryContext)_localctx).MEMORY = match(MEMORY);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(725);
				((MemoryContext)_localctx).bind_var = bind_var();
				}
			}

			setState(728);
			((MemoryContext)_localctx).memory_fields = memory_fields();
			setState(729);
			match(RPAR);
			 ((MemoryContext)_localctx).result =  factory.createMemory(((MemoryContext)_localctx).MEMORY, (((MemoryContext)_localctx).bind_var!=null?(((MemoryContext)_localctx).bind_var.start):null), ((MemoryContext)_localctx).memory_fields.result, -1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Memory_fieldsContext extends ParserRuleContext {
		public Integer result;
		public Memory_typeContext memory_type;
		public Memory_typeContext memory_type() {
			return getRuleContext(Memory_typeContext.class,0);
		}
		public Inline_importContext inline_import() {
			return getRuleContext(Inline_importContext.class,0);
		}
		public Inline_exportContext inline_export() {
			return getRuleContext(Inline_exportContext.class,0);
		}
		public Memory_fieldsContext memory_fields() {
			return getRuleContext(Memory_fieldsContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode DATA() { return getToken(WasmLanguageParser.DATA, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(WasmLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(WasmLanguageParser.STRING, i);
		}
		public Memory_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_fields; }
	}

	public final Memory_fieldsContext memory_fields() throws RecognitionException {
		Memory_fieldsContext _localctx = new Memory_fieldsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_memory_fields);
		int _la;
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				((Memory_fieldsContext)_localctx).memory_type = memory_type();
				 ((Memory_fieldsContext)_localctx).result =  ((Memory_fieldsContext)_localctx).memory_type.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				inline_import();
				setState(736);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				inline_export();
				setState(739);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				match(LPAR);
				setState(742);
				match(DATA);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(743);
					match(STRING);
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SglobalContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Token GLOBAL;
		public Bind_varContext bind_var;
		public Global_fieldsContext global_fields;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode GLOBAL() { return getToken(WasmLanguageParser.GLOBAL, 0); }
		public Global_fieldsContext global_fields() {
			return getRuleContext(Global_fieldsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public SglobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sglobal; }
	}

	public final SglobalContext sglobal() throws RecognitionException {
		SglobalContext _localctx = new SglobalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sglobal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(LPAR);
			setState(753);
			((SglobalContext)_localctx).GLOBAL = match(GLOBAL);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(754);
				((SglobalContext)_localctx).bind_var = bind_var();
				}
			}

			setState(757);
			((SglobalContext)_localctx).global_fields = global_fields();
			setState(758);
			match(RPAR);
			 if ((((SglobalContext)_localctx).bind_var!=null?(((SglobalContext)_localctx).bind_var.start):null) == null) ((SglobalContext)_localctx).result =  factory.createGlobal(((SglobalContext)_localctx).GLOBAL, null, (WasmExpressionNode) ((SglobalContext)_localctx).global_fields.result_val, ((SglobalContext)_localctx).global_fields.result_mut);
			                                                      else ((SglobalContext)_localctx).result =  factory.createGlobal(((SglobalContext)_localctx).GLOBAL, (((SglobalContext)_localctx).bind_var!=null?(((SglobalContext)_localctx).bind_var.start):null), (WasmExpressionNode) ((SglobalContext)_localctx).global_fields.result_val, ((SglobalContext)_localctx).global_fields.result_mut); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_fieldsContext extends ParserRuleContext {
		public WasmStatementNode result_val;
		public boolean result_mut;
		public Global_typeContext global_type;
		public Const_exprContext const_expr;
		public Global_typeContext global_type() {
			return getRuleContext(Global_typeContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Inline_importContext inline_import() {
			return getRuleContext(Inline_importContext.class,0);
		}
		public Inline_exportContext inline_export() {
			return getRuleContext(Inline_exportContext.class,0);
		}
		public Global_fieldsContext global_fields() {
			return getRuleContext(Global_fieldsContext.class,0);
		}
		public Global_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_fields; }
	}

	public final Global_fieldsContext global_fields() throws RecognitionException {
		Global_fieldsContext _localctx = new Global_fieldsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_global_fields);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				((Global_fieldsContext)_localctx).global_type = global_type();
				setState(762);
				((Global_fieldsContext)_localctx).const_expr = const_expr();
				 ((Global_fieldsContext)_localctx).result_val =  ((Global_fieldsContext)_localctx).const_expr.result;
				                                                      ((Global_fieldsContext)_localctx).result_mut =  ((Global_fieldsContext)_localctx).global_type.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				inline_import();
				setState(766);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				inline_export();
				setState(769);
				global_fields();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_descContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode FUNC() { return getToken(WasmLanguageParser.FUNC, 0); }
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public Func_typeContext func_type() {
			return getRuleContext(Func_typeContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(WasmLanguageParser.TABLE, 0); }
		public Table_typeContext table_type() {
			return getRuleContext(Table_typeContext.class,0);
		}
		public TerminalNode MEMORY() { return getToken(WasmLanguageParser.MEMORY, 0); }
		public Memory_typeContext memory_type() {
			return getRuleContext(Memory_typeContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(WasmLanguageParser.GLOBAL, 0); }
		public Global_typeContext global_type() {
			return getRuleContext(Global_typeContext.class,0);
		}
		public Import_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_desc; }
	}

	public final Import_descContext import_desc() throws RecognitionException {
		Import_descContext _localctx = new Import_descContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_import_desc);
		int _la;
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(LPAR);
				setState(774);
				match(FUNC);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(775);
					bind_var();
					}
				}

				setState(778);
				type_use();
				setState(779);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(LPAR);
				setState(782);
				match(FUNC);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(783);
					bind_var();
					}
				}

				setState(786);
				func_type();
				setState(787);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				match(LPAR);
				setState(790);
				match(TABLE);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(791);
					bind_var();
					}
				}

				setState(794);
				table_type();
				setState(795);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				match(LPAR);
				setState(798);
				match(MEMORY);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(799);
					bind_var();
					}
				}

				setState(802);
				memory_type();
				setState(803);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				match(LPAR);
				setState(806);
				match(GLOBAL);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(807);
					bind_var();
					}
				}

				setState(810);
				global_type();
				setState(811);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimportContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode IMPORT() { return getToken(WasmLanguageParser.IMPORT, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Import_descContext import_desc() {
			return getRuleContext(Import_descContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public SimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simport; }
	}

	public final SimportContext simport() throws RecognitionException {
		SimportContext _localctx = new SimportContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_simport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(LPAR);
			setState(816);
			match(IMPORT);
			setState(817);
			name();
			setState(818);
			name();
			setState(819);
			import_desc();
			setState(820);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_importContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode IMPORT() { return getToken(WasmLanguageParser.IMPORT, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Inline_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_import; }
	}

	public final Inline_importContext inline_import() throws RecognitionException {
		Inline_importContext _localctx = new Inline_importContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_inline_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(LPAR);
			setState(823);
			match(IMPORT);
			setState(824);
			name();
			setState(825);
			name();
			setState(826);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Export_descContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode FUNC() { return getToken(WasmLanguageParser.FUNC, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode TABLE() { return getToken(WasmLanguageParser.TABLE, 0); }
		public TerminalNode MEMORY() { return getToken(WasmLanguageParser.MEMORY, 0); }
		public TerminalNode GLOBAL() { return getToken(WasmLanguageParser.GLOBAL, 0); }
		public Export_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_desc; }
	}

	public final Export_descContext export_desc() throws RecognitionException {
		Export_descContext _localctx = new Export_descContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_export_desc);
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(LPAR);
				setState(829);
				match(FUNC);
				setState(830);
				var();
				setState(831);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				match(LPAR);
				setState(834);
				match(TABLE);
				setState(835);
				var();
				setState(836);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(838);
				match(LPAR);
				setState(839);
				match(MEMORY);
				setState(840);
				var();
				setState(841);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				match(LPAR);
				setState(844);
				match(GLOBAL);
				setState(845);
				var();
				setState(846);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode EXPORT() { return getToken(WasmLanguageParser.EXPORT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Export_descContext export_desc() {
			return getRuleContext(Export_descContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(LPAR);
			setState(851);
			match(EXPORT);
			setState(852);
			name();
			setState(853);
			export_desc();
			setState(854);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_exportContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode EXPORT() { return getToken(WasmLanguageParser.EXPORT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Inline_exportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_export; }
	}

	public final Inline_exportContext inline_export() throws RecognitionException {
		Inline_exportContext _localctx = new Inline_exportContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_inline_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(LPAR);
			setState(857);
			match(EXPORT);
			setState(858);
			name();
			setState(859);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public Def_typeContext def_type() {
			return getRuleContext(Def_typeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			def_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode TYPE() { return getToken(WasmLanguageParser.TYPE, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(LPAR);
			setState(864);
			match(TYPE);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(865);
				bind_var();
				}
			}

			setState(868);
			type_();
			setState(869);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode START() { return getToken(WasmLanguageParser.START, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(LPAR);
			setState(872);
			match(START);
			setState(873);
			var();
			setState(874);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_fieldContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public SglobalContext sglobal() {
			return getRuleContext(SglobalContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ElemContext elem() {
			return getRuleContext(ElemContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public SimportContext simport() {
			return getRuleContext(SimportContext.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public Module_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_field; }
	}

	public final Module_fieldContext module_field() throws RecognitionException {
		Module_fieldContext _localctx = new Module_fieldContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_module_field);
		try {
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(881);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(882);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(883);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(884);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(885);
				export();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_Context extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode MODULE() { return getToken(WasmLanguageParser.MODULE, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public List<Module_fieldContext> module_field() {
			return getRuleContexts(Module_fieldContext.class);
		}
		public Module_fieldContext module_field(int i) {
			return getRuleContext(Module_fieldContext.class,i);
		}
		public Module_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_; }
	}

	public final Module_Context module_() throws RecognitionException {
		Module_Context _localctx = new Module_Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_module_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(LPAR);
			setState(889);
			match(MODULE);
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(890);
				match(VAR);
				}
			}

			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(893);
				module_field();
				}
				}
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(899);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Script_moduleContext extends ParserRuleContext {
		public Module_Context module_() {
			return getRuleContext(Module_Context.class,0);
		}
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode MODULE() { return getToken(WasmLanguageParser.MODULE, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode BIN() { return getToken(WasmLanguageParser.BIN, 0); }
		public TerminalNode QUOTE() { return getToken(WasmLanguageParser.QUOTE, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(WasmLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(WasmLanguageParser.STRING, i);
		}
		public Script_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script_module; }
	}

	public final Script_moduleContext script_module() throws RecognitionException {
		Script_moduleContext _localctx = new Script_moduleContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_script_module);
		int _la;
		try {
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(LPAR);
				setState(903);
				match(MODULE);
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(904);
					match(VAR);
					}
				}

				setState(907);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(908);
					match(STRING);
					}
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(914);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode INVOKE() { return getToken(WasmLanguageParser.INVOKE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Const_listContext const_list() {
			return getRuleContext(Const_listContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public TerminalNode GET() { return getToken(WasmLanguageParser.GET, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_action);
		int _la;
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(LPAR);
				setState(918);
				match(INVOKE);
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(919);
					match(VAR);
					}
				}

				setState(922);
				name();
				setState(923);
				const_list();
				setState(924);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(LPAR);
				setState(927);
				match(GET);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(928);
					match(VAR);
					}
				}

				setState(931);
				name();
				setState(932);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode ASSERT_MALFORMED() { return getToken(WasmLanguageParser.ASSERT_MALFORMED, 0); }
		public Script_moduleContext script_module() {
			return getRuleContext(Script_moduleContext.class,0);
		}
		public TerminalNode STRING() { return getToken(WasmLanguageParser.STRING, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode ASSERT_INVALID() { return getToken(WasmLanguageParser.ASSERT_INVALID, 0); }
		public TerminalNode ASSERT_UNLINKABLE() { return getToken(WasmLanguageParser.ASSERT_UNLINKABLE, 0); }
		public TerminalNode ASSERT_TRAP() { return getToken(WasmLanguageParser.ASSERT_TRAP, 0); }
		public TerminalNode ASSERT_RETURN() { return getToken(WasmLanguageParser.ASSERT_RETURN, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public Const_listContext const_list() {
			return getRuleContext(Const_listContext.class,0);
		}
		public TerminalNode ASSERT_RETURN_CANONICAL_NAN() { return getToken(WasmLanguageParser.ASSERT_RETURN_CANONICAL_NAN, 0); }
		public TerminalNode ASSERT_RETURN_ARITHMETIC_NAN() { return getToken(WasmLanguageParser.ASSERT_RETURN_ARITHMETIC_NAN, 0); }
		public TerminalNode ASSERT_EXHAUSTION() { return getToken(WasmLanguageParser.ASSERT_EXHAUSTION, 0); }
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assertion);
		try {
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				match(LPAR);
				setState(937);
				match(ASSERT_MALFORMED);
				setState(938);
				script_module();
				setState(939);
				match(STRING);
				setState(940);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(LPAR);
				setState(943);
				match(ASSERT_INVALID);
				setState(944);
				script_module();
				setState(945);
				match(STRING);
				setState(946);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(948);
				match(LPAR);
				setState(949);
				match(ASSERT_UNLINKABLE);
				setState(950);
				script_module();
				setState(951);
				match(STRING);
				setState(952);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(954);
				match(LPAR);
				setState(955);
				match(ASSERT_TRAP);
				setState(956);
				script_module();
				setState(957);
				match(STRING);
				setState(958);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(960);
				match(LPAR);
				setState(961);
				match(ASSERT_RETURN);
				setState(962);
				action();
				setState(963);
				const_list();
				setState(964);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(966);
				match(LPAR);
				setState(967);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(968);
				action();
				setState(969);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(971);
				match(LPAR);
				setState(972);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(973);
				action();
				setState(974);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(976);
				match(LPAR);
				setState(977);
				match(ASSERT_TRAP);
				setState(978);
				action();
				setState(979);
				match(STRING);
				setState(980);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(982);
				match(LPAR);
				setState(983);
				match(ASSERT_EXHAUSTION);
				setState(984);
				action();
				setState(985);
				match(STRING);
				setState(986);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public Script_moduleContext script_module() {
			return getRuleContext(Script_moduleContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode REGISTER() { return getToken(WasmLanguageParser.REGISTER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public MetaContext meta() {
			return getRuleContext(MetaContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cmd);
		int _la;
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(993);
				match(LPAR);
				setState(994);
				match(REGISTER);
				setState(995);
				name();
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(996);
					match(VAR);
					}
				}

				setState(999);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1001);
				meta();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetaContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode SCRIPT() { return getToken(WasmLanguageParser.SCRIPT, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode INPUT() { return getToken(WasmLanguageParser.INPUT, 0); }
		public TerminalNode STRING() { return getToken(WasmLanguageParser.STRING, 0); }
		public TerminalNode OUTPUT() { return getToken(WasmLanguageParser.OUTPUT, 0); }
		public MetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta; }
	}

	public final MetaContext meta() throws RecognitionException {
		MetaContext _localctx = new MetaContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_meta);
		int _la;
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(LPAR);
				setState(1005);
				match(SCRIPT);
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1006);
					match(VAR);
					}
				}

				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1009);
					cmd();
					}
					}
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1015);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				match(LPAR);
				setState(1017);
				match(INPUT);
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1018);
					match(VAR);
					}
				}

				setState(1021);
				match(STRING);
				setState(1022);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				match(LPAR);
				setState(1024);
				match(OUTPUT);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1025);
					match(VAR);
					}
				}

				setState(1028);
				match(STRING);
				setState(1029);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				match(LPAR);
				setState(1031);
				match(OUTPUT);
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1032);
					match(VAR);
					}
				}

				setState(1035);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WconstContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode CONST() { return getToken(WasmLanguageParser.CONST, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public WconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wconst; }
	}

	public final WconstContext wconst() throws RecognitionException {
		WconstContext _localctx = new WconstContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_wconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(LPAR);
			setState(1039);
			match(CONST);
			setState(1040);
			literal();
			setState(1041);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_listContext extends ParserRuleContext {
		public List<WconstContext> wconst() {
			return getRuleContexts(WconstContext.class);
		}
		public WconstContext wconst(int i) {
			return getRuleContext(WconstContext.class,i);
		}
		public Const_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_list; }
	}

	public final Const_listContext const_list() throws RecognitionException {
		Const_listContext _localctx = new Const_listContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(1043);
				wconst();
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WasmLanguageParser.EOF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<Module_fieldContext> module_field() {
			return getRuleContexts(Module_fieldContext.class);
		}
		public Module_fieldContext module_field(int i) {
			return getRuleContext(Module_fieldContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_script);
		int _la;
		try {
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1049);
					cmd();
					}
					}
					setState(1054);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1055);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1056);
					module_field();
					}
					}
					setState(1059); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(1061);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public Module_Context module_() {
			return getRuleContext(Module_Context.class,0);
		}
		public TerminalNode EOF() { return getToken(WasmLanguageParser.EOF, 0); }
		public List<Module_fieldContext> module_field() {
			return getRuleContexts(Module_fieldContext.class);
		}
		public Module_fieldContext module_field(int i) {
			return getRuleContext(Module_fieldContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_module);
		int _la;
		try {
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				module_();
				setState(1066);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1068);
					module_field();
					}
					}
					setState(1073);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1074);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0438\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3\3\5\3\u009b\n\3\3\4"+
		"\3\4\5\4\u009f\n\4\3\5\3\5\3\5\5\5\u00a4\n\5\3\5\7\5\u00a7\n\5\f\5\16"+
		"\5\u00aa\13\5\3\5\3\5\3\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\3\6\3\7\5"+
		"\7\u00b8\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00c1\n\b\f\b\16\b\u00c4"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cf\n\b\f\b\16\b\u00d2"+
		"\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00de\n\t\3\t\3\t\7"+
		"\t\u00e2\n\t\f\t\16\t\u00e5\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fa\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0104\n\21\f\21\16\21\u0107\13"+
		"\21\3\21\3\21\7\21\u010b\n\21\f\21\16\21\u010e\13\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0114\n\21\3\21\7\21\u0117\n\21\f\21\16\21\u011a\13\21\3\22\3"+
		"\22\5\22\u011e\n\22\3\22\3\22\3\23\3\23\5\23\u0124\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u013c\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u014e\n\31\r\31"+
		"\16\31\u014f\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0170\n\31\3\31\5\31\u0173\n\31\3\31\3\31"+
		"\3\31\5\31\u0178\n\31\3\31\5\31\u017b\n\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u0190\n\31\3\32\3\32\5\32\u0194\n\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\7\33\u019c\n\33\f\33\16\33\u019f\13\33\3\33\7\33\u01a2\n\33\f\33\16\33"+
		"\u01a5\13\33\3\33\3\33\3\33\7\33\u01aa\n\33\f\33\16\33\u01ad\13\33\3\33"+
		"\7\33\u01b0\n\33\f\33\16\33\u01b3\13\33\3\34\3\34\5\34\u01b7\n\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\7\35\u01bf\n\35\f\35\16\35\u01c2\13\35\3\35"+
		"\7\35\u01c5\n\35\f\35\16\35\u01c8\13\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\7\36\u01d0\n\36\f\36\16\36\u01d3\13\36\3\36\7\36\u01d6\n\36\f\36\16\36"+
		"\u01d9\13\36\3\36\3\36\3\36\3\37\3\37\5\37\u01e0\n\37\3\37\3\37\3\37\3"+
		"\37\5\37\u01e6\n\37\3\37\3\37\3\37\3\37\5\37\u01ec\n\37\3\37\3\37\3\37"+
		"\3\37\5\37\u01f2\n\37\3\37\5\37\u01f5\n\37\3\37\3\37\5\37\u01f9\n\37\3"+
		"\37\3\37\5\37\u01fd\n\37\3 \3 \3 \3 \3 \3!\3!\5!\u0206\n!\3!\3!\3!\3\""+
		"\3\"\3\"\7\"\u020e\n\"\f\"\16\"\u0211\13\"\3\"\5\"\u0214\n\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3$\3$\3$\5$\u0220\n$\3$\3$\3$\3$\3$\3%\5%\u0228\n%\3%\3"+
		"%\3%\3%\3%\5%\u022f\n%\3%\3%\3%\3%\3%\3%\3%\5%\u0238\n%\3&\3&\3&\7&\u023d"+
		"\n&\f&\16&\u0240\13&\3&\3&\3&\3&\3&\3&\3&\5&\u0249\n&\3&\3&\3&\3\'\3\'"+
		"\3\'\7\'\u0251\n\'\f\'\16\'\u0254\13\'\3\'\7\'\u0257\n\'\f\'\16\'\u025a"+
		"\13\'\3(\3(\3(\7(\u025f\n(\f(\16(\u0262\13(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\7(\u026d\n(\f(\16(\u0270\13(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u027a\n)\3)"+
		"\3)\3)\3*\3*\3*\3*\7*\u0283\n*\f*\16*\u0286\13*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\7*\u0291\n*\f*\16*\u0294\13*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\5,"+
		"\u02a1\n,\3,\3,\7,\u02a5\n,\f,\16,\u02a8\13,\3,\3,\3-\3-\3-\5-\u02af\n"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u02bf\n.\f.\16.\u02c2\13"+
		".\3.\3.\5.\u02c6\n.\3/\3/\3/\5/\u02cb\n/\3/\3/\7/\u02cf\n/\f/\16/\u02d2"+
		"\13/\3/\3/\3\60\3\60\3\60\5\60\u02d9\n\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u02eb\n\61\f\61"+
		"\16\61\u02ee\13\61\3\61\5\61\u02f1\n\61\3\62\3\62\3\62\5\62\u02f6\n\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u0306\n\63\3\64\3\64\3\64\5\64\u030b\n\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\5\64\u0313\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u031b\n\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0323\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u032b\n\64\3\64\3\64\3\64\5\64\u0330\n\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u0353\n\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3;\3;"+
		"\3;\5;\u0365\n;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\5=\u0379\n=\3>\3>\3>\5>\u037e\n>\3>\7>\u0381\n>\f>\16>\u0384\13>\3>\3"+
		">\3?\3?\3?\3?\5?\u038c\n?\3?\3?\7?\u0390\n?\f?\16?\u0393\13?\3?\5?\u0396"+
		"\n?\3@\3@\3@\5@\u039b\n@\3@\3@\3@\3@\3@\3@\3@\5@\u03a4\n@\3@\3@\3@\5@"+
		"\u03a9\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03df\nA\3B\3B\3B\3B\3B\3B\3B\5B\u03e8"+
		"\nB\3B\3B\3B\5B\u03ed\nB\3C\3C\3C\5C\u03f2\nC\3C\7C\u03f5\nC\fC\16C\u03f8"+
		"\13C\3C\3C\3C\3C\5C\u03fe\nC\3C\3C\3C\3C\3C\5C\u0405\nC\3C\3C\3C\3C\3"+
		"C\5C\u040c\nC\3C\5C\u040f\nC\3D\3D\3D\3D\3D\3E\7E\u0417\nE\fE\16E\u041a"+
		"\13E\3F\7F\u041d\nF\fF\16F\u0420\13F\3F\3F\6F\u0424\nF\rF\16F\u0425\3"+
		"F\3F\5F\u042a\nF\3G\3G\3G\3G\7G\u0430\nG\fG\16G\u0433\13G\3G\5G\u0436"+
		"\nG\3G\3\u00e3\2H\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\2\7\3\2\6\7\3\2\5\7\4\2\5\5MM\3\2\21\22\3\2=>\2\u0493\2\u008e"+
		"\3\2\2\2\4\u009a\3\2\2\2\6\u009e\3\2\2\2\b\u00a0\3\2\2\2\n\u00ad\3\2\2"+
		"\2\f\u00b7\3\2\2\2\16\u00bc\3\2\2\2\20\u00d6\3\2\2\2\22\u00e6\3\2\2\2"+
		"\24\u00e8\3\2\2\2\26\u00ea\3\2\2\2\30\u00ec\3\2\2\2\32\u00ee\3\2\2\2\34"+
		"\u00f9\3\2\2\2\36\u00fb\3\2\2\2 \u0118\3\2\2\2\"\u011b\3\2\2\2$\u0121"+
		"\3\2\2\2&\u0127\3\2\2\2(\u012c\3\2\2\2*\u012e\3\2\2\2,\u0130\3\2\2\2."+
		"\u013b\3\2\2\2\60\u018f\3\2\2\2\62\u0191\3\2\2\2\64\u01a3\3\2\2\2\66\u01b4"+
		"\3\2\2\28\u01c6\3\2\2\2:\u01d7\3\2\2\2<\u01fc\3\2\2\2>\u01fe\3\2\2\2@"+
		"\u0203\3\2\2\2B\u020f\3\2\2\2D\u0218\3\2\2\2F\u021c\3\2\2\2H\u0237\3\2"+
		"\2\2J\u0248\3\2\2\2L\u0258\3\2\2\2N\u026e\3\2\2\2P\u0279\3\2\2\2R\u027e"+
		"\3\2\2\2T\u0298\3\2\2\2V\u029d\3\2\2\2X\u02ab\3\2\2\2Z\u02c5\3\2\2\2\\"+
		"\u02c7\3\2\2\2^\u02d5\3\2\2\2`\u02f0\3\2\2\2b\u02f2\3\2\2\2d\u0305\3\2"+
		"\2\2f\u032f\3\2\2\2h\u0331\3\2\2\2j\u0338\3\2\2\2l\u0352\3\2\2\2n\u0354"+
		"\3\2\2\2p\u035a\3\2\2\2r\u035f\3\2\2\2t\u0361\3\2\2\2v\u0369\3\2\2\2x"+
		"\u0378\3\2\2\2z\u037a\3\2\2\2|\u0395\3\2\2\2~\u03a8\3\2\2\2\u0080\u03de"+
		"\3\2\2\2\u0082\u03ec\3\2\2\2\u0084\u040e\3\2\2\2\u0086\u0410\3\2\2\2\u0088"+
		"\u0418\3\2\2\2\u008a\u0429\3\2\2\2\u008c\u0435\3\2\2\2\u008e\u008f\5\4"+
		"\3\2\u008f\3\3\2\2\2\u0090\u0091\5\b\5\2\u0091\u0092\7\2\2\3\u0092\u009b"+
		"\3\2\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\7\2\2\3\u009a\u0090\3\2\2\2\u009a\u0096\3\2\2\2\u009b"+
		"\5\3\2\2\2\u009c\u009f\5\n\6\2\u009d\u009f\5t;\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\7\3\2\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a3\7<\2\2"+
		"\u00a2\u00a4\7M\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8"+
		"\3\2\2\2\u00a5\u00a7\5\6\4\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7\4\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\3\2\2\u00ae\u00b0"+
		"\7/\2\2\u00af\u00b1\5,\27\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\b\6\1\2\u00b4\u00b5\7\4"+
		"\2\2\u00b5\13\3\2\2\2\u00b6\u00b8\5&\24\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\b\7\1\2"+
		"\u00bb\r\3\2\2\2\u00bc\u00d0\b\b\1\2\u00bd\u00be\7\3\2\2\u00be\u00c2\7"+
		"\61\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\b\b\1\2\u00c6\u00cf\7\4\2\2\u00c7\u00c8\7\3\2\2\u00c8"+
		"\u00c9\7\61\2\2\u00c9\u00ca\7M\2\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\7"+
		"\4\2\2\u00cc\u00cd\b\b\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00bd\3\2\2\2\u00ce"+
		"\u00c7\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\5\20\t\2\u00d4"+
		"\u00d5\b\b\1\2\u00d5\17\3\2\2\2\u00d6\u00dd\b\t\1\2\u00d7\u00d8\7\3\2"+
		"\2\u00d8\u00d9\7\62\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\b\t\1\2\u00db"+
		"\u00dc\7\4\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\b\t\1\2\u00e0\u00e2\13\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\21\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\u008cG\2\u00e7"+
		"\23\3\2\2\2\u00e8\u00e9\t\2\2\2\u00e9\25\3\2\2\2\u00ea\u00eb\7\b\2\2\u00eb"+
		"\27\3\2\2\2\u00ec\u00ed\7\t\2\2\u00ed\31\3\2\2\2\u00ee\u00ef\7\13\2\2"+
		"\u00ef\33\3\2\2\2\u00f0\u00f1\5\30\r\2\u00f1\u00f2\b\17\1\2\u00f2\u00fa"+
		"\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\7\f\2\2\u00f5\u00f6\5\30\r\2"+
		"\u00f6\u00f7\7\4\2\2\u00f7\u00f8\b\17\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00f0"+
		"\3\2\2\2\u00f9\u00f3\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00fc\7\3\2\2\u00fc"+
		"\u00fd\7/\2\2\u00fd\u00fe\5 \21\2\u00fe\u00ff\7\4\2\2\u00ff\37\3\2\2\2"+
		"\u0100\u0113\7\3\2\2\u0101\u0105\7\62\2\2\u0102\u0104\5\30\r\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0114\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010c\7\61\2\2\u0109\u010b\5"+
		"\30\r\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u0114\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\61"+
		"\2\2\u0110\u0111\5,\27\2\u0111\u0112\5\30\r\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0101\3\2\2\2\u0113\u0108\3\2\2\2\u0113\u010f\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\7\4\2\2\u0116\u0100\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119!\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011d\7\5\2\2\u011c\u011e\7\5\2\2\u011d\u011c\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\32\16\2\u0120#\3\2\2\2\u0121"+
		"\u0123\7\5\2\2\u0122\u0124\7\5\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\23\1\2\u0126%\3\2\2\2\u0127\u0128"+
		"\7\3\2\2\u0128\u0129\7.\2\2\u0129\u012a\5*\26\2\u012a\u012b\7\4\2\2\u012b"+
		"\'\3\2\2\2\u012c\u012d\t\3\2\2\u012d)\3\2\2\2\u012e\u012f\t\4\2\2\u012f"+
		"+\3\2\2\2\u0130\u0131\7M\2\2\u0131-\3\2\2\2\u0132\u0133\5\60\31\2\u0133"+
		"\u0134\b\30\1\2\u0134\u013c\3\2\2\2\u0135\u0136\5\66\34\2\u0136\u0137"+
		"\b\30\1\2\u0137\u013c\3\2\2\2\u0138\u0139\5<\37\2\u0139\u013a\b\30\1\2"+
		"\u013a\u013c\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0138"+
		"\3\2\2\2\u013c/\3\2\2\2\u013d\u013e\7\17\2\2\u013e\u0190\b\31\1\2\u013f"+
		"\u0140\7\r\2\2\u0140\u0190\b\31\1\2\u0141\u0142\7\16\2\2\u0142\u0190\b"+
		"\31\1\2\u0143\u0144\7\20\2\2\u0144\u0190\b\31\1\2\u0145\u0146\7\33\2\2"+
		"\u0146\u0190\b\31\1\2\u0147\u0148\7\24\2\2\u0148\u0190\5*\26\2\u0149\u014a"+
		"\7\25\2\2\u014a\u0190\5*\26\2\u014b\u014d\7\26\2\2\u014c\u014e\5*\26\2"+
		"\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0190\3\2\2\2\u0151\u0152\7\27\2\2\u0152\u0190\b\31\1\2"+
		"\u0153\u0154\7\34\2\2\u0154\u0155\7M\2\2\u0155\u0190\b\31\1\2\u0156\u0157"+
		"\7\34\2\2\u0157\u0158\7\5\2\2\u0158\u0190\b\31\1\2\u0159\u015a\7\36\2"+
		"\2\u015a\u015b\5*\26\2\u015b\u015c\b\31\1\2\u015c\u0190\3\2\2\2\u015d"+
		"\u015e\7\37\2\2\u015e\u015f\5*\26\2\u015f\u0160\b\31\1\2\u0160\u0190\3"+
		"\2\2\2\u0161\u0162\7 \2\2\u0162\u0163\5*\26\2\u0163\u0164\b\31\1\2\u0164"+
		"\u0190\3\2\2\2\u0165\u0166\7!\2\2\u0166\u0167\5*\26\2\u0167\u0168\b\31"+
		"\1\2\u0168\u0190\3\2\2\2\u0169\u016a\7\"\2\2\u016a\u016b\5*\26\2\u016b"+
		"\u016c\b\31\1\2\u016c\u0190\3\2\2\2\u016d\u016f\7#\2\2\u016e\u0170\7%"+
		"\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u0173\7&\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0190\b\31\1\2\u0175\u0177\7$\2\2\u0176\u0178\7%\2\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\7&"+
		"\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u0190\b\31\1\2\u017d\u017e\7,\2\2\u017e\u0190\b\31\1\2\u017f\u0180\7"+
		"-\2\2\u0180\u0190\b\31\1\2\u0181\u0182\7\n\2\2\u0182\u0183\5(\25\2\u0183"+
		"\u0184\b\31\1\2\u0184\u0190\3\2\2\2\u0185\u0186\7)\2\2\u0186\u0190\b\31"+
		"\1\2\u0187\u0188\7*\2\2\u0188\u0190\b\31\1\2\u0189\u018a\7\'\2\2\u018a"+
		"\u0190\b\31\1\2\u018b\u018c\7(\2\2\u018c\u0190\b\31\1\2\u018d\u018e\7"+
		"+\2\2\u018e\u0190\b\31\1\2\u018f\u013d\3\2\2\2\u018f\u013f\3\2\2\2\u018f"+
		"\u0141\3\2\2\2\u018f\u0143\3\2\2\2\u018f\u0145\3\2\2\2\u018f\u0147\3\2"+
		"\2\2\u018f\u0149\3\2\2\2\u018f\u014b\3\2\2\2\u018f\u0151\3\2\2\2\u018f"+
		"\u0153\3\2\2\2\u018f\u0156\3\2\2\2\u018f\u0159\3\2\2\2\u018f\u015d\3\2"+
		"\2\2\u018f\u0161\3\2\2\2\u018f\u0165\3\2\2\2\u018f\u0169\3\2\2\2\u018f"+
		"\u016d\3\2\2\2\u018f\u0175\3\2\2\2\u018f\u017d\3\2\2\2\u018f\u017f\3\2"+
		"\2\2\u018f\u0181\3\2\2\2\u018f\u0185\3\2\2\2\u018f\u0187\3\2\2\2\u018f"+
		"\u0189\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018d\3\2\2\2\u0190\61\3\2\2"+
		"\2\u0191\u0193\7\35\2\2\u0192\u0194\5&\24\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5\64\33\2\u0196\u0197\b"+
		"\32\1\2\u0197\63\3\2\2\2\u0198\u0199\7\3\2\2\u0199\u019d\7\61\2\2\u019a"+
		"\u019c\5\30\r\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3"+
		"\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a2\7\4\2\2\u01a1\u0198\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01b1\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a7\7\3\2\2\u01a7\u01ab\7\62\2\2\u01a8\u01aa\5\30\r\2\u01a9\u01a8\3"+
		"\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\7\4\2\2\u01af\u01a6\3\2"+
		"\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\65\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\7\35\2\2\u01b5\u01b7\5&\24"+
		"\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9"+
		"\58\35\2\u01b9\u01ba\b\34\1\2\u01ba\67\3\2\2\2\u01bb\u01bc\7\3\2\2\u01bc"+
		"\u01c0\7\61\2\2\u01bd\u01bf\5\30\r\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3"+
		"\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c5\7\4\2\2\u01c4\u01bb\3\2\2\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01ca\5:\36\2\u01ca\u01cb\b\35\1\2\u01cb9\3\2\2\2"+
		"\u01cc\u01cd\7\3\2\2\u01cd\u01d1\7\62\2\2\u01ce\u01d0\5\30\r\2\u01cf\u01ce"+
		"\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\7\4\2\2\u01d5\u01cc\3\2"+
		"\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\5.\30\2\u01db\u01dc\b\36"+
		"\1\2\u01dc;\3\2\2\2\u01dd\u01df\t\5\2\2\u01de\u01e0\5,\27\2\u01df\u01de"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\b\37\1\2"+
		"\u01e2\u01e3\5@!\2\u01e3\u01e5\7\23\2\2\u01e4\u01e6\5,\27\2\u01e5\u01e4"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\b\37\1\2"+
		"\u01e8\u01fd\3\2\2\2\u01e9\u01eb\7\30\2\2\u01ea\u01ec\5,\27\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f4\5@!\2\u01ee"+
		"\u01ef\b\37\1\2\u01ef\u01f1\7\32\2\2\u01f0\u01f2\5,\27\2\u01f1\u01f0\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\5B\"\2\u01f4"+
		"\u01ee\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\7\23"+
		"\2\2\u01f7\u01f9\5,\27\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\b\37\1\2\u01fb\u01fd\3\2\2\2\u01fc\u01dd\3"+
		"\2\2\2\u01fc\u01e9\3\2\2\2\u01fd=\3\2\2\2\u01fe\u01ff\7\3\2\2\u01ff\u0200"+
		"\7\62\2\2\u0200\u0201\5\30\r\2\u0201\u0202\7\4\2\2\u0202?\3\2\2\2\u0203"+
		"\u0205\b!\1\2\u0204\u0206\5> \2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2"+
		"\2\u0206\u0207\3\2\2\2\u0207\u0208\5B\"\2\u0208\u0209\b!\1\2\u0209A\3"+
		"\2\2\2\u020a\u020b\5.\30\2\u020b\u020c\b\"\1\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020a\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\5\62\32\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\b\""+
		"\1\2\u0216\u0217\b\"\1\2\u0217C\3\2\2\2\u0218\u0219\b#\1\2\u0219\u021a"+
		"\5B\"\2\u021a\u021b\b#\1\2\u021bE\3\2\2\2\u021c\u021d\7\3\2\2\u021d\u021f"+
		"\7/\2\2\u021e\u0220\5,\27\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\b$\1\2\u0222\u0223\5H%\2\u0223\u0224\b$\1\2"+
		"\u0224\u0225\7\4\2\2\u0225G\3\2\2\2\u0226\u0228\5&\24\2\u0227\u0226\3"+
		"\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\5N(\2\u022a"+
		"\u022b\b%\1\2\u022b\u0238\3\2\2\2\u022c\u022e\5j\66\2\u022d\u022f\5&\24"+
		"\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231"+
		"\5J&\2\u0231\u0232\b%\1\2\u0232\u0238\3\2\2\2\u0233\u0234\5p9\2\u0234"+
		"\u0235\5H%\2\u0235\u0236\b%\1\2\u0236\u0238\3\2\2\2\u0237\u0227\3\2\2"+
		"\2\u0237\u022c\3\2\2\2\u0237\u0233\3\2\2\2\u0238I\3\2\2\2\u0239\u023a"+
		"\7\3\2\2\u023a\u023e\7\61\2\2\u023b\u023d\5\30\r\2\u023c\u023b\3\2\2\2"+
		"\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0249\7\4\2\2\u0242\u0243\7\3\2\2\u0243"+
		"\u0244\7\61\2\2\u0244\u0245\5,\27\2\u0245\u0246\5\30\r\2\u0246\u0247\7"+
		"\4\2\2\u0247\u0249\3\2\2\2\u0248\u0239\3\2\2\2\u0248\u0242\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\5L\'\2\u024b\u024c\b&\1\2\u024cK\3\2\2\2\u024d"+
		"\u024e\7\3\2\2\u024e\u0252\7\62\2\2\u024f\u0251\5\30\r\2\u0250\u024f\3"+
		"\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\7\4\2\2\u0256\u024d\3\2"+
		"\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"M\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7\3\2\2\u025c\u0260\7\61\2\2"+
		"\u025d\u025f\5\30\r\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2\2\2\u0263"+
		"\u0264\b(\1\2\u0264\u026d\7\4\2\2\u0265\u0266\7\3\2\2\u0266\u0267\7\61"+
		"\2\2\u0267\u0268\7M\2\2\u0268\u0269\5\30\r\2\u0269\u026a\7\4\2\2\u026a"+
		"\u026b\b(\1\2\u026b\u026d\3\2\2\2\u026c\u025b\3\2\2\2\u026c\u0265\3\2"+
		"\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\5P)\2\u0272\u0273\b(\1"+
		"\2\u0273O\3\2\2\2\u0274\u0275\7\3\2\2\u0275\u0276\7\62\2\2\u0276\u0277"+
		"\5\30\r\2\u0277\u0278\7\4\2\2\u0278\u027a\3\2\2\2\u0279\u0274\3\2\2\2"+
		"\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\5R*\2\u027c\u027d"+
		"\b)\1\2\u027dQ\3\2\2\2\u027e\u0292\b*\1\2\u027f\u0280\7\3\2\2\u0280\u0284"+
		"\7\63\2\2\u0281\u0283\5\30\r\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2\2\2"+
		"\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0287\u0288\b*\1\2\u0288\u0291\7\4\2\2\u0289\u028a\7\3\2\2\u028a"+
		"\u028b\7\63\2\2\u028b\u028c\5,\27\2\u028c\u028d\5\30\r\2\u028d\u028e\7"+
		"\4\2\2\u028e\u028f\b*\1\2\u028f\u0291\3\2\2\2\u0290\u027f\3\2\2\2\u0290"+
		"\u0289\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\5B\"\2\u0296"+
		"\u0297\b*\1\2\u0297S\3\2\2\2\u0298\u0299\7\3\2\2\u0299\u029a\79\2\2\u029a"+
		"\u029b\5D#\2\u029b\u029c\7\4\2\2\u029cU\3\2\2\2\u029d\u029e\7\3\2\2\u029e"+
		"\u02a0\7\67\2\2\u029f\u02a1\5*\26\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3"+
		"\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a6\5T+\2\u02a3\u02a5\5*\26\2\u02a4"+
		"\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\7\4\2\2\u02aa"+
		"W\3\2\2\2\u02ab\u02ac\7\3\2\2\u02ac\u02ae\7\65\2\2\u02ad\u02af\5,\27\2"+
		"\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1"+
		"\5Z.\2\u02b1\u02b2\7\4\2\2\u02b2Y\3\2\2\2\u02b3\u02c6\5\"\22\2\u02b4\u02b5"+
		"\5j\66\2\u02b5\u02b6\5\"\22\2\u02b6\u02c6\3\2\2\2\u02b7\u02b8\5p9\2\u02b8"+
		"\u02b9\5Z.\2\u02b9\u02c6\3\2\2\2\u02ba\u02bb\5\32\16\2\u02bb\u02bc\7\3"+
		"\2\2\u02bc\u02c0\7\67\2\2\u02bd\u02bf\5*\26\2\u02be\u02bd\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7\4\2\2\u02c4\u02c6\3\2\2\2\u02c5"+
		"\u02b3\3\2\2\2\u02c5\u02b4\3\2\2\2\u02c5\u02b7\3\2\2\2\u02c5\u02ba\3\2"+
		"\2\2\u02c6[\3\2\2\2\u02c7\u02c8\7\3\2\2\u02c8\u02ca\78\2\2\u02c9\u02cb"+
		"\5*\26\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02d0\5T+\2\u02cd\u02cf\7\b\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2\2"+
		"\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d3\u02d4\7\4\2\2\u02d4]\3\2\2\2\u02d5\u02d6\7\3\2\2\u02d6"+
		"\u02d8\7\66\2\2\u02d7\u02d9\5,\27\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3"+
		"\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\5`\61\2\u02db\u02dc\7\4\2\2\u02dc"+
		"\u02dd\b\60\1\2\u02dd_\3\2\2\2\u02de\u02df\5$\23\2\u02df\u02e0\b\61\1"+
		"\2\u02e0\u02f1\3\2\2\2\u02e1\u02e2\5j\66\2\u02e2\u02e3\5$\23\2\u02e3\u02f1"+
		"\3\2\2\2\u02e4\u02e5\5p9\2\u02e5\u02e6\5`\61\2\u02e6\u02f1\3\2\2\2\u02e7"+
		"\u02e8\7\3\2\2\u02e8\u02ec\78\2\2\u02e9\u02eb\7\b\2\2\u02ea\u02e9\3\2"+
		"\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f1\7\4\2\2\u02f0\u02de\3\2"+
		"\2\2\u02f0\u02e1\3\2\2\2\u02f0\u02e4\3\2\2\2\u02f0\u02e7\3\2\2\2\u02f1"+
		"a\3\2\2\2\u02f2\u02f3\7\3\2\2\u02f3\u02f5\7\64\2\2\u02f4\u02f6\5,\27\2"+
		"\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8"+
		"\5d\63\2\u02f8\u02f9\7\4\2\2\u02f9\u02fa\b\62\1\2\u02fac\3\2\2\2\u02fb"+
		"\u02fc\5\34\17\2\u02fc\u02fd\5D#\2\u02fd\u02fe\b\63\1\2\u02fe\u0306\3"+
		"\2\2\2\u02ff\u0300\5j\66\2\u0300\u0301\5\34\17\2\u0301\u0306\3\2\2\2\u0302"+
		"\u0303\5p9\2\u0303\u0304\5d\63\2\u0304\u0306\3\2\2\2\u0305\u02fb\3\2\2"+
		"\2\u0305\u02ff\3\2\2\2\u0305\u0302\3\2\2\2\u0306e\3\2\2\2\u0307\u0308"+
		"\7\3\2\2\u0308\u030a\7/\2\2\u0309\u030b\5,\27\2\u030a\u0309\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\5&\24\2\u030d\u030e\7\4"+
		"\2\2\u030e\u0330\3\2\2\2\u030f\u0310\7\3\2\2\u0310\u0312\7/\2\2\u0311"+
		"\u0313\5,\27\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u0315\5 \21\2\u0315\u0316\7\4\2\2\u0316\u0330\3\2\2\2\u0317"+
		"\u0318\7\3\2\2\u0318\u031a\7\65\2\2\u0319\u031b\5,\27\2\u031a\u0319\3"+
		"\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\5\"\22\2\u031d"+
		"\u031e\7\4\2\2\u031e\u0330\3\2\2\2\u031f\u0320\7\3\2\2\u0320\u0322\7\66"+
		"\2\2\u0321\u0323\5,\27\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0325\5$\23\2\u0325\u0326\7\4\2\2\u0326\u0330\3\2"+
		"\2\2\u0327\u0328\7\3\2\2\u0328\u032a\7\64\2\2\u0329\u032b\5,\27\2\u032a"+
		"\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\5\34"+
		"\17\2\u032d\u032e\7\4\2\2\u032e\u0330\3\2\2\2\u032f\u0307\3\2\2\2\u032f"+
		"\u030f\3\2\2\2\u032f\u0317\3\2\2\2\u032f\u031f\3\2\2\2\u032f\u0327\3\2"+
		"\2\2\u0330g\3\2\2\2\u0331\u0332\7\3\2\2\u0332\u0333\7:\2\2\u0333\u0334"+
		"\5\26\f\2\u0334\u0335\5\26\f\2\u0335\u0336\5f\64\2\u0336\u0337\7\4\2\2"+
		"\u0337i\3\2\2\2\u0338\u0339\7\3\2\2\u0339\u033a\7:\2\2\u033a\u033b\5\26"+
		"\f\2\u033b\u033c\5\26\f\2\u033c\u033d\7\4\2\2\u033dk\3\2\2\2\u033e\u033f"+
		"\7\3\2\2\u033f\u0340\7/\2\2\u0340\u0341\5*\26\2\u0341\u0342\7\4\2\2\u0342"+
		"\u0353\3\2\2\2\u0343\u0344\7\3\2\2\u0344\u0345\7\65\2\2\u0345\u0346\5"+
		"*\26\2\u0346\u0347\7\4\2\2\u0347\u0353\3\2\2\2\u0348\u0349\7\3\2\2\u0349"+
		"\u034a\7\66\2\2\u034a\u034b\5*\26\2\u034b\u034c\7\4\2\2\u034c\u0353\3"+
		"\2\2\2\u034d\u034e\7\3\2\2\u034e\u034f\7\64\2\2\u034f\u0350\5*\26\2\u0350"+
		"\u0351\7\4\2\2\u0351\u0353\3\2\2\2\u0352\u033e\3\2\2\2\u0352\u0343\3\2"+
		"\2\2\u0352\u0348\3\2\2\2\u0352\u034d\3\2\2\2\u0353m\3\2\2\2\u0354\u0355"+
		"\7\3\2\2\u0355\u0356\7;\2\2\u0356\u0357\5\26\f\2\u0357\u0358\5l\67\2\u0358"+
		"\u0359\7\4\2\2\u0359o\3\2\2\2\u035a\u035b\7\3\2\2\u035b\u035c\7;\2\2\u035c"+
		"\u035d\5\26\f\2\u035d\u035e\7\4\2\2\u035eq\3\2\2\2\u035f\u0360\5\36\20"+
		"\2\u0360s\3\2\2\2\u0361\u0362\7\3\2\2\u0362\u0364\7.\2\2\u0363\u0365\5"+
		",\27\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\5r:\2\u0367\u0368\7\4\2\2\u0368u\3\2\2\2\u0369\u036a\7\3\2\2\u036a"+
		"\u036b\7\60\2\2\u036b\u036c\5*\26\2\u036c\u036d\7\4\2\2\u036dw\3\2\2\2"+
		"\u036e\u0379\5t;\2\u036f\u0379\5b\62\2\u0370\u0379\5X-\2\u0371\u0379\5"+
		"^\60\2\u0372\u0379\5F$\2\u0373\u0379\5V,\2\u0374\u0379\5\\/\2\u0375\u0379"+
		"\5v<\2\u0376\u0379\5h\65\2\u0377\u0379\5n8\2\u0378\u036e\3\2\2\2\u0378"+
		"\u036f\3\2\2\2\u0378\u0370\3\2\2\2\u0378\u0371\3\2\2\2\u0378\u0372\3\2"+
		"\2\2\u0378\u0373\3\2\2\2\u0378\u0374\3\2\2\2\u0378\u0375\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0378\u0377\3\2\2\2\u0379y\3\2\2\2\u037a\u037b\7\3\2\2"+
		"\u037b\u037d\7<\2\2\u037c\u037e\7M\2\2\u037d\u037c\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u0382\3\2\2\2\u037f\u0381\5x=\2\u0380\u037f\3\2\2\2\u0381"+
		"\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0385\u0386\7\4\2\2\u0386{\3\2\2\2\u0387\u0396"+
		"\5z>\2\u0388\u0389\7\3\2\2\u0389\u038b\7<\2\2\u038a\u038c\7M\2\2\u038b"+
		"\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0391\t\6"+
		"\2\2\u038e\u0390\7\b\2\2\u038f\u038e\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0394\u0396\7\4\2\2\u0395\u0387\3\2\2\2\u0395\u0388\3\2\2\2\u0396"+
		"}\3\2\2\2\u0397\u0398\7\3\2\2\u0398\u039a\7A\2\2\u0399\u039b\7M\2\2\u039a"+
		"\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\5\26"+
		"\f\2\u039d\u039e\5\u0088E\2\u039e\u039f\7\4\2\2\u039f\u03a9\3\2\2\2\u03a0"+
		"\u03a1\7\3\2\2\u03a1\u03a3\7B\2\2\u03a2\u03a4\7M\2\2\u03a3\u03a2\3\2\2"+
		"\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\5\26\f\2\u03a6"+
		"\u03a7\7\4\2\2\u03a7\u03a9\3\2\2\2\u03a8\u0397\3\2\2\2\u03a8\u03a0\3\2"+
		"\2\2\u03a9\177\3\2\2\2\u03aa\u03ab\7\3\2\2\u03ab\u03ac\7C\2\2\u03ac\u03ad"+
		"\5|?\2\u03ad\u03ae\7\b\2\2\u03ae\u03af\7\4\2\2\u03af\u03df\3\2\2\2\u03b0"+
		"\u03b1\7\3\2\2\u03b1\u03b2\7D\2\2\u03b2\u03b3\5|?\2\u03b3\u03b4\7\b\2"+
		"\2\u03b4\u03b5\7\4\2\2\u03b5\u03df\3\2\2\2\u03b6\u03b7\7\3\2\2\u03b7\u03b8"+
		"\7E\2\2\u03b8\u03b9\5|?\2\u03b9\u03ba\7\b\2\2\u03ba\u03bb\7\4\2\2\u03bb"+
		"\u03df\3\2\2\2\u03bc\u03bd\7\3\2\2\u03bd\u03be\7I\2\2\u03be\u03bf\5|?"+
		"\2\u03bf\u03c0\7\b\2\2\u03c0\u03c1\7\4\2\2\u03c1\u03df\3\2\2\2\u03c2\u03c3"+
		"\7\3\2\2\u03c3\u03c4\7F\2\2\u03c4\u03c5\5~@\2\u03c5\u03c6\5\u0088E\2\u03c6"+
		"\u03c7\7\4\2\2\u03c7\u03df\3\2\2\2\u03c8\u03c9\7\3\2\2\u03c9\u03ca\7G"+
		"\2\2\u03ca\u03cb\5~@\2\u03cb\u03cc\7\4\2\2\u03cc\u03df\3\2\2\2\u03cd\u03ce"+
		"\7\3\2\2\u03ce\u03cf\7H\2\2\u03cf\u03d0\5~@\2\u03d0\u03d1\7\4\2\2\u03d1"+
		"\u03df\3\2\2\2\u03d2\u03d3\7\3\2\2\u03d3\u03d4\7I\2\2\u03d4\u03d5\5~@"+
		"\2\u03d5\u03d6\7\b\2\2\u03d6\u03d7\7\4\2\2\u03d7\u03df\3\2\2\2\u03d8\u03d9"+
		"\7\3\2\2\u03d9\u03da\7J\2\2\u03da\u03db\5~@\2\u03db\u03dc\7\b\2\2\u03dc"+
		"\u03dd\7\4\2\2\u03dd\u03df\3\2\2\2\u03de\u03aa\3\2\2\2\u03de\u03b0\3\2"+
		"\2\2\u03de\u03b6\3\2\2\2\u03de\u03bc\3\2\2\2\u03de\u03c2\3\2\2\2\u03de"+
		"\u03c8\3\2\2\2\u03de\u03cd\3\2\2\2\u03de\u03d2\3\2\2\2\u03de\u03d8\3\2"+
		"\2\2\u03df\u0081\3\2\2\2\u03e0\u03ed\5~@\2\u03e1\u03ed\5\u0080A\2\u03e2"+
		"\u03ed\5|?\2\u03e3\u03e4\7\3\2\2\u03e4\u03e5\7@\2\2\u03e5\u03e7\5\26\f"+
		"\2\u03e6\u03e8\7M\2\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03ea\7\4\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03ed\5\u0084C"+
		"\2\u03ec\u03e0\3\2\2\2\u03ec\u03e1\3\2\2\2\u03ec\u03e2\3\2\2\2\u03ec\u03e3"+
		"\3\2\2\2\u03ec\u03eb\3\2\2\2\u03ed\u0083\3\2\2\2\u03ee\u03ef\7\3\2\2\u03ef"+
		"\u03f1\7?\2\2\u03f0\u03f2\7M\2\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2"+
		"\2\u03f2\u03f6\3\2\2\2\u03f3\u03f5\5\u0082B\2\u03f4\u03f3\3\2\2\2\u03f5"+
		"\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2"+
		"\2\2\u03f8\u03f6\3\2\2\2\u03f9\u040f\7\4\2\2\u03fa\u03fb\7\3\2\2\u03fb"+
		"\u03fd\7K\2\2\u03fc\u03fe\7M\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2"+
		"\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7\b\2\2\u0400\u040f\7\4\2\2\u0401\u0402"+
		"\7\3\2\2\u0402\u0404\7L\2\2\u0403\u0405\7M\2\2\u0404\u0403\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\7\b\2\2\u0407\u040f\7\4"+
		"\2\2\u0408\u0409\7\3\2\2\u0409\u040b\7L\2\2\u040a\u040c\7M\2\2\u040b\u040a"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\7\4\2\2\u040e"+
		"\u03ee\3\2\2\2\u040e\u03fa\3\2\2\2\u040e\u0401\3\2\2\2\u040e\u0408\3\2"+
		"\2\2\u040f\u0085\3\2\2\2\u0410\u0411\7\3\2\2\u0411\u0412\7\n\2\2\u0412"+
		"\u0413\5(\25\2\u0413\u0414\7\4\2\2\u0414\u0087\3\2\2\2\u0415\u0417\5\u0086"+
		"D\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u0089\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u041d\5\u0082"+
		"B\2\u041c\u041b\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u042a\7\2"+
		"\2\3\u0422\u0424\5x=\2\u0423\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0423"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\7\2\2\3\u0428"+
		"\u042a\3\2\2\2\u0429\u041e\3\2\2\2\u0429\u0423\3\2\2\2\u042a\u008b\3\2"+
		"\2\2\u042b\u042c\5z>\2\u042c\u042d\7\2\2\3\u042d\u0436\3\2\2\2\u042e\u0430"+
		"\5x=\2\u042f\u042e\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431"+
		"\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0436\7\2"+
		"\2\3\u0435\u042b\3\2\2\2\u0435\u0431\3\2\2\2\u0436\u008d\3\2\2\2k\u0096"+
		"\u009a\u009e\u00a3\u00a8\u00b0\u00b7\u00c2\u00ce\u00d0\u00dd\u00e3\u00f9"+
		"\u0105\u010c\u0113\u0118\u011d\u0123\u013b\u014f\u016f\u0172\u0177\u017a"+
		"\u018f\u0193\u019d\u01a3\u01ab\u01b1\u01b6\u01c0\u01c6\u01d1\u01d7\u01df"+
		"\u01e5\u01eb\u01f1\u01f4\u01f8\u01fc\u0205\u020f\u0213\u021f\u0227\u022e"+
		"\u0237\u023e\u0248\u0252\u0258\u0260\u026c\u026e\u0279\u0284\u0290\u0292"+
		"\u02a0\u02a6\u02ae\u02c0\u02c5\u02ca\u02d0\u02d8\u02ec\u02f0\u02f5\u0305"+
		"\u030a\u0312\u031a\u0322\u032a\u032f\u0352\u0364\u0378\u037d\u0382\u038b"+
		"\u0391\u0395\u039a\u03a3\u03a8\u03de\u03e7\u03ec\u03f1\u03f6\u03fd\u0404"+
		"\u040b\u040e\u0418\u041e\u0425\u0429\u0431\u0435";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}