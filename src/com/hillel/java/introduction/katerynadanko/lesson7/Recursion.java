package com.hillel.java.introduction.katerynadanko.lesson7;

public class Recursion {

    public static long fibonacci(long number) {
        if (number <= 1) {
            return number;
        }
            return fibonacci(number-1) + fibonacci(number-2);
        }

    public static void printFibonacciNumbers(int upperBound, long number) {
        if ( number <= upperBound){
            System.out.println (fibonacci(number));
        } else {
            System.out.println("False number");
        }
        }


    public static void main(String[] args) {
        System.out.println(fibonacci(4));
        printFibonacciNumbers(9,7);
        printFibonacciNumbers(6,8);
    }


}
