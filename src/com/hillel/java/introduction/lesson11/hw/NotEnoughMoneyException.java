package com.hillel.java.introduction.lesson11.hw;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }

    public NotEnoughMoneyException(double amount, double available) {
        super(String.format("Not enough money: requested %f but available only %f", amount, available));
    }
}
