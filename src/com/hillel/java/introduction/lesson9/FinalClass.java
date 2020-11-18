package com.hillel.java.introduction.lesson9;

public class FinalClass {

    private final String name;
    private final int age;

    private static final double rate = 1;

    public FinalClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public FinalClass() {
        this.name = "";
        this.age = 10;
    }

    public final void myMethod(final String s) {
        final int myVariable = 10;
    }
}
