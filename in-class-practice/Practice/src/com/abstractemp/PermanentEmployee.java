package com.abstractemp;

public class PermanentEmployee extends Employee {
	double bonus;
	
	public PermanentEmployee(int id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return salary + bonus;
	}
	
	public void display() {
		super.display();
		System.out.println("Bonus: " + bonus);
	}

}
