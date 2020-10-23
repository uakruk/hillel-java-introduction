package romanvetrov;

import java.util.Scanner;

public class Main {

    final static double INTEREST_RATE = 11.29;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer number:");
        int integerNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second floating point number:");
        double floatingPointNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the character:");
        char character = scanner.nextLine().charAt(0);

        // 1. Perform different operations between integerNumber and floatingNumber:
        // Try to understand which result you're expecting before running the program (because of different data types)
        // Do System.out.println() of the results.
        // Play around the assignment shortcuts (like integerNumber += 100;)

        // +
        // here your code
        System.out.println("integerNumber + floatingPointNumber : " + integerNumber + floatingPointNumber);
        System.out.println("integerNumber + floatingPointNumber : " + (integerNumber + floatingPointNumber));

        // -
        // here your code
        System.out.println("integerNumber-floatingPointNumber : " + (integerNumber - floatingPointNumber));
        System.out.println("floatingPointNumber - integerNumber : " + (floatingPointNumber - integerNumber));
        // *
        // here your code
        System.out.println("integerNumber * floatingPointNumber : " + (integerNumber * floatingPointNumber));
        // / (division)
        // here your code
        System.out.println("integerNumber / floatingPointNumber : " + integerNumber / floatingPointNumber);
        System.out.println("floatingPointNumber / integerNumber : " + floatingPointNumber / integerNumber);
        // %
        // here your code
        System.out.println( "integerNumber % floatingPointNumber : " + integerNumber % floatingPointNumber);
        System.out.println("floatingPointNumber % integerNumber : " + floatingPointNumber % integerNumber);
        // ++
        // here your code
        System.out.println("++integerNumber : " + ++integerNumber);
        System.out.println("integerNumber++ : " + integerNumber++);
        System.out.println("++floatingPointNumber : " + ++floatingPointNumber);
        System.out.println("floatingPointNumber++ : " + floatingPointNumber++);
        // --
        // here your code
        System.out.println("integerNumber-- : " +integerNumber--);
        System.out.println("--integerNumber : " + --integerNumber);
        System.out.println("floatingPointNumber-- : " + floatingPointNumber--);
        System.out.println("--floatingPointNumber : " + --floatingPointNumber);


        // 2. Declare 2 boolean values and compare them inside the System.out.println()
        // e.g.: boolean a = true; boolean b = false; System.out.println(a | b); (should be true)
        // Try to predict the result of the expression before running the program
        // here your code
        boolean x = true;
        boolean y = false;
        System.out.println("x==y : " + (x==y));
        System.out.println("x != y: " + (x!=y));

        // 3. Try to understand accelerated computation of boolean expressions:
        // Instead of declaring the variables, let's call the methods directly:
        // e.g. System.out.println(getFirst() || getSecond());
        // perform it for different operations: ^ && || !. Try to change the order of calling these methods (like System.out.println(getSecond() || getFirst());
        System.out.println("getFirst()^getSecond() : " + (getFirst()^getSecond()));
        System.out.println("getSecond()^getFirst() : " + (getSecond()^getFirst()));
        System.out.println("getSecond()^getSecond() : " + (getSecond()^getSecond()));

        System.out.println("getSecond()&&getFirst() : " + (getSecond()&&getFirst()));
        System.out.println("getSecond()&&getSecond() : " + (getSecond()&&getSecond()));
        System.out.println("getFirst()&&getFirst() : " + (getFirst()&&getFirst()));

        System.out.println("getFirst()||getSecond() : " + (getFirst()||getSecond()));
        System.out.println("getFirst()||getFirst() : " + (getFirst()||getFirst()));
        System.out.println("getSecond()||getSecond() : " + (getSecond()||getSecond()));

        System.out.println("!(getSecond()&&getFirst()) : " + !(getSecond()&&getFirst()));
        System.out.println("!getFirst(): " +!getFirst());
        System.out.println("!getSecond(): " + !getSecond());

        // 4. Convert the character to the short
        // perform bitwise operations with the short number you've just got with the following numbers: 0xFFFF, 0b00000001
        // &
        // ^
        // |
        // ~ (it doesn't require the second number)

        /*
        In order to convert and output your variable to binary format use the following expression (just replace YOUR_VARIABLE with what do you need)
        System.out.println(Integer.toBinaryString(YOUR_VARIABLE));
         */
        System.out.println("(short)character : " + (short)character);
        System.out.println("Integer.toBinaryString((short)character) : " + Integer.toBinaryString((short)character));
        System.out.println("Integer.toBinaryString(integerNumber) : " + Integer.toBinaryString(integerNumber));
        System.out.println("0xFFFF&0b00000001 : " + (0xFFFF&0b00000001) + " or : "+ Integer.toBinaryString(0xFFFF&0b00000001));
        System.out.println("0xFFFF^0b00000001 : " + (0xFFFF^0b00000001) + " or : "+ Integer.toBinaryString(0xFFFF^0b00000001));
        System.out.println("0xFFFF|0b00000001  : " + (0xFFFF|0b00000001) + " or : "+ Integer.toBinaryString(0xFFFF|0b00000001));
        System.out.println("~0b00000001 : " + (~0b00000001) + " or : "+ Integer.toBinaryString(~0b00000001));

        // 5. Try to shift your number left and right:
        // >>
        // >>>
        // <<
        System.out.println("int : " + (integerNumber) + "; binary : " + Integer.toBinaryString(integerNumber) + "; result : " + Integer.toBinaryString(integerNumber>>1));
        System.out.println("int : " + (integerNumber) + "; binary : " + Integer.toBinaryString(integerNumber) + "; result : " + Integer.toBinaryString(integerNumber>>>1));
        System.out.println("int : " + (integerNumber) + "; binary : " + Integer.toBinaryString(integerNumber) + "; result : " + Integer.toBinaryString(integerNumber<<1));

        // 6*. Try to get the 512 from the 1 without any multiplications, using any libraries or adding any numbers.
        int one = 0x01;
        System.out.println(Integer.toBinaryString(one<<9));
        System.out.println(one << 9 /* here your operation with the one*/);

    }

    private static boolean getFirst() {
        System.out.println("Get first called which always returns true");
        return true;
    }

    private static boolean getSecond() {
        System.out.println("Get second called which always returns false");
        return false;
    }

}
