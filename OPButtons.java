import java.awt.*;

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

  OPButtons() {
    plusButton = new Button("+");
    subButton = new Button("-");
    timeButton = new Button("*");
    devideButton = new Button("/");
    equalButton = new Button("=");
    modButton = new Button("%");
    changeSignButton = new Button("±");
    acButton = new Button("AC");
    dotButton = new Button(".");
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