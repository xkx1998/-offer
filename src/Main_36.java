public class Main_36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode p = pHead1;
        ListNode q = pHead2;

        while (p != null) {
            q = pHead2;
            while (q != null) {
                if (p == q) {
                    return p;
                }
                q = q.next;
            }
            p = p.next;
        }
        return null;
    }
}
