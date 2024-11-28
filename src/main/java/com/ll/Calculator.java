package com.ll;

import java.util.List;

public class Calculator {
    public int run(String input) {
        List<String> inputs = List.of(input.split("\s"));

        int answer = 0;

        for (int i = 0; i < inputs.size() - 2; i += 2) {
            int num1;
            int num2;
            if (i == 0) {
                num1 = Integer.parseInt(inputs.get(i));
            } else {
                num1 = answer;
            }
            num2 = Integer.parseInt(inputs.get(i + 2));

            String operator = inputs.get(i + 1);

            switch (operator) {
                case ("+"):
                    answer = add(num1, num2);
                    break;
                case ("-"):
                    answer = min(num1, num2);
                    break;
            }
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
