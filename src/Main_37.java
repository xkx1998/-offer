import java.util.LinkedHashMap;

public class Main_37 {

    public int GetNumberOfK(int[] array, int k) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(k, 0);
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]) {
                map.put(k, map.get(k) + 1);
            }
        }
        return map.get(k);
    }


}
