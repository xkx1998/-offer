import java.util.LinkedList;

public class Main_33 {

    public int GetUglyNumber_Solution(int index) {
        LinkedList<Integer> list = new LinkedList<>();

        if (index == 0) return 0;
        list.add(1);
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        while (list.size() < index) {
            int num1 = list.get(i1) * 2; //2,3,5分别对应上一个最小的丑数
            int num2 = list.get(i2) * 3;
            int num3 = list.get(i3) * 5;
            int min = Math.min(num1, Math.min(num2, num3));
            list.add(min);
            if (min == num1) i1++;
            if (min == num2) i2++;
            if (min == num3) i3++;
        }
        return list.get(index - 1);
    }
}
