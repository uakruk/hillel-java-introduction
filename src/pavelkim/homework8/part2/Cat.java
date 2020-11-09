package pavelkim.homework8.part2;

public class Cat extends Animal {
    protected double weight;
    protected double size;
    private  String boss;

    protected Cat(double weight, double size, int beautyLevel) {
        super(weight, size);
    }
    protected boolean isFiends(Object obj) {
        return obj instanceof Cat;
    }
    protected void isAnimalsAFriends(Object animal) {
        String ms = isFiends(animal) ? "animals got friends" : "animals conflict";
        System.out.println(ms);
    }
}
