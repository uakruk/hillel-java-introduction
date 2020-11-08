package com.hillel.java.introduction.katerynadanko.lesson9.lection.oop;

public class Labrador extends Dog{
    private  String color;
    private int age;

    public Labrador(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Labrador{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
