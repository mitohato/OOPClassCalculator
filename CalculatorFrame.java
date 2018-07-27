import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 * CalculatorFrame
 */
class CalculatorFrame extends Frame implements ActionListener {
  Button button;
  JLabel label;
  GridBagLayout gridBagLayout;
  int result;

  CalculatorFrame() {
    setTitle("Test");
    setSize(800, 600);

    gridBagLayout = new GridBagLayout();
    setLayout(gridBagLayout);

    label = new JLabel("poyo");
    label.setPreferredSize(new Dimension(100, 100));

    LineBorder lineBorder = new LineBorder(
        Color.gray,
        1,
        false
    );

    label.setBorder(lineBorder);
    add(label);

    button = new Button("");
    button.addActionListener(this);
    add(button);

    result = 0;

    addWindowListener(new CalculatorWindowAdapter());
  }

  public void actionPerformed(ActionEvent actionEvent) {
    if (actionEvent.getSource() == button) {
      label.setText(Integer.toString(result++));
    }
  }
}