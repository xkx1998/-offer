import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main_34 {
    public static int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (!map.containsKey(chs[i])) {
                map.put(chs[i], 1);
            } else {
                map.put(chs[i], map.get(chs[i]) + 1);
            }
        }

        Set<Character> set = map.keySet();
        Iterator it = set.iterator();
        char c = ' ';
        while (it.hasNext()) {
            c = (char) it.next();
            if (map.get(c) == 1) {
                break;
            }
        }

        for (int i = 0; i < chs.length; i++) {
            if (c == chs[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("googgle"));
    }
}
