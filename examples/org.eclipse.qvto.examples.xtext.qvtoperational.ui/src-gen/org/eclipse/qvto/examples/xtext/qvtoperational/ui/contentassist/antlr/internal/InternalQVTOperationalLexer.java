package org.eclipse.qvto.examples.xtext.qvtoperational.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQVTOperationalLexer extends Lexer {
    public static final int RULE_CMP_OP=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_ESCAPED_CHARACTER=17;
    public static final int T__25=25;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_ESCAPED_ID=7;
    public static final int RULE_DOUBLE_QUOTED_STRING=19;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_RESOLVE_KIND=14;
    public static final int RULE_SIMPLE_ID=6;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SINGLE_QUOTED_STRING=5;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_LETTER_CHARACTER=18;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RULE_UNARY_OP=16;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_RESOLVE_IN_KIND=13;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=4;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int RULE_SIMPLE_ITERATOR_OP=15;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=20;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_MULT_OP=11;
    public static final int T__49=49;
    public static final int RULE_ACCESS_OP=8;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_MULTI_ITERATOR_OP=12;
    public static final int RULE_SL_COMMENT=22;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_ASSIGN_OP=9;
    public static final int T__39=39;
    public static final int RULE_WS=23;

    // delegates
    // delegators

    public InternalQVTOperationalLexer() {;} 
    public InternalQVTOperationalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQVTOperationalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g"; }

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:11:7: ( 'datatype' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:11:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:12:7: ( '*' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:12:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:13:7: ( '-' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:14:7: ( 'not' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:14:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:15:7: ( '/' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:15:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:16:7: ( '+' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:16:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:17:7: ( '>' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:18:7: ( '<' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:18:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19:7: ( '>=' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:20:7: ( '<=' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:20:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:21:7: ( '=' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:22:7: ( '<>' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:22:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:23:7: ( 'and' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:23:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:24:7: ( 'or' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:24:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:25:7: ( 'xor' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:25:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:26:7: ( 'implies' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:26:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:27:7: ( '.' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:28:7: ( '->' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:28:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:29:7: ( 'Tuple' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:29:9: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:30:7: ( 'Boolean' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:30:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:31:7: ( 'Integer' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:31:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:32:7: ( 'Real' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:32:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:33:7: ( 'String' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:33:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:34:7: ( 'UnlimitedNatural' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:34:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:35:7: ( 'OclAny' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:35:9: 'OclAny'
            {
            match("OclAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:36:7: ( 'OclInvalid' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:36:9: 'OclInvalid'
            {
            match("OclInvalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:37:7: ( 'OclVoid' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:37:9: 'OclVoid'
            {
            match("OclVoid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:38:7: ( 'Set' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:38:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:39:7: ( 'Bag' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:39:9: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:40:7: ( 'Sequence' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:40:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:41:7: ( 'Collection' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:41:9: 'Collection'
            {
            match("Collection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:42:7: ( 'OrderedSet' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:42:9: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:43:7: ( ':=' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:43:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:44:7: ( '::=' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:44:9: '::='
            {
            match("::="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:45:7: ( 'metamodel' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:45:9: 'metamodel'
            {
            match("metamodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:46:7: ( 'package' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:46:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:47:7: ( 'in' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:47:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:48:7: ( 'out' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:48:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:49:7: ( 'inout' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:49:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:50:7: ( 'import' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:50:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:51:7: ( ';' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:51:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:52:7: ( 'from' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:52:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:53:7: ( ',' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:53:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:54:7: ( ':' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:54:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:55:7: ( '@' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:55:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:56:7: ( '{' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:56:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:57:7: ( '}' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:57:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:58:7: ( 'primitive' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:58:9: 'primitive'
            {
            match("primitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:59:7: ( 'exception' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:59:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:60:7: ( 'extends' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:60:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:61:7: ( 'class' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:61:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:62:7: ( 'opposites' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:62:9: 'opposites'
            {
            match("opposites"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:63:7: ( '~' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:63:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:64:7: ( '<<' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:64:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:65:7: ( '>>' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:65:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:66:7: ( '[' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:66:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:67:7: ( ']' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:67:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:68:7: ( '...' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:68:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:69:7: ( '(' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:69:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:70:7: ( ')' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:70:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:71:7: ( 'enum' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:71:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:72:7: ( 'tag' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:72:9: 'tag'
            {
            match("tag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:73:7: ( 'transformation' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:73:9: 'transformation'
            {
            match("transformation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:74:7: ( 'modeltype' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:74:9: 'modeltype'
            {
            match("modeltype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:75:7: ( 'uses' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:75:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:76:7: ( 'mapping' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:76:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:77:7: ( 'List' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:77:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:78:7: ( 'Dict' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:78:9: 'Dict'
            {
            match("Dict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:79:7: ( 'pre' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:79:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:80:7: ( 'return' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:80:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:81:7: ( '::' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:81:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:82:7: ( '..' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:82:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:83:7: ( 'invalid' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:83:9: 'invalid'
            {
            match("invalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:84:7: ( 'null' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:84:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:85:7: ( 'if' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:85:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:86:8: ( 'then' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:86:10: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:87:8: ( 'else' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:87:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:88:8: ( 'endif' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:88:10: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:89:8: ( 'let' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:89:10: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:90:8: ( 'self' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:90:10: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:91:8: ( 'blackbox' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:91:10: 'blackbox'
            {
            match("blackbox"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:92:8: ( 'abstract' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:92:10: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:93:8: ( 'static' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:93:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:94:8: ( 'composes' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:94:10: 'composes'
            {
            match("composes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:95:8: ( 'references' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:95:10: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:96:8: ( 'readonly' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:96:10: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:97:8: ( 'derived' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:97:10: 'derived'
            {
            match("derived"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:98:8: ( 'intermediate' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:98:10: 'intermediate'
            {
            match("intermediate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:99:8: ( 'true' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:99:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:100:8: ( 'false' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:100:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:101:8: ( '|' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:101:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "RULE_ACCESS_OP"
    public final void mRULE_ACCESS_OP() throws RecognitionException {
        try {
            int _type = RULE_ACCESS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19073:16: ( ( '.' | '->' | '!->' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19073:18: ( '.' | '->' | '!->' )
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19073:18: ( '.' | '->' | '!->' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt1=1;
                }
                break;
            case '-':
                {
                alt1=2;
                }
                break;
            case '!':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19073:19: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19073:23: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19073:28: '!->'
                    {
                    match("!->"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACCESS_OP"

    // $ANTLR start "RULE_ASSIGN_OP"
    public final void mRULE_ASSIGN_OP() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19075:16: ( ( ':=' | '::=' | '+=' | '-=' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19075:18: ( ':=' | '::=' | '+=' | '-=' )
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19075:18: ( ':=' | '::=' | '+=' | '-=' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case ':':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=1;
                }
                else if ( (LA2_1==':') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case '+':
                {
                alt2=3;
                }
                break;
            case '-':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19075:19: ':='
                    {
                    match(":="); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19075:24: '::='
                    {
                    match("::="); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19075:30: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19075:35: '-='
                    {
                    match("-="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN_OP"

    // $ANTLR start "RULE_CMP_OP"
    public final void mRULE_CMP_OP() throws RecognitionException {
        try {
            int _type = RULE_CMP_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:13: ( ( '=' | '==' | '<>' | '<' | '>' | '<=' | '>=' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:15: ( '=' | '==' | '<>' | '<' | '>' | '<=' | '>=' )
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:15: ( '=' | '==' | '<>' | '<' | '>' | '<=' | '>=' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:16: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:20: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:25: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:30: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:34: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:38: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 7 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19077:43: '>='
                    {
                    match(">="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CMP_OP"

    // $ANTLR start "RULE_MULT_OP"
    public final void mRULE_MULT_OP() throws RecognitionException {
        try {
            int _type = RULE_MULT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19079:14: ( ( '*' | '/' | '%' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19079:16: ( '*' | '/' | '%' )
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULT_OP"

    // $ANTLR start "RULE_MULTI_ITERATOR_OP"
    public final void mRULE_MULTI_ITERATOR_OP() throws RecognitionException {
        try {
            int _type = RULE_MULTI_ITERATOR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19081:24: ( 'forAll' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19081:26: 'forAll'
            {
            match("forAll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTI_ITERATOR_OP"

    // $ANTLR start "RULE_RESOLVE_IN_KIND"
    public final void mRULE_RESOLVE_IN_KIND() throws RecognitionException {
        try {
            int _type = RULE_RESOLVE_IN_KIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19083:22: ( ( 'resolveIn' | 'resolveoneIn' | 'invresolveIn' | 'invresolveoneIn' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19083:24: ( 'resolveIn' | 'resolveoneIn' | 'invresolveIn' | 'invresolveoneIn' )
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19083:24: ( 'resolveIn' | 'resolveoneIn' | 'invresolveIn' | 'invresolveoneIn' )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19083:25: 'resolveIn'
                    {
                    match("resolveIn"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19083:37: 'resolveoneIn'
                    {
                    match("resolveoneIn"); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19083:52: 'invresolveIn'
                    {
                    match("invresolveIn"); 


                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19083:67: 'invresolveoneIn'
                    {
                    match("invresolveoneIn"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RESOLVE_IN_KIND"

    // $ANTLR start "RULE_RESOLVE_KIND"
    public final void mRULE_RESOLVE_KIND() throws RecognitionException {
        try {
            int _type = RULE_RESOLVE_KIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19085:19: ( ( 'resolve' | 'resolveone' | 'invresolve' | 'invresolveone' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19085:21: ( 'resolve' | 'resolveone' | 'invresolve' | 'invresolveone' )
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19085:21: ( 'resolve' | 'resolveone' | 'invresolve' | 'invresolveone' )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19085:22: 'resolve'
                    {
                    match("resolve"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19085:32: 'resolveone'
                    {
                    match("resolveone"); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19085:45: 'invresolve'
                    {
                    match("invresolve"); 


                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19085:58: 'invresolveone'
                    {
                    match("invresolveone"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RESOLVE_KIND"

    // $ANTLR start "RULE_SIMPLE_ITERATOR_OP"
    public final void mRULE_SIMPLE_ITERATOR_OP() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_ITERATOR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:25: ( ( 'reject' | 'select' | 'collect' | 'exists' | 'one' | 'any' | 'isUnique' | 'collectNested' | 'sortedBy' | 'xselect' | 'xcollect' | 'selectOne' | 'collectOne' | 'collectselect' | 'collectselectOne' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:27: ( 'reject' | 'select' | 'collect' | 'exists' | 'one' | 'any' | 'isUnique' | 'collectNested' | 'sortedBy' | 'xselect' | 'xcollect' | 'selectOne' | 'collectOne' | 'collectselect' | 'collectselectOne' )
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:27: ( 'reject' | 'select' | 'collect' | 'exists' | 'one' | 'any' | 'isUnique' | 'collectNested' | 'sortedBy' | 'xselect' | 'xcollect' | 'selectOne' | 'collectOne' | 'collectselect' | 'collectselectOne' )
            int alt6=15;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:28: 'reject'
                    {
                    match("reject"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:37: 'select'
                    {
                    match("select"); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:46: 'collect'
                    {
                    match("collect"); 


                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:56: 'exists'
                    {
                    match("exists"); 


                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:65: 'one'
                    {
                    match("one"); 


                    }
                    break;
                case 6 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:71: 'any'
                    {
                    match("any"); 


                    }
                    break;
                case 7 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:77: 'isUnique'
                    {
                    match("isUnique"); 


                    }
                    break;
                case 8 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:88: 'collectNested'
                    {
                    match("collectNested"); 


                    }
                    break;
                case 9 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:104: 'sortedBy'
                    {
                    match("sortedBy"); 


                    }
                    break;
                case 10 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:115: 'xselect'
                    {
                    match("xselect"); 


                    }
                    break;
                case 11 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:125: 'xcollect'
                    {
                    match("xcollect"); 


                    }
                    break;
                case 12 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:136: 'selectOne'
                    {
                    match("selectOne"); 


                    }
                    break;
                case 13 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:148: 'collectOne'
                    {
                    match("collectOne"); 


                    }
                    break;
                case 14 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:161: 'collectselect'
                    {
                    match("collectselect"); 


                    }
                    break;
                case 15 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19087:177: 'collectselectOne'
                    {
                    match("collectselectOne"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_ITERATOR_OP"

    // $ANTLR start "RULE_UNARY_OP"
    public final void mRULE_UNARY_OP() throws RecognitionException {
        try {
            int _type = RULE_UNARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:15: ( ( '-' | 'not' | '#' | '##' | '*' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:17: ( '-' | 'not' | '#' | '##' | '*' )
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:17: ( '-' | 'not' | '#' | '##' | '*' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case '-':
                {
                alt7=1;
                }
                break;
            case 'n':
                {
                alt7=2;
                }
                break;
            case '#':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='#') ) {
                    alt7=4;
                }
                else {
                    alt7=3;}
                }
                break;
            case '*':
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:18: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:22: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:28: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:32: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19089:37: '*'
                    {
                    match('*'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNARY_OP"

    // $ANTLR start "RULE_ESCAPED_CHARACTER"
    public final void mRULE_ESCAPED_CHARACTER() throws RecognitionException {
        try {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19091:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19091:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHARACTER"

    // $ANTLR start "RULE_LETTER_CHARACTER"
    public final void mRULE_LETTER_CHARACTER() throws RecognitionException {
        try {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19093:32: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19093:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_CHARACTER"

    // $ANTLR start "RULE_DOUBLE_QUOTED_STRING"
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19095:27: ( '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19095:29: '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19095:33: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19095:34: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19095:57: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_QUOTED_STRING"

    // $ANTLR start "RULE_SINGLE_QUOTED_STRING"
    public final void mRULE_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19097:27: ( '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19097:29: '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19097:34: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19097:35: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19097:58: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_ML_SINGLE_QUOTED_STRING"
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19099:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19099:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19099:38: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19099:66: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("'/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_SIMPLE_ID"
    public final void mRULE_SIMPLE_ID() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19101:16: ( RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )* )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19101:18: RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            {
            mRULE_LETTER_CHARACTER(); 
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19101:40: ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_ID"

    // $ANTLR start "RULE_ESCAPED_ID"
    public final void mRULE_ESCAPED_ID() throws RecognitionException {
        try {
            int _type = RULE_ESCAPED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19103:17: ( '_' RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19103:19: '_' RULE_SINGLE_QUOTED_STRING
            {
            match('_'); 
            mRULE_SINGLE_QUOTED_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19105:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19105:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19105:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19105:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19107:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19107:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19107:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19107:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19109:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19111:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19113:16: ( . )
            // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:19113:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_ACCESS_OP | RULE_ASSIGN_OP | RULE_CMP_OP | RULE_MULT_OP | RULE_MULTI_ITERATOR_OP | RULE_RESOLVE_IN_KIND | RULE_RESOLVE_KIND | RULE_SIMPLE_ITERATOR_OP | RULE_UNARY_OP | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=110;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:34: T__29
                {
                mT__29(); 

                }
                break;
            case 6 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:40: T__30
                {
                mT__30(); 

                }
                break;
            case 7 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:46: T__31
                {
                mT__31(); 

                }
                break;
            case 8 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:52: T__32
                {
                mT__32(); 

                }
                break;
            case 9 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:58: T__33
                {
                mT__33(); 

                }
                break;
            case 10 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:64: T__34
                {
                mT__34(); 

                }
                break;
            case 11 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:70: T__35
                {
                mT__35(); 

                }
                break;
            case 12 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:76: T__36
                {
                mT__36(); 

                }
                break;
            case 13 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:82: T__37
                {
                mT__37(); 

                }
                break;
            case 14 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:88: T__38
                {
                mT__38(); 

                }
                break;
            case 15 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:94: T__39
                {
                mT__39(); 

                }
                break;
            case 16 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:100: T__40
                {
                mT__40(); 

                }
                break;
            case 17 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:106: T__41
                {
                mT__41(); 

                }
                break;
            case 18 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:112: T__42
                {
                mT__42(); 

                }
                break;
            case 19 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:118: T__43
                {
                mT__43(); 

                }
                break;
            case 20 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:124: T__44
                {
                mT__44(); 

                }
                break;
            case 21 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:130: T__45
                {
                mT__45(); 

                }
                break;
            case 22 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:136: T__46
                {
                mT__46(); 

                }
                break;
            case 23 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:142: T__47
                {
                mT__47(); 

                }
                break;
            case 24 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:148: T__48
                {
                mT__48(); 

                }
                break;
            case 25 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:154: T__49
                {
                mT__49(); 

                }
                break;
            case 26 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:160: T__50
                {
                mT__50(); 

                }
                break;
            case 27 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:166: T__51
                {
                mT__51(); 

                }
                break;
            case 28 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:172: T__52
                {
                mT__52(); 

                }
                break;
            case 29 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:178: T__53
                {
                mT__53(); 

                }
                break;
            case 30 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:184: T__54
                {
                mT__54(); 

                }
                break;
            case 31 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:190: T__55
                {
                mT__55(); 

                }
                break;
            case 32 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:196: T__56
                {
                mT__56(); 

                }
                break;
            case 33 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:202: T__57
                {
                mT__57(); 

                }
                break;
            case 34 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:208: T__58
                {
                mT__58(); 

                }
                break;
            case 35 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:214: T__59
                {
                mT__59(); 

                }
                break;
            case 36 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:220: T__60
                {
                mT__60(); 

                }
                break;
            case 37 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:226: T__61
                {
                mT__61(); 

                }
                break;
            case 38 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:232: T__62
                {
                mT__62(); 

                }
                break;
            case 39 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:238: T__63
                {
                mT__63(); 

                }
                break;
            case 40 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:244: T__64
                {
                mT__64(); 

                }
                break;
            case 41 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:250: T__65
                {
                mT__65(); 

                }
                break;
            case 42 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:256: T__66
                {
                mT__66(); 

                }
                break;
            case 43 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:262: T__67
                {
                mT__67(); 

                }
                break;
            case 44 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:268: T__68
                {
                mT__68(); 

                }
                break;
            case 45 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:274: T__69
                {
                mT__69(); 

                }
                break;
            case 46 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:280: T__70
                {
                mT__70(); 

                }
                break;
            case 47 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:286: T__71
                {
                mT__71(); 

                }
                break;
            case 48 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:292: T__72
                {
                mT__72(); 

                }
                break;
            case 49 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:298: T__73
                {
                mT__73(); 

                }
                break;
            case 50 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:304: T__74
                {
                mT__74(); 

                }
                break;
            case 51 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:310: T__75
                {
                mT__75(); 

                }
                break;
            case 52 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:316: T__76
                {
                mT__76(); 

                }
                break;
            case 53 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:322: T__77
                {
                mT__77(); 

                }
                break;
            case 54 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:328: T__78
                {
                mT__78(); 

                }
                break;
            case 55 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:334: T__79
                {
                mT__79(); 

                }
                break;
            case 56 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:340: T__80
                {
                mT__80(); 

                }
                break;
            case 57 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:346: T__81
                {
                mT__81(); 

                }
                break;
            case 58 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:352: T__82
                {
                mT__82(); 

                }
                break;
            case 59 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:358: T__83
                {
                mT__83(); 

                }
                break;
            case 60 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:364: T__84
                {
                mT__84(); 

                }
                break;
            case 61 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:370: T__85
                {
                mT__85(); 

                }
                break;
            case 62 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:376: T__86
                {
                mT__86(); 

                }
                break;
            case 63 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:382: T__87
                {
                mT__87(); 

                }
                break;
            case 64 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:388: T__88
                {
                mT__88(); 

                }
                break;
            case 65 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:394: T__89
                {
                mT__89(); 

                }
                break;
            case 66 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:400: T__90
                {
                mT__90(); 

                }
                break;
            case 67 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:406: T__91
                {
                mT__91(); 

                }
                break;
            case 68 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:412: T__92
                {
                mT__92(); 

                }
                break;
            case 69 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:418: T__93
                {
                mT__93(); 

                }
                break;
            case 70 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:424: T__94
                {
                mT__94(); 

                }
                break;
            case 71 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:430: T__95
                {
                mT__95(); 

                }
                break;
            case 72 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:436: T__96
                {
                mT__96(); 

                }
                break;
            case 73 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:442: T__97
                {
                mT__97(); 

                }
                break;
            case 74 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:448: T__98
                {
                mT__98(); 

                }
                break;
            case 75 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:454: T__99
                {
                mT__99(); 

                }
                break;
            case 76 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:460: T__100
                {
                mT__100(); 

                }
                break;
            case 77 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:467: T__101
                {
                mT__101(); 

                }
                break;
            case 78 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:474: T__102
                {
                mT__102(); 

                }
                break;
            case 79 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:481: T__103
                {
                mT__103(); 

                }
                break;
            case 80 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:488: T__104
                {
                mT__104(); 

                }
                break;
            case 81 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:495: T__105
                {
                mT__105(); 

                }
                break;
            case 82 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:502: T__106
                {
                mT__106(); 

                }
                break;
            case 83 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:509: T__107
                {
                mT__107(); 

                }
                break;
            case 84 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:516: T__108
                {
                mT__108(); 

                }
                break;
            case 85 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:523: T__109
                {
                mT__109(); 

                }
                break;
            case 86 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:530: T__110
                {
                mT__110(); 

                }
                break;
            case 87 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:537: T__111
                {
                mT__111(); 

                }
                break;
            case 88 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:544: T__112
                {
                mT__112(); 

                }
                break;
            case 89 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:551: T__113
                {
                mT__113(); 

                }
                break;
            case 90 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:558: T__114
                {
                mT__114(); 

                }
                break;
            case 91 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:565: T__115
                {
                mT__115(); 

                }
                break;
            case 92 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:572: RULE_ACCESS_OP
                {
                mRULE_ACCESS_OP(); 

                }
                break;
            case 93 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:587: RULE_ASSIGN_OP
                {
                mRULE_ASSIGN_OP(); 

                }
                break;
            case 94 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:602: RULE_CMP_OP
                {
                mRULE_CMP_OP(); 

                }
                break;
            case 95 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:614: RULE_MULT_OP
                {
                mRULE_MULT_OP(); 

                }
                break;
            case 96 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:627: RULE_MULTI_ITERATOR_OP
                {
                mRULE_MULTI_ITERATOR_OP(); 

                }
                break;
            case 97 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:650: RULE_RESOLVE_IN_KIND
                {
                mRULE_RESOLVE_IN_KIND(); 

                }
                break;
            case 98 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:671: RULE_RESOLVE_KIND
                {
                mRULE_RESOLVE_KIND(); 

                }
                break;
            case 99 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:689: RULE_SIMPLE_ITERATOR_OP
                {
                mRULE_SIMPLE_ITERATOR_OP(); 

                }
                break;
            case 100 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:713: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 101 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:727: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 102 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:753: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 103 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:779: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 104 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:808: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 105 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:823: RULE_ESCAPED_ID
                {
                mRULE_ESCAPED_ID(); 

                }
                break;
            case 106 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:839: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 107 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:848: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 108 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:864: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 109 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:880: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 110 :
                // ../org.eclipse.qvto.examples.xtext.qvtoperational.ui/src-gen/org/eclipse/qvto/examples/xtext/qvtoperational/ui/contentassist/antlr/internal/InternalQVTOperational.g:1:888: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA3_eotS =
        "\1\uffff\1\5\1\10\1\12\7\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\74\3\75\7\uffff";
    static final String DFA3_maxS =
        "\1\76\1\75\1\76\1\75\7\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\2\1\1\1\3\1\6\1\4\1\7\1\5";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\1\1\3",
            "\1\4",
            "\1\7\1\6",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    static class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "19077:15: ( '=' | '==' | '<>' | '<' | '>' | '<=' | '>=' )";
        }
    }
    static final String DFA4_eotS =
        "\26\uffff";
    static final String DFA4_eofS =
        "\26\uffff";
    static final String DFA4_minS =
        "\1\151\1\145\1\156\1\163\1\166\1\157\1\162\1\154\1\145\1\166\1"+
        "\163\1\145\1\157\1\111\1\154\2\uffff\1\166\1\145\1\111\2\uffff";
    static final String DFA4_maxS =
        "\1\162\1\145\1\156\1\163\1\166\1\157\1\162\1\154\1\145\1\166\1"+
        "\163\1\145\2\157\1\154\2\uffff\1\166\1\145\1\157\2\uffff";
    static final String DFA4_acceptS =
        "\17\uffff\1\1\1\2\3\uffff\1\3\1\4";
    static final String DFA4_specialS =
        "\26\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17\45\uffff\1\20",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24\45\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "19083:24: ( 'resolveIn' | 'resolveoneIn' | 'invresolveIn' | 'invresolveoneIn' )";
        }
    }
    static final String DFA5_eotS =
        "\15\uffff\1\20\5\uffff\1\25\2\uffff";
    static final String DFA5_eofS =
        "\26\uffff";
    static final String DFA5_minS =
        "\1\151\1\145\1\156\1\163\1\166\1\157\1\162\1\154\1\145\1\166\1"+
        "\163\1\145\2\157\1\154\2\uffff\1\166\1\145\1\157\2\uffff";
    static final String DFA5_maxS =
        "\1\162\1\145\1\156\1\163\1\166\1\157\1\162\1\154\1\145\1\166\1"+
        "\163\1\145\2\157\1\154\2\uffff\1\166\1\145\1\157\2\uffff";
    static final String DFA5_acceptS =
        "\17\uffff\1\2\1\1\3\uffff\1\4\1\3";
    static final String DFA5_specialS =
        "\26\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "19085:21: ( 'resolve' | 'resolveone' | 'invresolve' | 'invresolveone' )";
        }
    }
    static final String DFA6_eotS =
        "\24\uffff\1\27\3\uffff\1\34\10\uffff\1\43\2\uffff";
    static final String DFA6_eofS =
        "\44\uffff";
    static final String DFA6_minS =
        "\1\141\1\uffff\1\145\1\157\4\uffff\1\143\1\154\1\uffff\1\154\2"+
        "\uffff\1\145\1\154\1\143\1\145\1\164\1\143\1\117\1\164\2\uffff\1"+
        "\116\2\uffff\1\145\1\uffff\1\154\1\145\1\143\1\164\1\117\2\uffff";
    static final String DFA6_maxS =
        "\1\170\1\uffff\2\157\4\uffff\1\163\1\154\1\uffff\1\154\2\uffff"+
        "\1\145\1\154\1\143\1\145\1\164\1\143\1\117\1\164\2\uffff\1\163\2"+
        "\uffff\1\145\1\uffff\1\154\1\145\1\143\1\164\1\117\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\2\uffff\1\11\1\uffff\1\12"+
        "\1\13\10\uffff\1\14\1\2\1\uffff\1\10\1\15\1\uffff\1\3\5\uffff\1"+
        "\17\1\16";
    static final String DFA6_specialS =
        "\44\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\6\1\uffff\1\3\1\uffff\1\4\3\uffff\1\7\5\uffff\1\5\2\uffff"+
            "\1\1\1\2\4\uffff\1\10",
            "",
            "\1\11\11\uffff\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "\1\15\17\uffff\1\14",
            "\1\16",
            "",
            "\1\17",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\30",
            "",
            "",
            "\1\31\1\32\43\uffff\1\33",
            "",
            "",
            "\1\35",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "19087:27: ( 'reject' | 'select' | 'collect' | 'exists' | 'one' | 'any' | 'isUnique' | 'collectNested' | 'sortedBy' | 'xselect' | 'xcollect' | 'selectOne' | 'collectOne' | 'collectselect' | 'collectselectOne' )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\74\1\uffff\1\101\1\74\1\106\1\107\1\112\1\116\1\120"+
        "\4\74\1\137\10\74\1\155\2\74\1\uffff\1\74\4\uffff\2\74\5\uffff\10"+
        "\74\1\uffff\1\71\2\uffff\2\71\1\74\4\uffff\2\74\6\uffff\2\74\15"+
        "\uffff\2\74\1\u00a5\7\74\1\u00b0\1\u00b1\1\74\1\u00b4\1\uffff\13"+
        "\74\1\uffff\1\u00c3\1\uffff\5\74\1\uffff\3\74\4\uffff\5\74\5\uffff"+
        "\14\74\11\uffff\2\74\1\uffff\1\u00e9\1\74\3\uffff\1\u00eb\1\u00ec"+
        "\1\74\1\uffff\1\u00ee\1\74\1\u00ec\1\u00f0\6\74\2\uffff\1\74\2\uffff"+
        "\2\74\1\u00fc\3\74\1\u0100\5\74\3\uffff\5\74\1\u010e\14\74\1\u011b"+
        "\13\74\1\u0127\6\74\1\uffff\1\u012f\2\uffff\1\74\1\uffff\1\74\1"+
        "\uffff\13\74\1\uffff\1\74\1\u013e\1\74\1\uffff\7\74\1\uffff\5\74"+
        "\1\uffff\1\u014c\5\74\1\u0152\1\74\1\u0154\3\74\1\uffff\1\74\1\u0159"+
        "\1\u015a\1\u015b\1\u015c\1\u015d\5\74\1\uffff\1\u0163\6\74\1\uffff"+
        "\6\74\1\u0170\4\74\1\u0175\2\74\1\uffff\15\74\1\uffff\1\u0185\4"+
        "\74\1\uffff\1\u018a\1\uffff\1\u018b\3\74\5\uffff\5\74\1\uffff\13"+
        "\74\1\u019f\1\uffff\4\74\1\uffff\2\74\1\u01a6\2\74\1\u01a9\11\74"+
        "\1\uffff\1\u01b3\2\74\1\u00ec\2\uffff\3\74\1\u01b9\3\74\2\u00ec"+
        "\1\u01be\3\74\1\u01c2\2\74\1\u00ec\1\74\1\u01c6\1\uffff\1\u01c7"+
        "\3\74\1\u01cb\1\u01cc\1\uffff\2\74\1\uffff\1\74\1\u01d0\4\74\1\u01d5"+
        "\1\u01d6\1\74\1\uffff\1\74\1\u01d9\1\74\1\u00ec\1\74\1\uffff\2\74"+
        "\1\u01e3\1\74\1\uffff\2\74\1\u01e7\1\uffff\1\u01e8\1\74\1\u00ec"+
        "\2\uffff\2\74\1\u00ec\2\uffff\1\u01ec\2\74\1\uffff\4\74\2\uffff"+
        "\2\74\1\uffff\1\u01f5\5\74\1\u01fb\2\74\1\uffff\1\74\1\u00ec\1\u01ff"+
        "\2\uffff\1\u0200\2\74\1\uffff\4\74\1\u0207\1\u0208\1\u0209\1\u020a"+
        "\1\uffff\5\74\1\uffff\1\u0210\1\74\1\u00ec\2\uffff\1\u01e3\2\74"+
        "\1\u0216\1\u0217\1\u0218\4\uffff\1\74\1\u00ec\2\74\1\u021c\1\uffff"+
        "\1\u01e3\4\74\3\uffff\3\74\1\uffff\1\74\1\u0210\1\74\1\u0227\4\74"+
        "\1\u0210\1\u01e3\1\uffff\1\74\2\u00ec\4\74\1\u0233\1\u0210\2\74"+
        "\1\uffff\1\u0236\1\u00ec\1\uffff";
    static final String DFA18_eofS =
        "\u0237\uffff";
    static final String DFA18_minS =
        "\1\0\1\141\1\uffff\1\55\1\157\1\47\2\75\1\74\1\75\1\142\1\156\1"+
        "\143\1\146\1\56\1\165\1\141\1\156\2\145\1\156\1\143\1\157\1\72\2"+
        "\141\1\uffff\1\141\4\uffff\2\154\5\uffff\1\141\1\163\2\151\3\145"+
        "\1\154\1\uffff\1\55\2\uffff\2\0\1\47\4\uffff\1\164\1\162\6\uffff"+
        "\1\164\1\154\15\uffff\1\144\1\163\1\60\1\164\1\160\1\145\1\162\1"+
        "\145\1\157\1\160\2\60\1\125\1\56\1\uffff\1\160\1\157\1\147\1\164"+
        "\1\141\1\162\1\161\2\154\1\144\1\154\1\uffff\1\75\1\uffff\1\164"+
        "\1\144\1\160\1\143\1\145\1\uffff\1\157\1\154\1\162\4\uffff\1\143"+
        "\1\144\1\163\1\141\1\154\5\uffff\1\147\1\141\2\145\1\163\1\143\1"+
        "\141\1\164\1\154\1\141\1\162\1\141\11\uffff\1\141\1\151\1\uffff"+
        "\1\60\1\154\3\uffff\2\60\1\164\1\uffff\1\60\1\157\2\60\3\154\1\165"+
        "\1\141\1\145\2\uffff\1\156\2\uffff\2\154\1\60\1\145\1\154\1\151"+
        "\1\60\1\165\1\151\1\101\1\145\1\154\3\uffff\1\141\1\145\1\160\1"+
        "\153\1\155\1\60\1\155\1\163\1\101\2\145\1\163\1\155\1\151\1\145"+
        "\1\163\1\160\1\154\1\60\1\156\1\145\1\156\1\163\2\164\1\165\1\145"+
        "\1\144\1\157\1\145\1\60\1\145\2\164\1\143\1\164\1\166\1\uffff\1"+
        "\60\2\uffff\1\162\1\uffff\1\163\1\uffff\1\145\1\154\1\151\1\162"+
        "\1\164\1\154\1\145\1\162\1\151\2\145\1\uffff\1\147\1\60\1\156\1"+
        "\uffff\1\145\1\155\2\156\1\157\1\162\1\145\1\uffff\1\155\1\154\1"+
        "\151\1\141\1\151\1\uffff\1\60\1\145\1\154\1\160\1\156\1\164\1\60"+
        "\1\146\1\60\1\163\1\157\1\145\1\uffff\1\163\5\60\2\162\1\157\1\154"+
        "\1\143\1\uffff\1\60\1\143\1\151\1\145\1\153\1\171\1\145\1\uffff"+
        "\1\141\1\151\1\143\2\145\1\164\1\60\1\151\1\163\1\155\1\161\1\60"+
        "\1\141\1\145\1\uffff\1\147\1\156\1\151\1\171\1\166\1\151\1\145\1"+
        "\143\1\157\1\164\1\156\1\147\1\164\1\uffff\1\60\1\154\1\164\1\144"+
        "\1\163\1\uffff\1\60\1\uffff\1\60\1\163\1\143\1\146\5\uffff\1\156"+
        "\1\145\1\156\1\166\1\164\1\uffff\1\164\1\143\1\144\1\142\1\160\1"+
        "\144\1\143\2\164\1\143\1\163\1\60\1\uffff\1\144\1\157\1\145\1\165"+
        "\1\uffff\1\156\1\162\1\60\1\143\1\164\1\60\1\141\2\144\1\164\1\144"+
        "\1\171\1\147\1\145\1\151\1\uffff\1\60\1\151\1\163\1\60\2\uffff\1"+
        "\145\1\164\1\157\1\60\1\156\1\154\1\145\3\60\1\102\1\157\1\145\1"+
        "\60\1\164\1\145\1\60\1\164\1\60\1\uffff\1\60\1\154\1\144\1\145\2"+
        "\60\1\uffff\2\145\1\uffff\1\154\1\60\1\123\1\151\1\145\1\160\2\60"+
        "\1\166\1\uffff\1\157\1\60\1\163\1\60\1\162\1\uffff\1\143\1\171\1"+
        "\60\1\156\1\uffff\1\171\1\170\1\60\1\uffff\1\60\1\163\1\60\2\uffff"+
        "\1\166\1\151\1\60\2\uffff\1\60\1\144\1\151\1\uffff\1\145\1\157\1"+
        "\154\1\145\2\uffff\1\145\1\156\1\uffff\1\60\1\145\1\156\1\145\1"+
        "\155\1\145\1\60\2\156\1\uffff\1\145\2\60\2\uffff\1\60\1\145\1\141"+
        "\1\uffff\1\116\1\144\1\164\1\156\4\60\1\uffff\1\163\1\145\1\154"+
        "\1\141\1\163\1\uffff\1\60\1\145\1\60\2\uffff\1\60\1\164\1\141\3"+
        "\60\4\uffff\1\164\1\60\1\145\1\164\1\60\1\uffff\1\60\2\156\1\145"+
        "\1\164\3\uffff\1\145\1\143\1\151\1\uffff\1\156\1\60\1\145\1\60\1"+
        "\165\1\144\1\164\1\157\2\60\1\uffff\1\162\2\60\2\156\1\141\1\156"+
        "\2\60\1\154\1\145\1\uffff\2\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\145\1\uffff\1\76\1\165\1\52\1\75\2\76\1\75\1\156\1\165"+
        "\2\163\1\56\1\165\1\157\1\156\1\145\1\164\1\156\1\162\1\157\1\75"+
        "\1\157\1\162\1\uffff\1\162\4\uffff\1\170\1\157\5\uffff\1\162\1\163"+
        "\2\151\2\145\1\164\1\154\1\uffff\1\55\2\uffff\2\uffff\1\47\4\uffff"+
        "\1\164\1\162\6\uffff\1\164\1\154\15\uffff\1\171\1\163\1\172\1\164"+
        "\1\160\1\145\1\162\1\145\1\157\1\160\2\172\1\125\1\56\1\uffff\1"+
        "\160\1\157\1\147\1\164\1\141\1\162\1\164\2\154\1\144\1\154\1\uffff"+
        "\1\75\1\uffff\1\164\1\144\1\160\1\143\1\151\1\uffff\1\157\1\154"+
        "\1\162\4\uffff\1\164\1\165\1\163\1\141\1\155\5\uffff\1\147\1\165"+
        "\2\145\1\163\1\143\2\164\1\154\1\141\1\162\1\141\11\uffff\1\141"+
        "\1\151\1\uffff\1\172\1\154\3\uffff\2\172\1\164\1\uffff\1\172\1\157"+
        "\2\172\2\154\1\157\1\165\1\162\1\145\2\uffff\1\156\2\uffff\2\154"+
        "\1\172\1\145\1\154\1\151\1\172\1\165\1\151\1\126\1\145\1\154\3\uffff"+
        "\1\141\1\145\1\160\1\153\1\155\1\172\1\155\1\163\1\101\2\145\1\163"+
        "\1\155\1\151\1\145\1\163\1\160\1\154\1\172\1\156\1\145\1\156\1\163"+
        "\2\164\1\165\1\145\1\144\1\157\1\145\1\172\1\146\2\164\1\143\1\164"+
        "\1\166\1\uffff\1\172\2\uffff\1\162\1\uffff\1\163\1\uffff\1\145\1"+
        "\154\1\151\1\162\1\164\1\154\1\145\1\162\1\151\2\145\1\uffff\1\147"+
        "\1\172\1\156\1\uffff\1\145\1\155\2\156\1\157\1\162\1\145\1\uffff"+
        "\1\155\1\154\1\151\1\141\1\151\1\uffff\1\172\1\145\1\154\1\160\1"+
        "\156\1\164\1\172\1\146\1\172\1\163\1\157\1\145\1\uffff\1\163\5\172"+
        "\2\162\1\157\1\154\1\143\1\uffff\1\172\1\143\1\151\1\145\1\153\1"+
        "\171\1\145\1\uffff\1\141\1\151\1\143\2\145\1\164\1\172\1\151\1\163"+
        "\1\155\1\161\1\172\1\141\1\145\1\uffff\1\147\1\156\1\151\1\171\1"+
        "\166\1\151\1\145\1\143\1\157\1\164\1\156\1\147\1\164\1\uffff\1\172"+
        "\1\154\1\164\1\144\1\163\1\uffff\1\172\1\uffff\1\172\1\163\1\143"+
        "\1\146\5\uffff\1\156\1\145\1\156\1\166\1\164\1\uffff\1\164\1\143"+
        "\1\144\1\142\1\160\1\144\1\143\2\164\1\143\1\163\1\172\1\uffff\1"+
        "\144\1\157\1\145\1\165\1\uffff\1\156\1\162\1\172\1\143\1\164\1\172"+
        "\1\141\2\144\1\164\1\144\1\171\1\147\1\145\1\151\1\uffff\1\172\1"+
        "\151\1\163\1\172\2\uffff\1\145\1\164\1\157\1\172\1\156\1\154\1\145"+
        "\3\172\1\102\1\157\1\145\1\172\1\164\1\145\1\172\1\164\1\172\1\uffff"+
        "\1\172\1\154\1\144\1\145\2\172\1\uffff\2\145\1\uffff\1\154\1\172"+
        "\1\123\1\151\1\145\1\160\2\172\1\166\1\uffff\1\157\1\172\1\163\1"+
        "\172\1\162\1\uffff\1\143\1\171\1\172\1\156\1\uffff\1\171\1\170\1"+
        "\172\1\uffff\1\172\1\163\1\172\2\uffff\1\166\1\151\1\172\2\uffff"+
        "\1\172\1\144\1\151\1\uffff\1\145\1\157\1\154\1\145\2\uffff\1\145"+
        "\1\156\1\uffff\1\172\1\145\1\156\1\145\1\155\1\145\1\172\2\156\1"+
        "\uffff\1\145\2\172\2\uffff\1\172\1\145\1\141\1\uffff\1\116\1\144"+
        "\1\164\1\156\4\172\1\uffff\1\163\1\145\1\154\1\141\1\163\1\uffff"+
        "\1\172\1\145\1\172\2\uffff\1\172\1\164\1\141\3\172\4\uffff\1\164"+
        "\1\172\1\145\1\164\1\172\1\uffff\1\172\2\156\1\145\1\164\3\uffff"+
        "\1\145\1\143\1\151\1\uffff\1\156\1\172\1\145\1\172\1\165\1\144\1"+
        "\164\1\157\2\172\1\uffff\1\162\2\172\2\156\1\141\1\156\2\172\1\154"+
        "\1\145\1\uffff\2\172\1\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\27\uffff\1\51\1\uffff\1\53\1\55\1\56\1\57\2\uffff"+
        "\1\65\1\70\1\71\1\73\1\74\10\uffff\1\133\1\uffff\1\137\1\144\3\uffff"+
        "\1\150\1\152\1\155\1\156\2\uffff\1\150\1\2\1\22\1\135\1\154\1\3"+
        "\2\uffff\1\147\1\153\1\5\1\6\1\11\1\67\1\7\1\12\1\14\1\66\1\10\1"+
        "\136\1\13\16\uffff\1\21\13\uffff\1\41\1\uffff\1\54\5\uffff\1\51"+
        "\3\uffff\1\53\1\55\1\56\1\57\5\uffff\1\65\1\70\1\71\1\73\1\74\14"+
        "\uffff\1\133\1\134\1\137\1\144\1\145\1\146\1\151\1\152\1\155\2\uffff"+
        "\1\22\2\uffff\1\11\1\12\1\14\3\uffff\1\16\12\uffff\1\45\1\113\1"+
        "\uffff\1\72\1\110\14\uffff\1\41\1\42\1\107\45\uffff\1\4\1\uffff"+
        "\1\15\1\143\1\uffff\1\46\1\uffff\1\17\13\uffff\1\35\3\uffff\1\34"+
        "\7\uffff\1\42\5\uffff\1\105\14\uffff\1\76\13\uffff\1\117\7\uffff"+
        "\1\112\16\uffff\1\26\15\uffff\1\52\5\uffff\1\75\1\uffff\1\115\4"+
        "\uffff\1\131\1\114\1\101\1\103\1\104\5\uffff\1\120\14\uffff\1\47"+
        "\4\uffff\1\23\17\uffff\1\132\4\uffff\1\116\1\63\23\uffff\1\50\6"+
        "\uffff\1\27\2\uffff\1\31\11\uffff\1\140\5\uffff\1\106\4\uffff\1"+
        "\123\3\uffff\1\127\3\uffff\1\20\1\111\3\uffff\1\24\1\25\3\uffff"+
        "\1\33\4\uffff\1\102\1\44\2\uffff\1\62\11\uffff\1\142\3\uffff\1\1"+
        "\1\122\3\uffff\1\36\10\uffff\1\124\5\uffff\1\126\3\uffff\1\121\1"+
        "\64\6\uffff\1\43\1\100\1\60\1\61\5\uffff\1\141\5\uffff\1\32\1\40"+
        "\1\37\3\uffff\1\125\12\uffff\1\130\13\uffff\1\77\2\uffff\1\30";
    static final String DFA18_specialS =
        "\1\2\62\uffff\1\0\1\1\u0202\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\71\2\70\2\71\1\70\22\71\1\70\1\60\1\63\1\62\1\71\1\61\1"+
            "\71\1\64\1\45\1\46\1\2\1\6\1\34\1\3\1\16\1\5\12\67\1\27\1\32"+
            "\1\10\1\11\1\7\1\71\1\35\1\66\1\20\1\26\1\52\4\66\1\21\2\66"+
            "\1\51\2\66\1\25\2\66\1\22\1\23\1\17\1\24\5\66\1\43\1\71\1\44"+
            "\1\71\1\65\1\71\1\12\1\56\1\41\1\1\1\40\1\33\2\66\1\15\2\66"+
            "\1\54\1\30\1\4\1\13\1\31\1\66\1\53\1\55\1\47\1\50\2\66\1\14"+
            "\2\66\1\36\1\57\1\37\1\42\uff81\71",
            "\1\72\3\uffff\1\73",
            "",
            "\1\100\17\uffff\1\77\1\76",
            "\1\102\5\uffff\1\103",
            "\1\104\2\uffff\1\105",
            "\1\77",
            "\1\110\1\111",
            "\1\115\1\113\1\114",
            "\1\117",
            "\1\122\13\uffff\1\121",
            "\1\126\1\uffff\1\125\1\uffff\1\123\2\uffff\1\124",
            "\1\131\13\uffff\1\127\3\uffff\1\130",
            "\1\134\6\uffff\1\132\1\133\4\uffff\1\135",
            "\1\136",
            "\1\140",
            "\1\142\15\uffff\1\141",
            "\1\143",
            "\1\144",
            "\1\146\16\uffff\1\145",
            "\1\147",
            "\1\150\16\uffff\1\151",
            "\1\152",
            "\1\154\2\uffff\1\153",
            "\1\160\3\uffff\1\156\11\uffff\1\157",
            "\1\161\20\uffff\1\162",
            "",
            "\1\165\15\uffff\1\166\2\uffff\1\164",
            "",
            "",
            "",
            "",
            "\1\175\1\uffff\1\174\11\uffff\1\173",
            "\1\176\2\uffff\1\177",
            "",
            "",
            "",
            "",
            "",
            "\1\u0085\6\uffff\1\u0087\11\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d\11\uffff\1\u008f\4\uffff\1\u008e",
            "\1\u0090",
            "",
            "\1\u0092",
            "",
            "",
            "\0\u0095",
            "\0\u0096",
            "\1\u0097",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d",
            "\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a2\24\uffff\1\u00a3",
            "\1\u00a4",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\u00ad\4"+
            "\74\1\u00af\1\74\1\u00ae\4\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bc\2\uffff\1\u00bb",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c2",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c9\3\uffff\1\u00c8",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "",
            "",
            "\1\u00cd\5\uffff\1\u00cf\12\uffff\1\u00ce",
            "\1\u00d1\20\uffff\1\u00d0",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d5\1\u00d4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7\23\uffff\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00df\4\uffff\1\u00de\3\uffff\1\u00e1\10\uffff\1\u00e0"+
            "\1\u00dd",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00ea",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00ed",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00ef",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3\2\uffff\1\u00f4",
            "\1\u00f5",
            "\1\u00f6\20\uffff\1\u00f7",
            "\1\u00f8",
            "",
            "",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103\7\uffff\1\u0104\14\uffff\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0129\1\u0128",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u0130",
            "",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0153",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0176",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "",
            "",
            "",
            "",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01a7",
            "\1\u01a8",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01b4",
            "\1\u01b5",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\16\74\1\u01bd\13\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c3",
            "\1\u01c4",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c5",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\1\u01cf",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d7",
            "",
            "\1\u01d8",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01da",
            "\12\74\7\uffff\15\74\1\u01db\1\u01dc\13\74\4\uffff\1\74\1"+
            "\uffff\22\74\1\u01dd\7\74",
            "\1\u01de",
            "",
            "\1\u01df",
            "\1\u01e0",
            "\12\74\7\uffff\10\74\1\u01e1\21\74\4\uffff\1\74\1\uffff\16"+
            "\74\1\u01e2\13\74",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01e9",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u01ea",
            "\1\u01eb",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01ed",
            "\1\u01ee",
            "",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "",
            "",
            "\1\u01f3",
            "\1\u01f4",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01fc",
            "\1\u01fd",
            "",
            "\1\u01fe",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0201",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0211",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\12\74\7\uffff\10\74\1\u0212\21\74\4\uffff\1\74\1\uffff\16"+
            "\74\1\u0213\13\74",
            "\1\u0214",
            "\1\u0215",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "\1\u0219",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u021a",
            "\1\u021b",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\10\74\1\u021d\21\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "",
            "",
            "",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "",
            "\1\u0225",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0226",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\10\74\1\u022c\21\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u022d",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\16\74\1\u022e\13\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0234",
            "\1\u0235",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_ACCESS_OP | RULE_ASSIGN_OP | RULE_CMP_OP | RULE_MULT_OP | RULE_MULTI_ITERATOR_OP | RULE_RESOLVE_IN_KIND | RULE_RESOLVE_KIND | RULE_SIMPLE_ITERATOR_OP | RULE_UNARY_OP | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_51 = input.LA(1);

                        s = -1;
                        if ( ((LA18_51>='\u0000' && LA18_51<='\uFFFF')) ) {s = 149;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_52 = input.LA(1);

                        s = -1;
                        if ( ((LA18_52>='\u0000' && LA18_52<='\uFFFF')) ) {s = 150;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='d') ) {s = 1;}

                        else if ( (LA18_0=='*') ) {s = 2;}

                        else if ( (LA18_0=='-') ) {s = 3;}

                        else if ( (LA18_0=='n') ) {s = 4;}

                        else if ( (LA18_0=='/') ) {s = 5;}

                        else if ( (LA18_0=='+') ) {s = 6;}

                        else if ( (LA18_0=='>') ) {s = 7;}

                        else if ( (LA18_0=='<') ) {s = 8;}

                        else if ( (LA18_0=='=') ) {s = 9;}

                        else if ( (LA18_0=='a') ) {s = 10;}

                        else if ( (LA18_0=='o') ) {s = 11;}

                        else if ( (LA18_0=='x') ) {s = 12;}

                        else if ( (LA18_0=='i') ) {s = 13;}

                        else if ( (LA18_0=='.') ) {s = 14;}

                        else if ( (LA18_0=='T') ) {s = 15;}

                        else if ( (LA18_0=='B') ) {s = 16;}

                        else if ( (LA18_0=='I') ) {s = 17;}

                        else if ( (LA18_0=='R') ) {s = 18;}

                        else if ( (LA18_0=='S') ) {s = 19;}

                        else if ( (LA18_0=='U') ) {s = 20;}

                        else if ( (LA18_0=='O') ) {s = 21;}

                        else if ( (LA18_0=='C') ) {s = 22;}

                        else if ( (LA18_0==':') ) {s = 23;}

                        else if ( (LA18_0=='m') ) {s = 24;}

                        else if ( (LA18_0=='p') ) {s = 25;}

                        else if ( (LA18_0==';') ) {s = 26;}

                        else if ( (LA18_0=='f') ) {s = 27;}

                        else if ( (LA18_0==',') ) {s = 28;}

                        else if ( (LA18_0=='@') ) {s = 29;}

                        else if ( (LA18_0=='{') ) {s = 30;}

                        else if ( (LA18_0=='}') ) {s = 31;}

                        else if ( (LA18_0=='e') ) {s = 32;}

                        else if ( (LA18_0=='c') ) {s = 33;}

                        else if ( (LA18_0=='~') ) {s = 34;}

                        else if ( (LA18_0=='[') ) {s = 35;}

                        else if ( (LA18_0==']') ) {s = 36;}

                        else if ( (LA18_0=='(') ) {s = 37;}

                        else if ( (LA18_0==')') ) {s = 38;}

                        else if ( (LA18_0=='t') ) {s = 39;}

                        else if ( (LA18_0=='u') ) {s = 40;}

                        else if ( (LA18_0=='L') ) {s = 41;}

                        else if ( (LA18_0=='D') ) {s = 42;}

                        else if ( (LA18_0=='r') ) {s = 43;}

                        else if ( (LA18_0=='l') ) {s = 44;}

                        else if ( (LA18_0=='s') ) {s = 45;}

                        else if ( (LA18_0=='b') ) {s = 46;}

                        else if ( (LA18_0=='|') ) {s = 47;}

                        else if ( (LA18_0=='!') ) {s = 48;}

                        else if ( (LA18_0=='%') ) {s = 49;}

                        else if ( (LA18_0=='#') ) {s = 50;}

                        else if ( (LA18_0=='\"') ) {s = 51;}

                        else if ( (LA18_0=='\'') ) {s = 52;}

                        else if ( (LA18_0=='_') ) {s = 53;}

                        else if ( (LA18_0=='A'||(LA18_0>='E' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='K')||(LA18_0>='M' && LA18_0<='N')||(LA18_0>='P' && LA18_0<='Q')||(LA18_0>='V' && LA18_0<='Z')||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='q'||(LA18_0>='v' && LA18_0<='w')||(LA18_0>='y' && LA18_0<='z')) ) {s = 54;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 55;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 56;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='$'||LA18_0=='&'||LA18_0=='?'||LA18_0=='\\'||LA18_0=='^'||LA18_0=='`'||(LA18_0>='\u007F' && LA18_0<='\uFFFF')) ) {s = 57;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}