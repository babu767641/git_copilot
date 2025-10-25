package com.ex;
/**
 * A simple program to calculate the factorial of a number using recursion.
 */
public class FactorialExampleWithDoc {

    /**
     * Calculates the factorial of a given number.
     *
     * @param n the number to calculate the factorial for
     * @return the factorial of the number as a long
     */
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Main method to execute the factorial calculation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}