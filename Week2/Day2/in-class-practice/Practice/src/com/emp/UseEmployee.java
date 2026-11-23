package com.emp;

public class UseEmployee {
	
	static {
		System.out.println("I'm static block in UseEmployee");
	}

	public static void main(String[] args) {
		System.out.println("I'm main() in UseEmployee");
		
		Employee emp = new Employee();
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Salary: " + emp.getSalary());
		
		System.out.println();
		
		Employee emp2 = new Employee(2, "Bob", 20000D);
		System.out.println("Employee ID: " + emp2.getId());
		System.out.println("Employee Name: " + emp2.getName());
		System.out.println("Employee Salary: " + emp2.getSalary());

//		emp2.incrementSalary();
		
		Employee emp3 = new Employee(2, "Bob", 20000D);
		
		System.out.println("emp2 == emp3: " + (emp2 == emp3));
		System.out.println("emp2.equals(emp3): " + emp2.equals(emp3));
		
		emp = null;
		emp2 = null;
		emp3 = null;
		
		System.gc(); // requesting JVM to run garbage collector
		
		System.out.println("Main method completed");
	}

}
