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
}
