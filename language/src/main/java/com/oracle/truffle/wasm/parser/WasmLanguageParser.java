// Generated from language/src/main/java/com/oracle/truffle/wasm/parser/WasmLanguage.g4 by ANTLR 4.7.1
package com.oracle.truffle.wasm.parser;

// DO NOT MODIFY - generated from WasmLanguage.g4 using "mx create-wasm-parser"

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.Map;

import java.lang.Integer;

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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				value_type();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(LPAR);
				setState(136);
				match(MUT);
				setState(137);
				value_type();
				setState(138);
				match(RPAR);
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
			setState(142);
			match(LPAR);
			setState(143);
			match(FUNC);
			setState(144);
			func_type();
			setState(145);
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(147);
				match(LPAR);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(148);
					match(RESULT);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(149);
						value_type();
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(155);
					match(PARAM);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(156);
						value_type();
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(162);
					match(PARAM);
					setState(163);
					bind_var();
					setState(164);
					value_type();
					}
					break;
				}
				setState(168);
				match(RPAR);
				}
				}
				setState(173);
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
			setState(174);
			match(NAT);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(175);
				match(NAT);
				}
			}

			setState(178);
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
			setState(180);
			match(NAT);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(181);
				match(NAT);
				}
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
			setState(184);
			match(LPAR);
			setState(185);
			match(TYPE);
			setState(186);
			var();
			setState(187);
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
			setState(189);
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
			setState(191);
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
			setState(193);
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
			setState(204);
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
				setState(195);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((InstrContext)_localctx).call_instr_instr = call_instr_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).call_instr_instr.result; 
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
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
		enterRule(_localctx, 30, RULE_plain_instr);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((Plain_instrContext)_localctx).PRINT = match(PRINT);
				 ((Plain_instrContext)_localctx).result =  factory.createPrint(((Plain_instrContext)_localctx).PRINT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(BR);
				setState(217);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				match(BR_IF);
				setState(219);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(220);
				match(BR_TABLE);
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					var();
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(226);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, null); 
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(228);
				match(CALL);
				setState(229);
				var();
				}
				break;
			case LOCAL_GET:
				enterOuterAlt(_localctx, 11);
				{
				setState(230);
				match(LOCAL_GET);
				setState(231);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false));
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null))); 
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 12);
				{
				setState(234);
				match(LOCAL_SET);
				setState(235);
				((Plain_instrContext)_localctx).var = var();
				 if ((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null).getText().charAt(0) == '$') ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false), (WasmExpressionNode) body.pop());
				                                                          else ((Plain_instrContext)_localctx).result =  factory.createAssignment(factory.createIndexLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null)), (WasmExpressionNode) body.pop()); 
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 13);
				{
				setState(238);
				match(LOCAL_TEE);
				setState(239);
				var();
				}
				break;
			case GLOBAL_GET:
				enterOuterAlt(_localctx, 14);
				{
				setState(240);
				match(GLOBAL_GET);
				setState(241);
				((Plain_instrContext)_localctx).var = var();
				 ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false)); 
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 15);
				{
				setState(244);
				match(GLOBAL_SET);
				setState(245);
				var();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 16);
				{
				setState(246);
				((Plain_instrContext)_localctx).LOAD = match(LOAD);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(247);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(250);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createLoad(((Plain_instrContext)_localctx).LOAD, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT); 
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 17);
				{
				setState(254);
				((Plain_instrContext)_localctx).STORE = match(STORE);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(255);
					((Plain_instrContext)_localctx).OFFSET_EQ_NAT = match(OFFSET_EQ_NAT);
					}
				}

				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(258);
					((Plain_instrContext)_localctx).ALIGN_EQ_NAT = match(ALIGN_EQ_NAT);
					}
				}

				 ((Plain_instrContext)_localctx).result =  factory.createStore(((Plain_instrContext)_localctx).STORE, ((Plain_instrContext)_localctx).OFFSET_EQ_NAT, ((Plain_instrContext)_localctx).ALIGN_EQ_NAT); 
				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 18);
				{
				setState(262);
				((Plain_instrContext)_localctx).MEMORY_SIZE = match(MEMORY_SIZE);
				 ((Plain_instrContext)_localctx).result =  factory.createMemorySize(((Plain_instrContext)_localctx).MEMORY_SIZE); 
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 19);
				{
				setState(264);
				((Plain_instrContext)_localctx).MEMORY_GROW = match(MEMORY_GROW);
				 ((Plain_instrContext)_localctx).result =  factory.createMemoryGrow(((Plain_instrContext)_localctx).MEMORY_GROW, (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 20);
				{
				setState(266);
				((Plain_instrContext)_localctx).CONST = match(CONST);
				setState(267);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).CONST, (((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 21);
				{
				setState(270);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 22);
				{
				setState(272);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(274);
				((Plain_instrContext)_localctx).UNARY = match(UNARY);
				 ((Plain_instrContext)_localctx).result =  factory.createUnary(((Plain_instrContext)_localctx).UNARY, (WasmExpressionNode) body.pop()); 
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 24);
				{
				setState(276);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 25);
				{
				setState(278);
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
		enterRule(_localctx, 32, RULE_call_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CALL_INDIRECT);
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(283);
				type_use();
				}
				break;
			}
			setState(286);
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
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(LPAR);
					setState(290);
					match(PARAM);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(291);
						value_type();
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(297);
					match(RPAR);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(303);
				match(LPAR);
				setState(304);
				match(RESULT);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(305);
					value_type();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				match(RPAR);
				}
				}
				setState(316);
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
			setState(317);
			match(CALL_INDIRECT);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(318);
				type_use();
				}
				break;
			}
			setState(321);
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
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(324);
					match(LPAR);
					setState(325);
					match(PARAM);
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(326);
						value_type();
						}
						}
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(332);
					match(RPAR);
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(338);
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
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(341);
				match(LPAR);
				setState(342);
				match(RESULT);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(343);
					value_type();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				match(RPAR);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
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
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
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
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(359);
					((Block_instrContext)_localctx).bv1 = bind_var();
					}
				}

				 if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("block") == 0 && (((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null), "block has label at beginning"); } 
				setState(363);
				((Block_instrContext)_localctx).block = block();
				setState(364);
				match(END);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(365);
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
				setState(370);
				match(IF);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(371);
					bind_var();
					}
				}

				setState(374);
				block();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					 factory.startBlock();
					                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
					setState(376);
					match(ELSE);
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(377);
						bind_var();
						}
					}

					setState(380);
					((Block_instrContext)_localctx).res = instr_list(body);
					}
				}

				setState(383);
				match(END);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(384);
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
			setState(391);
			match(LPAR);
			setState(392);
			match(RESULT);
			setState(393);
			value_type();
			setState(394);
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
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(397);
				((BlockContext)_localctx).t = block_type();
				}
			}

			setState(400);
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
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(403);
					((Instr_listContext)_localctx).instr = instr(body);
					 body.push(((Instr_listContext)_localctx).instr.result); 
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CALL_INDIRECT) {
				{
				setState(411);
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
			setState(417);
			instr_list(null);
			}
		}
		catch (RecognitionException re) {
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
			setState(419);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(420);
			match(FUNC);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(421);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(425);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(427);
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
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(429);
					type_use();
					}
					break;
				}
				setState(432);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				inline_import();
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(436);
					type_use();
					}
					break;
				}
				setState(439);
				((Func_fieldsContext)_localctx).func_fields_import = func_fields_import();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_import.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				inline_export();
				setState(443);
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
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(448);
				match(LPAR);
				setState(449);
				match(PARAM);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(450);
					value_type();
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(457);
				match(LPAR);
				setState(458);
				match(PARAM);
				setState(459);
				bind_var();
				setState(460);
				value_type();
				setState(461);
				match(RPAR);
				}
				break;
			}
			setState(465);
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
			}
		}
		catch (RecognitionException re) {
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
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(499);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(482);
						match(LPAR);
						setState(483);
						match(PARAM);
						setState(487);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(484);
							value_type();
							}
							}
							setState(489);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						 factory.addFormalParameter(null); 
						setState(491);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(492);
						match(LPAR);
						setState(493);
						match(PARAM);
						setState(494);
						((Func_fields_bodyContext)_localctx).VAR = match(VAR);
						setState(495);
						value_type();
						setState(496);
						match(RPAR);
						 factory.addFormalParameter(((Func_fields_bodyContext)_localctx).VAR); 
						}
						break;
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(504);
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
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(507);
				match(LPAR);
				setState(508);
				match(RESULT);
				setState(509);
				value_type();
				setState(510);
				match(RPAR);
				}
				break;
			}
			setState(514);
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
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(518);
					match(LPAR);
					setState(519);
					match(LOCAL);
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(520);
						((Func_bodyContext)_localctx).value_type = value_type();
						}
						}
						setState(525);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 factory.createAssignment(factory.createIndexLiteral(null), factory.createNumericLiteral((((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null), null)); 
					setState(527);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(528);
					match(LPAR);
					setState(529);
					match(LOCAL);
					setState(530);
					((Func_bodyContext)_localctx).bind_var = bind_var();
					setState(531);
					((Func_bodyContext)_localctx).value_type = value_type();
					setState(532);
					match(RPAR);
					 factory.createAssignment(factory.createStringLiteral((((Func_bodyContext)_localctx).bind_var!=null?(((Func_bodyContext)_localctx).bind_var.start):null), false), factory.createNumericLiteral((((Func_bodyContext)_localctx).value_type!=null?(((Func_bodyContext)_localctx).value_type.start):null), null)); 
					}
					break;
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
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
			setState(543);
			match(LPAR);
			setState(544);
			match(OFFSET);
			setState(545);
			const_expr();
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
			setState(548);
			match(LPAR);
			setState(549);
			match(ELEM);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(550);
				var();
				}
			}

			setState(553);
			offset();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(554);
				var();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560);
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
			setState(562);
			match(LPAR);
			setState(563);
			match(TABLE);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(564);
				bind_var();
				}
			}

			setState(567);
			table_fields();
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
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				table_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				inline_import();
				setState(572);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				inline_export();
				setState(575);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(577);
				elem_type();
				setState(578);
				match(LPAR);
				setState(579);
				match(ELEM);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(580);
					var();
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
			}
		}
		catch (RecognitionException re) {
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
			setState(590);
			match(LPAR);
			setState(591);
			match(DATA);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(592);
				var();
				}
			}

			setState(595);
			offset();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(596);
				match(STRING);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
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
			setState(604);
			match(LPAR);
			setState(605);
			match(MEMORY);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(606);
				bind_var();
				}
			}

			setState(609);
			memory_fields();
			setState(610);
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

	public static class Memory_fieldsContext extends ParserRuleContext {
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
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				memory_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				inline_import();
				setState(614);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				inline_export();
				setState(617);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
				match(LPAR);
				setState(620);
				match(DATA);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(621);
					match(STRING);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
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
			setState(630);
			match(LPAR);
			setState(631);
			match(GLOBAL);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(632);
				bind_var();
				}
			}

			setState(635);
			global_fields();
			setState(636);
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

	public static class Global_fieldsContext extends ParserRuleContext {
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
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				global_type();
				setState(639);
				const_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				inline_import();
				setState(642);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				inline_export();
				setState(645);
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
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(LPAR);
				setState(650);
				match(FUNC);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(651);
					bind_var();
					}
				}

				setState(654);
				type_use();
				setState(655);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(LPAR);
				setState(658);
				match(FUNC);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(659);
					bind_var();
					}
				}

				setState(662);
				func_type();
				setState(663);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				match(LPAR);
				setState(666);
				match(TABLE);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(667);
					bind_var();
					}
				}

				setState(670);
				table_type();
				setState(671);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(LPAR);
				setState(674);
				match(MEMORY);
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(675);
					bind_var();
					}
				}

				setState(678);
				memory_type();
				setState(679);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(681);
				match(LPAR);
				setState(682);
				match(GLOBAL);
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
				global_type();
				setState(687);
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
			setState(691);
			match(LPAR);
			setState(692);
			match(IMPORT);
			setState(693);
			name();
			setState(694);
			name();
			setState(695);
			import_desc();
			setState(696);
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
			setState(698);
			match(LPAR);
			setState(699);
			match(IMPORT);
			setState(700);
			name();
			setState(701);
			name();
			setState(702);
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
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(LPAR);
				setState(705);
				match(FUNC);
				setState(706);
				var();
				setState(707);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(LPAR);
				setState(710);
				match(TABLE);
				setState(711);
				var();
				setState(712);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				match(LPAR);
				setState(715);
				match(MEMORY);
				setState(716);
				var();
				setState(717);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(719);
				match(LPAR);
				setState(720);
				match(GLOBAL);
				setState(721);
				var();
				setState(722);
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
			setState(726);
			match(LPAR);
			setState(727);
			match(EXPORT);
			setState(728);
			name();
			setState(729);
			export_desc();
			setState(730);
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
			setState(732);
			match(LPAR);
			setState(733);
			match(EXPORT);
			setState(734);
			name();
			setState(735);
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
			setState(737);
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
			setState(739);
			match(LPAR);
			setState(740);
			match(TYPE);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(741);
				bind_var();
				}
			}

			setState(744);
			type_();
			setState(745);
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
			setState(747);
			match(LPAR);
			setState(748);
			match(START);
			setState(749);
			var();
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
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(756);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(758);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(759);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(760);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(761);
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
			setState(764);
			match(LPAR);
			setState(765);
			match(MODULE);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(766);
				match(VAR);
				}
			}

			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(769);
				module_field();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
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
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(LPAR);
				setState(779);
				match(MODULE);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(780);
					match(VAR);
					}
				}

				setState(783);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(784);
					match(STRING);
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
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
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(LPAR);
				setState(794);
				match(INVOKE);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(795);
					match(VAR);
					}
				}

				setState(798);
				name();
				setState(799);
				const_list();
				setState(800);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(LPAR);
				setState(803);
				match(GET);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(804);
					match(VAR);
					}
				}

				setState(807);
				name();
				setState(808);
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
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(LPAR);
				setState(813);
				match(ASSERT_MALFORMED);
				setState(814);
				script_module();
				setState(815);
				match(STRING);
				setState(816);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(LPAR);
				setState(819);
				match(ASSERT_INVALID);
				setState(820);
				script_module();
				setState(821);
				match(STRING);
				setState(822);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				match(LPAR);
				setState(825);
				match(ASSERT_UNLINKABLE);
				setState(826);
				script_module();
				setState(827);
				match(STRING);
				setState(828);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(830);
				match(LPAR);
				setState(831);
				match(ASSERT_TRAP);
				setState(832);
				script_module();
				setState(833);
				match(STRING);
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
				match(ASSERT_RETURN);
				setState(838);
				action();
				setState(839);
				const_list();
				setState(840);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(842);
				match(LPAR);
				setState(843);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(844);
				action();
				setState(845);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(847);
				match(LPAR);
				setState(848);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(849);
				action();
				setState(850);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(852);
				match(LPAR);
				setState(853);
				match(ASSERT_TRAP);
				setState(854);
				action();
				setState(855);
				match(STRING);
				setState(856);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(858);
				match(LPAR);
				setState(859);
				match(ASSERT_EXHAUSTION);
				setState(860);
				action();
				setState(861);
				match(STRING);
				setState(862);
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
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				match(LPAR);
				setState(870);
				match(REGISTER);
				setState(871);
				name();
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(872);
					match(VAR);
					}
				}

				setState(875);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(877);
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
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(LPAR);
				setState(881);
				match(SCRIPT);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(882);
					match(VAR);
					}
				}

				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(885);
					cmd();
					}
					}
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(891);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(LPAR);
				setState(893);
				match(INPUT);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(894);
					match(VAR);
					}
				}

				setState(897);
				match(STRING);
				setState(898);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
				match(LPAR);
				setState(900);
				match(OUTPUT);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(901);
					match(VAR);
					}
				}

				setState(904);
				match(STRING);
				setState(905);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(906);
				match(LPAR);
				setState(907);
				match(OUTPUT);
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(908);
					match(VAR);
					}
				}

				setState(911);
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
			setState(914);
			match(LPAR);
			setState(915);
			match(CONST);
			setState(916);
			literal();
			setState(917);
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
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(919);
				wconst();
				}
				}
				setState(924);
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
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(925);
					cmd();
					}
					}
					setState(930);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(932);
					module_field();
					}
					}
					setState(935); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(937);
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
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				module_();
				setState(942);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(944);
					module_field();
					}
					}
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(950);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u03bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u008f\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0099\n\t\f\t"+
		"\16\t\u009c\13\t\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00a9\n\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\n\3\n\5\n\u00b3"+
		"\n\n\3\n\3\n\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cf"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\6\21\u00e1\n\21\r\21\16\21\u00e2\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00fb\n\21\3\21\5\21\u00fe\n\21\3\21\3\21\3\21"+
		"\5\21\u0103\n\21\3\21\5\21\u0106\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011b"+
		"\n\21\3\22\3\22\5\22\u011f\n\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0127"+
		"\n\23\f\23\16\23\u012a\13\23\3\23\7\23\u012d\n\23\f\23\16\23\u0130\13"+
		"\23\3\23\3\23\3\23\7\23\u0135\n\23\f\23\16\23\u0138\13\23\3\23\7\23\u013b"+
		"\n\23\f\23\16\23\u013e\13\23\3\24\3\24\5\24\u0142\n\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u014a\n\25\f\25\16\25\u014d\13\25\3\25\7\25\u0150"+
		"\n\25\f\25\16\25\u0153\13\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u015b"+
		"\n\26\f\26\16\26\u015e\13\26\3\26\7\26\u0161\n\26\f\26\16\26\u0164\13"+
		"\26\3\26\3\26\3\26\3\27\3\27\5\27\u016b\n\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0171\n\27\3\27\3\27\3\27\3\27\5\27\u0177\n\27\3\27\3\27\3\27\3\27\5"+
		"\27\u017d\n\27\3\27\5\27\u0180\n\27\3\27\3\27\5\27\u0184\n\27\3\27\3\27"+
		"\5\27\u0188\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0191\n\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\7\32\u0199\n\32\f\32\16\32\u019c\13\32\3"+
		"\32\5\32\u019f\n\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\5\34\u01a9"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\3\35\5\35\u01b1\n\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01b8\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01c1\n"+
		"\35\3\36\3\36\3\36\7\36\u01c6\n\36\f\36\16\36\u01c9\13\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u01d2\n\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\7\37\u01da\n\37\f\37\16\37\u01dd\13\37\3\37\7\37\u01e0\n\37\f\37\16\37"+
		"\u01e3\13\37\3 \3 \3 \7 \u01e8\n \f \16 \u01eb\13 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \7 \u01f6\n \f \16 \u01f9\13 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0203"+
		"\n!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u020c\n\"\f\"\16\"\u020f\13\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u021a\n\"\f\"\16\"\u021d\13\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\5$\u022a\n$\3$\3$\7$\u022e\n$\f$\16$\u0231"+
		"\13$\3$\3$\3%\3%\3%\5%\u0238\n%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\7&\u0248\n&\f&\16&\u024b\13&\3&\3&\5&\u024f\n&\3\'\3\'\3\'\5\'\u0254"+
		"\n\'\3\'\3\'\7\'\u0258\n\'\f\'\16\'\u025b\13\'\3\'\3\'\3(\3(\3(\5(\u0262"+
		"\n(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0271\n)\f)\16)\u0274\13"+
		")\3)\5)\u0277\n)\3*\3*\3*\5*\u027c\n*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\5+\u028a\n+\3,\3,\3,\5,\u028f\n,\3,\3,\3,\3,\3,\3,\5,\u0297\n,\3"+
		",\3,\3,\3,\3,\3,\5,\u029f\n,\3,\3,\3,\3,\3,\3,\5,\u02a7\n,\3,\3,\3,\3"+
		",\3,\3,\5,\u02af\n,\3,\3,\3,\5,\u02b4\n,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\5/\u02d7\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\5\63\u02e9\n\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02fd"+
		"\n\65\3\66\3\66\3\66\5\66\u0302\n\66\3\66\7\66\u0305\n\66\f\66\16\66\u0308"+
		"\13\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u0310\n\67\3\67\3\67\7\67\u0314"+
		"\n\67\f\67\16\67\u0317\13\67\3\67\5\67\u031a\n\67\38\38\38\58\u031f\n"+
		"8\38\38\38\38\38\38\38\58\u0328\n8\38\38\38\58\u032d\n8\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\59\u0363\n9\3:\3:\3:\3:\3:\3:\3:\5:\u036c\n:\3:\3:\3:\5:\u0371\n"+
		":\3;\3;\3;\5;\u0376\n;\3;\7;\u0379\n;\f;\16;\u037c\13;\3;\3;\3;\3;\5;"+
		"\u0382\n;\3;\3;\3;\3;\3;\5;\u0389\n;\3;\3;\3;\3;\3;\5;\u0390\n;\3;\5;"+
		"\u0393\n;\3<\3<\3<\3<\3<\3=\7=\u039b\n=\f=\16=\u039e\13=\3>\7>\u03a1\n"+
		">\f>\16>\u03a4\13>\3>\3>\6>\u03a8\n>\r>\16>\u03a9\3>\3>\5>\u03ae\n>\3"+
		"?\3?\3?\3?\7?\u03b4\n?\f?\16?\u03b7\13?\3?\5?\u03ba\n?\3?\2\2@\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|\2\7\3\2\6\7\3\2\5\7\4\2\5\5MM\3\2\21\22\3\2=>\2\u0412"+
		"\2~\3\2\2\2\4\u0080\3\2\2\2\6\u0082\3\2\2\2\b\u0084\3\2\2\2\n\u0086\3"+
		"\2\2\2\f\u008e\3\2\2\2\16\u0090\3\2\2\2\20\u00ad\3\2\2\2\22\u00b0\3\2"+
		"\2\2\24\u00b6\3\2\2\2\26\u00ba\3\2\2\2\30\u00bf\3\2\2\2\32\u00c1\3\2\2"+
		"\2\34\u00c3\3\2\2\2\36\u00ce\3\2\2\2 \u011a\3\2\2\2\"\u011c\3\2\2\2$\u012e"+
		"\3\2\2\2&\u013f\3\2\2\2(\u0151\3\2\2\2*\u0162\3\2\2\2,\u0187\3\2\2\2."+
		"\u0189\3\2\2\2\60\u018e\3\2\2\2\62\u019a\3\2\2\2\64\u01a3\3\2\2\2\66\u01a5"+
		"\3\2\2\28\u01c0\3\2\2\2:\u01d1\3\2\2\2<\u01e1\3\2\2\2>\u01f7\3\2\2\2@"+
		"\u0202\3\2\2\2B\u0207\3\2\2\2D\u0221\3\2\2\2F\u0226\3\2\2\2H\u0234\3\2"+
		"\2\2J\u024e\3\2\2\2L\u0250\3\2\2\2N\u025e\3\2\2\2P\u0276\3\2\2\2R\u0278"+
		"\3\2\2\2T\u0289\3\2\2\2V\u02b3\3\2\2\2X\u02b5\3\2\2\2Z\u02bc\3\2\2\2\\"+
		"\u02d6\3\2\2\2^\u02d8\3\2\2\2`\u02de\3\2\2\2b\u02e3\3\2\2\2d\u02e5\3\2"+
		"\2\2f\u02ed\3\2\2\2h\u02fc\3\2\2\2j\u02fe\3\2\2\2l\u0319\3\2\2\2n\u032c"+
		"\3\2\2\2p\u0362\3\2\2\2r\u0370\3\2\2\2t\u0392\3\2\2\2v\u0394\3\2\2\2x"+
		"\u039c\3\2\2\2z\u03ad\3\2\2\2|\u03b9\3\2\2\2~\177\5|?\2\177\3\3\2\2\2"+
		"\u0080\u0081\t\2\2\2\u0081\5\3\2\2\2\u0082\u0083\7\b\2\2\u0083\7\3\2\2"+
		"\2\u0084\u0085\7\t\2\2\u0085\t\3\2\2\2\u0086\u0087\7\13\2\2\u0087\13\3"+
		"\2\2\2\u0088\u008f\5\b\5\2\u0089\u008a\7\3\2\2\u008a\u008b\7\f\2\2\u008b"+
		"\u008c\5\b\5\2\u008c\u008d\7\4\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2"+
		"\2\2\u008e\u0089\3\2\2\2\u008f\r\3\2\2\2\u0090\u0091\7\3\2\2\u0091\u0092"+
		"\7/\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\4\2\2\u0094\17\3\2\2\2\u0095"+
		"\u00a8\7\3\2\2\u0096\u009a\7\62\2\2\u0097\u0099\5\b\5\2\u0098\u0097\3"+
		"\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00a9\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\7\61\2\2\u009e\u00a0\5"+
		"\b\5\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\61"+
		"\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\5\b\5\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u0096\3\2\2\2\u00a8\u009d\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\7\4\2\2\u00ab\u0095\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b2\7\5\2\2\u00b1\u00b3\7\5\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5\n\6\2\u00b5\23\3\2\2\2\u00b6"+
		"\u00b8\7\5\2\2\u00b7\u00b9\7\5\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\25\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\7.\2\2\u00bc\u00bd"+
		"\5\32\16\2\u00bd\u00be\7\4\2\2\u00be\27\3\2\2\2\u00bf\u00c0\t\3\2\2\u00c0"+
		"\31\3\2\2\2\u00c1\u00c2\t\4\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\7M\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c7\b\20\1\2\u00c7\u00cf\3\2\2"+
		"\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\b\20\1\2\u00ca\u00cf\3\2\2\2\u00cb"+
		"\u00cc\5,\27\2\u00cc\u00cd\b\20\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00c5\3"+
		"\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\37\3\2\2\2\u00d0"+
		"\u00d1\7\17\2\2\u00d1\u011b\b\21\1\2\u00d2\u00d3\7\r\2\2\u00d3\u011b\b"+
		"\21\1\2\u00d4\u00d5\7\16\2\2\u00d5\u011b\b\21\1\2\u00d6\u00d7\7\20\2\2"+
		"\u00d7\u011b\b\21\1\2\u00d8\u00d9\7\33\2\2\u00d9\u011b\b\21\1\2\u00da"+
		"\u00db\7\24\2\2\u00db\u011b\5\32\16\2\u00dc\u00dd\7\25\2\2\u00dd\u011b"+
		"\5\32\16\2\u00de\u00e0\7\26\2\2\u00df\u00e1\5\32\16\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u011b\3\2\2\2\u00e4\u00e5\7\27\2\2\u00e5\u011b\b\21\1\2\u00e6\u00e7\7"+
		"\34\2\2\u00e7\u011b\5\32\16\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\5\32\16"+
		"\2\u00ea\u00eb\b\21\1\2\u00eb\u011b\3\2\2\2\u00ec\u00ed\7\37\2\2\u00ed"+
		"\u00ee\5\32\16\2\u00ee\u00ef\b\21\1\2\u00ef\u011b\3\2\2\2\u00f0\u00f1"+
		"\7 \2\2\u00f1\u011b\5\32\16\2\u00f2\u00f3\7!\2\2\u00f3\u00f4\5\32\16\2"+
		"\u00f4\u00f5\b\21\1\2\u00f5\u011b\3\2\2\2\u00f6\u00f7\7\"\2\2\u00f7\u011b"+
		"\5\32\16\2\u00f8\u00fa\7#\2\2\u00f9\u00fb\7%\2\2\u00fa\u00f9\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe\7&\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u011b\b\21\1\2\u0100"+
		"\u0102\7$\2\2\u0101\u0103\7%\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2"+
		"\2\u0103\u0105\3\2\2\2\u0104\u0106\7&\2\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u011b\b\21\1\2\u0108\u0109\7,\2\2\u0109"+
		"\u011b\b\21\1\2\u010a\u010b\7-\2\2\u010b\u011b\b\21\1\2\u010c\u010d\7"+
		"\n\2\2\u010d\u010e\5\30\r\2\u010e\u010f\b\21\1\2\u010f\u011b\3\2\2\2\u0110"+
		"\u0111\7)\2\2\u0111\u011b\b\21\1\2\u0112\u0113\7*\2\2\u0113\u011b\b\21"+
		"\1\2\u0114\u0115\7\'\2\2\u0115\u011b\b\21\1\2\u0116\u0117\7(\2\2\u0117"+
		"\u011b\b\21\1\2\u0118\u0119\7+\2\2\u0119\u011b\b\21\1\2\u011a\u00d0\3"+
		"\2\2\2\u011a\u00d2\3\2\2\2\u011a\u00d4\3\2\2\2\u011a\u00d6\3\2\2\2\u011a"+
		"\u00d8\3\2\2\2\u011a\u00da\3\2\2\2\u011a\u00dc\3\2\2\2\u011a\u00de\3\2"+
		"\2\2\u011a\u00e4\3\2\2\2\u011a\u00e6\3\2\2\2\u011a\u00e8\3\2\2\2\u011a"+
		"\u00ec\3\2\2\2\u011a\u00f0\3\2\2\2\u011a\u00f2\3\2\2\2\u011a\u00f6\3\2"+
		"\2\2\u011a\u00f8\3\2\2\2\u011a\u0100\3\2\2\2\u011a\u0108\3\2\2\2\u011a"+
		"\u010a\3\2\2\2\u011a\u010c\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0112\3\2"+
		"\2\2\u011a\u0114\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"!\3\2\2\2\u011c\u011e\7\35\2\2\u011d\u011f\5\26\f\2\u011e\u011d\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\5$\23\2\u0121\u0122"+
		"\b\22\1\2\u0122#\3\2\2\2\u0123\u0124\7\3\2\2\u0124\u0128\7\61\2\2\u0125"+
		"\u0127\5\b\5\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012d\7\4\2\2\u012c\u0123\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u013c\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0132\7\3\2\2\u0132\u0136\7\62\2\2\u0133\u0135\5\b\5\2\u0134\u0133\3"+
		"\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\7\4\2\2\u013a\u0131\3\2"+
		"\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"%\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\35\2\2\u0140\u0142\5\26\f"+
		"\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144"+
		"\5(\25\2\u0144\u0145\b\24\1\2\u0145\'\3\2\2\2\u0146\u0147\7\3\2\2\u0147"+
		"\u014b\7\61\2\2\u0148\u014a\5\b\5\2\u0149\u0148\3\2\2\2\u014a\u014d\3"+
		"\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0150\7\4\2\2\u014f\u0146\3\2\2\2\u0150\u0153\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0155\5*\26\2\u0155\u0156\b\25\1\2\u0156)\3\2\2\2"+
		"\u0157\u0158\7\3\2\2\u0158\u015c\7\62\2\2\u0159\u015b\5\b\5\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7\4\2\2\u0160\u0157\3\2"+
		"\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\5\36\20\2\u0166\u0167\b"+
		"\26\1\2\u0167+\3\2\2\2\u0168\u016a\t\5\2\2\u0169\u016b\5\34\17\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b\27"+
		"\1\2\u016d\u016e\5\60\31\2\u016e\u0170\7\23\2\2\u016f\u0171\5\34\17\2"+
		"\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\b\27\1\2\u0173\u0188\3\2\2\2\u0174\u0176\7\30\2\2\u0175\u0177\5\34\17"+
		"\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017f"+
		"\5\60\31\2\u0179\u017a\b\27\1\2\u017a\u017c\7\32\2\2\u017b\u017d\5\34"+
		"\17\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\5\62\32\2\u017f\u0179\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3"+
		"\2\2\2\u0181\u0183\7\23\2\2\u0182\u0184\5\34\17\2\u0183\u0182\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b\27\1\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0168\3\2\2\2\u0187\u0174\3\2\2\2\u0188-\3\2\2\2\u0189"+
		"\u018a\7\3\2\2\u018a\u018b\7\62\2\2\u018b\u018c\5\b\5\2\u018c\u018d\7"+
		"\4\2\2\u018d/\3\2\2\2\u018e\u0190\b\31\1\2\u018f\u0191\5.\30\2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\5\62\32\2"+
		"\u0193\u0194\b\31\1\2\u0194\61\3\2\2\2\u0195\u0196\5\36\20\2\u0196\u0197"+
		"\b\32\1\2\u0197\u0199\3\2\2\2\u0198\u0195\3\2\2\2\u0199\u019c\3\2\2\2"+
		"\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u019f\5\"\22\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2"+
		"\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\32\1\2\u01a1\u01a2\b\32\1\2\u01a2\63"+
		"\3\2\2\2\u01a3\u01a4\5\62\32\2\u01a4\65\3\2\2\2\u01a5\u01a6\7\3\2\2\u01a6"+
		"\u01a8\7/\2\2\u01a7\u01a9\5\34\17\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3"+
		"\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b\34\1\2\u01ab\u01ac\58\35\2\u01ac"+
		"\u01ad\b\34\1\2\u01ad\u01ae\7\4\2\2\u01ae\67\3\2\2\2\u01af\u01b1\5\26"+
		"\f\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\5> \2\u01b3\u01b4\b\35\1\2\u01b4\u01c1\3\2\2\2\u01b5\u01b7\5Z."+
		"\2\u01b6\u01b8\5\26\f\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\5:\36\2\u01ba\u01bb\b\35\1\2\u01bb\u01c1\3"+
		"\2\2\2\u01bc\u01bd\5`\61\2\u01bd\u01be\58\35\2\u01be\u01bf\b\35\1\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01b0\3\2\2\2\u01c0\u01b5\3\2\2\2\u01c0\u01bc\3\2"+
		"\2\2\u01c19\3\2\2\2\u01c2\u01c3\7\3\2\2\u01c3\u01c7\7\61\2\2\u01c4\u01c6"+
		"\5\b\5\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01d2\7\4"+
		"\2\2\u01cb\u01cc\7\3\2\2\u01cc\u01cd\7\61\2\2\u01cd\u01ce\5\34\17\2\u01ce"+
		"\u01cf\5\b\5\2\u01cf\u01d0\7\4\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01c2\3\2"+
		"\2\2\u01d1\u01cb\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5<\37\2\u01d4"+
		"\u01d5\b\36\1\2\u01d5;\3\2\2\2\u01d6\u01d7\7\3\2\2\u01d7\u01db\7\62\2"+
		"\2\u01d8\u01da\5\b\5\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e0\7\4\2\2\u01df\u01d6\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2=\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5"+
		"\7\3\2\2\u01e5\u01e9\7\61\2\2\u01e6\u01e8\5\b\5\2\u01e7\u01e6\3\2\2\2"+
		"\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\b \1\2\u01ed\u01f6\7\4\2\2\u01ee"+
		"\u01ef\7\3\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f1\7M\2\2\u01f1\u01f2\5\b"+
		"\5\2\u01f2\u01f3\7\4\2\2\u01f3\u01f4\b \1\2\u01f4\u01f6\3\2\2\2\u01f5"+
		"\u01e4\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fb\5@!\2\u01fb\u01fc\b \1\2\u01fc?\3\2\2\2\u01fd\u01fe\7\3\2\2\u01fe"+
		"\u01ff\7\62\2\2\u01ff\u0200\5\b\5\2\u0200\u0201\7\4\2\2\u0201\u0203\3"+
		"\2\2\2\u0202\u01fd\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\5B\"\2\u0205\u0206\b!\1\2\u0206A\3\2\2\2\u0207\u021b\b\"\1\2\u0208"+
		"\u0209\7\3\2\2\u0209\u020d\7\63\2\2\u020a\u020c\5\b\5\2\u020b\u020a\3"+
		"\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\b\"\1\2\u0211\u021a\7\4"+
		"\2\2\u0212\u0213\7\3\2\2\u0213\u0214\7\63\2\2\u0214\u0215\5\34\17\2\u0215"+
		"\u0216\5\b\5\2\u0216\u0217\7\4\2\2\u0217\u0218\b\"\1\2\u0218\u021a\3\2"+
		"\2\2\u0219\u0208\3\2\2\2\u0219\u0212\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u021f\5\62\32\2\u021f\u0220\b\"\1\2\u0220C\3\2\2\2\u0221\u0222"+
		"\7\3\2\2\u0222\u0223\79\2\2\u0223\u0224\5\64\33\2\u0224\u0225\7\4\2\2"+
		"\u0225E\3\2\2\2\u0226\u0227\7\3\2\2\u0227\u0229\7\67\2\2\u0228\u022a\5"+
		"\32\16\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022f\5D#\2\u022c\u022e\5\32\16\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0233\7\4\2\2\u0233G\3\2\2\2\u0234\u0235\7\3\2\2"+
		"\u0235\u0237\7\65\2\2\u0236\u0238\5\34\17\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\5J&\2\u023a\u023b\7\4\2"+
		"\2\u023bI\3\2\2\2\u023c\u024f\5\22\n\2\u023d\u023e\5Z.\2\u023e\u023f\5"+
		"\22\n\2\u023f\u024f\3\2\2\2\u0240\u0241\5`\61\2\u0241\u0242\5J&\2\u0242"+
		"\u024f\3\2\2\2\u0243\u0244\5\n\6\2\u0244\u0245\7\3\2\2\u0245\u0249\7\67"+
		"\2\2\u0246\u0248\5\32\16\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024c\u024d\7\4\2\2\u024d\u024f\3\2\2\2\u024e\u023c\3\2\2\2\u024e"+
		"\u023d\3\2\2\2\u024e\u0240\3\2\2\2\u024e\u0243\3\2\2\2\u024fK\3\2\2\2"+
		"\u0250\u0251\7\3\2\2\u0251\u0253\78\2\2\u0252\u0254\5\32\16\2\u0253\u0252"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0259\5D#\2\u0256"+
		"\u0258\7\b\2\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c"+
		"\u025d\7\4\2\2\u025dM\3\2\2\2\u025e\u025f\7\3\2\2\u025f\u0261\7\66\2\2"+
		"\u0260\u0262\5\34\17\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0264\5P)\2\u0264\u0265\7\4\2\2\u0265O\3\2\2\2\u0266\u0277"+
		"\5\24\13\2\u0267\u0268\5Z.\2\u0268\u0269\5\24\13\2\u0269\u0277\3\2\2\2"+
		"\u026a\u026b\5`\61\2\u026b\u026c\5P)\2\u026c\u0277\3\2\2\2\u026d\u026e"+
		"\7\3\2\2\u026e\u0272\78\2\2\u026f\u0271\7\b\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0277\7\4\2\2\u0276\u0266\3\2\2\2\u0276"+
		"\u0267\3\2\2\2\u0276\u026a\3\2\2\2\u0276\u026d\3\2\2\2\u0277Q\3\2\2\2"+
		"\u0278\u0279\7\3\2\2\u0279\u027b\7\64\2\2\u027a\u027c\5\34\17\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\5T"+
		"+\2\u027e\u027f\7\4\2\2\u027fS\3\2\2\2\u0280\u0281\5\f\7\2\u0281\u0282"+
		"\5\64\33\2\u0282\u028a\3\2\2\2\u0283\u0284\5Z.\2\u0284\u0285\5\f\7\2\u0285"+
		"\u028a\3\2\2\2\u0286\u0287\5`\61\2\u0287\u0288\5T+\2\u0288\u028a\3\2\2"+
		"\2\u0289\u0280\3\2\2\2\u0289\u0283\3\2\2\2\u0289\u0286\3\2\2\2\u028aU"+
		"\3\2\2\2\u028b\u028c\7\3\2\2\u028c\u028e\7/\2\2\u028d\u028f\5\34\17\2"+
		"\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291"+
		"\5\26\f\2\u0291\u0292\7\4\2\2\u0292\u02b4\3\2\2\2\u0293\u0294\7\3\2\2"+
		"\u0294\u0296\7/\2\2\u0295\u0297\5\34\17\2\u0296\u0295\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5\20\t\2\u0299\u029a\7\4\2\2"+
		"\u029a\u02b4\3\2\2\2\u029b\u029c\7\3\2\2\u029c\u029e\7\65\2\2\u029d\u029f"+
		"\5\34\17\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2"+
		"\u02a0\u02a1\5\22\n\2\u02a1\u02a2\7\4\2\2\u02a2\u02b4\3\2\2\2\u02a3\u02a4"+
		"\7\3\2\2\u02a4\u02a6\7\66\2\2\u02a5\u02a7\5\34\17\2\u02a6\u02a5\3\2\2"+
		"\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\5\24\13\2\u02a9"+
		"\u02aa\7\4\2\2\u02aa\u02b4\3\2\2\2\u02ab\u02ac\7\3\2\2\u02ac\u02ae\7\64"+
		"\2\2\u02ad\u02af\5\34\17\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b1\5\f\7\2\u02b1\u02b2\7\4\2\2\u02b2\u02b4\3\2"+
		"\2\2\u02b3\u028b\3\2\2\2\u02b3\u0293\3\2\2\2\u02b3\u029b\3\2\2\2\u02b3"+
		"\u02a3\3\2\2\2\u02b3\u02ab\3\2\2\2\u02b4W\3\2\2\2\u02b5\u02b6\7\3\2\2"+
		"\u02b6\u02b7\7:\2\2\u02b7\u02b8\5\6\4\2\u02b8\u02b9\5\6\4\2\u02b9\u02ba"+
		"\5V,\2\u02ba\u02bb\7\4\2\2\u02bbY\3\2\2\2\u02bc\u02bd\7\3\2\2\u02bd\u02be"+
		"\7:\2\2\u02be\u02bf\5\6\4\2\u02bf\u02c0\5\6\4\2\u02c0\u02c1\7\4\2\2\u02c1"+
		"[\3\2\2\2\u02c2\u02c3\7\3\2\2\u02c3\u02c4\7/\2\2\u02c4\u02c5\5\32\16\2"+
		"\u02c5\u02c6\7\4\2\2\u02c6\u02d7\3\2\2\2\u02c7\u02c8\7\3\2\2\u02c8\u02c9"+
		"\7\65\2\2\u02c9\u02ca\5\32\16\2\u02ca\u02cb\7\4\2\2\u02cb\u02d7\3\2\2"+
		"\2\u02cc\u02cd\7\3\2\2\u02cd\u02ce\7\66\2\2\u02ce\u02cf\5\32\16\2\u02cf"+
		"\u02d0\7\4\2\2\u02d0\u02d7\3\2\2\2\u02d1\u02d2\7\3\2\2\u02d2\u02d3\7\64"+
		"\2\2\u02d3\u02d4\5\32\16\2\u02d4\u02d5\7\4\2\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02c2\3\2\2\2\u02d6\u02c7\3\2\2\2\u02d6\u02cc\3\2\2\2\u02d6\u02d1\3\2"+
		"\2\2\u02d7]\3\2\2\2\u02d8\u02d9\7\3\2\2\u02d9\u02da\7;\2\2\u02da\u02db"+
		"\5\6\4\2\u02db\u02dc\5\\/\2\u02dc\u02dd\7\4\2\2\u02dd_\3\2\2\2\u02de\u02df"+
		"\7\3\2\2\u02df\u02e0\7;\2\2\u02e0\u02e1\5\6\4\2\u02e1\u02e2\7\4\2\2\u02e2"+
		"a\3\2\2\2\u02e3\u02e4\5\16\b\2\u02e4c\3\2\2\2\u02e5\u02e6\7\3\2\2\u02e6"+
		"\u02e8\7.\2\2\u02e7\u02e9\5\34\17\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3"+
		"\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\5b\62\2\u02eb\u02ec\7\4\2\2\u02ec"+
		"e\3\2\2\2\u02ed\u02ee\7\3\2\2\u02ee\u02ef\7\60\2\2\u02ef\u02f0\5\32\16"+
		"\2\u02f0\u02f1\7\4\2\2\u02f1g\3\2\2\2\u02f2\u02fd\5d\63\2\u02f3\u02fd"+
		"\5R*\2\u02f4\u02fd\5H%\2\u02f5\u02fd\5N(\2\u02f6\u02fd\5\66\34\2\u02f7"+
		"\u02fd\5F$\2\u02f8\u02fd\5L\'\2\u02f9\u02fd\5f\64\2\u02fa\u02fd\5X-\2"+
		"\u02fb\u02fd\5^\60\2\u02fc\u02f2\3\2\2\2\u02fc\u02f3\3\2\2\2\u02fc\u02f4"+
		"\3\2\2\2\u02fc\u02f5\3\2\2\2\u02fc\u02f6\3\2\2\2\u02fc\u02f7\3\2\2\2\u02fc"+
		"\u02f8\3\2\2\2\u02fc\u02f9\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2"+
		"\2\2\u02fdi\3\2\2\2\u02fe\u02ff\7\3\2\2\u02ff\u0301\7<\2\2\u0300\u0302"+
		"\7M\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0306\3\2\2\2\u0303"+
		"\u0305\5h\65\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2"+
		"\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309"+
		"\u030a\7\4\2\2\u030ak\3\2\2\2\u030b\u031a\5j\66\2\u030c\u030d\7\3\2\2"+
		"\u030d\u030f\7<\2\2\u030e\u0310\7M\2\2\u030f\u030e\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0315\t\6\2\2\u0312\u0314\7\b\2\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031a\7\4\2\2\u0319"+
		"\u030b\3\2\2\2\u0319\u030c\3\2\2\2\u031am\3\2\2\2\u031b\u031c\7\3\2\2"+
		"\u031c\u031e\7A\2\2\u031d\u031f\7M\2\2\u031e\u031d\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\5\6\4\2\u0321\u0322\5x=\2\u0322"+
		"\u0323\7\4\2\2\u0323\u032d\3\2\2\2\u0324\u0325\7\3\2\2\u0325\u0327\7B"+
		"\2\2\u0326\u0328\7M\2\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032a\5\6\4\2\u032a\u032b\7\4\2\2\u032b\u032d\3\2"+
		"\2\2\u032c\u031b\3\2\2\2\u032c\u0324\3\2\2\2\u032do\3\2\2\2\u032e\u032f"+
		"\7\3\2\2\u032f\u0330\7C\2\2\u0330\u0331\5l\67\2\u0331\u0332\7\b\2\2\u0332"+
		"\u0333\7\4\2\2\u0333\u0363\3\2\2\2\u0334\u0335\7\3\2\2\u0335\u0336\7D"+
		"\2\2\u0336\u0337\5l\67\2\u0337\u0338\7\b\2\2\u0338\u0339\7\4\2\2\u0339"+
		"\u0363\3\2\2\2\u033a\u033b\7\3\2\2\u033b\u033c\7E\2\2\u033c\u033d\5l\67"+
		"\2\u033d\u033e\7\b\2\2\u033e\u033f\7\4\2\2\u033f\u0363\3\2\2\2\u0340\u0341"+
		"\7\3\2\2\u0341\u0342\7I\2\2\u0342\u0343\5l\67\2\u0343\u0344\7\b\2\2\u0344"+
		"\u0345\7\4\2\2\u0345\u0363\3\2\2\2\u0346\u0347\7\3\2\2\u0347\u0348\7F"+
		"\2\2\u0348\u0349\5n8\2\u0349\u034a\5x=\2\u034a\u034b\7\4\2\2\u034b\u0363"+
		"\3\2\2\2\u034c\u034d\7\3\2\2\u034d\u034e\7G\2\2\u034e\u034f\5n8\2\u034f"+
		"\u0350\7\4\2\2\u0350\u0363\3\2\2\2\u0351\u0352\7\3\2\2\u0352\u0353\7H"+
		"\2\2\u0353\u0354\5n8\2\u0354\u0355\7\4\2\2\u0355\u0363\3\2\2\2\u0356\u0357"+
		"\7\3\2\2\u0357\u0358\7I\2\2\u0358\u0359\5n8\2\u0359\u035a\7\b\2\2\u035a"+
		"\u035b\7\4\2\2\u035b\u0363\3\2\2\2\u035c\u035d\7\3\2\2\u035d\u035e\7J"+
		"\2\2\u035e\u035f\5n8\2\u035f\u0360\7\b\2\2\u0360\u0361\7\4\2\2\u0361\u0363"+
		"\3\2\2\2\u0362\u032e\3\2\2\2\u0362\u0334\3\2\2\2\u0362\u033a\3\2\2\2\u0362"+
		"\u0340\3\2\2\2\u0362\u0346\3\2\2\2\u0362\u034c\3\2\2\2\u0362\u0351\3\2"+
		"\2\2\u0362\u0356\3\2\2\2\u0362\u035c\3\2\2\2\u0363q\3\2\2\2\u0364\u0371"+
		"\5n8\2\u0365\u0371\5p9\2\u0366\u0371\5l\67\2\u0367\u0368\7\3\2\2\u0368"+
		"\u0369\7@\2\2\u0369\u036b\5\6\4\2\u036a\u036c\7M\2\2\u036b\u036a\3\2\2"+
		"\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7\4\2\2\u036e\u0371"+
		"\3\2\2\2\u036f\u0371\5t;\2\u0370\u0364\3\2\2\2\u0370\u0365\3\2\2\2\u0370"+
		"\u0366\3\2\2\2\u0370\u0367\3\2\2\2\u0370\u036f\3\2\2\2\u0371s\3\2\2\2"+
		"\u0372\u0373\7\3\2\2\u0373\u0375\7?\2\2\u0374\u0376\7M\2\2\u0375\u0374"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037a\3\2\2\2\u0377\u0379\5r:\2\u0378"+
		"\u0377\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2"+
		"\2\2\u037b\u037d\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u0393\7\4\2\2\u037e"+
		"\u037f\7\3\2\2\u037f\u0381\7K\2\2\u0380\u0382\7M\2\2\u0381\u0380\3\2\2"+
		"\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\7\b\2\2\u0384\u0393"+
		"\7\4\2\2\u0385\u0386\7\3\2\2\u0386\u0388\7L\2\2\u0387\u0389\7M\2\2\u0388"+
		"\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7\b"+
		"\2\2\u038b\u0393\7\4\2\2\u038c\u038d\7\3\2\2\u038d\u038f\7L\2\2\u038e"+
		"\u0390\7M\2\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u0393\7\4\2\2\u0392\u0372\3\2\2\2\u0392\u037e\3\2\2\2\u0392"+
		"\u0385\3\2\2\2\u0392\u038c\3\2\2\2\u0393u\3\2\2\2\u0394\u0395\7\3\2\2"+
		"\u0395\u0396\7\n\2\2\u0396\u0397\5\30\r\2\u0397\u0398\7\4\2\2\u0398w\3"+
		"\2\2\2\u0399\u039b\5v<\2\u039a\u0399\3\2\2\2\u039b\u039e\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039dy\3\2\2\2\u039e\u039c\3\2\2\2"+
		"\u039f\u03a1\5r:\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5"+
		"\u03ae\7\2\2\3\u03a6\u03a8\5h\65\2\u03a7\u03a6\3\2\2\2\u03a8\u03a9\3\2"+
		"\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ac\7\2\2\3\u03ac\u03ae\3\2\2\2\u03ad\u03a2\3\2\2\2\u03ad\u03a7\3\2"+
		"\2\2\u03ae{\3\2\2\2\u03af\u03b0\5j\66\2\u03b0\u03b1\7\2\2\3\u03b1\u03ba"+
		"\3\2\2\2\u03b2\u03b4\5h\65\2\u03b3\u03b2\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b5\3\2"+
		"\2\2\u03b8\u03ba\7\2\2\3\u03b9\u03af\3\2\2\2\u03b9\u03b5\3\2\2\2\u03ba"+
		"}\3\2\2\2_\u008e\u009a\u00a1\u00a8\u00ad\u00b2\u00b8\u00ce\u00e2\u00fa"+
		"\u00fd\u0102\u0105\u011a\u011e\u0128\u012e\u0136\u013c\u0141\u014b\u0151"+
		"\u015c\u0162\u016a\u0170\u0176\u017c\u017f\u0183\u0187\u0190\u019a\u019e"+
		"\u01a8\u01b0\u01b7\u01c0\u01c7\u01d1\u01db\u01e1\u01e9\u01f5\u01f7\u0202"+
		"\u020d\u0219\u021b\u0229\u022f\u0237\u0249\u024e\u0253\u0259\u0261\u0272"+
		"\u0276\u027b\u0289\u028e\u0296\u029e\u02a6\u02ae\u02b3\u02d6\u02e8\u02fc"+
		"\u0301\u0306\u030f\u0315\u0319\u031e\u0327\u032c\u0362\u036b\u0370\u0375"+
		"\u037a\u0381\u0388\u038f\u0392\u039c\u03a2\u03a9\u03ad\u03b5\u03b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}