/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.ArrayList;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 *
 * @author mauro
 */
public class tp2ParamVisitor extends AbstractParseTreeVisitor<ArrayList<ExpressionType>> implements tp2Visitor<ArrayList<ExpressionType>> {

    @Override
    public ArrayList<ExpressionType> visitFunc_prot_param(tp2Parser.Func_prot_paramContext ctx) {
        ArrayList <ExpressionType> ret;
        if(ctx.func_prot_param()==null){
            ret = new ArrayList<>();
        }
        else{
            ret = visit(ctx.func_prot_param());
        }
        ret.add(ExpressionType.fromString((ctx.TYPE().toString())));
        return ret;
    }
    
    @Override
    public ArrayList<ExpressionType> visitProgram(tp2Parser.ProgramContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<ExpressionType> visitRec_instruc(tp2Parser.Rec_instrucContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<ExpressionType> visitInstruc(tp2Parser.InstrucContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<ExpressionType> visitSentence(tp2Parser.SentenceContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<ExpressionType> visitBlock(tp2Parser.BlockContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitBaseexp(tp2Parser.BaseexpContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitExp(tp2Parser.ExpContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitAssign(tp2Parser.AssignContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitRet(tp2Parser.RetContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitFunc_def(tp2Parser.Func_defContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitFunc_def_param(tp2Parser.Func_def_paramContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitFunc_prot(tp2Parser.Func_protContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitFunc_call(tp2Parser.Func_callContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitFunc_call_param(tp2Parser.Func_call_paramContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitDeclare(tp2Parser.DeclareContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitDec_comma(tp2Parser.Dec_commaContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitCond(tp2Parser.CondContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitElcond(tp2Parser.ElcondContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitForloop(tp2Parser.ForloopContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExpressionType> visitWhileloop(tp2Parser.WhileloopContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
