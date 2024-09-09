package org.example;
// Generated from ProjectGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProjectGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, FILENAME=8, 
		STRING=9, WS=10;
	public static final int
		RULE_project = 0, RULE_directory = 1, RULE_file = 2, RULE_scriptSection = 3, 
		RULE_npmSection = 4, RULE_dependencies = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"project", "directory", "file", "scriptSection", "npmSection", "dependencies"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'root'", "'{'", "'}'", "'script'", "'npm'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTIFIER", "FILENAME", "STRING", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ProjectGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectContext extends ParserRuleContext {
		public List<DirectoryContext> directory() {
			return getRuleContexts(DirectoryContext.class);
		}
		public DirectoryContext directory(int i) {
			return getRuleContext(DirectoryContext.class,i);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public ScriptSectionContext scriptSection() {
			return getRuleContext(ScriptSectionContext.class,0);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitProject(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_project);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(T__1);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==FILENAME) {
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(14);
					directory();
					}
					break;
				case FILENAME:
					{
					setState(15);
					file();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(21);
				scriptSection();
				}
			}

			setState(24);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectoryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProjectGrammarParser.IDENTIFIER, 0); }
		public List<DirectoryContext> directory() {
			return getRuleContexts(DirectoryContext.class);
		}
		public DirectoryContext directory(int i) {
			return getRuleContext(DirectoryContext.class,i);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public DirectoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterDirectory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitDirectory(this);
		}
	}

	public final DirectoryContext directory() throws RecognitionException {
		DirectoryContext _localctx = new DirectoryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(IDENTIFIER);
			setState(27);
			match(T__1);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==FILENAME) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(28);
					directory();
					}
					break;
				case FILENAME:
					{
					setState(29);
					file();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(ProjectGrammarParser.FILENAME, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(FILENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptSectionContext extends ParserRuleContext {
		public NpmSectionContext npmSection() {
			return getRuleContext(NpmSectionContext.class,0);
		}
		public ScriptSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterScriptSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitScriptSection(this);
		}
	}

	public final ScriptSectionContext scriptSection() throws RecognitionException {
		ScriptSectionContext _localctx = new ScriptSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__3);
			setState(40);
			match(T__1);
			setState(41);
			npmSection();
			setState(42);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NpmSectionContext extends ParserRuleContext {
		public DependenciesContext dependencies() {
			return getRuleContext(DependenciesContext.class,0);
		}
		public NpmSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_npmSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) {
				try {
					((ProjectGrammarListener)listener).enterNpmSection(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitNpmSection(this);
		}
	}

	public final NpmSectionContext npmSection() throws RecognitionException {
		NpmSectionContext _localctx = new NpmSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_npmSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__4);
			setState(45);
			match(T__1);
			setState(46);
			dependencies();
			setState(47);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DependenciesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ProjectGrammarParser.STRING, 0); }
		public DependenciesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).enterDependencies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectGrammarListener ) ((ProjectGrammarListener)listener).exitDependencies(this);
		}
	}

	public final DependenciesContext dependencies() throws RecognitionException {
		DependenciesContext _localctx = new DependenciesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dependencies);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__5);
			setState(50);
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

	public static final String _serializedATN =
		"\u0004\u0001\n5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0000\u0003\u0000"+
		"\u0017\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000"+
		"\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u00003\u0000\f\u0001\u0000"+
		"\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n1\u0001"+
		"\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\u0012\u0005\u0002\u0000"+
		"\u0000\u000e\u0011\u0003\u0002\u0001\u0000\u000f\u0011\u0003\u0004\u0002"+
		"\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u000f\u0001\u0000\u0000"+
		"\u0000\u0011\u0014\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000\u0000"+
		"\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0015\u0017\u0003\u0006\u0003"+
		"\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0003\u0000"+
		"\u0000\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0007\u0000"+
		"\u0000\u001b \u0005\u0002\u0000\u0000\u001c\u001f\u0003\u0002\u0001\u0000"+
		"\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 "+
		"\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0003\u0000\u0000$\u0003"+
		"\u0001\u0000\u0000\u0000%&\u0005\b\u0000\u0000&\u0005\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0004\u0000\u0000()\u0005\u0002\u0000\u0000)*\u0003\b"+
		"\u0004\u0000*+\u0005\u0003\u0000\u0000+\u0007\u0001\u0000\u0000\u0000"+
		",-\u0005\u0005\u0000\u0000-.\u0005\u0002\u0000\u0000./\u0003\n\u0005\u0000"+
		"/0\u0005\u0003\u0000\u00000\t\u0001\u0000\u0000\u000012\u0005\u0006\u0000"+
		"\u000023\u0005\t\u0000\u00003\u000b\u0001\u0000\u0000\u0000\u0005\u0010"+
		"\u0012\u0016\u001e ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}