import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void sort(int[] nums) {
        int len = nums.length;
        int temp;

        while(len != 0)
        {
            len /= 2;
            for(int i = 0; i < len;i++)
            {
                for(int j = i+len;j < nums.length;j=j+len)
                {
                    temp = nums[j];
                    int k = j - len;
                    while(k >=0 && nums[k] > temp)
                    {
                        nums[k+len] = nums[k];
                        k = k - len;
                    }
                    nums[k+len] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 4, 2, 1, 4, 7, 8, 5};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
