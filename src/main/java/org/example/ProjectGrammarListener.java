package org.example;
// Generated from ProjectGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.io.IOException;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectGrammarParser}.
 */
public interface ProjectGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(ProjectGrammarParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(ProjectGrammarParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#directory}.
	 * @param ctx the parse tree
	 */
	void enterDirectory(ProjectGrammarParser.DirectoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#directory}.
	 * @param ctx the parse tree
	 */
	void exitDirectory(ProjectGrammarParser.DirectoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ProjectGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ProjectGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#scriptSection}.
	 * @param ctx the parse tree
	 */
	void enterScriptSection(ProjectGrammarParser.ScriptSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#scriptSection}.
	 * @param ctx the parse tree
	 */
	void exitScriptSection(ProjectGrammarParser.ScriptSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#npmSection}.
	 * @param ctx the parse tree
	 */
	void enterNpmSection(ProjectGrammarParser.NpmSectionContext ctx) throws IOException, InterruptedException;
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#npmSection}.
	 * @param ctx the parse tree
	 */
	void exitNpmSection(ProjectGrammarParser.NpmSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectGrammarParser#dependencies}.
	 * @param ctx the parse tree
	 */
	void enterDependencies(ProjectGrammarParser.DependenciesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectGrammarParser#dependencies}.
	 * @param ctx the parse tree
	 */
	void exitDependencies(ProjectGrammarParser.DependenciesContext ctx);
}