package com.myexception.custom;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) throws InvalidSalaryException {
        this.name = name;
        this.id = id;
        
        if (salary < 0) {
            throw new InvalidSalaryException("Invalid salary. Please enter a positive value.");
        }
        
        this.salary = salary;
    }
}
