package org.example.calculate;

public class SubtractionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculator(int operand1, int operand2) {
        return operand1 - operand2;
    }
}
