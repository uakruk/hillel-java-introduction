package com.hillel.java.introduction.lesson9;

public class Fruit implements Eatable, Drinkable {

    @Override
    public void eat() {
        System.out.println("Om nom nom");
    }

    @Override
    public String foodName() {
        return "Fruit";
    }

    @Override
    public void drink() {
        System.out.println("Drink watermelon");
    }
}
