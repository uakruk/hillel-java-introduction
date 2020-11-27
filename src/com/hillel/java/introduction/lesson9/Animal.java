package com.hillel.java.introduction.lesson9;

public class Animal {

    public static int nameGetCounter = 0;

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        nameGetCounter++;
        return name;
    }

    public void setName(String name) {
        System.out.printf("Was: %s and become %s\n", this.name, name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal("Animal " + i, i);
        }

        System.out.println(Animal.nameGetCounter);
        animals[0].getName();
        System.out.println(Animal.nameGetCounter);

        animals[2].getName();
        System.out.println(Animal.nameGetCounter);

        animals[5].setName("New Animal name");

    }

}
