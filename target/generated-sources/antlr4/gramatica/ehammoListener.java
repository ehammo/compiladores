// Generated from ehammo.g4 by ANTLR 4.4
package gramatica;

  import ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ehammoParser}.
 */
public interface ehammoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ehammoParser#methodDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationList(@NotNull ehammoParser.MethodDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#methodDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationList(@NotNull ehammoParser.MethodDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull ehammoParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull ehammoParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationList(@NotNull ehammoParser.VarDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationList(@NotNull ehammoParser.VarDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull ehammoParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull ehammoParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull ehammoParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull ehammoParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ehammoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ehammoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull ehammoParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull ehammoParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ehammoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ehammoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull ehammoParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull ehammoParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull ehammoParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull ehammoParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull ehammoParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull ehammoParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull ehammoParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull ehammoParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(@NotNull ehammoParser.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(@NotNull ehammoParser.FormalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationList(@NotNull ehammoParser.ClassDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationList(@NotNull ehammoParser.ClassDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull ehammoParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull ehammoParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehammoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ehammoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehammoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ehammoParser.StatementContext ctx);
}