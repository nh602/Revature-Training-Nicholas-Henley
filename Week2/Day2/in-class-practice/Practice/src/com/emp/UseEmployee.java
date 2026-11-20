package com.emp;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Alice", 30000D);
		System.out.println("Employee ID: " + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Salary: " + emp.salary);
		
		System.out.println();
		
		Employee emp2 = new Employee(2, "Bob", 20000D);
		System.out.println("Employee ID: " + emp2.id);
		System.out.println("Employee Name: " + emp2.name);
		System.out.println("Employee Salary: " + emp2.salary);

	}

}
