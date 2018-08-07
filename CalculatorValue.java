/**
 * CalculatorValue
 */
public class CalculatorValue {
    private int rightValue;
    private int leftValue;
    private String op;

    CalculatorValue() {
        init();
    }

    void init() {
        this.rightValue = 0;
        this.leftValue = 0;
        this.op = "";
    }

    void setRightValue(int value) {
        this.rightValue = value;
    }

    void setLeftValue(int value) {
        this.leftValue = value;
    }

    void setOP(String op) {
        this.op = op;
    }

    int getResult() {
        switch (op) {
            case "+":
                return (leftValue + rightValue);
            case "-":
                return (leftValue - rightValue);
            case "*":
                return (leftValue * rightValue);
            case "/":
                return (leftValue / rightValue);
            case "%":
                return (leftValue % rightValue);
            default:
                return "0";
        }
    }
}