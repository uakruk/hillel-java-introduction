package com.hillel.java.introduction.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;

        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();

        arr = new int[arrayLength];

        System.out.println("Enter numbers:");

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(arr));
    }



    public static void sort(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < arrayLength - 1; j++) {
                int first = array[j];
                int second = array[j+1];

                if (first > second) {
                    array[j] = second;
                    array[j+1] = first;
                }
            }
            arrayLength--;
        }
    }
}
