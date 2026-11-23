package com.emp.inherit;

import java.util.Scanner;

public class UseEmployee {

	public static void main(String[] args) {
		PermanentEmployee pe1 = new PermanentEmployee(1, "Johnny Boy", 100000d, 10000d);
		pe1.display();
		
		TemporaryEmployee te1 = new TemporaryEmployee(2, "Sally Sue", 50000d, 20, 1000d);
		te1.display();
		
		Employee e1 = new TemporaryEmployee(3, "Bobby Blue", 50000d, 20, 123123d);
		e1.display();
		
//		PermanentEmployee p2 = te1; // This will not work because a TemporaryEmployee is not a PermanentEmployee
		PermanentEmployee p3 = pe1; // This will work because a PermanentEmployee is a PermanentEmployee
	
		Scanner sc	= new Scanner(System.in);
		
		System.out.println("Enter the employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the employee salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		Employee e2 = new Employee(id, name, salary);
	}

}
