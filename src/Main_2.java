/**
 * 替换空格
 */

public class Main_2 {

    public static String replaceSpace(StringBuffer str) {
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == ' ') {
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
}
