// Generated from language/src/main/java/com/oracle/truffle/wasm/parser/WasmLanguage.g4 by ANTLR 4.7.1
package com.oracle.truffle.wasm.parser;

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
		FUNCREF=9, MUT=10, NOP=11, UNREACHABLE=12, DROP=13, BLOCK=14, LOOP=15, 
		END=16, BR=17, BR_IF=18, BR_TABLE=19, RETURN=20, IF=21, THEN=22, ELSE=23, 
		SELECT=24, CALL=25, CALL_INDIRECT=26, LOCAL_GET=27, LOCAL_SET=28, LOCAL_TEE=29, 
		GLOBAL_GET=30, GLOBAL_SET=31, LOAD=32, STORE=33, OFFSET_EQ_NAT=34, ALIGN_EQ_NAT=35, 
		UNARY=36, BINARY=37, TEST=38, COMPARE=39, CONVERT=40, MEMORY_SIZE=41, 
		MEMORY_GROW=42, TYPE=43, FUNC=44, START=45, PARAM=46, RESULT=47, LOCAL=48, 
		GLOBAL=49, TABLE=50, MEMORY=51, ELEM=52, DATA=53, OFFSET=54, IMPORT=55, 
		EXPORT=56, MODULE=57, BIN=58, QUOTE=59, SCRIPT=60, REGISTER=61, INVOKE=62, 
		GET=63, ASSERT_MALFORMED=64, ASSERT_INVALID=65, ASSERT_UNLINKABLE=66, 
		ASSERT_RETURN=67, ASSERT_RETURN_CANONICAL_NAN=68, ASSERT_RETURN_ARITHMETIC_NAN=69, 
		ASSERT_TRAP=70, ASSERT_EXHAUSTION=71, INPUT=72, OUTPUT=73, VAR=74, SPACE=75, 
		COMMENT=76;
	public static final int
		RULE_wasmlanguage = 0, RULE_value = 1, RULE_name = 2, RULE_value_type = 3, 
		RULE_elem_type = 4, RULE_global_type = 5, RULE_def_type = 6, RULE_func_type = 7, 
		RULE_table_type = 8, RULE_memory_type = 9, RULE_type_use = 10, RULE_literal = 11, 
		RULE_var = 12, RULE_bind_var = 13, RULE_instr = 14, RULE_plain_instr = 15, 
		RULE_expr = 16, RULE_expr1 = 17, RULE_instr_list = 18, RULE_const_expr = 19, 
		RULE_func = 20, RULE_func_fields = 21, RULE_func_fields_import = 22, RULE_func_fields_import_result = 23, 
		RULE_func_fields_body = 24, RULE_func_result_body = 25, RULE_func_body = 26, 
		RULE_offset = 27, RULE_elem = 28, RULE_table = 29, RULE_table_fields = 30, 
		RULE_data = 31, RULE_memory = 32, RULE_memory_fields = 33, RULE_sglobal = 34, 
		RULE_global_fields = 35, RULE_import_desc = 36, RULE_simport = 37, RULE_inline_import = 38, 
		RULE_export_desc = 39, RULE_export = 40, RULE_inline_export = 41, RULE_type_ = 42, 
		RULE_type_def = 43, RULE_start = 44, RULE_module_field = 45, RULE_module_ = 46, 
		RULE_script_module = 47, RULE_action = 48, RULE_assertion = 49, RULE_cmd = 50, 
		RULE_meta = 51, RULE_wconst = 52, RULE_const_list = 53, RULE_script = 54, 
		RULE_module = 55;
	public static final String[] ruleNames = {
		"wasmlanguage", "value", "name", "value_type", "elem_type", "global_type", 
		"def_type", "func_type", "table_type", "memory_type", "type_use", "literal", 
		"var", "bind_var", "instr", "plain_instr", "expr", "expr1", "instr_list", 
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
		"'nop'", "'unreachable'", "'drop'", "'block'", "'loop'", "'end'", "'br'", 
		"'br_if'", "'br_table'", "'return'", "'if'", "'then'", "'else'", "'select'", 
		"'call'", "'call_indirect'", "'get_local'", "'set_local'", "'tee_local'", 
		"'get_global'", "'set_global'", null, null, null, null, null, null, null, 
		null, null, "'memory.size'", "'memory.grow'", "'type'", "'func'", "'start'", 
		"'param'", "'result'", "'local'", "'global'", "'table'", "'memory'", "'elem'", 
		"'data'", "'offset'", "'import'", "'export'", "'module'", "'binary'", 
		"'quote'", "'script'", "'register'", "'invoke'", "'get'", "'assert_malformed'", 
		"'assert_invalid'", "'assert_unlinkable'", "'assert_return'", "'assert_return_canonical_nan'", 
		"'assert_return_arithmetic_nan'", "'assert_trap'", "'assert_exhaustion'", 
		"'input'", "'output'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAR", "RPAR", "NAT", "INT", "FLOAT", "STRING", "VALUE_TYPE", "CONST", 
		"FUNCREF", "MUT", "NOP", "UNREACHABLE", "DROP", "BLOCK", "LOOP", "END", 
		"BR", "BR_IF", "BR_TABLE", "RETURN", "IF", "THEN", "ELSE", "SELECT", "CALL", 
		"CALL_INDIRECT", "LOCAL_GET", "LOCAL_SET", "LOCAL_TEE", "GLOBAL_GET", 
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
			setState(112);
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
			setState(114);
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
			setState(116);
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
			setState(118);
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
			setState(120);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				value_type();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(LPAR);
				setState(124);
				match(MUT);
				setState(125);
				value_type();
				setState(126);
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
			setState(130);
			match(LPAR);
			setState(131);
			match(FUNC);
			setState(132);
			func_type();
			setState(133);
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(135);
				match(LPAR);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(136);
					match(RESULT);
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(137);
						value_type();
						}
						}
						setState(142);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(143);
					match(PARAM);
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(144);
						value_type();
						}
						}
						setState(149);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(150);
					match(PARAM);
					setState(151);
					bind_var();
					setState(152);
					value_type();
					}
					break;
				}
				setState(156);
				match(RPAR);
				}
				}
				setState(161);
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
			setState(162);
			match(NAT);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(163);
				match(NAT);
				}
			}

			setState(166);
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

			}
		}
		catch (RecognitionException re) {
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
			setState(172);
			match(LPAR);
			setState(173);
			match(TYPE);
			setState(174);
			var();
			setState(175);
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
			setState(177);
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
			setState(179);
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
			setState(181);
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
		public ExprContext expr;
		public Plain_instrContext plain_instr() {
			return getRuleContext(Plain_instrContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
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
				setState(183);
				((InstrContext)_localctx).plain_instr = plain_instr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((InstrContext)_localctx).expr = expr(body);
				 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).expr.result; 
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
		public Token NOP;
		public Token DROP;
		public Token SELECT;
		public Token RETURN;
		public LiteralContext literal;
		public Token TEST;
		public Token COMPARE;
		public Token BINARY;
		public TerminalNode UNREACHABLE() { return getToken(WasmLanguageParser.UNREACHABLE, 0); }
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
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				((Plain_instrContext)_localctx).UNREACHABLE = match(UNREACHABLE);
				 ((Plain_instrContext)_localctx).result =  factory.createUnreachable(((Plain_instrContext)_localctx).UNREACHABLE); 
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				((Plain_instrContext)_localctx).SELECT = match(SELECT);
				 ((Plain_instrContext)_localctx).result =  factory.createSelect(((Plain_instrContext)_localctx).SELECT); 
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(BR);
				setState(200);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(BR_IF);
				setState(202);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				match(BR_TABLE);
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					var();
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				((Plain_instrContext)_localctx).RETURN = match(RETURN);
				 ((Plain_instrContext)_localctx).result =  factory.createReturn(((Plain_instrContext)_localctx).RETURN, null); 
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				match(CALL);
				setState(212);
				var();
				}
				break;
			case LOCAL_GET:
				enterOuterAlt(_localctx, 10);
				{
				setState(213);
				match(LOCAL_GET);
				setState(214);
				var();
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 11);
				{
				setState(215);
				match(LOCAL_SET);
				setState(216);
				var();
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 12);
				{
				setState(217);
				match(LOCAL_TEE);
				setState(218);
				var();
				}
				break;
			case GLOBAL_GET:
				enterOuterAlt(_localctx, 13);
				{
				setState(219);
				match(GLOBAL_GET);
				setState(220);
				var();
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 14);
				{
				setState(221);
				match(GLOBAL_SET);
				setState(222);
				var();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 15);
				{
				setState(223);
				match(LOAD);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(224);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(227);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 16);
				{
				setState(230);
				match(STORE);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(231);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(234);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 17);
				{
				setState(237);
				match(MEMORY_SIZE);
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 18);
				{
				setState(238);
				match(MEMORY_GROW);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 19);
				{
				setState(239);
				match(CONST);
				setState(240);
				((Plain_instrContext)_localctx).literal = literal();
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral((((Plain_instrContext)_localctx).literal!=null?(((Plain_instrContext)_localctx).literal.start):null)); 
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 20);
				{
				setState(243);
				((Plain_instrContext)_localctx).TEST = match(TEST);
				 ((Plain_instrContext)_localctx).result =  factory.createTest(((Plain_instrContext)_localctx).TEST, (WasmExpressionNode) body.pop()); 
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 21);
				{
				setState(245);
				((Plain_instrContext)_localctx).COMPARE = match(COMPARE);
				 ((Plain_instrContext)_localctx).result =  factory.createCompare(((Plain_instrContext)_localctx).COMPARE, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 22);
				{
				setState(247);
				match(UNARY);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(248);
				((Plain_instrContext)_localctx).BINARY = match(BINARY);
				 ((Plain_instrContext)_localctx).result =  factory.createBinary(((Plain_instrContext)_localctx).BINARY, (WasmExpressionNode) body.pop(), (WasmExpressionNode) body.pop()); 
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 24);
				{
				setState(250);
				match(CONVERT);
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

	public static class ExprContext extends ParserRuleContext {
		public Stack<WasmStatementNode> body;
		public WasmStatementNode result;
		public Expr1Context expr1;
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
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LPAR);
			setState(254);
			((ExprContext)_localctx).expr1 = expr1(body);
			setState(255);
			match(RPAR);
			 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).expr1.result; 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			plain_instr(body);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(259);
				expr(body);
				}
				}
				setState(264);
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
		enterRule(_localctx, 36, RULE_instr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << CONST) | (1L << NOP) | (1L << UNREACHABLE) | (1L << DROP) | (1L << BR) | (1L << BR_IF) | (1L << BR_TABLE) | (1L << RETURN) | (1L << SELECT) | (1L << CALL) | (1L << LOCAL_GET) | (1L << LOCAL_SET) | (1L << LOCAL_TEE) | (1L << GLOBAL_GET) | (1L << GLOBAL_SET) | (1L << LOAD) | (1L << STORE) | (1L << UNARY) | (1L << BINARY) | (1L << TEST) | (1L << COMPARE) | (1L << CONVERT) | (1L << MEMORY_SIZE) | (1L << MEMORY_GROW))) != 0)) {
				{
				{
				setState(265);
				((Instr_listContext)_localctx).instr = instr(body);
				 body.push(((Instr_listContext)_localctx).instr.result); 
				}
				}
				setState(272);
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
		enterRule(_localctx, 38, RULE_const_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 40, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(278);
			match(FUNC);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(279);
				((FuncContext)_localctx).bind_var = bind_var();
				}
			}

			 factory.startFunction((((FuncContext)_localctx).bind_var!=null?(((FuncContext)_localctx).bind_var.start):null), ((FuncContext)_localctx).LPAR); 
			setState(283);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(285);
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
		enterRule(_localctx, 42, RULE_func_fields);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(287);
					type_use();
					}
					break;
				}
				setState(290);
				((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
				 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				inline_import();
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(294);
					type_use();
					}
					break;
				}
				setState(297);
				func_fields_import();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				inline_export();
				setState(300);
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
		enterRule(_localctx, 44, RULE_func_fields_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(304);
				match(LPAR);
				setState(305);
				match(PARAM);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(306);
					value_type();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(313);
				match(LPAR);
				setState(314);
				match(PARAM);
				setState(315);
				bind_var();
				setState(316);
				value_type();
				setState(317);
				match(RPAR);
				}
				break;
			}
			setState(321);
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
		enterRule(_localctx, 46, RULE_func_fields_import_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(323);
				match(LPAR);
				setState(324);
				match(RESULT);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(325);
					value_type();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(RPAR);
				}
				}
				setState(336);
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
		enterRule(_localctx, 48, RULE_func_fields_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
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
						break;
					case 2:
						{
						setState(346);
						match(LPAR);
						setState(347);
						match(PARAM);
						setState(348);
						match(VAR);
						setState(349);
						value_type();
						setState(350);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(357);
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
		public Func_result_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_result_body; }
	}

	public final Func_result_bodyContext func_result_body() throws RecognitionException {
		Func_result_bodyContext _localctx = new Func_result_bodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_func_result_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(LPAR);
					setState(361);
					match(RESULT);
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(362);
						value_type();
						}
						}
						setState(367);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(368);
					match(RPAR);
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(374);
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
		public Token s;
		public Instr_listContext res;
		public Token e;
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public Instr_listContext instr_list() {
			return getRuleContext(Instr_listContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<TerminalNode> LOCAL() { return getTokens(WasmLanguageParser.LOCAL); }
		public TerminalNode LOCAL(int i) {
			return getToken(WasmLanguageParser.LOCAL, i);
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
		enterRule(_localctx, 52, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 factory.startBlock();
			                                                  Stack<WasmStatementNode> body = new Stack<WasmStatementNode>(); 
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(378);
						match(LPAR);
						setState(379);
						match(LOCAL);
						setState(383);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(380);
							value_type();
							}
							}
							setState(385);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(386);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(387);
						match(LPAR);
						setState(388);
						match(LOCAL);
						setState(389);
						bind_var();
						setState(390);
						value_type();
						setState(391);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(398);
			((Func_bodyContext)_localctx).s = match(LPAR);
			setState(399);
			((Func_bodyContext)_localctx).res = instr_list(body);
			setState(400);
			((Func_bodyContext)_localctx).e = match(RPAR);
			 ((Func_bodyContext)_localctx).result =  factory.finishBlock(new ArrayList(((Func_bodyContext)_localctx).res.result), ((Func_bodyContext)_localctx).s.getStartIndex(), ((Func_bodyContext)_localctx).e.getStopIndex() - ((Func_bodyContext)_localctx).s.getStartIndex() + 1); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LPAR);
			setState(404);
			match(OFFSET);
			setState(405);
			const_expr();
			setState(406);
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
		enterRule(_localctx, 56, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LPAR);
			setState(409);
			match(ELEM);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(410);
				var();
				}
			}

			setState(413);
			offset();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(414);
				var();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
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
		enterRule(_localctx, 58, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LPAR);
			setState(423);
			match(TABLE);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(424);
				bind_var();
				}
			}

			setState(427);
			table_fields();
			setState(428);
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
		enterRule(_localctx, 60, RULE_table_fields);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				table_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				inline_import();
				setState(432);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				inline_export();
				setState(435);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				elem_type();
				setState(438);
				match(LPAR);
				setState(439);
				match(ELEM);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(440);
					var();
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
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
		enterRule(_localctx, 62, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(LPAR);
			setState(451);
			match(DATA);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(452);
				var();
				}
			}

			setState(455);
			offset();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(456);
				match(STRING);
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
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
		enterRule(_localctx, 64, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(LPAR);
			setState(465);
			match(MEMORY);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(466);
				bind_var();
				}
			}

			setState(469);
			memory_fields();
			setState(470);
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
		enterRule(_localctx, 66, RULE_memory_fields);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				memory_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				inline_import();
				setState(474);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				inline_export();
				setState(477);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(LPAR);
				setState(480);
				match(DATA);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(481);
					match(STRING);
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
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
		enterRule(_localctx, 68, RULE_sglobal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(LPAR);
			setState(491);
			match(GLOBAL);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(492);
				bind_var();
				}
			}

			setState(495);
			global_fields();
			setState(496);
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
		enterRule(_localctx, 70, RULE_global_fields);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				global_type();
				setState(499);
				const_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				inline_import();
				setState(502);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				inline_export();
				setState(505);
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
		enterRule(_localctx, 72, RULE_import_desc);
		int _la;
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(LPAR);
				setState(510);
				match(FUNC);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(511);
					bind_var();
					}
				}

				setState(514);
				type_use();
				setState(515);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(LPAR);
				setState(518);
				match(FUNC);
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
				func_type();
				setState(523);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(LPAR);
				setState(526);
				match(TABLE);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(527);
					bind_var();
					}
				}

				setState(530);
				table_type();
				setState(531);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(LPAR);
				setState(534);
				match(MEMORY);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(535);
					bind_var();
					}
				}

				setState(538);
				memory_type();
				setState(539);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
				global_type();
				setState(547);
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
		enterRule(_localctx, 74, RULE_simport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(LPAR);
			setState(552);
			match(IMPORT);
			setState(553);
			name();
			setState(554);
			name();
			setState(555);
			import_desc();
			setState(556);
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
		enterRule(_localctx, 76, RULE_inline_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(LPAR);
			setState(559);
			match(IMPORT);
			setState(560);
			name();
			setState(561);
			name();
			setState(562);
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
		enterRule(_localctx, 78, RULE_export_desc);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(LPAR);
				setState(565);
				match(FUNC);
				setState(566);
				var();
				setState(567);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(LPAR);
				setState(570);
				match(TABLE);
				setState(571);
				var();
				setState(572);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(LPAR);
				setState(575);
				match(MEMORY);
				setState(576);
				var();
				setState(577);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				match(LPAR);
				setState(580);
				match(GLOBAL);
				setState(581);
				var();
				setState(582);
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
		enterRule(_localctx, 80, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(LPAR);
			setState(587);
			match(EXPORT);
			setState(588);
			name();
			setState(589);
			export_desc();
			setState(590);
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
		enterRule(_localctx, 82, RULE_inline_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(LPAR);
			setState(593);
			match(EXPORT);
			setState(594);
			name();
			setState(595);
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
		enterRule(_localctx, 84, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
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
		enterRule(_localctx, 86, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(LPAR);
			setState(600);
			match(TYPE);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(601);
				bind_var();
				}
			}

			setState(604);
			type_();
			setState(605);
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
		enterRule(_localctx, 88, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(LPAR);
			setState(608);
			match(START);
			setState(609);
			var();
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
		enterRule(_localctx, 90, RULE_module_field);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(617);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(618);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(619);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(620);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(621);
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
		enterRule(_localctx, 92, RULE_module_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(LPAR);
			setState(625);
			match(MODULE);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(626);
				match(VAR);
				}
			}

			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(629);
				module_field();
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(635);
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
		enterRule(_localctx, 94, RULE_script_module);
		int _la;
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(LPAR);
				setState(639);
				match(MODULE);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(640);
					match(VAR);
					}
				}

				setState(643);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(644);
					match(STRING);
					}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(650);
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
		enterRule(_localctx, 96, RULE_action);
		int _la;
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(LPAR);
				setState(654);
				match(INVOKE);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(655);
					match(VAR);
					}
				}

				setState(658);
				name();
				setState(659);
				const_list();
				setState(660);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(LPAR);
				setState(663);
				match(GET);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(664);
					match(VAR);
					}
				}

				setState(667);
				name();
				setState(668);
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
		enterRule(_localctx, 98, RULE_assertion);
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(LPAR);
				setState(673);
				match(ASSERT_MALFORMED);
				setState(674);
				script_module();
				setState(675);
				match(STRING);
				setState(676);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(LPAR);
				setState(679);
				match(ASSERT_INVALID);
				setState(680);
				script_module();
				setState(681);
				match(STRING);
				setState(682);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(LPAR);
				setState(685);
				match(ASSERT_UNLINKABLE);
				setState(686);
				script_module();
				setState(687);
				match(STRING);
				setState(688);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(690);
				match(LPAR);
				setState(691);
				match(ASSERT_TRAP);
				setState(692);
				script_module();
				setState(693);
				match(STRING);
				setState(694);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(696);
				match(LPAR);
				setState(697);
				match(ASSERT_RETURN);
				setState(698);
				action();
				setState(699);
				const_list();
				setState(700);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(702);
				match(LPAR);
				setState(703);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(704);
				action();
				setState(705);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(707);
				match(LPAR);
				setState(708);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(709);
				action();
				setState(710);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(712);
				match(LPAR);
				setState(713);
				match(ASSERT_TRAP);
				setState(714);
				action();
				setState(715);
				match(STRING);
				setState(716);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(718);
				match(LPAR);
				setState(719);
				match(ASSERT_EXHAUSTION);
				setState(720);
				action();
				setState(721);
				match(STRING);
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
		enterRule(_localctx, 100, RULE_cmd);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
				match(LPAR);
				setState(730);
				match(REGISTER);
				setState(731);
				name();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(732);
					match(VAR);
					}
				}

				setState(735);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(737);
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
		enterRule(_localctx, 102, RULE_meta);
		int _la;
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				match(LPAR);
				setState(741);
				match(SCRIPT);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(742);
					match(VAR);
					}
				}

				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(745);
					cmd();
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(751);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(LPAR);
				setState(753);
				match(INPUT);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(754);
					match(VAR);
					}
				}

				setState(757);
				match(STRING);
				setState(758);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				match(LPAR);
				setState(760);
				match(OUTPUT);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(761);
					match(VAR);
					}
				}

				setState(764);
				match(STRING);
				setState(765);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
				match(LPAR);
				setState(767);
				match(OUTPUT);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(768);
					match(VAR);
					}
				}

				setState(771);
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
		enterRule(_localctx, 104, RULE_wconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(LPAR);
			setState(775);
			match(CONST);
			setState(776);
			literal();
			setState(777);
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
		enterRule(_localctx, 106, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(779);
				wconst();
				}
				}
				setState(784);
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
		enterRule(_localctx, 108, RULE_script);
		int _la;
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(785);
					cmd();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(792);
					module_field();
					}
					}
					setState(795); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(797);
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
		enterRule(_localctx, 110, RULE_module);
		int _la;
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				module_();
				setState(802);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(804);
					module_field();
					}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(810);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u0330\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090\13\t\3\t\3\t\7\t\u0094\n"+
		"\t\f\t\16\t\u0097\13\t\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\t\7\t\u00a0\n\t"+
		"\f\t\16\t\u00a3\13\t\3\n\3\n\5\n\u00a7\n\n\3\n\3\n\3\13\3\13\5\13\u00ad"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00c0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00d0\n\21\r\21\16\21\u00d1\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00e4\n\21\3\21\5\21\u00e7\n\21\3\21\3\21\5\21\u00eb\n\21\3\21"+
		"\5\21\u00ee\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00fe\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23"+
		"\u0107\n\23\f\23\16\23\u010a\13\23\3\24\3\24\3\24\7\24\u010f\n\24\f\24"+
		"\16\24\u0112\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u011b\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u0123\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u012a\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0131\n\27\3\30\3\30\3"+
		"\30\7\30\u0136\n\30\f\30\16\30\u0139\13\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0142\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u0149\n\31\f\31"+
		"\16\31\u014c\13\31\3\31\7\31\u014f\n\31\f\31\16\31\u0152\13\31\3\32\3"+
		"\32\3\32\7\32\u0157\n\32\f\32\16\32\u015a\13\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u0163\n\32\f\32\16\32\u0166\13\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\7\33\u016e\n\33\f\33\16\33\u0171\13\33\3\33\7\33\u0174\n"+
		"\33\f\33\16\33\u0177\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0180"+
		"\n\34\f\34\16\34\u0183\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u018c"+
		"\n\34\f\34\16\34\u018f\13\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\5\36\u019e\n\36\3\36\3\36\7\36\u01a2\n\36\f\36"+
		"\16\36\u01a5\13\36\3\36\3\36\3\37\3\37\3\37\5\37\u01ac\n\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01bc\n \f \16 \u01bf\13 \3"+
		" \3 \5 \u01c3\n \3!\3!\3!\5!\u01c8\n!\3!\3!\7!\u01cc\n!\f!\16!\u01cf\13"+
		"!\3!\3!\3\"\3\"\3\"\5\"\u01d6\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\7#\u01e5\n#\f#\16#\u01e8\13#\3#\5#\u01eb\n#\3$\3$\3$\5$\u01f0\n"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01fe\n%\3&\3&\3&\5&\u0203\n"+
		"&\3&\3&\3&\3&\3&\3&\5&\u020b\n&\3&\3&\3&\3&\3&\3&\5&\u0213\n&\3&\3&\3"+
		"&\3&\3&\3&\5&\u021b\n&\3&\3&\3&\3&\3&\3&\5&\u0223\n&\3&\3&\3&\5&\u0228"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u024b\n)\3*\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\5-\u025d\n-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0271\n/\3\60\3\60\3\60\5\60\u0276\n\60"+
		"\3\60\7\60\u0279\n\60\f\60\16\60\u027c\13\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\5\61\u0284\n\61\3\61\3\61\7\61\u0288\n\61\f\61\16\61\u028b\13\61"+
		"\3\61\5\61\u028e\n\61\3\62\3\62\3\62\5\62\u0293\n\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u029c\n\62\3\62\3\62\3\62\5\62\u02a1\n\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02d7\n\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u02e0\n\64\3\64\3\64\3\64\5\64\u02e5\n"+
		"\64\3\65\3\65\3\65\5\65\u02ea\n\65\3\65\7\65\u02ed\n\65\f\65\16\65\u02f0"+
		"\13\65\3\65\3\65\3\65\3\65\5\65\u02f6\n\65\3\65\3\65\3\65\3\65\3\65\5"+
		"\65\u02fd\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u0304\n\65\3\65\5\65\u0307"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\67\7\67\u030f\n\67\f\67\16\67\u0312\13"+
		"\67\38\78\u0315\n8\f8\168\u0318\138\38\38\68\u031c\n8\r8\168\u031d\38"+
		"\38\58\u0322\n8\39\39\39\39\79\u0328\n9\f9\169\u032b\139\39\59\u032e\n"+
		"9\39\2\2:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\6\3\2\6\7\3\2\5\7\4\2\5\5LL\3\2<=\2\u0379"+
		"\2r\3\2\2\2\4t\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\nz\3\2\2\2\f\u0082\3\2\2"+
		"\2\16\u0084\3\2\2\2\20\u00a1\3\2\2\2\22\u00a4\3\2\2\2\24\u00aa\3\2\2\2"+
		"\26\u00ae\3\2\2\2\30\u00b3\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36"+
		"\u00bf\3\2\2\2 \u00fd\3\2\2\2\"\u00ff\3\2\2\2$\u0104\3\2\2\2&\u0110\3"+
		"\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u0130\3\2\2\2.\u0141\3\2\2\2\60"+
		"\u0150\3\2\2\2\62\u0164\3\2\2\2\64\u0175\3\2\2\2\66\u017b\3\2\2\28\u0195"+
		"\3\2\2\2:\u019a\3\2\2\2<\u01a8\3\2\2\2>\u01c2\3\2\2\2@\u01c4\3\2\2\2B"+
		"\u01d2\3\2\2\2D\u01ea\3\2\2\2F\u01ec\3\2\2\2H\u01fd\3\2\2\2J\u0227\3\2"+
		"\2\2L\u0229\3\2\2\2N\u0230\3\2\2\2P\u024a\3\2\2\2R\u024c\3\2\2\2T\u0252"+
		"\3\2\2\2V\u0257\3\2\2\2X\u0259\3\2\2\2Z\u0261\3\2\2\2\\\u0270\3\2\2\2"+
		"^\u0272\3\2\2\2`\u028d\3\2\2\2b\u02a0\3\2\2\2d\u02d6\3\2\2\2f\u02e4\3"+
		"\2\2\2h\u0306\3\2\2\2j\u0308\3\2\2\2l\u0310\3\2\2\2n\u0321\3\2\2\2p\u032d"+
		"\3\2\2\2rs\5p9\2s\3\3\2\2\2tu\t\2\2\2u\5\3\2\2\2vw\7\b\2\2w\7\3\2\2\2"+
		"xy\7\t\2\2y\t\3\2\2\2z{\7\13\2\2{\13\3\2\2\2|\u0083\5\b\5\2}~\7\3\2\2"+
		"~\177\7\f\2\2\177\u0080\5\b\5\2\u0080\u0081\7\4\2\2\u0081\u0083\3\2\2"+
		"\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0083\r\3\2\2\2\u0084\u0085\7\3\2\2\u0085"+
		"\u0086\7.\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7\4\2\2\u0088\17\3\2\2"+
		"\2\u0089\u009c\7\3\2\2\u008a\u008e\7\61\2\2\u008b\u008d\5\b\5\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u009d\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0095\7\60\2\2\u0092"+
		"\u0094\5\b\5\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u009d\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7\60\2\2\u0099\u009a\5\34\17\2\u009a\u009b\5\b\5\2\u009b\u009d"+
		"\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u0098\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\7\4\2\2\u009f\u0089\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\21\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a6\7\5\2\2\u00a5\u00a7\7\5\2\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\n\6\2\u00a9\23\3\2\2"+
		"\2\u00aa\u00ac\7\5\2\2\u00ab\u00ad\7\5\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\7-\2\2\u00b0"+
		"\u00b1\5\32\16\2\u00b1\u00b2\7\4\2\2\u00b2\27\3\2\2\2\u00b3\u00b4\t\3"+
		"\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\t\4\2\2\u00b6\33\3\2\2\2\u00b7\u00b8"+
		"\7L\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\5 \21\2\u00ba\u00bb\b\20\1\2\u00bb"+
		"\u00c0\3\2\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\b\20\1\2\u00be\u00c0\3"+
		"\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\37\3\2\2\2\u00c1"+
		"\u00c2\7\16\2\2\u00c2\u00fe\b\21\1\2\u00c3\u00c4\7\r\2\2\u00c4\u00fe\b"+
		"\21\1\2\u00c5\u00c6\7\17\2\2\u00c6\u00fe\b\21\1\2\u00c7\u00c8\7\32\2\2"+
		"\u00c8\u00fe\b\21\1\2\u00c9\u00ca\7\23\2\2\u00ca\u00fe\5\32\16\2\u00cb"+
		"\u00cc\7\24\2\2\u00cc\u00fe\5\32\16\2\u00cd\u00cf\7\25\2\2\u00ce\u00d0"+
		"\5\32\16\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00fe\3\2\2\2\u00d3\u00d4\7\26\2\2\u00d4\u00fe"+
		"\b\21\1\2\u00d5\u00d6\7\33\2\2\u00d6\u00fe\5\32\16\2\u00d7\u00d8\7\35"+
		"\2\2\u00d8\u00fe\5\32\16\2\u00d9\u00da\7\36\2\2\u00da\u00fe\5\32\16\2"+
		"\u00db\u00dc\7\37\2\2\u00dc\u00fe\5\32\16\2\u00dd\u00de\7 \2\2\u00de\u00fe"+
		"\5\32\16\2\u00df\u00e0\7!\2\2\u00e0\u00fe\5\32\16\2\u00e1\u00e3\7\"\2"+
		"\2\u00e2\u00e4\7$\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e7\7%\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00fe\3\2\2\2\u00e8\u00ea\7#\2\2\u00e9\u00eb\7$\2\2\u00ea\u00e9\3\2\2"+
		"\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee\7%\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00fe\3\2\2\2\u00ef\u00fe\7+\2\2\u00f0"+
		"\u00fe\7,\2\2\u00f1\u00f2\7\n\2\2\u00f2\u00f3\5\30\r\2\u00f3\u00f4\b\21"+
		"\1\2\u00f4\u00fe\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6\u00fe\b\21\1\2\u00f7"+
		"\u00f8\7)\2\2\u00f8\u00fe\b\21\1\2\u00f9\u00fe\7&\2\2\u00fa\u00fb\7\'"+
		"\2\2\u00fb\u00fe\b\21\1\2\u00fc\u00fe\7*\2\2\u00fd\u00c1\3\2\2\2\u00fd"+
		"\u00c3\3\2\2\2\u00fd\u00c5\3\2\2\2\u00fd\u00c7\3\2\2\2\u00fd\u00c9\3\2"+
		"\2\2\u00fd\u00cb\3\2\2\2\u00fd\u00cd\3\2\2\2\u00fd\u00d3\3\2\2\2\u00fd"+
		"\u00d5\3\2\2\2\u00fd\u00d7\3\2\2\2\u00fd\u00d9\3\2\2\2\u00fd\u00db\3\2"+
		"\2\2\u00fd\u00dd\3\2\2\2\u00fd\u00df\3\2\2\2\u00fd\u00e1\3\2\2\2\u00fd"+
		"\u00e8\3\2\2\2\u00fd\u00ef\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd\u00f1\3\2"+
		"\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe!\3\2\2\2\u00ff\u0100\7\3\2\2"+
		"\u0100\u0101\5$\23\2\u0101\u0102\7\4\2\2\u0102\u0103\b\22\1\2\u0103#\3"+
		"\2\2\2\u0104\u0108\5 \21\2\u0105\u0107\5\"\22\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109%\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010c\5\36\20\2\u010c\u010d\b\24\1\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\b\24\1\2\u0114\'\3\2\2\2\u0115\u0116\5&\24\2\u0116)\3\2\2\2\u0117"+
		"\u0118\7\3\2\2\u0118\u011a\7.\2\2\u0119\u011b\5\34\17\2\u011a\u0119\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\26\1\2\u011d"+
		"\u011e\5,\27\2\u011e\u011f\b\26\1\2\u011f\u0120\7\4\2\2\u0120+\3\2\2\2"+
		"\u0121\u0123\5\26\f\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\5\62\32\2\u0125\u0126\b\27\1\2\u0126\u0131\3\2\2"+
		"\2\u0127\u0129\5N(\2\u0128\u012a\5\26\f\2\u0129\u0128\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5.\30\2\u012c\u0131\3\2\2\2\u012d"+
		"\u012e\5T+\2\u012e\u012f\5,\27\2\u012f\u0131\3\2\2\2\u0130\u0122\3\2\2"+
		"\2\u0130\u0127\3\2\2\2\u0130\u012d\3\2\2\2\u0131-\3\2\2\2\u0132\u0133"+
		"\7\3\2\2\u0133\u0137\7\60\2\2\u0134\u0136\5\b\5\2\u0135\u0134\3\2\2\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0142\7\4\2\2\u013b\u013c\7\3\2\2\u013c"+
		"\u013d\7\60\2\2\u013d\u013e\5\34\17\2\u013e\u013f\5\b\5\2\u013f\u0140"+
		"\7\4\2\2\u0140\u0142\3\2\2\2\u0141\u0132\3\2\2\2\u0141\u013b\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\5\60\31\2\u0144/\3\2\2\2\u0145\u0146\7\3\2"+
		"\2\u0146\u014a\7\61\2\2\u0147\u0149\5\b\5\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014f\7\4\2\2\u014e\u0145\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\61\3\2\2"+
		"\2\u0152\u0150\3\2\2\2\u0153\u0154\7\3\2\2\u0154\u0158\7\60\2\2\u0155"+
		"\u0157\5\b\5\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u0163\7\4\2\2\u015c\u015d\7\3\2\2\u015d\u015e\7\60\2\2\u015e\u015f\7"+
		"L\2\2\u015f\u0160\5\b\5\2\u0160\u0161\7\4\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0153\3\2\2\2\u0162\u015c\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\5\64\33\2\u0168\u0169\b\32\1\2\u0169\63\3\2\2\2\u016a\u016b\7\3"+
		"\2\2\u016b\u016f\7\61\2\2\u016c\u016e\5\b\5\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0174\7\4\2\2\u0173\u016a\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0178\u0179\5\66\34\2\u0179\u017a\b\33\1\2\u017a"+
		"\65\3\2\2\2\u017b\u018d\b\34\1\2\u017c\u017d\7\3\2\2\u017d\u0181\7\62"+
		"\2\2\u017e\u0180\5\b\5\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0184\u018c\7\4\2\2\u0185\u0186\7\3\2\2\u0186\u0187\7\62\2\2\u0187"+
		"\u0188\5\34\17\2\u0188\u0189\5\b\5\2\u0189\u018a\7\4\2\2\u018a\u018c\3"+
		"\2\2\2\u018b\u017c\3\2\2\2\u018b\u0185\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u0190\u0191\7\3\2\2\u0191\u0192\5&\24\2\u0192\u0193\7\4\2\2\u0193"+
		"\u0194\b\34\1\2\u0194\67\3\2\2\2\u0195\u0196\7\3\2\2\u0196\u0197\78\2"+
		"\2\u0197\u0198\5(\25\2\u0198\u0199\7\4\2\2\u01999\3\2\2\2\u019a\u019b"+
		"\7\3\2\2\u019b\u019d\7\66\2\2\u019c\u019e\5\32\16\2\u019d\u019c\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a3\58\35\2\u01a0\u01a2"+
		"\5\32\16\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2"+
		"\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7"+
		"\7\4\2\2\u01a7;\3\2\2\2\u01a8\u01a9\7\3\2\2\u01a9\u01ab\7\64\2\2\u01aa"+
		"\u01ac\5\34\17\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3"+
		"\2\2\2\u01ad\u01ae\5> \2\u01ae\u01af\7\4\2\2\u01af=\3\2\2\2\u01b0\u01c3"+
		"\5\22\n\2\u01b1\u01b2\5N(\2\u01b2\u01b3\5\22\n\2\u01b3\u01c3\3\2\2\2\u01b4"+
		"\u01b5\5T+\2\u01b5\u01b6\5> \2\u01b6\u01c3\3\2\2\2\u01b7\u01b8\5\n\6\2"+
		"\u01b8\u01b9\7\3\2\2\u01b9\u01bd\7\66\2\2\u01ba\u01bc\5\32\16\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7\4\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01b0\3\2\2\2\u01c2\u01b1\3\2\2\2\u01c2\u01b4\3\2"+
		"\2\2\u01c2\u01b7\3\2\2\2\u01c3?\3\2\2\2\u01c4\u01c5\7\3\2\2\u01c5\u01c7"+
		"\7\67\2\2\u01c6\u01c8\5\32\16\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2"+
		"\2\u01c8\u01c9\3\2\2\2\u01c9\u01cd\58\35\2\u01ca\u01cc\7\b\2\2\u01cb\u01ca"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7\4\2\2\u01d1A\3\2\2\2"+
		"\u01d2\u01d3\7\3\2\2\u01d3\u01d5\7\65\2\2\u01d4\u01d6\5\34\17\2\u01d5"+
		"\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5D"+
		"#\2\u01d8\u01d9\7\4\2\2\u01d9C\3\2\2\2\u01da\u01eb\5\24\13\2\u01db\u01dc"+
		"\5N(\2\u01dc\u01dd\5\24\13\2\u01dd\u01eb\3\2\2\2\u01de\u01df\5T+\2\u01df"+
		"\u01e0\5D#\2\u01e0\u01eb\3\2\2\2\u01e1\u01e2\7\3\2\2\u01e2\u01e6\7\67"+
		"\2\2\u01e3\u01e5\7\b\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01eb\7\4\2\2\u01ea\u01da\3\2\2\2\u01ea\u01db\3\2\2\2\u01ea"+
		"\u01de\3\2\2\2\u01ea\u01e1\3\2\2\2\u01ebE\3\2\2\2\u01ec\u01ed\7\3\2\2"+
		"\u01ed\u01ef\7\63\2\2\u01ee\u01f0\5\34\17\2\u01ef\u01ee\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5H%\2\u01f2\u01f3\7\4\2"+
		"\2\u01f3G\3\2\2\2\u01f4\u01f5\5\f\7\2\u01f5\u01f6\5(\25\2\u01f6\u01fe"+
		"\3\2\2\2\u01f7\u01f8\5N(\2\u01f8\u01f9\5\f\7\2\u01f9\u01fe\3\2\2\2\u01fa"+
		"\u01fb\5T+\2\u01fb\u01fc\5H%\2\u01fc\u01fe\3\2\2\2\u01fd\u01f4\3\2\2\2"+
		"\u01fd\u01f7\3\2\2\2\u01fd\u01fa\3\2\2\2\u01feI\3\2\2\2\u01ff\u0200\7"+
		"\3\2\2\u0200\u0202\7.\2\2\u0201\u0203\5\34\17\2\u0202\u0201\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5\26\f\2\u0205\u0206\7"+
		"\4\2\2\u0206\u0228\3\2\2\2\u0207\u0208\7\3\2\2\u0208\u020a\7.\2\2\u0209"+
		"\u020b\5\34\17\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3"+
		"\2\2\2\u020c\u020d\5\20\t\2\u020d\u020e\7\4\2\2\u020e\u0228\3\2\2\2\u020f"+
		"\u0210\7\3\2\2\u0210\u0212\7\64\2\2\u0211\u0213\5\34\17\2\u0212\u0211"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\5\22\n\2"+
		"\u0215\u0216\7\4\2\2\u0216\u0228\3\2\2\2\u0217\u0218\7\3\2\2\u0218\u021a"+
		"\7\65\2\2\u0219\u021b\5\34\17\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2"+
		"\2\u021b\u021c\3\2\2\2\u021c\u021d\5\24\13\2\u021d\u021e\7\4\2\2\u021e"+
		"\u0228\3\2\2\2\u021f\u0220\7\3\2\2\u0220\u0222\7\63\2\2\u0221\u0223\5"+
		"\34\17\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\5\f\7\2\u0225\u0226\7\4\2\2\u0226\u0228\3\2\2\2\u0227\u01ff\3\2"+
		"\2\2\u0227\u0207\3\2\2\2\u0227\u020f\3\2\2\2\u0227\u0217\3\2\2\2\u0227"+
		"\u021f\3\2\2\2\u0228K\3\2\2\2\u0229\u022a\7\3\2\2\u022a\u022b\79\2\2\u022b"+
		"\u022c\5\6\4\2\u022c\u022d\5\6\4\2\u022d\u022e\5J&\2\u022e\u022f\7\4\2"+
		"\2\u022fM\3\2\2\2\u0230\u0231\7\3\2\2\u0231\u0232\79\2\2\u0232\u0233\5"+
		"\6\4\2\u0233\u0234\5\6\4\2\u0234\u0235\7\4\2\2\u0235O\3\2\2\2\u0236\u0237"+
		"\7\3\2\2\u0237\u0238\7.\2\2\u0238\u0239\5\32\16\2\u0239\u023a\7\4\2\2"+
		"\u023a\u024b\3\2\2\2\u023b\u023c\7\3\2\2\u023c\u023d\7\64\2\2\u023d\u023e"+
		"\5\32\16\2\u023e\u023f\7\4\2\2\u023f\u024b\3\2\2\2\u0240\u0241\7\3\2\2"+
		"\u0241\u0242\7\65\2\2\u0242\u0243\5\32\16\2\u0243\u0244\7\4\2\2\u0244"+
		"\u024b\3\2\2\2\u0245\u0246\7\3\2\2\u0246\u0247\7\63\2\2\u0247\u0248\5"+
		"\32\16\2\u0248\u0249\7\4\2\2\u0249\u024b\3\2\2\2\u024a\u0236\3\2\2\2\u024a"+
		"\u023b\3\2\2\2\u024a\u0240\3\2\2\2\u024a\u0245\3\2\2\2\u024bQ\3\2\2\2"+
		"\u024c\u024d\7\3\2\2\u024d\u024e\7:\2\2\u024e\u024f\5\6\4\2\u024f\u0250"+
		"\5P)\2\u0250\u0251\7\4\2\2\u0251S\3\2\2\2\u0252\u0253\7\3\2\2\u0253\u0254"+
		"\7:\2\2\u0254\u0255\5\6\4\2\u0255\u0256\7\4\2\2\u0256U\3\2\2\2\u0257\u0258"+
		"\5\16\b\2\u0258W\3\2\2\2\u0259\u025a\7\3\2\2\u025a\u025c\7-\2\2\u025b"+
		"\u025d\5\34\17\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3"+
		"\2\2\2\u025e\u025f\5V,\2\u025f\u0260\7\4\2\2\u0260Y\3\2\2\2\u0261\u0262"+
		"\7\3\2\2\u0262\u0263\7/\2\2\u0263\u0264\5\32\16\2\u0264\u0265\7\4\2\2"+
		"\u0265[\3\2\2\2\u0266\u0271\5X-\2\u0267\u0271\5F$\2\u0268\u0271\5<\37"+
		"\2\u0269\u0271\5B\"\2\u026a\u0271\5*\26\2\u026b\u0271\5:\36\2\u026c\u0271"+
		"\5@!\2\u026d\u0271\5Z.\2\u026e\u0271\5L\'\2\u026f\u0271\5R*\2\u0270\u0266"+
		"\3\2\2\2\u0270\u0267\3\2\2\2\u0270\u0268\3\2\2\2\u0270\u0269\3\2\2\2\u0270"+
		"\u026a\3\2\2\2\u0270\u026b\3\2\2\2\u0270\u026c\3\2\2\2\u0270\u026d\3\2"+
		"\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271]\3\2\2\2\u0272\u0273"+
		"\7\3\2\2\u0273\u0275\7;\2\2\u0274\u0276\7L\2\2\u0275\u0274\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u027a\3\2\2\2\u0277\u0279\5\\/\2\u0278\u0277\3\2"+
		"\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\7\4\2\2\u027e_\3\2\2\2"+
		"\u027f\u028e\5^\60\2\u0280\u0281\7\3\2\2\u0281\u0283\7;\2\2\u0282\u0284"+
		"\7L\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0289\t\5\2\2\u0286\u0288\7\b\2\2\u0287\u0286\3\2\2\2\u0288\u028b\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028c\u028e\7\4\2\2\u028d\u027f\3\2\2\2\u028d\u0280\3\2"+
		"\2\2\u028ea\3\2\2\2\u028f\u0290\7\3\2\2\u0290\u0292\7@\2\2\u0291\u0293"+
		"\7L\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\5\6\4\2\u0295\u0296\5l\67\2\u0296\u0297\7\4\2\2\u0297\u02a1\3\2"+
		"\2\2\u0298\u0299\7\3\2\2\u0299\u029b\7A\2\2\u029a\u029c\7L\2\2\u029b\u029a"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\5\6\4\2\u029e"+
		"\u029f\7\4\2\2\u029f\u02a1\3\2\2\2\u02a0\u028f\3\2\2\2\u02a0\u0298\3\2"+
		"\2\2\u02a1c\3\2\2\2\u02a2\u02a3\7\3\2\2\u02a3\u02a4\7B\2\2\u02a4\u02a5"+
		"\5`\61\2\u02a5\u02a6\7\b\2\2\u02a6\u02a7\7\4\2\2\u02a7\u02d7\3\2\2\2\u02a8"+
		"\u02a9\7\3\2\2\u02a9\u02aa\7C\2\2\u02aa\u02ab\5`\61\2\u02ab\u02ac\7\b"+
		"\2\2\u02ac\u02ad\7\4\2\2\u02ad\u02d7\3\2\2\2\u02ae\u02af\7\3\2\2\u02af"+
		"\u02b0\7D\2\2\u02b0\u02b1\5`\61\2\u02b1\u02b2\7\b\2\2\u02b2\u02b3\7\4"+
		"\2\2\u02b3\u02d7\3\2\2\2\u02b4\u02b5\7\3\2\2\u02b5\u02b6\7H\2\2\u02b6"+
		"\u02b7\5`\61\2\u02b7\u02b8\7\b\2\2\u02b8\u02b9\7\4\2\2\u02b9\u02d7\3\2"+
		"\2\2\u02ba\u02bb\7\3\2\2\u02bb\u02bc\7E\2\2\u02bc\u02bd\5b\62\2\u02bd"+
		"\u02be\5l\67\2\u02be\u02bf\7\4\2\2\u02bf\u02d7\3\2\2\2\u02c0\u02c1\7\3"+
		"\2\2\u02c1\u02c2\7F\2\2\u02c2\u02c3\5b\62\2\u02c3\u02c4\7\4\2\2\u02c4"+
		"\u02d7\3\2\2\2\u02c5\u02c6\7\3\2\2\u02c6\u02c7\7G\2\2\u02c7\u02c8\5b\62"+
		"\2\u02c8\u02c9\7\4\2\2\u02c9\u02d7\3\2\2\2\u02ca\u02cb\7\3\2\2\u02cb\u02cc"+
		"\7H\2\2\u02cc\u02cd\5b\62\2\u02cd\u02ce\7\b\2\2\u02ce\u02cf\7\4\2\2\u02cf"+
		"\u02d7\3\2\2\2\u02d0\u02d1\7\3\2\2\u02d1\u02d2\7I\2\2\u02d2\u02d3\5b\62"+
		"\2\u02d3\u02d4\7\b\2\2\u02d4\u02d5\7\4\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02a2"+
		"\3\2\2\2\u02d6\u02a8\3\2\2\2\u02d6\u02ae\3\2\2\2\u02d6\u02b4\3\2\2\2\u02d6"+
		"\u02ba\3\2\2\2\u02d6\u02c0\3\2\2\2\u02d6\u02c5\3\2\2\2\u02d6\u02ca\3\2"+
		"\2\2\u02d6\u02d0\3\2\2\2\u02d7e\3\2\2\2\u02d8\u02e5\5b\62\2\u02d9\u02e5"+
		"\5d\63\2\u02da\u02e5\5`\61\2\u02db\u02dc\7\3\2\2\u02dc\u02dd\7?\2\2\u02dd"+
		"\u02df\5\6\4\2\u02de\u02e0\7L\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\4\2\2\u02e2\u02e5\3\2\2\2\u02e3"+
		"\u02e5\5h\65\2\u02e4\u02d8\3\2\2\2\u02e4\u02d9\3\2\2\2\u02e4\u02da\3\2"+
		"\2\2\u02e4\u02db\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5g\3\2\2\2\u02e6\u02e7"+
		"\7\3\2\2\u02e7\u02e9\7>\2\2\u02e8\u02ea\7L\2\2\u02e9\u02e8\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02ee\3\2\2\2\u02eb\u02ed\5f\64\2\u02ec\u02eb\3\2"+
		"\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u0307\7\4\2\2\u02f2\u02f3\7\3"+
		"\2\2\u02f3\u02f5\7J\2\2\u02f4\u02f6\7L\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\7\b\2\2\u02f8\u0307\7\4\2\2\u02f9"+
		"\u02fa\7\3\2\2\u02fa\u02fc\7K\2\2\u02fb\u02fd\7L\2\2\u02fc\u02fb\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7\b\2\2\u02ff\u0307"+
		"\7\4\2\2\u0300\u0301\7\3\2\2\u0301\u0303\7K\2\2\u0302\u0304\7L\2\2\u0303"+
		"\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\7\4"+
		"\2\2\u0306\u02e6\3\2\2\2\u0306\u02f2\3\2\2\2\u0306\u02f9\3\2\2\2\u0306"+
		"\u0300\3\2\2\2\u0307i\3\2\2\2\u0308\u0309\7\3\2\2\u0309\u030a\7\n\2\2"+
		"\u030a\u030b\5\30\r\2\u030b\u030c\7\4\2\2\u030ck\3\2\2\2\u030d\u030f\5"+
		"j\66\2\u030e\u030d\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311m\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0315\5f\64\2"+
		"\u0314\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317"+
		"\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u0322\7\2\2\3\u031a"+
		"\u031c\5\\/\2\u031b\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\7\2\2\3\u0320"+
		"\u0322\3\2\2\2\u0321\u0316\3\2\2\2\u0321\u031b\3\2\2\2\u0322o\3\2\2\2"+
		"\u0323\u0324\5^\60\2\u0324\u0325\7\2\2\3\u0325\u032e\3\2\2\2\u0326\u0328"+
		"\5\\/\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\7\2"+
		"\2\3\u032d\u0323\3\2\2\2\u032d\u0329\3\2\2\2\u032eq\3\2\2\2N\u0082\u008e"+
		"\u0095\u009c\u00a1\u00a6\u00ac\u00bf\u00d1\u00e3\u00e6\u00ea\u00ed\u00fd"+
		"\u0108\u0110\u011a\u0122\u0129\u0130\u0137\u0141\u014a\u0150\u0158\u0162"+
		"\u0164\u016f\u0175\u0181\u018b\u018d\u019d\u01a3\u01ab\u01bd\u01c2\u01c7"+
		"\u01cd\u01d5\u01e6\u01ea\u01ef\u01fd\u0202\u020a\u0212\u021a\u0222\u0227"+
		"\u024a\u025c\u0270\u0275\u027a\u0283\u0289\u028d\u0292\u029b\u02a0\u02d6"+
		"\u02df\u02e4\u02e9\u02ee\u02f5\u02fc\u0303\u0306\u0310\u0316\u031d\u0321"+
		"\u0329\u032d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}