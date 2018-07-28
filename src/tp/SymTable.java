/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import org.antlr.v4.runtime.Parser;

/**
 *
 * @author mauro
 */
public class SymTable {
    private static SymTable instance;
    
    
    
    private final LinkedList<HashMap<String, SymbolInfo>> table;
    private Parser parser;
    
    
    private SymTable(){
        table = new LinkedList<>();
    }
    
    private HashMap<String, SymbolInfo> currentCtx(){
        return table.getLast();
    }
    
    public void SetParser(Parser p){
        this.parser = p;
    }
    
    public static SymTable getInstance(){
        if (instance == null){
            instance=new SymTable();
        }
        return instance;
    }
   

    void enterContext() {
        table.add(new HashMap<String, SymbolInfo>());
    }
    
    void exitContext(){
        System.out.println(currentCtx().toString());
        for(SymbolInfo s: currentCtx().values()){
            if(!s.isUsed()){
                parser.notifyErrorListeners("[WARNING] El simbolo "+s.getName()+" no fue usado.");    
            }
            
        }
        
        table.remove(currentCtx());
    }
    

    
    SymbolInfo insertSymbol(String symbol, SymbolInfo info){
        if (currentCtx().containsKey(symbol)){
            parser.notifyErrorListeners("Intentando declarar el simbolo "+symbol+", que ya existe en el contexto actual.");
            return null;
        }
        else{
            currentCtx().put(symbol, info);
            return info;
        }
    }
    
    void initializeSymbol(String symbol){
        lookupSymbol(symbol).initialize();
    }
    void useSymbol(String symbol){
        lookupSymbol(symbol).use();
    }
    
    SymbolInfo lookupSymbol(String symbol) {
        ListIterator li = table.listIterator(table.size());
        HashMap <String, SymbolInfo> context;
        while(li.hasPrevious()) {
             context =  (HashMap<String,SymbolInfo>) li.previous();
             if(context.containsKey(symbol)){
                   return context.get(symbol);
             }
        }
        parser.notifyErrorListeners("Intentando acceder al simbolo "+symbol+", que no está declarado.");
        return new SymbolInfo(ExpressionType.Unknown, "Invalid Symbol");
    }
    
    @Override
    public String toString(){
        return this.table.toString();
    }
}

        