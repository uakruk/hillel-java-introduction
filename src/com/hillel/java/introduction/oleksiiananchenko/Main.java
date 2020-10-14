package com.hillel.java.introduction.oleksiiananchenko;

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
        System.out.println("TASK 1");
        // +
        // here your code
        double addition = integerNumber + floatingPointNumber;
        System.out.println("Addition result = " +addition);
        // -
        // here your code
        double subtraction = integerNumber - floatingPointNumber;
        System.out.println("Subtraction result = " +subtraction);
        // *
        // here your code
        double multiplication = integerNumber * floatingPointNumber;
        System.out.println("Multiplication result = " +multiplication);

        // / (division)
        // here your code
        double division = integerNumber / floatingPointNumber;
        System.out.println("Division result = " +division);

        // %
        // here your code
        double modulo = integerNumber % floatingPointNumber;
        System.out.println("Modulo result = " +modulo);
        // ++
        // here your code
        int increment = ++integerNumber;
        System.out.println("Increment result = " +increment);

        // --
        // here your code
        int decrement = --integerNumber;
        System.out.println("Decrement result = " +decrement);

        // 2. Declare 2 boolean values and compare them inside the System.out.println()
        // e.g.: boolean a = true; boolean b = false; System.out.println(a | b); (should be true)
        // Try to predict the result of the expression before running the program
        // here your code
        System.out.println("TASK 2");
        boolean a = true;
        boolean b = false;
        System.out.println("When a|b = ");
        System.out.println(a|b);

        // 3. Try to understand accelerated computation of boolean expressions:
        // Instead of declaring the variables, let's call the methods directly:
        // e.g. System.out.println(getFirst() || getSecond());
        // perform it for different operations: ^ && || !. Try to change the order of calling these methods (like System.out.println(getSecond() || getFirst());
        System.out.println("TASK 3");
        System.out.println("When || :");
        System.out.println(getFirst() || getSecond());
        System.out.println(getSecond() || getFirst());
        System.out.println("When ^ :");
        System.out.println(getFirst() ^ getSecond());
        System.out.println(getSecond() ^ getFirst());
        System.out.println("When && :");
        System.out.println(getFirst() && getSecond());
        System.out.println(getSecond() && getFirst());
        System.out.println("When ! :");
        System.out.println(!(getFirst() && getSecond()));
        System.out.println(!(getSecond() && getFirst()));



        // 4. Convert the character to the short
        // perform bitwise operations with the short number you've just got with the following numbers: 0xFFFF, 0b00000001
        System.out.println("TASK 4");
        short shchar = (short)character;
        System.out.println(shchar);

        int intOne = 0xFFFF;
        int intTwo = 0b00000001;

        // &
        System.out.println("Char AND 1st number =" + (shchar & intOne));
        System.out.println("Char AND 2st number =" + (shchar & intTwo));
        int andOne = shchar & intOne;
        int andTwo = shchar & intTwo;
        System.out.println(Integer.toBinaryString(andOne));
        System.out.println(Integer.toBinaryString(andTwo));

        // ^
        System.out.println("Char XOR 1st number =" + (shchar ^ intOne));
        System.out.println("Char XOR 2st number =" + (shchar ^ intTwo));
        int xorOne = shchar ^ intOne;
        int xorTwo = shchar ^ intTwo;
        System.out.println(Integer.toBinaryString(xorOne));
        System.out.println(Integer.toBinaryString(xorTwo));

        // |
        System.out.println("Char OR 1st number =" + (shchar | intOne));
        System.out.println("Char OR 2st number =" + (shchar | intTwo));
        int orOne = shchar | intOne;
        int orTwo = shchar | intTwo;
        System.out.println(Integer.toBinaryString(orOne));
        System.out.println(Integer.toBinaryString(orTwo));

        // ~ (it doesn't require the second number)
        System.out.println(" NOT 1st number =" + ~(shchar));
        int notshchar = ~(shchar);
        System.out.println(Integer.toBinaryString(notshchar));

        /*
        In order to convert and output your variable to binary format use the following expression (just replace YOUR_VARIABLE with what do you need)
        System.out.println(Integer.toBinaryString(YOUR_VARIABLE));
         */

        // 5. Try to shift your number left and right:
        System.out.println("TASK 5");

        // >>
        int i = shchar >> 2 ;

        System.out.println(Integer.toBinaryString(i));
        // >>>
        int o = shchar >>> 2;
        System.out.println(Integer.toBinaryString(o));
        // <<
        int p = shchar << 2;
        System.out.println(Integer.toBinaryString(p));

        // 6*. Try to get the 512 from the 1 without any multiplications, using any libraries or adding any numbers.
        System.out.println("TASK 6");
        int one = 0x01 << 9;

        System.out.println(Integer.toBinaryString(one));

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
