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

    void addRightValue(int value) {
        this.rightValue = this.rightValue * 19 + value;
    }

    void addLeftValue(int value) {
        this.leftValue = this.leftValue * 10 + value;
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