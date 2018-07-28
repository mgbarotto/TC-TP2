// Generated from /home/mauro/Software/TC/TP1/src/tp/tp2.g4 by ANTLR 4.5.3
package tp;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link tp2Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 */
public class tp2ExpressionVisitor extends AbstractParseTreeVisitor<ExpressionType> implements tp2Visitor<ExpressionType> {
	@Override public ExpressionType visitBaseexp(tp2Parser.BaseexpContext ctx) { 
            try {
                if(ctx.INT()!=null) return ExpressionType.Int;
                if(ctx.FLOAT()!=null) return ExpressionType.Float;
                if(ctx.ID()!=null) return SymTable.getInstance().lookupSymbol(ctx.ID().toString()).getType();
                if(ctx.CHAR()!=null) return ExpressionType.Char;
                if(ctx.func_call() != null) return SymTable.getInstance().lookupSymbol(ctx.func_call().ID().toString()).getType();
                return ExpressionType.Unknown;
            } catch (Exception ex) {
                Logger.getLogger(tp2ExpressionVisitor.class.getName()).log(Level.SEVERE, null, ex);
                return ExpressionType.Unknown;
            }
        
        }
	@Override public ExpressionType visitExp(tp2Parser.ExpContext ctx) {
            if(ctx.baseexp()!= null)
                return visit(ctx.baseexp());
            ExpressionType lOp = visit(ctx.exp(0));
            ExpressionType rOp = visit(ctx.exp(1));
            if (!lOp.isNumeric()|| !rOp.isNumeric()){
                return ExpressionType.Unknown;
            }
            if (ctx.LOGICOP()!=null || ctx.COMPOP()!=null){

                return ExpressionType.Int;               
            }
            return ExpressionType.fromOrdinal(Math.max(lOp.ordinal(), rOp.ordinal()));
            
        }	
    @Override
    public ExpressionType visitProgram(tp2Parser.ProgramContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitRec_instruc(tp2Parser.Rec_instrucContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitInstruc(tp2Parser.InstrucContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitSentence(tp2Parser.SentenceContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitBlock(tp2Parser.BlockContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitAssign(tp2Parser.AssignContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitRet(tp2Parser.RetContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitFunc_def(tp2Parser.Func_defContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitFunc_def_param(tp2Parser.Func_def_paramContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitFunc_prot(tp2Parser.Func_protContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitFunc_prot_param(tp2Parser.Func_prot_paramContext ctx) {
        return ExpressionType.fromString(ctx.TYPE().toString());
    }

    @Override
    public ExpressionType visitFunc_call(tp2Parser.Func_callContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitFunc_call_param(tp2Parser.Func_call_paramContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitDeclare(tp2Parser.DeclareContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitDec_comma(tp2Parser.Dec_commaContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitCond(tp2Parser.CondContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitElcond(tp2Parser.ElcondContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitForloop(tp2Parser.ForloopContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionType visitWhileloop(tp2Parser.WhileloopContext ctx) {
        throw new UnsupportedOperationException("Not an expression."); //To change body of generated methods, choose Tools | Templates.
    }
}