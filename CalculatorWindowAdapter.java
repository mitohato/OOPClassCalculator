import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * CalculatorWindowAdapter
 */
class CalculatorWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}