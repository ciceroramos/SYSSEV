package util;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author cicero.ramos
 */
public class MaiusculoSev extends PlainDocument {

    @Override

    public void insertString (int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
        super.insertString(offset, str.toUpperCase(), attr);
    }
    
    public void replace (int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
        super.insertString(offset, str.toUpperCase(), attr);
    }
    

}
