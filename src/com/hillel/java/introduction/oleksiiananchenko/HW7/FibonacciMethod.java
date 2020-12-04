package com.hillel.java.introduction.oleksiiananchenko.HW7;

public class FibonacciMethod {
    public static int printFibonacciNumbers(int upperBound) {
        int f[] = new int[upperBound + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= upperBound; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[upperBound];
    }
    public static void main (String args[])
    {
        int upperBound = 6;
        System.out.println(printFibonacciNumbers(upperBound));
    }
}
