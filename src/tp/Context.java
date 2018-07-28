/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp;

import java.util.Stack;

/**
 *
 * @author Ualo
 */
class Context {
    private Stack<String> continueLabels = new Stack<>();
    private Stack<String> breakLabels = new Stack<>();
    private Integer contextId;
    private Integer varCounter;
    Context(Integer integer) {
        contextId = integer;
        varCounter = 0;
    }

    String getContinueLabel() {
        return this.continueLabels.peek();
    }
    
    String getBreakLabel() {
        return this.breakLabels.peek();
    }
    
    void pushBranch(String continueLabel, String brakLabel) {
        continueLabels.push(continueLabel);
        breakLabels.push(brakLabel);
    }

    void popBranch() {
        continueLabels.pop();
        breakLabels.pop();
    }
    
    public String getNextVarName(){
        return contextId+"_v"+String.valueOf(++varCounter);
    }
    public String getNextVarName(String prefix){
        return contextId+"_"+prefix+String.valueOf(++varCounter);
    }
    
}
