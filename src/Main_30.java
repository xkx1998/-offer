public class Main_30 {

    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        if (array.length == 1) return array[0];
        int sum;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (max < sum) max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {2, 2};
        System.out.println(FindGreatestSumOfSubArray(array));
    }
}
