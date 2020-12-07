package com.hillel.java.introduction.lesson12.model;

import com.hillel.java.introduction.lesson12.MyException;

public interface Bank {

    public default void pay() throws MyException {
        System.out.println("Bank paying");
    }
}
