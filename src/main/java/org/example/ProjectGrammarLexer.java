package org.example;
// Generated from ProjectGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProjectGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, FILENAME=8, 
		STRING=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IDENTIFIER", "FILENAME", 
			"STRING", "WS"
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


	public ProjectGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProjectGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\nl\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u00069\b\u0006\n\u0006\f\u0006<\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0005\u0007@\b\u0007\n\u0007\f\u0007C\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007G\b\u0007\u000b\u0007\f\u0007"+
		"H\u0003\u0007K\b\u0007\u0001\u0007\u0001\u0007\u0004\u0007O\b\u0007\u000b"+
		"\u0007\f\u0007P\u0001\u0007\u0001\u0007\u0004\u0007U\b\u0007\u000b\u0007"+
		"\f\u0007V\u0003\u0007Y\b\u0007\u0003\u0007[\b\u0007\u0001\b\u0001\b\u0005"+
		"\b_\b\b\n\b\f\bb\t\b\u0001\b\u0001\b\u0001\t\u0004\tg\b\t\u000b\t\f\t"+
		"h\u0001\t\u0001\t\u0001`\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  u\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015"+
		"\u0001\u0000\u0000\u0000\u0003\u001a\u0001\u0000\u0000\u0000\u0005\u001c"+
		"\u0001\u0000\u0000\u0000\u0007\u001e\u0001\u0000\u0000\u0000\t%\u0001"+
		"\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000\r6\u0001\u0000\u0000"+
		"\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011\\\u0001\u0000\u0000\u0000"+
		"\u0013f\u0001\u0000\u0000\u0000\u0015\u0016\u0005r\u0000\u0000\u0016\u0017"+
		"\u0005o\u0000\u0000\u0017\u0018\u0005o\u0000\u0000\u0018\u0019\u0005t"+
		"\u0000\u0000\u0019\u0002\u0001\u0000\u0000\u0000\u001a\u001b\u0005{\u0000"+
		"\u0000\u001b\u0004\u0001\u0000\u0000\u0000\u001c\u001d\u0005}\u0000\u0000"+
		"\u001d\u0006\u0001\u0000\u0000\u0000\u001e\u001f\u0005s\u0000\u0000\u001f"+
		" \u0005c\u0000\u0000 !\u0005r\u0000\u0000!\"\u0005i\u0000\u0000\"#\u0005"+
		"p\u0000\u0000#$\u0005t\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005"+
		"n\u0000\u0000&\'\u0005p\u0000\u0000\'(\u0005m\u0000\u0000(\n\u0001\u0000"+
		"\u0000\u0000)*\u0005d\u0000\u0000*+\u0005e\u0000\u0000+,\u0005p\u0000"+
		"\u0000,-\u0005e\u0000\u0000-.\u0005n\u0000\u0000./\u0005d\u0000\u0000"+
		"/0\u0005e\u0000\u000001\u0005n\u0000\u000012\u0005c\u0000\u000023\u0005"+
		"i\u0000\u000034\u0005e\u0000\u000045\u0005s\u0000\u00005\f\u0001\u0000"+
		"\u0000\u00006:\u0007\u0000\u0000\u000079\u0007\u0001\u0000\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000=A\u0007\u0000\u0000\u0000>@\u0007\u0001\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BJ\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DF\u0005.\u0000\u0000EG\u0007\u0001\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IK\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000K[\u0001\u0000\u0000\u0000LN\u0005.\u0000\u0000MO\u0007"+
		"\u0001\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QX\u0001\u0000\u0000"+
		"\u0000RT\u0005.\u0000\u0000SU\u0007\u0001\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000Z=\u0001\u0000\u0000\u0000"+
		"ZL\u0001\u0000\u0000\u0000[\u0010\u0001\u0000\u0000\u0000\\`\u0005\'\u0000"+
		"\u0000]_\t\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ac\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005\'\u0000\u0000d\u0012\u0001"+
		"\u0000\u0000\u0000eg\u0007\u0002\u0000\u0000fe\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jk\u0006\t\u0000\u0000k\u0014\u0001\u0000"+
		"\u0000\u0000\u000b\u0000:AHJPVXZ`h\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}