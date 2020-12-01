package pavelkim.lesson8;

import pavelkim.lesson8.onlyAnimals.Animal;

import java.util.Objects;

public class Dog extends Animal {

    private String name;

    protected Dog(double weight, double size, String name) {
        super(weight, size);
        this.name = name;
    }


    @Override
    public String color() {
        return "White";
    }

    @Override
    public int averageLifeTime() {
        return 17;
    }

    @Override
    public boolean edible() {
        return false;
    }

    @Override
    public void sound() {
        System.out.println("GAF!!!!!!!!");
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
