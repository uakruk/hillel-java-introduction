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
}
