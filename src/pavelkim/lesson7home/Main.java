package pavelkim.lesson7home;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        HomeWork7 homeWork7 = new HomeWork7();

        int [] array = new int[] {21, 33, 12, 23, 22, 44, 11};
        System.out.println(homeWork7.averageWithin(array));

        System.out.println(homeWork7.maxArrayValue(array));

        System.out.println(homeWork7.minArrayValue(array));

        System.out.println(Arrays.toString(homeWork7.quickSortRec(array)));
    }
}
