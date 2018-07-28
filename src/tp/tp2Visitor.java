// Generated from /home/mauro/Software/TC/TP1/src/tp/tp2.g4 by ANTLR 4.5.3
package tp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tp2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tp2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tp2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tp2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#rec_instruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRec_instruc(tp2Parser.Rec_instrucContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#instruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruc(tp2Parser.InstrucContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(tp2Parser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(tp2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#baseexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseexp(tp2Parser.BaseexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(tp2Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(tp2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(tp2Parser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(tp2Parser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#func_def_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_param(tp2Parser.Func_def_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#func_prot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_prot(tp2Parser.Func_protContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#func_prot_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_prot_param(tp2Parser.Func_prot_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(tp2Parser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#func_call_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_param(tp2Parser.Func_call_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(tp2Parser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#dec_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_comma(tp2Parser.Dec_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(tp2Parser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#elcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElcond(tp2Parser.ElcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(tp2Parser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp2Parser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(tp2Parser.WhileloopContext ctx);
}