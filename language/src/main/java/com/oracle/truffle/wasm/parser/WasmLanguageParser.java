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
		RULE_wasmlanguage = 0, RULE_value = 1, RULE_name = 2, RULE_value_type = 3, 
		RULE_elem_type = 4, RULE_global_type = 5, RULE_def_type = 6, RULE_func_type = 7, 
		RULE_table_type = 8, RULE_memory_type = 9, RULE_type_use = 10, RULE_literal = 11, 
		RULE_var = 12, RULE_bind_var = 13, RULE_instr = 14, RULE_plain_instr = 15, 
		RULE_call_instr = 16, RULE_call_instr_params = 17, RULE_call_instr_instr = 18, 
		RULE_call_instr_params_instr = 19, RULE_call_instr_results_instr = 20, 
		RULE_block_instr = 21, RULE_block_type = 22, RULE_block = 23, RULE_instr_list = 24, 
		RULE_const_expr = 25, RULE_func = 26, RULE_func_fields = 27, RULE_func_fields_import = 28, 
		RULE_func_fields_import_result = 29, RULE_func_fields_body = 30, RULE_func_result_body = 31, 
		RULE_func_body = 32, RULE_offset = 33, RULE_elem = 34, RULE_table = 35, 
		RULE_table_fields = 36, RULE_data = 37, RULE_memory = 38, RULE_memory_fields = 39, 
		RULE_sglobal = 40, RULE_global_fields = 41, RULE_import_desc = 42, RULE_simport = 43, 
		RULE_inline_import = 44, RULE_export_desc = 45, RULE_export = 46, RULE_inline_export = 47, 
		RULE_type_ = 48, RULE_type_def = 49, RULE_start = 50, RULE_module_field = 51, 
		RULE_module_ = 52, RULE_script_module = 53, RULE_action = 54, RULE_assertion = 55, 
		RULE_cmd = 56, RULE_meta = 57, RULE_wconst = 58, RULE_const_list = 59, 
		RULE_script = 60, RULE_module = 61;
	public static final String[] ruleNames = {
		"wasmlanguage", "value", "name", "value_type", "elem_type", "global_type", 
		"def_type", "func_type", "table_type", "memory_type", "type_use", "literal", 
		"var", "bind_var", "instr", "plain_instr", "call_instr", "call_instr_params", 
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
	private static int numlocals = 0;

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
	    parser.wasmlanguage();
	    return parser.factory.getAllFunctions();
	}

	public WasmLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_wasmlanguage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		enterRule(_localctx, 2, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 4, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		enterRule(_localctx, 6, RULE_value_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		enterRule(_localctx, 8, RULE_elem_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		enterRule(_localctx, 10, RULE_global_type);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				value_type();
				 ((Global_typeContext)_localctx).result =  new Boolean(false); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(LPAR);
				setState(138);
				match(MUT);
				setState(139);
				value_type();
				setState(140);
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
		enterRule(_localctx, 12, RULE_def_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LPAR);
			setState(146);
			match(FUNC);
			setState(147);
			func_type();
			setState(148);
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
		enterRule(_localctx, 14, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(150);
				match(LPAR);
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(151);
					match(RESULT);
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(152);
						value_type();
						}
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(158);
					match(PARAM);
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(159);
						value_type();
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(165);
					match(PARAM);
					setState(166);
					bind_var();
					setState(167);
					value_type();
					}
					break;
				}
				setState(171);
				match(RPAR);
				}
				}
				setState(176);
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
		enterRule(_localctx, 16, RULE_table_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(NAT);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(178);
				match(NAT);
				}
			}

			setState(181);
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
		enterRule(_localctx, 18, RULE_memory_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((Memory_typeContext)_localctx).min = match(NAT);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(184);
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
		enterRule(_localctx, 20, RULE_type_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LPAR);
			setState(190);
			match(TYPE);
			setState(191);
			var();
			setState(192);
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
		enterRule(_localctx, 22, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 24, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 26, RULE_bind_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 28, RULE_instr);
		try {
			setState(209);
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
				setState(200);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((InstrContext)_localctx).call_instr_instr = call_instr_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).call_instr_instr.result; 
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
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
		enterRule(_localctx, 30, RULE_plain_instr);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((Plain_instrContext)_localctx).PRINT = match(PRINT);
				 ((Plain_instrContext)_localctx).result =  factory.createPrint(((Plain_instrContext)_localctx).PRINT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(BR);
				setState(222);
				var();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(BR_IF);
				setState(224);
				var();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(225);
				match(BR_TABLE);
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(226);
					var();
					}
					}
					setState(229); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(231);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(233);
				match(CALL);
				setState(234);
				((Plain_instrContext)_localctx).VAR = match(VAR);
				 List<WasmExpressionNode> params = new ArrayList<>();
				                                                          params.add((WasmExpressionNode) body.pop()); // FIXME only works w one arg atm
				                                                          ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createStringLiteral(((Plain_instrContext)_localctx).VAR, false), true), params, ((Plain_instrContext)_localctx).VAR); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
				match(CALL);
				setState(237);
				((Plain_instrContext)_localctx).NAT = match(NAT);
				 List<WasmExpressionNode> params = new ArrayList<>();
				                                                            params.add((WasmExpressionNode) body.pop()); // FIXME only works w one arg atm
				                                                            ((Plain_instrContext)_localctx).result =  factory.createCall(factory.createRead(factory.createIndexLiteral(((Plain_instrContext)_localctx).NAT, false), true), params, ((Plain_instrContext)_localctx).NAT); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(239);
				match(LOCAL_GET);
				setState(240);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(243);
				match(LOCAL_SET);
				setState(244);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(247);
				match(LOCAL_TEE);
				setState(248);
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
				setState(251);
				match(GLOBAL_GET);
				setState(252);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), false);
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), false);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(255);
				match(GLOBAL_SET);
				setState(256);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createWrite(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), true), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(259);
				((Plain_instrContext)_localctx).LOAD = match(LOAD);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(260);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(263);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createLoad(((Plain_instrContext)_localctx).LOAD, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(267);
				((Plain_instrContext)_localctx).STORE = match(STORE);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(268);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(271);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createStore(((Plain_instrContext)_localctx).STORE, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(275);
				((Plain_instrContext)_localctx).MEMORY_SIZE = match(MEMORY_SIZE);
				 ((Plain_instrContext)_localctx).result =  factory.createMemorySize(((Plain_instrContext)_localctx).MEMORY_SIZE); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(277);
				((Plain_instrContext)_localctx).MEMORY_GROW = match(MEMORY_GROW);
				 ((Plain_instrContext)_localctx).result =  factory.createMemoryGrow(((Plain_instrContext)_localctx).MEMORY_GROW, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(279);
				((Plain_instrContext)_localctx).CONST = match(CONST);
				setState(280);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).CONST, (((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(283);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(285);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(287);
				((Plain_instrContext)_localctx).UNARY = match(UNARY);
				 ((Plain_instrContext)_localctx).result =  factory.createUnary(((Plain_instrContext)_localctx).UNARY, (WasmExpressionNode) body.pop()); 
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(289);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(291);
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
		enterRule(_localctx, 32, RULE_call_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(CALL_INDIRECT);
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(296);
				type_use();
				}
				break;
			}
			setState(299);
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
		enterRule(_localctx, 34, RULE_call_instr_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					match(LPAR);
					setState(303);
					match(PARAM);
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(304);
						value_type();
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(310);
					match(RPAR);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(316);
				match(LPAR);
				setState(317);
				match(RESULT);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(318);
					value_type();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(RPAR);
				}
				}
				setState(329);
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
		enterRule(_localctx, 36, RULE_call_instr_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CALL_INDIRECT);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(331);
				type_use();
				}
				break;
			}
			setState(334);
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
		enterRule(_localctx, 38, RULE_call_instr_params_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					match(LPAR);
					setState(338);
					match(PARAM);
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(339);
						value_type();
						}
						}
						setState(344);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(345);
					match(RPAR);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(351);
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
		enterRule(_localctx, 40, RULE_call_instr_results_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(354);
				match(LPAR);
				setState(355);
				match(RESULT);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(356);
					value_type();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362);
				match(RPAR);
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
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
		enterRule(_localctx, 42, RULE_block_instr);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
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
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(372);
					((Block_instrContext)_localctx).bv1 = bind_var();
					}
				}

				 if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("block") == 0 && (((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null), "block has label at beginning"); } 
				setState(376);
				((Block_instrContext)_localctx).block = block();
				setState(377);
				match(END);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(378);
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
				setState(383);
				match(IF);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(384);
					bind_var();
					}
				}

				setState(387);
				block();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					 factory.startBlock();
					                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
					setState(389);
					match(ELSE);
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(390);
						bind_var();
						}
					}

					setState(393);
					((Block_instrContext)_localctx).res = instr_list(body);
					}
				}

				setState(396);
				match(END);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(397);
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
		enterRule(_localctx, 44, RULE_block_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(LPAR);
			setState(405);
			match(RESULT);
			setState(406);
			value_type();
			setState(407);
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
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(410);
				((BlockContext)_localctx).t = block_type();
				}
			}

			setState(413);
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
		enterRule(_localctx, 48, RULE_instr_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					((Instr_listContext)_localctx).instr = instr(body);
					 body.push(((Instr_listContext)_localctx).instr.result); 
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CALL_INDIRECT) {
				{
				setState(424);
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
		enterRule(_localctx, 50, RULE_const_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(431);
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
		enterRule(_localctx, 52, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(435);
			match(FUNC);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(436);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(440);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(442);
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
		enterRule(_localctx, 54, RULE_func_fields);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(444);
					type_use();
					}
					break;
				}
				setState(447);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				inline_import();
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(451);
					type_use();
					}
					break;
				}
				setState(454);
				((Func_fieldsContext)_localctx).func_fields_import = func_fields_import();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_import.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				inline_export();
				setState(458);
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
		enterRule(_localctx, 56, RULE_func_fields_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(463);
				match(LPAR);
				setState(464);
				match(PARAM);
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
				break;
			case 2:
				{
				setState(472);
				match(LPAR);
				setState(473);
				match(PARAM);
				setState(474);
				bind_var();
				setState(475);
				value_type();
				setState(476);
				match(RPAR);
				}
				break;
			}
			setState(480);
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
		enterRule(_localctx, 58, RULE_func_fields_import_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(483);
				match(LPAR);
				setState(484);
				match(RESULT);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(485);
					value_type();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				match(RPAR);
				}
				}
				setState(496);
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
		enterRule(_localctx, 60, RULE_func_fields_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(497);
						match(LPAR);
						setState(498);
						match(PARAM);
						setState(502);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(499);
							value_type();
							}
							}
							setState(504);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						 factory.addFormalParameter(null); 
						setState(506);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(507);
						match(LPAR);
						setState(508);
						match(PARAM);
						setState(509);
						((Func_fields_bodyContext)_localctx).VAR = match(VAR);
						setState(510);
						value_type();
						setState(511);
						match(RPAR);
						 factory.addFormalParameter(((Func_fields_bodyContext)_localctx).VAR); 
						}
						break;
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(519);
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
		enterRule(_localctx, 62, RULE_func_result_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(522);
				match(LPAR);
				setState(523);
				match(RESULT);
				setState(524);
				value_type();
				setState(525);
				match(RPAR);
				}
				break;
			}
			setState(529);
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
		enterRule(_localctx, 64, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(533);
					match(LPAR);
					setState(534);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(535);
						((Func_bodyContext)_localctx).value_type = value_type();
						}
						}
						setState(540);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, null, (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					setState(542);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(543);
					match(LPAR);
					setState(544);
					((Func_bodyContext)_localctx).LOCAL = match(LOCAL);
					setState(545);
					((Func_bodyContext)_localctx).bind_var = bind_var();
					setState(546);
					((Func_bodyContext)_localctx).value_type = value_type();
					setState(547);
					match(RPAR);
					 factory.createLocal(((Func_bodyContext)_localctx).LOCAL, (((Func_bodyContext)_localctx).bind_var!=null?(((Func_bodyContext)_localctx).bind_var.start):null), (((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null)); 
					}
					break;
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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
		enterRule(_localctx, 66, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(LPAR);
			setState(559);
			match(OFFSET);
			setState(560);
			const_expr();
			setState(561);
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
		enterRule(_localctx, 68, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(LPAR);
			setState(564);
			match(ELEM);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(565);
				var();
				}
			}

			setState(568);
			offset();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(569);
				var();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
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
		enterRule(_localctx, 70, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(LPAR);
			setState(578);
			match(TABLE);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(579);
				bind_var();
				}
			}

			setState(582);
			table_fields();
			setState(583);
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
		enterRule(_localctx, 72, RULE_table_fields);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				table_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				inline_import();
				setState(587);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				inline_export();
				setState(590);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				elem_type();
				setState(593);
				match(LPAR);
				setState(594);
				match(ELEM);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(595);
					var();
					}
					}
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(601);
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
		enterRule(_localctx, 74, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(LPAR);
			setState(606);
			match(DATA);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(607);
				var();
				}
			}

			setState(610);
			offset();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(611);
				match(STRING);
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
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(LPAR);
			setState(620);
			((MemoryContext)_localctx).MEMORY = match(MEMORY);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(621);
				((MemoryContext)_localctx).bind_var = bind_var();
				}
			}

			setState(624);
			((MemoryContext)_localctx).memory_fields = memory_fields();
			setState(625);
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
		enterRule(_localctx, 78, RULE_memory_fields);
		int _la;
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				((Memory_fieldsContext)_localctx).memory_type = memory_type();
				 ((Memory_fieldsContext)_localctx).result =  ((Memory_fieldsContext)_localctx).memory_type.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				inline_import();
				setState(632);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				inline_export();
				setState(635);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				match(LPAR);
				setState(638);
				match(DATA);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(639);
					match(STRING);
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645);
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
		enterRule(_localctx, 80, RULE_sglobal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(LPAR);
			setState(649);
			((SglobalContext)_localctx).GLOBAL = match(GLOBAL);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(650);
				((SglobalContext)_localctx).bind_var = bind_var();
				}
			}

			setState(653);
			((SglobalContext)_localctx).global_fields = global_fields();
			setState(654);
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
		enterRule(_localctx, 82, RULE_global_fields);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				((Global_fieldsContext)_localctx).global_type = global_type();
				setState(658);
				((Global_fieldsContext)_localctx).const_expr = const_expr();
				 ((Global_fieldsContext)_localctx).result_val =  ((Global_fieldsContext)_localctx).const_expr.result;
				                                                      ((Global_fieldsContext)_localctx).result_mut =  ((Global_fieldsContext)_localctx).global_type.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				inline_import();
				setState(662);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				inline_export();
				setState(665);
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
		enterRule(_localctx, 84, RULE_import_desc);
		int _la;
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				match(LPAR);
				setState(670);
				match(FUNC);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(671);
					bind_var();
					}
				}

				setState(674);
				type_use();
				setState(675);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(LPAR);
				setState(678);
				match(FUNC);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(679);
					bind_var();
					}
				}

				setState(682);
				func_type();
				setState(683);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(LPAR);
				setState(686);
				match(TABLE);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(687);
					bind_var();
					}
				}

				setState(690);
				table_type();
				setState(691);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				match(LPAR);
				setState(694);
				match(MEMORY);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(695);
					bind_var();
					}
				}

				setState(698);
				memory_type();
				setState(699);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(701);
				match(LPAR);
				setState(702);
				match(GLOBAL);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(703);
					bind_var();
					}
				}

				setState(706);
				global_type();
				setState(707);
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
		enterRule(_localctx, 86, RULE_simport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LPAR);
			setState(712);
			match(IMPORT);
			setState(713);
			name();
			setState(714);
			name();
			setState(715);
			import_desc();
			setState(716);
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
		enterRule(_localctx, 88, RULE_inline_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(LPAR);
			setState(719);
			match(IMPORT);
			setState(720);
			name();
			setState(721);
			name();
			setState(722);
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
		enterRule(_localctx, 90, RULE_export_desc);
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(LPAR);
				setState(725);
				match(FUNC);
				setState(726);
				var();
				setState(727);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				match(LPAR);
				setState(730);
				match(TABLE);
				setState(731);
				var();
				setState(732);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(734);
				match(LPAR);
				setState(735);
				match(MEMORY);
				setState(736);
				var();
				setState(737);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(739);
				match(LPAR);
				setState(740);
				match(GLOBAL);
				setState(741);
				var();
				setState(742);
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
		enterRule(_localctx, 92, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(LPAR);
			setState(747);
			match(EXPORT);
			setState(748);
			name();
			setState(749);
			export_desc();
			setState(750);
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
		enterRule(_localctx, 94, RULE_inline_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(LPAR);
			setState(753);
			match(EXPORT);
			setState(754);
			name();
			setState(755);
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
		enterRule(_localctx, 96, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
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
		enterRule(_localctx, 98, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(LPAR);
			setState(760);
			match(TYPE);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(761);
				bind_var();
				}
			}

			setState(764);
			type_();
			setState(765);
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
		enterRule(_localctx, 100, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(LPAR);
			setState(768);
			match(START);
			setState(769);
			var();
			setState(770);
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
		enterRule(_localctx, 102, RULE_module_field);
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(776);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(777);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(778);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(779);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(780);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(781);
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
		enterRule(_localctx, 104, RULE_module_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(LPAR);
			setState(785);
			match(MODULE);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(786);
				match(VAR);
				}
			}

			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(789);
				module_field();
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(795);
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
		enterRule(_localctx, 106, RULE_script_module);
		int _la;
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(LPAR);
				setState(799);
				match(MODULE);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(800);
					match(VAR);
					}
				}

				setState(803);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(804);
					match(STRING);
					}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(810);
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
		enterRule(_localctx, 108, RULE_action);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(LPAR);
				setState(814);
				match(INVOKE);
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(815);
					match(VAR);
					}
				}

				setState(818);
				name();
				setState(819);
				const_list();
				setState(820);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(LPAR);
				setState(823);
				match(GET);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(824);
					match(VAR);
					}
				}

				setState(827);
				name();
				setState(828);
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
		enterRule(_localctx, 110, RULE_assertion);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(LPAR);
				setState(833);
				match(ASSERT_MALFORMED);
				setState(834);
				script_module();
				setState(835);
				match(STRING);
				setState(836);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				match(LPAR);
				setState(839);
				match(ASSERT_INVALID);
				setState(840);
				script_module();
				setState(841);
				match(STRING);
				setState(842);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				match(LPAR);
				setState(845);
				match(ASSERT_UNLINKABLE);
				setState(846);
				script_module();
				setState(847);
				match(STRING);
				setState(848);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(850);
				match(LPAR);
				setState(851);
				match(ASSERT_TRAP);
				setState(852);
				script_module();
				setState(853);
				match(STRING);
				setState(854);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				match(LPAR);
				setState(857);
				match(ASSERT_RETURN);
				setState(858);
				action();
				setState(859);
				const_list();
				setState(860);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(862);
				match(LPAR);
				setState(863);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(864);
				action();
				setState(865);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(867);
				match(LPAR);
				setState(868);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(869);
				action();
				setState(870);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(872);
				match(LPAR);
				setState(873);
				match(ASSERT_TRAP);
				setState(874);
				action();
				setState(875);
				match(STRING);
				setState(876);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(878);
				match(LPAR);
				setState(879);
				match(ASSERT_EXHAUSTION);
				setState(880);
				action();
				setState(881);
				match(STRING);
				setState(882);
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
		enterRule(_localctx, 112, RULE_cmd);
		int _la;
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(888);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
				match(LPAR);
				setState(890);
				match(REGISTER);
				setState(891);
				name();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(892);
					match(VAR);
					}
				}

				setState(895);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(897);
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
		enterRule(_localctx, 114, RULE_meta);
		int _la;
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(LPAR);
				setState(901);
				match(SCRIPT);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(902);
					match(VAR);
					}
				}

				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(905);
					cmd();
					}
					}
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(911);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(LPAR);
				setState(913);
				match(INPUT);
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
				match(STRING);
				setState(918);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				match(LPAR);
				setState(920);
				match(OUTPUT);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(921);
					match(VAR);
					}
				}

				setState(924);
				match(STRING);
				setState(925);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(926);
				match(LPAR);
				setState(927);
				match(OUTPUT);
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
		enterRule(_localctx, 116, RULE_wconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(LPAR);
			setState(935);
			match(CONST);
			setState(936);
			literal();
			setState(937);
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
		enterRule(_localctx, 118, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(939);
				wconst();
				}
				}
				setState(944);
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
		enterRule(_localctx, 120, RULE_script);
		int _la;
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(945);
					cmd();
					}
					}
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(951);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(953); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(952);
					module_field();
					}
					}
					setState(955); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(957);
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
		enterRule(_localctx, 122, RULE_module);
		int _la;
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(961);
				module_();
				setState(962);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(964);
					module_field();
					}
					}
					setState(969);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(970);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u03d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u009c"+
		"\n\t\f\t\16\t\u009f\13\t\3\t\3\t\7\t\u00a3\n\t\f\t\16\t\u00a6\13\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\n\3"+
		"\n\5\n\u00b6\n\n\3\n\3\n\3\13\3\13\5\13\u00bc\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00d4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00e6\n\21\r\21\16\21\u00e7"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0108\n\21\3\21\5\21\u010b\n\21\3\21\3\21\3\21\5\21\u0110"+
		"\n\21\3\21\5\21\u0113\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0128\n\21\3\22"+
		"\3\22\5\22\u012c\n\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0134\n\23\f"+
		"\23\16\23\u0137\13\23\3\23\7\23\u013a\n\23\f\23\16\23\u013d\13\23\3\23"+
		"\3\23\3\23\7\23\u0142\n\23\f\23\16\23\u0145\13\23\3\23\7\23\u0148\n\23"+
		"\f\23\16\23\u014b\13\23\3\24\3\24\5\24\u014f\n\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u0157\n\25\f\25\16\25\u015a\13\25\3\25\7\25\u015d\n\25"+
		"\f\25\16\25\u0160\13\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0168\n\26"+
		"\f\26\16\26\u016b\13\26\3\26\7\26\u016e\n\26\f\26\16\26\u0171\13\26\3"+
		"\26\3\26\3\26\3\27\3\27\5\27\u0178\n\27\3\27\3\27\3\27\3\27\5\27\u017e"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u0184\n\27\3\27\3\27\3\27\3\27\5\27\u018a"+
		"\n\27\3\27\5\27\u018d\n\27\3\27\3\27\5\27\u0191\n\27\3\27\3\27\5\27\u0195"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u019e\n\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\7\32\u01a6\n\32\f\32\16\32\u01a9\13\32\3\32\5\32\u01ac"+
		"\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u01b8\n\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\5\35\u01c0\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u01c7\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01d0\n\35\3"+
		"\36\3\36\3\36\7\36\u01d5\n\36\f\36\16\36\u01d8\13\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u01e1\n\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u01e9\n\37\f\37\16\37\u01ec\13\37\3\37\7\37\u01ef\n\37\f\37\16\37\u01f2"+
		"\13\37\3 \3 \3 \7 \u01f7\n \f \16 \u01fa\13 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \7 \u0205\n \f \16 \u0208\13 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0212\n!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\7\"\u021b\n\"\f\"\16\"\u021e\13\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\7\"\u0229\n\"\f\"\16\"\u022c\13\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\5$\u0239\n$\3$\3$\7$\u023d\n$\f$\16$\u0240\13$"+
		"\3$\3$\3%\3%\3%\5%\u0247\n%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\7&\u0257\n&\f&\16&\u025a\13&\3&\3&\5&\u025e\n&\3\'\3\'\3\'\5\'\u0263"+
		"\n\'\3\'\3\'\7\'\u0267\n\'\f\'\16\'\u026a\13\'\3\'\3\'\3(\3(\3(\5(\u0271"+
		"\n(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0283\n)\f)\16"+
		")\u0286\13)\3)\5)\u0289\n)\3*\3*\3*\5*\u028e\n*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u029e\n+\3,\3,\3,\5,\u02a3\n,\3,\3,\3,\3,\3,\3"+
		",\5,\u02ab\n,\3,\3,\3,\3,\3,\3,\5,\u02b3\n,\3,\3,\3,\3,\3,\3,\5,\u02bb"+
		"\n,\3,\3,\3,\3,\3,\3,\5,\u02c3\n,\3,\3,\3,\5,\u02c8\n,\3-\3-\3-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\5/\u02eb\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u02fd\n\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0311\n\65\3\66\3\66\3\66\5\66\u0316\n\66\3\66\7\66\u0319\n"+
		"\66\f\66\16\66\u031c\13\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u0324\n"+
		"\67\3\67\3\67\7\67\u0328\n\67\f\67\16\67\u032b\13\67\3\67\5\67\u032e\n"+
		"\67\38\38\38\58\u0333\n8\38\38\38\38\38\38\38\58\u033c\n8\38\38\38\58"+
		"\u0341\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\59\u0377\n9\3:\3:\3:\3:\3:\3:\3:\5:\u0380"+
		"\n:\3:\3:\3:\5:\u0385\n:\3;\3;\3;\5;\u038a\n;\3;\7;\u038d\n;\f;\16;\u0390"+
		"\13;\3;\3;\3;\3;\5;\u0396\n;\3;\3;\3;\3;\3;\5;\u039d\n;\3;\3;\3;\3;\3"+
		";\5;\u03a4\n;\3;\5;\u03a7\n;\3<\3<\3<\3<\3<\3=\7=\u03af\n=\f=\16=\u03b2"+
		"\13=\3>\7>\u03b5\n>\f>\16>\u03b8\13>\3>\3>\6>\u03bc\n>\r>\16>\u03bd\3"+
		">\3>\5>\u03c2\n>\3?\3?\3?\3?\7?\u03c8\n?\f?\16?\u03cb\13?\3?\5?\u03ce"+
		"\n?\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\7\3\2\6\7\3\2\5\7\4\2\5\5MM\3\2"+
		"\21\22\3\2=>\2\u0427\2~\3\2\2\2\4\u0080\3\2\2\2\6\u0082\3\2\2\2\b\u0084"+
		"\3\2\2\2\n\u0086\3\2\2\2\f\u0091\3\2\2\2\16\u0093\3\2\2\2\20\u00b0\3\2"+
		"\2\2\22\u00b3\3\2\2\2\24\u00b9\3\2\2\2\26\u00bf\3\2\2\2\30\u00c4\3\2\2"+
		"\2\32\u00c6\3\2\2\2\34\u00c8\3\2\2\2\36\u00d3\3\2\2\2 \u0127\3\2\2\2\""+
		"\u0129\3\2\2\2$\u013b\3\2\2\2&\u014c\3\2\2\2(\u015e\3\2\2\2*\u016f\3\2"+
		"\2\2,\u0194\3\2\2\2.\u0196\3\2\2\2\60\u019b\3\2\2\2\62\u01a7\3\2\2\2\64"+
		"\u01b0\3\2\2\2\66\u01b4\3\2\2\28\u01cf\3\2\2\2:\u01e0\3\2\2\2<\u01f0\3"+
		"\2\2\2>\u0206\3\2\2\2@\u0211\3\2\2\2B\u0216\3\2\2\2D\u0230\3\2\2\2F\u0235"+
		"\3\2\2\2H\u0243\3\2\2\2J\u025d\3\2\2\2L\u025f\3\2\2\2N\u026d\3\2\2\2P"+
		"\u0288\3\2\2\2R\u028a\3\2\2\2T\u029d\3\2\2\2V\u02c7\3\2\2\2X\u02c9\3\2"+
		"\2\2Z\u02d0\3\2\2\2\\\u02ea\3\2\2\2^\u02ec\3\2\2\2`\u02f2\3\2\2\2b\u02f7"+
		"\3\2\2\2d\u02f9\3\2\2\2f\u0301\3\2\2\2h\u0310\3\2\2\2j\u0312\3\2\2\2l"+
		"\u032d\3\2\2\2n\u0340\3\2\2\2p\u0376\3\2\2\2r\u0384\3\2\2\2t\u03a6\3\2"+
		"\2\2v\u03a8\3\2\2\2x\u03b0\3\2\2\2z\u03c1\3\2\2\2|\u03cd\3\2\2\2~\177"+
		"\5|?\2\177\3\3\2\2\2\u0080\u0081\t\2\2\2\u0081\5\3\2\2\2\u0082\u0083\7"+
		"\b\2\2\u0083\7\3\2\2\2\u0084\u0085\7\t\2\2\u0085\t\3\2\2\2\u0086\u0087"+
		"\7\13\2\2\u0087\13\3\2\2\2\u0088\u0089\5\b\5\2\u0089\u008a\b\7\1\2\u008a"+
		"\u0092\3\2\2\2\u008b\u008c\7\3\2\2\u008c\u008d\7\f\2\2\u008d\u008e\5\b"+
		"\5\2\u008e\u008f\7\4\2\2\u008f\u0090\b\7\1\2\u0090\u0092\3\2\2\2\u0091"+
		"\u0088\3\2\2\2\u0091\u008b\3\2\2\2\u0092\r\3\2\2\2\u0093\u0094\7\3\2\2"+
		"\u0094\u0095\7/\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7\4\2\2\u0097\17"+
		"\3\2\2\2\u0098\u00ab\7\3\2\2\u0099\u009d\7\62\2\2\u009a\u009c\5\b\5\2"+
		"\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00ac\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4\7\61\2\2"+
		"\u00a1\u00a3\5\b\5\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7\61\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\5\b\5\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u0099\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\7\4\2\2\u00ae\u0098\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b5\7\5\2\2\u00b4\u00b6\7\5\2\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\n\6\2\u00b8\23\3\2\2"+
		"\2\u00b9\u00bb\7\5\2\2\u00ba\u00bc\7\5\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\13\1\2\u00be\25\3\2\2\2\u00bf"+
		"\u00c0\7\3\2\2\u00c0\u00c1\7.\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c3\7"+
		"\4\2\2\u00c3\27\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5\31\3\2\2\2\u00c6\u00c7"+
		"\t\4\2\2\u00c7\33\3\2\2\2\u00c8\u00c9\7M\2\2\u00c9\35\3\2\2\2\u00ca\u00cb"+
		"\5 \21\2\u00cb\u00cc\b\20\1\2\u00cc\u00d4\3\2\2\2\u00cd\u00ce\5&\24\2"+
		"\u00ce\u00cf\b\20\1\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\5,\27\2\u00d1\u00d2"+
		"\b\20\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00cd\3\2\2\2"+
		"\u00d3\u00d0\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\u0128"+
		"\b\21\1\2\u00d7\u00d8\7\r\2\2\u00d8\u0128\b\21\1\2\u00d9\u00da\7\16\2"+
		"\2\u00da\u0128\b\21\1\2\u00db\u00dc\7\20\2\2\u00dc\u0128\b\21\1\2\u00dd"+
		"\u00de\7\33\2\2\u00de\u0128\b\21\1\2\u00df\u00e0\7\24\2\2\u00e0\u0128"+
		"\5\32\16\2\u00e1\u00e2\7\25\2\2\u00e2\u0128\5\32\16\2\u00e3\u00e5\7\26"+
		"\2\2\u00e4\u00e6\5\32\16\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u0128\3\2\2\2\u00e9\u00ea\7\27"+
		"\2\2\u00ea\u0128\b\21\1\2\u00eb\u00ec\7\34\2\2\u00ec\u00ed\7M\2\2\u00ed"+
		"\u0128\b\21\1\2\u00ee\u00ef\7\34\2\2\u00ef\u00f0\7\5\2\2\u00f0\u0128\b"+
		"\21\1\2\u00f1\u00f2\7\36\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4\b\21\1"+
		"\2\u00f4\u0128\3\2\2\2\u00f5\u00f6\7\37\2\2\u00f6\u00f7\5\32\16\2\u00f7"+
		"\u00f8\b\21\1\2\u00f8\u0128\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\5\32"+
		"\16\2\u00fb\u00fc\b\21\1\2\u00fc\u0128\3\2\2\2\u00fd\u00fe\7!\2\2\u00fe"+
		"\u00ff\5\32\16\2\u00ff\u0100\b\21\1\2\u0100\u0128\3\2\2\2\u0101\u0102"+
		"\7\"\2\2\u0102\u0103\5\32\16\2\u0103\u0104\b\21\1\2\u0104\u0128\3\2\2"+
		"\2\u0105\u0107\7#\2\2\u0106\u0108\7%\2\2\u0107\u0106\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\7&\2\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0128\b\21\1\2\u010d\u010f\7"+
		"$\2\2\u010e\u0110\7%\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u0113\7&\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0128\b\21\1\2\u0115\u0116\7,\2\2\u0116"+
		"\u0128\b\21\1\2\u0117\u0118\7-\2\2\u0118\u0128\b\21\1\2\u0119\u011a\7"+
		"\n\2\2\u011a\u011b\5\30\r\2\u011b\u011c\b\21\1\2\u011c\u0128\3\2\2\2\u011d"+
		"\u011e\7)\2\2\u011e\u0128\b\21\1\2\u011f\u0120\7*\2\2\u0120\u0128\b\21"+
		"\1\2\u0121\u0122\7\'\2\2\u0122\u0128\b\21\1\2\u0123\u0124\7(\2\2\u0124"+
		"\u0128\b\21\1\2\u0125\u0126\7+\2\2\u0126\u0128\b\21\1\2\u0127\u00d5\3"+
		"\2\2\2\u0127\u00d7\3\2\2\2\u0127\u00d9\3\2\2\2\u0127\u00db\3\2\2\2\u0127"+
		"\u00dd\3\2\2\2\u0127\u00df\3\2\2\2\u0127\u00e1\3\2\2\2\u0127\u00e3\3\2"+
		"\2\2\u0127\u00e9\3\2\2\2\u0127\u00eb\3\2\2\2\u0127\u00ee\3\2\2\2\u0127"+
		"\u00f1\3\2\2\2\u0127\u00f5\3\2\2\2\u0127\u00f9\3\2\2\2\u0127\u00fd\3\2"+
		"\2\2\u0127\u0101\3\2\2\2\u0127\u0105\3\2\2\2\u0127\u010d\3\2\2\2\u0127"+
		"\u0115\3\2\2\2\u0127\u0117\3\2\2\2\u0127\u0119\3\2\2\2\u0127\u011d\3\2"+
		"\2\2\u0127\u011f\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0123\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128!\3\2\2\2\u0129\u012b\7\35\2\2\u012a\u012c\5\26\f"+
		"\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\5$\23\2\u012e\u012f\b\22\1\2\u012f#\3\2\2\2\u0130\u0131\7\3\2\2\u0131"+
		"\u0135\7\61\2\2\u0132\u0134\5\b\5\2\u0133\u0132\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u013a\7\4\2\2\u0139\u0130\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0149\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u013f\7\3\2\2\u013f\u0143\7\62\2\2\u0140\u0142\5"+
		"\b\5\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\4"+
		"\2\2\u0147\u013e\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a%\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\7\35\2\2"+
		"\u014d\u014f\5\26\f\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\5(\25\2\u0151\u0152\b\24\1\2\u0152\'\3\2\2\2\u0153"+
		"\u0154\7\3\2\2\u0154\u0158\7\61\2\2\u0155\u0157\5\b\5\2\u0156\u0155\3"+
		"\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\7\4\2\2\u015c\u0153\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5*\26\2\u0162\u0163\b\25"+
		"\1\2\u0163)\3\2\2\2\u0164\u0165\7\3\2\2\u0165\u0169\7\62\2\2\u0166\u0168"+
		"\5\b\5\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\7\4"+
		"\2\2\u016d\u0164\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\5\36"+
		"\20\2\u0173\u0174\b\26\1\2\u0174+\3\2\2\2\u0175\u0177\t\5\2\2\u0176\u0178"+
		"\5\34\17\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2"+
		"\u0179\u017a\b\27\1\2\u017a\u017b\5\60\31\2\u017b\u017d\7\23\2\2\u017c"+
		"\u017e\5\34\17\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3"+
		"\2\2\2\u017f\u0180\b\27\1\2\u0180\u0195\3\2\2\2\u0181\u0183\7\30\2\2\u0182"+
		"\u0184\5\34\17\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3"+
		"\2\2\2\u0185\u018c\5\60\31\2\u0186\u0187\b\27\1\2\u0187\u0189\7\32\2\2"+
		"\u0188\u018a\5\34\17\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018d\5\62\32\2\u018c\u0186\3\2\2\2\u018c\u018d\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u0190\7\23\2\2\u018f\u0191\5\34\17\2\u0190"+
		"\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b\27"+
		"\1\2\u0193\u0195\3\2\2\2\u0194\u0175\3\2\2\2\u0194\u0181\3\2\2\2\u0195"+
		"-\3\2\2\2\u0196\u0197\7\3\2\2\u0197\u0198\7\62\2\2\u0198\u0199\5\b\5\2"+
		"\u0199\u019a\7\4\2\2\u019a/\3\2\2\2\u019b\u019d\b\31\1\2\u019c\u019e\5"+
		".\30\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\5\62\32\2\u01a0\u01a1\b\31\1\2\u01a1\61\3\2\2\2\u01a2\u01a3\5\36"+
		"\20\2\u01a3\u01a4\b\32\1\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\5\"\22\2\u01ab\u01aa\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b\32\1\2\u01ae\u01af\b"+
		"\32\1\2\u01af\63\3\2\2\2\u01b0\u01b1\b\33\1\2\u01b1\u01b2\5\62\32\2\u01b2"+
		"\u01b3\b\33\1\2\u01b3\65\3\2\2\2\u01b4\u01b5\7\3\2\2\u01b5\u01b7\7/\2"+
		"\2\u01b6\u01b8\5\34\17\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\b\34\1\2\u01ba\u01bb\58\35\2\u01bb\u01bc\b"+
		"\34\1\2\u01bc\u01bd\7\4\2\2\u01bd\67\3\2\2\2\u01be\u01c0\5\26\f\2\u01bf"+
		"\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5>"+
		" \2\u01c2\u01c3\b\35\1\2\u01c3\u01d0\3\2\2\2\u01c4\u01c6\5Z.\2\u01c5\u01c7"+
		"\5\26\f\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2"+
		"\u01c8\u01c9\5:\36\2\u01c9\u01ca\b\35\1\2\u01ca\u01d0\3\2\2\2\u01cb\u01cc"+
		"\5`\61\2\u01cc\u01cd\58\35\2\u01cd\u01ce\b\35\1\2\u01ce\u01d0\3\2\2\2"+
		"\u01cf\u01bf\3\2\2\2\u01cf\u01c4\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d09\3"+
		"\2\2\2\u01d1\u01d2\7\3\2\2\u01d2\u01d6\7\61\2\2\u01d3\u01d5\5\b\5\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01e1\7\4\2\2\u01da"+
		"\u01db\7\3\2\2\u01db\u01dc\7\61\2\2\u01dc\u01dd\5\34\17\2\u01dd\u01de"+
		"\5\b\5\2\u01de\u01df\7\4\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d1\3\2\2\2\u01e0"+
		"\u01da\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\5<\37\2\u01e3\u01e4\b\36"+
		"\1\2\u01e4;\3\2\2\2\u01e5\u01e6\7\3\2\2\u01e6\u01ea\7\62\2\2\u01e7\u01e9"+
		"\5\b\5\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\7\4"+
		"\2\2\u01ee\u01e5\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1=\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7\3\2\2"+
		"\u01f4\u01f8\7\61\2\2\u01f5\u01f7\5\b\5\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01fc\b \1\2\u01fc\u0205\7\4\2\2\u01fd\u01fe\7\3"+
		"\2\2\u01fe\u01ff\7\61\2\2\u01ff\u0200\7M\2\2\u0200\u0201\5\b\5\2\u0201"+
		"\u0202\7\4\2\2\u0202\u0203\b \1\2\u0203\u0205\3\2\2\2\u0204\u01f3\3\2"+
		"\2\2\u0204\u01fd\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\5@"+
		"!\2\u020a\u020b\b \1\2\u020b?\3\2\2\2\u020c\u020d\7\3\2\2\u020d\u020e"+
		"\7\62\2\2\u020e\u020f\5\b\5\2\u020f\u0210\7\4\2\2\u0210\u0212\3\2\2\2"+
		"\u0211\u020c\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214"+
		"\5B\"\2\u0214\u0215\b!\1\2\u0215A\3\2\2\2\u0216\u022a\b\"\1\2\u0217\u0218"+
		"\7\3\2\2\u0218\u021c\7\63\2\2\u0219\u021b\5\b\5\2\u021a\u0219\3\2\2\2"+
		"\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f"+
		"\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\b\"\1\2\u0220\u0229\7\4\2\2\u0221"+
		"\u0222\7\3\2\2\u0222\u0223\7\63\2\2\u0223\u0224\5\34\17\2\u0224\u0225"+
		"\5\b\5\2\u0225\u0226\7\4\2\2\u0226\u0227\b\"\1\2\u0227\u0229\3\2\2\2\u0228"+
		"\u0217\3\2\2\2\u0228\u0221\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d"+
		"\u022e\5\62\32\2\u022e\u022f\b\"\1\2\u022fC\3\2\2\2\u0230\u0231\7\3\2"+
		"\2\u0231\u0232\79\2\2\u0232\u0233\5\64\33\2\u0233\u0234\7\4\2\2\u0234"+
		"E\3\2\2\2\u0235\u0236\7\3\2\2\u0236\u0238\7\67\2\2\u0237\u0239\5\32\16"+
		"\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023e"+
		"\5D#\2\u023b\u023d\5\32\16\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0241\u0242\7\4\2\2\u0242G\3\2\2\2\u0243\u0244\7\3\2\2\u0244\u0246"+
		"\7\65\2\2\u0245\u0247\5\34\17\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248\u0249\5J&\2\u0249\u024a\7\4\2\2\u024aI\3"+
		"\2\2\2\u024b\u025e\5\22\n\2\u024c\u024d\5Z.\2\u024d\u024e\5\22\n\2\u024e"+
		"\u025e\3\2\2\2\u024f\u0250\5`\61\2\u0250\u0251\5J&\2\u0251\u025e\3\2\2"+
		"\2\u0252\u0253\5\n\6\2\u0253\u0254\7\3\2\2\u0254\u0258\7\67\2\2\u0255"+
		"\u0257\5\32\16\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3"+
		"\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025c\7\4\2\2\u025c\u025e\3\2\2\2\u025d\u024b\3\2\2\2\u025d\u024c\3\2"+
		"\2\2\u025d\u024f\3\2\2\2\u025d\u0252\3\2\2\2\u025eK\3\2\2\2\u025f\u0260"+
		"\7\3\2\2\u0260\u0262\78\2\2\u0261\u0263\5\32\16\2\u0262\u0261\3\2\2\2"+
		"\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0268\5D#\2\u0265\u0267"+
		"\7\b\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\7\4"+
		"\2\2\u026cM\3\2\2\2\u026d\u026e\7\3\2\2\u026e\u0270\7\66\2\2\u026f\u0271"+
		"\5\34\17\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2"+
		"\u0272\u0273\5P)\2\u0273\u0274\7\4\2\2\u0274\u0275\b(\1\2\u0275O\3\2\2"+
		"\2\u0276\u0277\5\24\13\2\u0277\u0278\b)\1\2\u0278\u0289\3\2\2\2\u0279"+
		"\u027a\5Z.\2\u027a\u027b\5\24\13\2\u027b\u0289\3\2\2\2\u027c\u027d\5`"+
		"\61\2\u027d\u027e\5P)\2\u027e\u0289\3\2\2\2\u027f\u0280\7\3\2\2\u0280"+
		"\u0284\78\2\2\u0281\u0283\7\b\2\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0287\u0289\7\4\2\2\u0288\u0276\3\2\2\2\u0288\u0279\3\2"+
		"\2\2\u0288\u027c\3\2\2\2\u0288\u027f\3\2\2\2\u0289Q\3\2\2\2\u028a\u028b"+
		"\7\3\2\2\u028b\u028d\7\64\2\2\u028c\u028e\5\34\17\2\u028d\u028c\3\2\2"+
		"\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\5T+\2\u0290\u0291"+
		"\7\4\2\2\u0291\u0292\b*\1\2\u0292S\3\2\2\2\u0293\u0294\5\f\7\2\u0294\u0295"+
		"\5\64\33\2\u0295\u0296\b+\1\2\u0296\u029e\3\2\2\2\u0297\u0298\5Z.\2\u0298"+
		"\u0299\5\f\7\2\u0299\u029e\3\2\2\2\u029a\u029b\5`\61\2\u029b\u029c\5T"+
		"+\2\u029c\u029e\3\2\2\2\u029d\u0293\3\2\2\2\u029d\u0297\3\2\2\2\u029d"+
		"\u029a\3\2\2\2\u029eU\3\2\2\2\u029f\u02a0\7\3\2\2\u02a0\u02a2\7/\2\2\u02a1"+
		"\u02a3\5\34\17\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3"+
		"\2\2\2\u02a4\u02a5\5\26\f\2\u02a5\u02a6\7\4\2\2\u02a6\u02c8\3\2\2\2\u02a7"+
		"\u02a8\7\3\2\2\u02a8\u02aa\7/\2\2\u02a9\u02ab\5\34\17\2\u02aa\u02a9\3"+
		"\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\5\20\t\2\u02ad"+
		"\u02ae\7\4\2\2\u02ae\u02c8\3\2\2\2\u02af\u02b0\7\3\2\2\u02b0\u02b2\7\65"+
		"\2\2\u02b1\u02b3\5\34\17\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b5\5\22\n\2\u02b5\u02b6\7\4\2\2\u02b6\u02c8\3"+
		"\2\2\2\u02b7\u02b8\7\3\2\2\u02b8\u02ba\7\66\2\2\u02b9\u02bb\5\34\17\2"+
		"\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd"+
		"\5\24\13\2\u02bd\u02be\7\4\2\2\u02be\u02c8\3\2\2\2\u02bf\u02c0\7\3\2\2"+
		"\u02c0\u02c2\7\64\2\2\u02c1\u02c3\5\34\17\2\u02c2\u02c1\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\5\f\7\2\u02c5\u02c6\7\4"+
		"\2\2\u02c6\u02c8\3\2\2\2\u02c7\u029f\3\2\2\2\u02c7\u02a7\3\2\2\2\u02c7"+
		"\u02af\3\2\2\2\u02c7\u02b7\3\2\2\2\u02c7\u02bf\3\2\2\2\u02c8W\3\2\2\2"+
		"\u02c9\u02ca\7\3\2\2\u02ca\u02cb\7:\2\2\u02cb\u02cc\5\6\4\2\u02cc\u02cd"+
		"\5\6\4\2\u02cd\u02ce\5V,\2\u02ce\u02cf\7\4\2\2\u02cfY\3\2\2\2\u02d0\u02d1"+
		"\7\3\2\2\u02d1\u02d2\7:\2\2\u02d2\u02d3\5\6\4\2\u02d3\u02d4\5\6\4\2\u02d4"+
		"\u02d5\7\4\2\2\u02d5[\3\2\2\2\u02d6\u02d7\7\3\2\2\u02d7\u02d8\7/\2\2\u02d8"+
		"\u02d9\5\32\16\2\u02d9\u02da\7\4\2\2\u02da\u02eb\3\2\2\2\u02db\u02dc\7"+
		"\3\2\2\u02dc\u02dd\7\65\2\2\u02dd\u02de\5\32\16\2\u02de\u02df\7\4\2\2"+
		"\u02df\u02eb\3\2\2\2\u02e0\u02e1\7\3\2\2\u02e1\u02e2\7\66\2\2\u02e2\u02e3"+
		"\5\32\16\2\u02e3\u02e4\7\4\2\2\u02e4\u02eb\3\2\2\2\u02e5\u02e6\7\3\2\2"+
		"\u02e6\u02e7\7\64\2\2\u02e7\u02e8\5\32\16\2\u02e8\u02e9\7\4\2\2\u02e9"+
		"\u02eb\3\2\2\2\u02ea\u02d6\3\2\2\2\u02ea\u02db\3\2\2\2\u02ea\u02e0\3\2"+
		"\2\2\u02ea\u02e5\3\2\2\2\u02eb]\3\2\2\2\u02ec\u02ed\7\3\2\2\u02ed\u02ee"+
		"\7;\2\2\u02ee\u02ef\5\6\4\2\u02ef\u02f0\5\\/\2\u02f0\u02f1\7\4\2\2\u02f1"+
		"_\3\2\2\2\u02f2\u02f3\7\3\2\2\u02f3\u02f4\7;\2\2\u02f4\u02f5\5\6\4\2\u02f5"+
		"\u02f6\7\4\2\2\u02f6a\3\2\2\2\u02f7\u02f8\5\16\b\2\u02f8c\3\2\2\2\u02f9"+
		"\u02fa\7\3\2\2\u02fa\u02fc\7.\2\2\u02fb\u02fd\5\34\17\2\u02fc\u02fb\3"+
		"\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\5b\62\2\u02ff"+
		"\u0300\7\4\2\2\u0300e\3\2\2\2\u0301\u0302\7\3\2\2\u0302\u0303\7\60\2\2"+
		"\u0303\u0304\5\32\16\2\u0304\u0305\7\4\2\2\u0305g\3\2\2\2\u0306\u0311"+
		"\5d\63\2\u0307\u0311\5R*\2\u0308\u0311\5H%\2\u0309\u0311\5N(\2\u030a\u0311"+
		"\5\66\34\2\u030b\u0311\5F$\2\u030c\u0311\5L\'\2\u030d\u0311\5f\64\2\u030e"+
		"\u0311\5X-\2\u030f\u0311\5^\60\2\u0310\u0306\3\2\2\2\u0310\u0307\3\2\2"+
		"\2\u0310\u0308\3\2\2\2\u0310\u0309\3\2\2\2\u0310\u030a\3\2\2\2\u0310\u030b"+
		"\3\2\2\2\u0310\u030c\3\2\2\2\u0310\u030d\3\2\2\2\u0310\u030e\3\2\2\2\u0310"+
		"\u030f\3\2\2\2\u0311i\3\2\2\2\u0312\u0313\7\3\2\2\u0313\u0315\7<\2\2\u0314"+
		"\u0316\7M\2\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u031a\3\2"+
		"\2\2\u0317\u0319\5h\65\2\u0318\u0317\3\2\2\2\u0319\u031c\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031d\u031e\7\4\2\2\u031ek\3\2\2\2\u031f\u032e\5j\66\2\u0320\u0321"+
		"\7\3\2\2\u0321\u0323\7<\2\2\u0322\u0324\7M\2\2\u0323\u0322\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0329\t\6\2\2\u0326\u0328\7\b"+
		"\2\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\7\4"+
		"\2\2\u032d\u031f\3\2\2\2\u032d\u0320\3\2\2\2\u032em\3\2\2\2\u032f\u0330"+
		"\7\3\2\2\u0330\u0332\7A\2\2\u0331\u0333\7M\2\2\u0332\u0331\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\5\6\4\2\u0335\u0336\5x"+
		"=\2\u0336\u0337\7\4\2\2\u0337\u0341\3\2\2\2\u0338\u0339\7\3\2\2\u0339"+
		"\u033b\7B\2\2\u033a\u033c\7M\2\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2"+
		"\2\u033c\u033d\3\2\2\2\u033d\u033e\5\6\4\2\u033e\u033f\7\4\2\2\u033f\u0341"+
		"\3\2\2\2\u0340\u032f\3\2\2\2\u0340\u0338\3\2\2\2\u0341o\3\2\2\2\u0342"+
		"\u0343\7\3\2\2\u0343\u0344\7C\2\2\u0344\u0345\5l\67\2\u0345\u0346\7\b"+
		"\2\2\u0346\u0347\7\4\2\2\u0347\u0377\3\2\2\2\u0348\u0349\7\3\2\2\u0349"+
		"\u034a\7D\2\2\u034a\u034b\5l\67\2\u034b\u034c\7\b\2\2\u034c\u034d\7\4"+
		"\2\2\u034d\u0377\3\2\2\2\u034e\u034f\7\3\2\2\u034f\u0350\7E\2\2\u0350"+
		"\u0351\5l\67\2\u0351\u0352\7\b\2\2\u0352\u0353\7\4\2\2\u0353\u0377\3\2"+
		"\2\2\u0354\u0355\7\3\2\2\u0355\u0356\7I\2\2\u0356\u0357\5l\67\2\u0357"+
		"\u0358\7\b\2\2\u0358\u0359\7\4\2\2\u0359\u0377\3\2\2\2\u035a\u035b\7\3"+
		"\2\2\u035b\u035c\7F\2\2\u035c\u035d\5n8\2\u035d\u035e\5x=\2\u035e\u035f"+
		"\7\4\2\2\u035f\u0377\3\2\2\2\u0360\u0361\7\3\2\2\u0361\u0362\7G\2\2\u0362"+
		"\u0363\5n8\2\u0363\u0364\7\4\2\2\u0364\u0377\3\2\2\2\u0365\u0366\7\3\2"+
		"\2\u0366\u0367\7H\2\2\u0367\u0368\5n8\2\u0368\u0369\7\4\2\2\u0369\u0377"+
		"\3\2\2\2\u036a\u036b\7\3\2\2\u036b\u036c\7I\2\2\u036c\u036d\5n8\2\u036d"+
		"\u036e\7\b\2\2\u036e\u036f\7\4\2\2\u036f\u0377\3\2\2\2\u0370\u0371\7\3"+
		"\2\2\u0371\u0372\7J\2\2\u0372\u0373\5n8\2\u0373\u0374\7\b\2\2\u0374\u0375"+
		"\7\4\2\2\u0375\u0377\3\2\2\2\u0376\u0342\3\2\2\2\u0376\u0348\3\2\2\2\u0376"+
		"\u034e\3\2\2\2\u0376\u0354\3\2\2\2\u0376\u035a\3\2\2\2\u0376\u0360\3\2"+
		"\2\2\u0376\u0365\3\2\2\2\u0376\u036a\3\2\2\2\u0376\u0370\3\2\2\2\u0377"+
		"q\3\2\2\2\u0378\u0385\5n8\2\u0379\u0385\5p9\2\u037a\u0385\5l\67\2\u037b"+
		"\u037c\7\3\2\2\u037c\u037d\7@\2\2\u037d\u037f\5\6\4\2\u037e\u0380\7M\2"+
		"\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382"+
		"\7\4\2\2\u0382\u0385\3\2\2\2\u0383\u0385\5t;\2\u0384\u0378\3\2\2\2\u0384"+
		"\u0379\3\2\2\2\u0384\u037a\3\2\2\2\u0384\u037b\3\2\2\2\u0384\u0383\3\2"+
		"\2\2\u0385s\3\2\2\2\u0386\u0387\7\3\2\2\u0387\u0389\7?\2\2\u0388\u038a"+
		"\7M\2\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038e\3\2\2\2\u038b"+
		"\u038d\5r:\2\u038c\u038b\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2"+
		"\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u03a7"+
		"\7\4\2\2\u0392\u0393\7\3\2\2\u0393\u0395\7K\2\2\u0394\u0396\7M\2\2\u0395"+
		"\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\7\b"+
		"\2\2\u0398\u03a7\7\4\2\2\u0399\u039a\7\3\2\2\u039a\u039c\7L\2\2\u039b"+
		"\u039d\7M\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2"+
		"\2\2\u039e\u039f\7\b\2\2\u039f\u03a7\7\4\2\2\u03a0\u03a1\7\3\2\2\u03a1"+
		"\u03a3\7L\2\2\u03a2\u03a4\7M\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2"+
		"\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\7\4\2\2\u03a6\u0386\3\2\2\2\u03a6\u0392"+
		"\3\2\2\2\u03a6\u0399\3\2\2\2\u03a6\u03a0\3\2\2\2\u03a7u\3\2\2\2\u03a8"+
		"\u03a9\7\3\2\2\u03a9\u03aa\7\n\2\2\u03aa\u03ab\5\30\r\2\u03ab\u03ac\7"+
		"\4\2\2\u03acw\3\2\2\2\u03ad\u03af\5v<\2\u03ae\u03ad\3\2\2\2\u03af\u03b2"+
		"\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1y\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b3\u03b5\5r:\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2\2"+
		"\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b6"+
		"\3\2\2\2\u03b9\u03c2\7\2\2\3\u03ba\u03bc\5h\65\2\u03bb\u03ba\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u03c0\7\2\2\3\u03c0\u03c2\3\2\2\2\u03c1\u03b6\3\2\2\2\u03c1"+
		"\u03bb\3\2\2\2\u03c2{\3\2\2\2\u03c3\u03c4\5j\66\2\u03c4\u03c5\7\2\2\3"+
		"\u03c5\u03ce\3\2\2\2\u03c6\u03c8\5h\65\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cc\u03ce\7\2\2\3\u03cd\u03c3\3\2\2\2\u03cd\u03c9\3\2"+
		"\2\2\u03ce}\3\2\2\2_\u0091\u009d\u00a4\u00ab\u00b0\u00b5\u00bb\u00d3\u00e7"+
		"\u0107\u010a\u010f\u0112\u0127\u012b\u0135\u013b\u0143\u0149\u014e\u0158"+
		"\u015e\u0169\u016f\u0177\u017d\u0183\u0189\u018c\u0190\u0194\u019d\u01a7"+
		"\u01ab\u01b7\u01bf\u01c6\u01cf\u01d6\u01e0\u01ea\u01f0\u01f8\u0204\u0206"+
		"\u0211\u021c\u0228\u022a\u0238\u023e\u0246\u0258\u025d\u0262\u0268\u0270"+
		"\u0284\u0288\u028d\u029d\u02a2\u02aa\u02b2\u02ba\u02c2\u02c7\u02ea\u02fc"+
		"\u0310\u0315\u031a\u0323\u0329\u032d\u0332\u033b\u0340\u0376\u037f\u0384"+
		"\u0389\u038e\u0395\u039c\u03a3\u03a6\u03b0\u03b6\u03bd\u03c1\u03c9\u03cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}