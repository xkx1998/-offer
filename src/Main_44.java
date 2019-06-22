public class Main_44 {
    public static String ReverseSentence(String str) {
        if(str==null||str.trim().equals(""))// trim掉多余空格
            return str;

        String[] strs = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence(" "));
    }
}
