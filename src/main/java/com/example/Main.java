package com.example;

public class Main {

    // Function to check if a number is even
    public static boolean isEven(int number) {
        // Complete the return statement
        return (number ___ 2 == 0);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        // If statement
        if (num1 ___ num2) {
            System.out.println("num1 is greater than num2");
        }

        // If-else statement
        if (num1 ___ 2 == 0) {
            System.out.println("num1 is even");
        } else {
            System.out.println("num1 is odd");
        }

        // If-else-if statement
        if (num1 __ num2) {
            System.out.println("num1 is greater than num2");
        } else if (num1 < num2) {
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is equal to num2");
        }

        // Logical operator
        if (num1 > 0 ___ num2 > 0) {
            System.out.println("Both num1 and num2 are positive numbers");
        }

        // Using the function
        if (isEven(num1)) {
            System.out.println("num1 is even");
        } else {
            System.out.println("num1 is odd");
        }
    }
}
