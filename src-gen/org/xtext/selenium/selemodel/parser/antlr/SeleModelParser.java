/*
 * generated by Xtext 2.10.0
 */
package org.xtext.selenium.selemodel.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.selenium.selemodel.parser.antlr.internal.InternalSeleModelParser;
import org.xtext.selenium.selemodel.services.SeleModelGrammarAccess;

public class SeleModelParser extends AbstractAntlrParser {

	@Inject
	private SeleModelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSeleModelParser createParser(XtextTokenStream stream) {
		return new InternalSeleModelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SeleModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeleModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}