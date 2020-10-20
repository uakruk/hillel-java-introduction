    package com.hillel.java.introduction.dimabohdanovych;

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

        System.out.println("int + float = " + (integerNumber + floatingPointNumber));
        System.out.println("float + int = " + (floatingPointNumber + integerNumber));

        // -
        // here your code
        System.out.println("int - float = " + (integerNumber - floatingPointNumber));
        System.out.println("float - int = " + (floatingPointNumber - integerNumber));

        // *
        // here your code
        System.out.println("int * float = " + (integerNumber * floatingPointNumber));
        System.out.println("float * int = " + (floatingPointNumber * integerNumber));

        // / (division)
        // here your code
        System.out.println("int / float = " + (integerNumber / floatingPointNumber));
        System.out.println("float / int = " + (floatingPointNumber / integerNumber));

        // %
        // here your code
        System.out.println("int % float = " + (integerNumber % floatingPointNumber));
        System.out.println("float % int = " + (floatingPointNumber % integerNumber));
        // ++
        // here your code
        System.out.println("int++ = " + (++integerNumber));
        System.out.println("float++ = " + (++floatingPointNumber));
        // --
        // here your code
        System.out.println("int-- = " + (--integerNumber));
        System.out.println("float-- = " + (--floatingPointNumber));

        // 2. Declare 2 boolean values and compare them inside the System.out.println()
        // e.g.: boolean a = true; boolean b = false; System.out.println(a | b); (should be true)
        // Try to predict the result of the expression before running the program
        // here your code
        boolean a = true;
        boolean b = false;
        System.out.println("a OR b = " + (a | b));
        System.out.println("a not equal b = " + (a != b));
        System.out.println("a equal b = " + (a == b));
        System.out.println("a AND b = " + (a && b));
        // 3. Try to understand accelerated computation of boolean expressions:
        // Instead of declaring the variables, let's call the methods directly:
        // e.g. System.out.println(getFirst() || getSecond());
        // perform it for different operations: ^ && || !. Try to change the order of calling these methods (like System.out.println(getSecond() || getFirst());
        System.out.println(getFirst() && getSecond());
        System.out.println(getFirst() || getSecond());
        System.out.println(getFirst() == getSecond());
        System.out.println(getSecond() && getFirst());
        System.out.println(getSecond() || getFirst());
        System.out.println(getSecond() == getFirst());

        // 4. Convert the character to the short
        // perform bitwise operations with the short number you've just got with the following numbers: 0xFFFF, 0b00000001
        // &
        // ^
        // |
        // ~ (it doesn't require the second number)
        char c = 'K';
        short d = (short) c;
        System.out.println(d);
        int intOne = 0xFFFF;
        int intTwo = 0b00000001;
        System.out.println(intOne);
        System.out.println(intTwo);

        int binary1 = d & intOne;
        int binary2  = d & intTwo;
        System.out.println("Code1: " + (d & intOne));
        System.out.println("Code2: " + (d & intTwo));
        System.out.println(Integer.toBinaryString(binary1));
        System.out.println(Integer.toBinaryString(binary2));

        int binary3 = d ^ intOne;
        int binary4  = d ^ intTwo;
        System.out.println("Code3: " + (d ^ intOne));
        System.out.println("Code4: " + (d ^ intTwo));
        System.out.println(Integer.toBinaryString(binary3));
        System.out.println(Integer.toBinaryString(binary4));

        int binary5 = d | intOne;
        int binary6  = d | intTwo;
        System.out.println("Code5: " + (d | intOne));
        System.out.println("Code6: " + (d | intTwo));
        System.out.println(Integer.toBinaryString(binary5));
        System.out.println(Integer.toBinaryString(binary6));

        System.out.println(" Inverter: " + ~(d));
        int binary7 = ~(d);
        System.out.println(Integer.toBinaryString(binary7));

        /*
        In order to convert and output your variable to binary format use the following expression (just replace YOUR_VARIABLE with what do you need)
        System.out.println(Integer.toBinaryString(YOUR_VARIABLE));
         */

        // 5. Try to shift your number left and right:
        // >>
        // >>>
        // <<


        int newBinary1 = 10;
        System.out.println(newBinary1);

        newBinary1 = (int) (newBinary1<<2);
        System.out.println(newBinary1);

        byte newBinaryByte = 5;
        System.out.println(newBinaryByte);

        newBinaryByte = (byte)(newBinaryByte>>1);
        System.out.println(newBinaryByte);
        // 6*. Try to get the 512 from the 1 without any multiplications, using any libraries or adding any numbers.

        int one = 0x01;

        System.out.println(one /* here your operation with the one*/);

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
