import java.util.LinkedList;
import java.util.List;

public class Main_46 {
    public static int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0) return -1;
        List<Integer> list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int c = m;
        while (list.size() > 1) {
            int num = list.size();
            if (num >= c) {
                list.remove(c - 1);
                c +=  m - 1;
            }

            num = list.size();
            if(num < c) {
                c = c - num;
            }
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5, 3));
    }
}
