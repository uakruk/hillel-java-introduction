package com.hillel.java.introduction.katerynadanko.lesson9.lection.oop;

import java.util.Objects;

public class Cat extends Animal {
    String boss;
    String fluffiness;
    int levelOfSoftnessOfPaws;

    public Cat() {
        System.out.println("Initial constructor");
    }

    public Cat(String fluffiness) {
        this.fluffiness = fluffiness;
        System.out.println("Cat with fluffiness - constructor");
    }

    public Cat(String fluffiness, int levelOfSoftnessOfPaws) {
        this.fluffiness = fluffiness;
        this.levelOfSoftnessOfPaws = levelOfSoftnessOfPaws;
        System.out.println("Cat with fluffiness and levelOfSoftnessOfPaws - constructor");
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(boss, cat.boss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boss);
    }

}
