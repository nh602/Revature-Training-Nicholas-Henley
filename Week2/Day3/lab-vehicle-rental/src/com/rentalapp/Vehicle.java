package com.rentalapp;

public class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected double ratePerDay;
    protected int days;

    public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.ratePerDay = ratePerDay;
        this.days = days;
    }

    public double calculateRent() {
        return ratePerDay * days;
    }

    // Car  | KA01AB1234 | Swift  | Days: 3 | Rent: 5100.0 
    public void displayDetails() {
        System.out.printf("%s | %s | %s | Days: %d | Rent: %.2f%n", 
                "Vehicle", vehicleNumber, model, days, calculateRent());
    }
}
