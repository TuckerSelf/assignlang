// Generated from c:/Users/Overlord/Documents/Repositories/assignlang/src/arithlang/ArithLang.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithLangParser}.
 */
public interface ArithLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArithLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArithLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ArithLangParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ArithLangParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#numexp}.
	 * @param ctx the parse tree
	 */
	void enterNumexp(ArithLangParser.NumexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#numexp}.
	 * @param ctx the parse tree
	 */
	void exitNumexp(ArithLangParser.NumexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#addexp}.
	 * @param ctx the parse tree
	 */
	void enterAddexp(ArithLangParser.AddexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#addexp}.
	 * @param ctx the parse tree
	 */
	void exitAddexp(ArithLangParser.AddexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#subexp}.
	 * @param ctx the parse tree
	 */
	void enterSubexp(ArithLangParser.SubexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#subexp}.
	 * @param ctx the parse tree
	 */
	void exitSubexp(ArithLangParser.SubexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#multexp}.
	 * @param ctx the parse tree
	 */
	void enterMultexp(ArithLangParser.MultexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#multexp}.
	 * @param ctx the parse tree
	 */
	void exitMultexp(ArithLangParser.MultexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#divexp}.
	 * @param ctx the parse tree
	 */
	void enterDivexp(ArithLangParser.DivexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#divexp}.
	 * @param ctx the parse tree
	 */
	void exitDivexp(ArithLangParser.DivexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#powexp}.
	 * @param ctx the parse tree
	 */
	void enterPowexp(ArithLangParser.PowexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#powexp}.
	 * @param ctx the parse tree
	 */
	void exitPowexp(ArithLangParser.PowexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#negexp}.
	 * @param ctx the parse tree
	 */
	void enterNegexp(ArithLangParser.NegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#negexp}.
	 * @param ctx the parse tree
	 */
	void exitNegexp(ArithLangParser.NegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#infixadd}.
	 * @param ctx the parse tree
	 */
	void enterInfixadd(ArithLangParser.InfixaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#infixadd}.
	 * @param ctx the parse tree
	 */
	void exitInfixadd(ArithLangParser.InfixaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#infixsub}.
	 * @param ctx the parse tree
	 */
	void enterInfixsub(ArithLangParser.InfixsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#infixsub}.
	 * @param ctx the parse tree
	 */
	void exitInfixsub(ArithLangParser.InfixsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#infixmult}.
	 * @param ctx the parse tree
	 */
	void enterInfixmult(ArithLangParser.InfixmultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#infixmult}.
	 * @param ctx the parse tree
	 */
	void exitInfixmult(ArithLangParser.InfixmultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#infixdiv}.
	 * @param ctx the parse tree
	 */
	void enterInfixdiv(ArithLangParser.InfixdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#infixdiv}.
	 * @param ctx the parse tree
	 */
	void exitInfixdiv(ArithLangParser.InfixdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithLangParser#infixpow}.
	 * @param ctx the parse tree
	 */
	void enterInfixpow(ArithLangParser.InfixpowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithLangParser#infixpow}.
	 * @param ctx the parse tree
	 */
	void exitInfixpow(ArithLangParser.InfixpowContext ctx);
}