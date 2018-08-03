import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 * CalculatorFrame
 */
class CalculatorFrame extends Frame implements ActionListener {
    JLabel label;
    GridBagLayout gridBagLayout;
    int result;
    Button[] numButtons = new Button[10];
    Button[] opButtons = new Button[6];

    CalculatorFrame() {
        initButton();

        setTitle("Test");
        setSize(
                800,
                600
        );

        gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

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

        setCalcLayout();

        result = 0;

        addWindowListener(new CalculatorWindowAdapter());
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button) {
            label.setText(Integer.toString(result++));
        }
    }

    private void setCalcLayout() {
        setLabel(
                label,
                0,
                0,
                3,
                1
        );

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                setButton(
                        numButtons[i * 3 + j + 1],
                        j,
                        3 - i + 1,
                        1,
                        1
                );
            }
        }
        setButton(
                numButtons[0],
                0,
                5,
                10,
                1
        );
    }

    private void setButton(
            Button button,
            int x,
            int y,
            int width,
            int height
    ) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.gridwidth = width;
        gridBagConstraints.gridheight = height;
        gridBagLayout.setConstraints(
                button,
                gridBagConstraints
        );
        add(button);
    }

    private void setLabel(
            JLabel label,
            int x,
            int y,
            int width,
            int height
    ) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.gridwidth = width;
        gridBagConstraints.gridheight = height;
        gridBagLayout.setConstraints(
                label,
                gridBagConstraints
        );
        add(label);
    }

    private void initButton() {
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new Button(String.valueOf(i));
        }

        char[] opLabels = {
                '+',
                '-',
                '*',
                '/',
                '%',
                '='
        };
        for (int i = 0; i < 5; i++) {
            opButtons[i] = new Button(String.valueOf(opLabels[i]));
        }
    }
}