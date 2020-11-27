package com.hillel.java.introduction.lesson12;

import java.io.FileNotFoundException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        try {
            throwSomething(false);
            System.out.println("After throwing");
        } catch (MyException | MyOtherException e) {
            System.out.println("Catched exception");
        } finally {
            System.out.println("Inside finally");
        }

        try {
            doesntThrowAnything();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void throwSomething(boolean shouldThrow) throws MyException, MyOtherException {
        Random random = new Random();
        boolean b = random.nextBoolean();
        if (b && shouldThrow) {
            throw new MyException();
        } else if (shouldThrow){
            throw new MyOtherException();
        }
    }

    public static void doesntThrowAnything() throws MyException, RuntimeException {

    }
}
