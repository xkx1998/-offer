

public class Main_16 {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode newNode = new ListNode(0);
        ListNode cur = newNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;

            }

            else  {
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }

            cur.next = null;
        }

        if(list1!=null) {
            cur.next = list1;
        }
        if(list2!=null){
            cur.next = list2;
        }

        return newNode.next;
    }


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode listNode = new ListNode(3);
        listNode.next = null;
        list1.next = listNode;

        ListNode list2 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        listNode2.next = null;
        list2.next = listNode2;
        Merge(list1,list2);

    }
}
