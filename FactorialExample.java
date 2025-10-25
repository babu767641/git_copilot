package com.ex;

public class FactorialExample {

    // Method to calculate factorial using recursion
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}