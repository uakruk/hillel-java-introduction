package com.hillel.java.introduction.lesson12;

public class PrivatBank implements Bank {

    @Override
    public void pay() throws MyExceptionChild {
        System.out.println("Paying with privat");
    }
}
