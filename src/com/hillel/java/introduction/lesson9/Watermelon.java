package com.hillel.java.introduction.lesson9;

public class Watermelon implements CombinedEatable {

    @Override
    public void drink() {

    }

    @Override
    public void eat() {

    }

    @Override
    public String foodName() {
        return null;
    }

    public static void main(String[] args) {
        Watermelon watermelon = new Watermelon();
        Eatable eatable = new Watermelon();
        OtherEatable otherEatable = new Watermelon();
        
    }
}
