package com.hillel.java.introduction.lesson9;

import java.util.HashMap;
import java.util.Map;

public class Child extends Parent {

    static Initializable childInitializable = new Initializable("Child static field");

    static {
        System.out.println("Child static section");
    }

    public Child() {
        System.out.println("Child constructor");
    }

    {
        System.out.println("Child instance section");
    }

    Initializable childMember = new Initializable("Child field member");
}
