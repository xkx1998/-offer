import java.util.*;

public class Main_28 {

    public static int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < array.length;i++) {
            if(!map.containsKey(array[i])) {
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i]) + 1);
            }
        }

        Set<Integer> set = map.keySet();
        Iterator<Integer> it =  set.iterator();
        while(it.hasNext()) {
            int num = it.next();
            if(map.get(num) > array.length/2){
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(num));
    }
}
