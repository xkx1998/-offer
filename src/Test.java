import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    ArrayList<String> list = new ArrayList<>();
    TreeSet<String> treeSet = new TreeSet<>();

    public ArrayList<String> Permutation(String str) {
        Permutation2(str.toCharArray(),0);
        Iterator it = treeSet.iterator();
        while(it.hasNext()) {
            list.add((String) it.next());
        }
        return list;
    }

    public Set<String> Permutation2(char[] chs, int start) {
        if (start == chs.length - 1) {
            treeSet.add(new String(chs));
        }

        for (int i = start; i < chs.length; i++) {
            Swap(chs, start, i);
            Permutation2(chs, start + 1);
            Swap(chs, start, i);
        }
        return treeSet;
    }

    public void Swap(char[] chs, int i, int j) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }
}
