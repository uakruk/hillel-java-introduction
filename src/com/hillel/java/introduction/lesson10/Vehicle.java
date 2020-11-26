package com.hillel.java.introduction.lesson10;

public class Vehicle implements Driven {

    protected String carNumber;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void methodToOverride() {
        System.out.println("Method called from vehicle.");
    }

    public static void sayHello() {
        System.out.println("Hello from vehicle");
    }

    @Override
    public void drive() {
        System.out.println("Driving the vehicle...");
    }
}

