/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauro
 */
public class FunctionSymbolInfo extends SymbolInfo {
    
    private List<ExpressionType> paramTypes;

    public FunctionSymbolInfo(ExpressionType retType, String name) {
        super(retType, name);
        //En esta etapa, asumo que toda funcion está definida
        //El linker lo verificara
        this.initialize(); 
        paramTypes =  new ArrayList<>();
    }
    
    public void insertParam(ExpressionType type){
        getParamTypes().add(type);
    }
    
    @Override
    public String toString(){
        return super.toString()+"{"+getParamTypes().toString()+"}";
    }
    
   
    public Integer verifyParam(Integer pos, ExpressionType paramType){
        try{
            ExpressionType posType = paramTypes.get(pos);
            return ExpressionType.verify(paramType, posType);
        }
        catch(NullPointerException ex){
            return -1;
        }
    }

    public List<ExpressionType> getParamTypes() {
        return paramTypes;
    }
    public Integer getParamCount() {
        return paramTypes.size();
    }
}
