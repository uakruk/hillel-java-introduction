package com.hillel.java.introduction.lesson10;

public class SuperCar extends Car {

    public SuperCar() {
        super(2); // all supercars have at most 2 seats
    }

    @Override
    public String getCarNumber() {
        return super.getCarNumber();
    }

    @Override
    public void setCarNumber(String carNumber) {
        super.setCarNumber(carNumber);
    }
}
