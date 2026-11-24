package com.filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializationDemo {
    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(101, "Alice Johnson", "Engineering", 85000.0),
            new Employee(102, "Bob Smith", "Marketing", 62000.0),
            new Employee(103, "Carol White", "Finance", 71000.0),
            new Employee(104, "David Brown", "HR", 58000.0),
            new Employee(105, "Eva Green", "Operations", 66000.0)
        };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(employees);
            System.out.println("Employees written to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Employee[] loaded = (Employee[]) in.readObject();
            System.out.println("Employees read from " + FILE_NAME + ":");
            for (Employee e : loaded) {
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
