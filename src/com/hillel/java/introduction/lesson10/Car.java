package com.hillel.java.introduction.lesson10;

public class Car extends Vehicle {

    protected String carNumber;

    private final int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String getCarNumber() {
       // return carNumber;
        return super.getCarNumber();
    }

    @Override
    public void setCarNumber(String carNumber) {
        super.setCarNumber(carNumber);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void updateCarNumber(String carNumber) {
        this.carNumber = carNumber;
        System.out.println("Car number updated " + carNumber);
    }

    @Override
    public void methodToOverride() {
        System.out.println("Method called from Car and see the below message:");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", super.carNumber='" + getCarNumber() + '\'' +
                '}';
    }

    public static void sayHello() {
        System.out.println("Hello from car");
    }
}
