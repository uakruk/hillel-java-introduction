package com.hillel.java.introduction.katerynadanko.lesson9.lection.oop;

public class Dog  extends Animal {
    String name;

    public void eatShoes() {

        System.out.println("I`m eating shoes");
}

    public void pissToShoes(){
        System.out.println("I`m pissing to shoes");
    }

    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}
