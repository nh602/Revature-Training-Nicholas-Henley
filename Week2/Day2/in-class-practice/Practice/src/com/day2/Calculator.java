package com.day2;

public class Calculator {
	public static int addition() {
		return 1+2;
	}
	
	// Overloaded method with parameters
	public static int addition(int a, int b) {
		return a + b;
	}
	
	// Method without parameters
	public static int multiplication() {
		return 2*3;
	}
	
	// Overloaded method with parameters
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	public static int division() {
		return 10/2;
	}
	
	public static int division(int a, int b) {
		// print message if divide by zero
		if (b == 0) {
			System.out.println("Cannot divide by zero");
			return 0;
		}
		return a / b;
	}
	
	public static void main (String[] args) {
		System.out.println("Addition without parameters: " + addition());
		System.out.println("Addition with parameters: " + addition(5, 10));
		
		System.out.println("Multiplication without parameters: " + multiplication());
		System.out.println("Multiplication with parameters: " + multiplication(5, 10));
		
		System.out.println("Division without parameters: " + division());
		System.out.println("Division with parameters: " + division(10, 0));
	}
}
