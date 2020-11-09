package pavelkim.lesson8;

import pavelkim.lesson8.onlyAnimals.Animal;

public class Cat extends Animal {
    protected double weight;
    protected double size;
    private  String boss;

    protected Cat(double weight, double size) {
        super(weight, size);
    }

    public Cat() {
        super();
    }
}
