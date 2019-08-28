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
	private static int numFunc;

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
	    numFunc = 0;
	    parser.wasmfuncpass();
	    parser.reset();
	    numFunc = 0;
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << RPAR) | (1L << NAT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VALUE_TYPE) | (1L << CONST) | (1L << FUNCREF) | (1L << MUT) | (1L << PRINT) | (1L << NOP) | (1L << UNREACHABLE) | (1L << DROP) | (1L << BLOCK) | (1L << LOOP) | (1L << END) | (1L << BR) | (1L << BR_IF) | (1L << BR_TABLE) | (1L << RETURN) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << SELECT) | (1L << CALL) | (1L << CALL_INDIRECT) | (1L << LOCAL_GET) | (1L << LOCAL_SET) | (1L << LOCAL_TEE) | (1L << GLOBAL_GET) | (1L << GLOBAL_SET) | (1L << LOAD) | (1L << STORE) | (1L << OFFSET_EQ_NAT) | (1L << ALIGN_EQ_NAT) | (1L << UNARY) | (1L << BINARY) | (1L << TEST) | (1L << COMPARE) | (1L << CONVERT) | (1L << MEMORY_SIZE) | (1L << MEMORY_GROW) | (1L << TYPE) | (1L << FUNC) | (1L << START) | (1L << PARAM) | (1L << RESULT) | (1L << LOCAL) | (1L << GLOBAL) | (1L << TABLE) | (1L << MEMORY) | (1L << ELEM) | (1L << DATA) | (1L << OFFSET) | (1L << IMPORT) | (1L << EXPORT) | (1L << MODULE) | (1L << BIN) | (1L << QUOTE) | (1L << SCRIPT) | (1L << REGISTER) | (1L << INVOKE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GET - 64)) | (1L << (ASSERT_MALFORMED - 64)) | (1L << (ASSERT_INVALID - 64)) | (1L << (ASSERT_UNLINKABLE - 64)) | (1L << (ASSERT_RETURN - 64)) | (1L << (ASSERT_RETURN_CANONICAL_NAN - 64)) | (1L << (ASSERT_RETURN_ARITHMETIC_NAN - 64)) | (1L << (ASSERT_TRAP - 64)) | (1L << (ASSERT_EXHAUSTION - 64)) | (1L << (INPUT - 64)) | (1L << (OUTPUT - 64)) | (1L << (VAR - 64)) | (1L << (SPACE - 64)) | (1L << (COMMENT - 64)))) != 0)) {
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
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(156);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(LPAR);
			setState(164);
			match(MODULE);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(165);
				match(VAR);
				}
				break;
			}
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					module_fieldFP();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(174);
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
			setState(176);
			match(LPAR);
			setState(177);
			match(FUNC);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(178);
				((FuncFPContext)_localctx).bind_var = bind_var();
				}
				break;
			}
			setState(181);
			((FuncFPContext)_localctx).func_fieldsFP = func_fieldsFP();
			 factory.createSignature((((FuncFPContext)_localctx).bind_var!=null?(((FuncFPContext)_localctx).bind_var.start):null), numFunc++, ((FuncFPContext)_localctx).func_fieldsFP.parArr, ((FuncFPContext)_localctx).func_fieldsFP.resArr); 
			setState(183);
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
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(185);
				type_use();
				}
				break;
			}
			setState(188);
			((Func_fieldsFPContext)_localctx).func_fields_bodyFP = func_fields_bodyFP();
			 ((Func_fieldsFPContext)_localctx).parArr =  ((Func_fieldsFPContext)_localctx).func_fields_bodyFP.parArr;
			                                                  ((Func_fieldsFPContext)_localctx).resArr =  ((Func_fieldsFPContext)_localctx).func_fields_bodyFP.resArr; 
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
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
		public Value_typeContext value_type;
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
			 ArrayList<String> parArr = new ArrayList<String>(); 
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(192);
						match(LPAR);
						setState(193);
						match(PARAM);
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(194);
							((Func_fields_bodyFPContext)_localctx).value_type = value_type();
							 parArr.add((((Func_fields_bodyFPContext)_localctx).value_type!=null?(((Func_fields_bodyFPContext)_localctx).value_type.start):null).getText()); 
							}
							}
							setState(201);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(202);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(203);
						match(LPAR);
						setState(204);
						match(PARAM);
						setState(205);
						match(VAR);
						setState(206);
						((Func_fields_bodyFPContext)_localctx).value_type = value_type();
						setState(207);
						match(RPAR);
						 parArr.add((((Func_fields_bodyFPContext)_localctx).value_type!=null?(((Func_fields_bodyFPContext)_localctx).value_type.start):null).getText()); 
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(215);
			((Func_fields_bodyFPContext)_localctx).func_result_bodyFP = func_result_bodyFP();
			 ((Func_fields_bodyFPContext)_localctx).parArr =  parArr;
			                                                  ((Func_fields_bodyFPContext)_localctx).resArr =  ((Func_fields_bodyFPContext)_localctx).func_result_bodyFP.resArr; 
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
		public ArrayList<String> resArr;
		public Value_typeContext value_type;
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
			 ArrayList<String> resArr = new ArrayList<String>(); 
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(219);
				match(LPAR);
				setState(220);
				match(RESULT);
				setState(221);
				((Func_result_bodyFPContext)_localctx).value_type = value_type();
				 resArr.add((((Func_result_bodyFPContext)_localctx).value_type!=null?(((Func_result_bodyFPContext)_localctx).value_type.start):null).getText()); 
				setState(223);
				match(RPAR);
				}
				break;
			}
			 ((Func_result_bodyFPContext)_localctx).resArr =  resArr; 
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(228);
					matchWildcard();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(234);
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
			setState(236);
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
			setState(238);
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
			setState(240);
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
			setState(242);
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
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				value_type();
				 ((Global_typeContext)_localctx).result =  new Boolean(false); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(LPAR);
				setState(248);
				match(MUT);
				setState(249);
				value_type();
				setState(250);
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
			setState(255);
			match(LPAR);
			setState(256);
			match(FUNC);
			setState(257);
			func_type();
			setState(258);
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
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(260);
				match(LPAR);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(261);
					match(RESULT);
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(262);
						value_type();
						}
						}
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(268);
					match(PARAM);
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(269);
						value_type();
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(275);
					match(PARAM);
					setState(276);
					bind_var();
					setState(277);
					value_type();
					}
					break;
				}
				setState(281);
				match(RPAR);
				}
				}
				setState(286);
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
		public Integer min;
		public Integer max;
		public Token mn;
		public Token mx;
		public Elem_typeContext elem_type() {
			return getRuleContext(Elem_typeContext.class,0);
		}
		public List<TerminalNode> NAT() { return getTokens(WasmLanguageParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(WasmLanguageParser.NAT, i);
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
			setState(287);
			((Table_typeContext)_localctx).mn = match(NAT);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(288);
				((Table_typeContext)_localctx).mx = match(NAT);
				}
			}

			setState(291);
			elem_type();
			 ((Table_typeContext)_localctx).min =  Integer.parseUnsignedInt(((Table_typeContext)_localctx).mn.getText());
			                                              if (((Table_typeContext)_localctx).mx != null) { ((Table_typeContext)_localctx).max =  Integer.parseUnsignedInt(((Table_typeContext)_localctx).mx.getText()); }
			                                              else { ((Table_typeContext)_localctx).max =  -1; }
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
		public Integer min;
		public Integer max;
		public Token mn;
		public Token mx;
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
			setState(294);
			((Memory_typeContext)_localctx).mn = match(NAT);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(295);
				((Memory_typeContext)_localctx).mx = match(NAT);
				}
			}

			 ((Memory_typeContext)_localctx).min =  Integer.parseUnsignedInt(((Memory_typeContext)_localctx).mn.getText());
			                                              if (((Memory_typeContext)_localctx).mx != null) { ((Memory_typeContext)_localctx).max =  Integer.parseUnsignedInt(((Memory_typeContext)_localctx).mx.getText()); }
			                                              else { ((Memory_typeContext)_localctx).max =  -1; }
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
			setState(300);
			match(LPAR);
			setState(301);
			match(TYPE);
			setState(302);
			var();
			setState(303);
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
			setState(305);
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
			setState(307);
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
			setState(309);
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
			setState(320);
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
				setState(311);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				((InstrContext)_localctx).call_instr_instr = call_instr_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).call_instr_instr.result; 
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
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
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				((Plain_instrContext)_localctx).PRINT = match(PRINT);
				 ((Plain_instrContext)_localctx).result =  factory.createPrint(((Plain_instrContext)_localctx).PRINT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(BR);
				setState(333);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
				match(BR_IF);
				setState(335);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(336);
				match(BR_TABLE);
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(337);
					var();
					}
					}
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, (WasmExpressionNode) body.pop()); 
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(344);
				match(CALL);
				setState(345);
				((Plain_instrContext)_localctx).var = var();
				 String funcId = (((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText();
				                                                          Integer funcIndex;
				                                                          Boolean index = true;
				                                                          try {
				                                                            funcIndex = Integer.parseUnsignedInt(funcId);
				                                                          } catch (NumberFormatException e) {
				                                                            funcIndex = factory.getIndex(funcId);
				                                                            index = false;
				                                                          }

				                                                          WasmFunctionSignatureNode sig = factory.getSignature(funcIndex);
				                                                          int numArgs = sig.getNumParams();
				                                                          List<WasmExpressionNode> params = new ArrayList<>();
				                                                          // build this list in case of error
				                                                          ArrayList<String> wrongArgTypes = new ArrayList<>();
				                                                          Boolean error = false; // error flag

				                                                          for (int i = 0; i < numArgs; i++) {
				                                                            // typecheck, proceed if ok otherwise error
				                                                            WasmExpressionNode node = (WasmExpressionNode) body.pop();
				                                                            String expectedType = sig.getParamTypeAt(i);
				                                                            String actualType = factory.getTypeString(node);
				                                                            if (expectedType.compareTo(actualType) == 0) {
				                                                              params.add(node);
				                                                            } else {
				                                                              error = true;
				                                                            }
				                                                            wrongArgTypes.add(0, actualType);
				                                                          }

				                                                          if (error) {
				                                                            // build error string
				                                                            ArrayList<String> expArgTypes = new ArrayList<String>();
				                                                            for (int i = 0; i < numArgs; i++) {
				                                                              expArgTypes.add(0, sig.getParamTypeAt(i));
				                                                            }
				                                                            String msg = "invalid module: type mismatch: operator requires " + expArgTypes + " but stack has " + wrongArgTypes;
				                                                            SemErr((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), msg);
				                                                          }

				                                                          if (index) {
				                                                            ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), true), params, (((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null));
				                                                          } else {
				                                                            ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), true), params, (((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null));
				                                                          }
				}
				break;
			case LOCAL_GET:
				enterOuterAlt(_localctx, 11);
				{
				setState(348);
				match(LOCAL_GET);
				setState(349);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false); 
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 12);
				{
				setState(352);
				match(LOCAL_SET);
				setState(353);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop()); 
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 13);
				{
				setState(356);
				match(LOCAL_TEE);
				setState(357);
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
			case GLOBAL_GET:
				enterOuterAlt(_localctx, 14);
				{
				setState(360);
				match(GLOBAL_GET);
				setState(361);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), false);
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 15);
				{
				setState(364);
				match(GLOBAL_SET);
				setState(365);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), (WasmExpressionNode) body.pop()); 
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 16);
				{
				setState(368);
				((Plain_instrContext)_localctx).LOAD = match(LOAD);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(369);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(372);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createLoad(((Plain_instrContext)_localctx).LOAD, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 17);
				{
				setState(376);
				((Plain_instrContext)_localctx).STORE = match(STORE);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(377);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(380);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createStore(((Plain_instrContext)_localctx).STORE, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 18);
				{
				setState(384);
				((Plain_instrContext)_localctx).MEMORY_SIZE = match(MEMORY_SIZE);
				 ((Plain_instrContext)_localctx).result =  factory.createMemorySize(((Plain_instrContext)_localctx).MEMORY_SIZE); 
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 19);
				{
				setState(386);
				((Plain_instrContext)_localctx).MEMORY_GROW = match(MEMORY_GROW);
				 ((Plain_instrContext)_localctx).result =  factory.createMemoryGrow(((Plain_instrContext)_localctx).MEMORY_GROW, (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 20);
				{
				setState(388);
				((Plain_instrContext)_localctx).CONST = match(CONST);
				setState(389);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).CONST, (((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 21);
				{
				setState(392);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 22);
				{
				setState(394);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(396);
				((Plain_instrContext)_localctx).UNARY = match(UNARY);
				 ((Plain_instrContext)_localctx).result =  factory.createUnary(((Plain_instrContext)_localctx).UNARY, (WasmExpressionNode) body.pop()); 
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 24);
				{
				setState(398);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 25);
				{
				setState(400);
				((Plain_instrContext)_localctx).CONVERT = match(CONVERT);
				 ((Plain_instrContext)_localctx).result =  factory.createConvert(((Plain_instrContext)_localctx).CONVERT, (WasmExpressionNode) body.pop()); 
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
			setState(404);
			match(CALL_INDIRECT);
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(405);
				type_use();
				}
				break;
			}
			setState(408);
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
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					match(LPAR);
					setState(412);
					match(PARAM);
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(413);
						value_type();
						}
						}
						setState(418);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(419);
					match(RPAR);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(425);
				match(LPAR);
				setState(426);
				match(RESULT);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(427);
					value_type();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				match(RPAR);
				}
				}
				setState(438);
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
			setState(439);
			match(CALL_INDIRECT);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(440);
				type_use();
				}
				break;
			}
			setState(443);
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
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(446);
					match(LPAR);
					setState(447);
					match(PARAM);
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(448);
						value_type();
						}
						}
						setState(453);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(454);
					match(RPAR);
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(460);
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
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(463);
				match(LPAR);
				setState(464);
				match(RESULT);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(465);
					value_type();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				match(RPAR);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
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
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(481);
					((Block_instrContext)_localctx).bv1 = bind_var();
					}
				}

				 if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("block") == 0 && (((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null), "block has label at beginning"); } 
				setState(485);
				((Block_instrContext)_localctx).block = block();
				setState(486);
				match(END);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(487);
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
				setState(492);
				match(IF);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(493);
					bind_var();
					}
				}

				setState(496);
				block();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					 factory.startBlock();
					                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
					setState(498);
					match(ELSE);
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(499);
						bind_var();
						}
					}

					setState(502);
					((Block_instrContext)_localctx).res = instr_list(body);
					}
				}

				setState(505);
				match(END);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(506);
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
			setState(513);
			match(LPAR);
			setState(514);
			match(RESULT);
			setState(515);
			value_type();
			setState(516);
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
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(519);
				((BlockContext)_localctx).t = block_type();
				}
			}

			setState(522);
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
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					((Instr_listContext)_localctx).instr = instr(body);
					 body.push(((Instr_listContext)_localctx).instr.result); 
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CALL_INDIRECT) {
				{
				setState(533);
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
			setState(540);
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
			 WasmFunctionSignatureNode sig = factory.getSignature(numFunc++); 
			setState(544);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(545);
			match(FUNC);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(546);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(550);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(552);
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
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(554);
					type_use();
					}
					break;
				}
				setState(557);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				inline_import();
				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(561);
					type_use();
					}
					break;
				}
				setState(564);
				((Func_fieldsContext)_localctx).func_fields_import = func_fields_import();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_import.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				inline_export();
				setState(568);
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
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(573);
				match(LPAR);
				setState(574);
				match(PARAM);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(575);
					value_type();
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(582);
				match(LPAR);
				setState(583);
				match(PARAM);
				setState(584);
				bind_var();
				setState(585);
				value_type();
				setState(586);
				match(RPAR);
				}
				break;
			}
			setState(590);
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
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(593);
				match(LPAR);
				setState(594);
				match(RESULT);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(595);
					value_type();
					}
					}
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(601);
				match(RPAR);
				}
				}
				setState(606);
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
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(625);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(607);
						match(LPAR);
						setState(608);
						match(PARAM);
						setState(614);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(609);
							value_type();
							 factory.addFormalParameter(null); 
							}
							}
							setState(616);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(617);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(618);
						match(LPAR);
						setState(619);
						match(PARAM);
						setState(620);
						((Func_fields_bodyContext)_localctx).VAR = match(VAR);
						setState(621);
						value_type();
						setState(622);
						match(RPAR);
						 factory.addFormalParameter(((Func_fields_bodyContext)_localctx).VAR); 
						}
						break;
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(630);
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
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(633);
				match(LPAR);
				setState(634);
				match(RESULT);
				setState(635);
				value_type();
				setState(636);
				match(RPAR);
				}
				break;
			}
			setState(640);
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
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(644);
					match(LPAR);
					setState(645);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(646);
						((Func_bodyContext)_localctx).value_type = value_type();
						}
						}
						setState(651);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, null, (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					setState(653);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(654);
					match(LPAR);
					setState(655);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(656);
					((Func_bodyContext)_localctx).bind_var = bind_var();
					setState(657);
					((Func_bodyContext)_localctx).value_type = value_type();
					setState(658);
					match(RPAR);
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, (((Func_bodyContext)_localctx).bind_var!=null?(((Func_bodyContext)_localctx).bind_var.start):null), (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					}
					break;
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
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
			setState(669);
			match(LPAR);
			setState(670);
			match(OFFSET);
			setState(671);
			const_expr();
			setState(672);
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
			setState(674);
			match(LPAR);
			setState(675);
			match(ELEM);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(676);
				var();
				}
			}

			setState(679);
			offset();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(680);
				var();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
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
		public WasmStatementNode result;
		public Token TABLE;
		public Bind_varContext bind_var;
		public Table_fieldsContext table_fields;
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
			setState(688);
			match(LPAR);
			setState(689);
			((TableContext)_localctx).TABLE = match(TABLE);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(690);
				((TableContext)_localctx).bind_var = bind_var();
				}
			}

			setState(693);
			((TableContext)_localctx).table_fields = table_fields();
			setState(694);
			match(RPAR);
			 ((TableContext)_localctx).result =  factory.createTable(((TableContext)_localctx).TABLE, (((TableContext)_localctx).bind_var!=null?(((TableContext)_localctx).bind_var.start):null), ((TableContext)_localctx).table_fields.min, ((TableContext)_localctx).table_fields.max); 
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
		public Integer min;
		public Integer max;
		public Table_typeContext table_type;
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
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				((Table_fieldsContext)_localctx).table_type = table_type();
				 ((Table_fieldsContext)_localctx).min =  ((Table_fieldsContext)_localctx).table_type.min; ((Table_fieldsContext)_localctx).max =  ((Table_fieldsContext)_localctx).table_type.max; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				inline_import();
				setState(701);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				inline_export();
				setState(704);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				elem_type();
				setState(707);
				match(LPAR);
				setState(708);
				match(ELEM);
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(709);
					var();
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(715);
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
			setState(719);
			match(LPAR);
			setState(720);
			match(DATA);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(721);
				var();
				}
			}

			setState(724);
			offset();
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(725);
				match(STRING);
				}
				}
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(731);
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
			setState(733);
			match(LPAR);
			setState(734);
			((MemoryContext)_localctx).MEMORY = match(MEMORY);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(735);
				((MemoryContext)_localctx).bind_var = bind_var();
				}
			}

			setState(738);
			((MemoryContext)_localctx).memory_fields = memory_fields();
			setState(739);
			match(RPAR);
			 ((MemoryContext)_localctx).result =  factory.createMemory(((MemoryContext)_localctx).MEMORY, (((MemoryContext)_localctx).bind_var!=null?(((MemoryContext)_localctx).bind_var.start):null), ((MemoryContext)_localctx).memory_fields.min, ((MemoryContext)_localctx).memory_fields.max); 
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
		public Integer min;
		public Integer max;
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
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				((Memory_fieldsContext)_localctx).memory_type = memory_type();
				 ((Memory_fieldsContext)_localctx).min =  ((Memory_fieldsContext)_localctx).memory_type.min; ((Memory_fieldsContext)_localctx).max =  ((Memory_fieldsContext)_localctx).memory_type.max; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				inline_import();
				setState(746);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				inline_export();
				setState(749);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				match(LPAR);
				setState(752);
				match(DATA);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(753);
					match(STRING);
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(759);
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
			setState(762);
			match(LPAR);
			setState(763);
			((SglobalContext)_localctx).GLOBAL = match(GLOBAL);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(764);
				((SglobalContext)_localctx).bind_var = bind_var();
				}
			}

			setState(767);
			((SglobalContext)_localctx).global_fields = global_fields();
			setState(768);
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
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				((Global_fieldsContext)_localctx).global_type = global_type();
				setState(772);
				((Global_fieldsContext)_localctx).const_expr = const_expr();
				 ((Global_fieldsContext)_localctx).result_val =  ((Global_fieldsContext)_localctx).const_expr.result;
				                                                      ((Global_fieldsContext)_localctx).result_mut =  ((Global_fieldsContext)_localctx).global_type.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				inline_import();
				setState(776);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				inline_export();
				setState(779);
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
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(LPAR);
				setState(784);
				match(FUNC);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(785);
					bind_var();
					}
				}

				setState(788);
				type_use();
				setState(789);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				match(LPAR);
				setState(792);
				match(FUNC);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(793);
					bind_var();
					}
				}

				setState(796);
				func_type();
				setState(797);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				match(LPAR);
				setState(800);
				match(TABLE);
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(801);
					bind_var();
					}
				}

				setState(804);
				table_type();
				setState(805);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				match(LPAR);
				setState(808);
				match(MEMORY);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(809);
					bind_var();
					}
				}

				setState(812);
				memory_type();
				setState(813);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(815);
				match(LPAR);
				setState(816);
				match(GLOBAL);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(817);
					bind_var();
					}
				}

				setState(820);
				global_type();
				setState(821);
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
			setState(825);
			match(LPAR);
			setState(826);
			match(IMPORT);
			setState(827);
			name();
			setState(828);
			name();
			setState(829);
			import_desc();
			setState(830);
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
			setState(832);
			match(LPAR);
			setState(833);
			match(IMPORT);
			setState(834);
			name();
			setState(835);
			name();
			setState(836);
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
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(LPAR);
				setState(839);
				match(FUNC);
				setState(840);
				var();
				setState(841);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				match(LPAR);
				setState(844);
				match(TABLE);
				setState(845);
				var();
				setState(846);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				match(LPAR);
				setState(849);
				match(MEMORY);
				setState(850);
				var();
				setState(851);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(853);
				match(LPAR);
				setState(854);
				match(GLOBAL);
				setState(855);
				var();
				setState(856);
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
			setState(860);
			match(LPAR);
			setState(861);
			match(EXPORT);
			setState(862);
			name();
			setState(863);
			export_desc();
			setState(864);
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
			setState(866);
			match(LPAR);
			setState(867);
			match(EXPORT);
			setState(868);
			name();
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
			setState(871);
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
			setState(873);
			match(LPAR);
			setState(874);
			match(TYPE);
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(875);
				bind_var();
				}
			}

			setState(878);
			type_();
			setState(879);
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
			setState(881);
			match(LPAR);
			setState(882);
			match(START);
			setState(883);
			var();
			setState(884);
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
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(888);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(890);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(891);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(892);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(893);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(894);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(895);
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
			setState(898);
			match(LPAR);
			setState(899);
			match(MODULE);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(900);
				match(VAR);
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(903);
				module_field();
				}
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(909);
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
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(LPAR);
				setState(913);
				match(MODULE);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(914);
					match(VAR);
					}
				}

				setState(917);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(918);
					match(STRING);
					}
					}
					setState(923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
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
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(LPAR);
				setState(928);
				match(INVOKE);
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(929);
					match(VAR);
					}
				}

				setState(932);
				name();
				setState(933);
				const_list();
				setState(934);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				match(LPAR);
				setState(937);
				match(GET);
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(938);
					match(VAR);
					}
				}

				setState(941);
				name();
				setState(942);
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
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				match(LPAR);
				setState(947);
				match(ASSERT_MALFORMED);
				setState(948);
				script_module();
				setState(949);
				match(STRING);
				setState(950);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				match(LPAR);
				setState(953);
				match(ASSERT_INVALID);
				setState(954);
				script_module();
				setState(955);
				match(STRING);
				setState(956);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(LPAR);
				setState(959);
				match(ASSERT_UNLINKABLE);
				setState(960);
				script_module();
				setState(961);
				match(STRING);
				setState(962);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(964);
				match(LPAR);
				setState(965);
				match(ASSERT_TRAP);
				setState(966);
				script_module();
				setState(967);
				match(STRING);
				setState(968);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(970);
				match(LPAR);
				setState(971);
				match(ASSERT_RETURN);
				setState(972);
				action();
				setState(973);
				const_list();
				setState(974);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(976);
				match(LPAR);
				setState(977);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(978);
				action();
				setState(979);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(981);
				match(LPAR);
				setState(982);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(983);
				action();
				setState(984);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(986);
				match(LPAR);
				setState(987);
				match(ASSERT_TRAP);
				setState(988);
				action();
				setState(989);
				match(STRING);
				setState(990);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(992);
				match(LPAR);
				setState(993);
				match(ASSERT_EXHAUSTION);
				setState(994);
				action();
				setState(995);
				match(STRING);
				setState(996);
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
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1002);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1003);
				match(LPAR);
				setState(1004);
				match(REGISTER);
				setState(1005);
				name();
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1006);
					match(VAR);
					}
				}

				setState(1009);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1011);
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
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				match(LPAR);
				setState(1015);
				match(SCRIPT);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1016);
					match(VAR);
					}
				}

				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1019);
					cmd();
					}
					}
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1025);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				match(LPAR);
				setState(1027);
				match(INPUT);
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1028);
					match(VAR);
					}
				}

				setState(1031);
				match(STRING);
				setState(1032);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1033);
				match(LPAR);
				setState(1034);
				match(OUTPUT);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1035);
					match(VAR);
					}
				}

				setState(1038);
				match(STRING);
				setState(1039);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1040);
				match(LPAR);
				setState(1041);
				match(OUTPUT);
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1042);
					match(VAR);
					}
				}

				setState(1045);
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
			setState(1048);
			match(LPAR);
			setState(1049);
			match(CONST);
			setState(1050);
			literal();
			setState(1051);
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
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(1053);
				wconst();
				}
				}
				setState(1058);
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
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1059);
					cmd();
					}
					}
					setState(1064);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1065);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1066);
					module_field();
					}
					}
					setState(1069); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(1071);
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
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				module_();
				setState(1076);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1078);
					module_field();
					}
					}
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1084);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0442\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3\3\5\3\u009b\n\3\3\4"+
		"\3\4\3\4\6\4\u00a0\n\4\r\4\16\4\u00a1\5\4\u00a4\n\4\3\5\3\5\3\5\5\5\u00a9"+
		"\n\5\3\5\7\5\u00ac\n\5\f\5\16\5\u00af\13\5\3\5\3\5\3\6\3\6\3\6\5\6\u00b6"+
		"\n\6\3\6\3\6\3\6\3\6\3\7\5\7\u00bd\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u00c8\n\b\f\b\16\b\u00cb\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00d5\n\b\f\b\16\b\u00d8\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00e4\n\t\3\t\3\t\7\t\u00e8\n\t\f\t\16\t\u00eb\13\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0100\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u010a\n\21\f\21\16\21\u010d\13\21\3\21\3\21\7\21\u0111\n\21\f\21\16\21"+
		"\u0114\13\21\3\21\3\21\3\21\3\21\5\21\u011a\n\21\3\21\7\21\u011d\n\21"+
		"\f\21\16\21\u0120\13\21\3\22\3\22\5\22\u0124\n\22\3\22\3\22\3\22\3\23"+
		"\3\23\5\23\u012b\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0143"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\6\31\u0155\n\31\r\31\16\31\u0156\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0175\n\31\3\31"+
		"\5\31\u0178\n\31\3\31\3\31\3\31\5\31\u017d\n\31\3\31\5\31\u0180\n\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0195\n\31\3\32\3\32\5\32\u0199\n\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\7\33\u01a1\n\33\f\33\16\33\u01a4\13\33\3\33"+
		"\7\33\u01a7\n\33\f\33\16\33\u01aa\13\33\3\33\3\33\3\33\7\33\u01af\n\33"+
		"\f\33\16\33\u01b2\13\33\3\33\7\33\u01b5\n\33\f\33\16\33\u01b8\13\33\3"+
		"\34\3\34\5\34\u01bc\n\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u01c4\n\35"+
		"\f\35\16\35\u01c7\13\35\3\35\7\35\u01ca\n\35\f\35\16\35\u01cd\13\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\7\36\u01d5\n\36\f\36\16\36\u01d8\13\36\3"+
		"\36\7\36\u01db\n\36\f\36\16\36\u01de\13\36\3\36\3\36\3\36\3\37\3\37\5"+
		"\37\u01e5\n\37\3\37\3\37\3\37\3\37\5\37\u01eb\n\37\3\37\3\37\3\37\3\37"+
		"\5\37\u01f1\n\37\3\37\3\37\3\37\3\37\5\37\u01f7\n\37\3\37\5\37\u01fa\n"+
		"\37\3\37\3\37\5\37\u01fe\n\37\3\37\3\37\5\37\u0202\n\37\3 \3 \3 \3 \3"+
		" \3!\3!\5!\u020b\n!\3!\3!\3!\3\"\3\"\3\"\7\"\u0213\n\"\f\"\16\"\u0216"+
		"\13\"\3\"\5\"\u0219\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\5$\u0226\n"+
		"$\3$\3$\3$\3$\3$\3%\5%\u022e\n%\3%\3%\3%\3%\3%\5%\u0235\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u023e\n%\3&\3&\3&\7&\u0243\n&\f&\16&\u0246\13&\3&\3&\3&"+
		"\3&\3&\3&\3&\5&\u024f\n&\3&\3&\3&\3\'\3\'\3\'\7\'\u0257\n\'\f\'\16\'\u025a"+
		"\13\'\3\'\7\'\u025d\n\'\f\'\16\'\u0260\13\'\3(\3(\3(\3(\3(\7(\u0267\n"+
		"(\f(\16(\u026a\13(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0274\n(\f(\16(\u0277\13"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u0281\n)\3)\3)\3)\3*\3*\3*\3*\7*\u028a\n"+
		"*\f*\16*\u028d\13*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0298\n*\f*\16*\u029b"+
		"\13*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\5,\u02a8\n,\3,\3,\7,\u02ac\n,\f"+
		",\16,\u02af\13,\3,\3,\3-\3-\3-\5-\u02b6\n-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\7.\u02c9\n.\f.\16.\u02cc\13.\3.\3.\5.\u02d0\n"+
		".\3/\3/\3/\5/\u02d5\n/\3/\3/\7/\u02d9\n/\f/\16/\u02dc\13/\3/\3/\3\60\3"+
		"\60\3\60\5\60\u02e3\n\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u02f5\n\61\f\61\16\61\u02f8\13"+
		"\61\3\61\5\61\u02fb\n\61\3\62\3\62\3\62\5\62\u0300\n\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0310\n\63"+
		"\3\64\3\64\3\64\5\64\u0315\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u031d"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0325\n\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u032d\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0335\n"+
		"\64\3\64\3\64\3\64\5\64\u033a\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u035d"+
		"\n\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3;\3;\3;\5;\u036f\n;\3;\3"+
		";\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0383\n=\3>\3>\3"+
		">\5>\u0388\n>\3>\7>\u038b\n>\f>\16>\u038e\13>\3>\3>\3?\3?\3?\3?\5?\u0396"+
		"\n?\3?\3?\7?\u039a\n?\f?\16?\u039d\13?\3?\5?\u03a0\n?\3@\3@\3@\5@\u03a5"+
		"\n@\3@\3@\3@\3@\3@\3@\3@\5@\u03ae\n@\3@\3@\3@\5@\u03b3\n@\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\5A\u03e9\nA\3B\3B\3B\3B\3B\3B\3B\5B\u03f2\nB\3B\3B\3B\5B\u03f7"+
		"\nB\3C\3C\3C\5C\u03fc\nC\3C\7C\u03ff\nC\fC\16C\u0402\13C\3C\3C\3C\3C\5"+
		"C\u0408\nC\3C\3C\3C\3C\3C\5C\u040f\nC\3C\3C\3C\3C\3C\5C\u0416\nC\3C\5"+
		"C\u0419\nC\3D\3D\3D\3D\3D\3E\7E\u0421\nE\fE\16E\u0424\13E\3F\7F\u0427"+
		"\nF\fF\16F\u042a\13F\3F\3F\6F\u042e\nF\rF\16F\u042f\3F\3F\5F\u0434\nF"+
		"\3G\3G\3G\3G\7G\u043a\nG\fG\16G\u043d\13G\3G\5G\u0440\nG\3G\4\u00a1\u00e9"+
		"\2H\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\2\7\3\2\6\7\3\2\5\7\4\2\5\5MM\3\2\21\22\3\2=>\2\u049e\2\u008e\3\2\2\2"+
		"\4\u009a\3\2\2\2\6\u00a3\3\2\2\2\b\u00a5\3\2\2\2\n\u00b2\3\2\2\2\f\u00bc"+
		"\3\2\2\2\16\u00c1\3\2\2\2\20\u00dc\3\2\2\2\22\u00ec\3\2\2\2\24\u00ee\3"+
		"\2\2\2\26\u00f0\3\2\2\2\30\u00f2\3\2\2\2\32\u00f4\3\2\2\2\34\u00ff\3\2"+
		"\2\2\36\u0101\3\2\2\2 \u011e\3\2\2\2\"\u0121\3\2\2\2$\u0128\3\2\2\2&\u012e"+
		"\3\2\2\2(\u0133\3\2\2\2*\u0135\3\2\2\2,\u0137\3\2\2\2.\u0142\3\2\2\2\60"+
		"\u0194\3\2\2\2\62\u0196\3\2\2\2\64\u01a8\3\2\2\2\66\u01b9\3\2\2\28\u01cb"+
		"\3\2\2\2:\u01dc\3\2\2\2<\u0201\3\2\2\2>\u0203\3\2\2\2@\u0208\3\2\2\2B"+
		"\u0214\3\2\2\2D\u021d\3\2\2\2F\u0221\3\2\2\2H\u023d\3\2\2\2J\u024e\3\2"+
		"\2\2L\u025e\3\2\2\2N\u0275\3\2\2\2P\u0280\3\2\2\2R\u0285\3\2\2\2T\u029f"+
		"\3\2\2\2V\u02a4\3\2\2\2X\u02b2\3\2\2\2Z\u02cf\3\2\2\2\\\u02d1\3\2\2\2"+
		"^\u02df\3\2\2\2`\u02fa\3\2\2\2b\u02fc\3\2\2\2d\u030f\3\2\2\2f\u0339\3"+
		"\2\2\2h\u033b\3\2\2\2j\u0342\3\2\2\2l\u035c\3\2\2\2n\u035e\3\2\2\2p\u0364"+
		"\3\2\2\2r\u0369\3\2\2\2t\u036b\3\2\2\2v\u0373\3\2\2\2x\u0382\3\2\2\2z"+
		"\u0384\3\2\2\2|\u039f\3\2\2\2~\u03b2\3\2\2\2\u0080\u03e8\3\2\2\2\u0082"+
		"\u03f6\3\2\2\2\u0084\u0418\3\2\2\2\u0086\u041a\3\2\2\2\u0088\u0422\3\2"+
		"\2\2\u008a\u0433\3\2\2\2\u008c\u043f\3\2\2\2\u008e\u008f\5\4\3\2\u008f"+
		"\3\3\2\2\2\u0090\u0091\5\b\5\2\u0091\u0092\7\2\2\3\u0092\u009b\3\2\2\2"+
		"\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\7\2\2\3\u009a\u0090\3\2\2\2\u009a\u0096\3\2\2\2\u009b\5\3\2\2\2"+
		"\u009c\u00a4\5\n\6\2\u009d\u00a4\5t;\2\u009e\u00a0\13\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2"+
		"\2\2\u00a4\7\3\2\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a8\7<\2\2\u00a7\u00a9"+
		"\7M\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa"+
		"\u00ac\5\6\4\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7\4\2\2\u00b1\t\3\2\2\2\u00b2\u00b3\7\3\2\2\u00b3\u00b5\7/\2\2"+
		"\u00b4\u00b6\5,\27\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\b\6\1\2\u00b9\u00ba\7\4\2\2\u00ba"+
		"\13\3\2\2\2\u00bb\u00bd\5&\24\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2"+
		"\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5\16\b\2\u00bf\u00c0\b\7\1\2\u00c0"+
		"\r\3\2\2\2\u00c1\u00d6\b\b\1\2\u00c2\u00c3\7\3\2\2\u00c3\u00c9\7\61\2"+
		"\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\b\b\1\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d5\7\4\2\2\u00cd"+
		"\u00ce\7\3\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d0\7M\2\2\u00d0\u00d1\5\30"+
		"\r\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\b\b\1\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00c2\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\5\20\t\2\u00da\u00db\b\b\1\2\u00db\17\3\2\2\2\u00dc\u00e3\b\t\1"+
		"\2\u00dd\u00de\7\3\2\2\u00de\u00df\7\62\2\2\u00df\u00e0\5\30\r\2\u00e0"+
		"\u00e1\b\t\1\2\u00e1\u00e2\7\4\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00dd\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\b\t\1\2\u00e6"+
		"\u00e8\13\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00ea\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\21\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ed\5\u008cG\2\u00ed\23\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef\25\3\2\2"+
		"\2\u00f0\u00f1\7\b\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\7\t\2\2\u00f3\31\3"+
		"\2\2\2\u00f4\u00f5\7\13\2\2\u00f5\33\3\2\2\2\u00f6\u00f7\5\30\r\2\u00f7"+
		"\u00f8\b\17\1\2\u00f8\u0100\3\2\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb\7"+
		"\f\2\2\u00fb\u00fc\5\30\r\2\u00fc\u00fd\7\4\2\2\u00fd\u00fe\b\17\1\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f9\3\2\2\2\u0100\35\3\2\2"+
		"\2\u0101\u0102\7\3\2\2\u0102\u0103\7/\2\2\u0103\u0104\5 \21\2\u0104\u0105"+
		"\7\4\2\2\u0105\37\3\2\2\2\u0106\u0119\7\3\2\2\u0107\u010b\7\62\2\2\u0108"+
		"\u010a\5\30\r\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u011a\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0112\7\61\2\2\u010f\u0111\5\30\r\2\u0110\u010f\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011a\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7\61\2\2\u0116\u0117\5,\27\2\u0117\u0118\5"+
		"\30\r\2\u0118\u011a\3\2\2\2\u0119\u0107\3\2\2\2\u0119\u010e\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\7\4\2\2\u011c\u0106\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"!\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\7\5\2\2\u0122\u0124\7\5\2\2"+
		"\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\5\32\16\2\u0126\u0127\b\22\1\2\u0127#\3\2\2\2\u0128\u012a\7\5\2\2\u0129"+
		"\u012b\7\5\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\b\23\1\2\u012d%\3\2\2\2\u012e\u012f\7\3\2\2\u012f\u0130"+
		"\7.\2\2\u0130\u0131\5*\26\2\u0131\u0132\7\4\2\2\u0132\'\3\2\2\2\u0133"+
		"\u0134\t\3\2\2\u0134)\3\2\2\2\u0135\u0136\t\4\2\2\u0136+\3\2\2\2\u0137"+
		"\u0138\7M\2\2\u0138-\3\2\2\2\u0139\u013a\5\60\31\2\u013a\u013b\b\30\1"+
		"\2\u013b\u0143\3\2\2\2\u013c\u013d\5\66\34\2\u013d\u013e\b\30\1\2\u013e"+
		"\u0143\3\2\2\2\u013f\u0140\5<\37\2\u0140\u0141\b\30\1\2\u0141\u0143\3"+
		"\2\2\2\u0142\u0139\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u013f\3\2\2\2\u0143"+
		"/\3\2\2\2\u0144\u0145\7\17\2\2\u0145\u0195\b\31\1\2\u0146\u0147\7\r\2"+
		"\2\u0147\u0195\b\31\1\2\u0148\u0149\7\16\2\2\u0149\u0195\b\31\1\2\u014a"+
		"\u014b\7\20\2\2\u014b\u0195\b\31\1\2\u014c\u014d\7\33\2\2\u014d\u0195"+
		"\b\31\1\2\u014e\u014f\7\24\2\2\u014f\u0195\5*\26\2\u0150\u0151\7\25\2"+
		"\2\u0151\u0195\5*\26\2\u0152\u0154\7\26\2\2\u0153\u0155\5*\26\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0195\3\2\2\2\u0158\u0159\7\27\2\2\u0159\u0195\b\31\1\2\u015a"+
		"\u015b\7\34\2\2\u015b\u015c\5*\26\2\u015c\u015d\b\31\1\2\u015d\u0195\3"+
		"\2\2\2\u015e\u015f\7\36\2\2\u015f\u0160\5*\26\2\u0160\u0161\b\31\1\2\u0161"+
		"\u0195\3\2\2\2\u0162\u0163\7\37\2\2\u0163\u0164\5*\26\2\u0164\u0165\b"+
		"\31\1\2\u0165\u0195\3\2\2\2\u0166\u0167\7 \2\2\u0167\u0168\5*\26\2\u0168"+
		"\u0169\b\31\1\2\u0169\u0195\3\2\2\2\u016a\u016b\7!\2\2\u016b\u016c\5*"+
		"\26\2\u016c\u016d\b\31\1\2\u016d\u0195\3\2\2\2\u016e\u016f\7\"\2\2\u016f"+
		"\u0170\5*\26\2\u0170\u0171\b\31\1\2\u0171\u0195\3\2\2\2\u0172\u0174\7"+
		"#\2\2\u0173\u0175\7%\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0178\7&\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u0195\b\31\1\2\u017a\u017c\7$\2\2\u017b"+
		"\u017d\7%\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u0180\7&\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0195\b\31\1\2\u0182\u0183\7,\2\2\u0183\u0195\b\31"+
		"\1\2\u0184\u0185\7-\2\2\u0185\u0195\b\31\1\2\u0186\u0187\7\n\2\2\u0187"+
		"\u0188\5(\25\2\u0188\u0189\b\31\1\2\u0189\u0195\3\2\2\2\u018a\u018b\7"+
		")\2\2\u018b\u0195\b\31\1\2\u018c\u018d\7*\2\2\u018d\u0195\b\31\1\2\u018e"+
		"\u018f\7\'\2\2\u018f\u0195\b\31\1\2\u0190\u0191\7(\2\2\u0191\u0195\b\31"+
		"\1\2\u0192\u0193\7+\2\2\u0193\u0195\b\31\1\2\u0194\u0144\3\2\2\2\u0194"+
		"\u0146\3\2\2\2\u0194\u0148\3\2\2\2\u0194\u014a\3\2\2\2\u0194\u014c\3\2"+
		"\2\2\u0194\u014e\3\2\2\2\u0194\u0150\3\2\2\2\u0194\u0152\3\2\2\2\u0194"+
		"\u0158\3\2\2\2\u0194\u015a\3\2\2\2\u0194\u015e\3\2\2\2\u0194\u0162\3\2"+
		"\2\2\u0194\u0166\3\2\2\2\u0194\u016a\3\2\2\2\u0194\u016e\3\2\2\2\u0194"+
		"\u0172\3\2\2\2\u0194\u017a\3\2\2\2\u0194\u0182\3\2\2\2\u0194\u0184\3\2"+
		"\2\2\u0194\u0186\3\2\2\2\u0194\u018a\3\2\2\2\u0194\u018c\3\2\2\2\u0194"+
		"\u018e\3\2\2\2\u0194\u0190\3\2\2\2\u0194\u0192\3\2\2\2\u0195\61\3\2\2"+
		"\2\u0196\u0198\7\35\2\2\u0197\u0199\5&\24\2\u0198\u0197\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\64\33\2\u019b\u019c\b"+
		"\32\1\2\u019c\63\3\2\2\2\u019d\u019e\7\3\2\2\u019e\u01a2\7\61\2\2\u019f"+
		"\u01a1\5\30\r\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3"+
		"\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a7\7\4\2\2\u01a6\u019d\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01b6\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ac\7\3\2\2\u01ac\u01b0\7\62\2\2\u01ad\u01af\5\30\r\2\u01ae\u01ad\3"+
		"\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\7\4\2\2\u01b4\u01ab\3\2"+
		"\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\65\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\7\35\2\2\u01ba\u01bc\5&\24"+
		"\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be"+
		"\58\35\2\u01be\u01bf\b\34\1\2\u01bf\67\3\2\2\2\u01c0\u01c1\7\3\2\2\u01c1"+
		"\u01c5\7\61\2\2\u01c2\u01c4\5\30\r\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3"+
		"\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01ca\7\4\2\2\u01c9\u01c0\3\2\2\2\u01ca\u01cd\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01cf\5:\36\2\u01cf\u01d0\b\35\1\2\u01d09\3\2\2\2"+
		"\u01d1\u01d2\7\3\2\2\u01d2\u01d6\7\62\2\2\u01d3\u01d5\5\30\r\2\u01d4\u01d3"+
		"\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\7\4\2\2\u01da\u01d1\3\2"+
		"\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\5.\30\2\u01e0\u01e1\b\36"+
		"\1\2\u01e1;\3\2\2\2\u01e2\u01e4\t\5\2\2\u01e3\u01e5\5,\27\2\u01e4\u01e3"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\b\37\1\2"+
		"\u01e7\u01e8\5@!\2\u01e8\u01ea\7\23\2\2\u01e9\u01eb\5,\27\2\u01ea\u01e9"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\b\37\1\2"+
		"\u01ed\u0202\3\2\2\2\u01ee\u01f0\7\30\2\2\u01ef\u01f1\5,\27\2\u01f0\u01ef"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f9\5@!\2\u01f3"+
		"\u01f4\b\37\1\2\u01f4\u01f6\7\32\2\2\u01f5\u01f7\5,\27\2\u01f6\u01f5\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\5B\"\2\u01f9"+
		"\u01f3\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\7\23"+
		"\2\2\u01fc\u01fe\5,\27\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\b\37\1\2\u0200\u0202\3\2\2\2\u0201\u01e2\3"+
		"\2\2\2\u0201\u01ee\3\2\2\2\u0202=\3\2\2\2\u0203\u0204\7\3\2\2\u0204\u0205"+
		"\7\62\2\2\u0205\u0206\5\30\r\2\u0206\u0207\7\4\2\2\u0207?\3\2\2\2\u0208"+
		"\u020a\b!\1\2\u0209\u020b\5> \2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u020d\5B\"\2\u020d\u020e\b!\1\2\u020eA\3"+
		"\2\2\2\u020f\u0210\5.\30\2\u0210\u0211\b\"\1\2\u0211\u0213\3\2\2\2\u0212"+
		"\u020f\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\5\62\32\2\u0218"+
		"\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\b\""+
		"\1\2\u021b\u021c\b\"\1\2\u021cC\3\2\2\2\u021d\u021e\b#\1\2\u021e\u021f"+
		"\5B\"\2\u021f\u0220\b#\1\2\u0220E\3\2\2\2\u0221\u0222\b$\1\2\u0222\u0223"+
		"\7\3\2\2\u0223\u0225\7/\2\2\u0224\u0226\5,\27\2\u0225\u0224\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\b$\1\2\u0228\u0229\5H%"+
		"\2\u0229\u022a\b$\1\2\u022a\u022b\7\4\2\2\u022bG\3\2\2\2\u022c\u022e\5"+
		"&\24\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\5N(\2\u0230\u0231\b%\1\2\u0231\u023e\3\2\2\2\u0232\u0234\5j\66"+
		"\2\u0233\u0235\5&\24\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\5J&\2\u0237\u0238\b%\1\2\u0238\u023e\3\2\2\2\u0239"+
		"\u023a\5p9\2\u023a\u023b\5H%\2\u023b\u023c\b%\1\2\u023c\u023e\3\2\2\2"+
		"\u023d\u022d\3\2\2\2\u023d\u0232\3\2\2\2\u023d\u0239\3\2\2\2\u023eI\3"+
		"\2\2\2\u023f\u0240\7\3\2\2\u0240\u0244\7\61\2\2\u0241\u0243\5\30\r\2\u0242"+
		"\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2"+
		"\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024f\7\4\2\2\u0248"+
		"\u0249\7\3\2\2\u0249\u024a\7\61\2\2\u024a\u024b\5,\27\2\u024b\u024c\5"+
		"\30\r\2\u024c\u024d\7\4\2\2\u024d\u024f\3\2\2\2\u024e\u023f\3\2\2\2\u024e"+
		"\u0248\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\5L\'\2\u0251\u0252\b&\1"+
		"\2\u0252K\3\2\2\2\u0253\u0254\7\3\2\2\u0254\u0258\7\62\2\2\u0255\u0257"+
		"\5\30\r\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2"+
		"\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025d"+
		"\7\4\2\2\u025c\u0253\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025fM\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7\3\2\2"+
		"\u0262\u0268\7\61\2\2\u0263\u0264\5\30\r\2\u0264\u0265\b(\1\2\u0265\u0267"+
		"\3\2\2\2\u0266\u0263\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u0274\7\4"+
		"\2\2\u026c\u026d\7\3\2\2\u026d\u026e\7\61\2\2\u026e\u026f\7M\2\2\u026f"+
		"\u0270\5\30\r\2\u0270\u0271\7\4\2\2\u0271\u0272\b(\1\2\u0272\u0274\3\2"+
		"\2\2\u0273\u0261\3\2\2\2\u0273\u026c\3\2\2\2\u0274\u0277\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278\u0279\5P)\2\u0279\u027a\b(\1\2\u027aO\3\2\2\2\u027b\u027c\7"+
		"\3\2\2\u027c\u027d\7\62\2\2\u027d\u027e\5\30\r\2\u027e\u027f\7\4\2\2\u027f"+
		"\u0281\3\2\2\2\u0280\u027b\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0283\5R*\2\u0283\u0284\b)\1\2\u0284Q\3\2\2\2\u0285\u0299\b"+
		"*\1\2\u0286\u0287\7\3\2\2\u0287\u028b\7\63\2\2\u0288\u028a\5\30\r\2\u0289"+
		"\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\b*\1\2\u028f"+
		"\u0298\7\4\2\2\u0290\u0291\7\3\2\2\u0291\u0292\7\63\2\2\u0292\u0293\5"+
		",\27\2\u0293\u0294\5\30\r\2\u0294\u0295\7\4\2\2\u0295\u0296\b*\1\2\u0296"+
		"\u0298\3\2\2\2\u0297\u0286\3\2\2\2\u0297\u0290\3\2\2\2\u0298\u029b\3\2"+
		"\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029c\u029d\5B\"\2\u029d\u029e\b*\1\2\u029eS\3\2\2\2\u029f"+
		"\u02a0\7\3\2\2\u02a0\u02a1\79\2\2\u02a1\u02a2\5D#\2\u02a2\u02a3\7\4\2"+
		"\2\u02a3U\3\2\2\2\u02a4\u02a5\7\3\2\2\u02a5\u02a7\7\67\2\2\u02a6\u02a8"+
		"\5*\26\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02ad\5T+\2\u02aa\u02ac\5*\26\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2"+
		"\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad"+
		"\3\2\2\2\u02b0\u02b1\7\4\2\2\u02b1W\3\2\2\2\u02b2\u02b3\7\3\2\2\u02b3"+
		"\u02b5\7\65\2\2\u02b4\u02b6\5,\27\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3"+
		"\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\5Z.\2\u02b8\u02b9\7\4\2\2\u02b9"+
		"\u02ba\b-\1\2\u02baY\3\2\2\2\u02bb\u02bc\5\"\22\2\u02bc\u02bd\b.\1\2\u02bd"+
		"\u02d0\3\2\2\2\u02be\u02bf\5j\66\2\u02bf\u02c0\5\"\22\2\u02c0\u02d0\3"+
		"\2\2\2\u02c1\u02c2\5p9\2\u02c2\u02c3\5Z.\2\u02c3\u02d0\3\2\2\2\u02c4\u02c5"+
		"\5\32\16\2\u02c5\u02c6\7\3\2\2\u02c6\u02ca\7\67\2\2\u02c7\u02c9\5*\26"+
		"\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\7\4\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02bb\3\2\2\2\u02cf\u02be\3\2\2\2\u02cf\u02c1\3\2"+
		"\2\2\u02cf\u02c4\3\2\2\2\u02d0[\3\2\2\2\u02d1\u02d2\7\3\2\2\u02d2\u02d4"+
		"\78\2\2\u02d3\u02d5\5*\26\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02da\5T+\2\u02d7\u02d9\7\b\2\2\u02d8\u02d7\3\2\2"+
		"\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd"+
		"\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02de\7\4\2\2\u02de]\3\2\2\2\u02df"+
		"\u02e0\7\3\2\2\u02e0\u02e2\7\66\2\2\u02e1\u02e3\5,\27\2\u02e2\u02e1\3"+
		"\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\5`\61\2\u02e5"+
		"\u02e6\7\4\2\2\u02e6\u02e7\b\60\1\2\u02e7_\3\2\2\2\u02e8\u02e9\5$\23\2"+
		"\u02e9\u02ea\b\61\1\2\u02ea\u02fb\3\2\2\2\u02eb\u02ec\5j\66\2\u02ec\u02ed"+
		"\5$\23\2\u02ed\u02fb\3\2\2\2\u02ee\u02ef\5p9\2\u02ef\u02f0\5`\61\2\u02f0"+
		"\u02fb\3\2\2\2\u02f1\u02f2\7\3\2\2\u02f2\u02f6\78\2\2\u02f3\u02f5\7\b"+
		"\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fb\7\4"+
		"\2\2\u02fa\u02e8\3\2\2\2\u02fa\u02eb\3\2\2\2\u02fa\u02ee\3\2\2\2\u02fa"+
		"\u02f1\3\2\2\2\u02fba\3\2\2\2\u02fc\u02fd\7\3\2\2\u02fd\u02ff\7\64\2\2"+
		"\u02fe\u0300\5,\27\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301"+
		"\3\2\2\2\u0301\u0302\5d\63\2\u0302\u0303\7\4\2\2\u0303\u0304\b\62\1\2"+
		"\u0304c\3\2\2\2\u0305\u0306\5\34\17\2\u0306\u0307\5D#\2\u0307\u0308\b"+
		"\63\1\2\u0308\u0310\3\2\2\2\u0309\u030a\5j\66\2\u030a\u030b\5\34\17\2"+
		"\u030b\u0310\3\2\2\2\u030c\u030d\5p9\2\u030d\u030e\5d\63\2\u030e\u0310"+
		"\3\2\2\2\u030f\u0305\3\2\2\2\u030f\u0309\3\2\2\2\u030f\u030c\3\2\2\2\u0310"+
		"e\3\2\2\2\u0311\u0312\7\3\2\2\u0312\u0314\7/\2\2\u0313\u0315\5,\27\2\u0314"+
		"\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\5&"+
		"\24\2\u0317\u0318\7\4\2\2\u0318\u033a\3\2\2\2\u0319\u031a\7\3\2\2\u031a"+
		"\u031c\7/\2\2\u031b\u031d\5,\27\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031e\u031f\5 \21\2\u031f\u0320\7\4\2\2\u0320"+
		"\u033a\3\2\2\2\u0321\u0322\7\3\2\2\u0322\u0324\7\65\2\2\u0323\u0325\5"+
		",\27\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0327\5\"\22\2\u0327\u0328\7\4\2\2\u0328\u033a\3\2\2\2\u0329\u032a\7"+
		"\3\2\2\u032a\u032c\7\66\2\2\u032b\u032d\5,\27\2\u032c\u032b\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\5$\23\2\u032f\u0330\7\4"+
		"\2\2\u0330\u033a\3\2\2\2\u0331\u0332\7\3\2\2\u0332\u0334\7\64\2\2\u0333"+
		"\u0335\5,\27\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u0337\5\34\17\2\u0337\u0338\7\4\2\2\u0338\u033a\3\2\2\2\u0339"+
		"\u0311\3\2\2\2\u0339\u0319\3\2\2\2\u0339\u0321\3\2\2\2\u0339\u0329\3\2"+
		"\2\2\u0339\u0331\3\2\2\2\u033ag\3\2\2\2\u033b\u033c\7\3\2\2\u033c\u033d"+
		"\7:\2\2\u033d\u033e\5\26\f\2\u033e\u033f\5\26\f\2\u033f\u0340\5f\64\2"+
		"\u0340\u0341\7\4\2\2\u0341i\3\2\2\2\u0342\u0343\7\3\2\2\u0343\u0344\7"+
		":\2\2\u0344\u0345\5\26\f\2\u0345\u0346\5\26\f\2\u0346\u0347\7\4\2\2\u0347"+
		"k\3\2\2\2\u0348\u0349\7\3\2\2\u0349\u034a\7/\2\2\u034a\u034b\5*\26\2\u034b"+
		"\u034c\7\4\2\2\u034c\u035d\3\2\2\2\u034d\u034e\7\3\2\2\u034e\u034f\7\65"+
		"\2\2\u034f\u0350\5*\26\2\u0350\u0351\7\4\2\2\u0351\u035d\3\2\2\2\u0352"+
		"\u0353\7\3\2\2\u0353\u0354\7\66\2\2\u0354\u0355\5*\26\2\u0355\u0356\7"+
		"\4\2\2\u0356\u035d\3\2\2\2\u0357\u0358\7\3\2\2\u0358\u0359\7\64\2\2\u0359"+
		"\u035a\5*\26\2\u035a\u035b\7\4\2\2\u035b\u035d\3\2\2\2\u035c\u0348\3\2"+
		"\2\2\u035c\u034d\3\2\2\2\u035c\u0352\3\2\2\2\u035c\u0357\3\2\2\2\u035d"+
		"m\3\2\2\2\u035e\u035f\7\3\2\2\u035f\u0360\7;\2\2\u0360\u0361\5\26\f\2"+
		"\u0361\u0362\5l\67\2\u0362\u0363\7\4\2\2\u0363o\3\2\2\2\u0364\u0365\7"+
		"\3\2\2\u0365\u0366\7;\2\2\u0366\u0367\5\26\f\2\u0367\u0368\7\4\2\2\u0368"+
		"q\3\2\2\2\u0369\u036a\5\36\20\2\u036as\3\2\2\2\u036b\u036c\7\3\2\2\u036c"+
		"\u036e\7.\2\2\u036d\u036f\5,\27\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2"+
		"\2\2\u036f\u0370\3\2\2\2\u0370\u0371\5r:\2\u0371\u0372\7\4\2\2\u0372u"+
		"\3\2\2\2\u0373\u0374\7\3\2\2\u0374\u0375\7\60\2\2\u0375\u0376\5*\26\2"+
		"\u0376\u0377\7\4\2\2\u0377w\3\2\2\2\u0378\u0383\5t;\2\u0379\u0383\5b\62"+
		"\2\u037a\u0383\5X-\2\u037b\u0383\5^\60\2\u037c\u0383\5F$\2\u037d\u0383"+
		"\5V,\2\u037e\u0383\5\\/\2\u037f\u0383\5v<\2\u0380\u0383\5h\65\2\u0381"+
		"\u0383\5n8\2\u0382\u0378\3\2\2\2\u0382\u0379\3\2\2\2\u0382\u037a\3\2\2"+
		"\2\u0382\u037b\3\2\2\2\u0382\u037c\3\2\2\2\u0382\u037d\3\2\2\2\u0382\u037e"+
		"\3\2\2\2\u0382\u037f\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0381\3\2\2\2\u0383"+
		"y\3\2\2\2\u0384\u0385\7\3\2\2\u0385\u0387\7<\2\2\u0386\u0388\7M\2\2\u0387"+
		"\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038c\3\2\2\2\u0389\u038b\5x"+
		"=\2\u038a\u0389\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u038f\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0390\7\4"+
		"\2\2\u0390{\3\2\2\2\u0391\u03a0\5z>\2\u0392\u0393\7\3\2\2\u0393\u0395"+
		"\7<\2\2\u0394\u0396\7M\2\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u039b\t\6\2\2\u0398\u039a\7\b\2\2\u0399\u0398\3\2"+
		"\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a0\7\4\2\2\u039f\u0391\3\2"+
		"\2\2\u039f\u0392\3\2\2\2\u03a0}\3\2\2\2\u03a1\u03a2\7\3\2\2\u03a2\u03a4"+
		"\7A\2\2\u03a3\u03a5\7M\2\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u03a7\5\26\f\2\u03a7\u03a8\5\u0088E\2\u03a8\u03a9"+
		"\7\4\2\2\u03a9\u03b3\3\2\2\2\u03aa\u03ab\7\3\2\2\u03ab\u03ad\7B\2\2\u03ac"+
		"\u03ae\7M\2\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2"+
		"\2\2\u03af\u03b0\5\26\f\2\u03b0\u03b1\7\4\2\2\u03b1\u03b3\3\2\2\2\u03b2"+
		"\u03a1\3\2\2\2\u03b2\u03aa\3\2\2\2\u03b3\177\3\2\2\2\u03b4\u03b5\7\3\2"+
		"\2\u03b5\u03b6\7C\2\2\u03b6\u03b7\5|?\2\u03b7\u03b8\7\b\2\2\u03b8\u03b9"+
		"\7\4\2\2\u03b9\u03e9\3\2\2\2\u03ba\u03bb\7\3\2\2\u03bb\u03bc\7D\2\2\u03bc"+
		"\u03bd\5|?\2\u03bd\u03be\7\b\2\2\u03be\u03bf\7\4\2\2\u03bf\u03e9\3\2\2"+
		"\2\u03c0\u03c1\7\3\2\2\u03c1\u03c2\7E\2\2\u03c2\u03c3\5|?\2\u03c3\u03c4"+
		"\7\b\2\2\u03c4\u03c5\7\4\2\2\u03c5\u03e9\3\2\2\2\u03c6\u03c7\7\3\2\2\u03c7"+
		"\u03c8\7I\2\2\u03c8\u03c9\5|?\2\u03c9\u03ca\7\b\2\2\u03ca\u03cb\7\4\2"+
		"\2\u03cb\u03e9\3\2\2\2\u03cc\u03cd\7\3\2\2\u03cd\u03ce\7F\2\2\u03ce\u03cf"+
		"\5~@\2\u03cf\u03d0\5\u0088E\2\u03d0\u03d1\7\4\2\2\u03d1\u03e9\3\2\2\2"+
		"\u03d2\u03d3\7\3\2\2\u03d3\u03d4\7G\2\2\u03d4\u03d5\5~@\2\u03d5\u03d6"+
		"\7\4\2\2\u03d6\u03e9\3\2\2\2\u03d7\u03d8\7\3\2\2\u03d8\u03d9\7H\2\2\u03d9"+
		"\u03da\5~@\2\u03da\u03db\7\4\2\2\u03db\u03e9\3\2\2\2\u03dc\u03dd\7\3\2"+
		"\2\u03dd\u03de\7I\2\2\u03de\u03df\5~@\2\u03df\u03e0\7\b\2\2\u03e0\u03e1"+
		"\7\4\2\2\u03e1\u03e9\3\2\2\2\u03e2\u03e3\7\3\2\2\u03e3\u03e4\7J\2\2\u03e4"+
		"\u03e5\5~@\2\u03e5\u03e6\7\b\2\2\u03e6\u03e7\7\4\2\2\u03e7\u03e9\3\2\2"+
		"\2\u03e8\u03b4\3\2\2\2\u03e8\u03ba\3\2\2\2\u03e8\u03c0\3\2\2\2\u03e8\u03c6"+
		"\3\2\2\2\u03e8\u03cc\3\2\2\2\u03e8\u03d2\3\2\2\2\u03e8\u03d7\3\2\2\2\u03e8"+
		"\u03dc\3\2\2\2\u03e8\u03e2\3\2\2\2\u03e9\u0081\3\2\2\2\u03ea\u03f7\5~"+
		"@\2\u03eb\u03f7\5\u0080A\2\u03ec\u03f7\5|?\2\u03ed\u03ee\7\3\2\2\u03ee"+
		"\u03ef\7@\2\2\u03ef\u03f1\5\26\f\2\u03f0\u03f2\7M\2\2\u03f1\u03f0\3\2"+
		"\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\7\4\2\2\u03f4"+
		"\u03f7\3\2\2\2\u03f5\u03f7\5\u0084C\2\u03f6\u03ea\3\2\2\2\u03f6\u03eb"+
		"\3\2\2\2\u03f6\u03ec\3\2\2\2\u03f6\u03ed\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7"+
		"\u0083\3\2\2\2\u03f8\u03f9\7\3\2\2\u03f9\u03fb\7?\2\2\u03fa\u03fc\7M\2"+
		"\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0400\3\2\2\2\u03fd\u03ff"+
		"\5\u0082B\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2"+
		"\2\u0400\u0401\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0419"+
		"\7\4\2\2\u0404\u0405\7\3\2\2\u0405\u0407\7K\2\2\u0406\u0408\7M\2\2\u0407"+
		"\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\7\b"+
		"\2\2\u040a\u0419\7\4\2\2\u040b\u040c\7\3\2\2\u040c\u040e\7L\2\2\u040d"+
		"\u040f\7M\2\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0411\7\b\2\2\u0411\u0419\7\4\2\2\u0412\u0413\7\3\2\2\u0413"+
		"\u0415\7L\2\2\u0414\u0416\7M\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2"+
		"\2\u0416\u0417\3\2\2\2\u0417\u0419\7\4\2\2\u0418\u03f8\3\2\2\2\u0418\u0404"+
		"\3\2\2\2\u0418\u040b\3\2\2\2\u0418\u0412\3\2\2\2\u0419\u0085\3\2\2\2\u041a"+
		"\u041b\7\3\2\2\u041b\u041c\7\n\2\2\u041c\u041d\5(\25\2\u041d\u041e\7\4"+
		"\2\2\u041e\u0087\3\2\2\2\u041f\u0421\5\u0086D\2\u0420\u041f\3\2\2\2\u0421"+
		"\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0089\3\2"+
		"\2\2\u0424\u0422\3\2\2\2\u0425\u0427\5\u0082B\2\u0426\u0425\3\2\2\2\u0427"+
		"\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\3\2"+
		"\2\2\u042a\u0428\3\2\2\2\u042b\u0434\7\2\2\3\u042c\u042e\5x=\2\u042d\u042c"+
		"\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0432\7\2\2\3\u0432\u0434\3\2\2\2\u0433\u0428\3\2"+
		"\2\2\u0433\u042d\3\2\2\2\u0434\u008b\3\2\2\2\u0435\u0436\5z>\2\u0436\u0437"+
		"\7\2\2\3\u0437\u0440\3\2\2\2\u0438\u043a\5x=\2\u0439\u0438\3\2\2\2\u043a"+
		"\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043e\3\2"+
		"\2\2\u043d\u043b\3\2\2\2\u043e\u0440\7\2\2\3\u043f\u0435\3\2\2\2\u043f"+
		"\u043b\3\2\2\2\u0440\u008d\3\2\2\2l\u0096\u009a\u00a1\u00a3\u00a8\u00ad"+
		"\u00b5\u00bc\u00c9\u00d4\u00d6\u00e3\u00e9\u00ff\u010b\u0112\u0119\u011e"+
		"\u0123\u012a\u0142\u0156\u0174\u0177\u017c\u017f\u0194\u0198\u01a2\u01a8"+
		"\u01b0\u01b6\u01bb\u01c5\u01cb\u01d6\u01dc\u01e4\u01ea\u01f0\u01f6\u01f9"+
		"\u01fd\u0201\u020a\u0214\u0218\u0225\u022d\u0234\u023d\u0244\u024e\u0258"+
		"\u025e\u0268\u0273\u0275\u0280\u028b\u0297\u0299\u02a7\u02ad\u02b5\u02ca"+
		"\u02cf\u02d4\u02da\u02e2\u02f6\u02fa\u02ff\u030f\u0314\u031c\u0324\u032c"+
		"\u0334\u0339\u035c\u036e\u0382\u0387\u038c\u0395\u039b\u039f\u03a4\u03ad"+
		"\u03b2\u03e8\u03f1\u03f6\u03fb\u0400\u0407\u040e\u0415\u0418\u0422\u0428"+
		"\u042f\u0433\u043b\u043f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}