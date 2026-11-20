package com.emp;

public class Employee {
	int id;
	String name;
	double salary;
	
	@Override
	public String toString() {
		System.out.println("I'm toString() in Employee");
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
//	public Employee() {
//		this.id = 1;
//		this.name = "Alice";
//		this.salary = 30000D;
//	}
}
