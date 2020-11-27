package com.hillel.java.introduction.lesson11;

@FunctionalInterface
public interface CashTerminal {

    int acceptMoney(double amount, int where);

    default void giveMoney(double amount) {}

    default void sayHello() {

    }
}
