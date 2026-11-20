package com.day2;

public class TestLooping {

	public static void main(String[] args) {
		int i;
		for(i = 0; i <= 5; i ++) {
			System.out.println("%d".formatted(i));
		}
		
		System.out.println(i);
		
		int j = 5;
		while(j >= 1) {
			System.out.println(j);
			j--;
		}
		
		int k = -5;
		
		do {
			System.out.println("k - %d".formatted(k));
			k--;
		} while (k >= 0);

	}

}
