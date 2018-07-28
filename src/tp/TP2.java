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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import tp.tp2Parser.ProgramContext;

public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        try {
            FileInputStream stream=new FileInputStream("CodigoFuenteEjemplo.c");
            ANTLRInputStream antlrStream=new ANTLRInputStream(stream);
            tp2Lexer lexer=new tp2Lexer(antlrStream);
            CommonTokenStream tokens=new CommonTokenStream(lexer);
            tp2Parser parser=new tp2Parser(tokens);
            tp2CListener listener = new tp2CListener(parser);
            parser.addParseListener(listener);
            parser.removeErrorListeners();
            parser.addErrorListener(new tp2ErrorListener());
            ParseTree tree =parser.program();
            System.out.println("Arbol:"+tree.toStringTree(parser)+"\n\n");
            ThreeAddressCode code = new ThreeAddressCode();
            ((ProgramContext)tree).eval(code);
            System.out.println(code.toString());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TP2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TP2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
