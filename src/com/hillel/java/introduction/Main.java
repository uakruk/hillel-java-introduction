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

        int a1 = 34;
        float b1 = 1.5f;

        System.out.println(a1 +b1);// +
        // here your code
        float b2 = 95.105f;
        double c1 = 4.678 + b2;
        double c2 = 5.565 - b2;
        if (c1 == c2) System.out.println( "c1 равно c2" );
        else  System.out.println("c1  не равно c2" );

        // -
        // here your code

        long d1 = 99999999l;
        long d2= 10000000l;
        System.out.println (d1*d2);
        // *
        // here your code

        int a2 = 54;
        int a3 = 9;
        System.out.println(a2/a3);
        System.out.println (d1/a1);// / (division)
        // here your code

        short e1 = 30;
        short e2 = 15;
        System.out.println(e1%e2);// %
        // here your code

        int a4 = 50;
        int a5 = 30;
        System.out.println(++a4 - ++a5 );// ++
        // here your code

        float b4 = 34.56f;
        int a6 = 5;
        float b5 = --a6 *b4;
        System.out.println(b5);// --
        // here your code


        // 2. Declare 2 boolean values and compare them inside the System.out.println()
        // e.g.: boolean a = true; boolean b = false; System.out.println(a | b); (should be true)
        // Try to predict the result of the expression before running the program
        boolean a = true;
        boolean b = false;
        if (a) System.out.println("Right!");
        else
         System.out.println ("Don't Right!");
        // here your code

        // 3. Try to understand accelerated computation of boolean expressions:
        // Instead of declaring the variables, let's call the methods directly:
        boolean getFirst = true;
        boolean getSecond = false;
        char x1 = 'A';
        char x2 = 'B';
        System.out.println("Choose A or B!");

        char w = (scanner.nextLine()).charAt(0);
        if (w == x1)
            System.out.println(getFirst);
        else
            System.out.println(getSecond);

        // e.g. System.out.println(getFirst() || getSecond());
        // perform it for different operations: ^ && || !. Try to change the order of calling these methods (like System.out.println(getSecond() || getFirst());


        // 4. Convert the character to the short
        // perform bitwise operations with the short number you've just got with the following numbers: 0xFFFF, 0b00000001
        // &
        // ^
        // |
        // ~ (it doesn't require the second number)

        int g1 = 212;
         System.out.println(Integer.toBinaryString(g1));/*
        In order to convert and output your variable to binary format use the following expression (just replace YOUR_VARIABLE with what do you need)
        System.out.println(Integer.toBinaryString(YOUR_VARIABLE));
         */

        // 5. Try to shift your number left and right:

        int number = 212, result;

        System.out.println(number << 1);
        System.out.println(number << 0);
        System.out.println(number << 4);
        // >>>
        // <<

        // 6*. Try to get the 512 from the 1 without any multiplications, using any libraries or adding any numbers.

        int one = 0x01;

        System.out.println(one * 512);

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
