package pavelkim.homework8.part2;

public class BritishCat extends Cat {

    protected BritishCat(double weight, double size, int beautyLevel) {
        super( weight, size,  beautyLevel);
    }

    @Override
    public void sound() {
        System.out.println("let the queen live");
    }
}