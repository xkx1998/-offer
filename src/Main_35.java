import java.util.TreeSet;

public class Main_35 {
    public static int InversePairs(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        int count = 0;
        int min = Integer.MIN_VALUE;
        while (true) {
            int index = Min(min, array);
            System.out.println(index);
            count += index;
            min = array[index];
            if (index == 0)
                break;
        }
        return count;
    }

    public static int Min(int min, int[] array) {
        int result = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min && result > array[i]) {
                result = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 9, 5, 6, 7, 0};

        System.out.println(InversePairs(array));
    }
}
