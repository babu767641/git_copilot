package com.ex;

public class ReverseNameExample {

    // Method to reverse a string
    public static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public static void main(String[] args) {
        String name = "Babu";
        String reversed = reverseName(name);
        System.out.println("Reversed name: " + reversed);
    }
}