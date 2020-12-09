package pavelkim.lesson8;

public class    Zoo {

    public static void main(String [] args) {
        Cat vasya = new Cat(10, 12, "red");
        vasya.sound();
        System.out.println(vasya.color);

        Dog dog = new Dog(20, 25, "Jack");
        dog.sound();
        System.out.println(dog.color());
    }
}
