import java.util.LinkedList;

public class Main_21_method2 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int index = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        if(pushA.length == 0 || popA.length == 0) return false;
        for(int i = 0;i < pushA.length;i++) {
            stack.push(pushA[i]);
            while(!stack.isEmpty() && popA[index] == stack.peek()) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
