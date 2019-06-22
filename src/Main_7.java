public class Main_7 {
    public static int Fibonacci(int n) {
        int[] nums = new int[n+1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        nums[0]=0;
        nums[1]=1;
        for(int i = 2;i <= n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(2));
    }
}
