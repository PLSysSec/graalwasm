// Generated from language/src/main/java/com/oracle/truffle/wasm/parser/WasmLanguage.g4 by ANTLR 4.7.1
package com.oracle.truffle.wasm.parser;

// DO NOT MODIFY - generated from WasmLanguage.g4 using "mx create-wasm-parser"

import java.util.ArrayList;
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
		RULE_instr_list = 16, RULE_func = 17, RULE_func_fields = 18, RULE_func_fields_body = 19, 
		RULE_func_result_body = 20, RULE_func_body = 21, RULE_module_field = 22, 
		RULE_module_ = 23, RULE_module = 24;
	public static final String[] ruleNames = {
		"wasmlanguage", "value", "name", "value_type", "elem_type", "global_type", 
		"def_type", "func_type", "table_type", "memory_type", "type_use", "literal", 
		"var", "bind_var", "instr", "plain_instr", "instr_list", "func", "func_fields", 
		"func_fields_body", "func_result_body", "func_body", "module_field", "module_", 
		"module"
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
			setState(50);
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
			setState(52);
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
			setState(54);
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
			setState(56);
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
			setState(58);
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				value_type();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(LPAR);
				setState(62);
				match(MUT);
				setState(63);
				value_type();
				setState(64);
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
			setState(68);
			match(LPAR);
			setState(69);
			match(FUNC);
			setState(70);
			func_type();
			setState(71);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(73);
				match(LPAR);
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(74);
					match(RESULT);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(75);
						value_type();
						}
						}
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(81);
					match(PARAM);
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(82);
						value_type();
						}
						}
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(88);
					match(PARAM);
					setState(89);
					bind_var();
					setState(90);
					value_type();
					}
					break;
				}
				setState(94);
				match(RPAR);
				}
				}
				setState(99);
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
			setState(100);
			match(NAT);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(101);
				match(NAT);
				}
			}

			setState(104);
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
			setState(106);
			match(NAT);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(107);
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
			setState(110);
			match(LPAR);
			setState(111);
			match(TYPE);
			setState(112);
			var();
			setState(113);
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
			setState(115);
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
			setState(117);
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
			setState(119);
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
		public WasmStatementNode result;
		public Plain_instrContext plain_instr;
		public Plain_instrContext plain_instr() {
			return getRuleContext(Plain_instrContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((InstrContext)_localctx).plain_instr = plain_instr();
			 ((InstrContext)_localctx).result =  ((InstrContext)_localctx).plain_instr.result; 
			}
		}
		catch (RecognitionException re) {
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
		public WasmStatementNode result;
		public Token NOP;
		public Token DROP;
		public Token NAT;
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
		public TerminalNode NAT() { return getToken(WasmLanguageParser.NAT, 0); }
		public TerminalNode TEST() { return getToken(WasmLanguageParser.TEST, 0); }
		public TerminalNode COMPARE() { return getToken(WasmLanguageParser.COMPARE, 0); }
		public TerminalNode UNARY() { return getToken(WasmLanguageParser.UNARY, 0); }
		public TerminalNode BINARY() { return getToken(WasmLanguageParser.BINARY, 0); }
		public TerminalNode CONVERT() { return getToken(WasmLanguageParser.CONVERT, 0); }
		public Plain_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plain_instr; }
	}

	public final Plain_instrContext plain_instr() throws RecognitionException {
		Plain_instrContext _localctx = new Plain_instrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plain_instr);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(UNREACHABLE);
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((Plain_instrContext)_localctx).NOP = match(NOP);
				 ((Plain_instrContext)_localctx).result =  factory.createNop(((Plain_instrContext)_localctx).NOP); 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				((Plain_instrContext)_localctx).DROP = match(DROP);
				 ((Plain_instrContext)_localctx).result =  factory.createDrop(((Plain_instrContext)_localctx).DROP); 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(SELECT);
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(BR);
				setState(131);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(BR_IF);
				setState(133);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				match(BR_TABLE);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					var();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				match(RETURN);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				match(CALL);
				setState(142);
				var();
				}
				break;
			case LOCAL_GET:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				match(LOCAL_GET);
				setState(144);
				var();
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				match(LOCAL_SET);
				setState(146);
				var();
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 12);
				{
				setState(147);
				match(LOCAL_TEE);
				setState(148);
				var();
				}
				break;
			case GLOBAL_GET:
				enterOuterAlt(_localctx, 13);
				{
				setState(149);
				match(GLOBAL_GET);
				setState(150);
				var();
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 14);
				{
				setState(151);
				match(GLOBAL_SET);
				setState(152);
				var();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 15);
				{
				setState(153);
				match(LOAD);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(154);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(157);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 16);
				{
				setState(160);
				match(STORE);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(161);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(164);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 17);
				{
				setState(167);
				match(MEMORY_SIZE);
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 18);
				{
				setState(168);
				match(MEMORY_GROW);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 19);
				{
				setState(169);
				match(CONST);
				setState(170);
				((Plain_instrContext)_localctx).NAT = match(NAT);
				 ((Plain_instrContext)_localctx).result =  factory.createNumericLiteral(((Plain_instrContext)_localctx).NAT); 
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 20);
				{
				setState(172);
				match(TEST);
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 21);
				{
				setState(173);
				match(COMPARE);
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 22);
				{
				setState(174);
				match(UNARY);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(175);
				match(BINARY);
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 24);
				{
				setState(176);
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

	public static class Instr_listContext extends ParserRuleContext {
		public List<WasmStatementNode> body;
		public List<WasmStatementNode> result;
		public InstrContext instr;
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Instr_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Instr_listContext(ParserRuleContext parent, int invokingState, List<WasmStatementNode> body) {
			super(parent, invokingState);
			this.body = body;
		}
		@Override public int getRuleIndex() { return RULE_instr_list; }
	}

	public final Instr_listContext instr_list(List<WasmStatementNode> body) throws RecognitionException {
		Instr_listContext _localctx = new Instr_listContext(_ctx, getState(), body);
		enterRule(_localctx, 32, RULE_instr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << NOP) | (1L << UNREACHABLE) | (1L << DROP) | (1L << BR) | (1L << BR_IF) | (1L << BR_TABLE) | (1L << RETURN) | (1L << SELECT) | (1L << CALL) | (1L << LOCAL_GET) | (1L << LOCAL_SET) | (1L << LOCAL_TEE) | (1L << GLOBAL_GET) | (1L << GLOBAL_SET) | (1L << LOAD) | (1L << STORE) | (1L << UNARY) | (1L << BINARY) | (1L << TEST) | (1L << COMPARE) | (1L << CONVERT) | (1L << MEMORY_SIZE) | (1L << MEMORY_GROW))) != 0)) {
				{
				{
				setState(179);
				((Instr_listContext)_localctx).instr = instr();
				 body.add(((Instr_listContext)_localctx).instr.result); 
				}
				}
				setState(186);
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

	public static class FuncContext extends ParserRuleContext {
		public Token LPAR;
		public Token VAR;
		public Func_fieldsContext func_fields;
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public TerminalNode FUNC() { return getToken(WasmLanguageParser.FUNC, 0); }
		public Func_fieldsContext func_fields() {
			return getRuleContext(Func_fieldsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public TerminalNode VAR() { return getToken(WasmLanguageParser.VAR, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((FuncContext)_localctx).LPAR = match(LPAR);
			setState(190);
			match(FUNC);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(191);
				((FuncContext)_localctx).VAR = match(VAR);
				}
			}

			 factory.startFunction(((FuncContext)_localctx).VAR, ((FuncContext)_localctx).LPAR); 
			setState(195);
			((FuncContext)_localctx).func_fields = func_fields();
			 factory.finishFunction(((FuncContext)_localctx).func_fields.result); 
			setState(197);
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
		public Func_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields; }
	}

	public final Func_fieldsContext func_fields() throws RecognitionException {
		Func_fieldsContext _localctx = new Func_fieldsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(199);
				type_use();
				}
				break;
			}
			setState(202);
			((Func_fieldsContext)_localctx).func_fields_body = func_fields_body();
			 ((Func_fieldsContext)_localctx).result =  ((Func_fieldsContext)_localctx).func_fields_body.result; 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_func_fields_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(205);
						match(LPAR);
						setState(206);
						match(PARAM);
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(207);
							value_type();
							}
							}
							setState(212);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(213);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(214);
						match(LPAR);
						setState(215);
						match(PARAM);
						setState(216);
						match(VAR);
						setState(217);
						value_type();
						setState(218);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(225);
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
		enterRule(_localctx, 40, RULE_func_result_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(LPAR);
					setState(229);
					match(RESULT);
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(230);
						value_type();
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(236);
					match(RPAR);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(242);
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
		enterRule(_localctx, 42, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(245);
						match(LPAR);
						setState(246);
						match(LOCAL);
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(247);
							value_type();
							}
							}
							setState(252);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(253);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(254);
						match(LPAR);
						setState(255);
						match(LOCAL);
						setState(256);
						bind_var();
						setState(257);
						value_type();
						setState(258);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			 factory.startBlock();
			                                                  List<WasmStatementNode> body = new ArrayList<>(); 
			setState(266);
			((Func_bodyContext)_localctx).s = match(LPAR);
			setState(267);
			((Func_bodyContext)_localctx).res = instr_list(body);
			setState(268);
			((Func_bodyContext)_localctx).e = match(RPAR);
			 ((Func_bodyContext)_localctx).result =  factory.finishBlock(((Func_bodyContext)_localctx).res.result, ((Func_bodyContext)_localctx).s.getStartIndex(), ((Func_bodyContext)_localctx).e.getStopIndex() - ((Func_bodyContext)_localctx).s.getStartIndex() + 1); 
			}
		}
		catch (RecognitionException re) {
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
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Module_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_field; }
	}

	public final Module_fieldContext module_field() throws RecognitionException {
		Module_fieldContext _localctx = new Module_fieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_module_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			func();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_module_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LPAR);
			setState(274);
			match(MODULE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(275);
				match(VAR);
				}
			}

			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(278);
				module_field();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
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
		enterRule(_localctx, 48, RULE_module);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				module_();
				setState(287);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(289);
					module_field();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u012d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7E\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t"+
		"\3\t\3\t\7\tV\n\t\f\t\16\tY\13\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\7\tb\n\t"+
		"\f\t\16\te\13\t\3\n\3\n\5\ni\n\n\3\n\3\n\3\13\3\13\5\13o\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u008b\n\21\r\21\16"+
		"\21\u008c\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009e\n\21\3\21\5\21\u00a1\n\21\3\21\3\21\5\21\u00a5"+
		"\n\21\3\21\5\21\u00a8\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00b4\n\21\3\22\3\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\5\23\u00c3\n\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\5\24\u00cb\n\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00d3\n\25"+
		"\f\25\16\25\u00d6\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00df"+
		"\n\25\f\25\16\25\u00e2\13\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00ea"+
		"\n\26\f\26\16\26\u00ed\13\26\3\26\7\26\u00f0\n\26\f\26\16\26\u00f3\13"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u00fb\n\27\f\27\16\27\u00fe\13"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0107\n\27\f\27\16\27\u010a"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\5\31\u0117"+
		"\n\31\3\31\7\31\u011a\n\31\f\31\16\31\u011d\13\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\7\32\u0125\n\32\f\32\16\32\u0128\13\32\3\32\5\32\u012b\n\32"+
		"\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5"+
		"\3\2\6\7\3\2\5\7\4\2\5\5LL\2\u0146\2\64\3\2\2\2\4\66\3\2\2\2\68\3\2\2"+
		"\2\b:\3\2\2\2\n<\3\2\2\2\fD\3\2\2\2\16F\3\2\2\2\20c\3\2\2\2\22f\3\2\2"+
		"\2\24l\3\2\2\2\26p\3\2\2\2\30u\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2\36{\3\2"+
		"\2\2 \u00b3\3\2\2\2\"\u00ba\3\2\2\2$\u00bf\3\2\2\2&\u00ca\3\2\2\2(\u00e0"+
		"\3\2\2\2*\u00f1\3\2\2\2,\u0108\3\2\2\2.\u0111\3\2\2\2\60\u0113\3\2\2\2"+
		"\62\u012a\3\2\2\2\64\65\5\62\32\2\65\3\3\2\2\2\66\67\t\2\2\2\67\5\3\2"+
		"\2\289\7\b\2\29\7\3\2\2\2:;\7\t\2\2;\t\3\2\2\2<=\7\13\2\2=\13\3\2\2\2"+
		">E\5\b\5\2?@\7\3\2\2@A\7\f\2\2AB\5\b\5\2BC\7\4\2\2CE\3\2\2\2D>\3\2\2\2"+
		"D?\3\2\2\2E\r\3\2\2\2FG\7\3\2\2GH\7.\2\2HI\5\20\t\2IJ\7\4\2\2J\17\3\2"+
		"\2\2K^\7\3\2\2LP\7\61\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q_\3\2\2\2RP\3\2\2\2SW\7\60\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2\2WU"+
		"\3\2\2\2WX\3\2\2\2X_\3\2\2\2YW\3\2\2\2Z[\7\60\2\2[\\\5\34\17\2\\]\5\b"+
		"\5\2]_\3\2\2\2^L\3\2\2\2^S\3\2\2\2^Z\3\2\2\2_`\3\2\2\2`b\7\4\2\2aK\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\21\3\2\2\2ec\3\2\2\2fh\7\5\2\2gi\7"+
		"\5\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5\n\6\2k\23\3\2\2\2ln\7\5\2\2m"+
		"o\7\5\2\2nm\3\2\2\2no\3\2\2\2o\25\3\2\2\2pq\7\3\2\2qr\7-\2\2rs\5\32\16"+
		"\2st\7\4\2\2t\27\3\2\2\2uv\t\3\2\2v\31\3\2\2\2wx\t\4\2\2x\33\3\2\2\2y"+
		"z\7L\2\2z\35\3\2\2\2{|\5 \21\2|}\b\20\1\2}\37\3\2\2\2~\u00b4\7\16\2\2"+
		"\177\u0080\7\r\2\2\u0080\u00b4\b\21\1\2\u0081\u0082\7\17\2\2\u0082\u00b4"+
		"\b\21\1\2\u0083\u00b4\7\32\2\2\u0084\u0085\7\23\2\2\u0085\u00b4\5\32\16"+
		"\2\u0086\u0087\7\24\2\2\u0087\u00b4\5\32\16\2\u0088\u008a\7\25\2\2\u0089"+
		"\u008b\5\32\16\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u00b4\3\2\2\2\u008e\u00b4\7\26\2\2\u008f"+
		"\u0090\7\33\2\2\u0090\u00b4\5\32\16\2\u0091\u0092\7\35\2\2\u0092\u00b4"+
		"\5\32\16\2\u0093\u0094\7\36\2\2\u0094\u00b4\5\32\16\2\u0095\u0096\7\37"+
		"\2\2\u0096\u00b4\5\32\16\2\u0097\u0098\7 \2\2\u0098\u00b4\5\32\16\2\u0099"+
		"\u009a\7!\2\2\u009a\u00b4\5\32\16\2\u009b\u009d\7\"\2\2\u009c\u009e\7"+
		"$\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u00a1\7%\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00b4\3\2"+
		"\2\2\u00a2\u00a4\7#\2\2\u00a3\u00a5\7$\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\7%\2\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00b4\3\2\2\2\u00a9\u00b4\7+\2\2\u00aa\u00b4\7,\2"+
		"\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\7\5\2\2\u00ad\u00b4\b\21\1\2\u00ae"+
		"\u00b4\7(\2\2\u00af\u00b4\7)\2\2\u00b0\u00b4\7&\2\2\u00b1\u00b4\7\'\2"+
		"\2\u00b2\u00b4\7*\2\2\u00b3~\3\2\2\2\u00b3\177\3\2\2\2\u00b3\u0081\3\2"+
		"\2\2\u00b3\u0083\3\2\2\2\u00b3\u0084\3\2\2\2\u00b3\u0086\3\2\2\2\u00b3"+
		"\u0088\3\2\2\2\u00b3\u008e\3\2\2\2\u00b3\u008f\3\2\2\2\u00b3\u0091\3\2"+
		"\2\2\u00b3\u0093\3\2\2\2\u00b3\u0095\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3"+
		"\u0099\3\2\2\2\u00b3\u009b\3\2\2\2\u00b3\u00a2\3\2\2\2\u00b3\u00a9\3\2"+
		"\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3"+
		"\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4!\3\2\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\b\22\1\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\b\22"+
		"\1\2\u00be#\3\2\2\2\u00bf\u00c0\7\3\2\2\u00c0\u00c2\7.\2\2\u00c1\u00c3"+
		"\7L\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\b\23\1\2\u00c5\u00c6\5&\24\2\u00c6\u00c7\b\23\1\2\u00c7\u00c8\7"+
		"\4\2\2\u00c8%\3\2\2\2\u00c9\u00cb\5\26\f\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\b\24\1\2"+
		"\u00ce\'\3\2\2\2\u00cf\u00d0\7\3\2\2\u00d0\u00d4\7\60\2\2\u00d1\u00d3"+
		"\5\b\5\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00df\7\4"+
		"\2\2\u00d8\u00d9\7\3\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7L\2\2\u00db"+
		"\u00dc\5\b\5\2\u00dc\u00dd\7\4\2\2\u00dd\u00df\3\2\2\2\u00de\u00cf\3\2"+
		"\2\2\u00de\u00d8\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5*"+
		"\26\2\u00e4\u00e5\b\25\1\2\u00e5)\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00eb"+
		"\7\61\2\2\u00e8\u00ea\5\b\5\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f0\7\4\2\2\u00ef\u00e6\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f5\5,\27\2\u00f5\u00f6\b\26\1\2\u00f6+\3\2\2\2\u00f7\u00f8"+
		"\7\3\2\2\u00f8\u00fc\7\62\2\2\u00f9\u00fb\5\b\5\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0107\7\4\2\2\u0100\u0101\7\3\2\2\u0101"+
		"\u0102\7\62\2\2\u0102\u0103\5\34\17\2\u0103\u0104\5\b\5\2\u0104\u0105"+
		"\7\4\2\2\u0105\u0107\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u0100\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\b\27\1\2\u010c\u010d\7\3\2\2\u010d"+
		"\u010e\5\"\22\2\u010e\u010f\7\4\2\2\u010f\u0110\b\27\1\2\u0110-\3\2\2"+
		"\2\u0111\u0112\5$\23\2\u0112/\3\2\2\2\u0113\u0114\7\3\2\2\u0114\u0116"+
		"\7;\2\2\u0115\u0117\7L\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011b\3\2\2\2\u0118\u011a\5.\30\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7\4\2\2\u011f\61\3\2\2\2\u0120\u0121\5\60\31"+
		"\2\u0121\u0122\7\2\2\3\u0122\u012b\3\2\2\2\u0123\u0125\5.\30\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7\2\2\3\u012a\u0120\3\2"+
		"\2\2\u012a\u0126\3\2\2\2\u012b\63\3\2\2\2\36DPW^chn\u008c\u009d\u00a0"+
		"\u00a4\u00a7\u00b3\u00ba\u00c2\u00ca\u00d4\u00de\u00e0\u00eb\u00f1\u00fc"+
		"\u0106\u0108\u0116\u011b\u0126\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}