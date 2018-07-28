// Generated from /home/mauro/Software/TC/TP1/src/tp1/tp1.g4 by ANTLR 4.5.3
package tp;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link tp2Listener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class tp2CListener implements tp2Listener {
    private final Parser parser;
    private final SymTable symTable;
    public tp2CListener(Parser parser) {
           this.parser = parser;  
           this.symTable = SymTable.getInstance();
           symTable.SetParser(parser);
    }
    
    
        
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(tp2Parser.ProgramContext ctx) {
            //Entrar al contexto global
            symTable.enterContext();
            symTable.insertSymbol("main", new FunctionSymbolInfo(ExpressionType.Int, "main"));
            symTable.lookupSymbol("main").use();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(tp2Parser.ProgramContext ctx) {
            //Salir del contexto global
            symTable.exitContext();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRec_instruc(tp2Parser.Rec_instrucContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRec_instruc(tp2Parser.Rec_instrucContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstruc(tp2Parser.InstrucContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstruc(tp2Parser.InstrucContext ctx) {

            if(ctx.sentence()!= null && ctx.SCOLON()==null){
                parser.notifyErrorListeners("Se esperaba punto y coma al final de la sentencia \""+ctx.getText()+"\"");
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSentence(tp2Parser.SentenceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSentence(tp2Parser.SentenceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(tp2Parser.BlockContext ctx) {
            symTable.enterContext();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(tp2Parser.BlockContext ctx) { 
            symTable.exitContext();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssign(tp2Parser.AssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign(tp2Parser.AssignContext ctx) { 
            if(ctx.ASSIGN() != null){
                symTable.initializeSymbol(ctx.ID().toString());
            }
            else{
               symTable.useSymbol(ctx.ID().toString());
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRet(tp2Parser.RetContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRet(tp2Parser.RetContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_def(tp2Parser.Func_defContext ctx) { 
            symTable.enterContext();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_def(tp2Parser.Func_defContext ctx) {
            tp2ExpressionVisitor visitor = new tp2ExpressionVisitor();
            ExpressionType expected_type = symTable.lookupSymbol(ctx.ID().toString()).getType();
            ExpressionType return_type;
            if(ctx.ret()!=null && ctx.ret().exp() != null){
                return_type = visitor.visit(ctx.ret().exp());
            }
            else{
                return_type = ExpressionType.Void;
            }
            if(ExpressionType.verify(return_type, expected_type)==0){
                parser.notifyErrorListeners("Se está retornando un valor de tipo "+return_type.toString()+" y se espera "+expected_type.toString());
            }
            symTable.exitContext();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_def_param(tp2Parser.Func_def_paramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_def_param(tp2Parser.Func_def_paramContext ctx) { 
            String symbol = ctx.ID().toString();
            String type = ctx.TYPE().toString();
            symTable.insertSymbol(symbol, new SymbolInfo(type, symbol));
            symTable.initializeSymbol(symbol);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_prot(tp2Parser.Func_protContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_prot(tp2Parser.Func_protContext ctx) {
            tp2ParamVisitor visitor = new tp2ParamVisitor();
            ExpressionType ret_type = ExpressionType.fromString(ctx.TYPE() == null? "void":ctx.TYPE().toString());
            String func_name = ctx.ID().toString();
            FunctionSymbolInfo symInfo = (FunctionSymbolInfo) symTable.insertSymbol(func_name, new FunctionSymbolInfo(ret_type, func_name));
            
            if(ctx.func_prot_param() != null){
                ArrayList<ExpressionType> types = visitor.visit(ctx.func_prot_param());
                for(ExpressionType type: types){
                    symInfo.insertParam(type);
                }            
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_prot_param(tp2Parser.Func_prot_paramContext ctx) { 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_prot_param(tp2Parser.Func_prot_paramContext ctx) { 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_call(tp2Parser.Func_callContext ctx) { 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_call(tp2Parser.Func_callContext ctx) {
            try{
                FunctionSymbolInfo funInfo = (FunctionSymbolInfo)symTable.lookupSymbol(ctx.ID().toString());
                if(funInfo==null){
                    parser.notifyErrorListeners("Intentando llamar a la función "+ctx.ID().toString()+", que no fue declarada");
                    return;
                }         
                funInfo.use();
                List<ExpressionType> params = new ArrayList<>();
                tp2ExpressionVisitor visitor = new tp2ExpressionVisitor();
                for(tp2Parser.Func_call_paramContext p:ctx.func_call_param()){
                    params.add(visitor.visit(p.exp()));
                }
                if(params.size() != funInfo.getParamCount()){
                    parser.notifyErrorListeners("Llamando a la función "+ctx.ID().toString()+" con una cantidad incorrecta de argumentos (recibe "+params.size()+", espera "+funInfo.getParamCount()+")");
                }
                for(Integer i = 0; i< params.size(); i++){
                    switch(funInfo.verifyParam(i, params.get(i))){
                        case 0: 
                            parser.notifyErrorListeners("El parametro "+(i+1)+" de la llamada a la función "+ctx.ID().toString()+" es de un tipo incompatible (recibe "+params.get(i).toString()+", espera "+funInfo.getParamTypes().get(i).toString()+")");
                            break;
                        case 1: 
                            System.out.println("[WARNING] El parametro "+(i+1)+" de la llamada a la función "+ctx.ID().toString()+" se está convirtiendo implicitamente(recibe "+params.get(i).toString()+", espera "+funInfo.getParamTypes().get(i).toString()+")");
                            break;                        
                    }
                }
            }
            catch(ClassCastException ex){
                parser.notifyErrorListeners("Intentando llamar a la variable "+ctx.ID().toString()+", como funcion");
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclare(tp2Parser.DeclareContext ctx) {
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclare(tp2Parser.DeclareContext ctx){ 
            String symbol = ctx.ID().toString();
            String type = ctx.TYPE().toString();
            symTable.insertSymbol(symbol,
                        new SymbolInfo(type, symbol));
            if(ctx.exp() != null){
                symTable.initializeSymbol(symbol);
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDec_comma(tp2Parser.Dec_commaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDec_comma(tp2Parser.Dec_commaContext ctx) { 
            tp2Parser.DeclareContext parent = (tp2Parser.DeclareContext)ctx.getParent();
            String symbol = ctx.ID().toString();
            String type =parent.TYPE().toString();
            symTable.insertSymbol(symbol,new SymbolInfo(type, symbol));
            if(ctx.exp() != null){
                symTable.initializeSymbol(symbol);
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCond(tp2Parser.CondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCond(tp2Parser.CondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForloop(tp2Parser.ForloopContext ctx) { 
            symTable.enterContext();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForloop(tp2Parser.ForloopContext ctx) {
           symTable.exitContext();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileloop(tp2Parser.WhileloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileloop(tp2Parser.WhileloopContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { 
        }

        @Override
        public void enterBaseexp(tp2Parser.BaseexpContext ctx) {
        }
        @Override
        public void exitBaseexp(tp2Parser.BaseexpContext ctx) {
            if(ctx.ID() != null){
                symTable.useSymbol(ctx.ID().toString());
            }
        }

        @Override
        public void enterExp(tp2Parser.ExpContext ctx) {
        }

        @Override
        public void exitExp(tp2Parser.ExpContext ctx) {
            
        }

        @Override
        public void enterFunc_call_param(tp2Parser.Func_call_paramContext ctx) {
        }

        @Override
        public void exitFunc_call_param(tp2Parser.Func_call_paramContext ctx) {
        }

        @Override
        public void enterElcond(tp2Parser.ElcondContext ctx) {
        }

        @Override
        public void exitElcond(tp2Parser.ElcondContext ctx) {
        }

}