package pavelkim.homework8.part2;

public class AnimalRoom {

    public static void main(String[] args) {

        BritishCat tom = new BritishCat(10, 12, 77);
        BritishCat sophy = new BritishCat(8,10,88);
        GermanShepherdDog chappy = new GermanShepherdDog(40, 45);

        chappy.sound();
        tom.sound();

        chappy.isAnimalsAFriends(sophy);
        tom.isAnimalsAFriends(chappy);
        tom.isAnimalsAFriends(sophy);
    }
}
