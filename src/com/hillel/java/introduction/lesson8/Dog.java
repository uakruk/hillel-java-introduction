package com.hillel.java.introduction.lesson8;

import com.hillel.java.introduction.lesson8.onlyanimals.Animal;

import java.util.Objects;

public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        super(10, 10);
        System.out.println("Dog constructor");
    }

    public Dog(String name, double size, double weight) {
        super(weight, size);
    }

    void eatShoes() {
        System.out.println("Ohmnomnom");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            return Objects.equals(dog.name, this.name)
                    && this.size == dog.size
                    && this.weight == dog.weight;
        } else {
            return false;
        }
    }
}
