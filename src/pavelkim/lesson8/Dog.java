package pavelkim.lesson8;

import pavelkim.lesson8.onlyAnimals.Animal;

import java.util.Objects;

public class Dog extends Animal {

    String name;

    protected Dog(double weight, double size) {
        super(weight, size);
    }

    void eatShoes() {
        System.out.println("omomomom");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
