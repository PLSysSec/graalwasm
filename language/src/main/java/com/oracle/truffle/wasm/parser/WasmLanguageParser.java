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
	    parser.wasmfuncpass();
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
		enterRule(_localctx, 28, RULE_def_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LPAR);
			setState(256);
			match(FUNC);
			setState(257);
			((Def_typeContext)_localctx).func_type = func_type();
			setState(258);
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
		enterRule(_localctx, 30, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<String> parArr = new ArrayList<String>();
			                                              ArrayList<String> resArr = new ArrayList<String>(); 
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(262);
				match(LPAR);
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(263);
					match(RESULT);
					setState(264);
					((Func_typeContext)_localctx).value_type = value_type();
					 resArr.add((((Func_typeContext)_localctx).value_type!=null?(((Func_typeContext)_localctx).value_type.start):null).getText()); 
					}
					break;
				case 2:
					{
					setState(267);
					match(PARAM);
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(268);
						((Func_typeContext)_localctx).value_type = value_type();
						 parArr.add((((Func_typeContext)_localctx).value_type!=null?(((Func_typeContext)_localctx).value_type.start):null).getText()); 
						}
						}
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(276);
					match(PARAM);
					setState(277);
					bind_var();
					setState(278);
					((Func_typeContext)_localctx).value_type = value_type();
					 parArr.add((((Func_typeContext)_localctx).value_type!=null?(((Func_typeContext)_localctx).value_type.start):null).getText()); 
					}
					break;
				}
				setState(283);
				match(RPAR);
				}
				}
				setState(288);
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
		enterRule(_localctx, 32, RULE_table_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((Table_typeContext)_localctx).mn = match(NAT);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(292);
				((Table_typeContext)_localctx).mx = match(NAT);
				}
			}

			setState(295);
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
			setState(298);
			((Memory_typeContext)_localctx).mn = match(NAT);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(299);
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
		public Integer typeIndex;
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
			setState(304);
			match(LPAR);
			setState(305);
			match(TYPE);
			setState(306);
			var();
			setState(307);
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
			setState(310);
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
			setState(312);
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
			setState(314);
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
			setState(325);
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
				setState(316);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				((InstrContext)_localctx).call_instr_instr = call_instr_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).call_instr_instr.result; 
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
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
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				((Plain_instrContext)_localctx).PRINT = match(PRINT);
				 ((Plain_instrContext)_localctx).result =  factory.createPrint(((Plain_instrContext)_localctx).PRINT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				match(BR);
				setState(338);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				match(BR_IF);
				setState(340);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				match(BR_TABLE);
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(342);
					var();
					}
					}
					setState(345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, (WasmExpressionNode) body.pop()); 
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(349);
				match(CALL);
				setState(350);
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
				setState(353);
				match(LOCAL_GET);
				setState(354);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false); 
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 12);
				{
				setState(357);
				match(LOCAL_SET);
				setState(358);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop()); 
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 13);
				{
				setState(361);
				match(LOCAL_TEE);
				setState(362);
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
				setState(365);
				match(GLOBAL_GET);
				setState(366);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), false);
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 15);
				{
				setState(369);
				match(GLOBAL_SET);
				setState(370);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), (WasmExpressionNode) body.pop()); 
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 16);
				{
				setState(373);
				((Plain_instrContext)_localctx).LOAD = match(LOAD);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(374);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(377);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createLoad(((Plain_instrContext)_localctx).LOAD, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 17);
				{
				setState(381);
				((Plain_instrContext)_localctx).STORE = match(STORE);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(382);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(385);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createStore(((Plain_instrContext)_localctx).STORE, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 18);
				{
				setState(389);
				((Plain_instrContext)_localctx).MEMORY_SIZE = match(MEMORY_SIZE);
				 ((Plain_instrContext)_localctx).result =  factory.createMemorySize(((Plain_instrContext)_localctx).MEMORY_SIZE); 
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 19);
				{
				setState(391);
				((Plain_instrContext)_localctx).MEMORY_GROW = match(MEMORY_GROW);
				 ((Plain_instrContext)_localctx).result =  factory.createMemoryGrow(((Plain_instrContext)_localctx).MEMORY_GROW, (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 20);
				{
				setState(393);
				((Plain_instrContext)_localctx).CONST = match(CONST);
				setState(394);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).CONST, (((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 21);
				{
				setState(397);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 22);
				{
				setState(399);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(401);
				((Plain_instrContext)_localctx).UNARY = match(UNARY);
				 ((Plain_instrContext)_localctx).result =  factory.createUnary(((Plain_instrContext)_localctx).UNARY, (WasmExpressionNode) body.pop()); 
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 24);
				{
				setState(403);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 25);
				{
				setState(405);
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
			setState(409);
			match(CALL_INDIRECT);
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(410);
				type_use();
				}
				break;
			}
			setState(413);
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
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					match(LPAR);
					setState(417);
					match(PARAM);
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(418);
						value_type();
						}
						}
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(424);
					match(RPAR);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(430);
				match(LPAR);
				setState(431);
				match(RESULT);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(432);
					value_type();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				match(RPAR);
				}
				}
				setState(443);
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
			setState(444);
			match(CALL_INDIRECT);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(445);
				type_use();
				}
				break;
			}
			setState(448);
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
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					match(LPAR);
					setState(452);
					match(PARAM);
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(453);
						value_type();
						}
						}
						setState(458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(459);
					match(RPAR);
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(465);
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
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(468);
				match(LPAR);
				setState(469);
				match(RESULT);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(470);
					value_type();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				match(RPAR);
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
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
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
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
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(486);
					((Block_instrContext)_localctx).bv1 = bind_var();
					}
				}

				 if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("block") == 0 && (((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null), "block has label at beginning"); } 
				setState(490);
				((Block_instrContext)_localctx).block = block();
				setState(491);
				match(END);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(492);
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
				setState(497);
				match(IF);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(498);
					bind_var();
					}
				}

				setState(501);
				block();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					 factory.startBlock();
					                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
					setState(503);
					match(ELSE);
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(504);
						bind_var();
						}
					}

					setState(507);
					((Block_instrContext)_localctx).res = instr_list(body);
					}
				}

				setState(510);
				match(END);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(511);
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
			setState(518);
			match(LPAR);
			setState(519);
			match(RESULT);
			setState(520);
			value_type();
			setState(521);
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
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(524);
				((BlockContext)_localctx).t = block_type();
				}
			}

			setState(527);
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
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530);
					((Instr_listContext)_localctx).instr = instr(body);
					 body.push(((Instr_listContext)_localctx).instr.result); 
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CALL_INDIRECT) {
				{
				setState(538);
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
			setState(545);
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
			                                                  factory.registerType(sig, numType++); 
			setState(549);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(550);
			match(FUNC);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(551);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(555);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(557);
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
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(559);
					type_use();
					}
					break;
				}
				setState(562);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				inline_import();
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(566);
					type_use();
					}
					break;
				}
				setState(569);
				((Func_fieldsContext)_localctx).func_fields_import = func_fields_import();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_import.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				inline_export();
				setState(573);
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
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(578);
				match(LPAR);
				setState(579);
				match(PARAM);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(580);
					value_type();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(587);
				match(LPAR);
				setState(588);
				match(PARAM);
				setState(589);
				bind_var();
				setState(590);
				value_type();
				setState(591);
				match(RPAR);
				}
				break;
			}
			setState(595);
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
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(598);
				match(LPAR);
				setState(599);
				match(RESULT);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(600);
					value_type();
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
				match(RPAR);
				}
				}
				setState(611);
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
			setState(632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(630);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(612);
						match(LPAR);
						setState(613);
						match(PARAM);
						setState(619);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(614);
							value_type();
							 factory.addFormalParameter(null); 
							}
							}
							setState(621);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(622);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(623);
						match(LPAR);
						setState(624);
						match(PARAM);
						setState(625);
						((Func_fields_bodyContext)_localctx).VAR = match(VAR);
						setState(626);
						value_type();
						setState(627);
						match(RPAR);
						 factory.addFormalParameter(((Func_fields_bodyContext)_localctx).VAR); 
						}
						break;
					}
					} 
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(635);
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
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(638);
				match(LPAR);
				setState(639);
				match(RESULT);
				setState(640);
				value_type();
				setState(641);
				match(RPAR);
				}
				break;
			}
			setState(645);
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
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(649);
					match(LPAR);
					setState(650);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(651);
						((Func_bodyContext)_localctx).value_type = value_type();
						}
						}
						setState(656);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, null, (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					setState(658);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(659);
					match(LPAR);
					setState(660);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(661);
					((Func_bodyContext)_localctx).bind_var = bind_var();
					setState(662);
					((Func_bodyContext)_localctx).value_type = value_type();
					setState(663);
					match(RPAR);
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, (((Func_bodyContext)_localctx).bind_var!=null?(((Func_bodyContext)_localctx).bind_var.start):null), (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					}
					break;
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
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
		enterRule(_localctx, 82, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(LPAR);
			setState(675);
			match(OFFSET);
			setState(676);
			((OffsetContext)_localctx).const_expr = const_expr();
			setState(677);
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
		enterRule(_localctx, 84, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(LPAR);
			setState(681);
			match(ELEM);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(682);
				((ElemContext)_localctx).var = var();
				}
			}

			setState(685);
			((ElemContext)_localctx).offset = offset();
			 ArrayList<Integer> funcRefs = new ArrayList<>(); 
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(687);
				((ElemContext)_localctx).var = var();
				 String funcId = (((ElemContext)_localctx).var!=null?(((ElemContext)_localctx).var.start):null).getText();
				                                                      Integer funcIndex;
				                                                      try {
				                                                        funcIndex = Integer.parseUnsignedInt(funcId);
				                                                      } catch (NumberFormatException e) {
				                                                        funcIndex = factory.getIndex(funcId);
				                                                      }
				                                                      funcRefs.add(funcIndex);
				                                                      
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
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
		enterRule(_localctx, 86, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(LPAR);
			setState(699);
			((TableContext)_localctx).TABLE = match(TABLE);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(700);
				((TableContext)_localctx).bind_var = bind_var();
				}
			}

			setState(703);
			((TableContext)_localctx).table_fields = table_fields();
			setState(704);
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
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				((Table_fieldsContext)_localctx).table_type = table_type();
				 ((Table_fieldsContext)_localctx).min =  ((Table_fieldsContext)_localctx).table_type.min; ((Table_fieldsContext)_localctx).max =  ((Table_fieldsContext)_localctx).table_type.max; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				inline_import();
				setState(711);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				inline_export();
				setState(714);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				elem_type();
				setState(717);
				match(LPAR);
				setState(718);
				match(ELEM);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(719);
					var();
					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(725);
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
			setState(729);
			match(LPAR);
			setState(730);
			match(DATA);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(731);
				var();
				}
			}

			setState(734);
			offset();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(735);
				match(STRING);
				}
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
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
			setState(743);
			match(LPAR);
			setState(744);
			((MemoryContext)_localctx).MEMORY = match(MEMORY);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(745);
				((MemoryContext)_localctx).bind_var = bind_var();
				}
			}

			setState(748);
			((MemoryContext)_localctx).memory_fields = memory_fields();
			setState(749);
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
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				((Memory_fieldsContext)_localctx).memory_type = memory_type();
				 ((Memory_fieldsContext)_localctx).min =  ((Memory_fieldsContext)_localctx).memory_type.min; ((Memory_fieldsContext)_localctx).max =  ((Memory_fieldsContext)_localctx).memory_type.max; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				inline_import();
				setState(756);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				inline_export();
				setState(759);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				match(LPAR);
				setState(762);
				match(DATA);
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(763);
					match(STRING);
					}
					}
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(769);
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
			setState(772);
			match(LPAR);
			setState(773);
			((SglobalContext)_localctx).GLOBAL = match(GLOBAL);
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(774);
				((SglobalContext)_localctx).bind_var = bind_var();
				}
			}

			setState(777);
			((SglobalContext)_localctx).global_fields = global_fields();
			setState(778);
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
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				((Global_fieldsContext)_localctx).global_type = global_type();
				setState(782);
				((Global_fieldsContext)_localctx).const_expr = const_expr();
				 ((Global_fieldsContext)_localctx).result_val =  ((Global_fieldsContext)_localctx).const_expr.result;
				                                                      ((Global_fieldsContext)_localctx).result_mut =  ((Global_fieldsContext)_localctx).global_type.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				inline_import();
				setState(786);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				inline_export();
				setState(789);
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
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(LPAR);
				setState(794);
				match(FUNC);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(795);
					bind_var();
					}
				}

				setState(798);
				type_use();
				setState(799);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(LPAR);
				setState(802);
				match(FUNC);
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(803);
					bind_var();
					}
				}

				setState(806);
				func_type();
				setState(807);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				match(LPAR);
				setState(810);
				match(TABLE);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(811);
					bind_var();
					}
				}

				setState(814);
				table_type();
				setState(815);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				match(LPAR);
				setState(818);
				match(MEMORY);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(819);
					bind_var();
					}
				}

				setState(822);
				memory_type();
				setState(823);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(825);
				match(LPAR);
				setState(826);
				match(GLOBAL);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(827);
					bind_var();
					}
				}

				setState(830);
				global_type();
				setState(831);
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
			setState(835);
			match(LPAR);
			setState(836);
			match(IMPORT);
			setState(837);
			name();
			setState(838);
			name();
			setState(839);
			import_desc();
			setState(840);
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
			setState(842);
			match(LPAR);
			setState(843);
			match(IMPORT);
			setState(844);
			name();
			setState(845);
			name();
			setState(846);
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
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				match(LPAR);
				setState(849);
				match(FUNC);
				setState(850);
				var();
				setState(851);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(LPAR);
				setState(854);
				match(TABLE);
				setState(855);
				var();
				setState(856);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				match(LPAR);
				setState(859);
				match(MEMORY);
				setState(860);
				var();
				setState(861);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				match(LPAR);
				setState(864);
				match(GLOBAL);
				setState(865);
				var();
				setState(866);
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
			setState(870);
			match(LPAR);
			setState(871);
			match(EXPORT);
			setState(872);
			name();
			setState(873);
			export_desc();
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
			setState(876);
			match(LPAR);
			setState(877);
			match(EXPORT);
			setState(878);
			name();
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
		enterRule(_localctx, 112, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
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
			setState(884);
			match(LPAR);
			setState(885);
			match(TYPE);
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(886);
				((Type_defContext)_localctx).bind_var = bind_var();
				}
			}

			setState(889);
			((Type_defContext)_localctx).type_ = type_();
			setState(890);
			match(RPAR);
			 factory.createType((((Type_defContext)_localctx).bind_var!=null?(((Type_defContext)_localctx).bind_var.start):null), numType++, ((Type_defContext)_localctx).type_.parArr, ((Type_defContext)_localctx).type_.resArr); 
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
			setState(893);
			match(LPAR);
			setState(894);
			match(START);
			setState(895);
			var();
			setState(896);
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
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(901);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(902);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(903);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(904);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(905);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(906);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(907);
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
			setState(910);
			match(LPAR);
			setState(911);
			match(MODULE);
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(912);
				match(VAR);
				}
			}

			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(915);
				module_field();
				}
				}
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(921);
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
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				match(LPAR);
				setState(925);
				match(MODULE);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(926);
					match(VAR);
					}
				}

				setState(929);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(930);
					match(STRING);
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
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
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(LPAR);
				setState(940);
				match(INVOKE);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(941);
					match(VAR);
					}
				}

				setState(944);
				name();
				setState(945);
				const_list();
				setState(946);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				match(LPAR);
				setState(949);
				match(GET);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(950);
					match(VAR);
					}
				}

				setState(953);
				name();
				setState(954);
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
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				match(LPAR);
				setState(959);
				match(ASSERT_MALFORMED);
				setState(960);
				script_module();
				setState(961);
				match(STRING);
				setState(962);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				match(LPAR);
				setState(965);
				match(ASSERT_INVALID);
				setState(966);
				script_module();
				setState(967);
				match(STRING);
				setState(968);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				match(LPAR);
				setState(971);
				match(ASSERT_UNLINKABLE);
				setState(972);
				script_module();
				setState(973);
				match(STRING);
				setState(974);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(976);
				match(LPAR);
				setState(977);
				match(ASSERT_TRAP);
				setState(978);
				script_module();
				setState(979);
				match(STRING);
				setState(980);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(982);
				match(LPAR);
				setState(983);
				match(ASSERT_RETURN);
				setState(984);
				action();
				setState(985);
				const_list();
				setState(986);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(988);
				match(LPAR);
				setState(989);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(990);
				action();
				setState(991);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(993);
				match(LPAR);
				setState(994);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(995);
				action();
				setState(996);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(998);
				match(LPAR);
				setState(999);
				match(ASSERT_TRAP);
				setState(1000);
				action();
				setState(1001);
				match(STRING);
				setState(1002);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1004);
				match(LPAR);
				setState(1005);
				match(ASSERT_EXHAUSTION);
				setState(1006);
				action();
				setState(1007);
				match(STRING);
				setState(1008);
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
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1015);
				match(LPAR);
				setState(1016);
				match(REGISTER);
				setState(1017);
				name();
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
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1023);
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
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				match(LPAR);
				setState(1027);
				match(SCRIPT);
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1028);
					match(VAR);
					}
				}

				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1031);
					cmd();
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1037);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				match(LPAR);
				setState(1039);
				match(INPUT);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1040);
					match(VAR);
					}
				}

				setState(1043);
				match(STRING);
				setState(1044);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				match(LPAR);
				setState(1046);
				match(OUTPUT);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1047);
					match(VAR);
					}
				}

				setState(1050);
				match(STRING);
				setState(1051);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1052);
				match(LPAR);
				setState(1053);
				match(OUTPUT);
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(1054);
					match(VAR);
					}
				}

				setState(1057);
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
			setState(1060);
			match(LPAR);
			setState(1061);
			match(CONST);
			setState(1062);
			literal();
			setState(1063);
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
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(1065);
				wconst();
				}
				}
				setState(1070);
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
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1071);
					cmd();
					}
					}
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1077);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1078);
					module_field();
					}
					}
					setState(1081); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(1083);
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
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				module_();
				setState(1088);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(1090);
					module_field();
					}
					}
					setState(1095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1096);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u044e\4\2\t\2\4"+
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
		"\3\17\3\17\5\17\u0100\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0112\n\21\f\21\16\21\u0115\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u011c\n\21\3\21\7\21\u011f\n\21\f\21"+
		"\16\21\u0122\13\21\3\21\3\21\3\22\3\22\5\22\u0128\n\22\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u012f\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0148\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\6\31\u015a\n\31\r\31\16\31\u015b\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u017a"+
		"\n\31\3\31\5\31\u017d\n\31\3\31\3\31\3\31\5\31\u0182\n\31\3\31\5\31\u0185"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u019a\n\31\3\32\3\32\5\32\u019e\n"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u01a6\n\33\f\33\16\33\u01a9\13"+
		"\33\3\33\7\33\u01ac\n\33\f\33\16\33\u01af\13\33\3\33\3\33\3\33\7\33\u01b4"+
		"\n\33\f\33\16\33\u01b7\13\33\3\33\7\33\u01ba\n\33\f\33\16\33\u01bd\13"+
		"\33\3\34\3\34\5\34\u01c1\n\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u01c9"+
		"\n\35\f\35\16\35\u01cc\13\35\3\35\7\35\u01cf\n\35\f\35\16\35\u01d2\13"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u01da\n\36\f\36\16\36\u01dd\13"+
		"\36\3\36\7\36\u01e0\n\36\f\36\16\36\u01e3\13\36\3\36\3\36\3\36\3\37\3"+
		"\37\5\37\u01ea\n\37\3\37\3\37\3\37\3\37\5\37\u01f0\n\37\3\37\3\37\3\37"+
		"\3\37\5\37\u01f6\n\37\3\37\3\37\3\37\3\37\5\37\u01fc\n\37\3\37\5\37\u01ff"+
		"\n\37\3\37\3\37\5\37\u0203\n\37\3\37\3\37\5\37\u0207\n\37\3 \3 \3 \3 "+
		"\3 \3!\3!\5!\u0210\n!\3!\3!\3!\3\"\3\"\3\"\7\"\u0218\n\"\f\"\16\"\u021b"+
		"\13\"\3\"\5\"\u021e\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\5$\u022b\n"+
		"$\3$\3$\3$\3$\3$\3%\5%\u0233\n%\3%\3%\3%\3%\3%\5%\u023a\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u0243\n%\3&\3&\3&\7&\u0248\n&\f&\16&\u024b\13&\3&\3&\3&"+
		"\3&\3&\3&\3&\5&\u0254\n&\3&\3&\3&\3\'\3\'\3\'\7\'\u025c\n\'\f\'\16\'\u025f"+
		"\13\'\3\'\7\'\u0262\n\'\f\'\16\'\u0265\13\'\3(\3(\3(\3(\3(\7(\u026c\n"+
		"(\f(\16(\u026f\13(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0279\n(\f(\16(\u027c\13"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u0286\n)\3)\3)\3)\3*\3*\3*\3*\7*\u028f\n"+
		"*\f*\16*\u0292\13*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u029d\n*\f*\16*\u02a0"+
		"\13*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\5,\u02ae\n,\3,\3,\3,\3,\3,\7"+
		",\u02b5\n,\f,\16,\u02b8\13,\3,\3,\3,\3-\3-\3-\5-\u02c0\n-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u02d3\n.\f.\16.\u02d6\13.\3"+
		".\3.\5.\u02da\n.\3/\3/\3/\5/\u02df\n/\3/\3/\7/\u02e3\n/\f/\16/\u02e6\13"+
		"/\3/\3/\3\60\3\60\3\60\5\60\u02ed\n\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u02ff\n\61\f\61"+
		"\16\61\u0302\13\61\3\61\5\61\u0305\n\61\3\62\3\62\3\62\5\62\u030a\n\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u031a\n\63\3\64\3\64\3\64\5\64\u031f\n\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\5\64\u0327\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u032f\n\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0337\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u033f\n\64\3\64\3\64\3\64\5\64\u0344\n\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u0367\n\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3;"+
		"\3;\3;\5;\u037a\n;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\5=\u038f\n=\3>\3>\3>\5>\u0394\n>\3>\7>\u0397\n>\f>\16>\u039a\13"+
		">\3>\3>\3?\3?\3?\3?\5?\u03a2\n?\3?\3?\7?\u03a6\n?\f?\16?\u03a9\13?\3?"+
		"\5?\u03ac\n?\3@\3@\3@\5@\u03b1\n@\3@\3@\3@\3@\3@\3@\3@\5@\u03ba\n@\3@"+
		"\3@\3@\5@\u03bf\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03f5\nA\3B\3B\3B\3B\3B\3B\3B"+
		"\5B\u03fe\nB\3B\3B\3B\5B\u0403\nB\3C\3C\3C\5C\u0408\nC\3C\7C\u040b\nC"+
		"\fC\16C\u040e\13C\3C\3C\3C\3C\5C\u0414\nC\3C\3C\3C\3C\3C\5C\u041b\nC\3"+
		"C\3C\3C\3C\3C\5C\u0422\nC\3C\5C\u0425\nC\3D\3D\3D\3D\3D\3E\7E\u042d\n"+
		"E\fE\16E\u0430\13E\3F\7F\u0433\nF\fF\16F\u0436\13F\3F\3F\6F\u043a\nF\r"+
		"F\16F\u043b\3F\3F\5F\u0440\nF\3G\3G\3G\3G\7G\u0446\nG\fG\16G\u0449\13"+
		"G\3G\5G\u044c\nG\3G\4\u00a1\u00e9\2H\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\2\7\3\2\6\7\3\2\5\7\4\2\5\5MM\3\2"+
		"\21\22\3\2=>\2\u04a9\2\u008e\3\2\2\2\4\u009a\3\2\2\2\6\u00a3\3\2\2\2\b"+
		"\u00a5\3\2\2\2\n\u00b2\3\2\2\2\f\u00bc\3\2\2\2\16\u00c1\3\2\2\2\20\u00dc"+
		"\3\2\2\2\22\u00ec\3\2\2\2\24\u00ee\3\2\2\2\26\u00f0\3\2\2\2\30\u00f2\3"+
		"\2\2\2\32\u00f4\3\2\2\2\34\u00ff\3\2\2\2\36\u0101\3\2\2\2 \u0107\3\2\2"+
		"\2\"\u0125\3\2\2\2$\u012c\3\2\2\2&\u0132\3\2\2\2(\u0138\3\2\2\2*\u013a"+
		"\3\2\2\2,\u013c\3\2\2\2.\u0147\3\2\2\2\60\u0199\3\2\2\2\62\u019b\3\2\2"+
		"\2\64\u01ad\3\2\2\2\66\u01be\3\2\2\28\u01d0\3\2\2\2:\u01e1\3\2\2\2<\u0206"+
		"\3\2\2\2>\u0208\3\2\2\2@\u020d\3\2\2\2B\u0219\3\2\2\2D\u0222\3\2\2\2F"+
		"\u0226\3\2\2\2H\u0242\3\2\2\2J\u0253\3\2\2\2L\u0263\3\2\2\2N\u027a\3\2"+
		"\2\2P\u0285\3\2\2\2R\u028a\3\2\2\2T\u02a4\3\2\2\2V\u02aa\3\2\2\2X\u02bc"+
		"\3\2\2\2Z\u02d9\3\2\2\2\\\u02db\3\2\2\2^\u02e9\3\2\2\2`\u0304\3\2\2\2"+
		"b\u0306\3\2\2\2d\u0319\3\2\2\2f\u0343\3\2\2\2h\u0345\3\2\2\2j\u034c\3"+
		"\2\2\2l\u0366\3\2\2\2n\u0368\3\2\2\2p\u036e\3\2\2\2r\u0373\3\2\2\2t\u0376"+
		"\3\2\2\2v\u037f\3\2\2\2x\u038e\3\2\2\2z\u0390\3\2\2\2|\u03ab\3\2\2\2~"+
		"\u03be\3\2\2\2\u0080\u03f4\3\2\2\2\u0082\u0402\3\2\2\2\u0084\u0424\3\2"+
		"\2\2\u0086\u0426\3\2\2\2\u0088\u042e\3\2\2\2\u008a\u043f\3\2\2\2\u008c"+
		"\u044b\3\2\2\2\u008e\u008f\5\4\3\2\u008f\3\3\2\2\2\u0090\u0091\5\b\5\2"+
		"\u0091\u0092\7\2\2\3\u0092\u009b\3\2\2\2\u0093\u0095\5\6\4\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7\2\2\3\u009a\u0090\3\2"+
		"\2\2\u009a\u0096\3\2\2\2\u009b\5\3\2\2\2\u009c\u00a4\5\n\6\2\u009d\u00a4"+
		"\5t;\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009c\3\2"+
		"\2\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\7\3\2\2\2\u00a5\u00a6"+
		"\7\3\2\2\u00a6\u00a8\7<\2\2\u00a7\u00a9\7M\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\5\6\4\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\4\2\2\u00b1\t\3\2\2\2"+
		"\u00b2\u00b3\7\3\2\2\u00b3\u00b5\7/\2\2\u00b4\u00b6\5,\27\2\u00b5\u00b4"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\f\7\2\u00b8"+
		"\u00b9\b\6\1\2\u00b9\u00ba\7\4\2\2\u00ba\13\3\2\2\2\u00bb\u00bd\5&\24"+
		"\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\5\16\b\2\u00bf\u00c0\b\7\1\2\u00c0\r\3\2\2\2\u00c1\u00d6\b\b\1\2\u00c2"+
		"\u00c3\7\3\2\2\u00c3\u00c9\7\61\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\b"+
		"\b\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00d5\7\4\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\7\61\2\2\u00cf"+
		"\u00d0\7M\2\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\b\b"+
		"\1\2\u00d3\u00d5\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5\20\t\2\u00da\u00db\b\b\1\2\u00db"+
		"\17\3\2\2\2\u00dc\u00e3\b\t\1\2\u00dd\u00de\7\3\2\2\u00de\u00df\7\62\2"+
		"\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\b\t\1\2\u00e1\u00e2\7\4\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e9\b\t\1\2\u00e6\u00e8\13\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\21\3\2\2"+
		"\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\5\u008cG\2\u00ed\23\3\2\2\2\u00ee\u00ef"+
		"\t\2\2\2\u00ef\25\3\2\2\2\u00f0\u00f1\7\b\2\2\u00f1\27\3\2\2\2\u00f2\u00f3"+
		"\7\t\2\2\u00f3\31\3\2\2\2\u00f4\u00f5\7\13\2\2\u00f5\33\3\2\2\2\u00f6"+
		"\u00f7\5\30\r\2\u00f7\u00f8\b\17\1\2\u00f8\u0100\3\2\2\2\u00f9\u00fa\7"+
		"\3\2\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\5\30\r\2\u00fc\u00fd\7\4\2\2\u00fd"+
		"\u00fe\b\17\1\2\u00fe\u0100\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f9\3"+
		"\2\2\2\u0100\35\3\2\2\2\u0101\u0102\7\3\2\2\u0102\u0103\7/\2\2\u0103\u0104"+
		"\5 \21\2\u0104\u0105\7\4\2\2\u0105\u0106\b\20\1\2\u0106\37\3\2\2\2\u0107"+
		"\u0120\b\21\1\2\u0108\u011b\7\3\2\2\u0109\u010a\7\62\2\2\u010a\u010b\5"+
		"\30\r\2\u010b\u010c\b\21\1\2\u010c\u011c\3\2\2\2\u010d\u0113\7\61\2\2"+
		"\u010e\u010f\5\30\r\2\u010f\u0110\b\21\1\2\u0110\u0112\3\2\2\2\u0111\u010e"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u011c\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\5"+
		",\27\2\u0118\u0119\5\30\r\2\u0119\u011a\b\21\1\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0109\3\2\2\2\u011b\u010d\3\2\2\2\u011b\u0116\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\7\4\2\2\u011e\u0108\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0124\b\21\1\2\u0124!\3\2\2\2\u0125\u0127\7\5\2\2\u0126\u0128"+
		"\7\5\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\5\32\16\2\u012a\u012b\b\22\1\2\u012b#\3\2\2\2\u012c\u012e\7\5\2"+
		"\2\u012d\u012f\7\5\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\b\23\1\2\u0131%\3\2\2\2\u0132\u0133\7\3\2\2\u0133"+
		"\u0134\7.\2\2\u0134\u0135\5*\26\2\u0135\u0136\7\4\2\2\u0136\u0137\b\24"+
		"\1\2\u0137\'\3\2\2\2\u0138\u0139\t\3\2\2\u0139)\3\2\2\2\u013a\u013b\t"+
		"\4\2\2\u013b+\3\2\2\2\u013c\u013d\7M\2\2\u013d-\3\2\2\2\u013e\u013f\5"+
		"\60\31\2\u013f\u0140\b\30\1\2\u0140\u0148\3\2\2\2\u0141\u0142\5\66\34"+
		"\2\u0142\u0143\b\30\1\2\u0143\u0148\3\2\2\2\u0144\u0145\5<\37\2\u0145"+
		"\u0146\b\30\1\2\u0146\u0148\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0141\3"+
		"\2\2\2\u0147\u0144\3\2\2\2\u0148/\3\2\2\2\u0149\u014a\7\17\2\2\u014a\u019a"+
		"\b\31\1\2\u014b\u014c\7\r\2\2\u014c\u019a\b\31\1\2\u014d\u014e\7\16\2"+
		"\2\u014e\u019a\b\31\1\2\u014f\u0150\7\20\2\2\u0150\u019a\b\31\1\2\u0151"+
		"\u0152\7\33\2\2\u0152\u019a\b\31\1\2\u0153\u0154\7\24\2\2\u0154\u019a"+
		"\5*\26\2\u0155\u0156\7\25\2\2\u0156\u019a\5*\26\2\u0157\u0159\7\26\2\2"+
		"\u0158\u015a\5*\26\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u019a\3\2\2\2\u015d\u015e\7\27\2\2"+
		"\u015e\u019a\b\31\1\2\u015f\u0160\7\34\2\2\u0160\u0161\5*\26\2\u0161\u0162"+
		"\b\31\1\2\u0162\u019a\3\2\2\2\u0163\u0164\7\36\2\2\u0164\u0165\5*\26\2"+
		"\u0165\u0166\b\31\1\2\u0166\u019a\3\2\2\2\u0167\u0168\7\37\2\2\u0168\u0169"+
		"\5*\26\2\u0169\u016a\b\31\1\2\u016a\u019a\3\2\2\2\u016b\u016c\7 \2\2\u016c"+
		"\u016d\5*\26\2\u016d\u016e\b\31\1\2\u016e\u019a\3\2\2\2\u016f\u0170\7"+
		"!\2\2\u0170\u0171\5*\26\2\u0171\u0172\b\31\1\2\u0172\u019a\3\2\2\2\u0173"+
		"\u0174\7\"\2\2\u0174\u0175\5*\26\2\u0175\u0176\b\31\1\2\u0176\u019a\3"+
		"\2\2\2\u0177\u0179\7#\2\2\u0178\u017a\7%\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u017d\7&\2\2\u017c\u017b\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u019a\b\31\1\2\u017f"+
		"\u0181\7$\2\2\u0180\u0182\7%\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2"+
		"\2\u0182\u0184\3\2\2\2\u0183\u0185\7&\2\2\u0184\u0183\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u019a\b\31\1\2\u0187\u0188\7,\2\2\u0188"+
		"\u019a\b\31\1\2\u0189\u018a\7-\2\2\u018a\u019a\b\31\1\2\u018b\u018c\7"+
		"\n\2\2\u018c\u018d\5(\25\2\u018d\u018e\b\31\1\2\u018e\u019a\3\2\2\2\u018f"+
		"\u0190\7)\2\2\u0190\u019a\b\31\1\2\u0191\u0192\7*\2\2\u0192\u019a\b\31"+
		"\1\2\u0193\u0194\7\'\2\2\u0194\u019a\b\31\1\2\u0195\u0196\7(\2\2\u0196"+
		"\u019a\b\31\1\2\u0197\u0198\7+\2\2\u0198\u019a\b\31\1\2\u0199\u0149\3"+
		"\2\2\2\u0199\u014b\3\2\2\2\u0199\u014d\3\2\2\2\u0199\u014f\3\2\2\2\u0199"+
		"\u0151\3\2\2\2\u0199\u0153\3\2\2\2\u0199\u0155\3\2\2\2\u0199\u0157\3\2"+
		"\2\2\u0199\u015d\3\2\2\2\u0199\u015f\3\2\2\2\u0199\u0163\3\2\2\2\u0199"+
		"\u0167\3\2\2\2\u0199\u016b\3\2\2\2\u0199\u016f\3\2\2\2\u0199\u0173\3\2"+
		"\2\2\u0199\u0177\3\2\2\2\u0199\u017f\3\2\2\2\u0199\u0187\3\2\2\2\u0199"+
		"\u0189\3\2\2\2\u0199\u018b\3\2\2\2\u0199\u018f\3\2\2\2\u0199\u0191\3\2"+
		"\2\2\u0199\u0193\3\2\2\2\u0199\u0195\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\61\3\2\2\2\u019b\u019d\7\35\2\2\u019c\u019e\5&\24\2\u019d\u019c\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5\64\33\2\u01a0"+
		"\u01a1\b\32\1\2\u01a1\63\3\2\2\2\u01a2\u01a3\7\3\2\2\u01a3\u01a7\7\61"+
		"\2\2\u01a4\u01a6\5\30\r\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01aa\u01ac\7\4\2\2\u01ab\u01a2\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01bb\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01b0\u01b1\7\3\2\2\u01b1\u01b5\7\62\2\2\u01b2\u01b4\5\30\r\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\7\4\2\2\u01b9"+
		"\u01b0\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\65\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\7\35\2\2\u01bf\u01c1"+
		"\5&\24\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\58\35\2\u01c3\u01c4\b\34\1\2\u01c4\67\3\2\2\2\u01c5\u01c6\7\3\2"+
		"\2\u01c6\u01ca\7\61\2\2\u01c7\u01c9\5\30\r\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf\7\4\2\2\u01ce\u01c5\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\5:\36\2\u01d4\u01d5\b\35\1\2\u01d5"+
		"9\3\2\2\2\u01d6\u01d7\7\3\2\2\u01d7\u01db\7\62\2\2\u01d8\u01da\5\30\r"+
		"\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e0\7\4\2\2\u01df"+
		"\u01d6\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\5.\30\2\u01e5"+
		"\u01e6\b\36\1\2\u01e6;\3\2\2\2\u01e7\u01e9\t\5\2\2\u01e8\u01ea\5,\27\2"+
		"\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec"+
		"\b\37\1\2\u01ec\u01ed\5@!\2\u01ed\u01ef\7\23\2\2\u01ee\u01f0\5,\27\2\u01ef"+
		"\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\b\37"+
		"\1\2\u01f2\u0207\3\2\2\2\u01f3\u01f5\7\30\2\2\u01f4\u01f6\5,\27\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fe\5@"+
		"!\2\u01f8\u01f9\b\37\1\2\u01f9\u01fb\7\32\2\2\u01fa\u01fc\5,\27\2\u01fb"+
		"\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\5B"+
		"\"\2\u01fe\u01f8\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0202\7\23\2\2\u0201\u0203\5,\27\2\u0202\u0201\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\b\37\1\2\u0205\u0207\3\2\2\2\u0206"+
		"\u01e7\3\2\2\2\u0206\u01f3\3\2\2\2\u0207=\3\2\2\2\u0208\u0209\7\3\2\2"+
		"\u0209\u020a\7\62\2\2\u020a\u020b\5\30\r\2\u020b\u020c\7\4\2\2\u020c?"+
		"\3\2\2\2\u020d\u020f\b!\1\2\u020e\u0210\5> \2\u020f\u020e\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\5B\"\2\u0212\u0213\b!\1"+
		"\2\u0213A\3\2\2\2\u0214\u0215\5.\30\2\u0215\u0216\b\"\1\2\u0216\u0218"+
		"\3\2\2\2\u0217\u0214\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021e\5\62"+
		"\32\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0220\b\"\1\2\u0220\u0221\b\"\1\2\u0221C\3\2\2\2\u0222\u0223\b#\1\2\u0223"+
		"\u0224\5B\"\2\u0224\u0225\b#\1\2\u0225E\3\2\2\2\u0226\u0227\b$\1\2\u0227"+
		"\u0228\7\3\2\2\u0228\u022a\7/\2\2\u0229\u022b\5,\27\2\u022a\u0229\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\b$\1\2\u022d"+
		"\u022e\5H%\2\u022e\u022f\b$\1\2\u022f\u0230\7\4\2\2\u0230G\3\2\2\2\u0231"+
		"\u0233\5&\24\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0235\5N(\2\u0235\u0236\b%\1\2\u0236\u0243\3\2\2\2\u0237\u0239"+
		"\5j\66\2\u0238\u023a\5&\24\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\5J&\2\u023c\u023d\b%\1\2\u023d\u0243\3\2\2"+
		"\2\u023e\u023f\5p9\2\u023f\u0240\5H%\2\u0240\u0241\b%\1\2\u0241\u0243"+
		"\3\2\2\2\u0242\u0232\3\2\2\2\u0242\u0237\3\2\2\2\u0242\u023e\3\2\2\2\u0243"+
		"I\3\2\2\2\u0244\u0245\7\3\2\2\u0245\u0249\7\61\2\2\u0246\u0248\5\30\r"+
		"\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u0254\7\4\2\2\u024d"+
		"\u024e\7\3\2\2\u024e\u024f\7\61\2\2\u024f\u0250\5,\27\2\u0250\u0251\5"+
		"\30\r\2\u0251\u0252\7\4\2\2\u0252\u0254\3\2\2\2\u0253\u0244\3\2\2\2\u0253"+
		"\u024d\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\5L\'\2\u0256\u0257\b&\1"+
		"\2\u0257K\3\2\2\2\u0258\u0259\7\3\2\2\u0259\u025d\7\62\2\2\u025a\u025c"+
		"\5\30\r\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2"+
		"\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262"+
		"\7\4\2\2\u0261\u0258\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264M\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7\3\2\2"+
		"\u0267\u026d\7\61\2\2\u0268\u0269\5\30\r\2\u0269\u026a\b(\1\2\u026a\u026c"+
		"\3\2\2\2\u026b\u0268\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0279\7\4"+
		"\2\2\u0271\u0272\7\3\2\2\u0272\u0273\7\61\2\2\u0273\u0274\7M\2\2\u0274"+
		"\u0275\5\30\r\2\u0275\u0276\7\4\2\2\u0276\u0277\b(\1\2\u0277\u0279\3\2"+
		"\2\2\u0278\u0266\3\2\2\2\u0278\u0271\3\2\2\2\u0279\u027c\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027a\3\2"+
		"\2\2\u027d\u027e\5P)\2\u027e\u027f\b(\1\2\u027fO\3\2\2\2\u0280\u0281\7"+
		"\3\2\2\u0281\u0282\7\62\2\2\u0282\u0283\5\30\r\2\u0283\u0284\7\4\2\2\u0284"+
		"\u0286\3\2\2\2\u0285\u0280\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0288\5R*\2\u0288\u0289\b)\1\2\u0289Q\3\2\2\2\u028a\u029e\b"+
		"*\1\2\u028b\u028c\7\3\2\2\u028c\u0290\7\63\2\2\u028d\u028f\5\30\r\2\u028e"+
		"\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0293\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\b*\1\2\u0294"+
		"\u029d\7\4\2\2\u0295\u0296\7\3\2\2\u0296\u0297\7\63\2\2\u0297\u0298\5"+
		",\27\2\u0298\u0299\5\30\r\2\u0299\u029a\7\4\2\2\u029a\u029b\b*\1\2\u029b"+
		"\u029d\3\2\2\2\u029c\u028b\3\2\2\2\u029c\u0295\3\2\2\2\u029d\u02a0\3\2"+
		"\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1\u02a2\5B\"\2\u02a2\u02a3\b*\1\2\u02a3S\3\2\2\2\u02a4"+
		"\u02a5\7\3\2\2\u02a5\u02a6\79\2\2\u02a6\u02a7\5D#\2\u02a7\u02a8\7\4\2"+
		"\2\u02a8\u02a9\b+\1\2\u02a9U\3\2\2\2\u02aa\u02ab\7\3\2\2\u02ab\u02ad\7"+
		"\67\2\2\u02ac\u02ae\5*\26\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\5T+\2\u02b0\u02b6\b,\1\2\u02b1\u02b2\5*\26"+
		"\2\u02b2\u02b3\b,\1\2\u02b3\u02b5\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b5\u02b8"+
		"\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8"+
		"\u02b6\3\2\2\2\u02b9\u02ba\7\4\2\2\u02ba\u02bb\b,\1\2\u02bbW\3\2\2\2\u02bc"+
		"\u02bd\7\3\2\2\u02bd\u02bf\7\65\2\2\u02be\u02c0\5,\27\2\u02bf\u02be\3"+
		"\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\5Z.\2\u02c2"+
		"\u02c3\7\4\2\2\u02c3\u02c4\b-\1\2\u02c4Y\3\2\2\2\u02c5\u02c6\5\"\22\2"+
		"\u02c6\u02c7\b.\1\2\u02c7\u02da\3\2\2\2\u02c8\u02c9\5j\66\2\u02c9\u02ca"+
		"\5\"\22\2\u02ca\u02da\3\2\2\2\u02cb\u02cc\5p9\2\u02cc\u02cd\5Z.\2\u02cd"+
		"\u02da\3\2\2\2\u02ce\u02cf\5\32\16\2\u02cf\u02d0\7\3\2\2\u02d0\u02d4\7"+
		"\67\2\2\u02d1\u02d3\5*\26\2\u02d2\u02d1\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2"+
		"\2\2\u02d7\u02d8\7\4\2\2\u02d8\u02da\3\2\2\2\u02d9\u02c5\3\2\2\2\u02d9"+
		"\u02c8\3\2\2\2\u02d9\u02cb\3\2\2\2\u02d9\u02ce\3\2\2\2\u02da[\3\2\2\2"+
		"\u02db\u02dc\7\3\2\2\u02dc\u02de\78\2\2\u02dd\u02df\5*\26\2\u02de\u02dd"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e4\5T+\2\u02e1"+
		"\u02e3\7\b\2\2\u02e2\u02e1\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2"+
		"\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7"+
		"\u02e8\7\4\2\2\u02e8]\3\2\2\2\u02e9\u02ea\7\3\2\2\u02ea\u02ec\7\66\2\2"+
		"\u02eb\u02ed\5,\27\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\5`\61\2\u02ef\u02f0\7\4\2\2\u02f0\u02f1\b\60\1\2"+
		"\u02f1_\3\2\2\2\u02f2\u02f3\5$\23\2\u02f3\u02f4\b\61\1\2\u02f4\u0305\3"+
		"\2\2\2\u02f5\u02f6\5j\66\2\u02f6\u02f7\5$\23\2\u02f7\u0305\3\2\2\2\u02f8"+
		"\u02f9\5p9\2\u02f9\u02fa\5`\61\2\u02fa\u0305\3\2\2\2\u02fb\u02fc\7\3\2"+
		"\2\u02fc\u0300\78\2\2\u02fd\u02ff\7\b\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0302"+
		"\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0303\u0305\7\4\2\2\u0304\u02f2\3\2\2\2\u0304\u02f5\3\2"+
		"\2\2\u0304\u02f8\3\2\2\2\u0304\u02fb\3\2\2\2\u0305a\3\2\2\2\u0306\u0307"+
		"\7\3\2\2\u0307\u0309\7\64\2\2\u0308\u030a\5,\27\2\u0309\u0308\3\2\2\2"+
		"\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\5d\63\2\u030c\u030d"+
		"\7\4\2\2\u030d\u030e\b\62\1\2\u030ec\3\2\2\2\u030f\u0310\5\34\17\2\u0310"+
		"\u0311\5D#\2\u0311\u0312\b\63\1\2\u0312\u031a\3\2\2\2\u0313\u0314\5j\66"+
		"\2\u0314\u0315\5\34\17\2\u0315\u031a\3\2\2\2\u0316\u0317\5p9\2\u0317\u0318"+
		"\5d\63\2\u0318\u031a\3\2\2\2\u0319\u030f\3\2\2\2\u0319\u0313\3\2\2\2\u0319"+
		"\u0316\3\2\2\2\u031ae\3\2\2\2\u031b\u031c\7\3\2\2\u031c\u031e\7/\2\2\u031d"+
		"\u031f\5,\27\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2"+
		"\2\2\u0320\u0321\5&\24\2\u0321\u0322\7\4\2\2\u0322\u0344\3\2\2\2\u0323"+
		"\u0324\7\3\2\2\u0324\u0326\7/\2\2\u0325\u0327\5,\27\2\u0326\u0325\3\2"+
		"\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\5 \21\2\u0329"+
		"\u032a\7\4\2\2\u032a\u0344\3\2\2\2\u032b\u032c\7\3\2\2\u032c\u032e\7\65"+
		"\2\2\u032d\u032f\5,\27\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0331\5\"\22\2\u0331\u0332\7\4\2\2\u0332\u0344\3"+
		"\2\2\2\u0333\u0334\7\3\2\2\u0334\u0336\7\66\2\2\u0335\u0337\5,\27\2\u0336"+
		"\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\5$"+
		"\23\2\u0339\u033a\7\4\2\2\u033a\u0344\3\2\2\2\u033b\u033c\7\3\2\2\u033c"+
		"\u033e\7\64\2\2\u033d\u033f\5,\27\2\u033e\u033d\3\2\2\2\u033e\u033f\3"+
		"\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\5\34\17\2\u0341\u0342\7\4\2\2\u0342"+
		"\u0344\3\2\2\2\u0343\u031b\3\2\2\2\u0343\u0323\3\2\2\2\u0343\u032b\3\2"+
		"\2\2\u0343\u0333\3\2\2\2\u0343\u033b\3\2\2\2\u0344g\3\2\2\2\u0345\u0346"+
		"\7\3\2\2\u0346\u0347\7:\2\2\u0347\u0348\5\26\f\2\u0348\u0349\5\26\f\2"+
		"\u0349\u034a\5f\64\2\u034a\u034b\7\4\2\2\u034bi\3\2\2\2\u034c\u034d\7"+
		"\3\2\2\u034d\u034e\7:\2\2\u034e\u034f\5\26\f\2\u034f\u0350\5\26\f\2\u0350"+
		"\u0351\7\4\2\2\u0351k\3\2\2\2\u0352\u0353\7\3\2\2\u0353\u0354\7/\2\2\u0354"+
		"\u0355\5*\26\2\u0355\u0356\7\4\2\2\u0356\u0367\3\2\2\2\u0357\u0358\7\3"+
		"\2\2\u0358\u0359\7\65\2\2\u0359\u035a\5*\26\2\u035a\u035b\7\4\2\2\u035b"+
		"\u0367\3\2\2\2\u035c\u035d\7\3\2\2\u035d\u035e\7\66\2\2\u035e\u035f\5"+
		"*\26\2\u035f\u0360\7\4\2\2\u0360\u0367\3\2\2\2\u0361\u0362\7\3\2\2\u0362"+
		"\u0363\7\64\2\2\u0363\u0364\5*\26\2\u0364\u0365\7\4\2\2\u0365\u0367\3"+
		"\2\2\2\u0366\u0352\3\2\2\2\u0366\u0357\3\2\2\2\u0366\u035c\3\2\2\2\u0366"+
		"\u0361\3\2\2\2\u0367m\3\2\2\2\u0368\u0369\7\3\2\2\u0369\u036a\7;\2\2\u036a"+
		"\u036b\5\26\f\2\u036b\u036c\5l\67\2\u036c\u036d\7\4\2\2\u036do\3\2\2\2"+
		"\u036e\u036f\7\3\2\2\u036f\u0370\7;\2\2\u0370\u0371\5\26\f\2\u0371\u0372"+
		"\7\4\2\2\u0372q\3\2\2\2\u0373\u0374\5\36\20\2\u0374\u0375\b:\1\2\u0375"+
		"s\3\2\2\2\u0376\u0377\7\3\2\2\u0377\u0379\7.\2\2\u0378\u037a\5,\27\2\u0379"+
		"\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\5r"+
		":\2\u037c\u037d\7\4\2\2\u037d\u037e\b;\1\2\u037eu\3\2\2\2\u037f\u0380"+
		"\7\3\2\2\u0380\u0381\7\60\2\2\u0381\u0382\5*\26\2\u0382\u0383\7\4\2\2"+
		"\u0383w\3\2\2\2\u0384\u038f\5t;\2\u0385\u038f\5b\62\2\u0386\u038f\5X-"+
		"\2\u0387\u038f\5^\60\2\u0388\u038f\5F$\2\u0389\u038f\5V,\2\u038a\u038f"+
		"\5\\/\2\u038b\u038f\5v<\2\u038c\u038f\5h\65\2\u038d\u038f\5n8\2\u038e"+
		"\u0384\3\2\2\2\u038e\u0385\3\2\2\2\u038e\u0386\3\2\2\2\u038e\u0387\3\2"+
		"\2\2\u038e\u0388\3\2\2\2\u038e\u0389\3\2\2\2\u038e\u038a\3\2\2\2\u038e"+
		"\u038b\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038d\3\2\2\2\u038fy\3\2\2\2"+
		"\u0390\u0391\7\3\2\2\u0391\u0393\7<\2\2\u0392\u0394\7M\2\2\u0393\u0392"+
		"\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0398\3\2\2\2\u0395\u0397\5x=\2\u0396"+
		"\u0395\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2"+
		"\2\2\u0399\u039b\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u039c\7\4\2\2\u039c"+
		"{\3\2\2\2\u039d\u03ac\5z>\2\u039e\u039f\7\3\2\2\u039f\u03a1\7<\2\2\u03a0"+
		"\u03a2\7M\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2"+
		"\2\2\u03a3\u03a7\t\6\2\2\u03a4\u03a6\7\b\2\2\u03a5\u03a4\3\2\2\2\u03a6"+
		"\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2"+
		"\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ac\7\4\2\2\u03ab\u039d\3\2\2\2\u03ab"+
		"\u039e\3\2\2\2\u03ac}\3\2\2\2\u03ad\u03ae\7\3\2\2\u03ae\u03b0\7A\2\2\u03af"+
		"\u03b1\7M\2\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2"+
		"\2\2\u03b2\u03b3\5\26\f\2\u03b3\u03b4\5\u0088E\2\u03b4\u03b5\7\4\2\2\u03b5"+
		"\u03bf\3\2\2\2\u03b6\u03b7\7\3\2\2\u03b7\u03b9\7B\2\2\u03b8\u03ba\7M\2"+
		"\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc"+
		"\5\26\f\2\u03bc\u03bd\7\4\2\2\u03bd\u03bf\3\2\2\2\u03be\u03ad\3\2\2\2"+
		"\u03be\u03b6\3\2\2\2\u03bf\177\3\2\2\2\u03c0\u03c1\7\3\2\2\u03c1\u03c2"+
		"\7C\2\2\u03c2\u03c3\5|?\2\u03c3\u03c4\7\b\2\2\u03c4\u03c5\7\4\2\2\u03c5"+
		"\u03f5\3\2\2\2\u03c6\u03c7\7\3\2\2\u03c7\u03c8\7D\2\2\u03c8\u03c9\5|?"+
		"\2\u03c9\u03ca\7\b\2\2\u03ca\u03cb\7\4\2\2\u03cb\u03f5\3\2\2\2\u03cc\u03cd"+
		"\7\3\2\2\u03cd\u03ce\7E\2\2\u03ce\u03cf\5|?\2\u03cf\u03d0\7\b\2\2\u03d0"+
		"\u03d1\7\4\2\2\u03d1\u03f5\3\2\2\2\u03d2\u03d3\7\3\2\2\u03d3\u03d4\7I"+
		"\2\2\u03d4\u03d5\5|?\2\u03d5\u03d6\7\b\2\2\u03d6\u03d7\7\4\2\2\u03d7\u03f5"+
		"\3\2\2\2\u03d8\u03d9\7\3\2\2\u03d9\u03da\7F\2\2\u03da\u03db\5~@\2\u03db"+
		"\u03dc\5\u0088E\2\u03dc\u03dd\7\4\2\2\u03dd\u03f5\3\2\2\2\u03de\u03df"+
		"\7\3\2\2\u03df\u03e0\7G\2\2\u03e0\u03e1\5~@\2\u03e1\u03e2\7\4\2\2\u03e2"+
		"\u03f5\3\2\2\2\u03e3\u03e4\7\3\2\2\u03e4\u03e5\7H\2\2\u03e5\u03e6\5~@"+
		"\2\u03e6\u03e7\7\4\2\2\u03e7\u03f5\3\2\2\2\u03e8\u03e9\7\3\2\2\u03e9\u03ea"+
		"\7I\2\2\u03ea\u03eb\5~@\2\u03eb\u03ec\7\b\2\2\u03ec\u03ed\7\4\2\2\u03ed"+
		"\u03f5\3\2\2\2\u03ee\u03ef\7\3\2\2\u03ef\u03f0\7J\2\2\u03f0\u03f1\5~@"+
		"\2\u03f1\u03f2\7\b\2\2\u03f2\u03f3\7\4\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03c0"+
		"\3\2\2\2\u03f4\u03c6\3\2\2\2\u03f4\u03cc\3\2\2\2\u03f4\u03d2\3\2\2\2\u03f4"+
		"\u03d8\3\2\2\2\u03f4\u03de\3\2\2\2\u03f4\u03e3\3\2\2\2\u03f4\u03e8\3\2"+
		"\2\2\u03f4\u03ee\3\2\2\2\u03f5\u0081\3\2\2\2\u03f6\u0403\5~@\2\u03f7\u0403"+
		"\5\u0080A\2\u03f8\u0403\5|?\2\u03f9\u03fa\7\3\2\2\u03fa\u03fb\7@\2\2\u03fb"+
		"\u03fd\5\26\f\2\u03fc\u03fe\7M\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2"+
		"\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7\4\2\2\u0400\u0403\3\2\2\2\u0401"+
		"\u0403\5\u0084C\2\u0402\u03f6\3\2\2\2\u0402\u03f7\3\2\2\2\u0402\u03f8"+
		"\3\2\2\2\u0402\u03f9\3\2\2\2\u0402\u0401\3\2\2\2\u0403\u0083\3\2\2\2\u0404"+
		"\u0405\7\3\2\2\u0405\u0407\7?\2\2\u0406\u0408\7M\2\2\u0407\u0406\3\2\2"+
		"\2\u0407\u0408\3\2\2\2\u0408\u040c\3\2\2\2\u0409\u040b\5\u0082B\2\u040a"+
		"\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2"+
		"\2\2\u040d\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0425\7\4\2\2\u0410"+
		"\u0411\7\3\2\2\u0411\u0413\7K\2\2\u0412\u0414\7M\2\2\u0413\u0412\3\2\2"+
		"\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\7\b\2\2\u0416\u0425"+
		"\7\4\2\2\u0417\u0418\7\3\2\2\u0418\u041a\7L\2\2\u0419\u041b\7M\2\2\u041a"+
		"\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\7\b"+
		"\2\2\u041d\u0425\7\4\2\2\u041e\u041f\7\3\2\2\u041f\u0421\7L\2\2\u0420"+
		"\u0422\7M\2\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2"+
		"\2\2\u0423\u0425\7\4\2\2\u0424\u0404\3\2\2\2\u0424\u0410\3\2\2\2\u0424"+
		"\u0417\3\2\2\2\u0424\u041e\3\2\2\2\u0425\u0085\3\2\2\2\u0426\u0427\7\3"+
		"\2\2\u0427\u0428\7\n\2\2\u0428\u0429\5(\25\2\u0429\u042a\7\4\2\2\u042a"+
		"\u0087\3\2\2\2\u042b\u042d\5\u0086D\2\u042c\u042b\3\2\2\2\u042d\u0430"+
		"\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0089\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0431\u0433\5\u0082B\2\u0432\u0431\3\2\2\2\u0433\u0436"+
		"\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2\2\2\u0436"+
		"\u0434\3\2\2\2\u0437\u0440\7\2\2\3\u0438\u043a\5x=\2\u0439\u0438\3\2\2"+
		"\2\u043a\u043b\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d"+
		"\3\2\2\2\u043d\u043e\7\2\2\3\u043e\u0440\3\2\2\2\u043f\u0434\3\2\2\2\u043f"+
		"\u0439\3\2\2\2\u0440\u008b\3\2\2\2\u0441\u0442\5z>\2\u0442\u0443\7\2\2"+
		"\3\u0443\u044c\3\2\2\2\u0444\u0446\5x=\2\u0445\u0444\3\2\2\2\u0446\u0449"+
		"\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u044a\u044c\7\2\2\3\u044b\u0441\3\2\2\2\u044b\u0447\3\2"+
		"\2\2\u044c\u008d\3\2\2\2k\u0096\u009a\u00a1\u00a3\u00a8\u00ad\u00b5\u00bc"+
		"\u00c9\u00d4\u00d6\u00e3\u00e9\u00ff\u0113\u011b\u0120\u0127\u012e\u0147"+
		"\u015b\u0179\u017c\u0181\u0184\u0199\u019d\u01a7\u01ad\u01b5\u01bb\u01c0"+
		"\u01ca\u01d0\u01db\u01e1\u01e9\u01ef\u01f5\u01fb\u01fe\u0202\u0206\u020f"+
		"\u0219\u021d\u022a\u0232\u0239\u0242\u0249\u0253\u025d\u0263\u026d\u0278"+
		"\u027a\u0285\u0290\u029c\u029e\u02ad\u02b6\u02bf\u02d4\u02d9\u02de\u02e4"+
		"\u02ec\u0300\u0304\u0309\u0319\u031e\u0326\u032e\u0336\u033e\u0343\u0366"+
		"\u0379\u038e\u0393\u0398\u03a1\u03a7\u03ab\u03b0\u03b9\u03be\u03f4\u03fd"+
		"\u0402\u0407\u040c\u0413\u041a\u0421\u0424\u042e\u0434\u043b\u043f\u0447"+
		"\u044b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}