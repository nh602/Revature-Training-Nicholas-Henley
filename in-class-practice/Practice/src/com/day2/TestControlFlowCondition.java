package com.day2;

public class TestControlFlowCondition {

	public static void main(String[] args) {
		int marks = 93;
		int day = 3;
		int age = 19;
		
		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 80) {
			System.out.println("Grade B");
		} else if (marks >= 70) {
			System.out.println("Grade C");
		} else if (marks >= 60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}
		
		
		
		if (age >= 18) {
			System.out.println("eligible for voting");
		} else 
			System.out.println("Ineligible for voting");
		
		
		if(age >= 18) {
			if (marks >= 75) {
				System.out.println("Adult and scored good marks");
			}
			else {
				System.out.println("Adult and failed");
			}
		}
		
		String dayName = null;
		switch(day) {
		case 1: 
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		default:
			dayName = "Sunday";	
			
		}
		
		System.out.println(dayName);

	}

}
