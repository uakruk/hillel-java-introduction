package com.hillel.java.introduction.lesson11;

public class AnonymouaClass {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int counter = i;
            new Runnable() {
                public void run() {
                    System.out.println("The is is " + counter);
                }
            }.run();
        }
    }

    public void mehtod1() {
        class A {

        }
    }

    public void method2() {
        class A {

        }
    }
}
