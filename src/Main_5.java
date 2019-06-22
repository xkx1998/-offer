import java.util.Stack;

public class Main_5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int result =  stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        Main_5 main_5 = new Main_5();
        main_5.push(1);
        main_5.push(2);
        main_5.push(3);

        System.out.println(main_5.pop());
        System.out.println(main_5.pop());
        System.out.println(main_5.pop());
    }
}
