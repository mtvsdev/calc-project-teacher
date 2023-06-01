package com.ohgiraffers;

import org.junit.jupiter.api.*;

public class PlusCalculatorTests {

    private PlusCalculator plusCalc;

    /*@BeforeAll
    public static void setUp() {
        System.out.println("setUp 동작 확인...");
        new PlusCalculatorTests().plusCalc = new PlusCalculator();
    }*/

    @BeforeEach
    public void setUp() {
        System.out.println("setUp 동작 확인...");
        this.plusCalc = new PlusCalculator();
    }

    // 검증 내용
    // 1. 더하기 기능을 잘 수행하는지 확인 (10, 20) => 30
    @DisplayName("10과 20을 넣었을 때 30이라는 결과가 계산되는지 확인")
    @Test
    public void testSumTwoNumbers() {

        // given
        int num1 = 10;
        int num2 = 20;

        // when
        int result = plusCalc.sumTwoNumbers(num1, num2);

        // then (verify)
        Assertions.assertEquals(30, result);
    }

    @DisplayName("20과 30을 넣었을때 50이라는 결과가 계산되는지 확인")
    @Test
    public void testSumTwoNumbers2() {

        // given
        int num1 = 20;
        int num2 = 30;

        // when
        int result = plusCalc.sumTwoNumbers(num1, num2);

        // then
        Assertions.assertEquals(50, result);
    }
}
