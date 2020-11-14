package pavelkim.lesson7home;

public class HomeWork7 {

    public double averageWithin(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
            System.out.println(sum);
        }
        return (double) sum / array.length;
    }

    public int maxArrayValue(int [] array) {
        int max = array[0];
        for (int j : array) {
            if(max < j) {
                max = j;
            }
        }
        return max;
    }

    public int minArrayValue(int [] array) {
        int min = array[0];
        for (int j : array) {
            if(min > j) {
                min = j;
            }
        }
        return min;
    }

//    public int[] merge(int[] array1, int[] array2) {
//
//        while ()
//
//    }

    public int[] quickSort(int[] array, int left, int right) {

        int pivot = array[0];

        while(left < right) {
            while (array[right] >=pivot && left < right) {
                right--;
            }
            while (array[left] <= pivot && left < right) {
                left++;
            }
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            int leftHold = left;
            int rightHold = right;

            quickSort(array, leftHold, rightHold);
        }
        return array;
    }

    public int[] quickSortRec(int[] array) {
        quickSort(array, 0, array.length-1);

        return array;
    }

}
