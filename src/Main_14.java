import java.util.ArrayList;
import java.util.List;

public class Main_14 {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) return null;
        List<ListNode> list = new ArrayList<ListNode>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        if (list.size() - k < 0) return null;
        return list.get(list.size() - k);
    }


}
