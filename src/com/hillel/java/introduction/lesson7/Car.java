package com.hillel.java.introduction.lesson7;

public class Car {

    String brand;

    int doorsNumber;

    void run() {
        System.out.println("I'm running");
    }

    void beep() {
        System.out.println("Beep-beep!!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "BMW";
        myCar.doorsNumber = 5;

        myCar.run();
        myCar.beep();

        System.out.println("Car has: " + myCar.doorsNumber + " doors and it's " + myCar.brand);
    }
}
