import java.util.List;

public class Main_15 {
    public ListNode ReverseList(ListNode head) {
        if(head == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode preNode = dummy.next;
        ListNode curNode = preNode.next;

        while(curNode.next != null) {
            preNode.next = curNode.next;
            curNode.next = dummy.next;
            dummy.next = curNode;
            curNode = preNode.next;
        }
        return dummy.next;
    }
}
