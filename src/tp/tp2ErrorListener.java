package tp;

import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author mauro
 */
public class tp2ErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                        Object offendingSymbol,
                        int line, int charPositionInLine,
                        String msg,
                        RecognitionException e)
    {
        System.err.println("["+line+":"+charPositionInLine+"] "+ msg);
        ((Parser)recognizer).setState(1);
    }
    
    
}
