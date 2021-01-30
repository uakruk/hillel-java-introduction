package pavelkim.home.work4;

public class Main {
    public static void main(String[] args) {
        String string = " Hillel hello from Pavel Kim ";
        String empty = "";
        // .contains()
        System.out.println("string contains \"Kim\" : " + string.contains("Kim"));
        System.out.println("string contains \"kim\" : " + string.contains("kim"));
        // .length()
        System.out.println("string length : " + string.length());
        // .trim()
        System.out.println("string : \"" + string + "\"");
        System.out.println("string.trim() : \"" + string.trim() + "\"");
        //.isEmpty()
        System.out.println("string.isEmpty() : " + string.isEmpty());
        System.out.println("empty.isEmpty() : " + empty.isEmpty());
        // .toLowerCase()
        System.out.println("string.toLowerCase() : " + string.toLowerCase().trim());
        //.toUpperCase()
        System.out.println("string.toUpperCase() : " + string.toUpperCase().trim());
        // .equals()
        System.out.println("string.equals(\" Hillel hello form Pavel Kim \") : " + string.equals(" Hillel hello form Pavel Kim "));
        System.out.println("string.equals(\"Hillel hello form Pavel Kim\") : " + string.equals("Hillel hello form Pavel Kim"));
        // .indexOf()
        System.out.println(".indexOf(\"Kim\") : " + string.indexOf("Kim"));
        System.out.println(".indexOf(\"e\") : " + string.indexOf("e"));
        System.out.println("indexOf(\"e\", 6) : " + string.indexOf("e", 6));
        System.out.println(".indexOf(\" \") : " + string.indexOf(" "));
        // .lastIndexOf();
        System.out.println("lastIndexOf(\"e\") : " + string.lastIndexOf("e"));
        System.out.println("lastIndexOf(\"e\", 21) : " + string.lastIndexOf("e", 21));
        // .substring();
        System.out.println(".substring(19) : \"" + string.substring(19) + "\"");
        System.out.println("substring(19, 28) : \"" + string.substring(19, 28) + "\"");
        // .toCharArray() + for
        int i = 0;
        for(Character letter : string.toCharArray()) {
            if (letter.toString().equals("e")) {
                i++;
        }
    }
        System.out.println("\"e\" count : " + i);
        // while
        int k =0;
        while (k < string.length()) {
            System.out.print(k + " : " + string.toCharArray()[k] + "/");
            k++;
        }
    }
}
