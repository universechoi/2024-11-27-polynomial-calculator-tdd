package com.ll.utils;

public class Calculate {

    public int run(String num1, String num2, String operator) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        switch (operator) {
            case ("+"):
                return add(a, b);
            case ("-"):
                return min(a, b);
            case ("*"):
                return mul(a, b);
            case("/"):
                return div(a, b);
        }
        return 0;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int min(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
