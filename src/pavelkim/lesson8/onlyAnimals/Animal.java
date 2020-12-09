package pavelkim.lesson8.onlyAnimals;

public abstract class Animal implements Breed{
    private double weight;
    private double size;

    public double getWeight() {
        return weight;
    }
    public double getSize() {
        return size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public Animal(double weight, double size) {
        this.weight = weight;
        this.size = size;
    }

    public void eat() {
        System.out.println("I'm eat");
    }

    public void kak() {
        System.out.println("I'm kak");
    }

    public abstract void sound();
}