package com.hillel.java.introduction.katerynadanko.lesson1;

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
        // Try to understand which result you're expecting before running the program (because of
        // different data types)
        // Do System.out.println() of the results.
        // Play around the assignment shortcuts (like integerNumber += 100;)

        // +
        // here your code
        double res1 = integerNumber+floatingPointNumber;
        double res111= INTEREST_RATE+floatingPointNumber;
        double res2 = floatingPointNumber+character;
        double res222 = INTEREST_RATE+integerNumber;
        int res3 = integerNumber+character;
        System.out.println(res1);
        System.out.println(res111);
        System.out.println(res2);
        System.out.println(res3);

        // -
        // here your code
        double res4 = integerNumber-floatingPointNumber;
        double res5 = floatingPointNumber-character;
        int res6 = integerNumber-character;
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        // *
        // here your code
        double res7 = integerNumber*floatingPointNumber;
        double res8 = floatingPointNumber*character;
        int res9 = integerNumber*character;
        System.out.println(res7);
        System.out.println(res8);
        System.out.println(res9);
        // / (division)
        // here your code
        double res10 = integerNumber/floatingPointNumber;
        double res110 = floatingPointNumber/integerNumber;
        double res120 = character/floatingPointNumber;
        double res11 = floatingPointNumber/character;
        double res12 = integerNumber/character;
        double res130 = character/integerNumber;
        System.out.println(res10);
        System.out.println(res110);
        System.out.println(res120);
        System.out.println(res11);
        System.out.println(res12);
        System.out.println(res130);
        // %
        // here your code
        double res13 = integerNumber%floatingPointNumber;
        double res113 = floatingPointNumber%integerNumber;
        double res14 = floatingPointNumber%character;
        double res114 = character%floatingPointNumber;
        int res15 = integerNumber%character;
        int res115 = character%integerNumber;
        System.out.println(res13);
        System.out.println(res113);
        System.out.println(res14);
        System.out.println(res114);
        System.out.println(res15);
        System.out.println(res115);
        // ++
        // here your code
        double res16 = floatingPointNumber++;
        double res17 = ++floatingPointNumber;
        double res18 = floatingPointNumber*=8;
        double res19 = floatingPointNumber/=4;

        int res20 = integerNumber++;
        int res21 = ++integerNumber;
        int res22 = integerNumber*=3;
        double res23 = integerNumber/=5;

        int res24 = character++;
        int res25 = ++character;
        int res26 = character*=3;
        double res27 = character/=2;

        System.out.println(res16);
        System.out.println(res17);
        System.out.println(res18);
        System.out.println(res19);
        System.out.println(res20);
        System.out.println(res21);
        System.out.println(res22);
        System.out.println(res23);
        System.out.println(res24);
        System.out.println(res25);
        System.out.println(res26);
        System.out.println(res27);

        // --
        // here your code
        int res28 = integerNumber--;
        int res29 = --integerNumber;

        double res30 = floatingPointNumber--;
        double res31= --floatingPointNumber;

        double res33 = character--;
        double res34 = --character;

        // 2. Declare 2 boolean values and compare them inside the System.out.println()
        // e.g.: boolean a = true; boolean b = false; System.out.println(a | b); (should be true)
        // Try to predict the result of the expression before running the program
        // here your code

        boolean a = true;
        boolean b = false;

        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a ^ b);



        // 3. Try to understand accelerated computation of boolean expressions:
        // Instead of declaring the variables, let's call the methods directly:
        // e.g. System.out.println(getFirst() || getSecond());
        // perform it for different operations: ^ && || !. Try to change the order of calling
        // these methods (like System.out.println(getSecond() || getFirst());

        System.out.println(getFirst() || getSecond());
        System.out.println(getFirst() ^ getSecond());
        System.out.println(getFirst() && getSecond());
        System.out.println(getFirst() != getSecond());
        System.out.println(getFirst() == getSecond());

        // 4. Convert the character to the short
        // perform bitwise operations with the short number you've just got with the following
        // numbers: 0xFFFF, 0b00000001
        // &
        // ^
        // |
        // ~ (it doesn't require the second number)
        char number = 0xFFFF;
        char number2 = 0b00000001;
        System.out.println((short)character & number);
        System.out.println(number & number2);
        System.out.println(number | number2);
        System.out.println((short)character ^ number2);
        System.out.println((short)character | number);
        System.out.println(~ number);
        /*
        In order to convert and output your variable to binary format use the following expression (
        just replace YOUR_VARIABLE with what do you need)
        System.out.println(Integer.toBinaryString(YOUR_VARIABLE));
         */

        int number3 = 3498;
        System.out.println(Integer.toBinaryString(number3));

        // 5. Try to shift your number left and right:
        // >>
        // >>>
        // <<

        System.out.println(87>>4);
        System.out.println(-30847>>>2);
        System.out.println(3408<<5);


        // 6*. Try to get the 512 from the 1 without any multiplications, using any libraries or
        // adding any numbers.

        int one = 0x01;

        System.out.println(one<<9);
        //System.out.println(one + 511);
        /* here your operation with the one*/

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