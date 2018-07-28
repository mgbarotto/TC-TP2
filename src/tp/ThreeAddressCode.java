/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Ualo
 */
public class ThreeAddressCode {
    private Stack<Context> stack = new Stack<>(); 
    private LinkedList<String> code = new LinkedList<>();
    private LinkedList<String> funcCode = new LinkedList<>();
    private Integer contextCounter;
    ThreeAddressCode(){
        contextCounter = 0;
        stack.push(new Context(contextCounter++));
    }
    void addCode(String string, String saveResultTo, boolean function) {
        LinkedList<String> addTo = function?funcCode:code;
        if(saveResultTo != null){
            addTo.add(saveResultTo + "="+ string);
        }
        else{
            addTo.add(string);
        }                    
    }
   
    void pushBranch (String successLabel, String failLabel){
        stack.peek().pushBranch(successLabel, failLabel);
    }  
    void popBranch (){
        stack.peek().popBranch();
    }      
    void pushContext(){
        
        stack.push(new Context(contextCounter++));
    }
    String getContinueLabel(){
        return stack.peek().getContinueLabel();
    }
    String getBreakLabel(){
        return stack.peek().getBreakLabel();
    }
    void popContext(){
        stack.pop();
    }
        
    @Override
    public String toString(){
        String result="";
        for(String s:code){
            result += s+"\n";
        }
        result+="JMP END\n";
        for(String s:funcCode){
            
            result += s+"\n";
        }
        result+="LABEL END";
        return result;
    }

    Context getContext() {
        return stack.peek();
    }
}
