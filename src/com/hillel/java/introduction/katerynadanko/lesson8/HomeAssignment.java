package com.hillel.java.introduction.katerynadanko.lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the desired array length: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        System.out.printf("Filling the array of length %d with random numbers\n", arrayLength);
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(array));

        // saving the original array for the next sorting algorithm
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        int[] arraySecondCopy = Arrays.copyOf(array, array.length);

        int sum = 0;
        int average;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("Average of numbers in array in main method is: " + average);
        System.out.print("Average of numbers in array in method \"getAverageValue\" is: ");
        System.out.println(getAverageValue(array));


        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value of array in main method is: " + max);
        System.out.print("Maximum value of array in method \"getMaximumValue\" is: ");
        System.out.println(getMaximumValue(array));

        int min = array[0];
        for (int i = 0; i < arrayCopy.length; i++) {
            if (array[i] < min) {
                min = arrayCopy[i];
            }
        }
        System.out.println("Minimum value of array in main method is: " + min);
        System.out.print("Maximum value of array in method \"getMinimumValue\" is: ");
        System.out.println(getMinimumValue(array));

        // here your code, output the  average, min, max values
        // ... your code...
        // don't modify this
        performSortingAndMeasureTime(array, HomeAssignment::bubbleSort, "Bubble"); // just for example
        performSortingAndMeasureTime(arrayCopy, HomeAssignment::mergeSort, "Merge");
        performSortingAndMeasureTime(arraySecondCopy, HomeAssignment::quickSort, "Quicksort");

        int[][] matrix = new int[6][9]; // you can change the size of the matrix for whatever you want
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }

        System.out.println("\n\n");
        System.out.println("The input matrix is: ");
        printMatrix(matrix);

        System.out.println("Transposing the matrix...");
        transposeMatrix(matrix);

        System.out.println("The result is:");
        printMatrix(transposeMatrix(matrix));

    }

    // DO NOT MODIFY THIS METHOD
    public static void performSortingAndMeasureTime(int[] array, Consumer<int[]> sortFunction, String sortType) {

        System.out.println("Starting " + sortType + " sort...");
        long startedSorting = System.nanoTime();
        sortFunction.accept(array);
        long endSorting = System.nanoTime();

        long duration = endSorting - startedSorting;

        long secondsTook = TimeUnit.NANOSECONDS.toSeconds(duration);
        long secondsInNanos = TimeUnit.SECONDS.toNanos(secondsTook);

        long millisTook = TimeUnit.NANOSECONDS.toMillis(duration - secondsInNanos);
        long millisInNanos = TimeUnit.MILLISECONDS.toNanos(millisTook);

        long microsTook = TimeUnit.NANOSECONDS.toMicros(duration - secondsInNanos - millisInNanos);
        long microsInNanos = TimeUnit.MICROSECONDS.toNanos(microsTook);

        long nanosTook = duration - secondsInNanos - millisInNanos - microsInNanos;
        System.out.printf("%s sort has finished. It took %d seconds %d millis %d micros and %d nanos\n", sortType, secondsTook, millisTook, microsTook, nanosTook);
        System.out.println("The results are:");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static double getAverageValue(int[] array) {
        // here your code;
        int sum = 0;
        double average;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;

        return average;
    }

    public static int getMaximumValue(int[] array) {
        // here your code;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMinimumValue(int[] array) {
        // here your code;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    public static int[] mergeSort(int[] inputArray) {

        int[] temp;
        int[] currentArray = inputArray;
        int[] outputArray = new int[inputArray.length];

        int size = 1;
        while (size < inputArray.length) {
            for (int i = 0; i < inputArray.length; i += size * 2) {
                merge(currentArray, i, currentArray, i + size, outputArray, i, size);
            }

            temp = currentArray;
            currentArray = outputArray;
            outputArray = temp;

            size = size * 2;

        }
        return outputArray;

    }
        // here your code, implement the sorting of the array using the merge algorithm.


        public static void divideForMergeSort ( int[] inputArray){

            int leftIndex = 0;
            int middle = inputArray.length/2;
            int rightIndex = inputArray.length;

            if (rightIndex < 2)
                return;


            int leftPart = middle - leftIndex + 1;
            int rightPart = rightIndex - middle;

            int firstPart[] = new int[leftPart];
            int secondPart[] = new int[rightPart];

            for (int i = 0; i < leftPart; i++) {
                firstPart[i] = inputArray[leftIndex + i];
                for (int j = 0; j < rightPart; j++) {
                    secondPart[i] = inputArray[middle + 1 + i];
                }
            }
            int i = 0;
            int j = 0;
            int k = leftIndex;
            while (i < leftPart && j < rightPart) {
                if (firstPart[i] <= secondPart[j]) {
                    inputArray[k] = firstPart[i];
                    i++;
                } else {
                    if (secondPart[j] <= firstPart[i]) {
                        inputArray[k] = secondPart[j];
                        j++;
                    }
                }
            }
            if (i < leftPart) {
                inputArray[k] = firstPart[i];
                i++;
                k++;
            } else {
                inputArray[k] = secondPart[j];
                j++;
                k++;
            }
        }

        public static void merge ( int[] input1, int startIndexInput1, int[] input2, int startIndexInput2, int[] output,
                                   int startIndexOutput, int size){


           int index1 = startIndexInput1;
           int index2 = startIndexInput2;

           int inputEnd1 = Math.min(startIndexInput1 + size, input1.length);
           int inputEnd2 = Math.min(startIndexInput2 + size, input2.length);

           int iterationCount = inputEnd1 - startIndexInput1 + inputEnd2 - startIndexInput2;
           for (int i = startIndexOutput; i< startIndexOutput+iterationCount; i++){
               if (index1<inputEnd1 && (index2>=inputEnd2 || input1[index1] < input2[index2])){
                   output[i] = input1[index1];
                   i++;
               }
               else {
                   output[i] = input2[index2];
                   i++;
               }
           }
        }


    public static void quickSort(int[] inputArray) {
        // here your code, implement the sorting of the array using the quicksort algorithm.

        int l = 0;
        int r = inputArray.length;
        int m = inputArray.length/2;

        if(inputArray.length == 0){
            return;
        }
        for (int i = 0; i<m; i++){
            if (inputArray[i]<inputArray[m]){
                inputArray[l] = inputArray[i];
            }
        }

    }

    public static void bubbleSort(int[] array) {
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

    public static int[][] transposeMatrix(int[][] matrix) {
        int [][] transposeMatrix = new int [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < (matrix[i].length); j++){

                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        // here your code, transpose the input matrix.

        return transposeMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        // show the matrix as the output, keep the rows and columns.
        // for example, if you have matrix 3 x 3 you should output something like:
        // | 1    2    12 |
        // | 10   8    7  |
        // | 7    3    4  |
        // so it should look like in the math.

        // here your code.
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {

            String format = ("| ");
            for (int j = 0; j < column - 1; j++) {
                format += ("%d  \t  ");
            }
            format += ("%d |");

                System.out.println(String.format(format, getCopyOf(matrix[i])));

        }
    }
    public static Integer[] getCopyOf(int[] array){
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
        result[i] = array[i];
        }
        return result;
        }
    }

