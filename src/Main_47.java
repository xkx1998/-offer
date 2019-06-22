import com.sun.org.apache.xpath.internal.functions.FuncSum;

public class Main_47 {
    public static int Sum_Solution(int n) {
        return Math.multiplyExact(1 + n, n) >> 1;

    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(4));
    }
}
