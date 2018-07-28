/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.LinkedList;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author mauro
 */
public abstract class EvaluableParserRuleContext extends ParserRuleContext {
    
    public EvaluableParserRuleContext(ParserRuleContext parent, int invokingStateNumber){
        super (parent, invokingStateNumber);
    }
    public String eval(ThreeAddressCode code){
        return eval(code, false);
    }
    
    public String eval(ThreeAddressCode code, boolean function){
        String result=null;
        for(EvaluableParserRuleContext i : this.getRuleContexts(EvaluableParserRuleContext.class)){
            result = i.eval(code, function);
        }
        return result;
    }
    
}
