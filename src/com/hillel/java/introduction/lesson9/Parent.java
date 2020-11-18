package com.hillel.java.introduction.lesson9;

public class Parent {

    static Initializable staticField = new Initializable("Parent static field");

    static {
        System.out.println("Parent Static section");
    }

    static Initializable otherField = new Initializable("Parent second static field");

    Initializable memberField = new Initializable("Parent Member field");

    {
        System.out.println("Parent Inside block section");
    }

    Initializable secondMemberFiled = new Initializable("Parent Second Member Field");

    public Parent() {
        System.out.println("Parent Constructor called");
    }

    public static void someMethod() {
        System.out.println("Some method called in Parent");
    }
}
