/*
* generated by Xtext
*/
package org.eclipselabs.mscript.language.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.mscript.language.services.MscriptGrammarAccess;

public class MscriptParser extends AbstractContentAssistParser {
	
	@Inject
	private MscriptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser createParser() {
		org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser result = new org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDefinitionAccess().getAlternatives(), "rule__Definition__Alternatives");
					put(grammarAccess.getDataTypeDefinitionAccess().getAlternatives(), "rule__DataTypeDefinition__Alternatives");
					put(grammarAccess.getFunctionDefinitionAccess().getAlternatives_11(), "rule__FunctionDefinition__Alternatives_11");
					put(grammarAccess.getDataTypeSpecifierAccess().getAlternatives(), "rule__DataTypeSpecifier__Alternatives");
					put(grammarAccess.getPrimitiveTypeSpecifierAccess().getAlternatives(), "rule__PrimitiveTypeSpecifier__Alternatives");
					put(grammarAccess.getNumericTypeSpecifierAccess().getAlternatives(), "rule__NumericTypeSpecifier__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getAlternatives_0(), "rule__LetExpressionVariableDeclaration__Alternatives_0");
					put(grammarAccess.getRelationalExpressionAccess().getAlternatives_1_1(), "rule__RelationalExpression__Alternatives_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getCallablePrimaryExpressionAccess().getAlternatives(), "rule__CallablePrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getNumericLiteralAccess().getAlternatives(), "rule__NumericLiteral__Alternatives");
					put(grammarAccess.getFeatureCallAccess().getAlternatives(), "rule__FeatureCall__Alternatives");
					put(grammarAccess.getFeatureCallPartAccess().getAlternatives(), "rule__FeatureCallPart__Alternatives");
					put(grammarAccess.getFeatureAccessAccess().getNameAlternatives_1_0(), "rule__FeatureAccess__NameAlternatives_1_0");
					put(grammarAccess.getArraySubscriptAccess().getAlternatives(), "rule__ArraySubscript__Alternatives");
					put(grammarAccess.getArrayConstructionOperatorAccess().getAlternatives_2(), "rule__ArrayConstructionOperator__Alternatives_2");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getAlternatives(), "rule__UnitExpressionNumerator__Alternatives");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getAlternatives(), "rule__UnitExpressionDenominator__Alternatives");
					put(grammarAccess.getAssertionStatusKindAccess().getAlternatives(), "rule__AssertionStatusKind__Alternatives");
					put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getPowerOperatorAccess().getAlternatives(), "rule__PowerOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getBooleanKindAccess().getAlternatives(), "rule__BooleanKind__Alternatives");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup(), "rule__EnumerationDefinition__Group__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup_3(), "rule__EnumerationDefinition__Group_3__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup_3_1(), "rule__EnumerationDefinition__Group_3_1__0");
					put(grammarAccess.getTypeAliasDefinitionAccess().getGroup(), "rule__TypeAliasDefinition__Group__0");
					put(grammarAccess.getRecordDefinitionAccess().getGroup(), "rule__RecordDefinition__Group__0");
					put(grammarAccess.getRecordFieldDeclarationAccess().getGroup(), "rule__RecordFieldDeclaration__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_3(), "rule__FunctionDefinition__Group_3__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_3_2(), "rule__FunctionDefinition__Group_3_2__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_5(), "rule__FunctionDefinition__Group_5__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_5_1(), "rule__FunctionDefinition__Group_5_1__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_9(), "rule__FunctionDefinition__Group_9__0");
					put(grammarAccess.getAssertionAccess().getGroup(), "rule__Assertion__Group__0");
					put(grammarAccess.getStateVariableDeclarationAccess().getGroup(), "rule__StateVariableDeclaration__Group__0");
					put(grammarAccess.getFunctorDeclarationAccess().getGroup(), "rule__FunctorDeclaration__Group__0");
					put(grammarAccess.getFunctorDeclarationAccess().getGroup_4(), "rule__FunctorDeclaration__Group_4__0");
					put(grammarAccess.getFunctorDeclarationAccess().getGroup_4_2(), "rule__FunctorDeclaration__Group_4_2__0");
					put(grammarAccess.getEquationAccess().getGroup(), "rule__Equation__Group__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup(), "rule__RealTypeSpecifier__Group__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup_2(), "rule__RealTypeSpecifier__Group_2__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup_3(), "rule__RealTypeSpecifier__Group_3__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup_3_2(), "rule__RealTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup(), "rule__IntegerTypeSpecifier__Group__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup_2(), "rule__IntegerTypeSpecifier__Group_2__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup_3(), "rule__IntegerTypeSpecifier__Group_3__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup_3_2(), "rule__IntegerTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup(), "rule__ComplexTypeSpecifier__Group__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup_2(), "rule__ComplexTypeSpecifier__Group_2__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup_3(), "rule__ComplexTypeSpecifier__Group_3__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup_3_2(), "rule__ComplexTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup(), "rule__GaussianTypeSpecifier__Group__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup_2(), "rule__GaussianTypeSpecifier__Group_2__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup_3(), "rule__GaussianTypeSpecifier__Group_3__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup_3_2(), "rule__GaussianTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getGroup(), "rule__BooleanTypeSpecifier__Group__0");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getGroup_2(), "rule__BooleanTypeSpecifier__Group_2__0");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getGroup_2_2(), "rule__BooleanTypeSpecifier__Group_2_2__0");
					put(grammarAccess.getStringTypeSpecifierAccess().getGroup(), "rule__StringTypeSpecifier__Group__0");
					put(grammarAccess.getStringTypeSpecifierAccess().getGroup_2(), "rule__StringTypeSpecifier__Group_2__0");
					put(grammarAccess.getStringTypeSpecifierAccess().getGroup_2_2(), "rule__StringTypeSpecifier__Group_2_2__0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getGroup(), "rule__NamedTypeSpecifier__Group__0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getGroup_1(), "rule__NamedTypeSpecifier__Group_1__0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getGroup_1_2(), "rule__NamedTypeSpecifier__Group_1_2__0");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getGroup(), "rule__ArrayDimensionSpecification__Group__0");
					put(grammarAccess.getLetExpressionAccess().getGroup(), "rule__LetExpression__Group__0");
					put(grammarAccess.getLetExpressionAccess().getGroup_2(), "rule__LetExpression__Group_2__0");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getGroup(), "rule__LetExpressionVariableDeclaration__Group__0");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getGroup_0_1(), "rule__LetExpressionVariableDeclaration__Group_0_1__0");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getGroup_0_1_2(), "rule__LetExpressionVariableDeclaration__Group_0_1_2__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getSwitchExpressionAccess().getGroup(), "rule__SwitchExpression__Group__0");
					put(grammarAccess.getSwitchCaseAccess().getGroup(), "rule__SwitchCase__Group__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup(), "rule__RangeExpression__Group__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup_1(), "rule__RangeExpression__Group_1__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup_1_3(), "rule__RangeExpression__Group_1_3__0");
					put(grammarAccess.getImpliesExpressionAccess().getGroup(), "rule__ImpliesExpression__Group__0");
					put(grammarAccess.getImpliesExpressionAccess().getGroup_1(), "rule__ImpliesExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1(), "rule__LogicalOrExpression__Group_1_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1(), "rule__LogicalAndExpression__Group_1_1__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_1_0(), "rule__RelationalExpression__Group_1_1_0__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_1_1(), "rule__RelationalExpression__Group_1_1_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionPartAccess().getGroup(), "rule__AdditiveExpressionPart__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionPartAccess().getGroup(), "rule__MultiplicativeExpressionPart__Group__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup(), "rule__PowerExpression__Group__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup_1(), "rule__PowerExpression__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_1(), "rule__UnaryExpression__Group_1__0");
					put(grammarAccess.getPostfixExpressionAccess().getGroup(), "rule__PostfixExpression__Group__0");
					put(grammarAccess.getPostfixExpressionAccess().getGroup_1(), "rule__PostfixExpression__Group_1__0");
					put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
					put(grammarAccess.getRealLiteralAccess().getGroup_2(), "rule__RealLiteral__Group_2__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup(), "rule__IntegerLiteral__Group__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup_2(), "rule__IntegerLiteral__Group_2__0");
					put(grammarAccess.getSimpleNameAccess().getGroup(), "rule__SimpleName__Group__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_0(), "rule__FeatureCall__Group_0__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_0_1(), "rule__FeatureCall__Group_0_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1(), "rule__FeatureCall__Group_1__0");
					put(grammarAccess.getFeatureAccessAccess().getGroup(), "rule__FeatureAccess__Group__0");
					put(grammarAccess.getArrayElementAccessAccess().getGroup(), "rule__ArrayElementAccess__Group__0");
					put(grammarAccess.getArrayElementAccessAccess().getGroup_2(), "rule__ArrayElementAccess__Group_2__0");
					put(grammarAccess.getOperationCallAccess().getGroup(), "rule__OperationCall__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2(), "rule__OperationCall__Group_2__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2_1(), "rule__OperationCall__Group_2_1__0");
					put(grammarAccess.getIterationCallAccess().getGroup(), "rule__IterationCall__Group__0");
					put(grammarAccess.getIterationCallAccess().getGroup_3(), "rule__IterationCall__Group_3__0");
					put(grammarAccess.getIterationCallAccess().getGroup_4(), "rule__IterationCall__Group_4__0");
					put(grammarAccess.getIterationAccumulatorAccess().getGroup(), "rule__IterationAccumulator__Group__0");
					put(grammarAccess.getArrayConstructionOperatorAccess().getGroup(), "rule__ArrayConstructionOperator__Group__0");
					put(grammarAccess.getArrayConstructionOperatorAccess().getGroup_2_0(), "rule__ArrayConstructionOperator__Group_2_0__0");
					put(grammarAccess.getArrayConstructionOperatorAccess().getGroup_2_1(), "rule__ArrayConstructionOperator__Group_2_1__0");
					put(grammarAccess.getArrayConstructionOperatorAccess().getGroup_2_1_2(), "rule__ArrayConstructionOperator__Group_2_1_2__0");
					put(grammarAccess.getArrayConstructionIterationClauseAccess().getGroup(), "rule__ArrayConstructionIterationClause__Group__0");
					put(grammarAccess.getArrayConcatenationOperatorAccess().getGroup(), "rule__ArrayConcatenationOperator__Group__0");
					put(grammarAccess.getArrayConcatenationOperatorAccess().getGroup_2(), "rule__ArrayConcatenationOperator__Group_2__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
					put(grammarAccess.getUnitConstructionOperatorAccess().getGroup(), "rule__UnitConstructionOperator__Group__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup_2(), "rule__ParenthesizedExpression__Group_2__0");
					put(grammarAccess.getBeginExpressionAccess().getGroup(), "rule__BeginExpression__Group__0");
					put(grammarAccess.getEndExpressionAccess().getGroup(), "rule__EndExpression__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup(), "rule__UnitExpression__Group__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup_1(), "rule__UnitExpression__Group_1__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup_1_1(), "rule__UnitExpression__Group_1_1__0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getGroup_1(), "rule__UnitExpressionNumerator__Group_1__0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getGroup_1_1(), "rule__UnitExpressionNumerator__Group_1_1__0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getGroup_1(), "rule__UnitExpressionDenominator__Group_1__0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getGroup_1_2(), "rule__UnitExpressionDenominator__Group_1_2__0");
					put(grammarAccess.getUnitExpressionFactorAccess().getGroup(), "rule__UnitExpressionFactor__Group__0");
					put(grammarAccess.getUnitExpressionFactorAccess().getGroup_1(), "rule__UnitExpressionFactor__Group_1__0");
					put(grammarAccess.getUnitExpressionExponentAccess().getGroup(), "rule__UnitExpressionExponent__Group__0");
					put(grammarAccess.getModuleAccess().getDefinitionsAssignment(), "rule__Module__DefinitionsAssignment");
					put(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1(), "rule__EnumerationDefinition__NameAssignment_1");
					put(grammarAccess.getEnumerationDefinitionAccess().getLiteralDeclarationsAssignment_3_0(), "rule__EnumerationDefinition__LiteralDeclarationsAssignment_3_0");
					put(grammarAccess.getEnumerationDefinitionAccess().getLiteralDeclarationsAssignment_3_1_1(), "rule__EnumerationDefinition__LiteralDeclarationsAssignment_3_1_1");
					put(grammarAccess.getEnumerationLiteralDeclarationAccess().getNameAssignment(), "rule__EnumerationLiteralDeclaration__NameAssignment");
					put(grammarAccess.getTypeAliasDefinitionAccess().getNameAssignment_1(), "rule__TypeAliasDefinition__NameAssignment_1");
					put(grammarAccess.getTypeAliasDefinitionAccess().getTypeAssignment_3(), "rule__TypeAliasDefinition__TypeAssignment_3");
					put(grammarAccess.getRecordDefinitionAccess().getNameAssignment_1(), "rule__RecordDefinition__NameAssignment_1");
					put(grammarAccess.getRecordDefinitionAccess().getFieldDeclarationsAssignment_3(), "rule__RecordDefinition__FieldDeclarationsAssignment_3");
					put(grammarAccess.getRecordFieldDeclarationAccess().getNameAssignment_0(), "rule__RecordFieldDeclaration__NameAssignment_0");
					put(grammarAccess.getRecordFieldDeclarationAccess().getTypeAssignment_2(), "rule__RecordFieldDeclaration__TypeAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getStatefulAssignment_0(), "rule__FunctionDefinition__StatefulAssignment_0");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_2(), "rule__FunctionDefinition__NameAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getTemplateParameterDeclarationsAssignment_3_1(), "rule__FunctionDefinition__TemplateParameterDeclarationsAssignment_3_1");
					put(grammarAccess.getFunctionDefinitionAccess().getTemplateParameterDeclarationsAssignment_3_2_1(), "rule__FunctionDefinition__TemplateParameterDeclarationsAssignment_3_2_1");
					put(grammarAccess.getFunctionDefinitionAccess().getInputParameterDeclarationsAssignment_5_0(), "rule__FunctionDefinition__InputParameterDeclarationsAssignment_5_0");
					put(grammarAccess.getFunctionDefinitionAccess().getInputParameterDeclarationsAssignment_5_1_1(), "rule__FunctionDefinition__InputParameterDeclarationsAssignment_5_1_1");
					put(grammarAccess.getFunctionDefinitionAccess().getOutputParameterDeclarationsAssignment_8(), "rule__FunctionDefinition__OutputParameterDeclarationsAssignment_8");
					put(grammarAccess.getFunctionDefinitionAccess().getOutputParameterDeclarationsAssignment_9_1(), "rule__FunctionDefinition__OutputParameterDeclarationsAssignment_9_1");
					put(grammarAccess.getFunctionDefinitionAccess().getAssertionsAssignment_11_0(), "rule__FunctionDefinition__AssertionsAssignment_11_0");
					put(grammarAccess.getFunctionDefinitionAccess().getFunctorDeclarationsAssignment_11_1(), "rule__FunctionDefinition__FunctorDeclarationsAssignment_11_1");
					put(grammarAccess.getFunctionDefinitionAccess().getStateVariableDeclarationsAssignment_11_2(), "rule__FunctionDefinition__StateVariableDeclarationsAssignment_11_2");
					put(grammarAccess.getFunctionDefinitionAccess().getEquationsAssignment_11_3(), "rule__FunctionDefinition__EquationsAssignment_11_3");
					put(grammarAccess.getParameterDeclarationAccess().getNameAssignment(), "rule__ParameterDeclaration__NameAssignment");
					put(grammarAccess.getAssertionAccess().getStaticAssignment_0(), "rule__Assertion__StaticAssignment_0");
					put(grammarAccess.getAssertionAccess().getConditionAssignment_2(), "rule__Assertion__ConditionAssignment_2");
					put(grammarAccess.getAssertionAccess().getStatusKindAssignment_4(), "rule__Assertion__StatusKindAssignment_4");
					put(grammarAccess.getAssertionAccess().getMessageAssignment_5(), "rule__Assertion__MessageAssignment_5");
					put(grammarAccess.getStateVariableDeclarationAccess().getNameAssignment_1(), "rule__StateVariableDeclaration__NameAssignment_1");
					put(grammarAccess.getFunctorDeclarationAccess().getNameAssignment_1(), "rule__FunctorDeclaration__NameAssignment_1");
					put(grammarAccess.getFunctorDeclarationAccess().getFunctionNameAssignment_3(), "rule__FunctorDeclaration__FunctionNameAssignment_3");
					put(grammarAccess.getFunctorDeclarationAccess().getTemplateArgumentsAssignment_4_1(), "rule__FunctorDeclaration__TemplateArgumentsAssignment_4_1");
					put(grammarAccess.getFunctorDeclarationAccess().getTemplateArgumentsAssignment_4_2_1(), "rule__FunctorDeclaration__TemplateArgumentsAssignment_4_2_1");
					put(grammarAccess.getEquationAccess().getLeftHandSideAssignment_0(), "rule__Equation__LeftHandSideAssignment_0");
					put(grammarAccess.getEquationAccess().getRightHandSideAssignment_2(), "rule__Equation__RightHandSideAssignment_2");
					put(grammarAccess.getRealTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__RealTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getRealTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__RealTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getRealTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__RealTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__IntegerTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__IntegerTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__IntegerTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getComplexTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__ComplexTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getComplexTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__ComplexTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getComplexTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__ComplexTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__GaussianTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__GaussianTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__GaussianTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getDimensionsAssignment_2_1(), "rule__BooleanTypeSpecifier__DimensionsAssignment_2_1");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getDimensionsAssignment_2_2_1(), "rule__BooleanTypeSpecifier__DimensionsAssignment_2_2_1");
					put(grammarAccess.getStringTypeSpecifierAccess().getDimensionsAssignment_2_1(), "rule__StringTypeSpecifier__DimensionsAssignment_2_1");
					put(grammarAccess.getStringTypeSpecifierAccess().getDimensionsAssignment_2_2_1(), "rule__StringTypeSpecifier__DimensionsAssignment_2_2_1");
					put(grammarAccess.getNamedTypeSpecifierAccess().getTypeReferenceAssignment_0(), "rule__NamedTypeSpecifier__TypeReferenceAssignment_0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getDimensionsAssignment_1_1(), "rule__NamedTypeSpecifier__DimensionsAssignment_1_1");
					put(grammarAccess.getNamedTypeSpecifierAccess().getDimensionsAssignment_1_2_1(), "rule__NamedTypeSpecifier__DimensionsAssignment_1_2_1");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getSizeAssignment_1(), "rule__ArrayDimensionSpecification__SizeAssignment_1");
					put(grammarAccess.getLetExpressionAccess().getVariableDeclarationsAssignment_1(), "rule__LetExpression__VariableDeclarationsAssignment_1");
					put(grammarAccess.getLetExpressionAccess().getVariableDeclarationsAssignment_2_1(), "rule__LetExpression__VariableDeclarationsAssignment_2_1");
					put(grammarAccess.getLetExpressionAccess().getTargetExpressionAssignment_4(), "rule__LetExpression__TargetExpressionAssignment_4");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getNamesAssignment_0_0(), "rule__LetExpressionVariableDeclaration__NamesAssignment_0_0");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getNamesAssignment_0_1_1(), "rule__LetExpressionVariableDeclaration__NamesAssignment_0_1_1");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getNamesAssignment_0_1_2_1(), "rule__LetExpressionVariableDeclaration__NamesAssignment_0_1_2_1");
					put(grammarAccess.getLetExpressionVariableDeclarationAccess().getAssignedExpressionAssignment_2(), "rule__LetExpressionVariableDeclaration__AssignedExpressionAssignment_2");
					put(grammarAccess.getIfExpressionAccess().getConditionAssignment_1(), "rule__IfExpression__ConditionAssignment_1");
					put(grammarAccess.getIfExpressionAccess().getThenExpressionAssignment_3(), "rule__IfExpression__ThenExpressionAssignment_3");
					put(grammarAccess.getIfExpressionAccess().getElseExpressionAssignment_5(), "rule__IfExpression__ElseExpressionAssignment_5");
					put(grammarAccess.getSwitchExpressionAccess().getControlExpressionAssignment_1(), "rule__SwitchExpression__ControlExpressionAssignment_1");
					put(grammarAccess.getSwitchExpressionAccess().getCasesAssignment_2(), "rule__SwitchExpression__CasesAssignment_2");
					put(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionAssignment_5(), "rule__SwitchExpression__DefaultExpressionAssignment_5");
					put(grammarAccess.getSwitchCaseAccess().getCaseExpressionAssignment_1(), "rule__SwitchCase__CaseExpressionAssignment_1");
					put(grammarAccess.getSwitchCaseAccess().getResultExpressionAssignment_3(), "rule__SwitchCase__ResultExpressionAssignment_3");
					put(grammarAccess.getRangeExpressionAccess().getOperandsAssignment_1_2(), "rule__RangeExpression__OperandsAssignment_1_2");
					put(grammarAccess.getRangeExpressionAccess().getOperandsAssignment_1_3_1(), "rule__RangeExpression__OperandsAssignment_1_3_1");
					put(grammarAccess.getImpliesExpressionAccess().getRightOperandAssignment_1_2(), "rule__ImpliesExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalOrExpressionAccess().getOperandsAssignment_1_1_1(), "rule__LogicalOrExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getLogicalAndExpressionAccess().getOperandsAssignment_1_1_1(), "rule__LogicalAndExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1(), "rule__EqualityExpression__OperatorAssignment_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getRightOperandAssignment_1_2(), "rule__EqualityExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getTypeTestAssignment_1_1_0_0(), "rule__RelationalExpression__TypeTestAssignment_1_1_0_0");
					put(grammarAccess.getRelationalExpressionAccess().getTypeAssignment_1_1_0_1(), "rule__RelationalExpression__TypeAssignment_1_1_0_1");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1_1_0(), "rule__RelationalExpression__OperatorAssignment_1_1_1_0");
					put(grammarAccess.getRelationalExpressionAccess().getRightOperandAssignment_1_1_1_1(), "rule__RelationalExpression__RightOperandAssignment_1_1_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightPartsAssignment_1_1(), "rule__AdditiveExpression__RightPartsAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionPartAccess().getOperatorAssignment_0(), "rule__AdditiveExpressionPart__OperatorAssignment_0");
					put(grammarAccess.getAdditiveExpressionPartAccess().getOperandAssignment_1(), "rule__AdditiveExpressionPart__OperandAssignment_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightPartsAssignment_1_1(), "rule__MultiplicativeExpression__RightPartsAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionPartAccess().getOperatorAssignment_0(), "rule__MultiplicativeExpressionPart__OperatorAssignment_0");
					put(grammarAccess.getMultiplicativeExpressionPartAccess().getOperandAssignment_1(), "rule__MultiplicativeExpressionPart__OperandAssignment_1");
					put(grammarAccess.getPowerExpressionAccess().getOperatorAssignment_1_1(), "rule__PowerExpression__OperatorAssignment_1_1");
					put(grammarAccess.getPowerExpressionAccess().getExponentAssignment_1_2(), "rule__PowerExpression__ExponentAssignment_1_2");
					put(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1_1(), "rule__UnaryExpression__OperatorAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2(), "rule__UnaryExpression__OperandAssignment_1_2");
					put(grammarAccess.getPostfixExpressionAccess().getOperatorAssignment_1_1(), "rule__PostfixExpression__OperatorAssignment_1_1");
					put(grammarAccess.getRealLiteralAccess().getValueAssignment_0(), "rule__RealLiteral__ValueAssignment_0");
					put(grammarAccess.getRealLiteralAccess().getModifierAssignment_1(), "rule__RealLiteral__ModifierAssignment_1");
					put(grammarAccess.getRealLiteralAccess().getUnitAssignment_2_1(), "rule__RealLiteral__UnitAssignment_2_1");
					put(grammarAccess.getIntegerLiteralAccess().getValueAssignment_0(), "rule__IntegerLiteral__ValueAssignment_0");
					put(grammarAccess.getIntegerLiteralAccess().getModifierAssignment_1(), "rule__IntegerLiteral__ModifierAssignment_1");
					put(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_2_1(), "rule__IntegerLiteral__UnitAssignment_2_1");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(), "rule__BooleanLiteral__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getSimpleNameAccess().getIdentifierAssignment_1(), "rule__SimpleName__IdentifierAssignment_1");
					put(grammarAccess.getFeatureCallAccess().getPartsAssignment_0_1_1(), "rule__FeatureCall__PartsAssignment_0_1_1");
					put(grammarAccess.getFeatureCallAccess().getTargetAssignment_1_1(), "rule__FeatureCall__TargetAssignment_1_1");
					put(grammarAccess.getFeatureCallAccess().getPartsAssignment_1_2(), "rule__FeatureCall__PartsAssignment_1_2");
					put(grammarAccess.getFeatureAccessAccess().getNameAssignment_1(), "rule__FeatureAccess__NameAssignment_1");
					put(grammarAccess.getArrayElementAccessAccess().getSubscriptsAssignment_1(), "rule__ArrayElementAccess__SubscriptsAssignment_1");
					put(grammarAccess.getArrayElementAccessAccess().getSubscriptsAssignment_2_1(), "rule__ArrayElementAccess__SubscriptsAssignment_2_1");
					put(grammarAccess.getArraySubscriptAccess().getSliceAssignment_0(), "rule__ArraySubscript__SliceAssignment_0");
					put(grammarAccess.getArraySubscriptAccess().getExpressionAssignment_1(), "rule__ArraySubscript__ExpressionAssignment_1");
					put(grammarAccess.getOperationCallAccess().getArgumentsAssignment_2_0(), "rule__OperationCall__ArgumentsAssignment_2_0");
					put(grammarAccess.getOperationCallAccess().getArgumentsAssignment_2_1_1(), "rule__OperationCall__ArgumentsAssignment_2_1_1");
					put(grammarAccess.getIterationCallAccess().getVariablesAssignment_2(), "rule__IterationCall__VariablesAssignment_2");
					put(grammarAccess.getIterationCallAccess().getVariablesAssignment_3_1(), "rule__IterationCall__VariablesAssignment_3_1");
					put(grammarAccess.getIterationCallAccess().getAccumulatorAssignment_4_1(), "rule__IterationCall__AccumulatorAssignment_4_1");
					put(grammarAccess.getIterationCallAccess().getExpressionAssignment_6(), "rule__IterationCall__ExpressionAssignment_6");
					put(grammarAccess.getIterationVariableAccess().getNameAssignment(), "rule__IterationVariable__NameAssignment");
					put(grammarAccess.getIterationAccumulatorAccess().getNameAssignment_0(), "rule__IterationAccumulator__NameAssignment_0");
					put(grammarAccess.getIterationAccumulatorAccess().getInitializerAssignment_2(), "rule__IterationAccumulator__InitializerAssignment_2");
					put(grammarAccess.getArrayConstructionOperatorAccess().getExpressionsAssignment_1(), "rule__ArrayConstructionOperator__ExpressionsAssignment_1");
					put(grammarAccess.getArrayConstructionOperatorAccess().getExpressionsAssignment_2_0_1(), "rule__ArrayConstructionOperator__ExpressionsAssignment_2_0_1");
					put(grammarAccess.getArrayConstructionOperatorAccess().getIterationClausesAssignment_2_1_1(), "rule__ArrayConstructionOperator__IterationClausesAssignment_2_1_1");
					put(grammarAccess.getArrayConstructionOperatorAccess().getIterationClausesAssignment_2_1_2_1(), "rule__ArrayConstructionOperator__IterationClausesAssignment_2_1_2_1");
					put(grammarAccess.getArrayConstructionIterationClauseAccess().getVariableNameAssignment_0(), "rule__ArrayConstructionIterationClause__VariableNameAssignment_0");
					put(grammarAccess.getArrayConstructionIterationClauseAccess().getCollectionExpressionAssignment_2(), "rule__ArrayConstructionIterationClause__CollectionExpressionAssignment_2");
					put(grammarAccess.getArrayConcatenationOperatorAccess().getRowsAssignment_1(), "rule__ArrayConcatenationOperator__RowsAssignment_1");
					put(grammarAccess.getArrayConcatenationOperatorAccess().getRowsAssignment_2_1(), "rule__ArrayConcatenationOperator__RowsAssignment_2_1");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_0(), "rule__ExpressionList__ExpressionsAssignment_0");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_1(), "rule__ExpressionList__ExpressionsAssignment_1_1");
					put(grammarAccess.getUnitConstructionOperatorAccess().getUnitAssignment_2(), "rule__UnitConstructionOperator__UnitAssignment_2");
					put(grammarAccess.getParenthesizedExpressionAccess().getExpressionsAssignment_1(), "rule__ParenthesizedExpression__ExpressionsAssignment_1");
					put(grammarAccess.getParenthesizedExpressionAccess().getExpressionsAssignment_2_1(), "rule__ParenthesizedExpression__ExpressionsAssignment_2_1");
					put(grammarAccess.getQualifiedNameAccess().getIdentifiersAssignment_0(), "rule__QualifiedName__IdentifiersAssignment_0");
					put(grammarAccess.getQualifiedNameAccess().getIdentifiersAssignment_1_1(), "rule__QualifiedName__IdentifiersAssignment_1_1");
					put(grammarAccess.getUnitExpressionAccess().getNumeratorAssignment_1_0(), "rule__UnitExpression__NumeratorAssignment_1_0");
					put(grammarAccess.getUnitExpressionAccess().getDenominatorAssignment_1_1_1(), "rule__UnitExpression__DenominatorAssignment_1_1_1");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getOneAssignment_0(), "rule__UnitExpressionNumerator__OneAssignment_0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getFactorsAssignment_1_0(), "rule__UnitExpressionNumerator__FactorsAssignment_1_0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getFactorsAssignment_1_1_1(), "rule__UnitExpressionNumerator__FactorsAssignment_1_1_1");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getFactorsAssignment_0(), "rule__UnitExpressionDenominator__FactorsAssignment_0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getFactorsAssignment_1_1(), "rule__UnitExpressionDenominator__FactorsAssignment_1_1");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getFactorsAssignment_1_2_1(), "rule__UnitExpressionDenominator__FactorsAssignment_1_2_1");
					put(grammarAccess.getUnitExpressionFactorAccess().getOperandAssignment_0(), "rule__UnitExpressionFactor__OperandAssignment_0");
					put(grammarAccess.getUnitExpressionFactorAccess().getExponentAssignment_1_1(), "rule__UnitExpressionFactor__ExponentAssignment_1_1");
					put(grammarAccess.getUnitExpressionExponentAccess().getNegativeAssignment_0(), "rule__UnitExpressionExponent__NegativeAssignment_0");
					put(grammarAccess.getUnitExpressionExponentAccess().getValueAssignment_1(), "rule__UnitExpressionExponent__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser typedParser = (org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser) parser;
			typedParser.entryRuleModule();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MscriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MscriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
