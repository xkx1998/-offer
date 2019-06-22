import java.util.ArrayList;
import java.util.LinkedList;

public class Main_42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= sum) return list;
            for (int j = i; j < array.length; j++) {
                int sum2 = array[j] + array[i];
                if (sum2 == sum) {
                    list.add(array[i]);
                    list.add(array[j]);
                    return list;
                }
                if (sum2 > sum) break;
            }
        }
        return list;
    }
}
