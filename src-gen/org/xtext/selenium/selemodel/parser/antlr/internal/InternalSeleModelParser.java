package org.xtext.selenium.selemodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.selenium.selemodel.services.SeleModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'", "'{'", "'}'", "'function'", "'('", "','", "')'", "'assert'", "'equal'", "'contain'", "'var'", "'='", "'.'", "'length'", "'fill'", "'click'", "'navigate'", "'choose'", "'check'", "'uncheck'", "'openbrowser'", "'['", "']'", "'[['", "']]'", "'.parent'", "'.child'", "'firefox'", "'default'", "'chrome'", "'id'", "'class'", "'inner'", "'value'", "'href'", "'title'", "'type'", "'alt'", "'Elm'", "'Body'", "'Input'", "'Div'", "'Select'", "'Link'", "'Img'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSeleModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeleModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeleModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSeleModel.g"; }



     	private SeleModelGrammarAccess grammarAccess;

        public InternalSeleModelParser(TokenStream input, SeleModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SeleModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSeleModel.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSeleModel.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSeleModel.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSeleModel.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_main_0_0= ruleMain ) ) ( (lv_functions_1_0= ruleFunction ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:77:2: ( ( ( (lv_main_0_0= ruleMain ) ) ( (lv_functions_1_0= ruleFunction ) )* ) )
            // InternalSeleModel.g:78:2: ( ( (lv_main_0_0= ruleMain ) ) ( (lv_functions_1_0= ruleFunction ) )* )
            {
            // InternalSeleModel.g:78:2: ( ( (lv_main_0_0= ruleMain ) ) ( (lv_functions_1_0= ruleFunction ) )* )
            // InternalSeleModel.g:79:3: ( (lv_main_0_0= ruleMain ) ) ( (lv_functions_1_0= ruleFunction ) )*
            {
            // InternalSeleModel.g:79:3: ( (lv_main_0_0= ruleMain ) )
            // InternalSeleModel.g:80:4: (lv_main_0_0= ruleMain )
            {
            // InternalSeleModel.g:80:4: (lv_main_0_0= ruleMain )
            // InternalSeleModel.g:81:5: lv_main_0_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMainMainParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_main_0_0=ruleMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_0_0,
            						"org.xtext.selenium.selemodel.SeleModel.Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleModel.g:98:3: ( (lv_functions_1_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleModel.g:99:4: (lv_functions_1_0= ruleFunction )
            	    {
            	    // InternalSeleModel.g:99:4: (lv_functions_1_0= ruleFunction )
            	    // InternalSeleModel.g:100:5: lv_functions_1_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_functions_1_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_1_0,
            	    						"org.xtext.selenium.selemodel.SeleModel.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMain"
    // InternalSeleModel.g:121:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalSeleModel.g:121:45: (iv_ruleMain= ruleMain EOF )
            // InternalSeleModel.g:122:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalSeleModel.g:128:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:134:2: ( (otherlv_0= 'main' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' ) )
            // InternalSeleModel.g:135:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            {
            // InternalSeleModel.g:135:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}' )
            // InternalSeleModel.g:136:3: otherlv_0= 'main' otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSeleModel.g:144:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==18||LA2_0==21||(LA2_0>=25 && LA2_0<=31)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeleModel.g:145:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalSeleModel.g:145:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalSeleModel.g:146:5: lv_expressions_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getMainAccess().getExpressionsExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_2_0,
            	    						"org.xtext.selenium.selemodel.SeleModel.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFunction"
    // InternalSeleModel.g:171:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalSeleModel.g:171:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalSeleModel.g:172:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalSeleModel.g:178:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_expressions_8_0= ruleExpression ) )* otherlv_9= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_param_3_0 = null;

        EObject lv_param_5_0 = null;

        EObject lv_expressions_8_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:184:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_expressions_8_0= ruleExpression ) )* otherlv_9= '}' ) )
            // InternalSeleModel.g:185:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_expressions_8_0= ruleExpression ) )* otherlv_9= '}' )
            {
            // InternalSeleModel.g:185:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_expressions_8_0= ruleExpression ) )* otherlv_9= '}' )
            // InternalSeleModel.g:186:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_param_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_expressions_8_0= ruleExpression ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalSeleModel.g:190:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSeleModel.g:191:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSeleModel.g:191:4: (lv_name_1_0= RULE_ID )
            // InternalSeleModel.g:192:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSeleModel.g:212:3: ( ( (lv_param_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleModel.g:213:4: ( (lv_param_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )*
                    {
                    // InternalSeleModel.g:213:4: ( (lv_param_3_0= ruleDeclaration ) )
                    // InternalSeleModel.g:214:5: (lv_param_3_0= ruleDeclaration )
                    {
                    // InternalSeleModel.g:214:5: (lv_param_3_0= ruleDeclaration )
                    // InternalSeleModel.g:215:6: lv_param_3_0= ruleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getParamDeclarationParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_param_3_0=ruleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"param",
                    							lv_param_3_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSeleModel.g:232:4: (otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSeleModel.g:233:5: otherlv_4= ',' ( (lv_param_5_0= ruleDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSeleModel.g:237:5: ( (lv_param_5_0= ruleDeclaration ) )
                    	    // InternalSeleModel.g:238:6: (lv_param_5_0= ruleDeclaration )
                    	    {
                    	    // InternalSeleModel.g:238:6: (lv_param_5_0= ruleDeclaration )
                    	    // InternalSeleModel.g:239:7: lv_param_5_0= ruleDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getParamDeclarationParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_param_5_0=ruleDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"param",
                    	    								lv_param_5_0,
                    	    								"org.xtext.selenium.selemodel.SeleModel.Declaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSeleModel.g:266:3: ( (lv_expressions_8_0= ruleExpression ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==18||LA5_0==21||(LA5_0>=25 && LA5_0<=31)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSeleModel.g:267:4: (lv_expressions_8_0= ruleExpression )
            	    {
            	    // InternalSeleModel.g:267:4: (lv_expressions_8_0= ruleExpression )
            	    // InternalSeleModel.g:268:5: lv_expressions_8_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getExpressionsExpressionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_expressions_8_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_8_0,
            	    						"org.xtext.selenium.selemodel.SeleModel.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalSeleModel.g:293:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSeleModel.g:293:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSeleModel.g:294:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalSeleModel.g:300:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_param_2_0= ruleAttribuable ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:306:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_param_2_0= ruleAttribuable ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )* )? otherlv_5= ')' ) )
            // InternalSeleModel.g:307:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_param_2_0= ruleAttribuable ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )* )? otherlv_5= ')' )
            {
            // InternalSeleModel.g:307:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_param_2_0= ruleAttribuable ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )* )? otherlv_5= ')' )
            // InternalSeleModel.g:308:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_param_2_0= ruleAttribuable ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )* )? otherlv_5= ')'
            {
            // InternalSeleModel.g:308:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeleModel.g:309:4: (otherlv_0= RULE_ID )
            {
            // InternalSeleModel.g:309:4: (otherlv_0= RULE_ID )
            // InternalSeleModel.g:310:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getRefFunctionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSeleModel.g:325:3: ( ( (lv_param_2_0= ruleAttribuable ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==32||LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleModel.g:326:4: ( (lv_param_2_0= ruleAttribuable ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )*
                    {
                    // InternalSeleModel.g:326:4: ( (lv_param_2_0= ruleAttribuable ) )
                    // InternalSeleModel.g:327:5: (lv_param_2_0= ruleAttribuable )
                    {
                    // InternalSeleModel.g:327:5: (lv_param_2_0= ruleAttribuable )
                    // InternalSeleModel.g:328:6: lv_param_2_0= ruleAttribuable
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamAttribuableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_param_2_0=ruleAttribuable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"param",
                    							lv_param_2_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Attribuable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSeleModel.g:345:4: (otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSeleModel.g:346:5: otherlv_3= ',' ( (lv_param_4_0= ruleAttribuable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSeleModel.g:350:5: ( (lv_param_4_0= ruleAttribuable ) )
                    	    // InternalSeleModel.g:351:6: (lv_param_4_0= ruleAttribuable )
                    	    {
                    	    // InternalSeleModel.g:351:6: (lv_param_4_0= ruleAttribuable )
                    	    // InternalSeleModel.g:352:7: lv_param_4_0= ruleAttribuable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getParamAttribuableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_param_4_0=ruleAttribuable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"param",
                    	    								lv_param_4_0,
                    	    								"org.xtext.selenium.selemodel.SeleModel.Attribuable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleExpression"
    // InternalSeleModel.g:379:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSeleModel.g:379:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSeleModel.g:380:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSeleModel.g:386:1: ruleExpression returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_att_1_0= ruleAttribution ) ) | ( (lv_act_2_0= ruleAction ) ) | ( (lv_ass_3_0= ruleAssertion ) ) | this_FunctionCall_4= ruleFunctionCall ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_att_1_0 = null;

        EObject lv_act_2_0 = null;

        EObject lv_ass_3_0 = null;

        EObject this_FunctionCall_4 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:392:2: ( ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_att_1_0= ruleAttribution ) ) | ( (lv_act_2_0= ruleAction ) ) | ( (lv_ass_3_0= ruleAssertion ) ) | this_FunctionCall_4= ruleFunctionCall ) )
            // InternalSeleModel.g:393:2: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_att_1_0= ruleAttribution ) ) | ( (lv_act_2_0= ruleAction ) ) | ( (lv_ass_3_0= ruleAssertion ) ) | this_FunctionCall_4= ruleFunctionCall )
            {
            // InternalSeleModel.g:393:2: ( ( (lv_dec_0_0= ruleDeclaration ) ) | ( (lv_att_1_0= ruleAttribution ) ) | ( (lv_act_2_0= ruleAction ) ) | ( (lv_ass_3_0= ruleAssertion ) ) | this_FunctionCall_4= ruleFunctionCall )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==15) ) {
                    alt8=5;
                }
                else if ( (LA8_2==22) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSeleModel.g:394:3: ( (lv_dec_0_0= ruleDeclaration ) )
                    {
                    // InternalSeleModel.g:394:3: ( (lv_dec_0_0= ruleDeclaration ) )
                    // InternalSeleModel.g:395:4: (lv_dec_0_0= ruleDeclaration )
                    {
                    // InternalSeleModel.g:395:4: (lv_dec_0_0= ruleDeclaration )
                    // InternalSeleModel.g:396:5: lv_dec_0_0= ruleDeclaration
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getDecDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dec_0_0=ruleDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"dec",
                    						lv_dec_0_0,
                    						"org.xtext.selenium.selemodel.SeleModel.Declaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:414:3: ( (lv_att_1_0= ruleAttribution ) )
                    {
                    // InternalSeleModel.g:414:3: ( (lv_att_1_0= ruleAttribution ) )
                    // InternalSeleModel.g:415:4: (lv_att_1_0= ruleAttribution )
                    {
                    // InternalSeleModel.g:415:4: (lv_att_1_0= ruleAttribution )
                    // InternalSeleModel.g:416:5: lv_att_1_0= ruleAttribution
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getAttAttributionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_att_1_0=ruleAttribution();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"att",
                    						lv_att_1_0,
                    						"org.xtext.selenium.selemodel.SeleModel.Attribution");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSeleModel.g:434:3: ( (lv_act_2_0= ruleAction ) )
                    {
                    // InternalSeleModel.g:434:3: ( (lv_act_2_0= ruleAction ) )
                    // InternalSeleModel.g:435:4: (lv_act_2_0= ruleAction )
                    {
                    // InternalSeleModel.g:435:4: (lv_act_2_0= ruleAction )
                    // InternalSeleModel.g:436:5: lv_act_2_0= ruleAction
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getActActionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_act_2_0=ruleAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"act",
                    						lv_act_2_0,
                    						"org.xtext.selenium.selemodel.SeleModel.Action");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSeleModel.g:454:3: ( (lv_ass_3_0= ruleAssertion ) )
                    {
                    // InternalSeleModel.g:454:3: ( (lv_ass_3_0= ruleAssertion ) )
                    // InternalSeleModel.g:455:4: (lv_ass_3_0= ruleAssertion )
                    {
                    // InternalSeleModel.g:455:4: (lv_ass_3_0= ruleAssertion )
                    // InternalSeleModel.g:456:5: lv_ass_3_0= ruleAssertion
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getAssAssertionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ass_3_0=ruleAssertion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"ass",
                    						lv_ass_3_0,
                    						"org.xtext.selenium.selemodel.SeleModel.Assertion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSeleModel.g:474:3: this_FunctionCall_4= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_4=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_4;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssertion"
    // InternalSeleModel.g:486:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalSeleModel.g:486:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalSeleModel.g:487:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
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
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalSeleModel.g:493:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' ( ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) ) | ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_att1_1_0 = null;

        EObject lv_att2_3_0 = null;

        EObject lv_con1_4_0 = null;

        EObject lv_con2_6_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:499:2: ( (otherlv_0= 'assert' ( ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) ) | ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) ) ) ) )
            // InternalSeleModel.g:500:2: (otherlv_0= 'assert' ( ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) ) | ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) ) ) )
            {
            // InternalSeleModel.g:500:2: (otherlv_0= 'assert' ( ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) ) | ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) ) ) )
            // InternalSeleModel.g:501:3: otherlv_0= 'assert' ( ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) ) | ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
            		
            // InternalSeleModel.g:505:3: ( ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) ) | ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalSeleModel.g:506:4: ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) )
                    {
                    // InternalSeleModel.g:506:4: ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) )
                    // InternalSeleModel.g:507:5: ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) )
                    {
                    // InternalSeleModel.g:507:5: ( (lv_att1_1_0= ruleAttribuable ) )
                    // InternalSeleModel.g:508:6: (lv_att1_1_0= ruleAttribuable )
                    {
                    // InternalSeleModel.g:508:6: (lv_att1_1_0= ruleAttribuable )
                    // InternalSeleModel.g:509:7: lv_att1_1_0= ruleAttribuable
                    {

                    							newCompositeNode(grammarAccess.getAssertionAccess().getAtt1AttribuableParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_att1_1_0=ruleAttribuable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertionRule());
                    							}
                    							set(
                    								current,
                    								"att1",
                    								lv_att1_1_0,
                    								"org.xtext.selenium.selemodel.SeleModel.Attribuable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getEqualKeyword_1_0_1());
                    				
                    // InternalSeleModel.g:530:5: ( (lv_att2_3_0= ruleAttribuable ) )
                    // InternalSeleModel.g:531:6: (lv_att2_3_0= ruleAttribuable )
                    {
                    // InternalSeleModel.g:531:6: (lv_att2_3_0= ruleAttribuable )
                    // InternalSeleModel.g:532:7: lv_att2_3_0= ruleAttribuable
                    {

                    							newCompositeNode(grammarAccess.getAssertionAccess().getAtt2AttribuableParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_att2_3_0=ruleAttribuable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertionRule());
                    							}
                    							set(
                    								current,
                    								"att2",
                    								lv_att2_3_0,
                    								"org.xtext.selenium.selemodel.SeleModel.Attribuable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:551:4: ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) )
                    {
                    // InternalSeleModel.g:551:4: ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) )
                    // InternalSeleModel.g:552:5: ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) )
                    {
                    // InternalSeleModel.g:552:5: ( (lv_con1_4_0= ruleContainer ) )
                    // InternalSeleModel.g:553:6: (lv_con1_4_0= ruleContainer )
                    {
                    // InternalSeleModel.g:553:6: (lv_con1_4_0= ruleContainer )
                    // InternalSeleModel.g:554:7: lv_con1_4_0= ruleContainer
                    {

                    							newCompositeNode(grammarAccess.getAssertionAccess().getCon1ContainerParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_con1_4_0=ruleContainer();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertionRule());
                    							}
                    							set(
                    								current,
                    								"con1",
                    								lv_con1_4_0,
                    								"org.xtext.selenium.selemodel.SeleModel.Container");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionAccess().getContainKeyword_1_1_1());
                    				
                    // InternalSeleModel.g:575:5: ( (lv_con2_6_0= ruleContainer ) )
                    // InternalSeleModel.g:576:6: (lv_con2_6_0= ruleContainer )
                    {
                    // InternalSeleModel.g:576:6: (lv_con2_6_0= ruleContainer )
                    // InternalSeleModel.g:577:7: lv_con2_6_0= ruleContainer
                    {

                    							newCompositeNode(grammarAccess.getAssertionAccess().getCon2ContainerParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_con2_6_0=ruleContainer();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertionRule());
                    							}
                    							set(
                    								current,
                    								"con2",
                    								lv_con2_6_0,
                    								"org.xtext.selenium.selemodel.SeleModel.Container");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleDeclaration"
    // InternalSeleModel.g:600:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalSeleModel.g:600:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSeleModel.g:601:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalSeleModel.g:607:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_var_1_0= ruleVar ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:613:2: ( (otherlv_0= 'var' ( (lv_var_1_0= ruleVar ) ) ) )
            // InternalSeleModel.g:614:2: (otherlv_0= 'var' ( (lv_var_1_0= ruleVar ) ) )
            {
            // InternalSeleModel.g:614:2: (otherlv_0= 'var' ( (lv_var_1_0= ruleVar ) ) )
            // InternalSeleModel.g:615:3: otherlv_0= 'var' ( (lv_var_1_0= ruleVar ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getVarKeyword_0());
            		
            // InternalSeleModel.g:619:3: ( (lv_var_1_0= ruleVar ) )
            // InternalSeleModel.g:620:4: (lv_var_1_0= ruleVar )
            {
            // InternalSeleModel.g:620:4: (lv_var_1_0= ruleVar )
            // InternalSeleModel.g:621:5: lv_var_1_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getVarVarParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_1_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					add(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.Var");
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVar"
    // InternalSeleModel.g:642:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalSeleModel.g:642:44: (iv_ruleVar= ruleVar EOF )
            // InternalSeleModel.g:643:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalSeleModel.g:649:1: ruleVar returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSeleModel.g:655:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSeleModel.g:656:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSeleModel.g:656:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSeleModel.g:657:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSeleModel.g:657:3: (lv_name_0_0= RULE_ID )
            // InternalSeleModel.g:658:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleAttribuable"
    // InternalSeleModel.g:677:1: entryRuleAttribuable returns [EObject current=null] : iv_ruleAttribuable= ruleAttribuable EOF ;
    public final EObject entryRuleAttribuable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribuable = null;


        try {
            // InternalSeleModel.g:677:52: (iv_ruleAttribuable= ruleAttribuable EOF )
            // InternalSeleModel.g:678:2: iv_ruleAttribuable= ruleAttribuable EOF
            {
             newCompositeNode(grammarAccess.getAttribuableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribuable=ruleAttribuable();

            state._fsp--;

             current =iv_ruleAttribuable; 
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
    // $ANTLR end "entryRuleAttribuable"


    // $ANTLR start "ruleAttribuable"
    // InternalSeleModel.g:684:1: ruleAttribuable returns [EObject current=null] : ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleAttribut ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAttribuable() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token otherlv_2=null;
        EObject lv_attr_1_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:690:2: ( ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleAttribut ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSeleModel.g:691:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleAttribut ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSeleModel.g:691:2: ( ( (lv_str_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleAttribut ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case 32:
            case 34:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSeleModel.g:692:3: ( (lv_str_0_0= RULE_STRING ) )
                    {
                    // InternalSeleModel.g:692:3: ( (lv_str_0_0= RULE_STRING ) )
                    // InternalSeleModel.g:693:4: (lv_str_0_0= RULE_STRING )
                    {
                    // InternalSeleModel.g:693:4: (lv_str_0_0= RULE_STRING )
                    // InternalSeleModel.g:694:5: lv_str_0_0= RULE_STRING
                    {
                    lv_str_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_0_0, grammarAccess.getAttribuableAccess().getStrSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttribuableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"str",
                    						lv_str_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:711:3: ( (lv_attr_1_0= ruleAttribut ) )
                    {
                    // InternalSeleModel.g:711:3: ( (lv_attr_1_0= ruleAttribut ) )
                    // InternalSeleModel.g:712:4: (lv_attr_1_0= ruleAttribut )
                    {
                    // InternalSeleModel.g:712:4: (lv_attr_1_0= ruleAttribut )
                    // InternalSeleModel.g:713:5: lv_attr_1_0= ruleAttribut
                    {

                    					newCompositeNode(grammarAccess.getAttribuableAccess().getAttrAttributParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attr_1_0=ruleAttribut();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttribuableRule());
                    					}
                    					set(
                    						current,
                    						"attr",
                    						lv_attr_1_0,
                    						"org.xtext.selenium.selemodel.SeleModel.Attribut");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSeleModel.g:731:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalSeleModel.g:731:3: ( (otherlv_2= RULE_ID ) )
                    // InternalSeleModel.g:732:4: (otherlv_2= RULE_ID )
                    {
                    // InternalSeleModel.g:732:4: (otherlv_2= RULE_ID )
                    // InternalSeleModel.g:733:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttribuableRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getAttribuableAccess().getRefVarCrossReference_2_0());
                    				

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
    // $ANTLR end "ruleAttribuable"


    // $ANTLR start "entryRuleAttribution"
    // InternalSeleModel.g:748:1: entryRuleAttribution returns [EObject current=null] : iv_ruleAttribution= ruleAttribution EOF ;
    public final EObject entryRuleAttribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribution = null;


        try {
            // InternalSeleModel.g:748:52: (iv_ruleAttribution= ruleAttribution EOF )
            // InternalSeleModel.g:749:2: iv_ruleAttribution= ruleAttribution EOF
            {
             newCompositeNode(grammarAccess.getAttributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribution=ruleAttribution();

            state._fsp--;

             current =iv_ruleAttribution; 
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
    // $ANTLR end "entryRuleAttribution"


    // $ANTLR start "ruleAttribution"
    // InternalSeleModel.g:755:1: ruleAttribution returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attb_2_0= ruleAttribuable ) ) ) ;
    public final EObject ruleAttribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_attb_2_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:761:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attb_2_0= ruleAttribuable ) ) ) )
            // InternalSeleModel.g:762:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attb_2_0= ruleAttribuable ) ) )
            {
            // InternalSeleModel.g:762:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attb_2_0= ruleAttribuable ) ) )
            // InternalSeleModel.g:763:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attb_2_0= ruleAttribuable ) )
            {
            // InternalSeleModel.g:763:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeleModel.g:764:4: (otherlv_0= RULE_ID )
            {
            // InternalSeleModel.g:764:4: (otherlv_0= RULE_ID )
            // InternalSeleModel.g:765:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributionAccess().getVarVarCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributionAccess().getEqualsSignKeyword_1());
            		
            // InternalSeleModel.g:780:3: ( (lv_attb_2_0= ruleAttribuable ) )
            // InternalSeleModel.g:781:4: (lv_attb_2_0= ruleAttribuable )
            {
            // InternalSeleModel.g:781:4: (lv_attb_2_0= ruleAttribuable )
            // InternalSeleModel.g:782:5: lv_attb_2_0= ruleAttribuable
            {

            					newCompositeNode(grammarAccess.getAttributionAccess().getAttbAttribuableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attb_2_0=ruleAttribuable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributionRule());
            					}
            					set(
            						current,
            						"attb",
            						lv_attb_2_0,
            						"org.xtext.selenium.selemodel.SeleModel.Attribuable");
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
    // $ANTLR end "ruleAttribution"


    // $ANTLR start "entryRuleAttribut"
    // InternalSeleModel.g:803:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalSeleModel.g:803:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalSeleModel.g:804:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalSeleModel.g:810:1: ruleAttribut returns [EObject current=null] : ( ( ( (lv_container_0_0= ruleContainer ) ) otherlv_1= '.' ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) ) ) | ( ( (lv_containers_4_0= ruleContainers ) ) otherlv_5= '.' ( (lv_len_6_0= ruleLength ) ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_container_0_0 = null;

        AntlrDatatypeRuleToken lv_champ_2_0 = null;

        AntlrDatatypeRuleToken lv_len_3_0 = null;

        EObject lv_containers_4_0 = null;

        AntlrDatatypeRuleToken lv_len_6_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:816:2: ( ( ( ( (lv_container_0_0= ruleContainer ) ) otherlv_1= '.' ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) ) ) | ( ( (lv_containers_4_0= ruleContainers ) ) otherlv_5= '.' ( (lv_len_6_0= ruleLength ) ) ) ) )
            // InternalSeleModel.g:817:2: ( ( ( (lv_container_0_0= ruleContainer ) ) otherlv_1= '.' ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) ) ) | ( ( (lv_containers_4_0= ruleContainers ) ) otherlv_5= '.' ( (lv_len_6_0= ruleLength ) ) ) )
            {
            // InternalSeleModel.g:817:2: ( ( ( (lv_container_0_0= ruleContainer ) ) otherlv_1= '.' ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) ) ) | ( ( (lv_containers_4_0= ruleContainers ) ) otherlv_5= '.' ( (lv_len_6_0= ruleLength ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleModel.g:818:3: ( ( (lv_container_0_0= ruleContainer ) ) otherlv_1= '.' ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) ) )
                    {
                    // InternalSeleModel.g:818:3: ( ( (lv_container_0_0= ruleContainer ) ) otherlv_1= '.' ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) ) )
                    // InternalSeleModel.g:819:4: ( (lv_container_0_0= ruleContainer ) ) otherlv_1= '.' ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) )
                    {
                    // InternalSeleModel.g:819:4: ( (lv_container_0_0= ruleContainer ) )
                    // InternalSeleModel.g:820:5: (lv_container_0_0= ruleContainer )
                    {
                    // InternalSeleModel.g:820:5: (lv_container_0_0= ruleContainer )
                    // InternalSeleModel.g:821:6: lv_container_0_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getContainerContainerParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_container_0_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"container",
                    							lv_container_0_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getFullStopKeyword_0_1());
                    			
                    // InternalSeleModel.g:842:4: ( ( (lv_champ_2_0= ruleChamp ) ) | ( (lv_len_3_0= ruleLength ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=41 && LA11_0<=48)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==24) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSeleModel.g:843:5: ( (lv_champ_2_0= ruleChamp ) )
                            {
                            // InternalSeleModel.g:843:5: ( (lv_champ_2_0= ruleChamp ) )
                            // InternalSeleModel.g:844:6: (lv_champ_2_0= ruleChamp )
                            {
                            // InternalSeleModel.g:844:6: (lv_champ_2_0= ruleChamp )
                            // InternalSeleModel.g:845:7: lv_champ_2_0= ruleChamp
                            {

                            							newCompositeNode(grammarAccess.getAttributAccess().getChampChampParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_champ_2_0=ruleChamp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributRule());
                            							}
                            							set(
                            								current,
                            								"champ",
                            								lv_champ_2_0,
                            								"org.xtext.selenium.selemodel.SeleModel.Champ");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSeleModel.g:863:5: ( (lv_len_3_0= ruleLength ) )
                            {
                            // InternalSeleModel.g:863:5: ( (lv_len_3_0= ruleLength ) )
                            // InternalSeleModel.g:864:6: (lv_len_3_0= ruleLength )
                            {
                            // InternalSeleModel.g:864:6: (lv_len_3_0= ruleLength )
                            // InternalSeleModel.g:865:7: lv_len_3_0= ruleLength
                            {

                            							newCompositeNode(grammarAccess.getAttributAccess().getLenLengthParserRuleCall_0_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_len_3_0=ruleLength();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributRule());
                            							}
                            							set(
                            								current,
                            								"len",
                            								lv_len_3_0,
                            								"org.xtext.selenium.selemodel.SeleModel.Length");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:885:3: ( ( (lv_containers_4_0= ruleContainers ) ) otherlv_5= '.' ( (lv_len_6_0= ruleLength ) ) )
                    {
                    // InternalSeleModel.g:885:3: ( ( (lv_containers_4_0= ruleContainers ) ) otherlv_5= '.' ( (lv_len_6_0= ruleLength ) ) )
                    // InternalSeleModel.g:886:4: ( (lv_containers_4_0= ruleContainers ) ) otherlv_5= '.' ( (lv_len_6_0= ruleLength ) )
                    {
                    // InternalSeleModel.g:886:4: ( (lv_containers_4_0= ruleContainers ) )
                    // InternalSeleModel.g:887:5: (lv_containers_4_0= ruleContainers )
                    {
                    // InternalSeleModel.g:887:5: (lv_containers_4_0= ruleContainers )
                    // InternalSeleModel.g:888:6: lv_containers_4_0= ruleContainers
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getContainersContainersParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_containers_4_0=ruleContainers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"containers",
                    							lv_containers_4_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Containers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributAccess().getFullStopKeyword_1_1());
                    			
                    // InternalSeleModel.g:909:4: ( (lv_len_6_0= ruleLength ) )
                    // InternalSeleModel.g:910:5: (lv_len_6_0= ruleLength )
                    {
                    // InternalSeleModel.g:910:5: (lv_len_6_0= ruleLength )
                    // InternalSeleModel.g:911:6: lv_len_6_0= ruleLength
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getLenLengthParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_len_6_0=ruleLength();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"len",
                    							lv_len_6_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Length");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleLength"
    // InternalSeleModel.g:933:1: entryRuleLength returns [String current=null] : iv_ruleLength= ruleLength EOF ;
    public final String entryRuleLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLength = null;


        try {
            // InternalSeleModel.g:933:46: (iv_ruleLength= ruleLength EOF )
            // InternalSeleModel.g:934:2: iv_ruleLength= ruleLength EOF
            {
             newCompositeNode(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLength=ruleLength();

            state._fsp--;

             current =iv_ruleLength.getText(); 
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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalSeleModel.g:940:1: ruleLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'length' ;
    public final AntlrDatatypeRuleToken ruleLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleModel.g:946:2: (kw= 'length' )
            // InternalSeleModel.g:947:2: kw= 'length'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLengthAccess().getLengthKeyword());
            	

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
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleAction"
    // InternalSeleModel.g:955:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSeleModel.g:955:47: (iv_ruleAction= ruleAction EOF )
            // InternalSeleModel.g:956:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSeleModel.g:962:1: ruleAction returns [EObject current=null] : (this_OpenBrowser_0= ruleOpenBrowser | this_Fill_1= ruleFill | this_Click_2= ruleClick | this_Navigate_3= ruleNavigate | this_Choose_4= ruleChoose | this_Check_5= ruleCheck | this_Uncheck_6= ruleUncheck ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_OpenBrowser_0 = null;

        EObject this_Fill_1 = null;

        EObject this_Click_2 = null;

        EObject this_Navigate_3 = null;

        EObject this_Choose_4 = null;

        EObject this_Check_5 = null;

        EObject this_Uncheck_6 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:968:2: ( (this_OpenBrowser_0= ruleOpenBrowser | this_Fill_1= ruleFill | this_Click_2= ruleClick | this_Navigate_3= ruleNavigate | this_Choose_4= ruleChoose | this_Check_5= ruleCheck | this_Uncheck_6= ruleUncheck ) )
            // InternalSeleModel.g:969:2: (this_OpenBrowser_0= ruleOpenBrowser | this_Fill_1= ruleFill | this_Click_2= ruleClick | this_Navigate_3= ruleNavigate | this_Choose_4= ruleChoose | this_Check_5= ruleCheck | this_Uncheck_6= ruleUncheck )
            {
            // InternalSeleModel.g:969:2: (this_OpenBrowser_0= ruleOpenBrowser | this_Fill_1= ruleFill | this_Click_2= ruleClick | this_Navigate_3= ruleNavigate | this_Choose_4= ruleChoose | this_Check_5= ruleCheck | this_Uncheck_6= ruleUncheck )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            case 30:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSeleModel.g:970:3: this_OpenBrowser_0= ruleOpenBrowser
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getOpenBrowserParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenBrowser_0=ruleOpenBrowser();

                    state._fsp--;


                    			current = this_OpenBrowser_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:979:3: this_Fill_1= ruleFill
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getFillParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fill_1=ruleFill();

                    state._fsp--;


                    			current = this_Fill_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleModel.g:988:3: this_Click_2= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_2=ruleClick();

                    state._fsp--;


                    			current = this_Click_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleModel.g:997:3: this_Navigate_3= ruleNavigate
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getNavigateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Navigate_3=ruleNavigate();

                    state._fsp--;


                    			current = this_Navigate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleModel.g:1006:3: this_Choose_4= ruleChoose
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getChooseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choose_4=ruleChoose();

                    state._fsp--;


                    			current = this_Choose_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSeleModel.g:1015:3: this_Check_5= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCheckParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_5=ruleCheck();

                    state._fsp--;


                    			current = this_Check_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleModel.g:1024:3: this_Uncheck_6= ruleUncheck
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getUncheckParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Uncheck_6=ruleUncheck();

                    state._fsp--;


                    			current = this_Uncheck_6;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleFill"
    // InternalSeleModel.g:1036:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalSeleModel.g:1036:45: (iv_ruleFill= ruleFill EOF )
            // InternalSeleModel.g:1037:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
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
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalSeleModel.g:1043:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_container_1_0 = null;

        EObject lv_attb_2_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1049:2: ( (otherlv_0= 'fill' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) ) )
            // InternalSeleModel.g:1050:2: (otherlv_0= 'fill' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) )
            {
            // InternalSeleModel.g:1050:2: (otherlv_0= 'fill' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) )
            // InternalSeleModel.g:1051:3: otherlv_0= 'fill' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalSeleModel.g:1055:3: ( (lv_container_1_0= ruleContainer ) )
            // InternalSeleModel.g:1056:4: (lv_container_1_0= ruleContainer )
            {
            // InternalSeleModel.g:1056:4: (lv_container_1_0= ruleContainer )
            // InternalSeleModel.g:1057:5: lv_container_1_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getFillAccess().getContainerContainerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_container_1_0=ruleContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillRule());
            					}
            					set(
            						current,
            						"container",
            						lv_container_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.Container");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleModel.g:1074:3: ( (lv_attb_2_0= ruleAttribuable ) )
            // InternalSeleModel.g:1075:4: (lv_attb_2_0= ruleAttribuable )
            {
            // InternalSeleModel.g:1075:4: (lv_attb_2_0= ruleAttribuable )
            // InternalSeleModel.g:1076:5: lv_attb_2_0= ruleAttribuable
            {

            					newCompositeNode(grammarAccess.getFillAccess().getAttbAttribuableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attb_2_0=ruleAttribuable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillRule());
            					}
            					set(
            						current,
            						"attb",
            						lv_attb_2_0,
            						"org.xtext.selenium.selemodel.SeleModel.Attribuable");
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
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleClick"
    // InternalSeleModel.g:1097:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSeleModel.g:1097:46: (iv_ruleClick= ruleClick EOF )
            // InternalSeleModel.g:1098:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSeleModel.g:1104:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' ( (lv_container_1_0= ruleContainer ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_container_1_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1110:2: ( (otherlv_0= 'click' ( (lv_container_1_0= ruleContainer ) ) ) )
            // InternalSeleModel.g:1111:2: (otherlv_0= 'click' ( (lv_container_1_0= ruleContainer ) ) )
            {
            // InternalSeleModel.g:1111:2: (otherlv_0= 'click' ( (lv_container_1_0= ruleContainer ) ) )
            // InternalSeleModel.g:1112:3: otherlv_0= 'click' ( (lv_container_1_0= ruleContainer ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalSeleModel.g:1116:3: ( (lv_container_1_0= ruleContainer ) )
            // InternalSeleModel.g:1117:4: (lv_container_1_0= ruleContainer )
            {
            // InternalSeleModel.g:1117:4: (lv_container_1_0= ruleContainer )
            // InternalSeleModel.g:1118:5: lv_container_1_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getClickAccess().getContainerContainerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_container_1_0=ruleContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"container",
            						lv_container_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.Container");
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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleNavigate"
    // InternalSeleModel.g:1139:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalSeleModel.g:1139:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalSeleModel.g:1140:2: iv_ruleNavigate= ruleNavigate EOF
            {
             newCompositeNode(grammarAccess.getNavigateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigate=ruleNavigate();

            state._fsp--;

             current =iv_ruleNavigate; 
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
    // $ANTLR end "entryRuleNavigate"


    // $ANTLR start "ruleNavigate"
    // InternalSeleModel.g:1146:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'navigate' ( (lv_attb_1_0= ruleAttribuable ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attb_1_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1152:2: ( (otherlv_0= 'navigate' ( (lv_attb_1_0= ruleAttribuable ) ) ) )
            // InternalSeleModel.g:1153:2: (otherlv_0= 'navigate' ( (lv_attb_1_0= ruleAttribuable ) ) )
            {
            // InternalSeleModel.g:1153:2: (otherlv_0= 'navigate' ( (lv_attb_1_0= ruleAttribuable ) ) )
            // InternalSeleModel.g:1154:3: otherlv_0= 'navigate' ( (lv_attb_1_0= ruleAttribuable ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            // InternalSeleModel.g:1158:3: ( (lv_attb_1_0= ruleAttribuable ) )
            // InternalSeleModel.g:1159:4: (lv_attb_1_0= ruleAttribuable )
            {
            // InternalSeleModel.g:1159:4: (lv_attb_1_0= ruleAttribuable )
            // InternalSeleModel.g:1160:5: lv_attb_1_0= ruleAttribuable
            {

            					newCompositeNode(grammarAccess.getNavigateAccess().getAttbAttribuableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_attb_1_0=ruleAttribuable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigateRule());
            					}
            					set(
            						current,
            						"attb",
            						lv_attb_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.Attribuable");
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
    // $ANTLR end "ruleNavigate"


    // $ANTLR start "entryRuleChoose"
    // InternalSeleModel.g:1181:1: entryRuleChoose returns [EObject current=null] : iv_ruleChoose= ruleChoose EOF ;
    public final EObject entryRuleChoose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoose = null;


        try {
            // InternalSeleModel.g:1181:47: (iv_ruleChoose= ruleChoose EOF )
            // InternalSeleModel.g:1182:2: iv_ruleChoose= ruleChoose EOF
            {
             newCompositeNode(grammarAccess.getChooseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoose=ruleChoose();

            state._fsp--;

             current =iv_ruleChoose; 
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
    // $ANTLR end "entryRuleChoose"


    // $ANTLR start "ruleChoose"
    // InternalSeleModel.g:1188:1: ruleChoose returns [EObject current=null] : (otherlv_0= 'choose' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) ) ;
    public final EObject ruleChoose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_container_1_0 = null;

        EObject lv_attb_2_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1194:2: ( (otherlv_0= 'choose' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) ) )
            // InternalSeleModel.g:1195:2: (otherlv_0= 'choose' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) )
            {
            // InternalSeleModel.g:1195:2: (otherlv_0= 'choose' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) ) )
            // InternalSeleModel.g:1196:3: otherlv_0= 'choose' ( (lv_container_1_0= ruleContainer ) ) ( (lv_attb_2_0= ruleAttribuable ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getChooseAccess().getChooseKeyword_0());
            		
            // InternalSeleModel.g:1200:3: ( (lv_container_1_0= ruleContainer ) )
            // InternalSeleModel.g:1201:4: (lv_container_1_0= ruleContainer )
            {
            // InternalSeleModel.g:1201:4: (lv_container_1_0= ruleContainer )
            // InternalSeleModel.g:1202:5: lv_container_1_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getChooseAccess().getContainerContainerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_container_1_0=ruleContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChooseRule());
            					}
            					set(
            						current,
            						"container",
            						lv_container_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.Container");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleModel.g:1219:3: ( (lv_attb_2_0= ruleAttribuable ) )
            // InternalSeleModel.g:1220:4: (lv_attb_2_0= ruleAttribuable )
            {
            // InternalSeleModel.g:1220:4: (lv_attb_2_0= ruleAttribuable )
            // InternalSeleModel.g:1221:5: lv_attb_2_0= ruleAttribuable
            {

            					newCompositeNode(grammarAccess.getChooseAccess().getAttbAttribuableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attb_2_0=ruleAttribuable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChooseRule());
            					}
            					set(
            						current,
            						"attb",
            						lv_attb_2_0,
            						"org.xtext.selenium.selemodel.SeleModel.Attribuable");
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
    // $ANTLR end "ruleChoose"


    // $ANTLR start "entryRuleCheck"
    // InternalSeleModel.g:1242:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalSeleModel.g:1242:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalSeleModel.g:1243:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalSeleModel.g:1249:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_container_1_0 = null;

        EObject lv_containers_2_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1255:2: ( (otherlv_0= 'check' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) ) )
            // InternalSeleModel.g:1256:2: (otherlv_0= 'check' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) )
            {
            // InternalSeleModel.g:1256:2: (otherlv_0= 'check' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) )
            // InternalSeleModel.g:1257:3: otherlv_0= 'check' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalSeleModel.g:1261:3: ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSeleModel.g:1262:4: ( (lv_container_1_0= ruleContainer ) )
                    {
                    // InternalSeleModel.g:1262:4: ( (lv_container_1_0= ruleContainer ) )
                    // InternalSeleModel.g:1263:5: (lv_container_1_0= ruleContainer )
                    {
                    // InternalSeleModel.g:1263:5: (lv_container_1_0= ruleContainer )
                    // InternalSeleModel.g:1264:6: lv_container_1_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getCheckAccess().getContainerContainerParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_container_1_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckRule());
                    						}
                    						set(
                    							current,
                    							"container",
                    							lv_container_1_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:1282:4: ( (lv_containers_2_0= ruleContainers ) )
                    {
                    // InternalSeleModel.g:1282:4: ( (lv_containers_2_0= ruleContainers ) )
                    // InternalSeleModel.g:1283:5: (lv_containers_2_0= ruleContainers )
                    {
                    // InternalSeleModel.g:1283:5: (lv_containers_2_0= ruleContainers )
                    // InternalSeleModel.g:1284:6: lv_containers_2_0= ruleContainers
                    {

                    						newCompositeNode(grammarAccess.getCheckAccess().getContainersContainersParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_containers_2_0=ruleContainers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckRule());
                    						}
                    						set(
                    							current,
                    							"containers",
                    							lv_containers_2_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Containers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleUncheck"
    // InternalSeleModel.g:1306:1: entryRuleUncheck returns [EObject current=null] : iv_ruleUncheck= ruleUncheck EOF ;
    public final EObject entryRuleUncheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncheck = null;


        try {
            // InternalSeleModel.g:1306:48: (iv_ruleUncheck= ruleUncheck EOF )
            // InternalSeleModel.g:1307:2: iv_ruleUncheck= ruleUncheck EOF
            {
             newCompositeNode(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncheck=ruleUncheck();

            state._fsp--;

             current =iv_ruleUncheck; 
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
    // $ANTLR end "entryRuleUncheck"


    // $ANTLR start "ruleUncheck"
    // InternalSeleModel.g:1313:1: ruleUncheck returns [EObject current=null] : (otherlv_0= 'uncheck' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) ) ;
    public final EObject ruleUncheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_container_1_0 = null;

        EObject lv_containers_2_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1319:2: ( (otherlv_0= 'uncheck' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) ) )
            // InternalSeleModel.g:1320:2: (otherlv_0= 'uncheck' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) )
            {
            // InternalSeleModel.g:1320:2: (otherlv_0= 'uncheck' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) ) )
            // InternalSeleModel.g:1321:3: otherlv_0= 'uncheck' ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getUncheckAccess().getUncheckKeyword_0());
            		
            // InternalSeleModel.g:1325:3: ( ( (lv_container_1_0= ruleContainer ) ) | ( (lv_containers_2_0= ruleContainers ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSeleModel.g:1326:4: ( (lv_container_1_0= ruleContainer ) )
                    {
                    // InternalSeleModel.g:1326:4: ( (lv_container_1_0= ruleContainer ) )
                    // InternalSeleModel.g:1327:5: (lv_container_1_0= ruleContainer )
                    {
                    // InternalSeleModel.g:1327:5: (lv_container_1_0= ruleContainer )
                    // InternalSeleModel.g:1328:6: lv_container_1_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getUncheckAccess().getContainerContainerParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_container_1_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUncheckRule());
                    						}
                    						set(
                    							current,
                    							"container",
                    							lv_container_1_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:1346:4: ( (lv_containers_2_0= ruleContainers ) )
                    {
                    // InternalSeleModel.g:1346:4: ( (lv_containers_2_0= ruleContainers ) )
                    // InternalSeleModel.g:1347:5: (lv_containers_2_0= ruleContainers )
                    {
                    // InternalSeleModel.g:1347:5: (lv_containers_2_0= ruleContainers )
                    // InternalSeleModel.g:1348:6: lv_containers_2_0= ruleContainers
                    {

                    						newCompositeNode(grammarAccess.getUncheckAccess().getContainersContainersParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_containers_2_0=ruleContainers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUncheckRule());
                    						}
                    						set(
                    							current,
                    							"containers",
                    							lv_containers_2_0,
                    							"org.xtext.selenium.selemodel.SeleModel.Containers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleUncheck"


    // $ANTLR start "entryRuleOpenBrowser"
    // InternalSeleModel.g:1370:1: entryRuleOpenBrowser returns [EObject current=null] : iv_ruleOpenBrowser= ruleOpenBrowser EOF ;
    public final EObject entryRuleOpenBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenBrowser = null;


        try {
            // InternalSeleModel.g:1370:52: (iv_ruleOpenBrowser= ruleOpenBrowser EOF )
            // InternalSeleModel.g:1371:2: iv_ruleOpenBrowser= ruleOpenBrowser EOF
            {
             newCompositeNode(grammarAccess.getOpenBrowserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenBrowser=ruleOpenBrowser();

            state._fsp--;

             current =iv_ruleOpenBrowser; 
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
    // $ANTLR end "entryRuleOpenBrowser"


    // $ANTLR start "ruleOpenBrowser"
    // InternalSeleModel.g:1377:1: ruleOpenBrowser returns [EObject current=null] : (otherlv_0= 'openbrowser' ( (lv_browser_1_0= ruleBrowsers ) ) ) ;
    public final EObject ruleOpenBrowser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_browser_1_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1383:2: ( (otherlv_0= 'openbrowser' ( (lv_browser_1_0= ruleBrowsers ) ) ) )
            // InternalSeleModel.g:1384:2: (otherlv_0= 'openbrowser' ( (lv_browser_1_0= ruleBrowsers ) ) )
            {
            // InternalSeleModel.g:1384:2: (otherlv_0= 'openbrowser' ( (lv_browser_1_0= ruleBrowsers ) ) )
            // InternalSeleModel.g:1385:3: otherlv_0= 'openbrowser' ( (lv_browser_1_0= ruleBrowsers ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenBrowserAccess().getOpenbrowserKeyword_0());
            		
            // InternalSeleModel.g:1389:3: ( (lv_browser_1_0= ruleBrowsers ) )
            // InternalSeleModel.g:1390:4: (lv_browser_1_0= ruleBrowsers )
            {
            // InternalSeleModel.g:1390:4: (lv_browser_1_0= ruleBrowsers )
            // InternalSeleModel.g:1391:5: lv_browser_1_0= ruleBrowsers
            {

            					newCompositeNode(grammarAccess.getOpenBrowserAccess().getBrowserBrowsersParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_browser_1_0=ruleBrowsers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpenBrowserRule());
            					}
            					set(
            						current,
            						"browser",
            						lv_browser_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.Browsers");
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
    // $ANTLR end "ruleOpenBrowser"


    // $ANTLR start "entryRuleContainer"
    // InternalSeleModel.g:1412:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSeleModel.g:1412:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalSeleModel.g:1413:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSeleModel.g:1419:1: ruleContainer returns [EObject current=null] : (otherlv_0= '[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']' ( ( (lv_hierarchy_4_0= ruleParentContainer ) ) | ( (lv_hierarchy_5_0= ruleChildContainer ) ) )* ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_typeContainer_1_0 = null;

        EObject lv_conditions_2_0 = null;

        AntlrDatatypeRuleToken lv_hierarchy_4_0 = null;

        AntlrDatatypeRuleToken lv_hierarchy_5_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1425:2: ( (otherlv_0= '[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']' ( ( (lv_hierarchy_4_0= ruleParentContainer ) ) | ( (lv_hierarchy_5_0= ruleChildContainer ) ) )* ) )
            // InternalSeleModel.g:1426:2: (otherlv_0= '[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']' ( ( (lv_hierarchy_4_0= ruleParentContainer ) ) | ( (lv_hierarchy_5_0= ruleChildContainer ) ) )* )
            {
            // InternalSeleModel.g:1426:2: (otherlv_0= '[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']' ( ( (lv_hierarchy_4_0= ruleParentContainer ) ) | ( (lv_hierarchy_5_0= ruleChildContainer ) ) )* )
            // InternalSeleModel.g:1427:3: otherlv_0= '[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']' ( ( (lv_hierarchy_4_0= ruleParentContainer ) ) | ( (lv_hierarchy_5_0= ruleChildContainer ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSeleModel.g:1431:3: ( (lv_typeContainer_1_0= ruleTypeContainer ) )
            // InternalSeleModel.g:1432:4: (lv_typeContainer_1_0= ruleTypeContainer )
            {
            // InternalSeleModel.g:1432:4: (lv_typeContainer_1_0= ruleTypeContainer )
            // InternalSeleModel.g:1433:5: lv_typeContainer_1_0= ruleTypeContainer
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getTypeContainerTypeContainerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_typeContainer_1_0=ruleTypeContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"typeContainer",
            						lv_typeContainer_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.TypeContainer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleModel.g:1450:3: ( (lv_conditions_2_0= ruleCondition ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=41 && LA16_0<=48)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeleModel.g:1451:4: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalSeleModel.g:1451:4: (lv_conditions_2_0= ruleCondition )
            	    // InternalSeleModel.g:1452:5: lv_conditions_2_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getContainerAccess().getConditionsConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_conditions_2_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_2_0,
            	    						"org.xtext.selenium.selemodel.SeleModel.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getRightSquareBracketKeyword_3());
            		
            // InternalSeleModel.g:1473:3: ( ( (lv_hierarchy_4_0= ruleParentContainer ) ) | ( (lv_hierarchy_5_0= ruleChildContainer ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }
                else if ( (LA17_0==37) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSeleModel.g:1474:4: ( (lv_hierarchy_4_0= ruleParentContainer ) )
            	    {
            	    // InternalSeleModel.g:1474:4: ( (lv_hierarchy_4_0= ruleParentContainer ) )
            	    // InternalSeleModel.g:1475:5: (lv_hierarchy_4_0= ruleParentContainer )
            	    {
            	    // InternalSeleModel.g:1475:5: (lv_hierarchy_4_0= ruleParentContainer )
            	    // InternalSeleModel.g:1476:6: lv_hierarchy_4_0= ruleParentContainer
            	    {

            	    						newCompositeNode(grammarAccess.getContainerAccess().getHierarchyParentContainerParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_hierarchy_4_0=ruleParentContainer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContainerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hierarchy",
            	    							lv_hierarchy_4_0,
            	    							"org.xtext.selenium.selemodel.SeleModel.ParentContainer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSeleModel.g:1494:4: ( (lv_hierarchy_5_0= ruleChildContainer ) )
            	    {
            	    // InternalSeleModel.g:1494:4: ( (lv_hierarchy_5_0= ruleChildContainer ) )
            	    // InternalSeleModel.g:1495:5: (lv_hierarchy_5_0= ruleChildContainer )
            	    {
            	    // InternalSeleModel.g:1495:5: (lv_hierarchy_5_0= ruleChildContainer )
            	    // InternalSeleModel.g:1496:6: lv_hierarchy_5_0= ruleChildContainer
            	    {

            	    						newCompositeNode(grammarAccess.getContainerAccess().getHierarchyChildContainerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_hierarchy_5_0=ruleChildContainer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContainerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hierarchy",
            	    							lv_hierarchy_5_0,
            	    							"org.xtext.selenium.selemodel.SeleModel.ChildContainer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainers"
    // InternalSeleModel.g:1518:1: entryRuleContainers returns [EObject current=null] : iv_ruleContainers= ruleContainers EOF ;
    public final EObject entryRuleContainers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainers = null;


        try {
            // InternalSeleModel.g:1518:51: (iv_ruleContainers= ruleContainers EOF )
            // InternalSeleModel.g:1519:2: iv_ruleContainers= ruleContainers EOF
            {
             newCompositeNode(grammarAccess.getContainersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainers=ruleContainers();

            state._fsp--;

             current =iv_ruleContainers; 
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
    // $ANTLR end "entryRuleContainers"


    // $ANTLR start "ruleContainers"
    // InternalSeleModel.g:1525:1: ruleContainers returns [EObject current=null] : (otherlv_0= '[[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']]' ) ;
    public final EObject ruleContainers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_typeContainer_1_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1531:2: ( (otherlv_0= '[[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']]' ) )
            // InternalSeleModel.g:1532:2: (otherlv_0= '[[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']]' )
            {
            // InternalSeleModel.g:1532:2: (otherlv_0= '[[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']]' )
            // InternalSeleModel.g:1533:3: otherlv_0= '[[' ( (lv_typeContainer_1_0= ruleTypeContainer ) ) ( (lv_conditions_2_0= ruleCondition ) )* otherlv_3= ']]'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getContainersAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalSeleModel.g:1537:3: ( (lv_typeContainer_1_0= ruleTypeContainer ) )
            // InternalSeleModel.g:1538:4: (lv_typeContainer_1_0= ruleTypeContainer )
            {
            // InternalSeleModel.g:1538:4: (lv_typeContainer_1_0= ruleTypeContainer )
            // InternalSeleModel.g:1539:5: lv_typeContainer_1_0= ruleTypeContainer
            {

            					newCompositeNode(grammarAccess.getContainersAccess().getTypeContainerTypeContainerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeContainer_1_0=ruleTypeContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainersRule());
            					}
            					set(
            						current,
            						"typeContainer",
            						lv_typeContainer_1_0,
            						"org.xtext.selenium.selemodel.SeleModel.TypeContainer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleModel.g:1556:3: ( (lv_conditions_2_0= ruleCondition ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=41 && LA18_0<=48)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSeleModel.g:1557:4: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalSeleModel.g:1557:4: (lv_conditions_2_0= ruleCondition )
            	    // InternalSeleModel.g:1558:5: lv_conditions_2_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getContainersAccess().getConditionsConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_conditions_2_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_2_0,
            	    						"org.xtext.selenium.selemodel.SeleModel.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContainersAccess().getRightSquareBracketRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleContainers"


    // $ANTLR start "entryRuleCondition"
    // InternalSeleModel.g:1583:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSeleModel.g:1583:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSeleModel.g:1584:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSeleModel.g:1590:1: ruleCondition returns [EObject current=null] : ( ( (lv_champ_0_0= ruleChamp ) ) otherlv_1= '=' ( ( (lv_str_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_str_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_champ_0_0 = null;



        	enterRule();

        try {
            // InternalSeleModel.g:1596:2: ( ( ( (lv_champ_0_0= ruleChamp ) ) otherlv_1= '=' ( ( (lv_str_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalSeleModel.g:1597:2: ( ( (lv_champ_0_0= ruleChamp ) ) otherlv_1= '=' ( ( (lv_str_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalSeleModel.g:1597:2: ( ( (lv_champ_0_0= ruleChamp ) ) otherlv_1= '=' ( ( (lv_str_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSeleModel.g:1598:3: ( (lv_champ_0_0= ruleChamp ) ) otherlv_1= '=' ( ( (lv_str_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSeleModel.g:1598:3: ( (lv_champ_0_0= ruleChamp ) )
            // InternalSeleModel.g:1599:4: (lv_champ_0_0= ruleChamp )
            {
            // InternalSeleModel.g:1599:4: (lv_champ_0_0= ruleChamp )
            // InternalSeleModel.g:1600:5: lv_champ_0_0= ruleChamp
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getChampChampParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_champ_0_0=ruleChamp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"champ",
            						lv_champ_0_0,
            						"org.xtext.selenium.selemodel.SeleModel.Champ");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getEqualsSignKeyword_1());
            		
            // InternalSeleModel.g:1621:3: ( ( (lv_str_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSeleModel.g:1622:4: ( (lv_str_2_0= RULE_STRING ) )
                    {
                    // InternalSeleModel.g:1622:4: ( (lv_str_2_0= RULE_STRING ) )
                    // InternalSeleModel.g:1623:5: (lv_str_2_0= RULE_STRING )
                    {
                    // InternalSeleModel.g:1623:5: (lv_str_2_0= RULE_STRING )
                    // InternalSeleModel.g:1624:6: lv_str_2_0= RULE_STRING
                    {
                    lv_str_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_str_2_0, grammarAccess.getConditionAccess().getStrSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"str",
                    							lv_str_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:1641:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSeleModel.g:1641:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSeleModel.g:1642:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSeleModel.g:1642:5: (otherlv_3= RULE_ID )
                    // InternalSeleModel.g:1643:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRefVarCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleParentContainer"
    // InternalSeleModel.g:1659:1: entryRuleParentContainer returns [String current=null] : iv_ruleParentContainer= ruleParentContainer EOF ;
    public final String entryRuleParentContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParentContainer = null;


        try {
            // InternalSeleModel.g:1659:55: (iv_ruleParentContainer= ruleParentContainer EOF )
            // InternalSeleModel.g:1660:2: iv_ruleParentContainer= ruleParentContainer EOF
            {
             newCompositeNode(grammarAccess.getParentContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParentContainer=ruleParentContainer();

            state._fsp--;

             current =iv_ruleParentContainer.getText(); 
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
    // $ANTLR end "entryRuleParentContainer"


    // $ANTLR start "ruleParentContainer"
    // InternalSeleModel.g:1666:1: ruleParentContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.parent' ;
    public final AntlrDatatypeRuleToken ruleParentContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleModel.g:1672:2: (kw= '.parent' )
            // InternalSeleModel.g:1673:2: kw= '.parent'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getParentContainerAccess().getParentKeyword());
            	

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
    // $ANTLR end "ruleParentContainer"


    // $ANTLR start "entryRuleChildContainer"
    // InternalSeleModel.g:1681:1: entryRuleChildContainer returns [String current=null] : iv_ruleChildContainer= ruleChildContainer EOF ;
    public final String entryRuleChildContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChildContainer = null;


        try {
            // InternalSeleModel.g:1681:54: (iv_ruleChildContainer= ruleChildContainer EOF )
            // InternalSeleModel.g:1682:2: iv_ruleChildContainer= ruleChildContainer EOF
            {
             newCompositeNode(grammarAccess.getChildContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildContainer=ruleChildContainer();

            state._fsp--;

             current =iv_ruleChildContainer.getText(); 
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
    // $ANTLR end "entryRuleChildContainer"


    // $ANTLR start "ruleChildContainer"
    // InternalSeleModel.g:1688:1: ruleChildContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.child' ;
    public final AntlrDatatypeRuleToken ruleChildContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleModel.g:1694:2: (kw= '.child' )
            // InternalSeleModel.g:1695:2: kw= '.child'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getChildContainerAccess().getChildKeyword());
            	

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
    // $ANTLR end "ruleChildContainer"


    // $ANTLR start "entryRuleBrowsers"
    // InternalSeleModel.g:1703:1: entryRuleBrowsers returns [String current=null] : iv_ruleBrowsers= ruleBrowsers EOF ;
    public final String entryRuleBrowsers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBrowsers = null;


        try {
            // InternalSeleModel.g:1703:48: (iv_ruleBrowsers= ruleBrowsers EOF )
            // InternalSeleModel.g:1704:2: iv_ruleBrowsers= ruleBrowsers EOF
            {
             newCompositeNode(grammarAccess.getBrowsersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrowsers=ruleBrowsers();

            state._fsp--;

             current =iv_ruleBrowsers.getText(); 
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
    // $ANTLR end "entryRuleBrowsers"


    // $ANTLR start "ruleBrowsers"
    // InternalSeleModel.g:1710:1: ruleBrowsers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'firefox' | kw= 'default' | kw= 'chrome' ) ;
    public final AntlrDatatypeRuleToken ruleBrowsers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleModel.g:1716:2: ( (kw= 'firefox' | kw= 'default' | kw= 'chrome' ) )
            // InternalSeleModel.g:1717:2: (kw= 'firefox' | kw= 'default' | kw= 'chrome' )
            {
            // InternalSeleModel.g:1717:2: (kw= 'firefox' | kw= 'default' | kw= 'chrome' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSeleModel.g:1718:3: kw= 'firefox'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBrowsersAccess().getFirefoxKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:1724:3: kw= 'default'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBrowsersAccess().getDefaultKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleModel.g:1730:3: kw= 'chrome'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBrowsersAccess().getChromeKeyword_2());
                    		

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
    // $ANTLR end "ruleBrowsers"


    // $ANTLR start "entryRuleChamp"
    // InternalSeleModel.g:1739:1: entryRuleChamp returns [String current=null] : iv_ruleChamp= ruleChamp EOF ;
    public final String entryRuleChamp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChamp = null;


        try {
            // InternalSeleModel.g:1739:45: (iv_ruleChamp= ruleChamp EOF )
            // InternalSeleModel.g:1740:2: iv_ruleChamp= ruleChamp EOF
            {
             newCompositeNode(grammarAccess.getChampRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChamp=ruleChamp();

            state._fsp--;

             current =iv_ruleChamp.getText(); 
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
    // $ANTLR end "entryRuleChamp"


    // $ANTLR start "ruleChamp"
    // InternalSeleModel.g:1746:1: ruleChamp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'id' | kw= 'class' | kw= 'inner' | kw= 'value' | kw= 'href' | kw= 'title' | kw= 'type' | kw= 'alt' ) ;
    public final AntlrDatatypeRuleToken ruleChamp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleModel.g:1752:2: ( (kw= 'id' | kw= 'class' | kw= 'inner' | kw= 'value' | kw= 'href' | kw= 'title' | kw= 'type' | kw= 'alt' ) )
            // InternalSeleModel.g:1753:2: (kw= 'id' | kw= 'class' | kw= 'inner' | kw= 'value' | kw= 'href' | kw= 'title' | kw= 'type' | kw= 'alt' )
            {
            // InternalSeleModel.g:1753:2: (kw= 'id' | kw= 'class' | kw= 'inner' | kw= 'value' | kw= 'href' | kw= 'title' | kw= 'type' | kw= 'alt' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 44:
                {
                alt21=4;
                }
                break;
            case 45:
                {
                alt21=5;
                }
                break;
            case 46:
                {
                alt21=6;
                }
                break;
            case 47:
                {
                alt21=7;
                }
                break;
            case 48:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSeleModel.g:1754:3: kw= 'id'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getIdKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:1760:3: kw= 'class'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleModel.g:1766:3: kw= 'inner'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getInnerKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleModel.g:1772:3: kw= 'value'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getValueKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleModel.g:1778:3: kw= 'href'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getHrefKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSeleModel.g:1784:3: kw= 'title'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getTitleKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleModel.g:1790:3: kw= 'type'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getTypeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSeleModel.g:1796:3: kw= 'alt'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getChampAccess().getAltKeyword_7());
                    		

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
    // $ANTLR end "ruleChamp"


    // $ANTLR start "entryRuleTypeContainer"
    // InternalSeleModel.g:1805:1: entryRuleTypeContainer returns [String current=null] : iv_ruleTypeContainer= ruleTypeContainer EOF ;
    public final String entryRuleTypeContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeContainer = null;


        try {
            // InternalSeleModel.g:1805:53: (iv_ruleTypeContainer= ruleTypeContainer EOF )
            // InternalSeleModel.g:1806:2: iv_ruleTypeContainer= ruleTypeContainer EOF
            {
             newCompositeNode(grammarAccess.getTypeContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeContainer=ruleTypeContainer();

            state._fsp--;

             current =iv_ruleTypeContainer.getText(); 
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
    // $ANTLR end "entryRuleTypeContainer"


    // $ANTLR start "ruleTypeContainer"
    // InternalSeleModel.g:1812:1: ruleTypeContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Elm' | kw= 'Body' | kw= 'Input' | kw= 'Div' | kw= 'Select' | kw= 'Link' | kw= 'Img' ) ;
    public final AntlrDatatypeRuleToken ruleTypeContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleModel.g:1818:2: ( (kw= 'Elm' | kw= 'Body' | kw= 'Input' | kw= 'Div' | kw= 'Select' | kw= 'Link' | kw= 'Img' ) )
            // InternalSeleModel.g:1819:2: (kw= 'Elm' | kw= 'Body' | kw= 'Input' | kw= 'Div' | kw= 'Select' | kw= 'Link' | kw= 'Img' )
            {
            // InternalSeleModel.g:1819:2: (kw= 'Elm' | kw= 'Body' | kw= 'Input' | kw= 'Div' | kw= 'Select' | kw= 'Link' | kw= 'Img' )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case 50:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            case 52:
                {
                alt22=4;
                }
                break;
            case 53:
                {
                alt22=5;
                }
                break;
            case 54:
                {
                alt22=6;
                }
                break;
            case 55:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSeleModel.g:1820:3: kw= 'Elm'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeContainerAccess().getElmKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleModel.g:1826:3: kw= 'Body'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeContainerAccess().getBodyKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleModel.g:1832:3: kw= 'Input'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeContainerAccess().getInputKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleModel.g:1838:3: kw= 'Div'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeContainerAccess().getDivKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleModel.g:1844:3: kw= 'Select'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeContainerAccess().getSelectKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSeleModel.g:1850:3: kw= 'Link'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeContainerAccess().getLinkKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleModel.g:1856:3: kw= 'Img'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeContainerAccess().getImgKeyword_6());
                    		

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
    // $ANTLR end "ruleTypeContainer"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\61\7\41\10\26\1\24\1\4\2\24\1\uffff\2\41";
    static final String dfa_3s = "\1\42\1\uffff\1\67\7\60\10\26\1\45\1\5\2\45\1\uffff\2\60";
    static final String dfa_4s = "\1\uffff\1\1\24\uffff\1\2\2\uffff";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\2\1\32\uffff\1\2\1\uffff\1\1",
            "",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\26\2\uffff\1\1\14\uffff\1\24\1\25",
            "\1\30\1\27",
            "\1\26\2\uffff\1\1\14\uffff\1\24\1\25",
            "\1\26\2\uffff\1\1\14\uffff\1\24\1\25",
            "",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\7\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "505:3: ( ( ( (lv_att1_1_0= ruleAttribuable ) ) otherlv_2= 'equal' ( (lv_att2_3_0= ruleAttribuable ) ) ) | ( ( (lv_con1_4_0= ruleContainer ) ) otherlv_5= 'contain' ( (lv_con2_6_0= ruleContainer ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000FE242010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000500020030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000500000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001FE0001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00FE000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001FE0200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001FE0800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000030L});

}