package com.hillel.java.introduction.lesson8.onlyanimals;

public class Animal {

    protected double weight;
    protected double size;

    protected Animal(double weight, double size) {
        this.weight = weight;
        this.size = size;
        System.out.println("Inside animal with 2 arguments");
    }

   // public Animal() {
      //  this(10, 10);
    //    System.out.println("Inside animal without arguments");
   // }

    public void eat() {
        System.out.println("I'm animal and I'm eating.");
    }

    public void kak() {
        System.out.println("I'm kaking");
    }

    public void sound() {
        System.out.println("Sound of the animal.");
    }
}
