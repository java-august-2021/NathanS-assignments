public class Calculator {
    //attribute
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;
    //constructor
    public void performOperation() {
        if (this.operation == "+") {
            result = (operandOne) + (operandTwo);
        }
        if (this.operation == "-") {
            result = (operandOne) - (operandTwo);
        }
    }
    //getters and setters 
    public void setOperandOne(double number) {
        this.operandOne = number;
    }
    public void setOperandTwo(double number) {
        this.operandTwo = number; 
    }
    public void setOperation(String operator) {
        this.operation = operator;
    }
    public double getResults() {
        return result;
    }
}