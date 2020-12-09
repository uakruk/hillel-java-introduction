package pavelkim.lesson3;

public class Main {

    public static void main(String[] args) {
        String greeting = "Hello there!";
        String greeting2 = "Hello there!";
        String greeting3 = "Hello there!";
        String greeting4 = "HeLlo ThEre!";

        char[] chars = greeting.toCharArray();
        System.out.println(greeting);

        /**
         * Equals
         */
        System.out.println(greeting == greeting2);
        System.out.println(greeting == greeting3);
        System.out.println(greeting2 == greeting3);
        System.out.println("Wirth equals: ");
        System.out.println(greeting.equals(greeting2));
        System.out.println(greeting.equals(greeting3));

        /**
         * Equals ignore case @equals
         */
        System.out.println("greeting.equals(greeting4) :" + greeting.equals(greeting4));
        System.out.println("greeting.equalsIgnoreCase(greeting4): " + greeting.equalsIgnoreCase(greeting4));
        /**
         * Search @indexOf @lastIndexOf
         */
        String someString = "Black cat category";
        int cat = someString.indexOf("cat");
        System.out.println("Cat index of : " + cat);
        int nextCat = someString.indexOf("cat", 7);
        System.out.println("cat index of :" + nextCat);
        int lastCat = someString.lastIndexOf("cat");
        System.out.println("cat last of :" + lastCat);
    }
}
