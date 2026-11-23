package com.rentalapp;

import java.util.Scanner;

public class RentalApp {
    public static void printRentalDetails(Vehicle[] vehicles) {
        double totalRent = 0;

        System.out.println("--- Rental Details ---");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            totalRent += vehicle.calculateRent();
        }
        System.out.printf("Total Rent Collected: %.2f%n", totalRent);
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Welcome to the Vehicle Rental App!");
            System.out.print("Enter number of vehicles: ");
            int numVehicles = sc.nextInt();

            Vehicle[] vehicles = new Vehicle[numVehicles];
            for (int i = 0; i < numVehicles; i++) {
                System.out.println("Enter details for vehicle " + (i + 1) + ":");
                System.out.println("\tEnter vehicle type (1-Car, 2-Bike): ");
                int vehicleType = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                System.out.println("\tEnter vehicle number: ");
                String vehicleNumber = sc.nextLine();

                System.out.println("\tEnter model: ");
                String model = sc.nextLine();

                System.out.println("\tEnter rate per day: ");
                double ratePerDay = sc.nextDouble();
                sc.nextLine(); // Consume the newline character

                System.out.println("\tEnter number of days: ");
                int days = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                switch(vehicleType){
                    case 1:
                        System.out.println("\tEnter insurance per day: ");
                        double insurancePerDay = sc.nextDouble();
                        vehicles[i] = new Car(vehicleNumber, model, ratePerDay, days, insurancePerDay);
                        break;
                    case 2:
                        vehicles[i] = new Bike(vehicleNumber, model, ratePerDay, days);
                        break;
                    default:
                        System.out.println("Invalid vehicle type. Please enter 1 for Car or 2 for Bike.");
                        i--; // Decrement i to repeat this iteration
                        break;
                }
            }

            printRentalDetails(vehicles);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }
}
