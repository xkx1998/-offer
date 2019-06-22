import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Main_3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while(!stack.empty()) {
            list.add(stack.pop());
        }

        return list;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = null;
        ArrayList<Integer> list = printListFromTailToHead(node1);

        for(Integer i:list){
            System.out.println(i);
        }
    }
}
