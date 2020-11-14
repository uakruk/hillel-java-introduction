package pavelkim.lesson7;

import java.util.Arrays;

public class ArrayLesson {
    public static void main(String [] args) {
        int[][] array = new int[10][];

        for(int i = 0; i < array.length; i++) {
//            array[i] = new int[i];
            int[] otherArray = new int[i+1];
            array[i] = otherArray;

            for(int j =0; j < array[i].length; j++) {
                array[i][j] = 10;
            }
        }

        for (int i=0; i<array.length; i++) {
            for(int j =0; j< args.length; j++) {
                System.out.println(array[i][j]);
            }
        }
        Arrays.toString(array);
    }


}
