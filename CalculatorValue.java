/**
 * CalculatorValue
 */
public class CalculatorValue {
    private long rightValue;
    private long leftValue;
    private String op;
    private Boolean isPlus;

    CalculatorValue() {
        init();
    }

    void init() {
        this.rightValue = 0;
        this.leftValue = 0;
        this.op = "";
        isPlus = true;
    }

    void changeValueSign(Boolean isRight) {
        if (isRight) {
            this.rightValue *= -1;
        } else {
            this.leftValue *= -1;
        }
        isPlus = !isPlus;
    }

    void addRightValue(int value) {
        if (value == -1) {
            this.rightValue *= 100;
        } else {
            if (isPlus) {
                this.rightValue = this.rightValue * 10 + value;
            } else {
                this.rightValue = this.rightValue * 10 - value;
            }
        }
    }

    void addLeftValue(int value) {
        if (value == -1) {
            this.leftValue *= 100;
        } else {
            if (isPlus) {
                this.leftValue = this.leftValue * 10 + value;
            } else {
                this.leftValue = this.leftValue * 10 - value;
            }
        }
    }

    long getRightValue() {
        return rightValue;
    }

    long getLeftValue() {
        return leftValue;
    }

    void setOP(String op) {
        this.op = op;
    }

    long getResult() {
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
                return 0;
        }
    }
}