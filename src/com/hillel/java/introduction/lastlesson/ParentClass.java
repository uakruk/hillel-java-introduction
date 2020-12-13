package com.hillel.java.introduction.lastlesson;

import java.io.IOException;

public class ParentClass {

    private int number;

    private String string;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Number getObjectNumber() throws IOException {
        return new Integer(10);
    }

    static {
        System.out.println("ParentClass was loaded");
    }
}
