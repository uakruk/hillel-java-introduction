package pavelkim.lesson10;

public interface Driven {

    void drive();

    default void beebeep() {
        drive();
        System.out.println("Bee - beep");
    }
    static void staticMethod(){
    }
}
