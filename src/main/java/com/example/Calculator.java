package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator._____(5, 3);
        System.out.println("Sum: " + result);
    }
}
