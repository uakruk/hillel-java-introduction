package com.hillel.java.introduction;

import java.util.Scanner;

import static com.hillel.java.introduction.lesson12.model.PrivatBank.numberOfClients;
import static com.hillel.java.introduction.lesson12.model.PrivatBank.sayBank;

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

        // -
        // here your code

        // *
        // here your code

        // / (division)
        // here your code

        // %
        // here your code

        // ++
        // here your code

        // --
        // here your code


        // 2. Declare 2 boolean values and compare them inside the System.out.println()
        // e.g.: boolean a = true; boolean b = false; System.out.println(a | b); (should be true)
        // Try to predict the result of the expression before running the program
        // here your code

        // 3. Try to understand accelerated computation of boolean expressions:
        // Instead of declaring the variables, let's call the methods directly:
        // e.g. System.out.println(getFirst() || getSecond());
        // perform it for different operations: ^ && || !. Try to change the order of calling these methods (like System.out.println(getSecond() || getFirst());


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

        // 5. Try to shift your number left and right:
        // >>
        // >>>
        // <<

        // 6*. Try to get the 512 from the 1 without any multiplications, using any libraries or adding any numbers.

        int one = 0x01;

        System.out.println(one /* here your operation with the one*/);

        sayBank();
        numberOfClients = 1;
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
