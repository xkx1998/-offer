import java.util.LinkedList;

/**
 * 这种方法真的是睿智
 */
public class Main_21 {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        LinkedList<Integer> stack = new LinkedList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i : popA) {
            queue.offer(i);
        }
        int index = 0;
        while (!queue.isEmpty()) {
            if (!stack.isEmpty()) {
                int num = queue.poll();
                if (stack.peek() == num) {
                    stack.pop();
                    continue;
                } else {
                    while (index <= pushA.length - 1 && num != pushA[index]) {
                        stack.push(pushA[index++]);
                    }
                    if (index < pushA.length - 1) {
                        index++;
                        continue;
                    } else if (index == pushA.length - 1) {
                        if (stack.size() == queue.size()) {
                            while (!stack.isEmpty() && !queue.isEmpty()) {
                                if (stack.pop() != queue.poll()) {
                                    return false;
                                }
                            }
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                stack.push(pushA[index++]);
            }
        }
        return true;
    }
}
