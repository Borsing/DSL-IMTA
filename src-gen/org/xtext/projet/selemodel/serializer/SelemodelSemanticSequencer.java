/*
 * generated by Xtext 2.10.0
 */
package org.xtext.projet.selemodel.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.projet.selemodel.selemodel.Assertion;
import org.xtext.projet.selemodel.selemodel.Attribuable;
import org.xtext.projet.selemodel.selemodel.Attribut;
import org.xtext.projet.selemodel.selemodel.Attribution;
import org.xtext.projet.selemodel.selemodel.Check;
import org.xtext.projet.selemodel.selemodel.Choose;
import org.xtext.projet.selemodel.selemodel.Click;
import org.xtext.projet.selemodel.selemodel.Condition;
import org.xtext.projet.selemodel.selemodel.Container;
import org.xtext.projet.selemodel.selemodel.Containers;
import org.xtext.projet.selemodel.selemodel.Declaration;
import org.xtext.projet.selemodel.selemodel.DeclarationAttribution;
import org.xtext.projet.selemodel.selemodel.Expression;
import org.xtext.projet.selemodel.selemodel.Fill;
import org.xtext.projet.selemodel.selemodel.Function;
import org.xtext.projet.selemodel.selemodel.FunctionCall;
import org.xtext.projet.selemodel.selemodel.Model;
import org.xtext.projet.selemodel.selemodel.Navigate;
import org.xtext.projet.selemodel.selemodel.OpenBrowser;
import org.xtext.projet.selemodel.selemodel.SelemodelPackage;
import org.xtext.projet.selemodel.selemodel.Test;
import org.xtext.projet.selemodel.selemodel.Uncheck;
import org.xtext.projet.selemodel.selemodel.Var;
import org.xtext.projet.selemodel.services.SelemodelGrammarAccess;

