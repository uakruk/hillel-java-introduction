package com.hillel.java.introduction.lesson11;

public class Math {

    public static Factorial getFactorial() {
        return new Factorial();
    }

    private static class Factorial {

        public Factorial() {
            System.out.println("Created factorial");
        }

        public long calculate(int number) {
            return 0;
        }

        public String toString() {
            return "I'm factorial";
        }
    }
}
