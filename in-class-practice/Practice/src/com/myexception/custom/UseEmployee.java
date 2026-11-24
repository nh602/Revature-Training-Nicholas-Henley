package com.myexception.custom;

public class UseEmployee {
    public static void main(String[] args) {
        Employee emp1 = null;
        try{
            emp1 = new Employee("John Doe", 101, 50000.0);
        }
        catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (emp1 != null) {
            System.out.println("Employee 1: " + emp1);
        }

    }
}
