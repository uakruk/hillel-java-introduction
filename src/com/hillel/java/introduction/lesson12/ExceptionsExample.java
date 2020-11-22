package com.hillel.java.introduction.lesson12;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) {

        try {
            if (true) {
                throw new FileNotFoundException();
            }
            InputStream imageInputStream = new BufferedInputStream(Objects.requireNonNull(ClassLoader.getSystemResourceAsStream("image.jpg")));

        } catch (FileNotFoundException | NullPointerException e) {

            exceptionHandling();
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }

    public static void canThrowException(String what) throws Exception {
        innerMethod();
    }

    public static void innerMethod() throws Exception {
        throw new MyException();
    }

    public static void exceptionHandling() {
        System.out.println("Exception handled");
    }
}
