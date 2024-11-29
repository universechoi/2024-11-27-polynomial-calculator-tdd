package com.ll.utils;

public class CheckInputs {

    public boolean number(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public boolean addOrMin(String input) {
        return (input.equals("+") || input.equals("-"));
    }

    public boolean mulOrDiv(String input) {
        return (input.equals("*") || input.equals("/"));
    }
}
