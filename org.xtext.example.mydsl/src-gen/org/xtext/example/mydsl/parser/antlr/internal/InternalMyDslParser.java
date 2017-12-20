package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER2", "RULE_VARIABLE2", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'['", "']'", "'|'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Prologdsl";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrologdsl"
    // InternalMyDsl.g:64:1: entryRulePrologdsl returns [EObject current=null] : iv_rulePrologdsl= rulePrologdsl EOF ;
    public final EObject entryRulePrologdsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrologdsl = null;


        try {
            // InternalMyDsl.g:64:50: (iv_rulePrologdsl= rulePrologdsl EOF )
            // InternalMyDsl.g:65:2: iv_rulePrologdsl= rulePrologdsl EOF
            {
             newCompositeNode(grammarAccess.getPrologdslRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrologdsl=rulePrologdsl();

            state._fsp--;

             current =iv_rulePrologdsl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrologdsl"


    // $ANTLR start "rulePrologdsl"
    // InternalMyDsl.g:71:1: rulePrologdsl returns [EObject current=null] : ( ( (lv_progam_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) ) ;
    public final EObject rulePrologdsl() throws RecognitionException {
        EObject current = null;

        EObject lv_progam_0_0 = null;

        EObject lv_exquery_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_progam_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_progam_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_progam_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) ) )
            // InternalMyDsl.g:79:3: ( (lv_progam_0_0= ruleProgram ) ) ( (lv_exquery_1_0= ruleExquery ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_progam_0_0= ruleProgram ) )
            // InternalMyDsl.g:80:4: (lv_progam_0_0= ruleProgram )
            {
            // InternalMyDsl.g:80:4: (lv_progam_0_0= ruleProgram )
            // InternalMyDsl.g:81:5: lv_progam_0_0= ruleProgram
            {

            					newCompositeNode(grammarAccess.getPrologdslAccess().getProgamProgramParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_progam_0_0=ruleProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrologdslRule());
            					}
            					set(
            						current,
            						"progam",
            						lv_progam_0_0,
            						"org.xtext.example.mydsl.MyDsl.Program");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_exquery_1_0= ruleExquery ) )
            // InternalMyDsl.g:99:4: (lv_exquery_1_0= ruleExquery )
            {
            // InternalMyDsl.g:99:4: (lv_exquery_1_0= ruleExquery )
            // InternalMyDsl.g:100:5: lv_exquery_1_0= ruleExquery
            {

            					newCompositeNode(grammarAccess.getPrologdslAccess().getExqueryExqueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exquery_1_0=ruleExquery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrologdslRule());
            					}
            					set(
            						current,
            						"exquery",
            						lv_exquery_1_0,
            						"org.xtext.example.mydsl.MyDsl.Exquery");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrologdsl"


    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:121:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:121:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:122:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:128:1: ruleProgram returns [EObject current=null] : ( (lv_clause_0_0= ruleClause ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_clause_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( ( (lv_clause_0_0= ruleClause ) )+ )
            // InternalMyDsl.g:135:2: ( (lv_clause_0_0= ruleClause ) )+
            {
            // InternalMyDsl.g:135:2: ( (lv_clause_0_0= ruleClause ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:136:3: (lv_clause_0_0= ruleClause )
            	    {
            	    // InternalMyDsl.g:136:3: (lv_clause_0_0= ruleClause )
            	    // InternalMyDsl.g:137:4: lv_clause_0_0= ruleClause
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getClauseClauseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_4);
            	    lv_clause_0_0=ruleClause();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"clause",
            	    					lv_clause_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Clause");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // InternalMyDsl.g:157:1: entryRuleExquery returns [EObject current=null] : iv_ruleExquery= ruleExquery EOF ;
    public final EObject entryRuleExquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExquery = null;


        try {
            // InternalMyDsl.g:157:48: (iv_ruleExquery= ruleExquery EOF )
            // InternalMyDsl.g:158:2: iv_ruleExquery= ruleExquery EOF
            {
             newCompositeNode(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExquery=ruleExquery();

            state._fsp--;

             current =iv_ruleExquery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // InternalMyDsl.g:164:1: ruleExquery returns [EObject current=null] : (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) ;
    public final EObject ruleExquery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_query_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:170:2: ( (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) )
            // InternalMyDsl.g:171:2: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            {
            // InternalMyDsl.g:171:2: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            // InternalMyDsl.g:172:3: otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:176:3: ( (lv_query_1_0= ruleQuery ) )
            // InternalMyDsl.g:177:4: (lv_query_1_0= ruleQuery )
            {
            // InternalMyDsl.g:177:4: (lv_query_1_0= ruleQuery )
            // InternalMyDsl.g:178:5: lv_query_1_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_query_1_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExqueryRule());
            					}
            					set(
            						current,
            						"query",
            						lv_query_1_0,
            						"org.xtext.example.mydsl.MyDsl.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExqueryAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // InternalMyDsl.g:203:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalMyDsl.g:203:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalMyDsl.g:204:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMyDsl.g:210:1: ruleQuery returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nextpredicate_2_0= rulePredicate ) ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_nextpredicate_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:216:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nextpredicate_2_0= rulePredicate ) ) )* ) )
            // InternalMyDsl.g:217:2: ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nextpredicate_2_0= rulePredicate ) ) )* )
            {
            // InternalMyDsl.g:217:2: ( ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nextpredicate_2_0= rulePredicate ) ) )* )
            // InternalMyDsl.g:218:3: ( (lv_predicate_0_0= rulePredicate ) ) (otherlv_1= ',' ( (lv_nextpredicate_2_0= rulePredicate ) ) )*
            {
            // InternalMyDsl.g:218:3: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalMyDsl.g:219:4: (lv_predicate_0_0= rulePredicate )
            {
            // InternalMyDsl.g:219:4: (lv_predicate_0_0= rulePredicate )
            // InternalMyDsl.g:220:5: lv_predicate_0_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_0_0,
            						"org.xtext.example.mydsl.MyDsl.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:237:3: (otherlv_1= ',' ( (lv_nextpredicate_2_0= rulePredicate ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:238:4: otherlv_1= ',' ( (lv_nextpredicate_2_0= rulePredicate ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:242:4: ( (lv_nextpredicate_2_0= rulePredicate ) )
            	    // InternalMyDsl.g:243:5: (lv_nextpredicate_2_0= rulePredicate )
            	    {
            	    // InternalMyDsl.g:243:5: (lv_nextpredicate_2_0= rulePredicate )
            	    // InternalMyDsl.g:244:6: lv_nextpredicate_2_0= rulePredicate
            	    {

            	    						newCompositeNode(grammarAccess.getQueryAccess().getNextpredicatePredicateParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_nextpredicate_2_0=rulePredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQueryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nextpredicate",
            	    							lv_nextpredicate_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.Predicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleClause"
    // InternalMyDsl.g:266:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalMyDsl.g:266:47: (iv_ruleClause= ruleClause EOF )
            // InternalMyDsl.g:267:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalMyDsl.g:273:1: ruleClause returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject lv_fact_0_0 = null;

        EObject lv_rule_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) ) )
            // InternalMyDsl.g:280:2: ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) )
            {
            // InternalMyDsl.g:280:2: ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:281:3: ( (lv_fact_0_0= ruleFact ) )
                    {
                    // InternalMyDsl.g:281:3: ( (lv_fact_0_0= ruleFact ) )
                    // InternalMyDsl.g:282:4: (lv_fact_0_0= ruleFact )
                    {
                    // InternalMyDsl.g:282:4: (lv_fact_0_0= ruleFact )
                    // InternalMyDsl.g:283:5: lv_fact_0_0= ruleFact
                    {

                    					newCompositeNode(grammarAccess.getClauseAccess().getFactFactParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fact_0_0=ruleFact();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClauseRule());
                    					}
                    					set(
                    						current,
                    						"fact",
                    						lv_fact_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Fact");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:301:3: ( (lv_rule_1_0= ruleRule ) )
                    {
                    // InternalMyDsl.g:301:3: ( (lv_rule_1_0= ruleRule ) )
                    // InternalMyDsl.g:302:4: (lv_rule_1_0= ruleRule )
                    {
                    // InternalMyDsl.g:302:4: (lv_rule_1_0= ruleRule )
                    // InternalMyDsl.g:303:5: lv_rule_1_0= ruleRule
                    {

                    					newCompositeNode(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rule_1_0=ruleRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClauseRule());
                    					}
                    					set(
                    						current,
                    						"rule",
                    						lv_rule_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Rule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // InternalMyDsl.g:324:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // InternalMyDsl.g:324:45: (iv_ruleFact= ruleFact EOF )
            // InternalMyDsl.g:325:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalMyDsl.g:331:1: ruleFact returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_predicate_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:337:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' ) )
            // InternalMyDsl.g:338:2: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' )
            {
            // InternalMyDsl.g:338:2: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.' )
            // InternalMyDsl.g:339:3: ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= '.'
            {
            // InternalMyDsl.g:339:3: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalMyDsl.g:340:4: (lv_predicate_0_0= rulePredicate )
            {
            // InternalMyDsl.g:340:4: (lv_predicate_0_0= rulePredicate )
            // InternalMyDsl.g:341:5: lv_predicate_0_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getFactAccess().getPredicatePredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_0_0,
            						"org.xtext.example.mydsl.MyDsl.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFactAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:366:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMyDsl.g:366:45: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:367:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:373:1: ruleRule returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_query_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:379:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' ) )
            // InternalMyDsl.g:380:2: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' )
            {
            // InternalMyDsl.g:380:2: ( ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.' )
            // InternalMyDsl.g:381:3: ( (lv_predicate_0_0= rulePredicate ) ) otherlv_1= ':-' ( (lv_query_2_0= ruleQuery ) ) otherlv_3= '.'
            {
            // InternalMyDsl.g:381:3: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalMyDsl.g:382:4: (lv_predicate_0_0= rulePredicate )
            {
            // InternalMyDsl.g:382:4: (lv_predicate_0_0= rulePredicate )
            // InternalMyDsl.g:383:5: lv_predicate_0_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPredicatePredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_0_0,
            						"org.xtext.example.mydsl.MyDsl.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1());
            		
            // InternalMyDsl.g:404:3: ( (lv_query_2_0= ruleQuery ) )
            // InternalMyDsl.g:405:4: (lv_query_2_0= ruleQuery )
            {
            // InternalMyDsl.g:405:4: (lv_query_2_0= ruleQuery )
            // InternalMyDsl.g:406:5: lv_query_2_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_query_2_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"query",
            						lv_query_2_0,
            						"org.xtext.example.mydsl.MyDsl.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFullStopKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // InternalMyDsl.g:431:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalMyDsl.g:431:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalMyDsl.g:432:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMyDsl.g:438:1: rulePredicate returns [EObject current=null] : ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nextterm_4_0= ruleTerm ) ) )* otherlv_5= ')' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_functor_0_0 = null;

        EObject lv_term_2_0 = null;

        EObject lv_nextterm_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:444:2: ( ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nextterm_4_0= ruleTerm ) ) )* otherlv_5= ')' ) )
            // InternalMyDsl.g:445:2: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nextterm_4_0= ruleTerm ) ) )* otherlv_5= ')' )
            {
            // InternalMyDsl.g:445:2: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nextterm_4_0= ruleTerm ) ) )* otherlv_5= ')' )
            // InternalMyDsl.g:446:3: ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_nextterm_4_0= ruleTerm ) ) )* otherlv_5= ')'
            {
            // InternalMyDsl.g:446:3: ( (lv_functor_0_0= ruleFunctor ) )
            // InternalMyDsl.g:447:4: (lv_functor_0_0= ruleFunctor )
            {
            // InternalMyDsl.g:447:4: (lv_functor_0_0= ruleFunctor )
            // InternalMyDsl.g:448:5: lv_functor_0_0= ruleFunctor
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_functor_0_0=ruleFunctor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"functor",
            						lv_functor_0_0,
            						"org.xtext.example.mydsl.MyDsl.Functor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:469:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalMyDsl.g:470:4: (lv_term_2_0= ruleTerm )
            {
            // InternalMyDsl.g:470:4: (lv_term_2_0= ruleTerm )
            // InternalMyDsl.g:471:5: lv_term_2_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_term_2_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_2_0,
            						"org.xtext.example.mydsl.MyDsl.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:488:3: (otherlv_3= ',' ( (lv_nextterm_4_0= ruleTerm ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:489:4: otherlv_3= ',' ( (lv_nextterm_4_0= ruleTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPredicateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:493:4: ( (lv_nextterm_4_0= ruleTerm ) )
            	    // InternalMyDsl.g:494:5: (lv_nextterm_4_0= ruleTerm )
            	    {
            	    // InternalMyDsl.g:494:5: (lv_nextterm_4_0= ruleTerm )
            	    // InternalMyDsl.g:495:6: lv_nextterm_4_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPredicateAccess().getNexttermTermParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_nextterm_4_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPredicateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nextterm",
            	    							lv_nextterm_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // InternalMyDsl.g:521:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // InternalMyDsl.g:521:48: (iv_ruleFunctor= ruleFunctor EOF )
            // InternalMyDsl.g:522:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalMyDsl.g:528:1: ruleFunctor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:534:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:535:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:535:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:536:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:536:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:537:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFunctorAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFunctorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyDsl.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:556:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMyDsl.g:556:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMyDsl.g:557:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:563:1: ruleTerm returns [EObject current=null] : ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_1 = null;

        EObject lv_term_0_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:569:2: ( ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) ) )
            // InternalMyDsl.g:570:2: ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) )
            {
            // InternalMyDsl.g:570:2: ( ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) ) )
            // InternalMyDsl.g:571:3: ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) )
            {
            // InternalMyDsl.g:571:3: ( (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList ) )
            // InternalMyDsl.g:572:4: (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList )
            {
            // InternalMyDsl.g:572:4: (lv_term_0_1= ruleAtom | lv_term_0_2= ruleList )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_VARIABLE2)) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:573:5: lv_term_0_1= ruleAtom
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getTermAtomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_term_0_1=ruleAtom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"term",
                    						lv_term_0_1,
                    						"org.xtext.example.mydsl.MyDsl.Atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:589:5: lv_term_0_2= ruleList
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getTermListParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_term_0_2=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"term",
                    						lv_term_0_2,
                    						"org.xtext.example.mydsl.MyDsl.List");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // InternalMyDsl.g:610:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalMyDsl.g:610:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalMyDsl.g:611:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalMyDsl.g:617:1: ruleAtom returns [EObject current=null] : ( ( (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_at_0_1=null;
        Token lv_at_0_2=null;
        Token lv_at_0_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:623:2: ( ( ( (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 ) ) ) )
            // InternalMyDsl.g:624:2: ( ( (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 ) ) )
            {
            // InternalMyDsl.g:624:2: ( ( (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 ) ) )
            // InternalMyDsl.g:625:3: ( (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 ) )
            {
            // InternalMyDsl.g:625:3: ( (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 ) )
            // InternalMyDsl.g:626:4: (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 )
            {
            // InternalMyDsl.g:626:4: (lv_at_0_1= RULE_ID | lv_at_0_2= RULE_NUMBER2 | lv_at_0_3= RULE_VARIABLE2 )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_NUMBER2:
                {
                alt6=2;
                }
                break;
            case RULE_VARIABLE2:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:627:5: lv_at_0_1= RULE_ID
                    {
                    lv_at_0_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_at_0_1, grammarAccess.getAtomAccess().getAtIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"at",
                    						lv_at_0_1,
                    						"org.xtext.example.mydsl.MyDsl.ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:642:5: lv_at_0_2= RULE_NUMBER2
                    {
                    lv_at_0_2=(Token)match(input,RULE_NUMBER2,FOLLOW_2); 

                    					newLeafNode(lv_at_0_2, grammarAccess.getAtomAccess().getAtNUMBER2TerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"at",
                    						lv_at_0_2,
                    						"org.xtext.example.mydsl.MyDsl.NUMBER2");
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:657:5: lv_at_0_3= RULE_VARIABLE2
                    {
                    lv_at_0_3=(Token)match(input,RULE_VARIABLE2,FOLLOW_2); 

                    					newLeafNode(lv_at_0_3, grammarAccess.getAtomAccess().getAtVARIABLE2TerminalRuleCall_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"at",
                    						lv_at_0_3,
                    						"org.xtext.example.mydsl.MyDsl.VARIABLE2");
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:677:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMyDsl.g:677:45: (iv_ruleList= ruleList EOF )
            // InternalMyDsl.g:678:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:684:1: ruleList returns [EObject current=null] : ( ( (lv_ka_0_0= '[' ) ) ( ( (lv_atom_1_0= ruleAtom ) ) ( (lv_rest_2_0= ruleRest ) )? )? ( (lv_kz_3_0= ']' ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token lv_ka_0_0=null;
        Token lv_kz_3_0=null;
        EObject lv_atom_1_0 = null;

        EObject lv_rest_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:690:2: ( ( ( (lv_ka_0_0= '[' ) ) ( ( (lv_atom_1_0= ruleAtom ) ) ( (lv_rest_2_0= ruleRest ) )? )? ( (lv_kz_3_0= ']' ) ) ) )
            // InternalMyDsl.g:691:2: ( ( (lv_ka_0_0= '[' ) ) ( ( (lv_atom_1_0= ruleAtom ) ) ( (lv_rest_2_0= ruleRest ) )? )? ( (lv_kz_3_0= ']' ) ) )
            {
            // InternalMyDsl.g:691:2: ( ( (lv_ka_0_0= '[' ) ) ( ( (lv_atom_1_0= ruleAtom ) ) ( (lv_rest_2_0= ruleRest ) )? )? ( (lv_kz_3_0= ']' ) ) )
            // InternalMyDsl.g:692:3: ( (lv_ka_0_0= '[' ) ) ( ( (lv_atom_1_0= ruleAtom ) ) ( (lv_rest_2_0= ruleRest ) )? )? ( (lv_kz_3_0= ']' ) )
            {
            // InternalMyDsl.g:692:3: ( (lv_ka_0_0= '[' ) )
            // InternalMyDsl.g:693:4: (lv_ka_0_0= '[' )
            {
            // InternalMyDsl.g:693:4: (lv_ka_0_0= '[' )
            // InternalMyDsl.g:694:5: lv_ka_0_0= '['
            {
            lv_ka_0_0=(Token)match(input,19,FOLLOW_12); 

            					newLeafNode(lv_ka_0_0, grammarAccess.getListAccess().getKaLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListRule());
            					}
            					setWithLastConsumed(current, "ka", lv_ka_0_0, "[");
            				

            }


            }

            // InternalMyDsl.g:706:3: ( ( (lv_atom_1_0= ruleAtom ) ) ( (lv_rest_2_0= ruleRest ) )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_VARIABLE2)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:707:4: ( (lv_atom_1_0= ruleAtom ) ) ( (lv_rest_2_0= ruleRest ) )?
                    {
                    // InternalMyDsl.g:707:4: ( (lv_atom_1_0= ruleAtom ) )
                    // InternalMyDsl.g:708:5: (lv_atom_1_0= ruleAtom )
                    {
                    // InternalMyDsl.g:708:5: (lv_atom_1_0= ruleAtom )
                    // InternalMyDsl.g:709:6: lv_atom_1_0= ruleAtom
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getAtomAtomParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_atom_1_0=ruleAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"atom",
                    							lv_atom_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:726:4: ( (lv_rest_2_0= ruleRest ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15||LA7_0==21) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:727:5: (lv_rest_2_0= ruleRest )
                            {
                            // InternalMyDsl.g:727:5: (lv_rest_2_0= ruleRest )
                            // InternalMyDsl.g:728:6: lv_rest_2_0= ruleRest
                            {

                            						newCompositeNode(grammarAccess.getListAccess().getRestRestParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_14);
                            lv_rest_2_0=ruleRest();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getListRule());
                            						}
                            						set(
                            							current,
                            							"rest",
                            							lv_rest_2_0,
                            							"org.xtext.example.mydsl.MyDsl.Rest");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:746:3: ( (lv_kz_3_0= ']' ) )
            // InternalMyDsl.g:747:4: (lv_kz_3_0= ']' )
            {
            // InternalMyDsl.g:747:4: (lv_kz_3_0= ']' )
            // InternalMyDsl.g:748:5: lv_kz_3_0= ']'
            {
            lv_kz_3_0=(Token)match(input,20,FOLLOW_2); 

            					newLeafNode(lv_kz_3_0, grammarAccess.getListAccess().getKzRightSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListRule());
            					}
            					setWithLastConsumed(current, "kz", lv_kz_3_0, "]");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleRest"
    // InternalMyDsl.g:764:1: entryRuleRest returns [EObject current=null] : iv_ruleRest= ruleRest EOF ;
    public final EObject entryRuleRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRest = null;


        try {
            // InternalMyDsl.g:764:45: (iv_ruleRest= ruleRest EOF )
            // InternalMyDsl.g:765:2: iv_ruleRest= ruleRest EOF
            {
             newCompositeNode(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRest=ruleRest();

            state._fsp--;

             current =iv_ruleRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMyDsl.g:771:1: ruleRest returns [EObject current=null] : ( ( (lv_opt_0_0= ruleListOpt1 ) ) | this_ListOpt2_1= ruleListOpt2 | this_ListOpt3_2= ruleListOpt3 ) ;
    public final EObject ruleRest() throws RecognitionException {
        EObject current = null;

        EObject lv_opt_0_0 = null;

        EObject this_ListOpt2_1 = null;

        EObject this_ListOpt3_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:777:2: ( ( ( (lv_opt_0_0= ruleListOpt1 ) ) | this_ListOpt2_1= ruleListOpt2 | this_ListOpt3_2= ruleListOpt3 ) )
            // InternalMyDsl.g:778:2: ( ( (lv_opt_0_0= ruleListOpt1 ) ) | this_ListOpt2_1= ruleListOpt2 | this_ListOpt3_2= ruleListOpt3 )
            {
            // InternalMyDsl.g:778:2: ( ( (lv_opt_0_0= ruleListOpt1 ) ) | this_ListOpt2_1= ruleListOpt2 | this_ListOpt3_2= ruleListOpt3 )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=RULE_ID && LA9_1<=RULE_VARIABLE2)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==19) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==15) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:779:3: ( (lv_opt_0_0= ruleListOpt1 ) )
                    {
                    // InternalMyDsl.g:779:3: ( (lv_opt_0_0= ruleListOpt1 ) )
                    // InternalMyDsl.g:780:4: (lv_opt_0_0= ruleListOpt1 )
                    {
                    // InternalMyDsl.g:780:4: (lv_opt_0_0= ruleListOpt1 )
                    // InternalMyDsl.g:781:5: lv_opt_0_0= ruleListOpt1
                    {

                    					newCompositeNode(grammarAccess.getRestAccess().getOptListOpt1ParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_opt_0_0=ruleListOpt1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRestRule());
                    					}
                    					set(
                    						current,
                    						"opt",
                    						lv_opt_0_0,
                    						"org.xtext.example.mydsl.MyDsl.ListOpt1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:799:3: this_ListOpt2_1= ruleListOpt2
                    {

                    			newCompositeNode(grammarAccess.getRestAccess().getListOpt2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListOpt2_1=ruleListOpt2();

                    state._fsp--;


                    			current = this_ListOpt2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:808:3: this_ListOpt3_2= ruleListOpt3
                    {

                    			newCompositeNode(grammarAccess.getRestAccess().getListOpt3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListOpt3_2=ruleListOpt3();

                    state._fsp--;


                    			current = this_ListOpt3_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleListOpt1"
    // InternalMyDsl.g:820:1: entryRuleListOpt1 returns [EObject current=null] : iv_ruleListOpt1= ruleListOpt1 EOF ;
    public final EObject entryRuleListOpt1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOpt1 = null;


        try {
            // InternalMyDsl.g:820:49: (iv_ruleListOpt1= ruleListOpt1 EOF )
            // InternalMyDsl.g:821:2: iv_ruleListOpt1= ruleListOpt1 EOF
            {
             newCompositeNode(grammarAccess.getListOpt1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOpt1=ruleListOpt1();

            state._fsp--;

             current =iv_ruleListOpt1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOpt1"


    // $ANTLR start "ruleListOpt1"
    // InternalMyDsl.g:827:1: ruleListOpt1 returns [EObject current=null] : (otherlv_0= '|' ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleListOpt1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atom_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:833:2: ( (otherlv_0= '|' ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalMyDsl.g:834:2: (otherlv_0= '|' ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalMyDsl.g:834:2: (otherlv_0= '|' ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalMyDsl.g:835:3: otherlv_0= '|' ( (lv_atom_1_0= ruleAtom ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getListOpt1Access().getVerticalLineKeyword_0());
            		
            // InternalMyDsl.g:839:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalMyDsl.g:840:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalMyDsl.g:840:4: (lv_atom_1_0= ruleAtom )
            // InternalMyDsl.g:841:5: lv_atom_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getListOpt1Access().getAtomAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_atom_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOpt1Rule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_1_0,
            						"org.xtext.example.mydsl.MyDsl.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOpt1"


    // $ANTLR start "entryRuleListOpt2"
    // InternalMyDsl.g:862:1: entryRuleListOpt2 returns [EObject current=null] : iv_ruleListOpt2= ruleListOpt2 EOF ;
    public final EObject entryRuleListOpt2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOpt2 = null;


        try {
            // InternalMyDsl.g:862:49: (iv_ruleListOpt2= ruleListOpt2 EOF )
            // InternalMyDsl.g:863:2: iv_ruleListOpt2= ruleListOpt2 EOF
            {
             newCompositeNode(grammarAccess.getListOpt2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOpt2=ruleListOpt2();

            state._fsp--;

             current =iv_ruleListOpt2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOpt2"


    // $ANTLR start "ruleListOpt2"
    // InternalMyDsl.g:869:1: ruleListOpt2 returns [EObject current=null] : (otherlv_0= '|' otherlv_1= '[' ( (lv_atom_2_0= ruleAtom ) ) (otherlv_3= ',' ( (lv_nextatom_4_0= ruleAtom ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleListOpt2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_atom_2_0 = null;

        EObject lv_nextatom_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:875:2: ( (otherlv_0= '|' otherlv_1= '[' ( (lv_atom_2_0= ruleAtom ) ) (otherlv_3= ',' ( (lv_nextatom_4_0= ruleAtom ) ) )* otherlv_5= ']' ) )
            // InternalMyDsl.g:876:2: (otherlv_0= '|' otherlv_1= '[' ( (lv_atom_2_0= ruleAtom ) ) (otherlv_3= ',' ( (lv_nextatom_4_0= ruleAtom ) ) )* otherlv_5= ']' )
            {
            // InternalMyDsl.g:876:2: (otherlv_0= '|' otherlv_1= '[' ( (lv_atom_2_0= ruleAtom ) ) (otherlv_3= ',' ( (lv_nextatom_4_0= ruleAtom ) ) )* otherlv_5= ']' )
            // InternalMyDsl.g:877:3: otherlv_0= '|' otherlv_1= '[' ( (lv_atom_2_0= ruleAtom ) ) (otherlv_3= ',' ( (lv_nextatom_4_0= ruleAtom ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getListOpt2Access().getVerticalLineKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getListOpt2Access().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:885:3: ( (lv_atom_2_0= ruleAtom ) )
            // InternalMyDsl.g:886:4: (lv_atom_2_0= ruleAtom )
            {
            // InternalMyDsl.g:886:4: (lv_atom_2_0= ruleAtom )
            // InternalMyDsl.g:887:5: lv_atom_2_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getListOpt2Access().getAtomAtomParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_atom_2_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOpt2Rule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_2_0,
            						"org.xtext.example.mydsl.MyDsl.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:904:3: (otherlv_3= ',' ( (lv_nextatom_4_0= ruleAtom ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:905:4: otherlv_3= ',' ( (lv_nextatom_4_0= ruleAtom ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getListOpt2Access().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:909:4: ( (lv_nextatom_4_0= ruleAtom ) )
            	    // InternalMyDsl.g:910:5: (lv_nextatom_4_0= ruleAtom )
            	    {
            	    // InternalMyDsl.g:910:5: (lv_nextatom_4_0= ruleAtom )
            	    // InternalMyDsl.g:911:6: lv_nextatom_4_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getListOpt2Access().getNextatomAtomParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_nextatom_4_0=ruleAtom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOpt2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"nextatom",
            	    							lv_nextatom_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Atom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getListOpt2Access().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOpt2"


    // $ANTLR start "entryRuleListOpt3"
    // InternalMyDsl.g:937:1: entryRuleListOpt3 returns [EObject current=null] : iv_ruleListOpt3= ruleListOpt3 EOF ;
    public final EObject entryRuleListOpt3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOpt3 = null;


        try {
            // InternalMyDsl.g:937:49: (iv_ruleListOpt3= ruleListOpt3 EOF )
            // InternalMyDsl.g:938:2: iv_ruleListOpt3= ruleListOpt3 EOF
            {
             newCompositeNode(grammarAccess.getListOpt3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOpt3=ruleListOpt3();

            state._fsp--;

             current =iv_ruleListOpt3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOpt3"


    // $ANTLR start "ruleListOpt3"
    // InternalMyDsl.g:944:1: ruleListOpt3 returns [EObject current=null] : (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) (otherlv_2= ',' ( (lv_nextatom_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleListOpt3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_atom_1_0 = null;

        EObject lv_nextatom_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:950:2: ( (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) (otherlv_2= ',' ( (lv_nextatom_3_0= ruleAtom ) ) )* ) )
            // InternalMyDsl.g:951:2: (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) (otherlv_2= ',' ( (lv_nextatom_3_0= ruleAtom ) ) )* )
            {
            // InternalMyDsl.g:951:2: (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) (otherlv_2= ',' ( (lv_nextatom_3_0= ruleAtom ) ) )* )
            // InternalMyDsl.g:952:3: otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) (otherlv_2= ',' ( (lv_nextatom_3_0= ruleAtom ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getListOpt3Access().getCommaKeyword_0());
            		
            // InternalMyDsl.g:956:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalMyDsl.g:957:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalMyDsl.g:957:4: (lv_atom_1_0= ruleAtom )
            // InternalMyDsl.g:958:5: lv_atom_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getListOpt3Access().getAtomAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_atom_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOpt3Rule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_1_0,
            						"org.xtext.example.mydsl.MyDsl.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:975:3: (otherlv_2= ',' ( (lv_nextatom_3_0= ruleAtom ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:976:4: otherlv_2= ',' ( (lv_nextatom_3_0= ruleAtom ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getListOpt3Access().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:980:4: ( (lv_nextatom_3_0= ruleAtom ) )
            	    // InternalMyDsl.g:981:5: (lv_nextatom_3_0= ruleAtom )
            	    {
            	    // InternalMyDsl.g:981:5: (lv_nextatom_3_0= ruleAtom )
            	    // InternalMyDsl.g:982:6: lv_nextatom_3_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getListOpt3Access().getNextatomAtomParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_nextatom_3_0=ruleAtom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOpt3Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"nextatom",
            	    							lv_nextatom_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Atom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOpt3"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\101\uffff";
    static final String dfa_2s = "\1\4\1\21\1\4\3\17\2\4\1\16\7\17\1\4\2\uffff\2\4\4\17\3\24\1\4\3\17\2\4\3\17\1\4\3\24\1\4\3\17\1\4\1\24\6\17\1\4\3\17\1\4\1\24\6\17";
    static final String dfa_3s = "\1\4\1\21\1\23\3\22\1\24\1\23\1\20\3\25\4\22\1\24\2\uffff\1\23\1\6\3\25\1\22\3\24\1\6\3\24\1\23\1\6\3\24\1\6\3\24\1\6\3\24\1\6\7\24\1\6\3\24\1\6\7\24";
    static final String dfa_4s = "\21\uffff\1\1\1\2\56\uffff";
    static final String dfa_5s = "\101\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\14\uffff\1\6",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\11\1\12\1\13\15\uffff\1\14",
            "\1\15\1\16\1\17\14\uffff\1\20",
            "\1\21\1\uffff\1\22",
            "\1\24\4\uffff\1\14\1\23",
            "\1\24\4\uffff\1\14\1\23",
            "\1\24\4\uffff\1\14\1\23",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\7\2\uffff\1\10",
            "\1\25\1\26\1\27\15\uffff\1\30",
            "",
            "",
            "\1\31\1\32\1\33\14\uffff\1\34",
            "\1\35\1\36\1\37",
            "\1\41\4\uffff\1\30\1\40",
            "\1\41\4\uffff\1\30\1\40",
            "\1\41\4\uffff\1\30\1\40",
            "\1\7\2\uffff\1\10",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\42\1\43\1\44",
            "\1\45\4\uffff\1\14",
            "\1\45\4\uffff\1\14",
            "\1\45\4\uffff\1\14",
            "\1\46\1\47\1\50\14\uffff\1\51",
            "\1\52\1\53\1\54",
            "\1\55\4\uffff\1\56",
            "\1\55\4\uffff\1\56",
            "\1\55\4\uffff\1\56",
            "\1\57\1\60\1\61",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\62\1\63\1\64",
            "\1\65\4\uffff\1\30",
            "\1\65\4\uffff\1\30",
            "\1\65\4\uffff\1\30",
            "\1\66\1\67\1\70",
            "\1\14",
            "\1\45\4\uffff\1\14",
            "\1\45\4\uffff\1\14",
            "\1\45\4\uffff\1\14",
            "\1\71\4\uffff\1\72",
            "\1\71\4\uffff\1\72",
            "\1\71\4\uffff\1\72",
            "\1\73\1\74\1\75",
            "\1\55\4\uffff\1\56",
            "\1\55\4\uffff\1\56",
            "\1\55\4\uffff\1\56",
            "\1\76\1\77\1\100",
            "\1\30",
            "\1\65\4\uffff\1\30",
            "\1\65\4\uffff\1\30",
            "\1\65\4\uffff\1\30",
            "\1\71\4\uffff\1\72",
            "\1\71\4\uffff\1\72",
            "\1\71\4\uffff\1\72"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "280:2: ( ( (lv_fact_0_0= ruleFact ) ) | ( (lv_rule_1_0= ruleRule ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000108000L});

}