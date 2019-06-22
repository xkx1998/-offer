public class Main_49 {
    public static int StrToInt(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        char[] chs = str.toCharArray();
        boolean flag = false;
        for (int i = 0; i < chs.length; i++) {
            if ((chs[i] == '+' || chs[i] == '-') && i == 0)
                continue;
            if (!Character.isDigit(chs[i])) {
                return 0;
            }
            flag = true;
        }
        if (!flag) return 0;
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("+"));
    }
}