@SuppressWarnings("all")
public class SelemodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SelemodelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SelemodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SelemodelPackage.ACTION:
				sequence_Action(context, (org.xtext.projet.selemodel.selemodel.Action) semanticObject); 
				return; 
			case SelemodelPackage.ASSERTION:
				sequence_Assertion(context, (Assertion) semanticObject); 
				return; 
			case SelemodelPackage.ATTRIBUABLE:
				sequence_Attribuable(context, (Attribuable) semanticObject); 
				return; 
			case SelemodelPackage.ATTRIBUT:
				sequence_Attribut(context, (Attribut) semanticObject); 
				return; 
			case SelemodelPackage.ATTRIBUTION:
				sequence_Attribution(context, (Attribution) semanticObject); 
				return; 
			case SelemodelPackage.CHECK:
				sequence_Check(context, (Check) semanticObject); 
				return; 
			case SelemodelPackage.CHOOSE:
				sequence_Choose(context, (Choose) semanticObject); 
				return; 
			case SelemodelPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case SelemodelPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case SelemodelPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case SelemodelPackage.CONTAINERS:
				sequence_Containers(context, (Containers) semanticObject); 
				return; 
			case SelemodelPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case SelemodelPackage.DECLARATION_ATTRIBUTION:
				sequence_DeclarationAttribution(context, (DeclarationAttribution) semanticObject); 
				return; 
			case SelemodelPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case SelemodelPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case SelemodelPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case SelemodelPackage.FUNCTION_CALL:
				sequence_FunctionCall(context, (FunctionCall) semanticObject); 
				return; 
			case SelemodelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SelemodelPackage.NAVIGATE:
				sequence_Navigate(context, (Navigate) semanticObject); 
				return; 
			case SelemodelPackage.OPEN_BROWSER:
				sequence_OpenBrowser(context, (OpenBrowser) semanticObject); 
				return; 
			case SelemodelPackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case SelemodelPackage.UNCHECK:
				sequence_Uncheck(context, (Uncheck) semanticObject); 
				return; 
			case SelemodelPackage.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (
	 *         brw=OpenBrowser | 
	 *         fil=Fill | 
	 *         cli=Click | 
	 *         nav=Navigate | 
	 *         cho=Choose | 
	 *         che=Check | 
	 *         unc=Uncheck
	 *     )
	 */
	protected void sequence_Action(ISerializationContext context, org.xtext.projet.selemodel.selemodel.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Assertion returns Assertion
	 *
	 * Constraint:
	 *     ((att1=Attribuable att2=Attribuable) | (con1=Container con2=Container))
	 */
	protected void sequence_Assertion(ISerializationContext context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribuable returns Attribuable
	 *
	 * Constraint:
	 *     (str=STRING | attr=Attribut | ref=[Var|ID])
	 */
	protected void sequence_Attribuable(ISerializationContext context, Attribuable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribut returns Attribut
	 *
	 * Constraint:
	 *     ((container=Container (champ=Champ | len=Length)) | (containers=Containers len=Length))
	 */
	protected void sequence_Attribut(ISerializationContext context, Attribut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribution returns Attribution
	 *
	 * Constraint:
	 *     (var=[Var|ID] attb=Attribuable)
	 */
	protected void sequence_Attribution(ISerializationContext context, Attribution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.ATTRIBUTION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.ATTRIBUTION__VAR));
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.ATTRIBUTION__ATTB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.ATTRIBUTION__ATTB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributionAccess().getVarVarIDTerminalRuleCall_0_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAttributionAccess().getAttbAttribuableParserRuleCall_2_0(), semanticObject.getAttb());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Check returns Check
	 *
	 * Constraint:
	 *     (container=Container | containers=Containers)
	 */
	protected void sequence_Check(ISerializationContext context, Check semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Choose returns Choose
	 *
	 * Constraint:
	 *     (container=Container attb=Attribuable)
	 */
	protected void sequence_Choose(ISerializationContext context, Choose semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.CHOOSE__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.CHOOSE__CONTAINER));
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.CHOOSE__ATTB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.CHOOSE__ATTB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChooseAccess().getContainerContainerParserRuleCall_1_0(), semanticObject.getContainer());
		feeder.accept(grammarAccess.getChooseAccess().getAttbAttribuableParserRuleCall_2_0(), semanticObject.getAttb());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Click returns Click
	 *
	 * Constraint:
	 *     container=Container
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.CLICK__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.CLICK__CONTAINER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickAccess().getContainerContainerParserRuleCall_1_0(), semanticObject.getContainer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (champ=Champ (str=STRING | ref=[Var|ID]))
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     (typeContainer=TypeContainer conditions+=Condition* (hierarchy+=ParentContainer | hierarchy+=ChildContainer)*)
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Containers returns Containers
	 *
	 * Constraint:
	 *     (typeContainer=TypeContainer conditions+=Condition*)
	 */
	protected void sequence_Containers(ISerializationContext context, Containers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeclarationAttribution returns DeclarationAttribution
	 *
	 * Constraint:
	 *     (dec=Declaration attb=Attribuable)
	 */
	protected void sequence_DeclarationAttribution(ISerializationContext context, DeclarationAttribution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.DECLARATION_ATTRIBUTION__DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.DECLARATION_ATTRIBUTION__DEC));
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.DECLARATION_ATTRIBUTION__ATTB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.DECLARATION_ATTRIBUTION__ATTB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclarationAttributionAccess().getDecDeclarationParserRuleCall_0_0(), semanticObject.getDec());
		feeder.accept(grammarAccess.getDeclarationAttributionAccess().getAttbAttribuableParserRuleCall_2_0(), semanticObject.getAttb());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     var=Var
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.DECLARATION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.DECLARATION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclarationAccess().getVarVarParserRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (
	 *         dec=Declaration | 
	 *         att=Attribution | 
	 *         act=Action | 
	 *         ass=Assertion | 
	 *         fun=FunctionCall | 
	 *         decatt=DeclarationAttribution
	 *     )
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (container=Container attb=Attribuable)
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.FILL__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.FILL__CONTAINER));
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.FILL__ATTB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.FILL__ATTB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFillAccess().getContainerContainerParserRuleCall_1_0(), semanticObject.getContainer());
		feeder.accept(grammarAccess.getFillAccess().getAttbAttribuableParserRuleCall_2_0(), semanticObject.getAttb());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FunctionCall returns FunctionCall
	 *
	 * Constraint:
	 *     (ref=[Function|ID] (param+=Attribuable param+=Attribuable*)?)
	 */
	protected void sequence_FunctionCall(ISerializationContext context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=ID (param+=Declaration param+=Declaration*)? expressions+=Expression*)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     ((test+=Test+ functions+=Function+) | functions+=Function+)?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Navigate returns Navigate
	 *
	 * Constraint:
	 *     attb=Attribuable
	 */
	protected void sequence_Navigate(ISerializationContext context, Navigate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.NAVIGATE__ATTB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.NAVIGATE__ATTB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNavigateAccess().getAttbAttribuableParserRuleCall_1_0(), semanticObject.getAttb());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OpenBrowser returns OpenBrowser
	 *
	 * Constraint:
	 *     browser=Browsers
	 */
	protected void sequence_OpenBrowser(ISerializationContext context, OpenBrowser semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.OPEN_BROWSER__BROWSER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.OPEN_BROWSER__BROWSER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOpenBrowserAccess().getBrowserBrowsersParserRuleCall_1_0(), semanticObject.getBrowser());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     expressions+=Expression+
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Uncheck returns Uncheck
	 *
	 * Constraint:
	 *     (container=Container | containers=Containers)
	 */
	protected void sequence_Uncheck(ISerializationContext context, Uncheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Var
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SelemodelPackage.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SelemodelPackage.Literals.VAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}