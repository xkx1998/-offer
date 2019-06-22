import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main_60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) return lists;

        int nextNum = 0;
        int needPrint = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        ArrayList<Integer> list =new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            list.add(curNode.val);
            nextNum++;
            if(curNode.left != null) queue.offer(curNode.left);
            if(curNode.right != null) queue.offer(curNode.right);

            if(needPrint == nextNum) {
                lists.add(new ArrayList<>(list));
                needPrint = queue.size();
                nextNum = 0;
                list.clear();
            }
        }

        return lists;

    }
}
