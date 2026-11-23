package com.banking.utility;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Get input with length validation
    public static String getInput(String prompt, int minLength, int maxLength) {
        while (true) {
            String input = getInput(prompt);
            if (input.length() >= minLength && input.length() <= maxLength) {
                return input;
            } else {
                System.out.println("Input must be between " + minLength + " and " + maxLength + " characters long.");
            }
        }
    }

    public static int getIntInput(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(getInput(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static double getDoubleInput(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(getInput(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
