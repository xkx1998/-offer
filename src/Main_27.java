import java.util.*;


/**
 * 全排列算法
 * method_1: 递归实现
 */
public class Main_27 {
    TreeSet<String> set = new TreeSet<>();
    ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        Permutation2(0, str.toCharArray());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            list.add((String) it.next());
        }
        return list;
    }

    public Set<String> Permutation2(int start, char[] chs) {
        if (start == chs.length - 1) {
            set.add(new String(chs));
        } else {
            for (int i = start; i < chs.length; i++) {
                //开头后面的每个数和开头交换位置
                Swap(chs, start, i);
                //确定开头后,继续确认下一个数
                Permutation2(start + 1, chs);
                //还原位置，回溯
                Swap(chs, start, i);
            }
        }
        return set;
    }

    public void Swap(char[] chs, int i, int j) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }

}
