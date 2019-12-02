package Tools;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class JNumberTextPane extends JTextPane {
    @Override
    public void processKeyEvent(KeyEvent ev) {
        if (Character.isDigit(ev.getKeyChar()) || ev.getKeyChar() == 8) {
            super.processKeyEvent(ev);
        }
        ev.consume();
        return;
    }
}
