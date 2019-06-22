import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main_64 {
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (size > num.length || size <= 0) return result;
        int n = num.length - size + 1;
        int index = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            int temp = index;
            for (int j = 0; j < size; j++) {
                list.add(num[temp++]);
            }
            index++;
            Collections.sort(list);
            result.add(list.get(list.size() - 1));
            list.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 2, 6, 2, 5, 1};
        System.out.println(maxInWindows(num, 3));
    }


}
