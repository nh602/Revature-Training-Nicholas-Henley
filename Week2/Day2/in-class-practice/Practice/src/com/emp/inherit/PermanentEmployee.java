package com.emp.inherit;

public class PermanentEmployee extends Employee {
	private double bonus;
	
	public PermanentEmployee() {
		super();
		this.bonus = 10000d;
	}
	
	public PermanentEmployee(int id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	public PermanentEmployee(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		System.out.println("I'm toString() in PermanentEmployee");
		return super.toString() + ", bonus=" + bonus + "]";
	}
	
	@Override
	public double calculateSalary() {
//		return super.calculateSalary() + bonus;
		return salary + bonus;
	}
	
	@Override
	public void display() {
		System.out.println("PermanentEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]");
	}
	
	@Override
	public String toString() {
		System.out.println("I'm toString() in PermanentEmployee");
		return super.toString() + ", bonus=" + bonus + "]";
	}
}
