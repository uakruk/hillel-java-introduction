package com.hillel.java.introduction.katerynadanko.Bank;

public class AvailableClientMoneyException extends Exception{

    public AvailableClientMoneyException() {
    }

    public AvailableClientMoneyException(String message) {
        super(message);
    }
}
