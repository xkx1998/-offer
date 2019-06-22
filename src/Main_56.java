import java.util.*;

public class Main_56 {
    public ListNode deleteDuplication(ListNode pHead) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        while (pHead != null) {
            if (!map.containsKey(pHead.val)) {
                map.put(pHead.val, 1);
            } else {
                map.put(pHead.val, map.get(pHead.val) + 1);
            }
            pHead = pHead.next;
        }

        Set<Integer> set = map.keySet();
        Iterator it = set.iterator();
        List<Integer> list = new ArrayList<>();
        while (it.hasNext()) {
            int i = (int) it.next();
            if (map.get(i) == 1)
                list.add(i);
        }

        if (list.size() == 0) return null;

        ListNode head = new ListNode(list.get(0));
        head.next = null;
        ListNode result = head;

        for (int i = 1; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            node.next = null;
            head.next = node;
            head = head.next;
        }

        return result;
    }
}
