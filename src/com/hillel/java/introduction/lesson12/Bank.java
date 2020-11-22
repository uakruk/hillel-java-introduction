package com.hillel.java.introduction.lesson12;

public interface Bank {

    public default void pay() throws MyException {
        System.out.println("Bank paying");
    }
}
