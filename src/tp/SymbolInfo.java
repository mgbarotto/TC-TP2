/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author mauro
 */
class SymbolInfo {
    private String name;
    private ExpressionType type; 
    private Boolean used;
    private Boolean initialized;

    public SymbolInfo (String type, String name){
        this.type = ExpressionType.fromString(type);
        this.used = false;
        this.initialized = false;
        this.name = name;
    }
    
    public SymbolInfo (ExpressionType type, String name){
        this.type = type;
        this.used = false;
        this.initialized = false;
        this.name = name;
    }
    
    public void initialize(){
        initialized = true;
    }
    
    public void use(){
        if(!initialized){
            System.out.println("[WARNING] Usando simbolo "+name+" antes de inicializarlo.");
        }
        this.used = true;
    }
    
    public String getName(){
        return name;
    }
    
    public Boolean isInitialized(){
        return initialized;
    }

    public Boolean isUsed(){
        return used;
    }
    
    @Override
    public String toString(){
        return "["+type+";"+(used?"usado":"no usado")+";"+(initialized?"inic.":"no inic.")+"]";
    }

    ExpressionType getType() {
        return type;
    }
}
