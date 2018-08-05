/**
 * CalculatorValue
 */
public class CalculatorValue {
    private int rightValue = 0;
    private int leftValue = 0;
    private String op = "";

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