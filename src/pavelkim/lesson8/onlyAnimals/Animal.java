package pavelkim.lesson8.onlyAnimals;

public class Animal {
    protected double weight;
    protected double size;

    protected Animal(double weight, double size) {
        this.weight = weight;
        this.size = size;
    }

    public Animal() {

    }

    public void eat() {
        System.out.println("I'm eat");
    }

    public void kak() {
        System.out.println("I'm kak");
    }

    public void sound() {
        System.out.println("Sound of animal");
    }
}