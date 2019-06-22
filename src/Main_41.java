import java.util.ArrayList;

public class Main_41 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        int sum2 = 0;
        for (int i = 1; i <= sum - 1; i++) {
            sum2 = 0;
            tempList.clear();
            for (int j = i; j <= sum - 1; j++) {
                sum2 += j;
                tempList.add(j);
                if (sum2 < sum) {
                    continue;
                }
                if (sum2 == sum) {
                    list.add(new ArrayList<>(tempList));
                }
                break;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(100));
    }
}
