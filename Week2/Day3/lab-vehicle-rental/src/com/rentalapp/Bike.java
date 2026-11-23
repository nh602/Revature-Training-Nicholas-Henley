package com.rentalapp;

public class Bike extends Vehicle {
    private static final double discountPerDay = 0.1;

    public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
        super(vehicleNumber, model, ratePerDay, days);
    }

    @Override
    public double calculateRent() {
        double totalRent = super.calculateRent();
        double discount = discountPerDay * days * totalRent;
        return totalRent - discount;
    }

    // Bike | KA02CD5678 | Activa | Days: 4 | Rent: 1800.0 | Discount per Day: 10.0%
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Discount per Day: %.2f%%".formatted(discountPerDay * 100));
    }
}
