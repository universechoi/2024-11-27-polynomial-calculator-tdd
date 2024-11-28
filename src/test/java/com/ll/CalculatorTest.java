package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    @DisplayName("addTest")
    public void addTest() {
        Calculator calculator = new Calculator();

        int answer = calculator.run("3 + 5");

        assertThat(answer).isEqualTo(8);
    }

    @Test
    @DisplayName("addTest")
    public void addTest2() {
        Calculator calculator = new Calculator();

        int answer = calculator.run("1 + 2");

        assertThat(answer).isEqualTo(3);
    }

    @Test
    @DisplayName("minusTest")
    public void minusTest() {
        Calculator calculator = new Calculator();

        int answer = calculator.run("5 - 3");

        assertThat(answer).isEqualTo(2);
    }

    @Test
    @DisplayName("ternaryTest")
    public void ternaryTest() {
        Calculator calculator = new Calculator();

        int answer = calculator.run("5 - 3 + 2");

        assertThat(answer).isEqualTo(4);
    }
}
