    import java.awt.Toolkit;

    import javax.swing.text.AttributeSet;
    import javax.swing.text.BadLocationException;
    import javax.swing.text.PlainDocument;

    public class JTextFieldLimit extends PlainDocument {
        private static final long serialVersionUID =1L;
        private int maxChar= 0;

        public JTextFieldLimit(int maxChar) {
            super();
            this.maxChar = maxChar;
        }
           
        public void insertString(int offset, String str,
                AttributeSet attributeSet) throws BadLocationException {
            if ((getLength() + str.length()) > maxChar){
                Toolkit.getDefaultToolkit().beep();//joue un petit son pour indiquer qu'il y a un blocage
                return;
            }
            super.insertString(offset, str.toUpperCase(), attributeSet);
        }
    }
