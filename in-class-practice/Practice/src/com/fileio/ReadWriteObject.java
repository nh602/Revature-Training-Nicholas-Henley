package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ReadWriteObject {
    public static void main(String[] args){
        Employee e1 = new Employee( "Marisa",29,  300000.0);

        try (FileOutputStream fos = new FileOutputStream("emp.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream("emp.txt");
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            oos.writeObject(e1);

            System.out.println("Reading from file: ");

            Employee e2 = (Employee) ois.readObject();

            System.out.println(e2);
        } catch (FileNotFoundException e){
            System.out.println("filename not found: " + e);
        } 
        catch (IOException e) {
            System.out.println("Failed to open ObjectOutputStream: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to read object: " + e);
        }
    }
}
