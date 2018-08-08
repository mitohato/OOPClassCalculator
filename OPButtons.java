import java.awt.*;
import java.awt.event.ActionListener;

/**
 * OPButtons
 */
public class OPButtons {
    private Button plusButton;
    private Button subButton;
    private Button timeButton;
    private Button devideButton;
    private Button equalButton;
    private Button modButton;
    private Button changeSignButton;
    private Button acButton;
    private Button dotButton;

    OPButtons(ActionListener actionListener) {
        plusButton = new Button("+");
        plusButton.addActionListener(actionListener);
        subButton = new Button("-");
        subButton.addActionListener(actionListener);
        timeButton = new Button("*");
        timeButton.addActionListener(actionListener);
        devideButton = new Button("/");
        devideButton.addActionListener(actionListener);
        equalButton = new Button("=");
        equalButton.addActionListener(actionListener);
        modButton = new Button("%");
        modButton.addActionListener(actionListener);
        changeSignButton = new Button("±");
        changeSignButton.addActionListener(actionListener);
        acButton = new Button("AC");
        acButton.addActionListener(actionListener);
        dotButton = new Button(".");
        dotButton.addActionListener(actionListener);
    }

    Button getPlusButton() {
        return plusButton;
    }

    Button getSubButton() {
        return subButton;
    }

    Button getTimeButton() {
        return timeButton;
    }

    Button getDevideButton() {
        return devideButton;
    }

    Button getEqualButton() {
        return equalButton;
    }

    Button getModButton() {
        return modButton;
    }

    Button getChangeSignButton() {
        return changeSignButton;
    }

    Button getACButton() {
        return acButton;
    }

    Button getDotButton() {
        return dotButton;
    }
}
