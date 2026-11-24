package com.emp.inherit;

public class TemporaryEmployee extends Employee {
	private int workingDays;
	private double perDayRate;
	
	public TemporaryEmployee() {
		super();
		this.workingDays = 20;
		this.perDayRate = 1000d;
	}
	
	public TemporaryEmployee(int id, String name, double salary, int workingDays, double perDayRate) {
		super(id, name, salary);
		this.workingDays = workingDays;
		this.perDayRate = perDayRate;
	}
	
	@Override
	public double calculateSalary() {
		return workingDays * perDayRate;
	}
	
	@Override
	public void display() {
		System.out.println("TemporaryEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", workingDays=" + workingDays + ", perDayRate=" + perDayRate + "]");
	}
	
	@Override
	public String toString() {
		System.out.println("I'm toString() in TemporaryEmployee");
		return super.toString() + ", workingDays=" + workingDays + ", perDayRate=" + perDayRate + "]";
	}
}
