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
public enum ExpressionType implements Comparable<ExpressionType> {
    Char,
    Int,
    Float,
    Double,
    String,
    Void,
    Unknown;
    public static ExpressionType fromString(String type){
        switch (type.toLowerCase()){
                case "int":
                    return Int;
                case "float":
                    return Float;
                case "double":
                    return Double;
                case "void":
                    return Void;
                case "char":
                    return Char;
                default:
                    return Unknown;
                
        }
        
    }  
    public Boolean isNumeric(){
        return this.ordinal()< String.ordinal();
    }
    public static ExpressionType fromOrdinal(Integer ord){
        switch(ord){
            case 0:  return Char;
            case 1:  return Int;
            case 2:  return Float;
            case 3:  return Double;
            case 4:  return String;
            default: return Void;
            
        }   
    }

    public static Integer verify(ExpressionType from, ExpressionType to) {
        if(from == to) return 2;
        if(from.compareTo(to) < 0&& from.isNumeric() && to.isNumeric()) return 1;
        else return 0;
    }
    
}
