package com.hillel.java.introduction.lesson10;

public class Truck extends Vehicle {

    private double cargoAmount;

    public double getCargoAmount() {
        return cargoAmount;
    }

    public void setCargoAmount(double cargoAmount) {
        this.cargoAmount = cargoAmount;
    }

    @Override
    public void methodToOverride() {
        System.out.println("Method called from truck.");
    }
}
