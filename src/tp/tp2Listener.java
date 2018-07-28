// Generated from /home/mauro/Software/TC/TP1/src/tp/tp2.g4 by ANTLR 4.5.3
package tp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tp2Parser}.
 */
public interface tp2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tp2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tp2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tp2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#rec_instruc}.
	 * @param ctx the parse tree
	 */
	void enterRec_instruc(tp2Parser.Rec_instrucContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#rec_instruc}.
	 * @param ctx the parse tree
	 */
	void exitRec_instruc(tp2Parser.Rec_instrucContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#instruc}.
	 * @param ctx the parse tree
	 */
	void enterInstruc(tp2Parser.InstrucContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#instruc}.
	 * @param ctx the parse tree
	 */
	void exitInstruc(tp2Parser.InstrucContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(tp2Parser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(tp2Parser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(tp2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(tp2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#baseexp}.
	 * @param ctx the parse tree
	 */
	void enterBaseexp(tp2Parser.BaseexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#baseexp}.
	 * @param ctx the parse tree
	 */
	void exitBaseexp(tp2Parser.BaseexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(tp2Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(tp2Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(tp2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(tp2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(tp2Parser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(tp2Parser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(tp2Parser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(tp2Parser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#func_def_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def_param(tp2Parser.Func_def_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#func_def_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def_param(tp2Parser.Func_def_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#func_prot}.
	 * @param ctx the parse tree
	 */
	void enterFunc_prot(tp2Parser.Func_protContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#func_prot}.
	 * @param ctx the parse tree
	 */
	void exitFunc_prot(tp2Parser.Func_protContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#func_prot_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_prot_param(tp2Parser.Func_prot_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#func_prot_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_prot_param(tp2Parser.Func_prot_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(tp2Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(tp2Parser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#func_call_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_param(tp2Parser.Func_call_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#func_call_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_param(tp2Parser.Func_call_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(tp2Parser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(tp2Parser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#dec_comma}.
	 * @param ctx the parse tree
	 */
	void enterDec_comma(tp2Parser.Dec_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#dec_comma}.
	 * @param ctx the parse tree
	 */
	void exitDec_comma(tp2Parser.Dec_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(tp2Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(tp2Parser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#elcond}.
	 * @param ctx the parse tree
	 */
	void enterElcond(tp2Parser.ElcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#elcond}.
	 * @param ctx the parse tree
	 */
	void exitElcond(tp2Parser.ElcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(tp2Parser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(tp2Parser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2Parser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(tp2Parser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2Parser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(tp2Parser.WhileloopContext ctx);
}