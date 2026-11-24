package com.fileio;

import java.io.Serializable;

public class Employee implements Serializable{
    private String name;
    private int id;
    private double salary;

    public Employee() {
        this.name = "Default Name";
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int id, double salary)  {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
