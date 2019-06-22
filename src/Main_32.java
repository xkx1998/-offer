import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main_32 {
     TreeSet<String> set = new TreeSet<>();

    public  String PrintMinNumber(int[] numbers) {

        if(numbers.length == 0 || numbers == null) return "";
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }

        Fun(strs, 0);
        Iterator it = set.iterator();
        return (String) it.next();
    }

    public  Set<String> Fun(String[] strs, int start) {
        if (start == strs.length - 1) {
            String s = "";
            for (String str : strs) {
                s += str;
            }
            set.add(s);
        } else {
            for (int i = start; i < strs.length; i++) {
                Swap(strs, start, i);
                Fun(strs, start + 1);
                Swap(strs, start, i);
            }
        }

        return set;
    }

    public  void Swap(String[] numbers, int i, int j) {
        String temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    /*public static void main(String[] args) {
        int[] numbers = {3, 32, 321};
        System.out.println(PrintMinNumber(numbers));
    }*/
}
