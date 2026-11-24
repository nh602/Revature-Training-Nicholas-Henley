package com.myexception;

public class AgeValidation {
    public static void main(String[] args) {
        checkAge(15);
    }

    public static void checkAge(int age) {
        if (age < 16) {
            throw new ArithmeticException("Access denied - You must be at least 16 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
