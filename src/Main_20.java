import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Main_20 {
    LinkedList<Integer> stack1 = new LinkedList<>();
    LinkedList<Integer> stack2 = new LinkedList<>();


    public void push(int node) {
        stack1.push(node);
        for (Integer i : stack1) {
            stack2.add(i);
        }
        Collections.sort(stack2);
    }

    public void pop() {
        if (!stack1.isEmpty())
            stack1.pop();
        stack2.clear();
        for (Integer i : stack1) {
            stack2.add(i);
        }
        Collections.sort(stack2);
    }

    public int top() {
        return stack2.getFirst();
    }

    public int min() {
        return top();
    }

    public static void main(String[] args) {
        Main_20 stack = new Main_20();
        stack.push(3);
        stack.push(1);
        stack.push(5);
        System.out.println(stack.min());
    }
}
