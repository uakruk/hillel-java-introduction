package pavelkim.lesson7home;

import java.util.Arrays;
import java.util.Random;

public class ArraysLesson {

    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        System.out.println(array);

        System.out.println(Arrays.toString(array));

        int[] otherArray = new int[20];

        int[] oneMoreArray = Arrays.copyOfRange(array, 1, 7);

        System.arraycopy(array, 1, otherArray, 5, 5);

        System.out.println(Arrays.toString(otherArray));

        System.out.println(Arrays.toString(oneMoreArray));

//        int[] arr = new int[0];
//
//        System.out.println("Print elements:");
//        printElements(arr);



//    //    int[][] otherArray = new int[][] {{1, 2, 3}, {4, 5}, {6}};
//
//        for (int i = 0; i < array.length; i++) {
//            int[] otherArray = new int[i+1];
//            array[i] = otherArray;
//
//          //  array[i] = new int[i];
//            for (int j = 0; j < array[i].length; j++) {
//            //    array[i][j] = j;
//
//                otherArray[j] = j;
//            }
//        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Line " + i + " for array.length = " + array[i].length);
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
    }
}
