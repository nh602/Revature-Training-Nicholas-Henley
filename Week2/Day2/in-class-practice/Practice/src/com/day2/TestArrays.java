package com.day2;

public class TestArrays {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
//		for(int num: numbers) {
//			System.out.println(num);
//		}
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		

		for (int row = 0; row < matrix.length; row++) {
			StringBuilder sb = new StringBuilder();
			for (int col = 0; col < matrix[row].length; col++) {
				sb.append(matrix[row][col]);
			}
			System.out.println(sb.toString());
		}
		
		
		int even = 0;
		int odd = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] % 2 == 0) {
					even++;
				} else {
					odd++;
				}

				if (row == col) {
					System.out.println("Diagonal: " + matrix[row][col]);
				}
			}
		}

		System.out.println("Even: %d, Odd: %d".formatted(even, odd));
	}

}