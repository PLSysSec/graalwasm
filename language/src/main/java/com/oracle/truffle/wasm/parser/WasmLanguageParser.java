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
		RULE_wasmtypepass = 0, RULE_moduleTP = 1, RULE_module_fieldTP = 2, RULE_module_TP = 3, 
		RULE_funcTP = 4, RULE_func_fieldsTP = 5, RULE_func_fields_bodyTP = 6, 
		RULE_func_result_bodyTP = 7, RULE_type_defTP = 8, RULE_wasmlanguage = 9, 
		RULE_value = 10, RULE_name = 11, RULE_value_type = 12, RULE_elem_type = 13, 
		RULE_global_type = 14, RULE_def_type = 15, RULE_func_type = 16, RULE_table_type = 17, 
		RULE_memory_type = 18, RULE_type_use = 19, RULE_literal = 20, RULE_var = 21, 
		RULE_bind_var = 22, RULE_instr = 23, RULE_plain_instr = 24, RULE_call_instr = 25, 
		RULE_call_instr_params = 26, RULE_call_instr_instr = 27, RULE_call_instr_params_instr = 28, 
		RULE_call_instr_results_instr = 29, RULE_block_instr = 30, RULE_block_type = 31, 
		RULE_block = 32, RULE_instr_list = 33, RULE_const_expr = 34, RULE_func = 35, 
		RULE_func_fields = 36, RULE_func_fields_import = 37, RULE_func_fields_import_result = 38, 
		RULE_func_fields_body = 39, RULE_func_result_body = 40, RULE_func_body = 41, 
		RULE_offset = 42, RULE_elem = 43, RULE_table = 44, RULE_table_fields = 45, 
		RULE_data = 46, RULE_memory = 47, RULE_memory_fields = 48, RULE_sglobal = 49, 
		RULE_global_fields = 50, RULE_import_desc = 51, RULE_simport = 52, RULE_inline_import = 53, 
		RULE_export_desc = 54, RULE_export = 55, RULE_inline_export = 56, RULE_type_ = 57, 
		RULE_type_def = 58, RULE_start = 59, RULE_module_field = 60, RULE_module_ = 61, 
		RULE_script_module = 62, RULE_action = 63, RULE_assertion = 64, RULE_cmd = 65, 
		RULE_meta = 66, RULE_wconst = 67, RULE_const_list = 68, RULE_script = 69, 
		RULE_module = 70;
	public static final String[] ruleNames = {
		"wasmtypepass", "moduleTP", "module_fieldTP", "module_TP", "funcTP", "func_fieldsTP", 
		"func_fields_bodyTP", "func_result_bodyTP", "type_defTP", "wasmlanguage", 
		"value", "name", "value_type", "elem_type", "global_type", "def_type", 
		"func_type", "table_type", "memory_type", "type_use", "literal", "var", 
		"bind_var", "instr", "plain_instr", "call_instr", "call_instr_params", 
		"call_instr_instr", "call_instr_params_instr", "call_instr_results_instr", 
		"block_instr", "block_type", "block", "instr_list", "const_expr", "func", 
		"func_fields", "func_fields_import", "func_fields_import_result", "func_fields_body", 
		"func_result_body", "func_body", "offset", "elem", "table", "table_fields", 
		"data", "memory", "memory_fields", "sglobal", "global_fields", "import_desc", 
		"simport", "inline_import", "export_desc", "export", "inline_export", 
		"type_", "type_def", "start", "module_field", "module_", "script_module", 
		"action", "assertion", "cmd", "meta", "wconst", "const_list", "script", 
		"module"
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
	private static int numType;

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
	    numType = 0;
	    parser.wasmtypepass();
	    parser.reset();
	    numFunc = 0;
	    numType = 0;
	    parser.wasmlanguage();
	    return parser.factory.getAllFunctions();
	}

	public WasmLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WasmtypepassContext extends ParserRuleContext {
		public ModuleTPContext moduleTP() {
			return getRuleContext(ModuleTPContext.class,0);
		}
		public WasmtypepassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wasmtypepass; }
	}

	public final WasmtypepassContext wasmtypepass() throws RecognitionException {
		WasmtypepassContext _localctx = new WasmtypepassContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wasmtypepass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			moduleTP();
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

	public static class ModuleTPContext extends ParserRuleContext {
		public Module_TPContext module_TP() {
			return getRuleContext(Module_TPContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WasmLanguageParser.EOF, 0); }
		public List<Module_fieldTPContext> module_fieldTP() {
			return getRuleContexts(Module_fieldTPContext.class);
		}
		public Module_fieldTPContext module_fieldTP(int i) {
			return getRuleContext(Module_fieldTPContext.class,i);
		}
		public ModuleTPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleTP; }
	}

	public final ModuleTPContext moduleTP() throws RecognitionException {
		ModuleTPContext _localctx = new ModuleTPContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleTP);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				module_TP();
				setState(145);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << RPAR) | (1L << NAT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VALUE_TYPE) | (1L << CONST) | (1L << FUNCREF) | (1L << MUT) | (1L << PRINT) | (1L << NOP) | (1L << UNREACHABLE) | (1L << DROP) | (1L << BLOCK) | (1L << LOOP) | (1L << END) | (1L << BR) | (1L << BR_IF) | (1L << BR_TABLE) | (1L << RETURN) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << SELECT) | (1L << CALL) | (1L << CALL_INDIRECT) | (1L << LOCAL_GET) | (1L << LOCAL_SET) | (1L << LOCAL_TEE) | (1L << GLOBAL_GET) | (1L << GLOBAL_SET) | (1L << LOAD) | (1L << STORE) | (1L << OFFSET_EQ_NAT) | (1L << ALIGN_EQ_NAT) | (1L << UNARY) | (1L << BINARY) | (1L << TEST) | (1L << COMPARE) | (1L << CONVERT) | (1L << MEMORY_SIZE) | (1L << MEMORY_GROW) | (1L << TYPE) | (1L << FUNC) | (1L << START) | (1L << PARAM) | (1L << RESULT) | (1L << LOCAL) | (1L << GLOBAL) | (1L << TABLE) | (1L << MEMORY) | (1L << ELEM) | (1L << DATA) | (1L << OFFSET) | (1L << IMPORT) | (1L << EXPORT) | (1L << MODULE) | (1L << BIN) | (1L << QUOTE) | (1L << SCRIPT) | (1L << REGISTER) | (1L << INVOKE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GET - 64)) | (1L << (ASSERT_MALFORMED - 64)) | (1L << (ASSERT_INVALID - 64)) | (1L << (ASSERT_UNLINKABLE - 64)) | (1L << (ASSERT_RETURN - 64)) | (1L << (ASSERT_RETURN_CANONICAL_NAN - 64)) | (1L << (ASSERT_RETURN_ARITHMETIC_NAN - 64)) | (1L << (ASSERT_TRAP - 64)) | (1L << (ASSERT_EXHAUSTION - 64)) | (1L << (INPUT - 64)) | (1L << (OUTPUT - 64)) | (1L << (VAR - 64)) | (1L << (SPACE - 64)) | (1L << (COMMENT - 64)))) != 0)) {
					{
					{
					setState(147);
					module_fieldTP();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
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

	public static class Module_fieldTPContext extends ParserRuleContext {
		public FuncTPContext funcTP() {
			return getRuleContext(FuncTPContext.class,0);
		}
		public Type_defTPContext type_defTP() {
			return getRuleContext(Type_defTPContext.class,0);
		}
		public Module_fieldTPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_fieldTP; }
	}

	public final Module_fieldTPContext module_fieldTP() throws RecognitionException {
		Module_fieldTPContext _localctx = new Module_fieldTPContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module_fieldTP);
		try {
			int _alt;
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				funcTP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				type_defTP();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(158);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(161); 
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

	public static class Module_TPContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode MODULE() { return getToken(WasmLanguageParser.MODULE, 0); }
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public List<Module_fieldTPContext> module_fieldTP() {
			return getRuleContexts(Module_fieldTPContext.class);
		}
		public Module_fieldTPContext module_fieldTP(int i) {
			return getRuleContext(Module_fieldTPContext.class,i);
		}
		public Module_TPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_TP; }
	}

	public final Module_TPContext module_TP() throws RecognitionException {
		Module_TPContext _localctx = new Module_TPContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_module_TP);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(LPAR);
			setState(166);
			match(MODULE);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(167);
				match(VAR);
				}
				break;
			}
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					module_fieldTP();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(176);
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

	public static class FuncTPContext extends ParserRuleContext {
		public Bind_varContext bind_var;
		public Func_fieldsTPContext func_fieldsTP;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode FUNC() { return getToken(WasmLanguageParser.FUNC, 0); }
		public Func_fieldsTPContext func_fieldsTP() {
			return getRuleContext(Func_fieldsTPContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public FuncTPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcTP; }
	}

	public final FuncTPContext funcTP() throws RecognitionException {
		FuncTPContext _localctx = new FuncTPContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcTP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(LPAR);
			setState(179);
			match(FUNC);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(180);
				((FuncTPContext)_localctx).bind_var = bind_var();
				}
				break;
			}
			setState(183);
			((FuncTPContext)_localctx).func_fieldsTP = func_fieldsTP();
			 factory.createSignature((((FuncTPContext)_localctx).bind_var!=null?(((FuncTPContext)_localctx).bind_var.start):null), numType++, numFunc++, ((FuncTPContext)_localctx).func_fieldsTP.parArr, ((FuncTPContext)_localctx).func_fieldsTP.resArr, true); 
			setState(185);
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

	public static class Func_fieldsTPContext extends ParserRuleContext {
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
		public Func_fields_bodyTPContext func_fields_bodyTP;
		public Func_fields_bodyTPContext func_fields_bodyTP() {
			return getRuleContext(Func_fields_bodyTPContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Func_fieldsTPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fieldsTP; }
	}

	public final Func_fieldsTPContext func_fieldsTP() throws RecognitionException {
		Func_fieldsTPContext _localctx = new Func_fieldsTPContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_fieldsTP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(187);
				type_use();
				}
				break;
			}
			setState(190);
			((Func_fieldsTPContext)_localctx).func_fields_bodyTP = func_fields_bodyTP();
			 ((Func_fieldsTPContext)_localctx).parArr =  ((Func_fieldsTPContext)_localctx).func_fields_bodyTP.parArr;
			                                                  ((Func_fieldsTPContext)_localctx).resArr =  ((Func_fieldsTPContext)_localctx).func_fields_bodyTP.resArr; 
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

	public static class Func_fields_bodyTPContext extends ParserRuleContext {
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
		public Value_typeContext value_type;
		public Func_result_bodyTPContext func_result_bodyTP;
		public Func_result_bodyTPContext func_result_bodyTP() {
			return getRuleContext(Func_result_bodyTPContext.class,0);
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
		public Func_fields_bodyTPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields_bodyTP; }
	}

	public final Func_fields_bodyTPContext func_fields_bodyTP() throws RecognitionException {
		Func_fields_bodyTPContext _localctx = new Func_fields_bodyTPContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_fields_bodyTP);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<String> parArr = new ArrayList<String>(); 
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(194);
						match(LPAR);
						setState(195);
						match(PARAM);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(196);
							((Func_fields_bodyTPContext)_localctx).value_type = value_type();
							 parArr.add((((Func_fields_bodyTPContext)_localctx).value_type!=null?(((Func_fields_bodyTPContext)_localctx).value_type.start):null).getText()); 
							}
							}
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(204);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(205);
						match(LPAR);
						setState(206);
						match(PARAM);
						setState(207);
						match(VAR);
						setState(208);
						((Func_fields_bodyTPContext)_localctx).value_type = value_type();
						setState(209);
						match(RPAR);
						 parArr.add((((Func_fields_bodyTPContext)_localctx).value_type!=null?(((Func_fields_bodyTPContext)_localctx).value_type.start):null).getText()); 
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(217);
			((Func_fields_bodyTPContext)_localctx).func_result_bodyTP = func_result_bodyTP();
			 ((Func_fields_bodyTPContext)_localctx).parArr =  parArr;
			                                                  ((Func_fields_bodyTPContext)_localctx).resArr =  ((Func_fields_bodyTPContext)_localctx).func_result_bodyTP.resArr; 
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

	public static class Func_result_bodyTPContext extends ParserRuleContext {
		public ArrayList<String> resArr;
		public Value_typeContext value_type;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode RESULT() { return getToken(WasmLanguageParser.RESULT, 0); }
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Func_result_bodyTPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_result_bodyTP; }
	}

	public final Func_result_bodyTPContext func_result_bodyTP() throws RecognitionException {
		Func_result_bodyTPContext _localctx = new Func_result_bodyTPContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_result_bodyTP);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<String> resArr = new ArrayList<String>(); 
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(221);
				match(LPAR);
				setState(222);
				match(RESULT);
				setState(223);
				((Func_result_bodyTPContext)_localctx).value_type = value_type();
				 resArr.add((((Func_result_bodyTPContext)_localctx).value_type!=null?(((Func_result_bodyTPContext)_localctx).value_type.start):null).getText()); 
				setState(225);
				match(RPAR);
				}
				break;
			}
			 ((Func_result_bodyTPContext)_localctx).resArr =  resArr; 
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(230);
					matchWildcard();
					}
					} 
				}
				setState(235);
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

	public static class Type_defTPContext extends ParserRuleContext {
		public WasmStatementNode result;
		public Bind_varContext bind_var;
		public Type_Context type_;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode TYPE() { return getToken(WasmLanguageParser.TYPE, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public Type_defTPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_defTP; }
	}

	public final Type_defTPContext type_defTP() throws RecognitionException {
		Type_defTPContext _localctx = new Type_defTPContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_defTP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LPAR);
			setState(237);
			match(TYPE);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(238);
				((Type_defTPContext)_localctx).bind_var = bind_var();
				}
			}

			setState(241);
			((Type_defTPContext)_localctx).type_ = type_();
			setState(242);
			match(RPAR);
			 // Pass -1 in place of funcIndex b/c do not want to register this signature as a function
			                                                  factory.createSignature((((Type_defTPContext)_localctx).bind_var!=null?(((Type_defTPContext)_localctx).bind_var.start):null), numType++, -1, ((Type_defTPContext)_localctx).type_.parArr, ((Type_defTPContext)_localctx).type_.resArr, true); 
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
		enterRule(_localctx, 18, RULE_wasmlanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 24, RULE_value_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 26, RULE_elem_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 28, RULE_global_type);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				value_type();
				 ((Global_typeContext)_localctx).result =  new Boolean(false); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(LPAR);
				setState(259);
				match(MUT);
				setState(260);
				value_type();
				setState(261);
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
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
		public Func_typeContext func_type;
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
		enterRule(_localctx, 30, RULE_def_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LPAR);
			setState(267);
			match(FUNC);
			setState(268);
			((Def_typeContext)_localctx).func_type = func_type();
			setState(269);
			match(RPAR);
			 ((Def_typeContext)_localctx).parArr =  ((Def_typeContext)_localctx).func_type.parArr; ((Def_typeContext)_localctx).resArr =  ((Def_typeContext)_localctx).func_type.resArr; 
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
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
		public Value_typeContext value_type;
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
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
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
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<String> parArr = new ArrayList<String>();
			                                              ArrayList<String> resArr = new ArrayList<String>(); 
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(273);
				match(LPAR);
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(274);
					match(RESULT);
					setState(275);
					((Func_typeContext)_localctx).value_type = value_type();
					 resArr.add((((Func_typeContext)_localctx).value_type!=null?(((Func_typeContext)_localctx).value_type.start):null).getText()); 
					}
					break;
				case 2:
					{
					setState(278);
					match(PARAM);
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(279);
						((Func_typeContext)_localctx).value_type = value_type();
						 parArr.add((((Func_typeContext)_localctx).value_type!=null?(((Func_typeContext)_localctx).value_type.start):null).getText()); 
						}
						}
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(287);
					match(PARAM);
					setState(288);
					bind_var();
					setState(289);
					((Func_typeContext)_localctx).value_type = value_type();
					 parArr.add((((Func_typeContext)_localctx).value_type!=null?(((Func_typeContext)_localctx).value_type.start):null).getText()); 
					}
					break;
				}
				setState(294);
				match(RPAR);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((Func_typeContext)_localctx).parArr =  parArr; ((Func_typeContext)_localctx).resArr =  resArr; 
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
		enterRule(_localctx, 34, RULE_table_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((Table_typeContext)_localctx).mn = match(NAT);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(303);
				((Table_typeContext)_localctx).mx = match(NAT);
				}
			}

			setState(306);
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
		enterRule(_localctx, 36, RULE_memory_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((Memory_typeContext)_localctx).mn = match(NAT);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(310);
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
		public WasmExpressionNode index;
		public VarContext var;
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
		enterRule(_localctx, 38, RULE_type_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LPAR);
			setState(316);
			match(TYPE);
			setState(317);
			((Type_useContext)_localctx).var = var();
			setState(318);
			match(RPAR);
			 ((Type_useContext)_localctx).index =  null; // necessary?
			                                              String id = (((Type_useContext)_localctx).var!=null?(((Type_useContext)_localctx).var.start):null).getText();
			                                              Integer index;
			                                              try {
			                                                index = Integer.parseUnsignedInt(id);
			                                              } catch (NumberFormatException e) {
			                                                index = factory.getTypeIndex(id);
			                                              }
			                                              ((Type_useContext)_localctx).index =  factory.createIndexLiteral(index); 
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
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 42, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 44, RULE_bind_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		enterRule(_localctx, 46, RULE_instr);
		try {
			setState(336);
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
				setState(327);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				((InstrContext)_localctx).call_instr_instr = call_instr_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).call_instr_instr.result; 
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
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
		enterRule(_localctx, 48, RULE_plain_instr);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				((Plain_instrContext)_localctx).PRINT = match(PRINT);
				 ((Plain_instrContext)_localctx).result =  factory.createPrint(((Plain_instrContext)_localctx).PRINT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				match(BR);
				setState(349);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(350);
				match(BR_IF);
				setState(351);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(352);
				match(BR_TABLE);
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(353);
					var();
					}
					}
					setState(356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(358);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, (WasmExpressionNode) body.pop()); 
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(360);
				match(CALL);
				setState(361);
				((Plain_instrContext)_localctx).var = var();
				 String funcId = (((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText();
				                                                          Integer funcIndex;
				                                                          Boolean index = true;
				                                                          try {
				                                                            funcIndex = Integer.parseUnsignedInt(funcId);
				                                                          } catch (NumberFormatException e) {
				                                                            funcIndex = factory.getFuncIndex(funcId);
				                                                            index = false;
				                                                          }

				                                                          WasmFunctionSignatureNode sig = factory.getFuncSignature(funcIndex);
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

				                                                          if (index) { // TODO get result(s) + typecheck
				                                                            ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), true), params, (((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null));
				                                                          } else {
				                                                            ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), true), params, (((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null));
				                                                          }
				}
				break;
			case LOCAL_GET:
				enterOuterAlt(_localctx, 11);
				{
				setState(364);
				match(LOCAL_GET);
				setState(365);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false); 
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 12);
				{
				setState(368);
				match(LOCAL_SET);
				setState(369);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop()); 
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 13);
				{
				setState(372);
				match(LOCAL_TEE);
				setState(373);
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
				setState(376);
				match(GLOBAL_GET);
				setState(377);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), false);
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 15);
				{
				setState(380);
				match(GLOBAL_SET);
				setState(381);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), (WasmExpressionNode) body.pop()); 
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 16);
				{
				setState(384);
				((Plain_instrContext)_localctx).LOAD = match(LOAD);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(385);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(388);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createLoad(((Plain_instrContext)_localctx).LOAD, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 17);
				{
				setState(392);
				((Plain_instrContext)_localctx).STORE = match(STORE);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(393);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(396);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createStore(((Plain_instrContext)_localctx).STORE, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 18);
				{
				setState(400);
				((Plain_instrContext)_localctx).MEMORY_SIZE = match(MEMORY_SIZE);
				 ((Plain_instrContext)_localctx).result =  factory.createMemorySize(((Plain_instrContext)_localctx).MEMORY_SIZE); 
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 19);
				{
				setState(402);
				((Plain_instrContext)_localctx).MEMORY_GROW = match(MEMORY_GROW);
				 ((Plain_instrContext)_localctx).result =  factory.createMemoryGrow(((Plain_instrContext)_localctx).MEMORY_GROW, (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 20);
				{
				setState(404);
				((Plain_instrContext)_localctx).CONST = match(CONST);
				setState(405);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).CONST, (((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 21);
				{
				setState(408);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 22);
				{
				setState(410);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(412);
				((Plain_instrContext)_localctx).UNARY = match(UNARY);
				 ((Plain_instrContext)_localctx).result =  factory.createUnary(((Plain_instrContext)_localctx).UNARY, (WasmExpressionNode) body.pop()); 
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 24);
				{
				setState(414);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 25);
				{
				setState(416);
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
		enterRule(_localctx, 50, RULE_call_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(CALL_INDIRECT);
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(421);
				type_use();
				}
				break;
			}
			setState(424);
			call_instr_params(body);
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
		enterRule(_localctx, 52, RULE_call_instr_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					match(LPAR);
					setState(427);
					match(PARAM);
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(428);
						value_type();
						}
						}
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(434);
					match(RPAR);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(440);
				match(LPAR);
				setState(441);
				match(RESULT);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(442);
					value_type();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				match(RPAR);
				}
				}
				setState(453);
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
		public Token CALL_INDIRECT;
		public Type_useContext type_use;
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
		enterRule(_localctx, 54, RULE_call_instr_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			((Call_instr_instrContext)_localctx).CALL_INDIRECT = match(CALL_INDIRECT);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(455);
				((Call_instr_instrContext)_localctx).type_use = type_use();
				}
				break;
			}
			setState(458);
			((Call_instr_instrContext)_localctx).call_instr_params_instr = call_instr_params_instr(body);
			 WasmExpressionNode typeIndex;
			                                                          if (((Call_instr_instrContext)_localctx).type_use.index != null) {
			                                                            typeIndex = ((Call_instr_instrContext)_localctx).type_use.index;
			                                                            // FIXME shouldn't be more params/results if (type ...) is used
			                                                          } else {
			                                                            WasmFunctionSignatureNode sig = factory.createSignature(null, -1, -1, ((Call_instr_instrContext)_localctx).call_instr_params_instr.parArr, ((Call_instr_instrContext)_localctx).call_instr_params_instr.resArr, false);
			                                                            typeIndex = factory.getTypeFromSig(sig);
			                                                          }

			                                                          WasmExpressionNode tableIndex = (WasmExpressionNode) body.pop();
			                                                          int funcIndex = factory.getFuncIndex(typeIndex, tableIndex);

			                                                          WasmFunctionSignatureNode sig = factory.getFuncSignature(funcIndex);
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
			                                                            SemErr(((Call_instr_instrContext)_localctx).CALL_INDIRECT, msg);
			                                                          }

			                                                          // TODO get result(s) + typecheck
			                                                          ((Call_instr_instrContext)_localctx).result =  factory.createCallIndirect(funcIndex, params);
			                                                        
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
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
		public Value_typeContext value_type;
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
		enterRule(_localctx, 56, RULE_call_instr_params_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<String> parArr = new ArrayList<String>(); 
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					match(LPAR);
					setState(463);
					match(PARAM);
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(464);
						((Call_instr_params_instrContext)_localctx).value_type = value_type();
						 parArr.add((((Call_instr_params_instrContext)_localctx).value_type!=null?(((Call_instr_params_instrContext)_localctx).value_type.start):null).getText()); 
						}
						}
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(472);
					match(RPAR);
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(478);
			((Call_instr_params_instrContext)_localctx).call_instr_results_instr = call_instr_results_instr(body);
			 ((Call_instr_params_instrContext)_localctx).parArr =  parArr;
			                                                          ((Call_instr_params_instrContext)_localctx).resArr =  ((Call_instr_params_instrContext)_localctx).call_instr_results_instr.resArr; 
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
		public ArrayList<String> resArr;
		public Value_typeContext value_type;
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
		enterRule(_localctx, 58, RULE_call_instr_results_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<String> resArr = new ArrayList<String>(); 
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(482);
				match(LPAR);
				setState(483);
				match(RESULT);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(484);
					((Call_instr_results_instrContext)_localctx).value_type = value_type();
					 resArr.add((((Call_instr_results_instrContext)_localctx).value_type!=null?(((Call_instr_results_instrContext)_localctx).value_type.start):null).getText()); 
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
				match(RPAR);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((Call_instr_results_instrContext)_localctx).resArr =  resArr; 
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
		enterRule(_localctx, 60, RULE_block_instr);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
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
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(501);
					((Block_instrContext)_localctx).bv1 = bind_var();
					}
				}

				 if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("block") == 0 && (((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null), "block has label at beginning"); } 
				setState(505);
				((Block_instrContext)_localctx).block = block();
				setState(506);
				match(END);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(507);
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
				setState(512);
				match(IF);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(513);
					bind_var();
					}
				}

				setState(516);
				block();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					 factory.startBlock();
					                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
					setState(518);
					match(ELSE);
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(519);
						bind_var();
						}
					}

					setState(522);
					((Block_instrContext)_localctx).res = instr_list(body);
					}
				}

				setState(525);
				match(END);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(526);
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
		enterRule(_localctx, 62, RULE_block_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(LPAR);
			setState(534);
			match(RESULT);
			setState(535);
			value_type();
			setState(536);
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
		enterRule(_localctx, 64, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(539);
				((BlockContext)_localctx).t = block_type();
				}
			}

			setState(542);
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
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
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
		enterRule(_localctx, 66, RULE_instr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << PRINT) | (1L << NOP) | (1L << UNREACHABLE) | (1L << DROP) | (1L << BLOCK) | (1L << LOOP) | (1L << BR) | (1L << BR_IF) | (1L << BR_TABLE) | (1L << RETURN) | (1L << IF) | (1L << SELECT) | (1L << CALL) | (1L << CALL_INDIRECT) | (1L << LOCAL_GET) | (1L << LOCAL_SET) | (1L << LOCAL_TEE) | (1L << GLOBAL_GET) | (1L << GLOBAL_SET) | (1L << LOAD) | (1L << STORE) | (1L << UNARY) | (1L << BINARY) | (1L << TEST) | (1L << COMPARE) | (1L << CONVERT) | (1L << MEMORY_SIZE) | (1L << MEMORY_GROW))) != 0)) {
				{
				{
				setState(545);
				((Instr_listContext)_localctx).instr = instr(body);
				 body.push(((Instr_listContext)_localctx).instr.result); 
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 68, RULE_const_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(556);
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
		enterRule(_localctx, 70, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 WasmFunctionSignatureNode sig = factory.getFuncSignature(numFunc++); 
			setState(560);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(561);
			match(FUNC);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(562);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(566);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result, sig.getResults()); 
			setState(568);
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
		enterRule(_localctx, 72, RULE_func_fields);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(570);
					type_use();
					}
					break;
				}
				setState(573);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				inline_import();
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(577);
					type_use();
					}
					break;
				}
				setState(580);
				((Func_fieldsContext)_localctx).func_fields_import = func_fields_import();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_import.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				inline_export();
				setState(584);
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
		enterRule(_localctx, 74, RULE_func_fields_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(589);
				match(LPAR);
				setState(590);
				match(PARAM);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(591);
					value_type();
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(598);
				match(LPAR);
				setState(599);
				match(PARAM);
				setState(600);
				bind_var();
				setState(601);
				value_type();
				setState(602);
				match(RPAR);
				}
				break;
			}
			setState(606);
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
		enterRule(_localctx, 76, RULE_func_fields_import_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(609);
				match(LPAR);
				setState(610);
				match(RESULT);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(611);
					value_type();
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
				match(RPAR);
				}
				}
				setState(622);
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
		enterRule(_localctx, 78, RULE_func_fields_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(641);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(623);
						match(LPAR);
						setState(624);
						match(PARAM);
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(625);
							value_type();
							 factory.addFormalParameter(null); 
							}
							}
							setState(632);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(633);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(634);
						match(LPAR);
						setState(635);
						match(PARAM);
						setState(636);
						((Func_fields_bodyContext)_localctx).VAR = match(VAR);
						setState(637);
						value_type();
						setState(638);
						match(RPAR);
						 factory.addFormalParameter(((Func_fields_bodyContext)_localctx).VAR); 
						}
						break;
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(646);
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
		enterRule(_localctx, 80, RULE_func_result_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(649);
				match(LPAR);
				setState(650);
				match(RESULT);
				setState(651);
				value_type();
				setState(652);
				match(RPAR);
				}
				break;
			}
			setState(656);
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
		enterRule(_localctx, 82, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(660);
					match(LPAR);
					setState(661);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(662);
						((Func_bodyContext)_localctx).value_type = value_type();
						}
						}
						setState(667);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, null, (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					setState(669);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(670);
					match(LPAR);
					setState(671);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(672);
					((Func_bodyContext)_localctx).bind_var = bind_var();
					setState(673);
					((Func_bodyContext)_localctx).value_type = value_type();
					setState(674);
					match(RPAR);
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, (((Func_bodyContext)_localctx).bind_var!=null?(((Func_bodyContext)_localctx).bind_var.start):null), (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					}
					break;
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
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
		public WasmStatementNode result;
		public Const_exprContext const_expr;
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
		enterRule(_localctx, 84, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(LPAR);
			setState(686);
			match(OFFSET);
			setState(687);
			((OffsetContext)_localctx).const_expr = const_expr();
			setState(688);
			match(RPAR);
			 ((OffsetContext)_localctx).result =  ((OffsetContext)_localctx).const_expr.result; 
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
		public WasmStatementNode result;
		public VarContext var;
		public OffsetContext offset;
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
		enterRule(_localctx, 86, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(LPAR);
			setState(692);
			match(ELEM);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(693);
				((ElemContext)_localctx).var = var();
				}
			}

			setState(696);
			((ElemContext)_localctx).offset = offset();
			 ArrayList<Integer> funcRefs = new ArrayList<>(); 
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(698);
				((ElemContext)_localctx).var = var();
				 String funcId = (((ElemContext)_localctx).var!=null?(((ElemContext)_localctx).var.start):null).getText();
				                                                      Integer funcIndex;
				                                                      try {
				                                                        funcIndex = Integer.parseUnsignedInt(funcId);
				                                                      } catch (NumberFormatException e) {
				                                                        funcIndex = factory.getFuncIndex(funcId);
				                                                      }
				                                                      funcRefs.add(funcIndex);
				                                                      
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
			match(RPAR);
			 factory.createElem((WasmExpressionNode) ((ElemContext)_localctx).offset.result, funcRefs); 
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
		enterRule(_localctx, 88, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(LPAR);
			setState(710);
			((TableContext)_localctx).TABLE = match(TABLE);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(711);
				((TableContext)_localctx).bind_var = bind_var();
				}
			}

			setState(714);
			((TableContext)_localctx).table_fields = table_fields();
			setState(715);
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
		enterRule(_localctx, 90, RULE_table_fields);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				((Table_fieldsContext)_localctx).table_type = table_type();
				 ((Table_fieldsContext)_localctx).min =  ((Table_fieldsContext)_localctx).table_type.min; ((Table_fieldsContext)_localctx).max =  ((Table_fieldsContext)_localctx).table_type.max; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				inline_import();
				setState(722);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				inline_export();
				setState(725);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				elem_type();
				setState(728);
				match(LPAR);
				setState(729);
				match(ELEM);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(730);
					var();
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736);
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
		enterRule(_localctx, 92, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(LPAR);
			setState(741);
			match(DATA);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(742);
				var();
				}
			}

			setState(745);
			offset();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(746);
				match(STRING);
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
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
		enterRule(_localctx, 94, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(LPAR);
			setState(755);
			((MemoryContext)_localctx).MEMORY = match(MEMORY);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(756);
				((MemoryContext)_localctx).bind_var = bind_var();
				}
			}

			setState(759);
			((MemoryContext)_localctx).memory_fields = memory_fields();
			setState(760);
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
		enterRule(_localctx, 96, RULE_memory_fields);
		int _la;
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				((Memory_fieldsContext)_localctx).memory_type = memory_type();
				 ((Memory_fieldsContext)_localctx).min =  ((Memory_fieldsContext)_localctx).memory_type.min; ((Memory_fieldsContext)_localctx).max =  ((Memory_fieldsContext)_localctx).memory_type.max; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				inline_import();
				setState(767);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				inline_export();
				setState(770);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				match(LPAR);
				setState(773);
				match(DATA);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(774);
					match(STRING);
					}
					}
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(780);
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
		enterRule(_localctx, 98, RULE_sglobal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(LPAR);
			setState(784);
			((SglobalContext)_localctx).GLOBAL = match(GLOBAL);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(785);
				((SglobalContext)_localctx).bind_var = bind_var();
				}
			}

			setState(788);
			((SglobalContext)_localctx).global_fields = global_fields();
			setState(789);
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
		enterRule(_localctx, 100, RULE_global_fields);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				((Global_fieldsContext)_localctx).global_type = global_type();
				setState(793);
				((Global_fieldsContext)_localctx).const_expr = const_expr();
				 ((Global_fieldsContext)_localctx).result_val =  ((Global_fieldsContext)_localctx).const_expr.result;
				                                                      ((Global_fieldsContext)_localctx).result_mut =  ((Global_fieldsContext)_localctx).global_type.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				inline_import();
				setState(797);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				inline_export();
				setState(800);
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
		enterRule(_localctx, 102, RULE_import_desc);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(LPAR);
				setState(805);
				match(FUNC);
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(806);
					bind_var();
					}
				}

				setState(809);
				type_use();
				setState(810);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				match(LPAR);
				setState(813);
				match(FUNC);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(814);
					bind_var();
					}
				}

				setState(817);
				func_type();
				setState(818);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				match(LPAR);
				setState(821);
				match(TABLE);
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(822);
					bind_var();
					}
				}

				setState(825);
				table_type();
				setState(826);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				match(LPAR);
				setState(829);
				match(MEMORY);
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(830);
					bind_var();
					}
				}

				setState(833);
				memory_type();
				setState(834);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				match(LPAR);
				setState(837);
				match(GLOBAL);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(838);
					bind_var();
					}
				}

				setState(841);
				global_type();
				setState(842);
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
		enterRule(_localctx, 104, RULE_simport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(LPAR);
			setState(847);
			match(IMPORT);
			setState(848);
			name();
			setState(849);
			name();
			setState(850);
			import_desc();
			setState(851);
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
		enterRule(_localctx, 106, RULE_inline_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(LPAR);
			setState(854);
			match(IMPORT);
			setState(855);
			name();
			setState(856);
			name();
			setState(857);
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
		enterRule(_localctx, 108, RULE_export_desc);
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				match(LPAR);
				setState(860);
				match(FUNC);
				setState(861);
				var();
				setState(862);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				match(LPAR);
				setState(865);
				match(TABLE);
				setState(866);
				var();
				setState(867);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(869);
				match(LPAR);
				setState(870);
				match(MEMORY);
				setState(871);
				var();
				setState(872);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874);
				match(LPAR);
				setState(875);
				match(GLOBAL);
				setState(876);
				var();
				setState(877);
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
		enterRule(_localctx, 110, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(LPAR);
			setState(882);
			match(EXPORT);
			setState(883);
			name();
			setState(884);
			export_desc();
			setState(885);
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
		enterRule(_localctx, 112, RULE_inline_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(LPAR);
			setState(888);
			match(EXPORT);
			setState(889);
			name();
			setState(890);
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
		public ArrayList<String> parArr;
		public ArrayList<String> resArr;
		public Def_typeContext def_type;
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
		enterRule(_localctx, 114, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			((Type_Context)_localctx).def_type = def_type();
			 ((Type_Context)_localctx).parArr =  ((Type_Context)_localctx).def_type.parArr; ((Type_Context)_localctx).resArr =  ((Type_Context)_localctx).def_type.resArr; 
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
		public WasmStatementNode result;
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
		enterRule(_localctx, 116, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(LPAR);
			setState(896);
			match(TYPE);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(897);
				bind_var();
				}
			}

			setState(900);
			type_();
			setState(901);
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
		enterRule(_localctx, 118, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(LPAR);
			setState(904);
			match(START);
			setState(905);
			var();
			setState(906);
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
		enterRule(_localctx, 120, RULE_module_field);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(910);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(911);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(912);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(913);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(914);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(915);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(916);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(917);
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
		enterRule(_localctx, 122, RULE_module_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(LPAR);
			setState(921);
			match(MODULE);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(922);
				match(VAR);
				}
			}

			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(925);
				module_field();
				}
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(931);
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
		enterRule(_localctx, 124, RULE_script_module);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(LPAR);
				setState(935);
				match(MODULE);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(936);
					match(VAR);
					}
				}

				setState(939);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(940);
					match(STRING);
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(946);
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
		enterRule(_localctx, 126, RULE_action);
		int _la;
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				match(LPAR);
				setState(950);
				match(INVOKE);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(951);
					match(VAR);
					}
				}

				setState(954);
				name();
				setState(955);
				const_list();
				setState(956);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				match(LPAR);
				setState(959);
				match(GET);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(960);
					match(VAR);
					}
				}

				setState(963);
				name();
				setState(964);
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
		enterRule(_localctx, 128, RULE_assertion);
		try {
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				match(LPAR);
				setState(969);
				match(ASSERT_MALFORMED);
				setState(970);
				script_module();
				setState(971);
				match(STRING);
				setState(972);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				match(LPAR);
				setState(975);
				match(ASSERT_INVALID);
				setState(976);
				script_module();
				setState(977);
				match(STRING);
				setState(978);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				match(LPAR);
				setState(981);
				match(ASSERT_UNLINKABLE);
				setState(982);
				script_module();
				setState(983);
				match(STRING);
				setState(984);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(986);
				match(LPAR);
				setState(987);
				match(ASSERT_TRAP);
				setState(988);
				script_module();
				setState(989);
				match(STRING);
				setState(990);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(992);
				match(LPAR);
				setState(993);
				match(ASSERT_RETURN);
				setState(994);
				action();
				setState(995);
				const_list();
				setState(996);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(998);
				match(LPAR);
				setState(999);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(1000);
				action();
				setState(1001);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1003);
				match(LPAR);
				setState(1004);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(1005);
				action();
				setState(1006);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1008);
				match(LPAR);
				setState(1009);
				match(ASSERT_TRAP);
				setState(1010);
				action();
				setState(1011);
				match(STRING);
				setState(1012);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1014);
				match(LPAR);
				setState(1015);
				match(ASSERT_EXHAUSTION);
				setState(1016);
				action();
				setState(1017);
				match(STRING);
				setState(1018);
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
		enterRule(_localctx, 130, RULE_cmd);
		int _la;
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1025);
				match(LPAR);
				setState(1026);
				match(REGISTER);
				setState(1027);
				name();
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
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1033);
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
		enterRule(_localctx, 132, RULE_meta);
		int _la;
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				match(LPAR);
				setState(1037);
				match(SCRIPT);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1038);
					match(VAR);
					}
				}

				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1041);
					cmd();
					}
					}
					setState(1046);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1047);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				match(LPAR);
				setState(1049);
				match(INPUT);
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1050);
					match(VAR);
					}
				}

				setState(1053);
				match(STRING);
				setState(1054);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				match(LPAR);
				setState(1056);
				match(OUTPUT);
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1057);
					match(VAR);
					}
				}

				setState(1060);
				match(STRING);
				setState(1061);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1062);
				match(LPAR);
				setState(1063);
				match(OUTPUT);
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1064);
					match(VAR);
					}
				}

				setState(1067);
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
		enterRule(_localctx, 134, RULE_wconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(LPAR);
			setState(1071);
			match(CONST);
			setState(1072);
			literal();
			setState(1073);
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
		enterRule(_localctx, 136, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(1075);
				wconst();
				}
				}
				setState(1080);
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
		enterRule(_localctx, 138, RULE_script);
		int _la;
		try {
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1081);
					cmd();
					}
					}
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1087);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1088);
					module_field();
					}
					}
					setState(1091); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(1093);
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
		enterRule(_localctx, 140, RULE_module);
		int _la;
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				module_();
				setState(1098);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1100);
					module_field();
					}
					}
					setState(1105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1106);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0458\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\7\3\u0097\n\3\f\3\16\3\u009a\13\3\3\3\5\3\u009d\n"+
		"\3\3\4\3\4\3\4\6\4\u00a2\n\4\r\4\16\4\u00a3\5\4\u00a6\n\4\3\5\3\5\3\5"+
		"\5\5\u00ab\n\5\3\5\7\5\u00ae\n\5\f\5\16\5\u00b1\13\5\3\5\3\5\3\6\3\6\3"+
		"\6\5\6\u00b8\n\6\3\6\3\6\3\6\3\6\3\7\5\7\u00bf\n\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00ca\n\b\f\b\16\b\u00cd\13\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00d7\n\b\f\b\16\b\u00da\13\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00e6\n\t\3\t\3\t\7\t\u00ea\n\t\f\t\16\t\u00ed\13"+
		"\t\3\n\3\n\3\n\5\n\u00f2\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u010b\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u011d\n\22\f\22\16\22\u0120\13\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0127\n\22\3\22\7\22\u012a\n\22\f\22\16\22\u012d"+
		"\13\22\3\22\3\22\3\23\3\23\5\23\u0133\n\23\3\23\3\23\3\23\3\24\3\24\5"+
		"\24\u013a\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0153"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\6\32\u0165\n\32\r\32\16\32\u0166\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0185\n\32\3\32"+
		"\5\32\u0188\n\32\3\32\3\32\3\32\5\32\u018d\n\32\3\32\5\32\u0190\n\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u01a5\n\32\3\33\3\33\5\33\u01a9\n\33\3\33"+
		"\3\33\3\34\3\34\3\34\7\34\u01b0\n\34\f\34\16\34\u01b3\13\34\3\34\7\34"+
		"\u01b6\n\34\f\34\16\34\u01b9\13\34\3\34\3\34\3\34\7\34\u01be\n\34\f\34"+
		"\16\34\u01c1\13\34\3\34\7\34\u01c4\n\34\f\34\16\34\u01c7\13\34\3\35\3"+
		"\35\5\35\u01cb\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u01d6\n\36\f\36\16\36\u01d9\13\36\3\36\7\36\u01dc\n\36\f\36\16\36\u01df"+
		"\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01ea\n\37\f"+
		"\37\16\37\u01ed\13\37\3\37\7\37\u01f0\n\37\f\37\16\37\u01f3\13\37\3\37"+
		"\3\37\3 \3 \5 \u01f9\n \3 \3 \3 \3 \5 \u01ff\n \3 \3 \3 \3 \5 \u0205\n"+
		" \3 \3 \3 \3 \5 \u020b\n \3 \5 \u020e\n \3 \3 \5 \u0212\n \3 \3 \5 \u0216"+
		"\n \3!\3!\3!\3!\3!\3\"\3\"\5\"\u021f\n\"\3\"\3\"\3\"\3#\3#\3#\7#\u0227"+
		"\n#\f#\16#\u022a\13#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\5%\u0236\n%\3%\3%\3"+
		"%\3%\3%\3&\5&\u023e\n&\3&\3&\3&\3&\3&\5&\u0245\n&\3&\3&\3&\3&\3&\3&\3"+
		"&\5&\u024e\n&\3\'\3\'\3\'\7\'\u0253\n\'\f\'\16\'\u0256\13\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u025f\n\'\3\'\3\'\3\'\3(\3(\3(\7(\u0267\n(\f(\16"+
		"(\u026a\13(\3(\7(\u026d\n(\f(\16(\u0270\13(\3)\3)\3)\3)\3)\7)\u0277\n"+
		")\f)\16)\u027a\13)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0284\n)\f)\16)\u0287\13"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\5*\u0291\n*\3*\3*\3*\3+\3+\3+\3+\7+\u029a\n"+
		"+\f+\16+\u029d\13+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u02a8\n+\f+\16+\u02ab"+
		"\13+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\5-\u02b9\n-\3-\3-\3-\3-\3-\7"+
		"-\u02c0\n-\f-\16-\u02c3\13-\3-\3-\3-\3.\3.\3.\5.\u02cb\n.\3.\3.\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u02de\n/\f/\16/\u02e1\13/\3"+
		"/\3/\5/\u02e5\n/\3\60\3\60\3\60\5\60\u02ea\n\60\3\60\3\60\7\60\u02ee\n"+
		"\60\f\60\16\60\u02f1\13\60\3\60\3\60\3\61\3\61\3\61\5\61\u02f8\n\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\7\62\u030a\n\62\f\62\16\62\u030d\13\62\3\62\5\62\u0310\n\62\3"+
		"\63\3\63\3\63\5\63\u0315\n\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0325\n\64\3\65\3\65\3\65\5\65\u032a"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0332\n\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u033a\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0342\n"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u034a\n\65\3\65\3\65\3\65\5\65"+
		"\u034f\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u0372"+
		"\n8\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\5<\u0385\n<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0399\n>\3?\3?"+
		"\3?\5?\u039e\n?\3?\7?\u03a1\n?\f?\16?\u03a4\13?\3?\3?\3@\3@\3@\3@\5@\u03ac"+
		"\n@\3@\3@\7@\u03b0\n@\f@\16@\u03b3\13@\3@\5@\u03b6\n@\3A\3A\3A\5A\u03bb"+
		"\nA\3A\3A\3A\3A\3A\3A\3A\5A\u03c4\nA\3A\3A\3A\5A\u03c9\nA\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\5B\u03ff\nB\3C\3C\3C\3C\3C\3C\3C\5C\u0408\nC\3C\3C\3C\5C\u040d"+
		"\nC\3D\3D\3D\5D\u0412\nD\3D\7D\u0415\nD\fD\16D\u0418\13D\3D\3D\3D\3D\5"+
		"D\u041e\nD\3D\3D\3D\3D\3D\5D\u0425\nD\3D\3D\3D\3D\3D\5D\u042c\nD\3D\5"+
		"D\u042f\nD\3E\3E\3E\3E\3E\3F\7F\u0437\nF\fF\16F\u043a\13F\3G\7G\u043d"+
		"\nG\fG\16G\u0440\13G\3G\3G\6G\u0444\nG\rG\16G\u0445\3G\3G\5G\u044a\nG"+
		"\3H\3H\3H\3H\7H\u0450\nH\fH\16H\u0453\13H\3H\5H\u0456\nH\3H\4\u00a3\u00eb"+
		"\2I\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\2\7\3\2\6\7\3\2\5\7\4\2\5\5MM\3\2\21\22\3\2=>\2\u04b2\2\u0090\3"+
		"\2\2\2\4\u009c\3\2\2\2\6\u00a5\3\2\2\2\b\u00a7\3\2\2\2\n\u00b4\3\2\2\2"+
		"\f\u00be\3\2\2\2\16\u00c3\3\2\2\2\20\u00de\3\2\2\2\22\u00ee\3\2\2\2\24"+
		"\u00f7\3\2\2\2\26\u00f9\3\2\2\2\30\u00fb\3\2\2\2\32\u00fd\3\2\2\2\34\u00ff"+
		"\3\2\2\2\36\u010a\3\2\2\2 \u010c\3\2\2\2\"\u0112\3\2\2\2$\u0130\3\2\2"+
		"\2&\u0137\3\2\2\2(\u013d\3\2\2\2*\u0143\3\2\2\2,\u0145\3\2\2\2.\u0147"+
		"\3\2\2\2\60\u0152\3\2\2\2\62\u01a4\3\2\2\2\64\u01a6\3\2\2\2\66\u01b7\3"+
		"\2\2\28\u01c8\3\2\2\2:\u01cf\3\2\2\2<\u01e3\3\2\2\2>\u0215\3\2\2\2@\u0217"+
		"\3\2\2\2B\u021c\3\2\2\2D\u0228\3\2\2\2F\u022d\3\2\2\2H\u0231\3\2\2\2J"+
		"\u024d\3\2\2\2L\u025e\3\2\2\2N\u026e\3\2\2\2P\u0285\3\2\2\2R\u0290\3\2"+
		"\2\2T\u0295\3\2\2\2V\u02af\3\2\2\2X\u02b5\3\2\2\2Z\u02c7\3\2\2\2\\\u02e4"+
		"\3\2\2\2^\u02e6\3\2\2\2`\u02f4\3\2\2\2b\u030f\3\2\2\2d\u0311\3\2\2\2f"+
		"\u0324\3\2\2\2h\u034e\3\2\2\2j\u0350\3\2\2\2l\u0357\3\2\2\2n\u0371\3\2"+
		"\2\2p\u0373\3\2\2\2r\u0379\3\2\2\2t\u037e\3\2\2\2v\u0381\3\2\2\2x\u0389"+
		"\3\2\2\2z\u0398\3\2\2\2|\u039a\3\2\2\2~\u03b5\3\2\2\2\u0080\u03c8\3\2"+
		"\2\2\u0082\u03fe\3\2\2\2\u0084\u040c\3\2\2\2\u0086\u042e\3\2\2\2\u0088"+
		"\u0430\3\2\2\2\u008a\u0438\3\2\2\2\u008c\u0449\3\2\2\2\u008e\u0455\3\2"+
		"\2\2\u0090\u0091\5\4\3\2\u0091\3\3\2\2\2\u0092\u0093\5\b\5\2\u0093\u0094"+
		"\7\2\2\3\u0094\u009d\3\2\2\2\u0095\u0097\5\6\4\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\2\2\3\u009c\u0092\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009d\5\3\2\2\2\u009e\u00a6\5\n\6\2\u009f\u00a6\5\22\n"+
		"\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009e\3\2"+
		"\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\7\3\2\2\2\u00a7\u00a8"+
		"\7\3\2\2\u00a8\u00aa\7<\2\2\u00a9\u00ab\7M\2\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\5\6\4\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\t\3\2\2\2"+
		"\u00b4\u00b5\7\3\2\2\u00b5\u00b7\7/\2\2\u00b6\u00b8\5.\30\2\u00b7\u00b6"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\f\7\2\u00ba"+
		"\u00bb\b\6\1\2\u00bb\u00bc\7\4\2\2\u00bc\13\3\2\2\2\u00bd\u00bf\5(\25"+
		"\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\5\16\b\2\u00c1\u00c2\b\7\1\2\u00c2\r\3\2\2\2\u00c3\u00d8\b\b\1\2\u00c4"+
		"\u00c5\7\3\2\2\u00c5\u00cb\7\61\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8"+
		"\b\b\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00d7\7\4\2\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\7\61\2\2\u00d1"+
		"\u00d2\7M\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5\b"+
		"\b\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00c4\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5\20\t\2\u00dc\u00dd\b\b\1\2\u00dd"+
		"\17\3\2\2\2\u00de\u00e5\b\t\1\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\7\62\2"+
		"\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\b\t\1\2\u00e3\u00e4\7\4\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00eb\b\t\1\2\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\21\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\3\2\2\u00ef\u00f1\7.\2\2\u00f0\u00f2"+
		"\5.\30\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\5t;\2\u00f4\u00f5\7\4\2\2\u00f5\u00f6\b\n\1\2\u00f6\23\3\2\2\2"+
		"\u00f7\u00f8\5\u008eH\2\u00f8\25\3\2\2\2\u00f9\u00fa\t\2\2\2\u00fa\27"+
		"\3\2\2\2\u00fb\u00fc\7\b\2\2\u00fc\31\3\2\2\2\u00fd\u00fe\7\t\2\2\u00fe"+
		"\33\3\2\2\2\u00ff\u0100\7\13\2\2\u0100\35\3\2\2\2\u0101\u0102\5\32\16"+
		"\2\u0102\u0103\b\20\1\2\u0103\u010b\3\2\2\2\u0104\u0105\7\3\2\2\u0105"+
		"\u0106\7\f\2\2\u0106\u0107\5\32\16\2\u0107\u0108\7\4\2\2\u0108\u0109\b"+
		"\20\1\2\u0109\u010b\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0104\3\2\2\2\u010b"+
		"\37\3\2\2\2\u010c\u010d\7\3\2\2\u010d\u010e\7/\2\2\u010e\u010f\5\"\22"+
		"\2\u010f\u0110\7\4\2\2\u0110\u0111\b\21\1\2\u0111!\3\2\2\2\u0112\u012b"+
		"\b\22\1\2\u0113\u0126\7\3\2\2\u0114\u0115\7\62\2\2\u0115\u0116\5\32\16"+
		"\2\u0116\u0117\b\22\1\2\u0117\u0127\3\2\2\2\u0118\u011e\7\61\2\2\u0119"+
		"\u011a\5\32\16\2\u011a\u011b\b\22\1\2\u011b\u011d\3\2\2\2\u011c\u0119"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0127\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123\5"+
		".\30\2\u0123\u0124\5\32\16\2\u0124\u0125\b\22\1\2\u0125\u0127\3\2\2\2"+
		"\u0126\u0114\3\2\2\2\u0126\u0118\3\2\2\2\u0126\u0121\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u012a\7\4\2\2\u0129\u0113\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012e\u012f\b\22\1\2\u012f#\3\2\2\2\u0130\u0132\7\5\2\2\u0131\u0133"+
		"\7\5\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\5\34\17\2\u0135\u0136\b\23\1\2\u0136%\3\2\2\2\u0137\u0139\7\5\2"+
		"\2\u0138\u013a\7\5\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\b\24\1\2\u013c\'\3\2\2\2\u013d\u013e\7\3\2\2\u013e"+
		"\u013f\7.\2\2\u013f\u0140\5,\27\2\u0140\u0141\7\4\2\2\u0141\u0142\b\25"+
		"\1\2\u0142)\3\2\2\2\u0143\u0144\t\3\2\2\u0144+\3\2\2\2\u0145\u0146\t\4"+
		"\2\2\u0146-\3\2\2\2\u0147\u0148\7M\2\2\u0148/\3\2\2\2\u0149\u014a\5\62"+
		"\32\2\u014a\u014b\b\31\1\2\u014b\u0153\3\2\2\2\u014c\u014d\58\35\2\u014d"+
		"\u014e\b\31\1\2\u014e\u0153\3\2\2\2\u014f\u0150\5> \2\u0150\u0151\b\31"+
		"\1\2\u0151\u0153\3\2\2\2\u0152\u0149\3\2\2\2\u0152\u014c\3\2\2\2\u0152"+
		"\u014f\3\2\2\2\u0153\61\3\2\2\2\u0154\u0155\7\17\2\2\u0155\u01a5\b\32"+
		"\1\2\u0156\u0157\7\r\2\2\u0157\u01a5\b\32\1\2\u0158\u0159\7\16\2\2\u0159"+
		"\u01a5\b\32\1\2\u015a\u015b\7\20\2\2\u015b\u01a5\b\32\1\2\u015c\u015d"+
		"\7\33\2\2\u015d\u01a5\b\32\1\2\u015e\u015f\7\24\2\2\u015f\u01a5\5,\27"+
		"\2\u0160\u0161\7\25\2\2\u0161\u01a5\5,\27\2\u0162\u0164\7\26\2\2\u0163"+
		"\u0165\5,\27\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u01a5\3\2\2\2\u0168\u0169\7\27\2\2\u0169"+
		"\u01a5\b\32\1\2\u016a\u016b\7\34\2\2\u016b\u016c\5,\27\2\u016c\u016d\b"+
		"\32\1\2\u016d\u01a5\3\2\2\2\u016e\u016f\7\36\2\2\u016f\u0170\5,\27\2\u0170"+
		"\u0171\b\32\1\2\u0171\u01a5\3\2\2\2\u0172\u0173\7\37\2\2\u0173\u0174\5"+
		",\27\2\u0174\u0175\b\32\1\2\u0175\u01a5\3\2\2\2\u0176\u0177\7 \2\2\u0177"+
		"\u0178\5,\27\2\u0178\u0179\b\32\1\2\u0179\u01a5\3\2\2\2\u017a\u017b\7"+
		"!\2\2\u017b\u017c\5,\27\2\u017c\u017d\b\32\1\2\u017d\u01a5\3\2\2\2\u017e"+
		"\u017f\7\"\2\2\u017f\u0180\5,\27\2\u0180\u0181\b\32\1\2\u0181\u01a5\3"+
		"\2\2\2\u0182\u0184\7#\2\2\u0183\u0185\7%\2\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0188\7&\2\2\u0187\u0186\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u01a5\b\32\1\2\u018a"+
		"\u018c\7$\2\2\u018b\u018d\7%\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2"+
		"\2\u018d\u018f\3\2\2\2\u018e\u0190\7&\2\2\u018f\u018e\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u01a5\b\32\1\2\u0192\u0193\7,\2\2\u0193"+
		"\u01a5\b\32\1\2\u0194\u0195\7-\2\2\u0195\u01a5\b\32\1\2\u0196\u0197\7"+
		"\n\2\2\u0197\u0198\5*\26\2\u0198\u0199\b\32\1\2\u0199\u01a5\3\2\2\2\u019a"+
		"\u019b\7)\2\2\u019b\u01a5\b\32\1\2\u019c\u019d\7*\2\2\u019d\u01a5\b\32"+
		"\1\2\u019e\u019f\7\'\2\2\u019f\u01a5\b\32\1\2\u01a0\u01a1\7(\2\2\u01a1"+
		"\u01a5\b\32\1\2\u01a2\u01a3\7+\2\2\u01a3\u01a5\b\32\1\2\u01a4\u0154\3"+
		"\2\2\2\u01a4\u0156\3\2\2\2\u01a4\u0158\3\2\2\2\u01a4\u015a\3\2\2\2\u01a4"+
		"\u015c\3\2\2\2\u01a4\u015e\3\2\2\2\u01a4\u0160\3\2\2\2\u01a4\u0162\3\2"+
		"\2\2\u01a4\u0168\3\2\2\2\u01a4\u016a\3\2\2\2\u01a4\u016e\3\2\2\2\u01a4"+
		"\u0172\3\2\2\2\u01a4\u0176\3\2\2\2\u01a4\u017a\3\2\2\2\u01a4\u017e\3\2"+
		"\2\2\u01a4\u0182\3\2\2\2\u01a4\u018a\3\2\2\2\u01a4\u0192\3\2\2\2\u01a4"+
		"\u0194\3\2\2\2\u01a4\u0196\3\2\2\2\u01a4\u019a\3\2\2\2\u01a4\u019c\3\2"+
		"\2\2\u01a4\u019e\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\63\3\2\2\2\u01a6\u01a8\7\35\2\2\u01a7\u01a9\5(\25\2\u01a8\u01a7\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5\66\34\2\u01ab"+
		"\65\3\2\2\2\u01ac\u01ad\7\3\2\2\u01ad\u01b1\7\61\2\2\u01ae\u01b0\5\32"+
		"\16\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\7\4"+
		"\2\2\u01b5\u01ac\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01c5\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7\3"+
		"\2\2\u01bb\u01bf\7\62\2\2\u01bc\u01be\5\32\16\2\u01bd\u01bc\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2"+
		"\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\7\4\2\2\u01c3\u01ba\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\67\3\2\2"+
		"\2\u01c7\u01c5\3\2\2\2\u01c8\u01ca\7\35\2\2\u01c9\u01cb\5(\25\2\u01ca"+
		"\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\5:"+
		"\36\2\u01cd\u01ce\b\35\1\2\u01ce9\3\2\2\2\u01cf\u01dd\b\36\1\2\u01d0\u01d1"+
		"\7\3\2\2\u01d1\u01d7\7\61\2\2\u01d2\u01d3\5\32\16\2\u01d3\u01d4\b\36\1"+
		"\2\u01d4\u01d6\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01dc\7\4\2\2\u01db\u01d0\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e1\5<\37\2\u01e1\u01e2\b\36\1\2\u01e2;\3\2\2\2\u01e3\u01f1\b\37\1"+
		"\2\u01e4\u01e5\7\3\2\2\u01e5\u01eb\7\62\2\2\u01e6\u01e7\5\32\16\2\u01e7"+
		"\u01e8\b\37\1\2\u01e8\u01ea\3\2\2\2\u01e9\u01e6\3\2\2\2\u01ea\u01ed\3"+
		"\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f0\7\4\2\2\u01ef\u01e4\3\2\2\2\u01f0\u01f3\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f5\b\37\1\2\u01f5=\3\2\2\2\u01f6\u01f8\t\5\2\2"+
		"\u01f7\u01f9\5.\30\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\b \1\2\u01fb\u01fc\5B\"\2\u01fc\u01fe\7\23\2\2\u01fd"+
		"\u01ff\5.\30\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0201\b \1\2\u0201\u0216\3\2\2\2\u0202\u0204\7\30\2\2\u0203"+
		"\u0205\5.\30\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u020d\5B\"\2\u0207\u0208\b \1\2\u0208\u020a\7\32\2\2\u0209"+
		"\u020b\5.\30\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020e\5D#\2\u020d\u0207\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0211\7\23\2\2\u0210\u0212\5.\30\2\u0211\u0210\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\b \1\2\u0214\u0216"+
		"\3\2\2\2\u0215\u01f6\3\2\2\2\u0215\u0202\3\2\2\2\u0216?\3\2\2\2\u0217"+
		"\u0218\7\3\2\2\u0218\u0219\7\62\2\2\u0219\u021a\5\32\16\2\u021a\u021b"+
		"\7\4\2\2\u021bA\3\2\2\2\u021c\u021e\b\"\1\2\u021d\u021f\5@!\2\u021e\u021d"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\5D#\2\u0221"+
		"\u0222\b\"\1\2\u0222C\3\2\2\2\u0223\u0224\5\60\31\2\u0224\u0225\b#\1\2"+
		"\u0225\u0227\3\2\2\2\u0226\u0223\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022c\b#\1\2\u022cE\3\2\2\2\u022d\u022e\b$\1\2\u022e\u022f\5D#\2\u022f"+
		"\u0230\b$\1\2\u0230G\3\2\2\2\u0231\u0232\b%\1\2\u0232\u0233\7\3\2\2\u0233"+
		"\u0235\7/\2\2\u0234\u0236\5.\30\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0238\b%\1\2\u0238\u0239\5J&\2\u0239\u023a"+
		"\b%\1\2\u023a\u023b\7\4\2\2\u023bI\3\2\2\2\u023c\u023e\5(\25\2\u023d\u023c"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\5P)\2\u0240"+
		"\u0241\b&\1\2\u0241\u024e\3\2\2\2\u0242\u0244\5l\67\2\u0243\u0245\5(\25"+
		"\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247"+
		"\5L\'\2\u0247\u0248\b&\1\2\u0248\u024e\3\2\2\2\u0249\u024a\5r:\2\u024a"+
		"\u024b\5J&\2\u024b\u024c\b&\1\2\u024c\u024e\3\2\2\2\u024d\u023d\3\2\2"+
		"\2\u024d\u0242\3\2\2\2\u024d\u0249\3\2\2\2\u024eK\3\2\2\2\u024f\u0250"+
		"\7\3\2\2\u0250\u0254\7\61\2\2\u0251\u0253\5\32\16\2\u0252\u0251\3\2\2"+
		"\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257"+
		"\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u025f\7\4\2\2\u0258\u0259\7\3\2\2\u0259"+
		"\u025a\7\61\2\2\u025a\u025b\5.\30\2\u025b\u025c\5\32\16\2\u025c\u025d"+
		"\7\4\2\2\u025d\u025f\3\2\2\2\u025e\u024f\3\2\2\2\u025e\u0258\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0261\5N(\2\u0261\u0262\b\'\1\2\u0262M\3\2\2\2\u0263"+
		"\u0264\7\3\2\2\u0264\u0268\7\62\2\2\u0265\u0267\5\32\16\2\u0266\u0265"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\7\4\2\2\u026c\u0263\3\2"+
		"\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"O\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\7\3\2\2\u0272\u0278\7\61\2\2"+
		"\u0273\u0274\5\32\16\2\u0274\u0275\b)\1\2\u0275\u0277\3\2\2\2\u0276\u0273"+
		"\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u0284\7\4\2\2\u027c\u027d\7\3"+
		"\2\2\u027d\u027e\7\61\2\2\u027e\u027f\7M\2\2\u027f\u0280\5\32\16\2\u0280"+
		"\u0281\7\4\2\2\u0281\u0282\b)\1\2\u0282\u0284\3\2\2\2\u0283\u0271\3\2"+
		"\2\2\u0283\u027c\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u0289\5R"+
		"*\2\u0289\u028a\b)\1\2\u028aQ\3\2\2\2\u028b\u028c\7\3\2\2\u028c\u028d"+
		"\7\62\2\2\u028d\u028e\5\32\16\2\u028e\u028f\7\4\2\2\u028f\u0291\3\2\2"+
		"\2\u0290\u028b\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293"+
		"\5T+\2\u0293\u0294\b*\1\2\u0294S\3\2\2\2\u0295\u02a9\b+\1\2\u0296\u0297"+
		"\7\3\2\2\u0297\u029b\7\63\2\2\u0298\u029a\5\32\16\2\u0299\u0298\3\2\2"+
		"\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e"+
		"\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\b+\1\2\u029f\u02a8\7\4\2\2\u02a0"+
		"\u02a1\7\3\2\2\u02a1\u02a2\7\63\2\2\u02a2\u02a3\5.\30\2\u02a3\u02a4\5"+
		"\32\16\2\u02a4\u02a5\7\4\2\2\u02a5\u02a6\b+\1\2\u02a6\u02a8\3\2\2\2\u02a7"+
		"\u0296\3\2\2\2\u02a7\u02a0\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02ad\5D#\2\u02ad\u02ae\b+\1\2\u02aeU\3\2\2\2\u02af\u02b0\7\3\2\2\u02b0"+
		"\u02b1\79\2\2\u02b1\u02b2\5F$\2\u02b2\u02b3\7\4\2\2\u02b3\u02b4\b,\1\2"+
		"\u02b4W\3\2\2\2\u02b5\u02b6\7\3\2\2\u02b6\u02b8\7\67\2\2\u02b7\u02b9\5"+
		",\27\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bb\5V,\2\u02bb\u02c1\b-\1\2\u02bc\u02bd\5,\27\2\u02bd\u02be\b-\1\2"+
		"\u02be\u02c0\3\2\2\2\u02bf\u02bc\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf"+
		"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4"+
		"\u02c5\7\4\2\2\u02c5\u02c6\b-\1\2\u02c6Y\3\2\2\2\u02c7\u02c8\7\3\2\2\u02c8"+
		"\u02ca\7\65\2\2\u02c9\u02cb\5.\30\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3"+
		"\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\5\\/\2\u02cd\u02ce\7\4\2\2\u02ce"+
		"\u02cf\b.\1\2\u02cf[\3\2\2\2\u02d0\u02d1\5$\23\2\u02d1\u02d2\b/\1\2\u02d2"+
		"\u02e5\3\2\2\2\u02d3\u02d4\5l\67\2\u02d4\u02d5\5$\23\2\u02d5\u02e5\3\2"+
		"\2\2\u02d6\u02d7\5r:\2\u02d7\u02d8\5\\/\2\u02d8\u02e5\3\2\2\2\u02d9\u02da"+
		"\5\34\17\2\u02da\u02db\7\3\2\2\u02db\u02df\7\67\2\2\u02dc\u02de\5,\27"+
		"\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\7\4\2\2\u02e3"+
		"\u02e5\3\2\2\2\u02e4\u02d0\3\2\2\2\u02e4\u02d3\3\2\2\2\u02e4\u02d6\3\2"+
		"\2\2\u02e4\u02d9\3\2\2\2\u02e5]\3\2\2\2\u02e6\u02e7\7\3\2\2\u02e7\u02e9"+
		"\78\2\2\u02e8\u02ea\5,\27\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ef\5V,\2\u02ec\u02ee\7\b\2\2\u02ed\u02ec\3\2\2"+
		"\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2"+
		"\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7\4\2\2\u02f3_\3\2\2\2\u02f4"+
		"\u02f5\7\3\2\2\u02f5\u02f7\7\66\2\2\u02f6\u02f8\5.\30\2\u02f7\u02f6\3"+
		"\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\5b\62\2\u02fa"+
		"\u02fb\7\4\2\2\u02fb\u02fc\b\61\1\2\u02fca\3\2\2\2\u02fd\u02fe\5&\24\2"+
		"\u02fe\u02ff\b\62\1\2\u02ff\u0310\3\2\2\2\u0300\u0301\5l\67\2\u0301\u0302"+
		"\5&\24\2\u0302\u0310\3\2\2\2\u0303\u0304\5r:\2\u0304\u0305\5b\62\2\u0305"+
		"\u0310\3\2\2\2\u0306\u0307\7\3\2\2\u0307\u030b\78\2\2\u0308\u030a\7\b"+
		"\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0310\7\4"+
		"\2\2\u030f\u02fd\3\2\2\2\u030f\u0300\3\2\2\2\u030f\u0303\3\2\2\2\u030f"+
		"\u0306\3\2\2\2\u0310c\3\2\2\2\u0311\u0312\7\3\2\2\u0312\u0314\7\64\2\2"+
		"\u0313\u0315\5.\30\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0317\5f\64\2\u0317\u0318\7\4\2\2\u0318\u0319\b\63\1\2"+
		"\u0319e\3\2\2\2\u031a\u031b\5\36\20\2\u031b\u031c\5F$\2\u031c\u031d\b"+
		"\64\1\2\u031d\u0325\3\2\2\2\u031e\u031f\5l\67\2\u031f\u0320\5\36\20\2"+
		"\u0320\u0325\3\2\2\2\u0321\u0322\5r:\2\u0322\u0323\5f\64\2\u0323\u0325"+
		"\3\2\2\2\u0324\u031a\3\2\2\2\u0324\u031e\3\2\2\2\u0324\u0321\3\2\2\2\u0325"+
		"g\3\2\2\2\u0326\u0327\7\3\2\2\u0327\u0329\7/\2\2\u0328\u032a\5.\30\2\u0329"+
		"\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\5("+
		"\25\2\u032c\u032d\7\4\2\2\u032d\u034f\3\2\2\2\u032e\u032f\7\3\2\2\u032f"+
		"\u0331\7/\2\2\u0330\u0332\5.\30\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u0334\5\"\22\2\u0334\u0335\7\4\2\2\u0335"+
		"\u034f\3\2\2\2\u0336\u0337\7\3\2\2\u0337\u0339\7\65\2\2\u0338\u033a\5"+
		".\30\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033c\5$\23\2\u033c\u033d\7\4\2\2\u033d\u034f\3\2\2\2\u033e\u033f\7\3"+
		"\2\2\u033f\u0341\7\66\2\2\u0340\u0342\5.\30\2\u0341\u0340\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\5&\24\2\u0344\u0345\7\4"+
		"\2\2\u0345\u034f\3\2\2\2\u0346\u0347\7\3\2\2\u0347\u0349\7\64\2\2\u0348"+
		"\u034a\5.\30\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u034c\5\36\20\2\u034c\u034d\7\4\2\2\u034d\u034f\3\2\2\2\u034e"+
		"\u0326\3\2\2\2\u034e\u032e\3\2\2\2\u034e\u0336\3\2\2\2\u034e\u033e\3\2"+
		"\2\2\u034e\u0346\3\2\2\2\u034fi\3\2\2\2\u0350\u0351\7\3\2\2\u0351\u0352"+
		"\7:\2\2\u0352\u0353\5\30\r\2\u0353\u0354\5\30\r\2\u0354\u0355\5h\65\2"+
		"\u0355\u0356\7\4\2\2\u0356k\3\2\2\2\u0357\u0358\7\3\2\2\u0358\u0359\7"+
		":\2\2\u0359\u035a\5\30\r\2\u035a\u035b\5\30\r\2\u035b\u035c\7\4\2\2\u035c"+
		"m\3\2\2\2\u035d\u035e\7\3\2\2\u035e\u035f\7/\2\2\u035f\u0360\5,\27\2\u0360"+
		"\u0361\7\4\2\2\u0361\u0372\3\2\2\2\u0362\u0363\7\3\2\2\u0363\u0364\7\65"+
		"\2\2\u0364\u0365\5,\27\2\u0365\u0366\7\4\2\2\u0366\u0372\3\2\2\2\u0367"+
		"\u0368\7\3\2\2\u0368\u0369\7\66\2\2\u0369\u036a\5,\27\2\u036a\u036b\7"+
		"\4\2\2\u036b\u0372\3\2\2\2\u036c\u036d\7\3\2\2\u036d\u036e\7\64\2\2\u036e"+
		"\u036f\5,\27\2\u036f\u0370\7\4\2\2\u0370\u0372\3\2\2\2\u0371\u035d\3\2"+
		"\2\2\u0371\u0362\3\2\2\2\u0371\u0367\3\2\2\2\u0371\u036c\3\2\2\2\u0372"+
		"o\3\2\2\2\u0373\u0374\7\3\2\2\u0374\u0375\7;\2\2\u0375\u0376\5\30\r\2"+
		"\u0376\u0377\5n8\2\u0377\u0378\7\4\2\2\u0378q\3\2\2\2\u0379\u037a\7\3"+
		"\2\2\u037a\u037b\7;\2\2\u037b\u037c\5\30\r\2\u037c\u037d\7\4\2\2\u037d"+
		"s\3\2\2\2\u037e\u037f\5 \21\2\u037f\u0380\b;\1\2\u0380u\3\2\2\2\u0381"+
		"\u0382\7\3\2\2\u0382\u0384\7.\2\2\u0383\u0385\5.\30\2\u0384\u0383\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\5t;\2\u0387\u0388"+
		"\7\4\2\2\u0388w\3\2\2\2\u0389\u038a\7\3\2\2\u038a\u038b\7\60\2\2\u038b"+
		"\u038c\5,\27\2\u038c\u038d\7\4\2\2\u038dy\3\2\2\2\u038e\u0399\5v<\2\u038f"+
		"\u0399\5d\63\2\u0390\u0399\5Z.\2\u0391\u0399\5`\61\2\u0392\u0399\5H%\2"+
		"\u0393\u0399\5X-\2\u0394\u0399\5^\60\2\u0395\u0399\5x=\2\u0396\u0399\5"+
		"j\66\2\u0397\u0399\5p9\2\u0398\u038e\3\2\2\2\u0398\u038f\3\2\2\2\u0398"+
		"\u0390\3\2\2\2\u0398\u0391\3\2\2\2\u0398\u0392\3\2\2\2\u0398\u0393\3\2"+
		"\2\2\u0398\u0394\3\2\2\2\u0398\u0395\3\2\2\2\u0398\u0396\3\2\2\2\u0398"+
		"\u0397\3\2\2\2\u0399{\3\2\2\2\u039a\u039b\7\3\2\2\u039b\u039d\7<\2\2\u039c"+
		"\u039e\7M\2\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a2\3\2"+
		"\2\2\u039f\u03a1\5z>\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5"+
		"\u03a6\7\4\2\2\u03a6}\3\2\2\2\u03a7\u03b6\5|?\2\u03a8\u03a9\7\3\2\2\u03a9"+
		"\u03ab\7<\2\2\u03aa\u03ac\7M\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2"+
		"\2\u03ac\u03ad\3\2\2\2\u03ad\u03b1\t\6\2\2\u03ae\u03b0\7\b\2\2\u03af\u03ae"+
		"\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b4\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b6\7\4\2\2\u03b5\u03a7\3\2"+
		"\2\2\u03b5\u03a8\3\2\2\2\u03b6\177\3\2\2\2\u03b7\u03b8\7\3\2\2\u03b8\u03ba"+
		"\7A\2\2\u03b9\u03bb\7M\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03bd\5\30\r\2\u03bd\u03be\5\u008aF\2\u03be\u03bf"+
		"\7\4\2\2\u03bf\u03c9\3\2\2\2\u03c0\u03c1\7\3\2\2\u03c1\u03c3\7B\2\2\u03c2"+
		"\u03c4\7M\2\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5\u03c6\5\30\r\2\u03c6\u03c7\7\4\2\2\u03c7\u03c9\3\2\2\2\u03c8"+
		"\u03b7\3\2\2\2\u03c8\u03c0\3\2\2\2\u03c9\u0081\3\2\2\2\u03ca\u03cb\7\3"+
		"\2\2\u03cb\u03cc\7C\2\2\u03cc\u03cd\5~@\2\u03cd\u03ce\7\b\2\2\u03ce\u03cf"+
		"\7\4\2\2\u03cf\u03ff\3\2\2\2\u03d0\u03d1\7\3\2\2\u03d1\u03d2\7D\2\2\u03d2"+
		"\u03d3\5~@\2\u03d3\u03d4\7\b\2\2\u03d4\u03d5\7\4\2\2\u03d5\u03ff\3\2\2"+
		"\2\u03d6\u03d7\7\3\2\2\u03d7\u03d8\7E\2\2\u03d8\u03d9\5~@\2\u03d9\u03da"+
		"\7\b\2\2\u03da\u03db\7\4\2\2\u03db\u03ff\3\2\2\2\u03dc\u03dd\7\3\2\2\u03dd"+
		"\u03de\7I\2\2\u03de\u03df\5~@\2\u03df\u03e0\7\b\2\2\u03e0\u03e1\7\4\2"+
		"\2\u03e1\u03ff\3\2\2\2\u03e2\u03e3\7\3\2\2\u03e3\u03e4\7F\2\2\u03e4\u03e5"+
		"\5\u0080A\2\u03e5\u03e6\5\u008aF\2\u03e6\u03e7\7\4\2\2\u03e7\u03ff\3\2"+
		"\2\2\u03e8\u03e9\7\3\2\2\u03e9\u03ea\7G\2\2\u03ea\u03eb\5\u0080A\2\u03eb"+
		"\u03ec\7\4\2\2\u03ec\u03ff\3\2\2\2\u03ed\u03ee\7\3\2\2\u03ee\u03ef\7H"+
		"\2\2\u03ef\u03f0\5\u0080A\2\u03f0\u03f1\7\4\2\2\u03f1\u03ff\3\2\2\2\u03f2"+
		"\u03f3\7\3\2\2\u03f3\u03f4\7I\2\2\u03f4\u03f5\5\u0080A\2\u03f5\u03f6\7"+
		"\b\2\2\u03f6\u03f7\7\4\2\2\u03f7\u03ff\3\2\2\2\u03f8\u03f9\7\3\2\2\u03f9"+
		"\u03fa\7J\2\2\u03fa\u03fb\5\u0080A\2\u03fb\u03fc\7\b\2\2\u03fc\u03fd\7"+
		"\4\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03ca\3\2\2\2\u03fe\u03d0\3\2\2\2\u03fe"+
		"\u03d6\3\2\2\2\u03fe\u03dc\3\2\2\2\u03fe\u03e2\3\2\2\2\u03fe\u03e8\3\2"+
		"\2\2\u03fe\u03ed\3\2\2\2\u03fe\u03f2\3\2\2\2\u03fe\u03f8\3\2\2\2\u03ff"+
		"\u0083\3\2\2\2\u0400\u040d\5\u0080A\2\u0401\u040d\5\u0082B\2\u0402\u040d"+
		"\5~@\2\u0403\u0404\7\3\2\2\u0404\u0405\7@\2\2\u0405\u0407\5\30\r\2\u0406"+
		"\u0408\7M\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409\u040a\7\4\2\2\u040a\u040d\3\2\2\2\u040b\u040d\5\u0086D\2\u040c"+
		"\u0400\3\2\2\2\u040c\u0401\3\2\2\2\u040c\u0402\3\2\2\2\u040c\u0403\3\2"+
		"\2\2\u040c\u040b\3\2\2\2\u040d\u0085\3\2\2\2\u040e\u040f\7\3\2\2\u040f"+
		"\u0411\7?\2\2\u0410\u0412\7M\2\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2"+
		"\2\u0412\u0416\3\2\2\2\u0413\u0415\5\u0084C\2\u0414\u0413\3\2\2\2\u0415"+
		"\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\3\2"+
		"\2\2\u0418\u0416\3\2\2\2\u0419\u042f\7\4\2\2\u041a\u041b\7\3\2\2\u041b"+
		"\u041d\7K\2\2\u041c\u041e\7M\2\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2"+
		"\2\u041e\u041f\3\2\2\2\u041f\u0420\7\b\2\2\u0420\u042f\7\4\2\2\u0421\u0422"+
		"\7\3\2\2\u0422\u0424\7L\2\2\u0423\u0425\7M\2\2\u0424\u0423\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\7\b\2\2\u0427\u042f\7\4"+
		"\2\2\u0428\u0429\7\3\2\2\u0429\u042b\7L\2\2\u042a\u042c\7M\2\2\u042b\u042a"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042f\7\4\2\2\u042e"+
		"\u040e\3\2\2\2\u042e\u041a\3\2\2\2\u042e\u0421\3\2\2\2\u042e\u0428\3\2"+
		"\2\2\u042f\u0087\3\2\2\2\u0430\u0431\7\3\2\2\u0431\u0432\7\n\2\2\u0432"+
		"\u0433\5*\26\2\u0433\u0434\7\4\2\2\u0434\u0089\3\2\2\2\u0435\u0437\5\u0088"+
		"E\2\u0436\u0435\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u008b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043d\5\u0084"+
		"C\2\u043c\u043b\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u044a\7\2"+
		"\2\3\u0442\u0444\5z>\2\u0443\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0443"+
		"\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\7\2\2\3\u0448"+
		"\u044a\3\2\2\2\u0449\u043e\3\2\2\2\u0449\u0443\3\2\2\2\u044a\u008d\3\2"+
		"\2\2\u044b\u044c\5|?\2\u044c\u044d\7\2\2\3\u044d\u0456\3\2\2\2\u044e\u0450"+
		"\5z>\2\u044f\u044e\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451"+
		"\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0456\7\2"+
		"\2\3\u0455\u044b\3\2\2\2\u0455\u0451\3\2\2\2\u0456\u008f\3\2\2\2k\u0098"+
		"\u009c\u00a3\u00a5\u00aa\u00af\u00b7\u00be\u00cb\u00d6\u00d8\u00e5\u00eb"+
		"\u00f1\u010a\u011e\u0126\u012b\u0132\u0139\u0152\u0166\u0184\u0187\u018c"+
		"\u018f\u01a4\u01a8\u01b1\u01b7\u01bf\u01c5\u01ca\u01d7\u01dd\u01eb\u01f1"+
		"\u01f8\u01fe\u0204\u020a\u020d\u0211\u0215\u021e\u0228\u0235\u023d\u0244"+
		"\u024d\u0254\u025e\u0268\u026e\u0278\u0283\u0285\u0290\u029b\u02a7\u02a9"+
		"\u02b8\u02c1\u02ca\u02df\u02e4\u02e9\u02ef\u02f7\u030b\u030f\u0314\u0324"+
		"\u0329\u0331\u0339\u0341\u0349\u034e\u0371\u0384\u0398\u039d\u03a2\u03ab"+
		"\u03b1\u03b5\u03ba\u03c3\u03c8\u03fe\u0407\u040c\u0411\u0416\u041d\u0424"+
		"\u042b\u042e\u0438\u043e\u0445\u0449\u0451\u0455";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}