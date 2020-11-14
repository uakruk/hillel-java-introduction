package pavelkim.homework8.part2;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog extends Animal {

    String name;

    protected Dog(double weight, double size) {
        super(weight, size);
    }

    void eatShoes() {
        System.out.println("omomomom");
    }
    protected boolean isFiends(Object obj) {
        return obj instanceof Dog;
    }

    protected void isAnimalsAFriends(Object animal) {
    String ms = isFiends(animal) ? "animals got friends" : "animals conflict";
    System.out.println(ms);
    }
}
