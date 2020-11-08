package com.hillel.java.introduction.katerynadanko.lesson9.lection.oop;

import java.util.Objects;

public class Cat extends Animal {
    String boss;

    public void pissToShoes(){
        System.out.println("I`m pissing to shoes");
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

    @Override
    public String toString() {
        return "Cat{" +
                "boss='" + boss + '\'' +
                " weight= " + weight +
                " size= " + size +
                '}';
    }
}
