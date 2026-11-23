package com.emp.inherit;

import java.util.Objects;

public class Employee {
	protected int id;
	protected String name;
	protected double salary;
	
	static int number = 100;
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
//		super.finalize();
		System.out.println("Employee " + id + " is being garbage collected");
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name, Double.valueOf(salary));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		System.out.println("I'm toString() in Employee");
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Employee() {
		this.id = 1;
		this.name = "Alice";
		this.salary = 110000d;
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, double salary) {
		this.id = number++;
		this.name = name;
		this.salary = salary;
	}
	
	double incrementSalary() {
		salary = salary + (salary * 0.2);
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// To fetch the name property outside the class
	public String getName() {
		return name;
	}
	
	// To update the private property 'name' outside the class
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateSalary() {
		return salary;
	}
	
	public void display() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}
	
}
