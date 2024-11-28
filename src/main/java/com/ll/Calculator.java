package com.ll;

import java.util.List;

public class Calculator {
    public int run(String input) {
        List<String> inputs = List.of(input.split("\s"));

        int answer = 0;

        int num1 = Integer.parseInt(inputs.get(0));
        int num2 = Integer.parseInt(inputs.get(2));

        String operator = inputs.get(1);

        switch (operator) {
            case ("+"):
                answer = add(num1, num2);
                break;
            case ("-"):
                answer = min(num1, num2);
                break;
        }
        return answer;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int min(int a, int b) {
        return a - b;
    }
}
