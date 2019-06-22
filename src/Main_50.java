import java.util.HashMap;
import java.util.Map;

public class Main_50 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0) {
            duplication[0] = -1;
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numbers) {
            if (map.containsKey(i)) {
                duplication[0] = i;
                return true;
            } else {
                map.put(i, 1);
            }
        }
        duplication[0] = -1;
        return false;
    }
}
