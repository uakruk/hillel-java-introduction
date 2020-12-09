package pavelkim.lesson8;

import pavelkim.lesson8.onlyAnimals.Animal;

public class Cat extends Animal {


    protected String color;

    public Cat(double weight, double size, String color) {
        super(weight, size);
        this.color = color;
    }

    @Override
    public String color() {
        return null;
    }

    @Override
    public int averageLifeTime() {
        return 15;
    }

    @Override
    public boolean edible() {
        return false;
    }

    @Override
    public void sound() {
        System.out.println("meu!!!!!!!!!!!");
    }
}
