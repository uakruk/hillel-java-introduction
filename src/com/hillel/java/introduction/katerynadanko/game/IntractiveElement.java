package com.hillel.java.introduction.katerynadanko.game;

public interface IntractiveElement {

    void decisionLoop();
        void printMenu();

    default void use() {
       printMenu();
       decisionLoop();
    }

}
