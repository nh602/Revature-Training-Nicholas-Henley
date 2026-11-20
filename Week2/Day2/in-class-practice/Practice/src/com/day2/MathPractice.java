package com.day2;

import java.lang.Math;

public class MathPractice {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		
		System.out.println("a + b = %d".formatted(a + b));
		System.out.println("a - b = %d".formatted(a - b));
		System.out.println("a * b = %d".formatted(a * b));
		System.out.println("a / b = %d".formatted(a / b));
		
		int i = 5;
		int x = i++;
		int y = ++i;
		
		System.out.println("x = %d (assign then increment)\ny = %d (increment then assign)".formatted(x, y));
		
		
		// store answers in an array 7 
		double answers[] = new double[7];
		
		answers[0] = Math.pow(2, 3); // 2^3 = 8
		answers[1] = Math.sqrt(16); // 4
		answers[2] = Math.abs(-10); // 10
		answers[3] = Math.max(10, 20); // 20
		answers[4] = Math.round(3.6); // 4
		answers[5] = Math.floor(3.6); // 3
		answers[6] = (int)(Math.random() * 6) + 1; // random number between 1 and 6
		
		for (double answer : answers) {
			System.out.println(answer);
		}
	}

}
