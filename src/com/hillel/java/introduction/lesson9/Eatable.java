package com.hillel.java.introduction.lesson9;

public interface Eatable {

    String CONSTANT = "HELLO";

    void eat();

    String foodName();

    default void sayHello() {

        System.out.println("Hello from interface" + foodName());
    }

}
