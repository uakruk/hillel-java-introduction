package pavelkim.homework8.part2;

public class GermanShepherdDog extends Dog {

    protected GermanShepherdDog(double weight, double size) {
        super(weight,size);
    }

    @Override
    public void sound() {
        System.out.println("BACK BACK Deutschland");
    }
}
