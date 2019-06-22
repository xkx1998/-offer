import java.util.ArrayList;
import java.util.Arrays;

public class Main_29 {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>();

        if(k > input.length || input == null || k < 0) {
            return list;
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int [] input = {4,5,1,6,2,7,3,8};

        System.out.println(GetLeastNumbers_Solution(input,4));
    }
}
