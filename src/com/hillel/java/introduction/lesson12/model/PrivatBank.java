package com.hillel.java.introduction.lesson12.model;

import com.hillel.java.introduction.lesson12.MyExceptionChild;
import com.hillel.java.introduction.lesson12.model.Bank;

public class PrivatBank implements Bank {

    public static int numberOfClients = 20_000_000;

    public static void sayBank() {
        System.out.println("Privat!");
    }

    @Override
    public void pay() throws MyExceptionChild {
        System.out.println("Paying with privat");
    }
}
