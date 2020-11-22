package com.hillel.java.introduction.lesson12;

public class BooleanExample {

    public static void main(String[] args) {

        if (method2() ^ method1()) {
            System.out.println("End");
        }
    }

    public static boolean method1() {
        System.out.println("Method 1 called");
        return true;
    }

    public static boolean method2() {
        System.out.println("Method 2 called");
        return false;
    }
}
