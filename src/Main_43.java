public class Main_43 {
    public static String LeftRotateString(String str, int n) {
        if (str == null) return "";
        if (n > str.length()) return "";
        return str.substring(n) + str.substring(0, n);
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcXYZdef", 3));
    }
}
