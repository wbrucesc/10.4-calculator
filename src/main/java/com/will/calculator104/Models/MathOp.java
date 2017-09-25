package com.will.calculator104.Models;

public class MathOp {
    private String firstNum;
    private String operator;
    private String secondNum;

    public MathOp(String firstNum, String operator, String secondNum) {
        this.firstNum = firstNum;
        this.operator = operator;
        this.secondNum = secondNum;
    }

    public String getFirstNum() {
        return firstNum;
    }

    public String getOperator() {
        return operator;
    }

    public String getSecondNum() {
        return secondNum;
    }

    public Double calculate(String firstNum, String operator, String secondNum) {
        double number1 = Double.parseDouble(firstNum);
        double number2 = Double.parseDouble(secondNum);
        double answer = 0;


        if (operator.equals("+")) {
            answer = number1 + number2;
        } else if (operator.equals("-")) {
            answer = number1 - number2;
        } else if (operator.equals("/")){
            answer = number1 / number2;
        } else if (operator.equals("*")) {
            answer = number1 * number2;
        } else {
            return null;
        }
        return answer;
    }

}
