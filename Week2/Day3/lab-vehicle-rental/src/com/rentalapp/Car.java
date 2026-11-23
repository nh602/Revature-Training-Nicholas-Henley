package com.rentalapp;

public class Car extends Vehicle {
    private double insurancePerDay;

    public Car(String vehicleNumber, String model, double ratePerDay, int days, double insurancePerDay) {
        super(vehicleNumber, model, ratePerDay, days);
        this.insurancePerDay = insurancePerDay;
    }

    @Override
    public double calculateRent() {
        return super.calculateRent() + (insurancePerDay * days);
    }

    // Car  | KA01AB1234 | Swift  | Days: 3 | Rent: 5100.0 | Insurance: 1500.0
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Insurance per Day: %.2f".formatted(insurancePerDay));
    }
}
