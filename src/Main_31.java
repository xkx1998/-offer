import java.util.Arrays;

public class Main_31 {
    public static int NumberOf1Between1AndN_Solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= n;i++) {
            String str = String.valueOf(i);
            sb.append(str);
        }
        char[] chs = sb.toString().toCharArray();
        Arrays.sort(chs);
        int num = 0;
        for (char c:chs) {
            if(c == '1')
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}
