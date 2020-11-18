package com.hillel.java.introduction.lesson10;

public interface Driven {

    String name = "NAME";

    void drive();

    default void beebeep() {
        drive();
        System.out.println("Bee-beep!");
    }

    static void sayHello() {

    }
}
