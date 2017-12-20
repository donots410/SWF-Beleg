package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER2", "RULE_VARIABLE2", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'|'", "'['", "']'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE2=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER2=5;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePrologdsl"
    // InternalMyDsl.g:53:1: entryRulePrologdsl : rulePrologdsl EOF ;
    public final void entryRulePrologdsl() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulePrologdsl EOF )
            // InternalMyDsl.g:55:1: rulePrologdsl EOF
            {
             before(grammarAccess.getPrologdslRule()); 
            pushFollow(FOLLOW_1);
            rulePrologdsl();

            state._fsp--;

             after(grammarAccess.getPrologdslRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrologdsl"


    // $ANTLR start "rulePrologdsl"
    // InternalMyDsl.g:62:1: rulePrologdsl : ( ( rule__Prologdsl__Group__0 ) ) ;
    public final void rulePrologdsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Prologdsl__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Prologdsl__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Prologdsl__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Prologdsl__Group__0 )
            {
             before(grammarAccess.getPrologdslAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Prologdsl__Group__0 )
            // InternalMyDsl.g:69:4: rule__Prologdsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrologdslAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrologdsl"


    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:78:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleProgram EOF )
            // InternalMyDsl.g:80:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:87:1: ruleProgram : ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) ) )
            // InternalMyDsl.g:92:2: ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) )
            {
            // InternalMyDsl.g:92:2: ( ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* ) )
            // InternalMyDsl.g:93:3: ( ( rule__Program__ClauseAssignment ) ) ( ( rule__Program__ClauseAssignment )* )
            {
            // InternalMyDsl.g:93:3: ( ( rule__Program__ClauseAssignment ) )
            // InternalMyDsl.g:94:4: ( rule__Program__ClauseAssignment )
            {
             before(grammarAccess.getProgramAccess().getClauseAssignment()); 
            // InternalMyDsl.g:95:4: ( rule__Program__ClauseAssignment )
            // InternalMyDsl.g:95:5: rule__Program__ClauseAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__ClauseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getClauseAssignment()); 

            }

            // InternalMyDsl.g:98:3: ( ( rule__Program__ClauseAssignment )* )
            // InternalMyDsl.g:99:4: ( rule__Program__ClauseAssignment )*
            {
             before(grammarAccess.getProgramAccess().getClauseAssignment()); 
            // InternalMyDsl.g:100:4: ( rule__Program__ClauseAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:100:5: rule__Program__ClauseAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__ClauseAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getClauseAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // InternalMyDsl.g:110:1: entryRuleExquery : ruleExquery EOF ;
    public final void entryRuleExquery() throws RecognitionException {
        try {
            // InternalMyDsl.g:111:1: ( ruleExquery EOF )
            // InternalMyDsl.g:112:1: ruleExquery EOF
            {
             before(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_1);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getExqueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // InternalMyDsl.g:119:1: ruleExquery : ( ( rule__Exquery__Group__0 ) ) ;
    public final void ruleExquery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:123:2: ( ( ( rule__Exquery__Group__0 ) ) )
            // InternalMyDsl.g:124:2: ( ( rule__Exquery__Group__0 ) )
            {
            // InternalMyDsl.g:124:2: ( ( rule__Exquery__Group__0 ) )
            // InternalMyDsl.g:125:3: ( rule__Exquery__Group__0 )
            {
             before(grammarAccess.getExqueryAccess().getGroup()); 
            // InternalMyDsl.g:126:3: ( rule__Exquery__Group__0 )
            // InternalMyDsl.g:126:4: rule__Exquery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // InternalMyDsl.g:135:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalMyDsl.g:136:1: ( ruleQuery EOF )
            // InternalMyDsl.g:137:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMyDsl.g:144:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:148:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalMyDsl.g:149:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalMyDsl.g:149:2: ( ( rule__Query__Group__0 ) )
            // InternalMyDsl.g:150:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalMyDsl.g:151:3: ( rule__Query__Group__0 )
            // InternalMyDsl.g:151:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleClause"
    // InternalMyDsl.g:160:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalMyDsl.g:161:1: ( ruleClause EOF )
            // InternalMyDsl.g:162:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalMyDsl.g:169:1: ruleClause : ( ( rule__Clause__Alternatives ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:173:2: ( ( ( rule__Clause__Alternatives ) ) )
            // InternalMyDsl.g:174:2: ( ( rule__Clause__Alternatives ) )
            {
            // InternalMyDsl.g:174:2: ( ( rule__Clause__Alternatives ) )
            // InternalMyDsl.g:175:3: ( rule__Clause__Alternatives )
            {
             before(grammarAccess.getClauseAccess().getAlternatives()); 
            // InternalMyDsl.g:176:3: ( rule__Clause__Alternatives )
            // InternalMyDsl.g:176:4: rule__Clause__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // InternalMyDsl.g:185:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalMyDsl.g:186:1: ( ruleFact EOF )
            // InternalMyDsl.g:187:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalMyDsl.g:194:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:2: ( ( ( rule__Fact__Group__0 ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__Fact__Group__0 ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__Fact__Group__0 ) )
            // InternalMyDsl.g:200:3: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // InternalMyDsl.g:201:3: ( rule__Fact__Group__0 )
            // InternalMyDsl.g:201:4: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:210:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:211:1: ( ruleRule EOF )
            // InternalMyDsl.g:212:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:219:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:225:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:226:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:226:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // InternalMyDsl.g:235:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalMyDsl.g:236:1: ( rulePredicate EOF )
            // InternalMyDsl.g:237:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMyDsl.g:244:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalMyDsl.g:249:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalMyDsl.g:249:2: ( ( rule__Predicate__Group__0 ) )
            // InternalMyDsl.g:250:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalMyDsl.g:251:3: ( rule__Predicate__Group__0 )
            // InternalMyDsl.g:251:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // InternalMyDsl.g:260:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // InternalMyDsl.g:261:1: ( ruleFunctor EOF )
            // InternalMyDsl.g:262:1: ruleFunctor EOF
            {
             before(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getFunctorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalMyDsl.g:269:1: ruleFunctor : ( ( rule__Functor__NameAssignment ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:2: ( ( ( rule__Functor__NameAssignment ) ) )
            // InternalMyDsl.g:274:2: ( ( rule__Functor__NameAssignment ) )
            {
            // InternalMyDsl.g:274:2: ( ( rule__Functor__NameAssignment ) )
            // InternalMyDsl.g:275:3: ( rule__Functor__NameAssignment )
            {
             before(grammarAccess.getFunctorAccess().getNameAssignment()); 
            // InternalMyDsl.g:276:3: ( rule__Functor__NameAssignment )
            // InternalMyDsl.g:276:4: rule__Functor__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Functor__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctorAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:285:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMyDsl.g:286:1: ( ruleTerm EOF )
            // InternalMyDsl.g:287:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:294:1: ruleTerm : ( ( rule__Term__TermAssignment ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:2: ( ( ( rule__Term__TermAssignment ) ) )
            // InternalMyDsl.g:299:2: ( ( rule__Term__TermAssignment ) )
            {
            // InternalMyDsl.g:299:2: ( ( rule__Term__TermAssignment ) )
            // InternalMyDsl.g:300:3: ( rule__Term__TermAssignment )
            {
             before(grammarAccess.getTermAccess().getTermAssignment()); 
            // InternalMyDsl.g:301:3: ( rule__Term__TermAssignment )
            // InternalMyDsl.g:301:4: rule__Term__TermAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Term__TermAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // InternalMyDsl.g:310:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalMyDsl.g:311:1: ( ruleAtom EOF )
            // InternalMyDsl.g:312:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalMyDsl.g:319:1: ruleAtom : ( ( rule__Atom__AtAssignment ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:2: ( ( ( rule__Atom__AtAssignment ) ) )
            // InternalMyDsl.g:324:2: ( ( rule__Atom__AtAssignment ) )
            {
            // InternalMyDsl.g:324:2: ( ( rule__Atom__AtAssignment ) )
            // InternalMyDsl.g:325:3: ( rule__Atom__AtAssignment )
            {
             before(grammarAccess.getAtomAccess().getAtAssignment()); 
            // InternalMyDsl.g:326:3: ( rule__Atom__AtAssignment )
            // InternalMyDsl.g:326:4: rule__Atom__AtAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atom__AtAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAtAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:335:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMyDsl.g:336:1: ( ruleList EOF )
            // InternalMyDsl.g:337:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:344:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalMyDsl.g:349:2: ( ( rule__List__Group__0 ) )
            {
            // InternalMyDsl.g:349:2: ( ( rule__List__Group__0 ) )
            // InternalMyDsl.g:350:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalMyDsl.g:351:3: ( rule__List__Group__0 )
            // InternalMyDsl.g:351:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleRest"
    // InternalMyDsl.g:360:1: entryRuleRest : ruleRest EOF ;
    public final void entryRuleRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:361:1: ( ruleRest EOF )
            // InternalMyDsl.g:362:1: ruleRest EOF
            {
             before(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            ruleRest();

            state._fsp--;

             after(grammarAccess.getRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMyDsl.g:369:1: ruleRest : ( ( rule__Rest__Alternatives ) ) ;
    public final void ruleRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:2: ( ( ( rule__Rest__Alternatives ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__Rest__Alternatives ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__Rest__Alternatives ) )
            // InternalMyDsl.g:375:3: ( rule__Rest__Alternatives )
            {
             before(grammarAccess.getRestAccess().getAlternatives()); 
            // InternalMyDsl.g:376:3: ( rule__Rest__Alternatives )
            // InternalMyDsl.g:376:4: rule__Rest__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rest__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleListOpt1"
    // InternalMyDsl.g:385:1: entryRuleListOpt1 : ruleListOpt1 EOF ;
    public final void entryRuleListOpt1() throws RecognitionException {
        try {
            // InternalMyDsl.g:386:1: ( ruleListOpt1 EOF )
            // InternalMyDsl.g:387:1: ruleListOpt1 EOF
            {
             before(grammarAccess.getListOpt1Rule()); 
            pushFollow(FOLLOW_1);
            ruleListOpt1();

            state._fsp--;

             after(grammarAccess.getListOpt1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOpt1"


    // $ANTLR start "ruleListOpt1"
    // InternalMyDsl.g:394:1: ruleListOpt1 : ( ( rule__ListOpt1__Group__0 ) ) ;
    public final void ruleListOpt1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:2: ( ( ( rule__ListOpt1__Group__0 ) ) )
            // InternalMyDsl.g:399:2: ( ( rule__ListOpt1__Group__0 ) )
            {
            // InternalMyDsl.g:399:2: ( ( rule__ListOpt1__Group__0 ) )
            // InternalMyDsl.g:400:3: ( rule__ListOpt1__Group__0 )
            {
             before(grammarAccess.getListOpt1Access().getGroup()); 
            // InternalMyDsl.g:401:3: ( rule__ListOpt1__Group__0 )
            // InternalMyDsl.g:401:4: rule__ListOpt1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOpt1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOpt1"


    // $ANTLR start "entryRuleListOpt2"
    // InternalMyDsl.g:410:1: entryRuleListOpt2 : ruleListOpt2 EOF ;
    public final void entryRuleListOpt2() throws RecognitionException {
        try {
            // InternalMyDsl.g:411:1: ( ruleListOpt2 EOF )
            // InternalMyDsl.g:412:1: ruleListOpt2 EOF
            {
             before(grammarAccess.getListOpt2Rule()); 
            pushFollow(FOLLOW_1);
            ruleListOpt2();

            state._fsp--;

             after(grammarAccess.getListOpt2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOpt2"


    // $ANTLR start "ruleListOpt2"
    // InternalMyDsl.g:419:1: ruleListOpt2 : ( ( rule__ListOpt2__Group__0 ) ) ;
    public final void ruleListOpt2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:2: ( ( ( rule__ListOpt2__Group__0 ) ) )
            // InternalMyDsl.g:424:2: ( ( rule__ListOpt2__Group__0 ) )
            {
            // InternalMyDsl.g:424:2: ( ( rule__ListOpt2__Group__0 ) )
            // InternalMyDsl.g:425:3: ( rule__ListOpt2__Group__0 )
            {
             before(grammarAccess.getListOpt2Access().getGroup()); 
            // InternalMyDsl.g:426:3: ( rule__ListOpt2__Group__0 )
            // InternalMyDsl.g:426:4: rule__ListOpt2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOpt2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOpt2"


    // $ANTLR start "entryRuleListOpt3"
    // InternalMyDsl.g:435:1: entryRuleListOpt3 : ruleListOpt3 EOF ;
    public final void entryRuleListOpt3() throws RecognitionException {
        try {
            // InternalMyDsl.g:436:1: ( ruleListOpt3 EOF )
            // InternalMyDsl.g:437:1: ruleListOpt3 EOF
            {
             before(grammarAccess.getListOpt3Rule()); 
            pushFollow(FOLLOW_1);
            ruleListOpt3();

            state._fsp--;

             after(grammarAccess.getListOpt3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListOpt3"


    // $ANTLR start "ruleListOpt3"
    // InternalMyDsl.g:444:1: ruleListOpt3 : ( ( rule__ListOpt3__Group__0 ) ) ;
    public final void ruleListOpt3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:2: ( ( ( rule__ListOpt3__Group__0 ) ) )
            // InternalMyDsl.g:449:2: ( ( rule__ListOpt3__Group__0 ) )
            {
            // InternalMyDsl.g:449:2: ( ( rule__ListOpt3__Group__0 ) )
            // InternalMyDsl.g:450:3: ( rule__ListOpt3__Group__0 )
            {
             before(grammarAccess.getListOpt3Access().getGroup()); 
            // InternalMyDsl.g:451:3: ( rule__ListOpt3__Group__0 )
            // InternalMyDsl.g:451:4: rule__ListOpt3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListOpt3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListOpt3"


    // $ANTLR start "rule__Clause__Alternatives"
    // InternalMyDsl.g:459:1: rule__Clause__Alternatives : ( ( ( rule__Clause__FactAssignment_0 ) ) | ( ( rule__Clause__RuleAssignment_1 ) ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( ( ( rule__Clause__FactAssignment_0 ) ) | ( ( rule__Clause__RuleAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:464:2: ( ( rule__Clause__FactAssignment_0 ) )
                    {
                    // InternalMyDsl.g:464:2: ( ( rule__Clause__FactAssignment_0 ) )
                    // InternalMyDsl.g:465:3: ( rule__Clause__FactAssignment_0 )
                    {
                     before(grammarAccess.getClauseAccess().getFactAssignment_0()); 
                    // InternalMyDsl.g:466:3: ( rule__Clause__FactAssignment_0 )
                    // InternalMyDsl.g:466:4: rule__Clause__FactAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clause__FactAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseAccess().getFactAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:470:2: ( ( rule__Clause__RuleAssignment_1 ) )
                    {
                    // InternalMyDsl.g:470:2: ( ( rule__Clause__RuleAssignment_1 ) )
                    // InternalMyDsl.g:471:3: ( rule__Clause__RuleAssignment_1 )
                    {
                     before(grammarAccess.getClauseAccess().getRuleAssignment_1()); 
                    // InternalMyDsl.g:472:3: ( rule__Clause__RuleAssignment_1 )
                    // InternalMyDsl.g:472:4: rule__Clause__RuleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clause__RuleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseAccess().getRuleAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Alternatives"


    // $ANTLR start "rule__Term__TermAlternatives_0"
    // InternalMyDsl.g:480:1: rule__Term__TermAlternatives_0 : ( ( ruleAtom ) | ( ruleList ) );
    public final void rule__Term__TermAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:484:1: ( ( ruleAtom ) | ( ruleList ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_VARIABLE2)) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:485:2: ( ruleAtom )
                    {
                    // InternalMyDsl.g:485:2: ( ruleAtom )
                    // InternalMyDsl.g:486:3: ruleAtom
                    {
                     before(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:491:2: ( ruleList )
                    {
                    // InternalMyDsl.g:491:2: ( ruleList )
                    // InternalMyDsl.g:492:3: ruleList
                    {
                     before(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TermAlternatives_0"


    // $ANTLR start "rule__Atom__AtAlternatives_0"
    // InternalMyDsl.g:501:1: rule__Atom__AtAlternatives_0 : ( ( RULE_ID ) | ( RULE_NUMBER2 ) | ( RULE_VARIABLE2 ) );
    public final void rule__Atom__AtAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( ( RULE_ID ) | ( RULE_NUMBER2 ) | ( RULE_VARIABLE2 ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_NUMBER2:
                {
                alt4=2;
                }
                break;
            case RULE_VARIABLE2:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:506:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:506:2: ( RULE_ID )
                    // InternalMyDsl.g:507:3: RULE_ID
                    {
                     before(grammarAccess.getAtomAccess().getAtIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAtomAccess().getAtIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:512:2: ( RULE_NUMBER2 )
                    {
                    // InternalMyDsl.g:512:2: ( RULE_NUMBER2 )
                    // InternalMyDsl.g:513:3: RULE_NUMBER2
                    {
                     before(grammarAccess.getAtomAccess().getAtNUMBER2TerminalRuleCall_0_1()); 
                    match(input,RULE_NUMBER2,FOLLOW_2); 
                     after(grammarAccess.getAtomAccess().getAtNUMBER2TerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:518:2: ( RULE_VARIABLE2 )
                    {
                    // InternalMyDsl.g:518:2: ( RULE_VARIABLE2 )
                    // InternalMyDsl.g:519:3: RULE_VARIABLE2
                    {
                     before(grammarAccess.getAtomAccess().getAtVARIABLE2TerminalRuleCall_0_2()); 
                    match(input,RULE_VARIABLE2,FOLLOW_2); 
                     after(grammarAccess.getAtomAccess().getAtVARIABLE2TerminalRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__AtAlternatives_0"


    // $ANTLR start "rule__Rest__Alternatives"
    // InternalMyDsl.g:528:1: rule__Rest__Alternatives : ( ( ( rule__Rest__OptAssignment_0 ) ) | ( ruleListOpt2 ) | ( ruleListOpt3 ) );
    public final void rule__Rest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( ( ( rule__Rest__OptAssignment_0 ) ) | ( ruleListOpt2 ) | ( ruleListOpt3 ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=RULE_ID && LA5_1<=RULE_VARIABLE2)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==15) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:533:2: ( ( rule__Rest__OptAssignment_0 ) )
                    {
                    // InternalMyDsl.g:533:2: ( ( rule__Rest__OptAssignment_0 ) )
                    // InternalMyDsl.g:534:3: ( rule__Rest__OptAssignment_0 )
                    {
                     before(grammarAccess.getRestAccess().getOptAssignment_0()); 
                    // InternalMyDsl.g:535:3: ( rule__Rest__OptAssignment_0 )
                    // InternalMyDsl.g:535:4: rule__Rest__OptAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rest__OptAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRestAccess().getOptAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:539:2: ( ruleListOpt2 )
                    {
                    // InternalMyDsl.g:539:2: ( ruleListOpt2 )
                    // InternalMyDsl.g:540:3: ruleListOpt2
                    {
                     before(grammarAccess.getRestAccess().getListOpt2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListOpt2();

                    state._fsp--;

                     after(grammarAccess.getRestAccess().getListOpt2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:545:2: ( ruleListOpt3 )
                    {
                    // InternalMyDsl.g:545:2: ( ruleListOpt3 )
                    // InternalMyDsl.g:546:3: ruleListOpt3
                    {
                     before(grammarAccess.getRestAccess().getListOpt3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleListOpt3();

                    state._fsp--;

                     after(grammarAccess.getRestAccess().getListOpt3ParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Alternatives"


    // $ANTLR start "rule__Prologdsl__Group__0"
    // InternalMyDsl.g:555:1: rule__Prologdsl__Group__0 : rule__Prologdsl__Group__0__Impl rule__Prologdsl__Group__1 ;
    public final void rule__Prologdsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( rule__Prologdsl__Group__0__Impl rule__Prologdsl__Group__1 )
            // InternalMyDsl.g:560:2: rule__Prologdsl__Group__0__Impl rule__Prologdsl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Prologdsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prologdsl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__0"


    // $ANTLR start "rule__Prologdsl__Group__0__Impl"
    // InternalMyDsl.g:567:1: rule__Prologdsl__Group__0__Impl : ( ( rule__Prologdsl__ProgamAssignment_0 ) ) ;
    public final void rule__Prologdsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( rule__Prologdsl__ProgamAssignment_0 ) ) )
            // InternalMyDsl.g:572:1: ( ( rule__Prologdsl__ProgamAssignment_0 ) )
            {
            // InternalMyDsl.g:572:1: ( ( rule__Prologdsl__ProgamAssignment_0 ) )
            // InternalMyDsl.g:573:2: ( rule__Prologdsl__ProgamAssignment_0 )
            {
             before(grammarAccess.getPrologdslAccess().getProgamAssignment_0()); 
            // InternalMyDsl.g:574:2: ( rule__Prologdsl__ProgamAssignment_0 )
            // InternalMyDsl.g:574:3: rule__Prologdsl__ProgamAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__ProgamAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrologdslAccess().getProgamAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__0__Impl"


    // $ANTLR start "rule__Prologdsl__Group__1"
    // InternalMyDsl.g:582:1: rule__Prologdsl__Group__1 : rule__Prologdsl__Group__1__Impl ;
    public final void rule__Prologdsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( rule__Prologdsl__Group__1__Impl )
            // InternalMyDsl.g:587:2: rule__Prologdsl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__1"


    // $ANTLR start "rule__Prologdsl__Group__1__Impl"
    // InternalMyDsl.g:593:1: rule__Prologdsl__Group__1__Impl : ( ( rule__Prologdsl__ExqueryAssignment_1 ) ) ;
    public final void rule__Prologdsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( ( ( rule__Prologdsl__ExqueryAssignment_1 ) ) )
            // InternalMyDsl.g:598:1: ( ( rule__Prologdsl__ExqueryAssignment_1 ) )
            {
            // InternalMyDsl.g:598:1: ( ( rule__Prologdsl__ExqueryAssignment_1 ) )
            // InternalMyDsl.g:599:2: ( rule__Prologdsl__ExqueryAssignment_1 )
            {
             before(grammarAccess.getPrologdslAccess().getExqueryAssignment_1()); 
            // InternalMyDsl.g:600:2: ( rule__Prologdsl__ExqueryAssignment_1 )
            // InternalMyDsl.g:600:3: rule__Prologdsl__ExqueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prologdsl__ExqueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrologdslAccess().getExqueryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__0"
    // InternalMyDsl.g:609:1: rule__Exquery__Group__0 : rule__Exquery__Group__0__Impl rule__Exquery__Group__1 ;
    public final void rule__Exquery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( rule__Exquery__Group__0__Impl rule__Exquery__Group__1 )
            // InternalMyDsl.g:614:2: rule__Exquery__Group__0__Impl rule__Exquery__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Exquery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exquery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__0"


    // $ANTLR start "rule__Exquery__Group__0__Impl"
    // InternalMyDsl.g:621:1: rule__Exquery__Group__0__Impl : ( '?-' ) ;
    public final void rule__Exquery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( ( '?-' ) )
            // InternalMyDsl.g:626:1: ( '?-' )
            {
            // InternalMyDsl.g:626:1: ( '?-' )
            // InternalMyDsl.g:627:2: '?-'
            {
             before(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__0__Impl"


    // $ANTLR start "rule__Exquery__Group__1"
    // InternalMyDsl.g:636:1: rule__Exquery__Group__1 : rule__Exquery__Group__1__Impl rule__Exquery__Group__2 ;
    public final void rule__Exquery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( rule__Exquery__Group__1__Impl rule__Exquery__Group__2 )
            // InternalMyDsl.g:641:2: rule__Exquery__Group__1__Impl rule__Exquery__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Exquery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exquery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__1"


    // $ANTLR start "rule__Exquery__Group__1__Impl"
    // InternalMyDsl.g:648:1: rule__Exquery__Group__1__Impl : ( ( rule__Exquery__QueryAssignment_1 ) ) ;
    public final void rule__Exquery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( ( ( rule__Exquery__QueryAssignment_1 ) ) )
            // InternalMyDsl.g:653:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            {
            // InternalMyDsl.g:653:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            // InternalMyDsl.g:654:2: ( rule__Exquery__QueryAssignment_1 )
            {
             before(grammarAccess.getExqueryAccess().getQueryAssignment_1()); 
            // InternalMyDsl.g:655:2: ( rule__Exquery__QueryAssignment_1 )
            // InternalMyDsl.g:655:3: rule__Exquery__QueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__QueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getQueryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__2"
    // InternalMyDsl.g:663:1: rule__Exquery__Group__2 : rule__Exquery__Group__2__Impl ;
    public final void rule__Exquery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( rule__Exquery__Group__2__Impl )
            // InternalMyDsl.g:668:2: rule__Exquery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__2"


    // $ANTLR start "rule__Exquery__Group__2__Impl"
    // InternalMyDsl.g:674:1: rule__Exquery__Group__2__Impl : ( '.' ) ;
    public final void rule__Exquery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( '.' ) )
            // InternalMyDsl.g:679:1: ( '.' )
            {
            // InternalMyDsl.g:679:1: ( '.' )
            // InternalMyDsl.g:680:2: '.'
            {
             before(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalMyDsl.g:690:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalMyDsl.g:695:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalMyDsl.g:702:1: rule__Query__Group__0__Impl : ( ( rule__Query__PredicateAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( ( rule__Query__PredicateAssignment_0 ) ) )
            // InternalMyDsl.g:707:1: ( ( rule__Query__PredicateAssignment_0 ) )
            {
            // InternalMyDsl.g:707:1: ( ( rule__Query__PredicateAssignment_0 ) )
            // InternalMyDsl.g:708:2: ( rule__Query__PredicateAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getPredicateAssignment_0()); 
            // InternalMyDsl.g:709:2: ( rule__Query__PredicateAssignment_0 )
            // InternalMyDsl.g:709:3: rule__Query__PredicateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalMyDsl.g:717:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( rule__Query__Group__1__Impl )
            // InternalMyDsl.g:722:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalMyDsl.g:728:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( ( rule__Query__Group_1__0 )* ) )
            // InternalMyDsl.g:733:1: ( ( rule__Query__Group_1__0 )* )
            {
            // InternalMyDsl.g:733:1: ( ( rule__Query__Group_1__0 )* )
            // InternalMyDsl.g:734:2: ( rule__Query__Group_1__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_1()); 
            // InternalMyDsl.g:735:2: ( rule__Query__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:735:3: rule__Query__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Query__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group_1__0"
    // InternalMyDsl.g:744:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // InternalMyDsl.g:749:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Query__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0"


    // $ANTLR start "rule__Query__Group_1__0__Impl"
    // InternalMyDsl.g:756:1: rule__Query__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( ( ',' ) )
            // InternalMyDsl.g:761:1: ( ',' )
            {
            // InternalMyDsl.g:761:1: ( ',' )
            // InternalMyDsl.g:762:2: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0__Impl"


    // $ANTLR start "rule__Query__Group_1__1"
    // InternalMyDsl.g:771:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( rule__Query__Group_1__1__Impl )
            // InternalMyDsl.g:776:2: rule__Query__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1"


    // $ANTLR start "rule__Query__Group_1__1__Impl"
    // InternalMyDsl.g:782:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__NextpredicateAssignment_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( ( ( rule__Query__NextpredicateAssignment_1_1 ) ) )
            // InternalMyDsl.g:787:1: ( ( rule__Query__NextpredicateAssignment_1_1 ) )
            {
            // InternalMyDsl.g:787:1: ( ( rule__Query__NextpredicateAssignment_1_1 ) )
            // InternalMyDsl.g:788:2: ( rule__Query__NextpredicateAssignment_1_1 )
            {
             before(grammarAccess.getQueryAccess().getNextpredicateAssignment_1_1()); 
            // InternalMyDsl.g:789:2: ( rule__Query__NextpredicateAssignment_1_1 )
            // InternalMyDsl.g:789:3: rule__Query__NextpredicateAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__NextpredicateAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNextpredicateAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // InternalMyDsl.g:798:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalMyDsl.g:803:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // InternalMyDsl.g:810:1: rule__Fact__Group__0__Impl : ( ( rule__Fact__PredicateAssignment_0 ) ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( ( ( rule__Fact__PredicateAssignment_0 ) ) )
            // InternalMyDsl.g:815:1: ( ( rule__Fact__PredicateAssignment_0 ) )
            {
            // InternalMyDsl.g:815:1: ( ( rule__Fact__PredicateAssignment_0 ) )
            // InternalMyDsl.g:816:2: ( rule__Fact__PredicateAssignment_0 )
            {
             before(grammarAccess.getFactAccess().getPredicateAssignment_0()); 
            // InternalMyDsl.g:817:2: ( rule__Fact__PredicateAssignment_0 )
            // InternalMyDsl.g:817:3: rule__Fact__PredicateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // InternalMyDsl.g:825:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( rule__Fact__Group__1__Impl )
            // InternalMyDsl.g:830:2: rule__Fact__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // InternalMyDsl.g:836:1: rule__Fact__Group__1__Impl : ( '.' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( '.' ) )
            // InternalMyDsl.g:841:1: ( '.' )
            {
            // InternalMyDsl.g:841:1: ( '.' )
            // InternalMyDsl.g:842:2: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:852:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:857:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:864:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__PredicateAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( ( rule__Rule__PredicateAssignment_0 ) ) )
            // InternalMyDsl.g:869:1: ( ( rule__Rule__PredicateAssignment_0 ) )
            {
            // InternalMyDsl.g:869:1: ( ( rule__Rule__PredicateAssignment_0 ) )
            // InternalMyDsl.g:870:2: ( rule__Rule__PredicateAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getPredicateAssignment_0()); 
            // InternalMyDsl.g:871:2: ( rule__Rule__PredicateAssignment_0 )
            // InternalMyDsl.g:871:3: rule__Rule__PredicateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:879:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMyDsl.g:884:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:891:1: rule__Rule__Group__1__Impl : ( ':-' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( ( ':-' ) )
            // InternalMyDsl.g:896:1: ( ':-' )
            {
            // InternalMyDsl.g:896:1: ( ':-' )
            // InternalMyDsl.g:897:2: ':-'
            {
             before(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMyDsl.g:906:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMyDsl.g:911:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMyDsl.g:918:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__QueryAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( ( rule__Rule__QueryAssignment_2 ) ) )
            // InternalMyDsl.g:923:1: ( ( rule__Rule__QueryAssignment_2 ) )
            {
            // InternalMyDsl.g:923:1: ( ( rule__Rule__QueryAssignment_2 ) )
            // InternalMyDsl.g:924:2: ( rule__Rule__QueryAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getQueryAssignment_2()); 
            // InternalMyDsl.g:925:2: ( rule__Rule__QueryAssignment_2 )
            // InternalMyDsl.g:925:3: rule__Rule__QueryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QueryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQueryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalMyDsl.g:933:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( rule__Rule__Group__3__Impl )
            // InternalMyDsl.g:938:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalMyDsl.g:944:1: rule__Rule__Group__3__Impl : ( '.' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( '.' ) )
            // InternalMyDsl.g:949:1: ( '.' )
            {
            // InternalMyDsl.g:949:1: ( '.' )
            // InternalMyDsl.g:950:2: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalMyDsl.g:960:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalMyDsl.g:965:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalMyDsl.g:972:1: rule__Predicate__Group__0__Impl : ( ( rule__Predicate__FunctorAssignment_0 ) ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( ( rule__Predicate__FunctorAssignment_0 ) ) )
            // InternalMyDsl.g:977:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            {
            // InternalMyDsl.g:977:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            // InternalMyDsl.g:978:2: ( rule__Predicate__FunctorAssignment_0 )
            {
             before(grammarAccess.getPredicateAccess().getFunctorAssignment_0()); 
            // InternalMyDsl.g:979:2: ( rule__Predicate__FunctorAssignment_0 )
            // InternalMyDsl.g:979:3: rule__Predicate__FunctorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__FunctorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getFunctorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalMyDsl.g:987:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // InternalMyDsl.g:992:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Predicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalMyDsl.g:999:1: rule__Predicate__Group__1__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( ( '(' ) )
            // InternalMyDsl.g:1004:1: ( '(' )
            {
            // InternalMyDsl.g:1004:1: ( '(' )
            // InternalMyDsl.g:1005:2: '('
            {
             before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // InternalMyDsl.g:1014:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // InternalMyDsl.g:1019:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Predicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // InternalMyDsl.g:1026:1: rule__Predicate__Group__2__Impl : ( ( rule__Predicate__TermAssignment_2 ) ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( ( rule__Predicate__TermAssignment_2 ) ) )
            // InternalMyDsl.g:1031:1: ( ( rule__Predicate__TermAssignment_2 ) )
            {
            // InternalMyDsl.g:1031:1: ( ( rule__Predicate__TermAssignment_2 ) )
            // InternalMyDsl.g:1032:2: ( rule__Predicate__TermAssignment_2 )
            {
             before(grammarAccess.getPredicateAccess().getTermAssignment_2()); 
            // InternalMyDsl.g:1033:2: ( rule__Predicate__TermAssignment_2 )
            // InternalMyDsl.g:1033:3: rule__Predicate__TermAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getTermAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // InternalMyDsl.g:1041:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // InternalMyDsl.g:1046:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Predicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // InternalMyDsl.g:1053:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )* ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( ( rule__Predicate__Group_3__0 )* ) )
            // InternalMyDsl.g:1058:1: ( ( rule__Predicate__Group_3__0 )* )
            {
            // InternalMyDsl.g:1058:1: ( ( rule__Predicate__Group_3__0 )* )
            // InternalMyDsl.g:1059:2: ( rule__Predicate__Group_3__0 )*
            {
             before(grammarAccess.getPredicateAccess().getGroup_3()); 
            // InternalMyDsl.g:1060:2: ( rule__Predicate__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1060:3: rule__Predicate__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Predicate__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPredicateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__4"
    // InternalMyDsl.g:1068:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( rule__Predicate__Group__4__Impl )
            // InternalMyDsl.g:1073:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__4"


    // $ANTLR start "rule__Predicate__Group__4__Impl"
    // InternalMyDsl.g:1079:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( ')' ) )
            // InternalMyDsl.g:1084:1: ( ')' )
            {
            // InternalMyDsl.g:1084:1: ( ')' )
            // InternalMyDsl.g:1085:2: ')'
            {
             before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__4__Impl"


    // $ANTLR start "rule__Predicate__Group_3__0"
    // InternalMyDsl.g:1095:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // InternalMyDsl.g:1100:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__0"


    // $ANTLR start "rule__Predicate__Group_3__0__Impl"
    // InternalMyDsl.g:1107:1: rule__Predicate__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( ',' ) )
            // InternalMyDsl.g:1112:1: ( ',' )
            {
            // InternalMyDsl.g:1112:1: ( ',' )
            // InternalMyDsl.g:1113:2: ','
            {
             before(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__0__Impl"


    // $ANTLR start "rule__Predicate__Group_3__1"
    // InternalMyDsl.g:1122:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( rule__Predicate__Group_3__1__Impl )
            // InternalMyDsl.g:1127:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__1"


    // $ANTLR start "rule__Predicate__Group_3__1__Impl"
    // InternalMyDsl.g:1133:1: rule__Predicate__Group_3__1__Impl : ( ( rule__Predicate__NexttermAssignment_3_1 ) ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( ( rule__Predicate__NexttermAssignment_3_1 ) ) )
            // InternalMyDsl.g:1138:1: ( ( rule__Predicate__NexttermAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1138:1: ( ( rule__Predicate__NexttermAssignment_3_1 ) )
            // InternalMyDsl.g:1139:2: ( rule__Predicate__NexttermAssignment_3_1 )
            {
             before(grammarAccess.getPredicateAccess().getNexttermAssignment_3_1()); 
            // InternalMyDsl.g:1140:2: ( rule__Predicate__NexttermAssignment_3_1 )
            // InternalMyDsl.g:1140:3: rule__Predicate__NexttermAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__NexttermAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getNexttermAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_3__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalMyDsl.g:1149:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalMyDsl.g:1154:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalMyDsl.g:1161:1: rule__List__Group__0__Impl : ( ( rule__List__KaAssignment_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( ( ( rule__List__KaAssignment_0 ) ) )
            // InternalMyDsl.g:1166:1: ( ( rule__List__KaAssignment_0 ) )
            {
            // InternalMyDsl.g:1166:1: ( ( rule__List__KaAssignment_0 ) )
            // InternalMyDsl.g:1167:2: ( rule__List__KaAssignment_0 )
            {
             before(grammarAccess.getListAccess().getKaAssignment_0()); 
            // InternalMyDsl.g:1168:2: ( rule__List__KaAssignment_0 )
            // InternalMyDsl.g:1168:3: rule__List__KaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__List__KaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getKaAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalMyDsl.g:1176:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalMyDsl.g:1181:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalMyDsl.g:1188:1: rule__List__Group__1__Impl : ( ( rule__List__Group_1__0 )? ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( ( rule__List__Group_1__0 )? ) )
            // InternalMyDsl.g:1193:1: ( ( rule__List__Group_1__0 )? )
            {
            // InternalMyDsl.g:1193:1: ( ( rule__List__Group_1__0 )? )
            // InternalMyDsl.g:1194:2: ( rule__List__Group_1__0 )?
            {
             before(grammarAccess.getListAccess().getGroup_1()); 
            // InternalMyDsl.g:1195:2: ( rule__List__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_VARIABLE2)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1195:3: rule__List__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // InternalMyDsl.g:1203:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( rule__List__Group__2__Impl )
            // InternalMyDsl.g:1208:2: rule__List__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // InternalMyDsl.g:1214:1: rule__List__Group__2__Impl : ( ( rule__List__KzAssignment_2 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( ( rule__List__KzAssignment_2 ) ) )
            // InternalMyDsl.g:1219:1: ( ( rule__List__KzAssignment_2 ) )
            {
            // InternalMyDsl.g:1219:1: ( ( rule__List__KzAssignment_2 ) )
            // InternalMyDsl.g:1220:2: ( rule__List__KzAssignment_2 )
            {
             before(grammarAccess.getListAccess().getKzAssignment_2()); 
            // InternalMyDsl.g:1221:2: ( rule__List__KzAssignment_2 )
            // InternalMyDsl.g:1221:3: rule__List__KzAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__List__KzAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getKzAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group_1__0"
    // InternalMyDsl.g:1230:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // InternalMyDsl.g:1235:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__List__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__0"


    // $ANTLR start "rule__List__Group_1__0__Impl"
    // InternalMyDsl.g:1242:1: rule__List__Group_1__0__Impl : ( ( rule__List__AtomAssignment_1_0 ) ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( ( ( rule__List__AtomAssignment_1_0 ) ) )
            // InternalMyDsl.g:1247:1: ( ( rule__List__AtomAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1247:1: ( ( rule__List__AtomAssignment_1_0 ) )
            // InternalMyDsl.g:1248:2: ( rule__List__AtomAssignment_1_0 )
            {
             before(grammarAccess.getListAccess().getAtomAssignment_1_0()); 
            // InternalMyDsl.g:1249:2: ( rule__List__AtomAssignment_1_0 )
            // InternalMyDsl.g:1249:3: rule__List__AtomAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__List__AtomAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAtomAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__0__Impl"


    // $ANTLR start "rule__List__Group_1__1"
    // InternalMyDsl.g:1257:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( rule__List__Group_1__1__Impl )
            // InternalMyDsl.g:1262:2: rule__List__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__1"


    // $ANTLR start "rule__List__Group_1__1__Impl"
    // InternalMyDsl.g:1268:1: rule__List__Group_1__1__Impl : ( ( rule__List__RestAssignment_1_1 )? ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( ( rule__List__RestAssignment_1_1 )? ) )
            // InternalMyDsl.g:1273:1: ( ( rule__List__RestAssignment_1_1 )? )
            {
            // InternalMyDsl.g:1273:1: ( ( rule__List__RestAssignment_1_1 )? )
            // InternalMyDsl.g:1274:2: ( rule__List__RestAssignment_1_1 )?
            {
             before(grammarAccess.getListAccess().getRestAssignment_1_1()); 
            // InternalMyDsl.g:1275:2: ( rule__List__RestAssignment_1_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15||LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1275:3: rule__List__RestAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__RestAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListAccess().getRestAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__1__Impl"


    // $ANTLR start "rule__ListOpt1__Group__0"
    // InternalMyDsl.g:1284:1: rule__ListOpt1__Group__0 : rule__ListOpt1__Group__0__Impl rule__ListOpt1__Group__1 ;
    public final void rule__ListOpt1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( rule__ListOpt1__Group__0__Impl rule__ListOpt1__Group__1 )
            // InternalMyDsl.g:1289:2: rule__ListOpt1__Group__0__Impl rule__ListOpt1__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ListOpt1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt1__Group__0"


    // $ANTLR start "rule__ListOpt1__Group__0__Impl"
    // InternalMyDsl.g:1296:1: rule__ListOpt1__Group__0__Impl : ( '|' ) ;
    public final void rule__ListOpt1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( '|' ) )
            // InternalMyDsl.g:1301:1: ( '|' )
            {
            // InternalMyDsl.g:1301:1: ( '|' )
            // InternalMyDsl.g:1302:2: '|'
            {
             before(grammarAccess.getListOpt1Access().getVerticalLineKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListOpt1Access().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt1__Group__0__Impl"


    // $ANTLR start "rule__ListOpt1__Group__1"
    // InternalMyDsl.g:1311:1: rule__ListOpt1__Group__1 : rule__ListOpt1__Group__1__Impl ;
    public final void rule__ListOpt1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( rule__ListOpt1__Group__1__Impl )
            // InternalMyDsl.g:1316:2: rule__ListOpt1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt1__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt1__Group__1"


    // $ANTLR start "rule__ListOpt1__Group__1__Impl"
    // InternalMyDsl.g:1322:1: rule__ListOpt1__Group__1__Impl : ( ( rule__ListOpt1__AtomAssignment_1 ) ) ;
    public final void rule__ListOpt1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( ( ( rule__ListOpt1__AtomAssignment_1 ) ) )
            // InternalMyDsl.g:1327:1: ( ( rule__ListOpt1__AtomAssignment_1 ) )
            {
            // InternalMyDsl.g:1327:1: ( ( rule__ListOpt1__AtomAssignment_1 ) )
            // InternalMyDsl.g:1328:2: ( rule__ListOpt1__AtomAssignment_1 )
            {
             before(grammarAccess.getListOpt1Access().getAtomAssignment_1()); 
            // InternalMyDsl.g:1329:2: ( rule__ListOpt1__AtomAssignment_1 )
            // InternalMyDsl.g:1329:3: rule__ListOpt1__AtomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt1__AtomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListOpt1Access().getAtomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt1__Group__1__Impl"


    // $ANTLR start "rule__ListOpt2__Group__0"
    // InternalMyDsl.g:1338:1: rule__ListOpt2__Group__0 : rule__ListOpt2__Group__0__Impl rule__ListOpt2__Group__1 ;
    public final void rule__ListOpt2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( rule__ListOpt2__Group__0__Impl rule__ListOpt2__Group__1 )
            // InternalMyDsl.g:1343:2: rule__ListOpt2__Group__0__Impl rule__ListOpt2__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ListOpt2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__0"


    // $ANTLR start "rule__ListOpt2__Group__0__Impl"
    // InternalMyDsl.g:1350:1: rule__ListOpt2__Group__0__Impl : ( '|' ) ;
    public final void rule__ListOpt2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( ( '|' ) )
            // InternalMyDsl.g:1355:1: ( '|' )
            {
            // InternalMyDsl.g:1355:1: ( '|' )
            // InternalMyDsl.g:1356:2: '|'
            {
             before(grammarAccess.getListOpt2Access().getVerticalLineKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListOpt2Access().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__0__Impl"


    // $ANTLR start "rule__ListOpt2__Group__1"
    // InternalMyDsl.g:1365:1: rule__ListOpt2__Group__1 : rule__ListOpt2__Group__1__Impl rule__ListOpt2__Group__2 ;
    public final void rule__ListOpt2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( rule__ListOpt2__Group__1__Impl rule__ListOpt2__Group__2 )
            // InternalMyDsl.g:1370:2: rule__ListOpt2__Group__1__Impl rule__ListOpt2__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ListOpt2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__1"


    // $ANTLR start "rule__ListOpt2__Group__1__Impl"
    // InternalMyDsl.g:1377:1: rule__ListOpt2__Group__1__Impl : ( '[' ) ;
    public final void rule__ListOpt2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( ( '[' ) )
            // InternalMyDsl.g:1382:1: ( '[' )
            {
            // InternalMyDsl.g:1382:1: ( '[' )
            // InternalMyDsl.g:1383:2: '['
            {
             before(grammarAccess.getListOpt2Access().getLeftSquareBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListOpt2Access().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__1__Impl"


    // $ANTLR start "rule__ListOpt2__Group__2"
    // InternalMyDsl.g:1392:1: rule__ListOpt2__Group__2 : rule__ListOpt2__Group__2__Impl rule__ListOpt2__Group__3 ;
    public final void rule__ListOpt2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( rule__ListOpt2__Group__2__Impl rule__ListOpt2__Group__3 )
            // InternalMyDsl.g:1397:2: rule__ListOpt2__Group__2__Impl rule__ListOpt2__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ListOpt2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__2"


    // $ANTLR start "rule__ListOpt2__Group__2__Impl"
    // InternalMyDsl.g:1404:1: rule__ListOpt2__Group__2__Impl : ( ( rule__ListOpt2__AtomAssignment_2 ) ) ;
    public final void rule__ListOpt2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( ( ( rule__ListOpt2__AtomAssignment_2 ) ) )
            // InternalMyDsl.g:1409:1: ( ( rule__ListOpt2__AtomAssignment_2 ) )
            {
            // InternalMyDsl.g:1409:1: ( ( rule__ListOpt2__AtomAssignment_2 ) )
            // InternalMyDsl.g:1410:2: ( rule__ListOpt2__AtomAssignment_2 )
            {
             before(grammarAccess.getListOpt2Access().getAtomAssignment_2()); 
            // InternalMyDsl.g:1411:2: ( rule__ListOpt2__AtomAssignment_2 )
            // InternalMyDsl.g:1411:3: rule__ListOpt2__AtomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt2__AtomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListOpt2Access().getAtomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__2__Impl"


    // $ANTLR start "rule__ListOpt2__Group__3"
    // InternalMyDsl.g:1419:1: rule__ListOpt2__Group__3 : rule__ListOpt2__Group__3__Impl rule__ListOpt2__Group__4 ;
    public final void rule__ListOpt2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( rule__ListOpt2__Group__3__Impl rule__ListOpt2__Group__4 )
            // InternalMyDsl.g:1424:2: rule__ListOpt2__Group__3__Impl rule__ListOpt2__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ListOpt2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__3"


    // $ANTLR start "rule__ListOpt2__Group__3__Impl"
    // InternalMyDsl.g:1431:1: rule__ListOpt2__Group__3__Impl : ( ( rule__ListOpt2__Group_3__0 )* ) ;
    public final void rule__ListOpt2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( ( rule__ListOpt2__Group_3__0 )* ) )
            // InternalMyDsl.g:1436:1: ( ( rule__ListOpt2__Group_3__0 )* )
            {
            // InternalMyDsl.g:1436:1: ( ( rule__ListOpt2__Group_3__0 )* )
            // InternalMyDsl.g:1437:2: ( rule__ListOpt2__Group_3__0 )*
            {
             before(grammarAccess.getListOpt2Access().getGroup_3()); 
            // InternalMyDsl.g:1438:2: ( rule__ListOpt2__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1438:3: rule__ListOpt2__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ListOpt2__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getListOpt2Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__3__Impl"


    // $ANTLR start "rule__ListOpt2__Group__4"
    // InternalMyDsl.g:1446:1: rule__ListOpt2__Group__4 : rule__ListOpt2__Group__4__Impl ;
    public final void rule__ListOpt2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( rule__ListOpt2__Group__4__Impl )
            // InternalMyDsl.g:1451:2: rule__ListOpt2__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__4"


    // $ANTLR start "rule__ListOpt2__Group__4__Impl"
    // InternalMyDsl.g:1457:1: rule__ListOpt2__Group__4__Impl : ( ']' ) ;
    public final void rule__ListOpt2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( ']' ) )
            // InternalMyDsl.g:1462:1: ( ']' )
            {
            // InternalMyDsl.g:1462:1: ( ']' )
            // InternalMyDsl.g:1463:2: ']'
            {
             before(grammarAccess.getListOpt2Access().getRightSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListOpt2Access().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group__4__Impl"


    // $ANTLR start "rule__ListOpt2__Group_3__0"
    // InternalMyDsl.g:1473:1: rule__ListOpt2__Group_3__0 : rule__ListOpt2__Group_3__0__Impl rule__ListOpt2__Group_3__1 ;
    public final void rule__ListOpt2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( rule__ListOpt2__Group_3__0__Impl rule__ListOpt2__Group_3__1 )
            // InternalMyDsl.g:1478:2: rule__ListOpt2__Group_3__0__Impl rule__ListOpt2__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ListOpt2__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group_3__0"


    // $ANTLR start "rule__ListOpt2__Group_3__0__Impl"
    // InternalMyDsl.g:1485:1: rule__ListOpt2__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListOpt2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( ( ',' ) )
            // InternalMyDsl.g:1490:1: ( ',' )
            {
            // InternalMyDsl.g:1490:1: ( ',' )
            // InternalMyDsl.g:1491:2: ','
            {
             before(grammarAccess.getListOpt2Access().getCommaKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getListOpt2Access().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group_3__0__Impl"


    // $ANTLR start "rule__ListOpt2__Group_3__1"
    // InternalMyDsl.g:1500:1: rule__ListOpt2__Group_3__1 : rule__ListOpt2__Group_3__1__Impl ;
    public final void rule__ListOpt2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( rule__ListOpt2__Group_3__1__Impl )
            // InternalMyDsl.g:1505:2: rule__ListOpt2__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt2__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group_3__1"


    // $ANTLR start "rule__ListOpt2__Group_3__1__Impl"
    // InternalMyDsl.g:1511:1: rule__ListOpt2__Group_3__1__Impl : ( ( rule__ListOpt2__NextatomAssignment_3_1 ) ) ;
    public final void rule__ListOpt2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ( rule__ListOpt2__NextatomAssignment_3_1 ) ) )
            // InternalMyDsl.g:1516:1: ( ( rule__ListOpt2__NextatomAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1516:1: ( ( rule__ListOpt2__NextatomAssignment_3_1 ) )
            // InternalMyDsl.g:1517:2: ( rule__ListOpt2__NextatomAssignment_3_1 )
            {
             before(grammarAccess.getListOpt2Access().getNextatomAssignment_3_1()); 
            // InternalMyDsl.g:1518:2: ( rule__ListOpt2__NextatomAssignment_3_1 )
            // InternalMyDsl.g:1518:3: rule__ListOpt2__NextatomAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt2__NextatomAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getListOpt2Access().getNextatomAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__Group_3__1__Impl"


    // $ANTLR start "rule__ListOpt3__Group__0"
    // InternalMyDsl.g:1527:1: rule__ListOpt3__Group__0 : rule__ListOpt3__Group__0__Impl rule__ListOpt3__Group__1 ;
    public final void rule__ListOpt3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( rule__ListOpt3__Group__0__Impl rule__ListOpt3__Group__1 )
            // InternalMyDsl.g:1532:2: rule__ListOpt3__Group__0__Impl rule__ListOpt3__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ListOpt3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group__0"


    // $ANTLR start "rule__ListOpt3__Group__0__Impl"
    // InternalMyDsl.g:1539:1: rule__ListOpt3__Group__0__Impl : ( ',' ) ;
    public final void rule__ListOpt3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( ( ',' ) )
            // InternalMyDsl.g:1544:1: ( ',' )
            {
            // InternalMyDsl.g:1544:1: ( ',' )
            // InternalMyDsl.g:1545:2: ','
            {
             before(grammarAccess.getListOpt3Access().getCommaKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getListOpt3Access().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group__0__Impl"


    // $ANTLR start "rule__ListOpt3__Group__1"
    // InternalMyDsl.g:1554:1: rule__ListOpt3__Group__1 : rule__ListOpt3__Group__1__Impl rule__ListOpt3__Group__2 ;
    public final void rule__ListOpt3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( rule__ListOpt3__Group__1__Impl rule__ListOpt3__Group__2 )
            // InternalMyDsl.g:1559:2: rule__ListOpt3__Group__1__Impl rule__ListOpt3__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ListOpt3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group__1"


    // $ANTLR start "rule__ListOpt3__Group__1__Impl"
    // InternalMyDsl.g:1566:1: rule__ListOpt3__Group__1__Impl : ( ( rule__ListOpt3__AtomAssignment_1 ) ) ;
    public final void rule__ListOpt3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( ( ( rule__ListOpt3__AtomAssignment_1 ) ) )
            // InternalMyDsl.g:1571:1: ( ( rule__ListOpt3__AtomAssignment_1 ) )
            {
            // InternalMyDsl.g:1571:1: ( ( rule__ListOpt3__AtomAssignment_1 ) )
            // InternalMyDsl.g:1572:2: ( rule__ListOpt3__AtomAssignment_1 )
            {
             before(grammarAccess.getListOpt3Access().getAtomAssignment_1()); 
            // InternalMyDsl.g:1573:2: ( rule__ListOpt3__AtomAssignment_1 )
            // InternalMyDsl.g:1573:3: rule__ListOpt3__AtomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt3__AtomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListOpt3Access().getAtomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group__1__Impl"


    // $ANTLR start "rule__ListOpt3__Group__2"
    // InternalMyDsl.g:1581:1: rule__ListOpt3__Group__2 : rule__ListOpt3__Group__2__Impl ;
    public final void rule__ListOpt3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( rule__ListOpt3__Group__2__Impl )
            // InternalMyDsl.g:1586:2: rule__ListOpt3__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt3__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group__2"


    // $ANTLR start "rule__ListOpt3__Group__2__Impl"
    // InternalMyDsl.g:1592:1: rule__ListOpt3__Group__2__Impl : ( ( rule__ListOpt3__Group_2__0 )* ) ;
    public final void rule__ListOpt3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( ( ( rule__ListOpt3__Group_2__0 )* ) )
            // InternalMyDsl.g:1597:1: ( ( rule__ListOpt3__Group_2__0 )* )
            {
            // InternalMyDsl.g:1597:1: ( ( rule__ListOpt3__Group_2__0 )* )
            // InternalMyDsl.g:1598:2: ( rule__ListOpt3__Group_2__0 )*
            {
             before(grammarAccess.getListOpt3Access().getGroup_2()); 
            // InternalMyDsl.g:1599:2: ( rule__ListOpt3__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1599:3: rule__ListOpt3__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ListOpt3__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getListOpt3Access().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group__2__Impl"


    // $ANTLR start "rule__ListOpt3__Group_2__0"
    // InternalMyDsl.g:1608:1: rule__ListOpt3__Group_2__0 : rule__ListOpt3__Group_2__0__Impl rule__ListOpt3__Group_2__1 ;
    public final void rule__ListOpt3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( rule__ListOpt3__Group_2__0__Impl rule__ListOpt3__Group_2__1 )
            // InternalMyDsl.g:1613:2: rule__ListOpt3__Group_2__0__Impl rule__ListOpt3__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__ListOpt3__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListOpt3__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group_2__0"


    // $ANTLR start "rule__ListOpt3__Group_2__0__Impl"
    // InternalMyDsl.g:1620:1: rule__ListOpt3__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListOpt3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( ( ',' ) )
            // InternalMyDsl.g:1625:1: ( ',' )
            {
            // InternalMyDsl.g:1625:1: ( ',' )
            // InternalMyDsl.g:1626:2: ','
            {
             before(grammarAccess.getListOpt3Access().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getListOpt3Access().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group_2__0__Impl"


    // $ANTLR start "rule__ListOpt3__Group_2__1"
    // InternalMyDsl.g:1635:1: rule__ListOpt3__Group_2__1 : rule__ListOpt3__Group_2__1__Impl ;
    public final void rule__ListOpt3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( rule__ListOpt3__Group_2__1__Impl )
            // InternalMyDsl.g:1640:2: rule__ListOpt3__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt3__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group_2__1"


    // $ANTLR start "rule__ListOpt3__Group_2__1__Impl"
    // InternalMyDsl.g:1646:1: rule__ListOpt3__Group_2__1__Impl : ( ( rule__ListOpt3__NextatomAssignment_2_1 ) ) ;
    public final void rule__ListOpt3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( ( rule__ListOpt3__NextatomAssignment_2_1 ) ) )
            // InternalMyDsl.g:1651:1: ( ( rule__ListOpt3__NextatomAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1651:1: ( ( rule__ListOpt3__NextatomAssignment_2_1 ) )
            // InternalMyDsl.g:1652:2: ( rule__ListOpt3__NextatomAssignment_2_1 )
            {
             before(grammarAccess.getListOpt3Access().getNextatomAssignment_2_1()); 
            // InternalMyDsl.g:1653:2: ( rule__ListOpt3__NextatomAssignment_2_1 )
            // InternalMyDsl.g:1653:3: rule__ListOpt3__NextatomAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListOpt3__NextatomAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListOpt3Access().getNextatomAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__Group_2__1__Impl"


    // $ANTLR start "rule__Prologdsl__ProgamAssignment_0"
    // InternalMyDsl.g:1662:1: rule__Prologdsl__ProgamAssignment_0 : ( ruleProgram ) ;
    public final void rule__Prologdsl__ProgamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( ( ruleProgram ) )
            // InternalMyDsl.g:1667:2: ( ruleProgram )
            {
            // InternalMyDsl.g:1667:2: ( ruleProgram )
            // InternalMyDsl.g:1668:3: ruleProgram
            {
             before(grammarAccess.getPrologdslAccess().getProgamProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getPrologdslAccess().getProgamProgramParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__ProgamAssignment_0"


    // $ANTLR start "rule__Prologdsl__ExqueryAssignment_1"
    // InternalMyDsl.g:1677:1: rule__Prologdsl__ExqueryAssignment_1 : ( ruleExquery ) ;
    public final void rule__Prologdsl__ExqueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1681:1: ( ( ruleExquery ) )
            // InternalMyDsl.g:1682:2: ( ruleExquery )
            {
            // InternalMyDsl.g:1682:2: ( ruleExquery )
            // InternalMyDsl.g:1683:3: ruleExquery
            {
             before(grammarAccess.getPrologdslAccess().getExqueryExqueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getPrologdslAccess().getExqueryExqueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prologdsl__ExqueryAssignment_1"


    // $ANTLR start "rule__Program__ClauseAssignment"
    // InternalMyDsl.g:1692:1: rule__Program__ClauseAssignment : ( ruleClause ) ;
    public final void rule__Program__ClauseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( ( ruleClause ) )
            // InternalMyDsl.g:1697:2: ( ruleClause )
            {
            // InternalMyDsl.g:1697:2: ( ruleClause )
            // InternalMyDsl.g:1698:3: ruleClause
            {
             before(grammarAccess.getProgramAccess().getClauseClauseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClauseClauseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ClauseAssignment"


    // $ANTLR start "rule__Exquery__QueryAssignment_1"
    // InternalMyDsl.g:1707:1: rule__Exquery__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Exquery__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( ruleQuery ) )
            // InternalMyDsl.g:1712:2: ( ruleQuery )
            {
            // InternalMyDsl.g:1712:2: ( ruleQuery )
            // InternalMyDsl.g:1713:3: ruleQuery
            {
             before(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exquery__QueryAssignment_1"


    // $ANTLR start "rule__Query__PredicateAssignment_0"
    // InternalMyDsl.g:1722:1: rule__Query__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Query__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( ( rulePredicate ) )
            // InternalMyDsl.g:1727:2: ( rulePredicate )
            {
            // InternalMyDsl.g:1727:2: ( rulePredicate )
            // InternalMyDsl.g:1728:3: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__PredicateAssignment_0"


    // $ANTLR start "rule__Query__NextpredicateAssignment_1_1"
    // InternalMyDsl.g:1737:1: rule__Query__NextpredicateAssignment_1_1 : ( rulePredicate ) ;
    public final void rule__Query__NextpredicateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( ( rulePredicate ) )
            // InternalMyDsl.g:1742:2: ( rulePredicate )
            {
            // InternalMyDsl.g:1742:2: ( rulePredicate )
            // InternalMyDsl.g:1743:3: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getNextpredicatePredicateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getNextpredicatePredicateParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NextpredicateAssignment_1_1"


    // $ANTLR start "rule__Clause__FactAssignment_0"
    // InternalMyDsl.g:1752:1: rule__Clause__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__Clause__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( ruleFact ) )
            // InternalMyDsl.g:1757:2: ( ruleFact )
            {
            // InternalMyDsl.g:1757:2: ( ruleFact )
            // InternalMyDsl.g:1758:3: ruleFact
            {
             before(grammarAccess.getClauseAccess().getFactFactParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getFactFactParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__FactAssignment_0"


    // $ANTLR start "rule__Clause__RuleAssignment_1"
    // InternalMyDsl.g:1767:1: rule__Clause__RuleAssignment_1 : ( ruleRule ) ;
    public final void rule__Clause__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( ( ruleRule ) )
            // InternalMyDsl.g:1772:2: ( ruleRule )
            {
            // InternalMyDsl.g:1772:2: ( ruleRule )
            // InternalMyDsl.g:1773:3: ruleRule
            {
             before(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__RuleAssignment_1"


    // $ANTLR start "rule__Fact__PredicateAssignment_0"
    // InternalMyDsl.g:1782:1: rule__Fact__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Fact__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( ( rulePredicate ) )
            // InternalMyDsl.g:1787:2: ( rulePredicate )
            {
            // InternalMyDsl.g:1787:2: ( rulePredicate )
            // InternalMyDsl.g:1788:3: rulePredicate
            {
             before(grammarAccess.getFactAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getFactAccess().getPredicatePredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__PredicateAssignment_0"


    // $ANTLR start "rule__Rule__PredicateAssignment_0"
    // InternalMyDsl.g:1797:1: rule__Rule__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Rule__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( ( rulePredicate ) )
            // InternalMyDsl.g:1802:2: ( rulePredicate )
            {
            // InternalMyDsl.g:1802:2: ( rulePredicate )
            // InternalMyDsl.g:1803:3: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatePredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicateAssignment_0"


    // $ANTLR start "rule__Rule__QueryAssignment_2"
    // InternalMyDsl.g:1812:1: rule__Rule__QueryAssignment_2 : ( ruleQuery ) ;
    public final void rule__Rule__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( ( ruleQuery ) )
            // InternalMyDsl.g:1817:2: ( ruleQuery )
            {
            // InternalMyDsl.g:1817:2: ( ruleQuery )
            // InternalMyDsl.g:1818:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__QueryAssignment_2"


    // $ANTLR start "rule__Predicate__FunctorAssignment_0"
    // InternalMyDsl.g:1827:1: rule__Predicate__FunctorAssignment_0 : ( ruleFunctor ) ;
    public final void rule__Predicate__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( ( ruleFunctor ) )
            // InternalMyDsl.g:1832:2: ( ruleFunctor )
            {
            // InternalMyDsl.g:1832:2: ( ruleFunctor )
            // InternalMyDsl.g:1833:3: ruleFunctor
            {
             before(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__FunctorAssignment_0"


    // $ANTLR start "rule__Predicate__TermAssignment_2"
    // InternalMyDsl.g:1842:1: rule__Predicate__TermAssignment_2 : ( ruleTerm ) ;
    public final void rule__Predicate__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1847:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1847:2: ( ruleTerm )
            // InternalMyDsl.g:1848:3: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__TermAssignment_2"


    // $ANTLR start "rule__Predicate__NexttermAssignment_3_1"
    // InternalMyDsl.g:1857:1: rule__Predicate__NexttermAssignment_3_1 : ( ruleTerm ) ;
    public final void rule__Predicate__NexttermAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( ( ruleTerm ) )
            // InternalMyDsl.g:1862:2: ( ruleTerm )
            {
            // InternalMyDsl.g:1862:2: ( ruleTerm )
            // InternalMyDsl.g:1863:3: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getNexttermTermParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getNexttermTermParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__NexttermAssignment_3_1"


    // $ANTLR start "rule__Functor__NameAssignment"
    // InternalMyDsl.g:1872:1: rule__Functor__NameAssignment : ( RULE_ID ) ;
    public final void rule__Functor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1877:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1877:2: ( RULE_ID )
            // InternalMyDsl.g:1878:3: RULE_ID
            {
             before(grammarAccess.getFunctorAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctorAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functor__NameAssignment"


    // $ANTLR start "rule__Term__TermAssignment"
    // InternalMyDsl.g:1887:1: rule__Term__TermAssignment : ( ( rule__Term__TermAlternatives_0 ) ) ;
    public final void rule__Term__TermAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( ( ( rule__Term__TermAlternatives_0 ) ) )
            // InternalMyDsl.g:1892:2: ( ( rule__Term__TermAlternatives_0 ) )
            {
            // InternalMyDsl.g:1892:2: ( ( rule__Term__TermAlternatives_0 ) )
            // InternalMyDsl.g:1893:3: ( rule__Term__TermAlternatives_0 )
            {
             before(grammarAccess.getTermAccess().getTermAlternatives_0()); 
            // InternalMyDsl.g:1894:3: ( rule__Term__TermAlternatives_0 )
            // InternalMyDsl.g:1894:4: rule__Term__TermAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__TermAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TermAssignment"


    // $ANTLR start "rule__Atom__AtAssignment"
    // InternalMyDsl.g:1902:1: rule__Atom__AtAssignment : ( ( rule__Atom__AtAlternatives_0 ) ) ;
    public final void rule__Atom__AtAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( ( rule__Atom__AtAlternatives_0 ) ) )
            // InternalMyDsl.g:1907:2: ( ( rule__Atom__AtAlternatives_0 ) )
            {
            // InternalMyDsl.g:1907:2: ( ( rule__Atom__AtAlternatives_0 ) )
            // InternalMyDsl.g:1908:3: ( rule__Atom__AtAlternatives_0 )
            {
             before(grammarAccess.getAtomAccess().getAtAlternatives_0()); 
            // InternalMyDsl.g:1909:3: ( rule__Atom__AtAlternatives_0 )
            // InternalMyDsl.g:1909:4: rule__Atom__AtAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__AtAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAtAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__AtAssignment"


    // $ANTLR start "rule__List__KaAssignment_0"
    // InternalMyDsl.g:1917:1: rule__List__KaAssignment_0 : ( ( '[' ) ) ;
    public final void rule__List__KaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:1922:2: ( ( '[' ) )
            {
            // InternalMyDsl.g:1922:2: ( ( '[' ) )
            // InternalMyDsl.g:1923:3: ( '[' )
            {
             before(grammarAccess.getListAccess().getKaLeftSquareBracketKeyword_0_0()); 
            // InternalMyDsl.g:1924:3: ( '[' )
            // InternalMyDsl.g:1925:4: '['
            {
             before(grammarAccess.getListAccess().getKaLeftSquareBracketKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListAccess().getKaLeftSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getListAccess().getKaLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__KaAssignment_0"


    // $ANTLR start "rule__List__AtomAssignment_1_0"
    // InternalMyDsl.g:1936:1: rule__List__AtomAssignment_1_0 : ( ruleAtom ) ;
    public final void rule__List__AtomAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:1941:2: ( ruleAtom )
            {
            // InternalMyDsl.g:1941:2: ( ruleAtom )
            // InternalMyDsl.g:1942:3: ruleAtom
            {
             before(grammarAccess.getListAccess().getAtomAtomParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getListAccess().getAtomAtomParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__AtomAssignment_1_0"


    // $ANTLR start "rule__List__RestAssignment_1_1"
    // InternalMyDsl.g:1951:1: rule__List__RestAssignment_1_1 : ( ruleRest ) ;
    public final void rule__List__RestAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1955:1: ( ( ruleRest ) )
            // InternalMyDsl.g:1956:2: ( ruleRest )
            {
            // InternalMyDsl.g:1956:2: ( ruleRest )
            // InternalMyDsl.g:1957:3: ruleRest
            {
             before(grammarAccess.getListAccess().getRestRestParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRest();

            state._fsp--;

             after(grammarAccess.getListAccess().getRestRestParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__RestAssignment_1_1"


    // $ANTLR start "rule__List__KzAssignment_2"
    // InternalMyDsl.g:1966:1: rule__List__KzAssignment_2 : ( ( ']' ) ) ;
    public final void rule__List__KzAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ( ']' ) ) )
            // InternalMyDsl.g:1971:2: ( ( ']' ) )
            {
            // InternalMyDsl.g:1971:2: ( ( ']' ) )
            // InternalMyDsl.g:1972:3: ( ']' )
            {
             before(grammarAccess.getListAccess().getKzRightSquareBracketKeyword_2_0()); 
            // InternalMyDsl.g:1973:3: ( ']' )
            // InternalMyDsl.g:1974:4: ']'
            {
             before(grammarAccess.getListAccess().getKzRightSquareBracketKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListAccess().getKzRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getListAccess().getKzRightSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__KzAssignment_2"


    // $ANTLR start "rule__Rest__OptAssignment_0"
    // InternalMyDsl.g:1985:1: rule__Rest__OptAssignment_0 : ( ruleListOpt1 ) ;
    public final void rule__Rest__OptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( ( ruleListOpt1 ) )
            // InternalMyDsl.g:1990:2: ( ruleListOpt1 )
            {
            // InternalMyDsl.g:1990:2: ( ruleListOpt1 )
            // InternalMyDsl.g:1991:3: ruleListOpt1
            {
             before(grammarAccess.getRestAccess().getOptListOpt1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListOpt1();

            state._fsp--;

             after(grammarAccess.getRestAccess().getOptListOpt1ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__OptAssignment_0"


    // $ANTLR start "rule__ListOpt1__AtomAssignment_1"
    // InternalMyDsl.g:2000:1: rule__ListOpt1__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__ListOpt1__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2004:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:2005:2: ( ruleAtom )
            {
            // InternalMyDsl.g:2005:2: ( ruleAtom )
            // InternalMyDsl.g:2006:3: ruleAtom
            {
             before(grammarAccess.getListOpt1Access().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getListOpt1Access().getAtomAtomParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt1__AtomAssignment_1"


    // $ANTLR start "rule__ListOpt2__AtomAssignment_2"
    // InternalMyDsl.g:2015:1: rule__ListOpt2__AtomAssignment_2 : ( ruleAtom ) ;
    public final void rule__ListOpt2__AtomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:2020:2: ( ruleAtom )
            {
            // InternalMyDsl.g:2020:2: ( ruleAtom )
            // InternalMyDsl.g:2021:3: ruleAtom
            {
             before(grammarAccess.getListOpt2Access().getAtomAtomParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getListOpt2Access().getAtomAtomParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__AtomAssignment_2"


    // $ANTLR start "rule__ListOpt2__NextatomAssignment_3_1"
    // InternalMyDsl.g:2030:1: rule__ListOpt2__NextatomAssignment_3_1 : ( ruleAtom ) ;
    public final void rule__ListOpt2__NextatomAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:2035:2: ( ruleAtom )
            {
            // InternalMyDsl.g:2035:2: ( ruleAtom )
            // InternalMyDsl.g:2036:3: ruleAtom
            {
             before(grammarAccess.getListOpt2Access().getNextatomAtomParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getListOpt2Access().getNextatomAtomParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt2__NextatomAssignment_3_1"


    // $ANTLR start "rule__ListOpt3__AtomAssignment_1"
    // InternalMyDsl.g:2045:1: rule__ListOpt3__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__ListOpt3__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2049:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:2050:2: ( ruleAtom )
            {
            // InternalMyDsl.g:2050:2: ( ruleAtom )
            // InternalMyDsl.g:2051:3: ruleAtom
            {
             before(grammarAccess.getListOpt3Access().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getListOpt3Access().getAtomAtomParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__AtomAssignment_1"


    // $ANTLR start "rule__ListOpt3__NextatomAssignment_2_1"
    // InternalMyDsl.g:2060:1: rule__ListOpt3__NextatomAssignment_2_1 : ( ruleAtom ) ;
    public final void rule__ListOpt3__NextatomAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2064:1: ( ( ruleAtom ) )
            // InternalMyDsl.g:2065:2: ( ruleAtom )
            {
            // InternalMyDsl.g:2065:2: ( ruleAtom )
            // InternalMyDsl.g:2066:3: ruleAtom
            {
             before(grammarAccess.getListOpt3Access().getNextatomAtomParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getListOpt3Access().getNextatomAtomParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListOpt3__NextatomAssignment_2_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\101\uffff";
    static final String dfa_2s = "\1\4\1\21\1\4\3\17\2\4\1\16\7\17\1\4\2\uffff\2\4\4\17\1\4\3\25\3\17\2\4\3\17\1\4\3\25\1\4\3\17\1\4\1\25\6\17\1\4\3\17\1\4\1\25\6\17";
    static final String dfa_3s = "\1\4\1\21\1\24\3\22\1\25\1\24\1\20\3\25\4\22\1\25\2\uffff\1\24\1\6\3\25\1\22\1\6\6\25\1\24\1\6\3\25\1\6\3\25\1\6\3\25\1\6\7\25\1\6\3\25\1\6\7\25";
    static final String dfa_4s = "\21\uffff\1\2\1\1\56\uffff";
    static final String dfa_5s = "\101\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\15\uffff\1\6",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\11\1\12\1\13\16\uffff\1\14",
            "\1\15\1\16\1\17\15\uffff\1\20",
            "\1\22\1\uffff\1\21",
            "\1\24\3\uffff\1\23\1\uffff\1\14",
            "\1\24\3\uffff\1\23\1\uffff\1\14",
            "\1\24\3\uffff\1\23\1\uffff\1\14",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\25\1\26\1\27\16\uffff\1\30",
            "",
            "",
            "\1\32\1\33\1\34\15\uffff\1\31",
            "\1\35\1\36\1\37",
            "\1\41\3\uffff\1\40\1\uffff\1\30",
            "\1\41\3\uffff\1\40\1\uffff\1\30",
            "\1\41\3\uffff\1\40\1\uffff\1\30",
            "\1\7\2\uffff\1\10",
            "\1\42\1\43\1\44",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\45\5\uffff\1\14",
            "\1\45\5\uffff\1\14",
            "\1\45\5\uffff\1\14",
            "\1\46\1\47\1\50\15\uffff\1\51",
            "\1\52\1\53\1\54",
            "\1\55\5\uffff\1\56",
            "\1\55\5\uffff\1\56",
            "\1\55\5\uffff\1\56",
            "\1\57\1\60\1\61",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\62\1\63\1\64",
            "\1\65\5\uffff\1\30",
            "\1\65\5\uffff\1\30",
            "\1\65\5\uffff\1\30",
            "\1\66\1\67\1\70",
            "\1\14",
            "\1\45\5\uffff\1\14",
            "\1\45\5\uffff\1\14",
            "\1\45\5\uffff\1\14",
            "\1\71\5\uffff\1\72",
            "\1\71\5\uffff\1\72",
            "\1\71\5\uffff\1\72",
            "\1\73\1\74\1\75",
            "\1\55\5\uffff\1\56",
            "\1\55\5\uffff\1\56",
            "\1\55\5\uffff\1\56",
            "\1\76\1\77\1\100",
            "\1\30",
            "\1\65\5\uffff\1\30",
            "\1\65\5\uffff\1\30",
            "\1\65\5\uffff\1\30",
            "\1\71\5\uffff\1\72",
            "\1\71\5\uffff\1\72",
            "\1\71\5\uffff\1\72"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "459:1: rule__Clause__Alternatives : ( ( ( rule__Clause__FactAssignment_0 ) ) | ( ( rule__Clause__RuleAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000208000L});

}