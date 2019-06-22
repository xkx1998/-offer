import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main_54 {

    StringBuilder sb = new StringBuilder();
    char[] chs = new char[1000];

    //Insert one char from stringstream
    public void Insert(char ch) {
        ++chs[ch];
        sb.append(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char[] chs2 = sb.toString().toCharArray();
        for (int i = 0; i < chs2.length; i++) {
            if (chs[chs2[i]] == 1) return chs2[i];
        }
        return '#';
    }

}
