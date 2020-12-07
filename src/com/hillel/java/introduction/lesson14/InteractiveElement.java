package com.hillel.java.introduction.lesson14;

public interface InteractiveElement {

    void decisionLoop();

    void printMenu();

    default void use() {
        printMenu();
        decisionLoop();
    }
}
