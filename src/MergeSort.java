import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {1, 0, 4, 5, 7, 8, 5, 1, 4, 2, 1, 4, 5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums, 0, nums.length - 1, temp);
    }


    public static void sort(int[] nums, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(nums, left, mid, temp);
            sort(nums, mid + 1, right, temp);
            merge(nums, left, mid, right, temp);
        }
    }


    public static void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[t++] = nums[i++];
            } else {
                temp[t++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[t++] = nums[i++];
        }

        while (j <= right) {
            temp[t++] = nums[j++];
        }

        t = 0;
        while (left <= right) {
            nums[left++] = temp[t++];
        }
    }
}
