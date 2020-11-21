package com.hillel.java.introduction.katerynadanko.Bank;

public class ATM implements GivebleMony {
    private double availableMoney = 10_000;


    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }
}
