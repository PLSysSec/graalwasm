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
		RULE_block_instr = 16, RULE_block_type = 17, RULE_block = 18, RULE_expr = 19, 
		RULE_expr1 = 20, RULE_instr_list = 21, RULE_const_expr = 22, RULE_func = 23, 
		RULE_func_fields = 24, RULE_func_fields_import = 25, RULE_func_fields_import_result = 26, 
		RULE_func_fields_body = 27, RULE_func_result_body = 28, RULE_func_body = 29, 
		RULE_offset = 30, RULE_elem = 31, RULE_table = 32, RULE_table_fields = 33, 
		RULE_data = 34, RULE_memory = 35, RULE_memory_fields = 36, RULE_sglobal = 37, 
		RULE_global_fields = 38, RULE_import_desc = 39, RULE_simport = 40, RULE_inline_import = 41, 
		RULE_export_desc = 42, RULE_export = 43, RULE_inline_export = 44, RULE_type_ = 45, 
		RULE_type_def = 46, RULE_start = 47, RULE_module_field = 48, RULE_module_ = 49, 
		RULE_script_module = 50, RULE_action = 51, RULE_assertion = 52, RULE_cmd = 53, 
		RULE_meta = 54, RULE_wconst = 55, RULE_const_list = 56, RULE_script = 57, 
		RULE_module = 58;
	public static final String[] ruleNames = {
		"wasmlanguage", "value", "name", "value_type", "elem_type", "global_type", 
		"def_type", "func_type", "table_type", "memory_type", "type_use", "literal", 
		"var", "bind_var", "instr", "plain_instr", "block_instr", "block_type", 
		"block", "expr", "expr1", "instr_list", "const_expr", "func", "func_fields", 
		"func_fields_import", "func_fields_import_result", "func_fields_body", 
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
			setState(118);
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
			setState(120);
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
			setState(122);
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
			setState(124);
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
			setState(126);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				value_type();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(LPAR);
				setState(130);
				match(MUT);
				setState(131);
				value_type();
				setState(132);
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
			setState(136);
			match(LPAR);
			setState(137);
			match(FUNC);
			setState(138);
			func_type();
			setState(139);
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
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(141);
				match(LPAR);
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(142);
					match(RESULT);
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(143);
						value_type();
						}
						}
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(149);
					match(PARAM);
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(150);
						value_type();
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(156);
					match(PARAM);
					setState(157);
					bind_var();
					setState(158);
					value_type();
					}
					break;
				}
				setState(162);
				match(RPAR);
				}
				}
				setState(167);
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
			setState(168);
			match(NAT);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(169);
				match(NAT);
				}
			}

			setState(172);
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

			}
		}
		catch (RecognitionException re) {
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
			setState(178);
			match(LPAR);
			setState(179);
			match(TYPE);
			setState(180);
			var();
			setState(181);
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
			setState(183);
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
			setState(185);
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
			setState(187);
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
		public Block_instrContext block_instr;
		public Plain_instrContext plain_instr() {
			return getRuleContext(Plain_instrContext.class,0);
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
			setState(195);
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
				setState(189);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((Plain_instrContext)_localctx).PRINT = match(PRINT);
				 ((Plain_instrContext)_localctx).result =  factory.createPrint(((Plain_instrContext)_localctx).PRINT, (WasmExpressionNode) body.pop()); 
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(BR);
				setState(208);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(BR_IF);
				setState(210);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				match(BR_TABLE);
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					var();
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(217);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, null); 
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				match(CALL);
				setState(220);
				var();
				}
				break;
			case LOCAL_GET:
				enterOuterAlt(_localctx, 11);
				{
				setState(221);
				match(LOCAL_GET);
				setState(222);
				((Plain_instrContext)_localctx).var = var();
				 ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false)); 
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 12);
				{
				setState(225);
				match(LOCAL_SET);
				setState(226);
				var();
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 13);
				{
				setState(227);
				match(LOCAL_TEE);
				setState(228);
				var();
				}
				break;
			case GLOBAL_GET:
				enterOuterAlt(_localctx, 14);
				{
				setState(229);
				match(GLOBAL_GET);
				setState(230);
				((Plain_instrContext)_localctx).var = var();
				 ((Plain_instrContext)_localctx).result =  factory.createRead(factory.createStringLiteral((((Plain_instrContext)_localctx).var!=null?(((Plain_instrContext)_localctx).var.start):null), false)); 
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 15);
				{
				setState(233);
				match(GLOBAL_SET);
				setState(234);
				var();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 16);
				{
				setState(235);
				match(LOAD);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(236);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(239);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 17);
				{
				setState(242);
				match(STORE);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(243);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(246);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 18);
				{
				setState(249);
				match(MEMORY_SIZE);
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 19);
				{
				setState(250);
				match(MEMORY_GROW);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 20);
				{
				setState(251);
				((Plain_instrContext)_localctx).CONST = match(CONST);
				setState(252);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).CONST, (((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 21);
				{
				setState(255);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 22);
				{
				setState(257);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(259);
				((Plain_instrContext)_localctx).UNARY = match(UNARY);
				 ((Plain_instrContext)_localctx).result =  factory.createUnary(((Plain_instrContext)_localctx).UNARY, (WasmExpressionNode) body.pop()); 
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 24);
				{
				setState(261);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 25);
				{
				setState(263);
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
		enterRule(_localctx, 32, RULE_block_instr);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
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
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(268);
					((Block_instrContext)_localctx).bv1 = bind_var();
					}
				}

				 if ((((Block_instrContext)_localctx).l!=null?((Block_instrContext)_localctx).l.getText():null).compareTo("block") == 0 && (((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null) != null) { SemErr((((Block_instrContext)_localctx).bv1!=null?(((Block_instrContext)_localctx).bv1.start):null), "block has label at beginning"); } 
				setState(272);
				((Block_instrContext)_localctx).block = block();
				setState(273);
				match(END);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(274);
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
				setState(279);
				match(IF);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(280);
					bind_var();
					}
				}

				setState(283);
				block();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					 factory.startBlock();
					                                          Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
					setState(285);
					match(ELSE);
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(286);
						bind_var();
						}
					}

					setState(289);
					((Block_instrContext)_localctx).res = instr_list(body);
					}
				}

				setState(292);
				match(END);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(293);
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
		enterRule(_localctx, 34, RULE_block_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LPAR);
			setState(301);
			match(RESULT);
			setState(302);
			value_type();
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                              Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(306);
				((BlockContext)_localctx).t = block_type();
				}
			}

			setState(309);
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

	public static class ExprContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public Token s;
		public Expr1Context x;
		public Token e;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr(Stack<WasmStatementNode> body) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), body);
		enterRule(_localctx, 38, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((ExprContext)_localctx).s = match(LPAR);
			setState(313);
			((ExprContext)_localctx).x = expr1(body);
			setState(314);
			((ExprContext)_localctx).e = match(RPAR);
			 ((ExprContext)_localctx).result =  factory.createParenExpression((WasmExpressionNode) ((ExprContext)_localctx).x.result, ((ExprContext)_localctx).s.getStartIndex(), ((ExprContext)_localctx).e.getStopIndex() - ((ExprContext)_localctx).s.getStartIndex() + 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public ExprContext r;
		public Plain_instrContext plain_instr() {
			return getRuleContext(Plain_instrContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr1Context(ParserRuleContext parent, int invokingState, Stack<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1(Stack<WasmStatementNode> body) throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState(), body);
		enterRule(_localctx, 40, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			plain_instr(body);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(318);
				((Expr1Context)_localctx).r = expr(body);
				}
				}
				setState(323);
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
		enterRule(_localctx, 42, RULE_instr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << PRINT) | (1L << NOP) | (1L << UNREACHABLE) | (1L << DROP) | (1L << BLOCK) | (1L << LOOP) | (1L << BR) | (1L << BR_IF) | (1L << BR_TABLE) | (1L << RETURN) | (1L << IF) | (1L << SELECT) | (1L << CALL) | (1L << LOCAL_GET) | (1L << LOCAL_SET) | (1L << LOCAL_TEE) | (1L << GLOBAL_GET) | (1L << GLOBAL_SET) | (1L << LOAD) | (1L << STORE) | (1L << UNARY) | (1L << BINARY) | (1L << TEST) | (1L << COMPARE) | (1L << CONVERT) | (1L << MEMORY_SIZE) | (1L << MEMORY_GROW))) != 0)) {
				{
				{
				setState(324);
				((Instr_listContext)_localctx).instr = instr(body);
				 body.push(((Instr_listContext)_localctx).instr.result); 
				}
				}
				setState(331);
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
		enterRule(_localctx, 44, RULE_const_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 46, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(337);
			match(FUNC);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(338);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(342);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(344);
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
		enterRule(_localctx, 48, RULE_func_fields);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(346);
					type_use();
					}
					break;
				}
				setState(349);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				inline_import();
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(353);
					type_use();
					}
					break;
				}
				setState(356);
				func_fields_import();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				inline_export();
				setState(359);
				func_fields();
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
		enterRule(_localctx, 50, RULE_func_fields_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(363);
				match(LPAR);
				setState(364);
				match(PARAM);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(365);
					value_type();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(372);
				match(LPAR);
				setState(373);
				match(PARAM);
				setState(374);
				bind_var();
				setState(375);
				value_type();
				setState(376);
				match(RPAR);
				}
				break;
			}
			setState(380);
			func_fields_import_result();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_func_fields_import_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(382);
				match(LPAR);
				setState(383);
				match(RESULT);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(384);
					value_type();
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(RPAR);
				}
				}
				setState(395);
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
		enterRule(_localctx, 54, RULE_func_fields_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(396);
						match(LPAR);
						setState(397);
						match(PARAM);
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(398);
							value_type();
							}
							}
							setState(403);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(404);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(405);
						match(LPAR);
						setState(406);
						match(PARAM);
						setState(407);
						((Func_fields_bodyContext)_localctx).VAR = match(VAR);
						setState(408);
						value_type();
						setState(409);
						match(RPAR);
						 factory.addFormalParameter(((Func_fields_bodyContext)_localctx).VAR); 
						}
						break;
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(417);
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
		enterRule(_localctx, 56, RULE_func_result_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(420);
				match(LPAR);
				setState(421);
				match(RESULT);
				setState(422);
				value_type();
				setState(423);
				match(RPAR);
				}
				break;
			}
			setState(427);
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
		enterRule(_localctx, 58, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(431);
					match(LPAR);
					setState(432);
					match(LOCAL);
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(433);
						value_type();
						}
						}
						setState(438);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(439);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(440);
					match(LPAR);
					setState(441);
					match(LOCAL);
					setState(442);
					bind_var();
					setState(443);
					value_type();
					setState(444);
					match(RPAR);
					}
					break;
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
		enterRule(_localctx, 60, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LPAR);
			setState(455);
			match(OFFSET);
			setState(456);
			const_expr();
			setState(457);
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
		enterRule(_localctx, 62, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(LPAR);
			setState(460);
			match(ELEM);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(461);
				var();
				}
			}

			setState(464);
			offset();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(465);
				var();
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
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(LPAR);
			setState(474);
			match(TABLE);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(475);
				bind_var();
				}
			}

			setState(478);
			table_fields();
			setState(479);
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
		enterRule(_localctx, 66, RULE_table_fields);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				table_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				inline_import();
				setState(483);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				inline_export();
				setState(486);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				elem_type();
				setState(489);
				match(LPAR);
				setState(490);
				match(ELEM);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(491);
					var();
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
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
		enterRule(_localctx, 68, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LPAR);
			setState(502);
			match(DATA);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(503);
				var();
				}
			}

			setState(506);
			offset();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(507);
				match(STRING);
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
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
		enterRule(_localctx, 70, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(LPAR);
			setState(516);
			match(MEMORY);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(517);
				bind_var();
				}
			}

			setState(520);
			memory_fields();
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
		enterRule(_localctx, 72, RULE_memory_fields);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				memory_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				inline_import();
				setState(525);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				inline_export();
				setState(528);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(LPAR);
				setState(531);
				match(DATA);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(532);
					match(STRING);
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
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
		enterRule(_localctx, 74, RULE_sglobal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(LPAR);
			setState(542);
			match(GLOBAL);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(543);
				bind_var();
				}
			}

			setState(546);
			global_fields();
			setState(547);
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
		enterRule(_localctx, 76, RULE_global_fields);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				global_type();
				setState(550);
				const_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				inline_import();
				setState(553);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				inline_export();
				setState(556);
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
		enterRule(_localctx, 78, RULE_import_desc);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(LPAR);
				setState(561);
				match(FUNC);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(562);
					bind_var();
					}
				}

				setState(565);
				type_use();
				setState(566);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(LPAR);
				setState(569);
				match(FUNC);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(570);
					bind_var();
					}
				}

				setState(573);
				func_type();
				setState(574);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(LPAR);
				setState(577);
				match(TABLE);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(578);
					bind_var();
					}
				}

				setState(581);
				table_type();
				setState(582);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				match(LPAR);
				setState(585);
				match(MEMORY);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(586);
					bind_var();
					}
				}

				setState(589);
				memory_type();
				setState(590);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				match(LPAR);
				setState(593);
				match(GLOBAL);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(594);
					bind_var();
					}
				}

				setState(597);
				global_type();
				setState(598);
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
		enterRule(_localctx, 80, RULE_simport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(LPAR);
			setState(603);
			match(IMPORT);
			setState(604);
			name();
			setState(605);
			name();
			setState(606);
			import_desc();
			setState(607);
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
		enterRule(_localctx, 82, RULE_inline_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(LPAR);
			setState(610);
			match(IMPORT);
			setState(611);
			name();
			setState(612);
			name();
			setState(613);
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
		enterRule(_localctx, 84, RULE_export_desc);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(LPAR);
				setState(616);
				match(FUNC);
				setState(617);
				var();
				setState(618);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(LPAR);
				setState(621);
				match(TABLE);
				setState(622);
				var();
				setState(623);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				match(LPAR);
				setState(626);
				match(MEMORY);
				setState(627);
				var();
				setState(628);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630);
				match(LPAR);
				setState(631);
				match(GLOBAL);
				setState(632);
				var();
				setState(633);
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
		enterRule(_localctx, 86, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(LPAR);
			setState(638);
			match(EXPORT);
			setState(639);
			name();
			setState(640);
			export_desc();
			setState(641);
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
		enterRule(_localctx, 88, RULE_inline_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(LPAR);
			setState(644);
			match(EXPORT);
			setState(645);
			name();
			setState(646);
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
		enterRule(_localctx, 90, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
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
		enterRule(_localctx, 92, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(LPAR);
			setState(651);
			match(TYPE);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(652);
				bind_var();
				}
			}

			setState(655);
			type_();
			setState(656);
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
		enterRule(_localctx, 94, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(LPAR);
			setState(659);
			match(START);
			setState(660);
			var();
			setState(661);
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
		enterRule(_localctx, 96, RULE_module_field);
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(667);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(668);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(669);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(670);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(671);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(672);
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
		enterRule(_localctx, 98, RULE_module_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(LPAR);
			setState(676);
			match(MODULE);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(677);
				match(VAR);
				}
			}

			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(680);
				module_field();
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
		enterRule(_localctx, 100, RULE_script_module);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(LPAR);
				setState(690);
				match(MODULE);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(691);
					match(VAR);
					}
				}

				setState(694);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(695);
					match(STRING);
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(701);
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
		enterRule(_localctx, 102, RULE_action);
		int _la;
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(LPAR);
				setState(705);
				match(INVOKE);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(706);
					match(VAR);
					}
				}

				setState(709);
				name();
				setState(710);
				const_list();
				setState(711);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				match(LPAR);
				setState(714);
				match(GET);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(715);
					match(VAR);
					}
				}

				setState(718);
				name();
				setState(719);
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
		enterRule(_localctx, 104, RULE_assertion);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(LPAR);
				setState(724);
				match(ASSERT_MALFORMED);
				setState(725);
				script_module();
				setState(726);
				match(STRING);
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
				match(ASSERT_INVALID);
				setState(731);
				script_module();
				setState(732);
				match(STRING);
				setState(733);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				match(LPAR);
				setState(736);
				match(ASSERT_UNLINKABLE);
				setState(737);
				script_module();
				setState(738);
				match(STRING);
				setState(739);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				match(LPAR);
				setState(742);
				match(ASSERT_TRAP);
				setState(743);
				script_module();
				setState(744);
				match(STRING);
				setState(745);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(747);
				match(LPAR);
				setState(748);
				match(ASSERT_RETURN);
				setState(749);
				action();
				setState(750);
				const_list();
				setState(751);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(753);
				match(LPAR);
				setState(754);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(755);
				action();
				setState(756);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(758);
				match(LPAR);
				setState(759);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(760);
				action();
				setState(761);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(763);
				match(LPAR);
				setState(764);
				match(ASSERT_TRAP);
				setState(765);
				action();
				setState(766);
				match(STRING);
				setState(767);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(769);
				match(LPAR);
				setState(770);
				match(ASSERT_EXHAUSTION);
				setState(771);
				action();
				setState(772);
				match(STRING);
				setState(773);
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
		enterRule(_localctx, 106, RULE_cmd);
		int _la;
		try {
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				match(LPAR);
				setState(781);
				match(REGISTER);
				setState(782);
				name();
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(783);
					match(VAR);
					}
				}

				setState(786);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(788);
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
		enterRule(_localctx, 108, RULE_meta);
		int _la;
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(LPAR);
				setState(792);
				match(SCRIPT);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(793);
					match(VAR);
					}
				}

				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(796);
					cmd();
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(802);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(LPAR);
				setState(804);
				match(INPUT);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(805);
					match(VAR);
					}
				}

				setState(808);
				match(STRING);
				setState(809);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				match(LPAR);
				setState(811);
				match(OUTPUT);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(812);
					match(VAR);
					}
				}

				setState(815);
				match(STRING);
				setState(816);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				match(LPAR);
				setState(818);
				match(OUTPUT);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(819);
					match(VAR);
					}
				}

				setState(822);
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
		enterRule(_localctx, 110, RULE_wconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(LPAR);
			setState(826);
			match(CONST);
			setState(827);
			literal();
			setState(828);
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
		enterRule(_localctx, 112, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(830);
				wconst();
				}
				}
				setState(835);
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
		enterRule(_localctx, 114, RULE_script);
		int _la;
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(836);
					cmd();
					}
					}
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(842);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(843);
					module_field();
					}
					}
					setState(846); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(848);
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
		enterRule(_localctx, 116, RULE_module);
		int _la;
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				module_();
				setState(853);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(855);
					module_field();
					}
					}
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(861);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0363\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0089\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3"+
		"\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3\t\3\t\3\t\3\t\5\t\u00a3\n\t"+
		"\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\3\n\3\n\5\n\u00ad\n\n\3\n\3\n\3"+
		"\13\3\13\5\13\u00b3\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c6\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00d8"+
		"\n\21\r\21\16\21\u00d9\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f0\n\21"+
		"\3\21\5\21\u00f3\n\21\3\21\3\21\5\21\u00f7\n\21\3\21\5\21\u00fa\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u010c\n\21\3\22\3\22\5\22\u0110\n\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0116\n\22\3\22\3\22\3\22\3\22\5\22\u011c\n\22\3\22\3\22\3\22\3"+
		"\22\5\22\u0122\n\22\3\22\5\22\u0125\n\22\3\22\3\22\5\22\u0129\n\22\3\22"+
		"\3\22\5\22\u012d\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0136\n"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u0142\n\26"+
		"\f\26\16\26\u0145\13\26\3\27\3\27\3\27\7\27\u014a\n\27\f\27\16\27\u014d"+
		"\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\5\31\u0156\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\5\32\u015e\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u0165"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u016c\n\32\3\33\3\33\3\33\7\33\u0171"+
		"\n\33\f\33\16\33\u0174\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u017d"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u0184\n\34\f\34\16\34\u0187\13\34"+
		"\3\34\7\34\u018a\n\34\f\34\16\34\u018d\13\34\3\35\3\35\3\35\7\35\u0192"+
		"\n\35\f\35\16\35\u0195\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7"+
		"\35\u019f\n\35\f\35\16\35\u01a2\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u01ac\n\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u01b5"+
		"\n\37\f\37\16\37\u01b8\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01c1"+
		"\n\37\f\37\16\37\u01c4\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\5"+
		"!\u01d1\n!\3!\3!\7!\u01d5\n!\f!\16!\u01d8\13!\3!\3!\3\"\3\"\3\"\5\"\u01df"+
		"\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01ef\n#\f#\16#\u01f2"+
		"\13#\3#\3#\5#\u01f6\n#\3$\3$\3$\5$\u01fb\n$\3$\3$\7$\u01ff\n$\f$\16$\u0202"+
		"\13$\3$\3$\3%\3%\3%\5%\u0209\n%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\7&\u0218\n&\f&\16&\u021b\13&\3&\5&\u021e\n&\3\'\3\'\3\'\5\'\u0223\n"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0231\n(\3)\3)\3)\5)\u0236"+
		"\n)\3)\3)\3)\3)\3)\3)\5)\u023e\n)\3)\3)\3)\3)\3)\3)\5)\u0246\n)\3)\3)"+
		"\3)\3)\3)\3)\5)\u024e\n)\3)\3)\3)\3)\3)\3)\5)\u0256\n)\3)\3)\3)\5)\u025b"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u027e\n,\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3/\3/\3\60\3\60\3\60\5\60\u0290\n\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u02a4\n\62\3\63\3\63\3\63\5\63\u02a9\n\63\3\63\7\63\u02ac\n\63\f\63\16"+
		"\63\u02af\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u02b7\n\64\3\64\3\64"+
		"\7\64\u02bb\n\64\f\64\16\64\u02be\13\64\3\64\5\64\u02c1\n\64\3\65\3\65"+
		"\3\65\5\65\u02c6\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02cf\n"+
		"\65\3\65\3\65\3\65\5\65\u02d4\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u030a\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u0313\n\67\3\67\3\67\3\67\5\67\u0318\n\67\38\38\38\58\u031d\n8\38\78"+
		"\u0320\n8\f8\168\u0323\138\38\38\38\38\58\u0329\n8\38\38\38\38\38\58\u0330"+
		"\n8\38\38\38\38\38\58\u0337\n8\38\58\u033a\n8\39\39\39\39\39\3:\7:\u0342"+
		"\n:\f:\16:\u0345\13:\3;\7;\u0348\n;\f;\16;\u034b\13;\3;\3;\6;\u034f\n"+
		";\r;\16;\u0350\3;\3;\5;\u0355\n;\3<\3<\3<\3<\7<\u035b\n<\f<\16<\u035e"+
		"\13<\3<\5<\u0361\n<\3<\2\2=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\7\3\2\6\7\3\2\5"+
		"\7\4\2\5\5MM\3\2\21\22\3\2=>\2\u03b1\2x\3\2\2\2\4z\3\2\2\2\6|\3\2\2\2"+
		"\b~\3\2\2\2\n\u0080\3\2\2\2\f\u0088\3\2\2\2\16\u008a\3\2\2\2\20\u00a7"+
		"\3\2\2\2\22\u00aa\3\2\2\2\24\u00b0\3\2\2\2\26\u00b4\3\2\2\2\30\u00b9\3"+
		"\2\2\2\32\u00bb\3\2\2\2\34\u00bd\3\2\2\2\36\u00c5\3\2\2\2 \u010b\3\2\2"+
		"\2\"\u012c\3\2\2\2$\u012e\3\2\2\2&\u0133\3\2\2\2(\u013a\3\2\2\2*\u013f"+
		"\3\2\2\2,\u014b\3\2\2\2.\u0150\3\2\2\2\60\u0152\3\2\2\2\62\u016b\3\2\2"+
		"\2\64\u017c\3\2\2\2\66\u018b\3\2\2\28\u01a0\3\2\2\2:\u01ab\3\2\2\2<\u01b0"+
		"\3\2\2\2>\u01c8\3\2\2\2@\u01cd\3\2\2\2B\u01db\3\2\2\2D\u01f5\3\2\2\2F"+
		"\u01f7\3\2\2\2H\u0205\3\2\2\2J\u021d\3\2\2\2L\u021f\3\2\2\2N\u0230\3\2"+
		"\2\2P\u025a\3\2\2\2R\u025c\3\2\2\2T\u0263\3\2\2\2V\u027d\3\2\2\2X\u027f"+
		"\3\2\2\2Z\u0285\3\2\2\2\\\u028a\3\2\2\2^\u028c\3\2\2\2`\u0294\3\2\2\2"+
		"b\u02a3\3\2\2\2d\u02a5\3\2\2\2f\u02c0\3\2\2\2h\u02d3\3\2\2\2j\u0309\3"+
		"\2\2\2l\u0317\3\2\2\2n\u0339\3\2\2\2p\u033b\3\2\2\2r\u0343\3\2\2\2t\u0354"+
		"\3\2\2\2v\u0360\3\2\2\2xy\5v<\2y\3\3\2\2\2z{\t\2\2\2{\5\3\2\2\2|}\7\b"+
		"\2\2}\7\3\2\2\2~\177\7\t\2\2\177\t\3\2\2\2\u0080\u0081\7\13\2\2\u0081"+
		"\13\3\2\2\2\u0082\u0089\5\b\5\2\u0083\u0084\7\3\2\2\u0084\u0085\7\f\2"+
		"\2\u0085\u0086\5\b\5\2\u0086\u0087\7\4\2\2\u0087\u0089\3\2\2\2\u0088\u0082"+
		"\3\2\2\2\u0088\u0083\3\2\2\2\u0089\r\3\2\2\2\u008a\u008b\7\3\2\2\u008b"+
		"\u008c\7/\2\2\u008c\u008d\5\20\t\2\u008d\u008e\7\4\2\2\u008e\17\3\2\2"+
		"\2\u008f\u00a2\7\3\2\2\u0090\u0094\7\62\2\2\u0091\u0093\5\b\5\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u00a3\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\7\61\2\2\u0098"+
		"\u009a\5\b\5\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u00a3\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7\61\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\5\b\5\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\7\4\2\2\u00a5\u008f\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ac\7\5\2\2\u00ab\u00ad\7\5\2\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\n\6\2\u00af\23\3\2\2"+
		"\2\u00b0\u00b2\7\5\2\2\u00b1\u00b3\7\5\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\7.\2\2\u00b6"+
		"\u00b7\5\32\16\2\u00b7\u00b8\7\4\2\2\u00b8\27\3\2\2\2\u00b9\u00ba\t\3"+
		"\2\2\u00ba\31\3\2\2\2\u00bb\u00bc\t\4\2\2\u00bc\33\3\2\2\2\u00bd\u00be"+
		"\7M\2\2\u00be\35\3\2\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\b\20\1\2\u00c1"+
		"\u00c6\3\2\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\b\20\1\2\u00c4\u00c6\3"+
		"\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\37\3\2\2\2\u00c7"+
		"\u00c8\7\17\2\2\u00c8\u010c\b\21\1\2\u00c9\u00ca\7\r\2\2\u00ca\u010c\b"+
		"\21\1\2\u00cb\u00cc\7\16\2\2\u00cc\u010c\b\21\1\2\u00cd\u00ce\7\20\2\2"+
		"\u00ce\u010c\b\21\1\2\u00cf\u00d0\7\33\2\2\u00d0\u010c\b\21\1\2\u00d1"+
		"\u00d2\7\24\2\2\u00d2\u010c\5\32\16\2\u00d3\u00d4\7\25\2\2\u00d4\u010c"+
		"\5\32\16\2\u00d5\u00d7\7\26\2\2\u00d6\u00d8\5\32\16\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u010c\3\2\2\2\u00db\u00dc\7\27\2\2\u00dc\u010c\b\21\1\2\u00dd\u00de\7"+
		"\34\2\2\u00de\u010c\5\32\16\2\u00df\u00e0\7\36\2\2\u00e0\u00e1\5\32\16"+
		"\2\u00e1\u00e2\b\21\1\2\u00e2\u010c\3\2\2\2\u00e3\u00e4\7\37\2\2\u00e4"+
		"\u010c\5\32\16\2\u00e5\u00e6\7 \2\2\u00e6\u010c\5\32\16\2\u00e7\u00e8"+
		"\7!\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea\b\21\1\2\u00ea\u010c\3\2\2\2"+
		"\u00eb\u00ec\7\"\2\2\u00ec\u010c\5\32\16\2\u00ed\u00ef\7#\2\2\u00ee\u00f0"+
		"\7%\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00f3\7&\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u010c\3\2"+
		"\2\2\u00f4\u00f6\7$\2\2\u00f5\u00f7\7%\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\7&\2\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u010c\3\2\2\2\u00fb\u010c\7,\2\2\u00fc\u010c\7-\2"+
		"\2\u00fd\u00fe\7\n\2\2\u00fe\u00ff\5\30\r\2\u00ff\u0100\b\21\1\2\u0100"+
		"\u010c\3\2\2\2\u0101\u0102\7)\2\2\u0102\u010c\b\21\1\2\u0103\u0104\7*"+
		"\2\2\u0104\u010c\b\21\1\2\u0105\u0106\7\'\2\2\u0106\u010c\b\21\1\2\u0107"+
		"\u0108\7(\2\2\u0108\u010c\b\21\1\2\u0109\u010a\7+\2\2\u010a\u010c\b\21"+
		"\1\2\u010b\u00c7\3\2\2\2\u010b\u00c9\3\2\2\2\u010b\u00cb\3\2\2\2\u010b"+
		"\u00cd\3\2\2\2\u010b\u00cf\3\2\2\2\u010b\u00d1\3\2\2\2\u010b\u00d3\3\2"+
		"\2\2\u010b\u00d5\3\2\2\2\u010b\u00db\3\2\2\2\u010b\u00dd\3\2\2\2\u010b"+
		"\u00df\3\2\2\2\u010b\u00e3\3\2\2\2\u010b\u00e5\3\2\2\2\u010b\u00e7\3\2"+
		"\2\2\u010b\u00eb\3\2\2\2\u010b\u00ed\3\2\2\2\u010b\u00f4\3\2\2\2\u010b"+
		"\u00fb\3\2\2\2\u010b\u00fc\3\2\2\2\u010b\u00fd\3\2\2\2\u010b\u0101\3\2"+
		"\2\2\u010b\u0103\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c!\3\2\2\2\u010d\u010f\t\5\2\2\u010e\u0110\5\34\17"+
		"\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\b\22\1\2\u0112\u0113\5&\24\2\u0113\u0115\7\23\2\2\u0114\u0116\5\34\17"+
		"\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\b\22\1\2\u0118\u012d\3\2\2\2\u0119\u011b\7\30\2\2\u011a\u011c\5\34\17"+
		"\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0124"+
		"\5&\24\2\u011e\u011f\b\22\1\2\u011f\u0121\7\32\2\2\u0120\u0122\5\34\17"+
		"\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\5,\27\2\u0124\u011e\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\7\23\2\2\u0127\u0129\5\34\17\2\u0128\u0127\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\22\1\2\u012b\u012d\3\2\2\2"+
		"\u012c\u010d\3\2\2\2\u012c\u0119\3\2\2\2\u012d#\3\2\2\2\u012e\u012f\7"+
		"\3\2\2\u012f\u0130\7\62\2\2\u0130\u0131\5\b\5\2\u0131\u0132\7\4\2\2\u0132"+
		"%\3\2\2\2\u0133\u0135\b\24\1\2\u0134\u0136\5$\23\2\u0135\u0134\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\5,\27\2\u0138\u0139"+
		"\b\24\1\2\u0139\'\3\2\2\2\u013a\u013b\7\3\2\2\u013b\u013c\5*\26\2\u013c"+
		"\u013d\7\4\2\2\u013d\u013e\b\25\1\2\u013e)\3\2\2\2\u013f\u0143\5 \21\2"+
		"\u0140\u0142\5(\25\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144+\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\5\36\20\2\u0147\u0148\b\27\1\2\u0148\u014a\3\2\2\2\u0149\u0146"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\b\27\1\2\u014f-\3\2\2\2"+
		"\u0150\u0151\5,\27\2\u0151/\3\2\2\2\u0152\u0153\7\3\2\2\u0153\u0155\7"+
		"/\2\2\u0154\u0156\5\34\17\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\b\31\1\2\u0158\u0159\5\62\32\2\u0159\u015a"+
		"\b\31\1\2\u015a\u015b\7\4\2\2\u015b\61\3\2\2\2\u015c\u015e\5\26\f\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\58"+
		"\35\2\u0160\u0161\b\32\1\2\u0161\u016c\3\2\2\2\u0162\u0164\5T+\2\u0163"+
		"\u0165\5\26\f\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3"+
		"\2\2\2\u0166\u0167\5\64\33\2\u0167\u016c\3\2\2\2\u0168\u0169\5Z.\2\u0169"+
		"\u016a\5\62\32\2\u016a\u016c\3\2\2\2\u016b\u015d\3\2\2\2\u016b\u0162\3"+
		"\2\2\2\u016b\u0168\3\2\2\2\u016c\63\3\2\2\2\u016d\u016e\7\3\2\2\u016e"+
		"\u0172\7\61\2\2\u016f\u0171\5\b\5\2\u0170\u016f\3\2\2\2\u0171\u0174\3"+
		"\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u017d\7\4\2\2\u0176\u0177\7\3\2\2\u0177\u0178\7\61"+
		"\2\2\u0178\u0179\5\34\17\2\u0179\u017a\5\b\5\2\u017a\u017b\7\4\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u016d\3\2\2\2\u017c\u0176\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\5\66\34\2\u017f\65\3\2\2\2\u0180\u0181\7\3\2\2\u0181"+
		"\u0185\7\62\2\2\u0182\u0184\5\b\5\2\u0183\u0182\3\2\2\2\u0184\u0187\3"+
		"\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u018a\7\4\2\2\u0189\u0180\3\2\2\2\u018a\u018d\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\67\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018e\u018f\7\3\2\2\u018f\u0193\7\61\2\2\u0190\u0192\5\b\5\2"+
		"\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019f\7\4\2\2\u0197"+
		"\u0198\7\3\2\2\u0198\u0199\7\61\2\2\u0199\u019a\7M\2\2\u019a\u019b\5\b"+
		"\5\2\u019b\u019c\7\4\2\2\u019c\u019d\b\35\1\2\u019d\u019f\3\2\2\2\u019e"+
		"\u018e\3\2\2\2\u019e\u0197\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a4\5:\36\2\u01a4\u01a5\b\35\1\2\u01a59\3\2\2\2\u01a6\u01a7\7\3\2\2"+
		"\u01a7\u01a8\7\62\2\2\u01a8\u01a9\5\b\5\2\u01a9\u01aa\7\4\2\2\u01aa\u01ac"+
		"\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\5<\37\2\u01ae\u01af\b\36\1\2\u01af;\3\2\2\2\u01b0\u01c2\b\37\1"+
		"\2\u01b1\u01b2\7\3\2\2\u01b2\u01b6\7\63\2\2\u01b3\u01b5\5\b\5\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01c1\7\4\2\2\u01ba"+
		"\u01bb\7\3\2\2\u01bb\u01bc\7\63\2\2\u01bc\u01bd\5\34\17\2\u01bd\u01be"+
		"\5\b\5\2\u01be\u01bf\7\4\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01b1\3\2\2\2\u01c0"+
		"\u01ba\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\5,\27\2\u01c6"+
		"\u01c7\b\37\1\2\u01c7=\3\2\2\2\u01c8\u01c9\7\3\2\2\u01c9\u01ca\79\2\2"+
		"\u01ca\u01cb\5.\30\2\u01cb\u01cc\7\4\2\2\u01cc?\3\2\2\2\u01cd\u01ce\7"+
		"\3\2\2\u01ce\u01d0\7\67\2\2\u01cf\u01d1\5\32\16\2\u01d0\u01cf\3\2\2\2"+
		"\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d6\5> \2\u01d3\u01d5"+
		"\5\32\16\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2"+
		"\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da"+
		"\7\4\2\2\u01daA\3\2\2\2\u01db\u01dc\7\3\2\2\u01dc\u01de\7\65\2\2\u01dd"+
		"\u01df\5\34\17\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01e1\5D#\2\u01e1\u01e2\7\4\2\2\u01e2C\3\2\2\2\u01e3\u01f6"+
		"\5\22\n\2\u01e4\u01e5\5T+\2\u01e5\u01e6\5\22\n\2\u01e6\u01f6\3\2\2\2\u01e7"+
		"\u01e8\5Z.\2\u01e8\u01e9\5D#\2\u01e9\u01f6\3\2\2\2\u01ea\u01eb\5\n\6\2"+
		"\u01eb\u01ec\7\3\2\2\u01ec\u01f0\7\67\2\2\u01ed\u01ef\5\32\16\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7\4\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01e3\3\2\2\2\u01f5\u01e4\3\2\2\2\u01f5\u01e7\3\2"+
		"\2\2\u01f5\u01ea\3\2\2\2\u01f6E\3\2\2\2\u01f7\u01f8\7\3\2\2\u01f8\u01fa"+
		"\78\2\2\u01f9\u01fb\5\32\16\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2"+
		"\u01fb\u01fc\3\2\2\2\u01fc\u0200\5> \2\u01fd\u01ff\7\b\2\2\u01fe\u01fd"+
		"\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\4\2\2\u0204G\3\2\2\2"+
		"\u0205\u0206\7\3\2\2\u0206\u0208\7\66\2\2\u0207\u0209\5\34\17\2\u0208"+
		"\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5J"+
		"&\2\u020b\u020c\7\4\2\2\u020cI\3\2\2\2\u020d\u021e\5\24\13\2\u020e\u020f"+
		"\5T+\2\u020f\u0210\5\24\13\2\u0210\u021e\3\2\2\2\u0211\u0212\5Z.\2\u0212"+
		"\u0213\5J&\2\u0213\u021e\3\2\2\2\u0214\u0215\7\3\2\2\u0215\u0219\78\2"+
		"\2\u0216\u0218\7\b\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u021e\7\4\2\2\u021d\u020d\3\2\2\2\u021d\u020e\3\2\2\2\u021d\u0211\3\2"+
		"\2\2\u021d\u0214\3\2\2\2\u021eK\3\2\2\2\u021f\u0220\7\3\2\2\u0220\u0222"+
		"\7\64\2\2\u0221\u0223\5\34\17\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2"+
		"\2\u0223\u0224\3\2\2\2\u0224\u0225\5N(\2\u0225\u0226\7\4\2\2\u0226M\3"+
		"\2\2\2\u0227\u0228\5\f\7\2\u0228\u0229\5.\30\2\u0229\u0231\3\2\2\2\u022a"+
		"\u022b\5T+\2\u022b\u022c\5\f\7\2\u022c\u0231\3\2\2\2\u022d\u022e\5Z.\2"+
		"\u022e\u022f\5N(\2\u022f\u0231\3\2\2\2\u0230\u0227\3\2\2\2\u0230\u022a"+
		"\3\2\2\2\u0230\u022d\3\2\2\2\u0231O\3\2\2\2\u0232\u0233\7\3\2\2\u0233"+
		"\u0235\7/\2\2\u0234\u0236\5\34\17\2\u0235\u0234\3\2\2\2\u0235\u0236\3"+
		"\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\5\26\f\2\u0238\u0239\7\4\2\2\u0239"+
		"\u025b\3\2\2\2\u023a\u023b\7\3\2\2\u023b\u023d\7/\2\2\u023c\u023e\5\34"+
		"\17\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0240\5\20\t\2\u0240\u0241\7\4\2\2\u0241\u025b\3\2\2\2\u0242\u0243\7"+
		"\3\2\2\u0243\u0245\7\65\2\2\u0244\u0246\5\34\17\2\u0245\u0244\3\2\2\2"+
		"\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\5\22\n\2\u0248\u0249"+
		"\7\4\2\2\u0249\u025b\3\2\2\2\u024a\u024b\7\3\2\2\u024b\u024d\7\66\2\2"+
		"\u024c\u024e\5\34\17\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0250\5\24\13\2\u0250\u0251\7\4\2\2\u0251\u025b\3\2\2\2"+
		"\u0252\u0253\7\3\2\2\u0253\u0255\7\64\2\2\u0254\u0256\5\34\17\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\5\f"+
		"\7\2\u0258\u0259\7\4\2\2\u0259\u025b\3\2\2\2\u025a\u0232\3\2\2\2\u025a"+
		"\u023a\3\2\2\2\u025a\u0242\3\2\2\2\u025a\u024a\3\2\2\2\u025a\u0252\3\2"+
		"\2\2\u025bQ\3\2\2\2\u025c\u025d\7\3\2\2\u025d\u025e\7:\2\2\u025e\u025f"+
		"\5\6\4\2\u025f\u0260\5\6\4\2\u0260\u0261\5P)\2\u0261\u0262\7\4\2\2\u0262"+
		"S\3\2\2\2\u0263\u0264\7\3\2\2\u0264\u0265\7:\2\2\u0265\u0266\5\6\4\2\u0266"+
		"\u0267\5\6\4\2\u0267\u0268\7\4\2\2\u0268U\3\2\2\2\u0269\u026a\7\3\2\2"+
		"\u026a\u026b\7/\2\2\u026b\u026c\5\32\16\2\u026c\u026d\7\4\2\2\u026d\u027e"+
		"\3\2\2\2\u026e\u026f\7\3\2\2\u026f\u0270\7\65\2\2\u0270\u0271\5\32\16"+
		"\2\u0271\u0272\7\4\2\2\u0272\u027e\3\2\2\2\u0273\u0274\7\3\2\2\u0274\u0275"+
		"\7\66\2\2\u0275\u0276\5\32\16\2\u0276\u0277\7\4\2\2\u0277\u027e\3\2\2"+
		"\2\u0278\u0279\7\3\2\2\u0279\u027a\7\64\2\2\u027a\u027b\5\32\16\2\u027b"+
		"\u027c\7\4\2\2\u027c\u027e\3\2\2\2\u027d\u0269\3\2\2\2\u027d\u026e\3\2"+
		"\2\2\u027d\u0273\3\2\2\2\u027d\u0278\3\2\2\2\u027eW\3\2\2\2\u027f\u0280"+
		"\7\3\2\2\u0280\u0281\7;\2\2\u0281\u0282\5\6\4\2\u0282\u0283\5V,\2\u0283"+
		"\u0284\7\4\2\2\u0284Y\3\2\2\2\u0285\u0286\7\3\2\2\u0286\u0287\7;\2\2\u0287"+
		"\u0288\5\6\4\2\u0288\u0289\7\4\2\2\u0289[\3\2\2\2\u028a\u028b\5\16\b\2"+
		"\u028b]\3\2\2\2\u028c\u028d\7\3\2\2\u028d\u028f\7.\2\2\u028e\u0290\5\34"+
		"\17\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0292\5\\/\2\u0292\u0293\7\4\2\2\u0293_\3\2\2\2\u0294\u0295\7\3\2\2\u0295"+
		"\u0296\7\60\2\2\u0296\u0297\5\32\16\2\u0297\u0298\7\4\2\2\u0298a\3\2\2"+
		"\2\u0299\u02a4\5^\60\2\u029a\u02a4\5L\'\2\u029b\u02a4\5B\"\2\u029c\u02a4"+
		"\5H%\2\u029d\u02a4\5\60\31\2\u029e\u02a4\5@!\2\u029f\u02a4\5F$\2\u02a0"+
		"\u02a4\5`\61\2\u02a1\u02a4\5R*\2\u02a2\u02a4\5X-\2\u02a3\u0299\3\2\2\2"+
		"\u02a3\u029a\3\2\2\2\u02a3\u029b\3\2\2\2\u02a3\u029c\3\2\2\2\u02a3\u029d"+
		"\3\2\2\2\u02a3\u029e\3\2\2\2\u02a3\u029f\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4c\3\2\2\2\u02a5\u02a6\7\3\2\2"+
		"\u02a6\u02a8\7<\2\2\u02a7\u02a9\7M\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02ad\3\2\2\2\u02aa\u02ac\5b\62\2\u02ab\u02aa\3\2\2\2\u02ac"+
		"\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2"+
		"\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7\4\2\2\u02b1e\3\2\2\2\u02b2\u02c1"+
		"\5d\63\2\u02b3\u02b4\7\3\2\2\u02b4\u02b6\7<\2\2\u02b5\u02b7\7M\2\2\u02b6"+
		"\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bc\t\6"+
		"\2\2\u02b9\u02bb\7\b\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02bf\u02c1\7\4\2\2\u02c0\u02b2\3\2\2\2\u02c0\u02b3\3\2\2\2\u02c1"+
		"g\3\2\2\2\u02c2\u02c3\7\3\2\2\u02c3\u02c5\7A\2\2\u02c4\u02c6\7M\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\5\6"+
		"\4\2\u02c8\u02c9\5r:\2\u02c9\u02ca\7\4\2\2\u02ca\u02d4\3\2\2\2\u02cb\u02cc"+
		"\7\3\2\2\u02cc\u02ce\7B\2\2\u02cd\u02cf\7M\2\2\u02ce\u02cd\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\5\6\4\2\u02d1\u02d2\7\4"+
		"\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02c2\3\2\2\2\u02d3\u02cb\3\2\2\2\u02d4"+
		"i\3\2\2\2\u02d5\u02d6\7\3\2\2\u02d6\u02d7\7C\2\2\u02d7\u02d8\5f\64\2\u02d8"+
		"\u02d9\7\b\2\2\u02d9\u02da\7\4\2\2\u02da\u030a\3\2\2\2\u02db\u02dc\7\3"+
		"\2\2\u02dc\u02dd\7D\2\2\u02dd\u02de\5f\64\2\u02de\u02df\7\b\2\2\u02df"+
		"\u02e0\7\4\2\2\u02e0\u030a\3\2\2\2\u02e1\u02e2\7\3\2\2\u02e2\u02e3\7E"+
		"\2\2\u02e3\u02e4\5f\64\2\u02e4\u02e5\7\b\2\2\u02e5\u02e6\7\4\2\2\u02e6"+
		"\u030a\3\2\2\2\u02e7\u02e8\7\3\2\2\u02e8\u02e9\7I\2\2\u02e9\u02ea\5f\64"+
		"\2\u02ea\u02eb\7\b\2\2\u02eb\u02ec\7\4\2\2\u02ec\u030a\3\2\2\2\u02ed\u02ee"+
		"\7\3\2\2\u02ee\u02ef\7F\2\2\u02ef\u02f0\5h\65\2\u02f0\u02f1\5r:\2\u02f1"+
		"\u02f2\7\4\2\2\u02f2\u030a\3\2\2\2\u02f3\u02f4\7\3\2\2\u02f4\u02f5\7G"+
		"\2\2\u02f5\u02f6\5h\65\2\u02f6\u02f7\7\4\2\2\u02f7\u030a\3\2\2\2\u02f8"+
		"\u02f9\7\3\2\2\u02f9\u02fa\7H\2\2\u02fa\u02fb\5h\65\2\u02fb\u02fc\7\4"+
		"\2\2\u02fc\u030a\3\2\2\2\u02fd\u02fe\7\3\2\2\u02fe\u02ff\7I\2\2\u02ff"+
		"\u0300\5h\65\2\u0300\u0301\7\b\2\2\u0301\u0302\7\4\2\2\u0302\u030a\3\2"+
		"\2\2\u0303\u0304\7\3\2\2\u0304\u0305\7J\2\2\u0305\u0306\5h\65\2\u0306"+
		"\u0307\7\b\2\2\u0307\u0308\7\4\2\2\u0308\u030a\3\2\2\2\u0309\u02d5\3\2"+
		"\2\2\u0309\u02db\3\2\2\2\u0309\u02e1\3\2\2\2\u0309\u02e7\3\2\2\2\u0309"+
		"\u02ed\3\2\2\2\u0309\u02f3\3\2\2\2\u0309\u02f8\3\2\2\2\u0309\u02fd\3\2"+
		"\2\2\u0309\u0303\3\2\2\2\u030ak\3\2\2\2\u030b\u0318\5h\65\2\u030c\u0318"+
		"\5j\66\2\u030d\u0318\5f\64\2\u030e\u030f\7\3\2\2\u030f\u0310\7@\2\2\u0310"+
		"\u0312\5\6\4\2\u0311\u0313\7M\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u0314\3\2\2\2\u0314\u0315\7\4\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0318\5n8\2\u0317\u030b\3\2\2\2\u0317\u030c\3\2\2\2\u0317\u030d\3\2\2"+
		"\2\u0317\u030e\3\2\2\2\u0317\u0316\3\2\2\2\u0318m\3\2\2\2\u0319\u031a"+
		"\7\3\2\2\u031a\u031c\7?\2\2\u031b\u031d\7M\2\2\u031c\u031b\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u0321\3\2\2\2\u031e\u0320\5l\67\2\u031f\u031e\3\2"+
		"\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u033a\7\4\2\2\u0325\u0326\7\3"+
		"\2\2\u0326\u0328\7K\2\2\u0327\u0329\7M\2\2\u0328\u0327\3\2\2\2\u0328\u0329"+
		"\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\7\b\2\2\u032b\u033a\7\4\2\2\u032c"+
		"\u032d\7\3\2\2\u032d\u032f\7L\2\2\u032e\u0330\7M\2\2\u032f\u032e\3\2\2"+
		"\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\7\b\2\2\u0332\u033a"+
		"\7\4\2\2\u0333\u0334\7\3\2\2\u0334\u0336\7L\2\2\u0335\u0337\7M\2\2\u0336"+
		"\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\7\4"+
		"\2\2\u0339\u0319\3\2\2\2\u0339\u0325\3\2\2\2\u0339\u032c\3\2\2\2\u0339"+
		"\u0333\3\2\2\2\u033ao\3\2\2\2\u033b\u033c\7\3\2\2\u033c\u033d\7\n\2\2"+
		"\u033d\u033e\5\30\r\2\u033e\u033f\7\4\2\2\u033fq\3\2\2\2\u0340\u0342\5"+
		"p9\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344s\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0348\5l\67\2"+
		"\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a"+
		"\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u0355\7\2\2\3\u034d"+
		"\u034f\5b\62\2\u034e\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u034e\3\2"+
		"\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\7\2\2\3\u0353"+
		"\u0355\3\2\2\2\u0354\u0349\3\2\2\2\u0354\u034e\3\2\2\2\u0355u\3\2\2\2"+
		"\u0356\u0357\5d\63\2\u0357\u0358\7\2\2\3\u0358\u0361\3\2\2\2\u0359\u035b"+
		"\5b\62\2\u035a\u0359\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0361\7\2"+
		"\2\3\u0360\u0356\3\2\2\2\u0360\u035c\3\2\2\2\u0361w\3\2\2\2U\u0088\u0094"+
		"\u009b\u00a2\u00a7\u00ac\u00b2\u00c5\u00d9\u00ef\u00f2\u00f6\u00f9\u010b"+
		"\u010f\u0115\u011b\u0121\u0124\u0128\u012c\u0135\u0143\u014b\u0155\u015d"+
		"\u0164\u016b\u0172\u017c\u0185\u018b\u0193\u019e\u01a0\u01ab\u01b6\u01c0"+
		"\u01c2\u01d0\u01d6\u01de\u01f0\u01f5\u01fa\u0200\u0208\u0219\u021d\u0222"+
		"\u0230\u0235\u023d\u0245\u024d\u0255\u025a\u027d\u028f\u02a3\u02a8\u02ad"+
		"\u02b6\u02bc\u02c0\u02c5\u02ce\u02d3\u0309\u0312\u0317\u031c\u0321\u0328"+
		"\u032f\u0336\u0339\u0343\u0349\u0350\u0354\u035c\u0360";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}