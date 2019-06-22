import java.util.List;

public class Main_55 {

    /**
     * 快慢指针
     *
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead.next == null || pHead.next.next == null) {
            return null;
        }

        ListNode slow = pHead.next;
        ListNode fast = pHead.next.next;

        while (slow != fast) {
            if (slow.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                return null;
            }
        }

        fast = pHead;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
