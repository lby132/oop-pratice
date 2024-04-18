package org.example.calculate;

public interface NewArithmeticOperator {

    boolean supports(String operator); // 이 오퍼레이터를 지원하는지 여부 메소드

    int calculator(int operand1, int operand2);
}
