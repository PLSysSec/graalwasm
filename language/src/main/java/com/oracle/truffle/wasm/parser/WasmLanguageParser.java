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
		RULE_call_instr = 16, RULE_call_instr_params = 17, RULE_call_instr_instr = 18, 
		RULE_call_instr_params_instr = 19, RULE_call_instr_results_instr = 20, 
		RULE_block_instr = 21, RULE_block_type = 22, RULE_block = 23, RULE_expr = 24, 
		RULE_expr1 = 25, RULE_call_expr_type = 26, RULE_call_expr_params = 27, 
		RULE_call_expr_results = 28, RULE_if_block = 29, RULE_instr_list = 30, 
		RULE_const_expr = 31, RULE_func = 32, RULE_func_fields = 33, RULE_func_fields_import = 34, 
		RULE_func_fields_import_result = 35, RULE_func_fields_body = 36, RULE_func_result_body = 37, 
		RULE_func_body = 38, RULE_offset = 39, RULE_elem = 40, RULE_table = 41, 
		RULE_table_fields = 42, RULE_data = 43, RULE_memory = 44, RULE_memory_fields = 45, 
		RULE_sglobal = 46, RULE_global_fields = 47, RULE_import_desc = 48, RULE_simport = 49, 
		RULE_inline_import = 50, RULE_export_desc = 51, RULE_export = 52, RULE_inline_export = 53, 
		RULE_type_ = 54, RULE_type_def = 55, RULE_start = 56, RULE_module_field = 57, 
		RULE_module_ = 58, RULE_script_module = 59, RULE_action = 60, RULE_assertion = 61, 
		RULE_cmd = 62, RULE_meta = 63, RULE_wconst = 64, RULE_const_list = 65, 
		RULE_script = 66, RULE_module = 67;
	public static final String[] ruleNames = {
		"wasmlanguage", "value", "name", "value_type", "elem_type", "global_type", 
		"def_type", "func_type", "table_type", "memory_type", "type_use", "literal", 
		"var", "bind_var", "instr", "plain_instr", "call_instr", "call_instr_params", 
		"call_instr_instr", "call_instr_params_instr", "call_instr_results_instr", 
		"block_instr", "block_type", "block", "expr", "expr1", "call_expr_type", 
		"call_expr_params", "call_expr_results", "if_block", "instr_list", "const_expr", 
		"func", "func_fields", "func_fields_import", "func_fields_import_result", 
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
		"'call'", "'call_indirect'", "'local.get'", "'local.set'", "'local.tee'", 
		"'global.get'", "'global.set'", null, null, null, null, null, null, null, 
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
			setState(136);
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
			setState(138);
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
			setState(140);
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
			setState(142);
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
			setState(144);
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
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				value_type();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(LPAR);
				setState(148);
				match(MUT);
				setState(149);
				value_type();
				setState(150);
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
			setState(154);
			match(LPAR);
			setState(155);
			match(FUNC);
			setState(156);
			func_type();
			setState(157);
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
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(159);
				match(LPAR);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(160);
					match(RESULT);
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(161);
						value_type();
						}
						}
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(167);
					match(PARAM);
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(168);
						value_type();
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(174);
					match(PARAM);
					setState(175);
					bind_var();
					setState(176);
					value_type();
					}
					break;
				}
				setState(180);
				match(RPAR);
				}
				}
				setState(185);
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
			setState(186);
			match(NAT);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(187);
				match(NAT);
				}
			}

			setState(190);
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
			setState(192);
			match(NAT);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT) {
				{
				setState(193);
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
			setState(196);
			match(LPAR);
			setState(197);
			match(TYPE);
			setState(198);
			var();
			setState(199);
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
			setState(201);
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
			setState(203);
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
			setState(205);
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
		public Plain_instrContext plain_instr() {
			return getRuleContext(Plain_instrContext.class,0);
		}
		public Call_instr_instrContext call_instr_instr() {
			return getRuleContext(Call_instr_instrContext.class,0);
		}
		public Block_instrContext block_instr() {
			return getRuleContext(Block_instrContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(211);
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
				setState(207);
				plain_instr();
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				call_instr_instr();
				}
				break;
			case BLOCK:
			case LOOP:
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				block_instr();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				expr();
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
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNREACHABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(UNREACHABLE);
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(NOP);
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(DROP);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(SELECT);
				}
				break;
			case BR:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				match(BR);
				setState(218);
				var();
				}
				break;
			case BR_IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				match(BR_IF);
				setState(220);
				var();
				}
				break;
			case BR_TABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				match(BR_TABLE);
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					var();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAT || _la==VAR );
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				match(RETURN);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(228);
				match(CALL);
				setState(229);
				var();
				}
				break;
			case LOCAL_GET:
				enterOuterAlt(_localctx, 10);
				{
				setState(230);
				match(LOCAL_GET);
				setState(231);
				var();
				}
				break;
			case LOCAL_SET:
				enterOuterAlt(_localctx, 11);
				{
				setState(232);
				match(LOCAL_SET);
				setState(233);
				var();
				}
				break;
			case LOCAL_TEE:
				enterOuterAlt(_localctx, 12);
				{
				setState(234);
				match(LOCAL_TEE);
				setState(235);
				var();
				}
				break;
			case GLOBAL_GET:
				enterOuterAlt(_localctx, 13);
				{
				setState(236);
				match(GLOBAL_GET);
				setState(237);
				var();
				}
				break;
			case GLOBAL_SET:
				enterOuterAlt(_localctx, 14);
				{
				setState(238);
				match(GLOBAL_SET);
				setState(239);
				var();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 15);
				{
				setState(240);
				match(LOAD);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(241);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(244);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 16);
				{
				setState(247);
				match(STORE);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_EQ_NAT) {
					{
					setState(248);
					match(OFFSET_EQ_NAT);
					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIGN_EQ_NAT) {
					{
					setState(251);
					match(ALIGN_EQ_NAT);
					}
				}

				}
				break;
			case MEMORY_SIZE:
				enterOuterAlt(_localctx, 17);
				{
				setState(254);
				match(MEMORY_SIZE);
				}
				break;
			case MEMORY_GROW:
				enterOuterAlt(_localctx, 18);
				{
				setState(255);
				match(MEMORY_GROW);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 19);
				{
				setState(256);
				match(CONST);
				setState(257);
				literal();
				}
				break;
			case TEST:
				enterOuterAlt(_localctx, 20);
				{
				setState(258);
				match(TEST);
				}
				break;
			case COMPARE:
				enterOuterAlt(_localctx, 21);
				{
				setState(259);
				match(COMPARE);
				}
				break;
			case UNARY:
				enterOuterAlt(_localctx, 22);
				{
				setState(260);
				match(UNARY);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 23);
				{
				setState(261);
				match(BINARY);
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 24);
				{
				setState(262);
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

	public static class Call_instrContext extends ParserRuleContext {
		public TerminalNode CALL_INDIRECT() { return getToken(WasmLanguageParser.CALL_INDIRECT, 0); }
		public Call_instr_paramsContext call_instr_params() {
			return getRuleContext(Call_instr_paramsContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Call_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_instr; }
	}

	public final Call_instrContext call_instr() throws RecognitionException {
		Call_instrContext _localctx = new Call_instrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_call_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(CALL_INDIRECT);
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(266);
				type_use();
				}
				break;
			}
			setState(269);
			call_instr_params();
			}
		}
		catch (RecognitionException re) {
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
		public Call_instr_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_instr_params; }
	}

	public final Call_instr_paramsContext call_instr_params() throws RecognitionException {
		Call_instr_paramsContext _localctx = new Call_instr_paramsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call_instr_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					match(LPAR);
					setState(272);
					match(PARAM);
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(273);
						value_type();
						}
						}
						setState(278);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(279);
					match(RPAR);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(285);
				match(LPAR);
				setState(286);
				match(RESULT);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(287);
					value_type();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(RPAR);
				}
				}
				setState(298);
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
		public TerminalNode CALL_INDIRECT() { return getToken(WasmLanguageParser.CALL_INDIRECT, 0); }
		public Call_instr_params_instrContext call_instr_params_instr() {
			return getRuleContext(Call_instr_params_instrContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Call_instr_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_instr_instr; }
	}

	public final Call_instr_instrContext call_instr_instr() throws RecognitionException {
		Call_instr_instrContext _localctx = new Call_instr_instrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_call_instr_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(CALL_INDIRECT);
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(300);
				type_use();
				}
				break;
			}
			setState(303);
			call_instr_params_instr();
			}
		}
		catch (RecognitionException re) {
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
		public Call_instr_params_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_instr_params_instr; }
	}

	public final Call_instr_params_instrContext call_instr_params_instr() throws RecognitionException {
		Call_instr_params_instrContext _localctx = new Call_instr_params_instrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_call_instr_params_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(LPAR);
					setState(306);
					match(PARAM);
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(307);
						value_type();
						}
						}
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(313);
					match(RPAR);
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(319);
			call_instr_results_instr();
			}
		}
		catch (RecognitionException re) {
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
		public Call_instr_results_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_instr_results_instr; }
	}

	public final Call_instr_results_instrContext call_instr_results_instr() throws RecognitionException {
		Call_instr_results_instrContext _localctx = new Call_instr_results_instrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call_instr_results_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(LPAR);
					setState(322);
					match(RESULT);
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(323);
						value_type();
						}
						}
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(329);
					match(RPAR);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(335);
			instr();
			}
		}
		catch (RecognitionException re) {
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==BLOCK || _la==LOOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(338);
					bind_var();
					}
				}

				setState(341);
				block();
				setState(342);
				match(END);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(343);
					bind_var();
					}
				}

				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(IF);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(347);
					bind_var();
					}
				}

				setState(350);
				block();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(351);
					match(ELSE);
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(352);
						bind_var();
						}
					}

					setState(355);
					instr_list();
					}
				}

				setState(358);
				match(END);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(359);
					bind_var();
					}
				}

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
			setState(364);
			match(LPAR);
			setState(365);
			match(RESULT);
			setState(366);
			value_type();
			setState(367);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(369);
				block_type();
				}
				break;
			}
			setState(372);
			instr_list();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAR() { return getToken(WasmLanguageParser.LPAR, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode RPAR() { return getToken(WasmLanguageParser.RPAR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LPAR);
			setState(375);
			expr1();
			setState(376);
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

	public static class Expr1Context extends ParserRuleContext {
		public Plain_instrContext plain_instr() {
			return getRuleContext(Plain_instrContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CALL_INDIRECT() { return getToken(WasmLanguageParser.CALL_INDIRECT, 0); }
		public Call_expr_typeContext call_expr_type() {
			return getRuleContext(Call_expr_typeContext.class,0);
		}
		public TerminalNode BLOCK() { return getToken(WasmLanguageParser.BLOCK, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Bind_varContext bind_var() {
			return getRuleContext(Bind_varContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(WasmLanguageParser.LOOP, 0); }
		public TerminalNode IF() { return getToken(WasmLanguageParser.IF, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr1);
		int _la;
		try {
			setState(402);
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
				setState(378);
				plain_instr();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(379);
					expr();
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CALL_INDIRECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(CALL_INDIRECT);
				setState(386);
				call_expr_type();
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(BLOCK);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(388);
					bind_var();
					}
				}

				setState(391);
				block();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				match(LOOP);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(393);
					bind_var();
					}
				}

				setState(396);
				block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				match(IF);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(398);
					bind_var();
					}
				}

				setState(401);
				if_block();
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

	public static class Call_expr_typeContext extends ParserRuleContext {
		public Call_expr_paramsContext call_expr_params() {
			return getRuleContext(Call_expr_paramsContext.class,0);
		}
		public Type_useContext type_use() {
			return getRuleContext(Type_useContext.class,0);
		}
		public Call_expr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr_type; }
	}

	public final Call_expr_typeContext call_expr_type() throws RecognitionException {
		Call_expr_typeContext _localctx = new Call_expr_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_call_expr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(404);
				type_use();
				}
				break;
			}
			setState(407);
			call_expr_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_expr_paramsContext extends ParserRuleContext {
		public Call_expr_resultsContext call_expr_results() {
			return getRuleContext(Call_expr_resultsContext.class,0);
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
		public Call_expr_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr_params; }
	}

	public final Call_expr_paramsContext call_expr_params() throws RecognitionException {
		Call_expr_paramsContext _localctx = new Call_expr_paramsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_call_expr_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(409);
					match(LPAR);
					setState(410);
					match(PARAM);
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(411);
						value_type();
						}
						}
						setState(416);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(417);
					match(RPAR);
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(423);
			call_expr_results();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_expr_resultsContext extends ParserRuleContext {
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Value_typeContext> value_type() {
			return getRuleContexts(Value_typeContext.class);
		}
		public Value_typeContext value_type(int i) {
			return getRuleContext(Value_typeContext.class,i);
		}
		public Call_expr_resultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr_results; }
	}

	public final Call_expr_resultsContext call_expr_results() throws RecognitionException {
		Call_expr_resultsContext _localctx = new Call_expr_resultsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_call_expr_results);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
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
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(439);
				expr();
				}
				}
				setState(444);
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

	public static class If_blockContext extends ParserRuleContext {
		public Block_typeContext block_type() {
			return getRuleContext(Block_typeContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(WasmLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(WasmLanguageParser.LPAR, i);
		}
		public TerminalNode THEN() { return getToken(WasmLanguageParser.THEN, 0); }
		public List<Instr_listContext> instr_list() {
			return getRuleContexts(Instr_listContext.class);
		}
		public Instr_listContext instr_list(int i) {
			return getRuleContext(Instr_listContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(WasmLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(WasmLanguageParser.RPAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(WasmLanguageParser.ELSE, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_block);
		int _la;
		try {
			int _alt;
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				block_type();
				setState(446);
				if_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(448);
						expr();
						}
						} 
					}
					setState(453);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(454);
				match(LPAR);
				setState(455);
				match(THEN);
				setState(456);
				instr_list();
				setState(457);
				match(RPAR);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(458);
					match(LPAR);
					setState(459);
					match(ELSE);
					setState(460);
					instr_list();
					setState(461);
					match(RPAR);
					}
				}

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

	public static class Instr_listContext extends ParserRuleContext {
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Call_instrContext call_instr() {
			return getRuleContext(Call_instrContext.class,0);
		}
		public Instr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_list; }
	}

	public final Instr_listContext instr_list() throws RecognitionException {
		Instr_listContext _localctx = new Instr_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_instr_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					instr();
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CALL_INDIRECT) {
				{
				setState(473);
				call_instr();
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
		enterRule(_localctx, 62, RULE_const_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			instr_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(LPAR);
			setState(479);
			match(FUNC);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(480);
				bind_var();
				}
			}

			setState(483);
			func_fields();
			setState(484);
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
		enterRule(_localctx, 66, RULE_func_fields);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(486);
					type_use();
					}
					break;
				}
				setState(489);
				func_fields_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				inline_import();
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(491);
					type_use();
					}
					break;
				}
				setState(494);
				func_fields_import();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				inline_export();
				setState(497);
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
		enterRule(_localctx, 68, RULE_func_fields_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(501);
				match(LPAR);
				setState(502);
				match(PARAM);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(503);
					value_type();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(509);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(510);
				match(LPAR);
				setState(511);
				match(PARAM);
				setState(512);
				bind_var();
				setState(513);
				value_type();
				setState(514);
				match(RPAR);
				}
				break;
			}
			setState(518);
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
		enterRule(_localctx, 70, RULE_func_fields_import_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(520);
				match(LPAR);
				setState(521);
				match(RESULT);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VALUE_TYPE) {
					{
					{
					setState(522);
					value_type();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
				match(RPAR);
				}
				}
				setState(533);
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
		public Func_fields_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_fields_body; }
	}

	public final Func_fields_bodyContext func_fields_body() throws RecognitionException {
		Func_fields_bodyContext _localctx = new Func_fields_bodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_func_fields_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(534);
						match(LPAR);
						setState(535);
						match(PARAM);
						setState(539);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(536);
							value_type();
							}
							}
							setState(541);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(542);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(543);
						match(LPAR);
						setState(544);
						match(PARAM);
						setState(545);
						bind_var();
						setState(546);
						value_type();
						setState(547);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(554);
			func_result_body();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_func_result_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(LPAR);
					setState(557);
					match(RESULT);
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALUE_TYPE) {
						{
						{
						setState(558);
						value_type();
						}
						}
						setState(563);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(564);
					match(RPAR);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(570);
			func_body();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(587);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(572);
						match(LPAR);
						setState(573);
						match(LOCAL);
						setState(577);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==VALUE_TYPE) {
							{
							{
							setState(574);
							value_type();
							}
							}
							setState(579);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(580);
						match(RPAR);
						}
						break;
					case 2:
						{
						setState(581);
						match(LPAR);
						setState(582);
						match(LOCAL);
						setState(583);
						bind_var();
						setState(584);
						value_type();
						setState(585);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(592);
			instr_list();
			}
		}
		catch (RecognitionException re) {
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_offset);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(LPAR);
				setState(595);
				match(OFFSET);
				setState(596);
				const_expr();
				setState(597);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				expr();
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
		enterRule(_localctx, 80, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(LPAR);
			setState(603);
			match(ELEM);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(604);
				var();
				}
			}

			setState(607);
			offset();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAT || _la==VAR) {
				{
				{
				setState(608);
				var();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
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
		enterRule(_localctx, 82, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(LPAR);
			setState(617);
			match(TABLE);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(618);
				bind_var();
				}
			}

			setState(621);
			table_fields();
			setState(622);
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
		enterRule(_localctx, 84, RULE_table_fields);
		int _la;
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				table_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				inline_import();
				setState(626);
				table_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				inline_export();
				setState(629);
				table_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(631);
				elem_type();
				setState(632);
				match(LPAR);
				setState(633);
				match(ELEM);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAT || _la==VAR) {
					{
					{
					setState(634);
					var();
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(640);
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
		enterRule(_localctx, 86, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(LPAR);
			setState(645);
			match(DATA);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAT || _la==VAR) {
				{
				setState(646);
				var();
				}
			}

			setState(649);
			offset();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(650);
				match(STRING);
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 88, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(LPAR);
			setState(659);
			match(MEMORY);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(660);
				bind_var();
				}
			}

			setState(663);
			memory_fields();
			setState(664);
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
		enterRule(_localctx, 90, RULE_memory_fields);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				memory_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				inline_import();
				setState(668);
				memory_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				inline_export();
				setState(671);
				memory_fields();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(LPAR);
				setState(674);
				match(DATA);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(675);
					match(STRING);
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
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
		enterRule(_localctx, 92, RULE_sglobal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(LPAR);
			setState(685);
			match(GLOBAL);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(686);
				bind_var();
				}
			}

			setState(689);
			global_fields();
			setState(690);
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
		enterRule(_localctx, 94, RULE_global_fields);
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				global_type();
				setState(693);
				const_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				inline_import();
				setState(696);
				global_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				inline_export();
				setState(699);
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
		enterRule(_localctx, 96, RULE_import_desc);
		int _la;
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(LPAR);
				setState(704);
				match(FUNC);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(705);
					bind_var();
					}
				}

				setState(708);
				type_use();
				setState(709);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				match(LPAR);
				setState(712);
				match(FUNC);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(713);
					bind_var();
					}
				}

				setState(716);
				func_type();
				setState(717);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				match(LPAR);
				setState(720);
				match(TABLE);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(721);
					bind_var();
					}
				}

				setState(724);
				table_type();
				setState(725);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				match(LPAR);
				setState(728);
				match(MEMORY);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(729);
					bind_var();
					}
				}

				setState(732);
				memory_type();
				setState(733);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(735);
				match(LPAR);
				setState(736);
				match(GLOBAL);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(737);
					bind_var();
					}
				}

				setState(740);
				global_type();
				setState(741);
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
		enterRule(_localctx, 98, RULE_simport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(LPAR);
			setState(746);
			match(IMPORT);
			setState(747);
			name();
			setState(748);
			name();
			setState(749);
			import_desc();
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
		enterRule(_localctx, 100, RULE_inline_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(LPAR);
			setState(753);
			match(IMPORT);
			setState(754);
			name();
			setState(755);
			name();
			setState(756);
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
		enterRule(_localctx, 102, RULE_export_desc);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(LPAR);
				setState(759);
				match(FUNC);
				setState(760);
				var();
				setState(761);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				match(LPAR);
				setState(764);
				match(TABLE);
				setState(765);
				var();
				setState(766);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				match(LPAR);
				setState(769);
				match(MEMORY);
				setState(770);
				var();
				setState(771);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				match(LPAR);
				setState(774);
				match(GLOBAL);
				setState(775);
				var();
				setState(776);
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
		enterRule(_localctx, 104, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(LPAR);
			setState(781);
			match(EXPORT);
			setState(782);
			name();
			setState(783);
			export_desc();
			setState(784);
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
		enterRule(_localctx, 106, RULE_inline_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(LPAR);
			setState(787);
			match(EXPORT);
			setState(788);
			name();
			setState(789);
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
		enterRule(_localctx, 108, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
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
		enterRule(_localctx, 110, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(LPAR);
			setState(794);
			match(TYPE);
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
			type_();
			setState(799);
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
		enterRule(_localctx, 112, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(LPAR);
			setState(802);
			match(START);
			setState(803);
			var();
			setState(804);
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
		enterRule(_localctx, 114, RULE_module_field);
		try {
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				type_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				sglobal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				memory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(811);
				elem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(812);
				data();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(813);
				start();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(814);
				simport();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(815);
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
		enterRule(_localctx, 116, RULE_module_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(LPAR);
			setState(819);
			match(MODULE);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(820);
				match(VAR);
				}
			}

			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(823);
				module_field();
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
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
		enterRule(_localctx, 118, RULE_script_module);
		int _la;
		try {
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				module_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				match(LPAR);
				setState(833);
				match(MODULE);
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(834);
					match(VAR);
					}
				}

				setState(837);
				_la = _input.LA(1);
				if ( !(_la==BIN || _la==QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(838);
					match(STRING);
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(844);
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
		enterRule(_localctx, 120, RULE_action);
		int _la;
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(LPAR);
				setState(848);
				match(INVOKE);
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(849);
					match(VAR);
					}
				}

				setState(852);
				name();
				setState(853);
				const_list();
				setState(854);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				match(LPAR);
				setState(857);
				match(GET);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(858);
					match(VAR);
					}
				}

				setState(861);
				name();
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
		enterRule(_localctx, 122, RULE_assertion);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				match(LPAR);
				setState(867);
				match(ASSERT_MALFORMED);
				setState(868);
				script_module();
				setState(869);
				match(STRING);
				setState(870);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				match(LPAR);
				setState(873);
				match(ASSERT_INVALID);
				setState(874);
				script_module();
				setState(875);
				match(STRING);
				setState(876);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				match(LPAR);
				setState(879);
				match(ASSERT_UNLINKABLE);
				setState(880);
				script_module();
				setState(881);
				match(STRING);
				setState(882);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(884);
				match(LPAR);
				setState(885);
				match(ASSERT_TRAP);
				setState(886);
				script_module();
				setState(887);
				match(STRING);
				setState(888);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(890);
				match(LPAR);
				setState(891);
				match(ASSERT_RETURN);
				setState(892);
				action();
				setState(893);
				const_list();
				setState(894);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(896);
				match(LPAR);
				setState(897);
				match(ASSERT_RETURN_CANONICAL_NAN);
				setState(898);
				action();
				setState(899);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(901);
				match(LPAR);
				setState(902);
				match(ASSERT_RETURN_ARITHMETIC_NAN);
				setState(903);
				action();
				setState(904);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(906);
				match(LPAR);
				setState(907);
				match(ASSERT_TRAP);
				setState(908);
				action();
				setState(909);
				match(STRING);
				setState(910);
				match(RPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(912);
				match(LPAR);
				setState(913);
				match(ASSERT_EXHAUSTION);
				setState(914);
				action();
				setState(915);
				match(STRING);
				setState(916);
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
		enterRule(_localctx, 124, RULE_cmd);
		int _la;
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				assertion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				script_module();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(923);
				match(LPAR);
				setState(924);
				match(REGISTER);
				setState(925);
				name();
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
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(931);
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
		enterRule(_localctx, 126, RULE_meta);
		int _la;
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(LPAR);
				setState(935);
				match(SCRIPT);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(936);
					match(VAR);
					}
				}

				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(939);
					cmd();
					}
					}
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(945);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(LPAR);
				setState(947);
				match(INPUT);
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(948);
					match(VAR);
					}
				}

				setState(951);
				match(STRING);
				setState(952);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				match(LPAR);
				setState(954);
				match(OUTPUT);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(955);
					match(VAR);
					}
				}

				setState(958);
				match(STRING);
				setState(959);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(960);
				match(LPAR);
				setState(961);
				match(OUTPUT);
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(962);
					match(VAR);
					}
				}

				setState(965);
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
		enterRule(_localctx, 128, RULE_wconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(LPAR);
			setState(969);
			match(CONST);
			setState(970);
			literal();
			setState(971);
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
		enterRule(_localctx, 130, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(973);
				wconst();
				}
				}
				setState(978);
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
		enterRule(_localctx, 132, RULE_script);
		int _la;
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(979);
					cmd();
					}
					}
					setState(984);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(985);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(987); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(986);
					module_field();
					}
					}
					setState(989); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				setState(991);
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
		enterRule(_localctx, 134, RULE_module);
		int _la;
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				module_();
				setState(996);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(998);
					module_field();
					}
					}
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1004);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u03f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\t\3\t\7\t\u00ac"+
		"\n\t\f\t\16\t\u00af\13\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\7\t\u00b8\n"+
		"\t\f\t\16\t\u00bb\13\t\3\n\3\n\5\n\u00bf\n\n\3\n\3\n\3\13\3\13\5\13\u00c5"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\5\20\u00d6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\6\21\u00e2\n\21\r\21\16\21\u00e3\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f5\n\21\3\21\5\21\u00f8"+
		"\n\21\3\21\3\21\5\21\u00fc\n\21\3\21\5\21\u00ff\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u010a\n\21\3\22\3\22\5\22\u010e\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\7\23\u0115\n\23\f\23\16\23\u0118\13\23\3\23"+
		"\7\23\u011b\n\23\f\23\16\23\u011e\13\23\3\23\3\23\3\23\7\23\u0123\n\23"+
		"\f\23\16\23\u0126\13\23\3\23\7\23\u0129\n\23\f\23\16\23\u012c\13\23\3"+
		"\24\3\24\5\24\u0130\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u0137\n\25\f\25"+
		"\16\25\u013a\13\25\3\25\7\25\u013d\n\25\f\25\16\25\u0140\13\25\3\25\3"+
		"\25\3\26\3\26\3\26\7\26\u0147\n\26\f\26\16\26\u014a\13\26\3\26\7\26\u014d"+
		"\n\26\f\26\16\26\u0150\13\26\3\26\3\26\3\27\3\27\5\27\u0156\n\27\3\27"+
		"\3\27\3\27\5\27\u015b\n\27\3\27\3\27\5\27\u015f\n\27\3\27\3\27\3\27\5"+
		"\27\u0164\n\27\3\27\5\27\u0167\n\27\3\27\3\27\5\27\u016b\n\27\5\27\u016d"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u0175\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\7\33\u017f\n\33\f\33\16\33\u0182\13\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0188\n\33\3\33\3\33\3\33\5\33\u018d\n\33\3\33\3\33\3"+
		"\33\5\33\u0192\n\33\3\33\5\33\u0195\n\33\3\34\5\34\u0198\n\34\3\34\3\34"+
		"\3\35\3\35\3\35\7\35\u019f\n\35\f\35\16\35\u01a2\13\35\3\35\7\35\u01a5"+
		"\n\35\f\35\16\35\u01a8\13\35\3\35\3\35\3\36\3\36\3\36\7\36\u01af\n\36"+
		"\f\36\16\36\u01b2\13\36\3\36\7\36\u01b5\n\36\f\36\16\36\u01b8\13\36\3"+
		"\36\7\36\u01bb\n\36\f\36\16\36\u01be\13\36\3\37\3\37\3\37\3\37\7\37\u01c4"+
		"\n\37\f\37\16\37\u01c7\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u01d2\n\37\5\37\u01d4\n\37\3 \7 \u01d7\n \f \16 \u01da\13 \3"+
		" \5 \u01dd\n \3!\3!\3\"\3\"\3\"\5\"\u01e4\n\"\3\"\3\"\3\"\3#\5#\u01ea"+
		"\n#\3#\3#\3#\5#\u01ef\n#\3#\3#\3#\3#\3#\5#\u01f6\n#\3$\3$\3$\7$\u01fb"+
		"\n$\f$\16$\u01fe\13$\3$\3$\3$\3$\3$\3$\3$\5$\u0207\n$\3$\3$\3%\3%\3%\7"+
		"%\u020e\n%\f%\16%\u0211\13%\3%\7%\u0214\n%\f%\16%\u0217\13%\3&\3&\3&\7"+
		"&\u021c\n&\f&\16&\u021f\13&\3&\3&\3&\3&\3&\3&\3&\7&\u0228\n&\f&\16&\u022b"+
		"\13&\3&\3&\3\'\3\'\3\'\7\'\u0232\n\'\f\'\16\'\u0235\13\'\3\'\7\'\u0238"+
		"\n\'\f\'\16\'\u023b\13\'\3\'\3\'\3(\3(\3(\7(\u0242\n(\f(\16(\u0245\13"+
		"(\3(\3(\3(\3(\3(\3(\3(\7(\u024e\n(\f(\16(\u0251\13(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\5)\u025b\n)\3*\3*\3*\5*\u0260\n*\3*\3*\7*\u0264\n*\f*\16*\u0267"+
		"\13*\3*\3*\3+\3+\3+\5+\u026e\n+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\7,\u027e\n,\f,\16,\u0281\13,\3,\3,\5,\u0285\n,\3-\3-\3-\5-\u028a"+
		"\n-\3-\3-\7-\u028e\n-\f-\16-\u0291\13-\3-\3-\3.\3.\3.\5.\u0298\n.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u02a7\n/\f/\16/\u02aa\13/\3/\5/"+
		"\u02ad\n/\3\60\3\60\3\60\5\60\u02b2\n\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02c0\n\61\3\62\3\62\3\62\5\62\u02c5"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02cd\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u02d5\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02dd\n"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02e5\n\62\3\62\3\62\3\62\5\62"+
		"\u02ea\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u030d\n\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\39\39\39\59\u031f\n9\39\39\3"+
		"9\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0333\n;\3<\3<\3<\5"+
		"<\u0338\n<\3<\7<\u033b\n<\f<\16<\u033e\13<\3<\3<\3=\3=\3=\3=\5=\u0346"+
		"\n=\3=\3=\7=\u034a\n=\f=\16=\u034d\13=\3=\5=\u0350\n=\3>\3>\3>\5>\u0355"+
		"\n>\3>\3>\3>\3>\3>\3>\3>\5>\u035e\n>\3>\3>\3>\5>\u0363\n>\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\5?\u0399\n?\3@\3@\3@\3@\3@\3@\3@\5@\u03a2\n@\3@\3@\3@\5@\u03a7"+
		"\n@\3A\3A\3A\5A\u03ac\nA\3A\7A\u03af\nA\fA\16A\u03b2\13A\3A\3A\3A\3A\5"+
		"A\u03b8\nA\3A\3A\3A\3A\3A\5A\u03bf\nA\3A\3A\3A\3A\3A\5A\u03c6\nA\3A\5"+
		"A\u03c9\nA\3B\3B\3B\3B\3B\3C\7C\u03d1\nC\fC\16C\u03d4\13C\3D\7D\u03d7"+
		"\nD\fD\16D\u03da\13D\3D\3D\6D\u03de\nD\rD\16D\u03df\3D\3D\5D\u03e4\nD"+
		"\3E\3E\3E\3E\7E\u03ea\nE\fE\16E\u03ed\13E\3E\5E\u03f0\nE\3E\2\2F\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2\7\3\2\6\7\3\2\5"+
		"\7\4\2\5\5LL\3\2\20\21\3\2<=\2\u0455\2\u008a\3\2\2\2\4\u008c\3\2\2\2\6"+
		"\u008e\3\2\2\2\b\u0090\3\2\2\2\n\u0092\3\2\2\2\f\u009a\3\2\2\2\16\u009c"+
		"\3\2\2\2\20\u00b9\3\2\2\2\22\u00bc\3\2\2\2\24\u00c2\3\2\2\2\26\u00c6\3"+
		"\2\2\2\30\u00cb\3\2\2\2\32\u00cd\3\2\2\2\34\u00cf\3\2\2\2\36\u00d5\3\2"+
		"\2\2 \u0109\3\2\2\2\"\u010b\3\2\2\2$\u011c\3\2\2\2&\u012d\3\2\2\2(\u013e"+
		"\3\2\2\2*\u014e\3\2\2\2,\u016c\3\2\2\2.\u016e\3\2\2\2\60\u0174\3\2\2\2"+
		"\62\u0178\3\2\2\2\64\u0194\3\2\2\2\66\u0197\3\2\2\28\u01a6\3\2\2\2:\u01b6"+
		"\3\2\2\2<\u01d3\3\2\2\2>\u01d8\3\2\2\2@\u01de\3\2\2\2B\u01e0\3\2\2\2D"+
		"\u01f5\3\2\2\2F\u0206\3\2\2\2H\u0215\3\2\2\2J\u0229\3\2\2\2L\u0239\3\2"+
		"\2\2N\u024f\3\2\2\2P\u025a\3\2\2\2R\u025c\3\2\2\2T\u026a\3\2\2\2V\u0284"+
		"\3\2\2\2X\u0286\3\2\2\2Z\u0294\3\2\2\2\\\u02ac\3\2\2\2^\u02ae\3\2\2\2"+
		"`\u02bf\3\2\2\2b\u02e9\3\2\2\2d\u02eb\3\2\2\2f\u02f2\3\2\2\2h\u030c\3"+
		"\2\2\2j\u030e\3\2\2\2l\u0314\3\2\2\2n\u0319\3\2\2\2p\u031b\3\2\2\2r\u0323"+
		"\3\2\2\2t\u0332\3\2\2\2v\u0334\3\2\2\2x\u034f\3\2\2\2z\u0362\3\2\2\2|"+
		"\u0398\3\2\2\2~\u03a6\3\2\2\2\u0080\u03c8\3\2\2\2\u0082\u03ca\3\2\2\2"+
		"\u0084\u03d2\3\2\2\2\u0086\u03e3\3\2\2\2\u0088\u03ef\3\2\2\2\u008a\u008b"+
		"\5\u0088E\2\u008b\3\3\2\2\2\u008c\u008d\t\2\2\2\u008d\5\3\2\2\2\u008e"+
		"\u008f\7\b\2\2\u008f\7\3\2\2\2\u0090\u0091\7\t\2\2\u0091\t\3\2\2\2\u0092"+
		"\u0093\7\13\2\2\u0093\13\3\2\2\2\u0094\u009b\5\b\5\2\u0095\u0096\7\3\2"+
		"\2\u0096\u0097\7\f\2\2\u0097\u0098\5\b\5\2\u0098\u0099\7\4\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009b\r\3\2\2\2\u009c"+
		"\u009d\7\3\2\2\u009d\u009e\7.\2\2\u009e\u009f\5\20\t\2\u009f\u00a0\7\4"+
		"\2\2\u00a0\17\3\2\2\2\u00a1\u00b4\7\3\2\2\u00a2\u00a6\7\61\2\2\u00a3\u00a5"+
		"\5\b\5\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00b5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ad\7\60"+
		"\2\2\u00aa\u00ac\5\b\5\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b5\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\5\b\5\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\7\4\2\2\u00b7\u00a1\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\21\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\7\5\2\2\u00bd\u00bf\7\5\2\2\u00be\u00bd"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\n\6\2\u00c1"+
		"\23\3\2\2\2\u00c2\u00c4\7\5\2\2\u00c3\u00c5\7\5\2\2\u00c4\u00c3\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8"+
		"\7-\2\2\u00c8\u00c9\5\32\16\2\u00c9\u00ca\7\4\2\2\u00ca\27\3\2\2\2\u00cb"+
		"\u00cc\t\3\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\t\4\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d0\7L\2\2\u00d0\35\3\2\2\2\u00d1\u00d6\5 \21\2\u00d2\u00d6\5&\24\2"+
		"\u00d3\u00d6\5,\27\2\u00d4\u00d6\5\62\32\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\37\3\2\2\2\u00d7"+
		"\u010a\7\16\2\2\u00d8\u010a\7\r\2\2\u00d9\u010a\7\17\2\2\u00da\u010a\7"+
		"\32\2\2\u00db\u00dc\7\23\2\2\u00dc\u010a\5\32\16\2\u00dd\u00de\7\24\2"+
		"\2\u00de\u010a\5\32\16\2\u00df\u00e1\7\25\2\2\u00e0\u00e2\5\32\16\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u010a\3\2\2\2\u00e5\u010a\7\26\2\2\u00e6\u00e7\7\33\2\2\u00e7"+
		"\u010a\5\32\16\2\u00e8\u00e9\7\35\2\2\u00e9\u010a\5\32\16\2\u00ea\u00eb"+
		"\7\36\2\2\u00eb\u010a\5\32\16\2\u00ec\u00ed\7\37\2\2\u00ed\u010a\5\32"+
		"\16\2\u00ee\u00ef\7 \2\2\u00ef\u010a\5\32\16\2\u00f0\u00f1\7!\2\2\u00f1"+
		"\u010a\5\32\16\2\u00f2\u00f4\7\"\2\2\u00f3\u00f5\7$\2\2\u00f4\u00f3\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\7%\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u010a\3\2\2\2\u00f9\u00fb\7#"+
		"\2\2\u00fa\u00fc\7$\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00ff\7%\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u010a\3\2\2\2\u0100\u010a\7+\2\2\u0101\u010a\7,\2\2\u0102\u0103"+
		"\7\n\2\2\u0103\u010a\5\30\r\2\u0104\u010a\7(\2\2\u0105\u010a\7)\2\2\u0106"+
		"\u010a\7&\2\2\u0107\u010a\7\'\2\2\u0108\u010a\7*\2\2\u0109\u00d7\3\2\2"+
		"\2\u0109\u00d8\3\2\2\2\u0109\u00d9\3\2\2\2\u0109\u00da\3\2\2\2\u0109\u00db"+
		"\3\2\2\2\u0109\u00dd\3\2\2\2\u0109\u00df\3\2\2\2\u0109\u00e5\3\2\2\2\u0109"+
		"\u00e6\3\2\2\2\u0109\u00e8\3\2\2\2\u0109\u00ea\3\2\2\2\u0109\u00ec\3\2"+
		"\2\2\u0109\u00ee\3\2\2\2\u0109\u00f0\3\2\2\2\u0109\u00f2\3\2\2\2\u0109"+
		"\u00f9\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0102\3\2"+
		"\2\2\u0109\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a!\3\2\2\2\u010b\u010d\7\34\2\2"+
		"\u010c\u010e\5\26\f\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\5$\23\2\u0110#\3\2\2\2\u0111\u0112\7\3\2\2\u0112"+
		"\u0116\7\60\2\2\u0113\u0115\5\b\5\2\u0114\u0113\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\7\4\2\2\u011a\u0111\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u012a\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\7\3\2\2\u0120\u0124\7\61\2\2\u0121\u0123\5"+
		"\b\5\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\7\4"+
		"\2\2\u0128\u011f\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b%\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\7\34\2\2"+
		"\u012e\u0130\5\26\f\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\5(\25\2\u0132\'\3\2\2\2\u0133\u0134\7\3\2\2\u0134"+
		"\u0138\7\60\2\2\u0135\u0137\5\b\5\2\u0136\u0135\3\2\2\2\u0137\u013a\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013d\7\4\2\2\u013c\u0133\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0142\5*\26\2\u0142)\3\2\2\2\u0143\u0144\7\3\2\2"+
		"\u0144\u0148\7\61\2\2\u0145\u0147\5\b\5\2\u0146\u0145\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014d\7\4\2\2\u014c\u0143\3\2\2\2\u014d\u0150\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\5\36\20\2\u0152+\3\2\2\2\u0153\u0155\t\5\2"+
		"\2\u0154\u0156\5\34\17\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\5\60\31\2\u0158\u015a\7\22\2\2\u0159\u015b"+
		"\5\34\17\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u016d\3\2\2\2"+
		"\u015c\u015e\7\27\2\2\u015d\u015f\5\34\17\2\u015e\u015d\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0166\5\60\31\2\u0161\u0163\7"+
		"\31\2\2\u0162\u0164\5\34\17\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2"+
		"\u0164\u0165\3\2\2\2\u0165\u0167\5> \2\u0166\u0161\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\7\22\2\2\u0169\u016b\5\34\17"+
		"\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0153"+
		"\3\2\2\2\u016c\u015c\3\2\2\2\u016d-\3\2\2\2\u016e\u016f\7\3\2\2\u016f"+
		"\u0170\7\61\2\2\u0170\u0171\5\b\5\2\u0171\u0172\7\4\2\2\u0172/\3\2\2\2"+
		"\u0173\u0175\5.\30\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\5> \2\u0177\61\3\2\2\2\u0178\u0179\7\3\2\2\u0179"+
		"\u017a\5\64\33\2\u017a\u017b\7\4\2\2\u017b\63\3\2\2\2\u017c\u0180\5 \21"+
		"\2\u017d\u017f\5\62\32\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0195\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0184\7\34\2\2\u0184\u0195\5\66\34\2\u0185\u0187\7\20\2\2\u0186"+
		"\u0188\5\34\17\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3"+
		"\2\2\2\u0189\u0195\5\60\31\2\u018a\u018c\7\21\2\2\u018b\u018d\5\34\17"+
		"\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0195"+
		"\5\60\31\2\u018f\u0191\7\27\2\2\u0190\u0192\5\34\17\2\u0191\u0190\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\5<\37\2\u0194"+
		"\u017c\3\2\2\2\u0194\u0183\3\2\2\2\u0194\u0185\3\2\2\2\u0194\u018a\3\2"+
		"\2\2\u0194\u018f\3\2\2\2\u0195\65\3\2\2\2\u0196\u0198\5\26\f\2\u0197\u0196"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\58\35\2\u019a"+
		"\67\3\2\2\2\u019b\u019c\7\3\2\2\u019c\u01a0\7\60\2\2\u019d\u019f\5\b\5"+
		"\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\7\4\2\2\u01a4"+
		"\u019b\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\5:\36\2\u01aa"+
		"9\3\2\2\2\u01ab\u01ac\7\3\2\2\u01ac\u01b0\7\61\2\2\u01ad\u01af\5\b\5\2"+
		"\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\7\4\2\2\u01b4"+
		"\u01ab\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01bc\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\5\62\32\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd;\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5.\30\2\u01c0\u01c1"+
		"\5<\37\2\u01c1\u01d4\3\2\2\2\u01c2\u01c4\5\62\32\2\u01c3\u01c2\3\2\2\2"+
		"\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\3\2\2\u01c9\u01ca\7\30\2\2"+
		"\u01ca\u01cb\5> \2\u01cb\u01d1\7\4\2\2\u01cc\u01cd\7\3\2\2\u01cd\u01ce"+
		"\7\31\2\2\u01ce\u01cf\5> \2\u01cf\u01d0\7\4\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01cc\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01bf\3\2"+
		"\2\2\u01d3\u01c5\3\2\2\2\u01d4=\3\2\2\2\u01d5\u01d7\5\36\20\2\u01d6\u01d5"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\5\"\22\2\u01dc\u01db\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd?\3\2\2\2\u01de\u01df\5> \2\u01dfA\3\2"+
		"\2\2\u01e0\u01e1\7\3\2\2\u01e1\u01e3\7.\2\2\u01e2\u01e4\5\34\17\2\u01e3"+
		"\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\5D"+
		"#\2\u01e6\u01e7\7\4\2\2\u01e7C\3\2\2\2\u01e8\u01ea\5\26\f\2\u01e9\u01e8"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f6\5J&\2\u01ec"+
		"\u01ee\5f\64\2\u01ed\u01ef\5\26\f\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3"+
		"\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\5F$\2\u01f1\u01f6\3\2\2\2\u01f2"+
		"\u01f3\5l\67\2\u01f3\u01f4\5D#\2\u01f4\u01f6\3\2\2\2\u01f5\u01e9\3\2\2"+
		"\2\u01f5\u01ec\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f6E\3\2\2\2\u01f7\u01f8"+
		"\7\3\2\2\u01f8\u01fc\7\60\2\2\u01f9\u01fb\5\b\5\2\u01fa\u01f9\3\2\2\2"+
		"\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0207\7\4\2\2\u0200\u0201\7\3\2\2\u0201"+
		"\u0202\7\60\2\2\u0202\u0203\5\34\17\2\u0203\u0204\5\b\5\2\u0204\u0205"+
		"\7\4\2\2\u0205\u0207\3\2\2\2\u0206\u01f7\3\2\2\2\u0206\u0200\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0209\5H%\2\u0209G\3\2\2\2\u020a\u020b\7\3\2\2\u020b"+
		"\u020f\7\61\2\2\u020c\u020e\5\b\5\2\u020d\u020c\3\2\2\2\u020e\u0211\3"+
		"\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0214\7\4\2\2\u0213\u020a\3\2\2\2\u0214\u0217\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216I\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0218\u0219\7\3\2\2\u0219\u021d\7\60\2\2\u021a\u021c\5\b\5\2"+
		"\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0228\7\4\2\2\u0221"+
		"\u0222\7\3\2\2\u0222\u0223\7\60\2\2\u0223\u0224\5\34\17\2\u0224\u0225"+
		"\5\b\5\2\u0225\u0226\7\4\2\2\u0226\u0228\3\2\2\2\u0227\u0218\3\2\2\2\u0227"+
		"\u0221\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\5L\'\2\u022d"+
		"K\3\2\2\2\u022e\u022f\7\3\2\2\u022f\u0233\7\61\2\2\u0230\u0232\5\b\5\2"+
		"\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0238\7\4\2\2\u0237"+
		"\u022e\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\5N(\2\u023dM"+
		"\3\2\2\2\u023e\u023f\7\3\2\2\u023f\u0243\7\62\2\2\u0240\u0242\5\b\5\2"+
		"\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u024e\7\4\2\2\u0247"+
		"\u0248\7\3\2\2\u0248\u0249\7\62\2\2\u0249\u024a\5\34\17\2\u024a\u024b"+
		"\5\b\5\2\u024b\u024c\7\4\2\2\u024c\u024e\3\2\2\2\u024d\u023e\3\2\2\2\u024d"+
		"\u0247\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\5> \2\u0253O"+
		"\3\2\2\2\u0254\u0255\7\3\2\2\u0255\u0256\78\2\2\u0256\u0257\5@!\2\u0257"+
		"\u0258\7\4\2\2\u0258\u025b\3\2\2\2\u0259\u025b\5\62\32\2\u025a\u0254\3"+
		"\2\2\2\u025a\u0259\3\2\2\2\u025bQ\3\2\2\2\u025c\u025d\7\3\2\2\u025d\u025f"+
		"\7\66\2\2\u025e\u0260\5\32\16\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2"+
		"\2\u0260\u0261\3\2\2\2\u0261\u0265\5P)\2\u0262\u0264\5\32\16\2\u0263\u0262"+
		"\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\7\4\2\2\u0269S\3\2\2\2"+
		"\u026a\u026b\7\3\2\2\u026b\u026d\7\64\2\2\u026c\u026e\5\34\17\2\u026d"+
		"\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5V"+
		",\2\u0270\u0271\7\4\2\2\u0271U\3\2\2\2\u0272\u0285\5\22\n\2\u0273\u0274"+
		"\5f\64\2\u0274\u0275\5\22\n\2\u0275\u0285\3\2\2\2\u0276\u0277\5l\67\2"+
		"\u0277\u0278\5V,\2\u0278\u0285\3\2\2\2\u0279\u027a\5\n\6\2\u027a\u027b"+
		"\7\3\2\2\u027b\u027f\7\66\2\2\u027c\u027e\5\32\16\2\u027d\u027c\3\2\2"+
		"\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\7\4\2\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0272\3\2\2\2\u0284\u0273\3\2\2\2\u0284\u0276\3\2\2\2\u0284\u0279\3\2"+
		"\2\2\u0285W\3\2\2\2\u0286\u0287\7\3\2\2\u0287\u0289\7\67\2\2\u0288\u028a"+
		"\5\32\16\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2"+
		"\u028b\u028f\5P)\2\u028c\u028e\7\b\2\2\u028d\u028c\3\2\2\2\u028e\u0291"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0293\7\4\2\2\u0293Y\3\2\2\2\u0294\u0295\7\3\2\2"+
		"\u0295\u0297\7\65\2\2\u0296\u0298\5\34\17\2\u0297\u0296\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\5\\/\2\u029a\u029b\7\4"+
		"\2\2\u029b[\3\2\2\2\u029c\u02ad\5\24\13\2\u029d\u029e\5f\64\2\u029e\u029f"+
		"\5\24\13\2\u029f\u02ad\3\2\2\2\u02a0\u02a1\5l\67\2\u02a1\u02a2\5\\/\2"+
		"\u02a2\u02ad\3\2\2\2\u02a3\u02a4\7\3\2\2\u02a4\u02a8\7\67\2\2\u02a5\u02a7"+
		"\7\b\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\7\4"+
		"\2\2\u02ac\u029c\3\2\2\2\u02ac\u029d\3\2\2\2\u02ac\u02a0\3\2\2\2\u02ac"+
		"\u02a3\3\2\2\2\u02ad]\3\2\2\2\u02ae\u02af\7\3\2\2\u02af\u02b1\7\63\2\2"+
		"\u02b0\u02b2\5\34\17\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3"+
		"\3\2\2\2\u02b3\u02b4\5`\61\2\u02b4\u02b5\7\4\2\2\u02b5_\3\2\2\2\u02b6"+
		"\u02b7\5\f\7\2\u02b7\u02b8\5@!\2\u02b8\u02c0\3\2\2\2\u02b9\u02ba\5f\64"+
		"\2\u02ba\u02bb\5\f\7\2\u02bb\u02c0\3\2\2\2\u02bc\u02bd\5l\67\2\u02bd\u02be"+
		"\5`\61\2\u02be\u02c0\3\2\2\2\u02bf\u02b6\3\2\2\2\u02bf\u02b9\3\2\2\2\u02bf"+
		"\u02bc\3\2\2\2\u02c0a\3\2\2\2\u02c1\u02c2\7\3\2\2\u02c2\u02c4\7.\2\2\u02c3"+
		"\u02c5\5\34\17\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3"+
		"\2\2\2\u02c6\u02c7\5\26\f\2\u02c7\u02c8\7\4\2\2\u02c8\u02ea\3\2\2\2\u02c9"+
		"\u02ca\7\3\2\2\u02ca\u02cc\7.\2\2\u02cb\u02cd\5\34\17\2\u02cc\u02cb\3"+
		"\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\5\20\t\2\u02cf"+
		"\u02d0\7\4\2\2\u02d0\u02ea\3\2\2\2\u02d1\u02d2\7\3\2\2\u02d2\u02d4\7\64"+
		"\2\2\u02d3\u02d5\5\34\17\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d7\5\22\n\2\u02d7\u02d8\7\4\2\2\u02d8\u02ea\3"+
		"\2\2\2\u02d9\u02da\7\3\2\2\u02da\u02dc\7\65\2\2\u02db\u02dd\5\34\17\2"+
		"\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df"+
		"\5\24\13\2\u02df\u02e0\7\4\2\2\u02e0\u02ea\3\2\2\2\u02e1\u02e2\7\3\2\2"+
		"\u02e2\u02e4\7\63\2\2\u02e3\u02e5\5\34\17\2\u02e4\u02e3\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\5\f\7\2\u02e7\u02e8\7\4"+
		"\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02c1\3\2\2\2\u02e9\u02c9\3\2\2\2\u02e9"+
		"\u02d1\3\2\2\2\u02e9\u02d9\3\2\2\2\u02e9\u02e1\3\2\2\2\u02eac\3\2\2\2"+
		"\u02eb\u02ec\7\3\2\2\u02ec\u02ed\79\2\2\u02ed\u02ee\5\6\4\2\u02ee\u02ef"+
		"\5\6\4\2\u02ef\u02f0\5b\62\2\u02f0\u02f1\7\4\2\2\u02f1e\3\2\2\2\u02f2"+
		"\u02f3\7\3\2\2\u02f3\u02f4\79\2\2\u02f4\u02f5\5\6\4\2\u02f5\u02f6\5\6"+
		"\4\2\u02f6\u02f7\7\4\2\2\u02f7g\3\2\2\2\u02f8\u02f9\7\3\2\2\u02f9\u02fa"+
		"\7.\2\2\u02fa\u02fb\5\32\16\2\u02fb\u02fc\7\4\2\2\u02fc\u030d\3\2\2\2"+
		"\u02fd\u02fe\7\3\2\2\u02fe\u02ff\7\64\2\2\u02ff\u0300\5\32\16\2\u0300"+
		"\u0301\7\4\2\2\u0301\u030d\3\2\2\2\u0302\u0303\7\3\2\2\u0303\u0304\7\65"+
		"\2\2\u0304\u0305\5\32\16\2\u0305\u0306\7\4\2\2\u0306\u030d\3\2\2\2\u0307"+
		"\u0308\7\3\2\2\u0308\u0309\7\63\2\2\u0309\u030a\5\32\16\2\u030a\u030b"+
		"\7\4\2\2\u030b\u030d\3\2\2\2\u030c\u02f8\3\2\2\2\u030c\u02fd\3\2\2\2\u030c"+
		"\u0302\3\2\2\2\u030c\u0307\3\2\2\2\u030di\3\2\2\2\u030e\u030f\7\3\2\2"+
		"\u030f\u0310\7:\2\2\u0310\u0311\5\6\4\2\u0311\u0312\5h\65\2\u0312\u0313"+
		"\7\4\2\2\u0313k\3\2\2\2\u0314\u0315\7\3\2\2\u0315\u0316\7:\2\2\u0316\u0317"+
		"\5\6\4\2\u0317\u0318\7\4\2\2\u0318m\3\2\2\2\u0319\u031a\5\16\b\2\u031a"+
		"o\3\2\2\2\u031b\u031c\7\3\2\2\u031c\u031e\7-\2\2\u031d\u031f\5\34\17\2"+
		"\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321"+
		"\5n8\2\u0321\u0322\7\4\2\2\u0322q\3\2\2\2\u0323\u0324\7\3\2\2\u0324\u0325"+
		"\7/\2\2\u0325\u0326\5\32\16\2\u0326\u0327\7\4\2\2\u0327s\3\2\2\2\u0328"+
		"\u0333\5p9\2\u0329\u0333\5^\60\2\u032a\u0333\5T+\2\u032b\u0333\5Z.\2\u032c"+
		"\u0333\5B\"\2\u032d\u0333\5R*\2\u032e\u0333\5X-\2\u032f\u0333\5r:\2\u0330"+
		"\u0333\5d\63\2\u0331\u0333\5j\66\2\u0332\u0328\3\2\2\2\u0332\u0329\3\2"+
		"\2\2\u0332\u032a\3\2\2\2\u0332\u032b\3\2\2\2\u0332\u032c\3\2\2\2\u0332"+
		"\u032d\3\2\2\2\u0332\u032e\3\2\2\2\u0332\u032f\3\2\2\2\u0332\u0330\3\2"+
		"\2\2\u0332\u0331\3\2\2\2\u0333u\3\2\2\2\u0334\u0335\7\3\2\2\u0335\u0337"+
		"\7;\2\2\u0336\u0338\7L\2\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033c\3\2\2\2\u0339\u033b\5t;\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2"+
		"\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c"+
		"\3\2\2\2\u033f\u0340\7\4\2\2\u0340w\3\2\2\2\u0341\u0350\5v<\2\u0342\u0343"+
		"\7\3\2\2\u0343\u0345\7;\2\2\u0344\u0346\7L\2\2\u0345\u0344\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034b\t\6\2\2\u0348\u034a\7\b"+
		"\2\2\u0349\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0350\7\4"+
		"\2\2\u034f\u0341\3\2\2\2\u034f\u0342\3\2\2\2\u0350y\3\2\2\2\u0351\u0352"+
		"\7\3\2\2\u0352\u0354\7@\2\2\u0353\u0355\7L\2\2\u0354\u0353\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\5\6\4\2\u0357\u0358\5\u0084"+
		"C\2\u0358\u0359\7\4\2\2\u0359\u0363\3\2\2\2\u035a\u035b\7\3\2\2\u035b"+
		"\u035d\7A\2\2\u035c\u035e\7L\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2"+
		"\2\u035e\u035f\3\2\2\2\u035f\u0360\5\6\4\2\u0360\u0361\7\4\2\2\u0361\u0363"+
		"\3\2\2\2\u0362\u0351\3\2\2\2\u0362\u035a\3\2\2\2\u0363{\3\2\2\2\u0364"+
		"\u0365\7\3\2\2\u0365\u0366\7B\2\2\u0366\u0367\5x=\2\u0367\u0368\7\b\2"+
		"\2\u0368\u0369\7\4\2\2\u0369\u0399\3\2\2\2\u036a\u036b\7\3\2\2\u036b\u036c"+
		"\7C\2\2\u036c\u036d\5x=\2\u036d\u036e\7\b\2\2\u036e\u036f\7\4\2\2\u036f"+
		"\u0399\3\2\2\2\u0370\u0371\7\3\2\2\u0371\u0372\7D\2\2\u0372\u0373\5x="+
		"\2\u0373\u0374\7\b\2\2\u0374\u0375\7\4\2\2\u0375\u0399\3\2\2\2\u0376\u0377"+
		"\7\3\2\2\u0377\u0378\7H\2\2\u0378\u0379\5x=\2\u0379\u037a\7\b\2\2\u037a"+
		"\u037b\7\4\2\2\u037b\u0399\3\2\2\2\u037c\u037d\7\3\2\2\u037d\u037e\7E"+
		"\2\2\u037e\u037f\5z>\2\u037f\u0380\5\u0084C\2\u0380\u0381\7\4\2\2\u0381"+
		"\u0399\3\2\2\2\u0382\u0383\7\3\2\2\u0383\u0384\7F\2\2\u0384\u0385\5z>"+
		"\2\u0385\u0386\7\4\2\2\u0386\u0399\3\2\2\2\u0387\u0388\7\3\2\2\u0388\u0389"+
		"\7G\2\2\u0389\u038a\5z>\2\u038a\u038b\7\4\2\2\u038b\u0399\3\2\2\2\u038c"+
		"\u038d\7\3\2\2\u038d\u038e\7H\2\2\u038e\u038f\5z>\2\u038f\u0390\7\b\2"+
		"\2\u0390\u0391\7\4\2\2\u0391\u0399\3\2\2\2\u0392\u0393\7\3\2\2\u0393\u0394"+
		"\7I\2\2\u0394\u0395\5z>\2\u0395\u0396\7\b\2\2\u0396\u0397\7\4\2\2\u0397"+
		"\u0399\3\2\2\2\u0398\u0364\3\2\2\2\u0398\u036a\3\2\2\2\u0398\u0370\3\2"+
		"\2\2\u0398\u0376\3\2\2\2\u0398\u037c\3\2\2\2\u0398\u0382\3\2\2\2\u0398"+
		"\u0387\3\2\2\2\u0398\u038c\3\2\2\2\u0398\u0392\3\2\2\2\u0399}\3\2\2\2"+
		"\u039a\u03a7\5z>\2\u039b\u03a7\5|?\2\u039c\u03a7\5x=\2\u039d\u039e\7\3"+
		"\2\2\u039e\u039f\7?\2\2\u039f\u03a1\5\6\4\2\u03a0\u03a2\7L\2\2\u03a1\u03a0"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\7\4\2\2\u03a4"+
		"\u03a7\3\2\2\2\u03a5\u03a7\5\u0080A\2\u03a6\u039a\3\2\2\2\u03a6\u039b"+
		"\3\2\2\2\u03a6\u039c\3\2\2\2\u03a6\u039d\3\2\2\2\u03a6\u03a5\3\2\2\2\u03a7"+
		"\177\3\2\2\2\u03a8\u03a9\7\3\2\2\u03a9\u03ab\7>\2\2\u03aa\u03ac\7L\2\2"+
		"\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b0\3\2\2\2\u03ad\u03af"+
		"\5~@\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03c9\7\4"+
		"\2\2\u03b4\u03b5\7\3\2\2\u03b5\u03b7\7J\2\2\u03b6\u03b8\7L\2\2\u03b7\u03b6"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7\b\2\2\u03ba"+
		"\u03c9\7\4\2\2\u03bb\u03bc\7\3\2\2\u03bc\u03be\7K\2\2\u03bd\u03bf\7L\2"+
		"\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1"+
		"\7\b\2\2\u03c1\u03c9\7\4\2\2\u03c2\u03c3\7\3\2\2\u03c3\u03c5\7K\2\2\u03c4"+
		"\u03c6\7L\2\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2"+
		"\2\2\u03c7\u03c9\7\4\2\2\u03c8\u03a8\3\2\2\2\u03c8\u03b4\3\2\2\2\u03c8"+
		"\u03bb\3\2\2\2\u03c8\u03c2\3\2\2\2\u03c9\u0081\3\2\2\2\u03ca\u03cb\7\3"+
		"\2\2\u03cb\u03cc\7\n\2\2\u03cc\u03cd\5\30\r\2\u03cd\u03ce\7\4\2\2\u03ce"+
		"\u0083\3\2\2\2\u03cf\u03d1\5\u0082B\2\u03d0\u03cf\3\2\2\2\u03d1\u03d4"+
		"\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u0085\3\2\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d5\u03d7\5~@\2\u03d6\u03d5\3\2\2\2\u03d7\u03da\3\2\2"+
		"\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03d8"+
		"\3\2\2\2\u03db\u03e4\7\2\2\3\u03dc\u03de\5t;\2\u03dd\u03dc\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2"+
		"\2\2\u03e1\u03e2\7\2\2\3\u03e2\u03e4\3\2\2\2\u03e3\u03d8\3\2\2\2\u03e3"+
		"\u03dd\3\2\2\2\u03e4\u0087\3\2\2\2\u03e5\u03e6\5v<\2\u03e6\u03e7\7\2\2"+
		"\3\u03e7\u03f0\3\2\2\2\u03e8\u03ea\5t;\2\u03e9\u03e8\3\2\2\2\u03ea\u03ed"+
		"\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed"+
		"\u03eb\3\2\2\2\u03ee\u03f0\7\2\2\3\u03ef\u03e5\3\2\2\2\u03ef\u03eb\3\2"+
		"\2\2\u03f0\u0089\3\2\2\2o\u009a\u00a6\u00ad\u00b4\u00b9\u00be\u00c4\u00d5"+
		"\u00e3\u00f4\u00f7\u00fb\u00fe\u0109\u010d\u0116\u011c\u0124\u012a\u012f"+
		"\u0138\u013e\u0148\u014e\u0155\u015a\u015e\u0163\u0166\u016a\u016c\u0174"+
		"\u0180\u0187\u018c\u0191\u0194\u0197\u01a0\u01a6\u01b0\u01b6\u01bc\u01c5"+
		"\u01d1\u01d3\u01d8\u01dc\u01e3\u01e9\u01ee\u01f5\u01fc\u0206\u020f\u0215"+
		"\u021d\u0227\u0229\u0233\u0239\u0243\u024d\u024f\u025a\u025f\u0265\u026d"+
		"\u027f\u0284\u0289\u028f\u0297\u02a8\u02ac\u02b1\u02bf\u02c4\u02cc\u02d4"+
		"\u02dc\u02e4\u02e9\u030c\u031e\u0332\u0337\u033c\u0345\u034b\u034f\u0354"+
		"\u035d\u0362\u0398\u03a1\u03a6\u03ab\u03b0\u03b7\u03be\u03c5\u03c8\u03d2"+
		"\u03d8\u03df\u03e3\u03eb\u03ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}