package com.myreflection;

import java.lang.reflect.Method;

public class UseReflection {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        Class<?> cls = emp1.getClass();
        System.out.println("Class Name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        System.out.println("Package name: " + cls.getPackageName());
        

        Method[] ms = cls.getMethods();
        for (Method m : ms) {
            System.out.println("Method: " + m.toString());
        }

    }
}
