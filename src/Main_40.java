import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main_40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        Set<Integer> set = map.keySet();
        Iterator it = set.iterator();
        int[] num = new int[2];
        int index = 0;
        while (it.hasNext()) {
            int i = (int) it.next();
            if (map.get(i) == 1) {
                num[index++] = i;
            }
        }

        num1[0] = num[0];
        num2[0] = num[1];
    }
}
