package pavelkim.lesson7home;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

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

        // here your code, output the average, min, max values


        // ... your code...

        // don't modify this
        performSortingAndMeasureTime(array, HomeAssignment::bubbleSort, "Bubble"); // just for example
        performSortingAndMeasureTime(arrayCopy, HomeAssignment::mergeSort, "Merge");
        performSortingAndMeasureTime(arraySecondCopy, HomeAssignment::quickSort, "Quicksort");

        int[][] matrix = new int[8][6]; // you can change the size of the matrix for whatever you want
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }

        System.out.println("\n\n");
        System.out.println("The input matrix is:");
        printMatrix(matrix);

        System.out.println("Transposing the matrix...");
        transposeMatrix(matrix);

        System.out.println("The result is:");
        printMatrix(matrix);

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
        System.out.println("Average value : " + getAverageValue(array));
        System.out.println("Max value : " + getMaximumValue(array));
        System.out.println("Min value : " + getMinimumValue(array));
    }

    public static double getAverageValue(int[] array) {
        // here your code;
        int sum = 0;
        for (int j : array) {
            sum += j;
            System.out.println(sum);
        }
        return (double) sum / array.length;
    }

    public static int getMaximumValue(int[] array) {
        int max = array[0];
        for (int j : array) {
            if(max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int getMinimumValue(int[] array) {
        int min = array[0];
        for (int j : array) {
            if(min > j) {
                min = j;
            }
        }
        return min;
    }

    public static void mergeSort(int[] inputArray) {
        // here your code, implement the sorting of the array using the merge algorithm.

    }

    public static void quickSort(int[] inputArray) {
        int start = 0;
        int end = inputArray.length-1;
        quickSortEx(inputArray, start, end);
    }

    public static void quickSortEx(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;

        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        int pivot = array[mid];
        int i = start;
        int j = end;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j]>pivot) {
                j--;
            }
            if(i<=j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                    i++;
                j--;
            }

            if(start<j) {
                quickSortEx(array,start,j);
            }
            if(end>i) {
                quickSortEx(array,i,end);
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
        // here your code, transpose the input matrix.
        return null;
    }

    public static void printMatrix(int[][] matrix) {
        // show the matrix as the output, keep the rows and columns.
        // for example, if you have matrix 3 x 3 you should output something like:
        // | 1    2    12 |
        // | 10   8    7  |
        // | 7    3    4  |
        // so it should look like in the math.

        // here your code.
    }
}
