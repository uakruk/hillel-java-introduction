
package com.hillel.java.introduction;

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

            System.out.println("integerNumber + floatingNumber = " + (integerNumber + floatingPointNumber));
            System.out.println("floatingNumber + integerNumber = " + (floatingPointNumber + integerNumber));

        // -
        // here your code

            System.out.println("integerNumber - floatingNumber = " + (integerNumber - floatingPointNumber));
            System.out.println("floatingNumber - integerNumber = " + (floatingPointNumber - integerNumber));

        // *
        // here your code

            System.out.println("integerNumber * floatingNumber = " + (integerNumber * floatingPointNumber));
            System.out.println("floatingNumber * integerNumber = " + (floatingPointNumber * integerNumber));

        // / (division)
        // here your code

            System.out.println("integerNumber / floatingNumber = " + (integerNumber / floatingPointNumber));
            System.out.println("floatingNumber / integerNumber = " + (floatingPointNumber / integerNumber));

        // %
        // here your code

            System.out.println("integerNumber % floatingNumber = " + (integerNumber % floatingPointNumber));
            System.out.println("floatingNumber % integerNumber = " + (floatingPointNumber % integerNumber));

        // ++
        // here your code

        System.out.println(" integerNumber++ = " + integerNumber++);
        System.out.println(" ++integerNumber = " + ++integerNumber);
        System.out.println(" floatingNumber++ = " + floatingPointNumber++);
        System.out.println(" ++floatingNumber = " + ++floatingPointNumber);

        // --
        // here your code

        System.out.println(" integerNumber-- = " + integerNumber--);
        System.out.println(" --integerNumber = " + --integerNumber);
        System.out.println(" floatingNumber-- = " + floatingPointNumber--);
        System.out.println(" --floatingNumber = " + --floatingPointNumber);

        // 2. Declare 2 boolean values and compare them inside the System.out.println()
        // e.g.: boolean a = true; boolean b = false; System.out.println(a | b); (should be true)
        // Try to predict the result of the expression before running the program
        // here your code

        boolean a = true;
        boolean b = false;
        System.out.println("a OR b = " + (a | b));
        System.out.println("a not equal b = " + (a != b));
        System.out.println("a equal b = " + (a == b));

        // 3. Try to understand accelerated computation of boolean expressions:
        // Instead of declaring the variables, let's call the methods directly:
        // e.g. System.out.println(getFirst() || getSecond());
        // perform it for different operations: ^ && || !. Try to change the order of calling these methods (like System.out.println(getSecond() || getFirst());

        System.out.println( "One of the Values getFirst and getSecond is true = " + (getFirst() || getSecond()));
        System.out.println( "Value getFirst will return true = " + (getFirst() || getFirst()));
        System.out.println( "Value getSecond will return true = " + (getSecond() || getSecond()));
        System.out.println( "Both values(getFirst and getSecond) is true = " + (getFirst() && getSecond()));
        System.out.println( "Value getFirst is true  = " + (getFirst() && getFirst()));
        System.out.println( "Value getSecond is true = " + (getSecond() && getSecond()));
        System.out.println( "Some value(getFirst and getSecond) is 1 = " + (getFirst() ^ getSecond()));
        System.out.println( "Reverse result of false = " + !(getFirst() && getSecond()));

        // 4. Convert the character to the short
        // perform bitwise operations with the short number you've just got with the following numbers: 0xFFFF, 0b00000001
        System.out.println("Converted character to the short" + (short)character);
        System.out.println("Integered to binary (short)character = " + Integer.toBinaryString((short)character));
        System.out.println("Integer to binary integer number = " + Integer.toBinaryString(integerNumber));

        // &

        System.out.println("0xFFFF & 0b00000001 = " + (0xFFFF & 0b00000001) );
        System.out.println("Integered to binary (0xFFFF & 0b00000001) = " + Integer.toBinaryString(0xFFFF & 0b00000001) );

        // ^

        System.out.println("0xFFFF ^ 0b00000001 = " + (0xFFFF ^ 0b00000001) );
        System.out.println("Integered to binary (0xFFFF ^ 0b00000001) = " + Integer.toBinaryString(0xFFFF ^ 0b00000001) );

        // |

        System.out.println("0xFFFF | 0b00000001 = " + (0xFFFF | 0b00000001) );
        System.out.println("Integered to binary (0xFFFF | 0b00000001) = " + Integer.toBinaryString(0xFFFF & 0b00000001) );

        // ~ (it doesn't require the second number)

        System.out.println("~0xFFFF = " + ~0xFFFF);
        System.out.println("Integered to binary ~0xFFFF = " + Integer.toBinaryString(~0xFFFF) );
        System.out.println("~0b00000001 = " + ~0b00000001);
        System.out.println("Integered to binary ~0b00000001 = " + Integer.toBinaryString(~0b00000001) );

        /*
        In order to convert and output your variable to binary format use the following expression (just replace YOUR_VARIABLE with what do you need)
        System.out.println(Integer.toBinaryString(YOUR_VARIABLE));
         */

        // 5. Try to shift your number left and right:
        // >>

        System.out.println("Swiped to the right integer number(>>) = " + integerNumber + " same as binary = " + Integer.toBinaryString(integerNumber) + " Result Binary = " + Integer.toBinaryString(integerNumber >> 1) + " Decimal = " + (integerNumber >> 1));

        // >>>

        //Yaroslav, if u read this, i dont understand why i have the same result beetwen (>>) and (>>>), i dont have any mistakes in it...

        System.out.println("Zero-fill right shift(>>>) = " + integerNumber + " same as binary = " + Integer.toBinaryString(integerNumber) + " Result Binary = " + Integer.toBinaryString(integerNumber >>> 1) + " Decimal = " + (integerNumber >>> 1));

        // <<

        System.out.println("Zero-fill left shift(<<) = " + integerNumber + " same as binary = " + Integer.toBinaryString(integerNumber) + " Result Binary = " + Integer.toBinaryString(integerNumber << 1) + " Decimal = " + (integerNumber << 1));

        // 6*. Try to get the 512 from the 1 without any multiplications, using any libraries or adding any numbers.

        int one = 0x01;
        System.out.println(one<<9 );

    }

    private static boolean getFirst() {
        //System.out.println("Get first called which always returns true");
        return true;
    }

    private static boolean getSecond() {
        //System.out.println("Get second called which always returns false");
        return false;
    }

}

