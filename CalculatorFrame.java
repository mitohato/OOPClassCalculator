import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 * CalculatorFrame
 */
class CalculatorFrame extends Frame implements ActionListener {
    Panel fooderButtonPanel;
    Panel mainButtonPanel;
    JLabel label;
    GridBagLayout gridBagLayout;
    int result;
    Button[] numButtons = new Button[10];
    OPButtons opButtons = new OPButtons();

    CalculatorFrame() {
        initButton();
        initLabel();
        initPanel();

        setupMain();
        setupFooder();

        setTitle("Test");
        setSize(
                800,
                600
        );

        setLayout(new GridLayout(
                4,
                1
        ));

        setCalcLayout();

        result = 0;

        // addWindowListener(new CalculatorWindowAdapter());
    }

    public void actionPerformed(ActionEvent actionEvent) {
        //     if (actionEvent.getSource() == button) {
        //         label.setText(Integer.toString(result++));
        //     }
    }

    private void setCalcLayout() {
        add(label);
        add(mainButtonPanel);
        add(fooderButtonPanel);
    }

        ));

    }

    private void setupMain() {

    }

    private void setupFooder() {

    }

    private void initButton() {
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new Button(String.valueOf(i));
        }

    }

    private void initLabel() {
        label = new JLabel("poyo");
        label.setPreferredSize(new Dimension(
                220,
                50
        ));

        LineBorder lineBorder = new LineBorder(
                Color.gray,
                1,
                false
        );

        label.setBorder(lineBorder);
    }

    private void initPanel() {
        fooderButtonPanel = new Panel();
        mainButtonPanel = new Panel();
    }
}