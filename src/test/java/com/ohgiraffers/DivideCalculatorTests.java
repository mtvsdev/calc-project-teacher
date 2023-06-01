package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivideCalculatorTests {

    private DivideCalculator divideCalc;

    @BeforeEach
    public void setUp() {
        this.divideCalc = new DivideCalculator();
    }

    // 검증내용
    // 1. 10과 2를 나누면 5가 나오는지 확인
    // 2. 20과 3을 나누면 6이 나오는지 확인
    // 3. 나눌 수를 0으로 하면 IlligalargumentException이 발생하는지 확인

    @DisplayName("나눌 수가 0이면 예외 발생하는지 확인")
    @Test
    public void testZeroArgument() {

        // given
        int num1 = 10;
        int num2 = 0;

        // when & then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> divideCalc.divideTwoNumbers(num1, num2)
        );
    }
}
