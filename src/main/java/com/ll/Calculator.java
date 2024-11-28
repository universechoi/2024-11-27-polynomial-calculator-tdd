package com.ll;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int run(String input) {
        List<String> inputs = List.of(input.split("\s"));

        int num1 = Integer.parseInt(inputs.get(0));
        int num2 = Integer.parseInt(inputs.get(2));

        return num1 + num2;
    }
}
