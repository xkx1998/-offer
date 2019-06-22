import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();

        int[] a_ts = new int[n];
        int[] a_id = new int[n];

        for (int i = 0; i < n; i++) {
            a_ts[i] = sc.nextInt();
            a_id[i] = sc.nextInt();
        }

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a_id[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(a_ts[i]);
                map.put(a_id[i], list);
            } else {
                List<Integer> list = map.get(a_id[i]);
                list.add(a_ts[i]);
                map.put(a_id[i], list);
            }
        }

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int id = (int) it.next();
            List<Integer> list1 = map.get(id);
            if (list1.size() >= k) {
                Collections.sort(list1);
                for (int i = 0; i < list1.size() - 1; i++) {
                    int count = 1;
                    boolean flag = false;
                    for (int j = i + 1; j < list1.size(); j++) {
                        if (list1.get(j) - list1.get(i) <= d - 1) {
                            count++;
                        }
                        if (count >= k) {
                            list.add(id);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;
                }
            }
        }

        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }
    }
}
