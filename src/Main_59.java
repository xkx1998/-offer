import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main_59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int nextNum = 0;
        int needPrint = 1;
        boolean r = false;
        if (pRoot == null) {
            return lists;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        ArrayList<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            list.add(curNode.val);
            nextNum++;
            if(curNode.left != null) queue.offer(curNode.left);
            if(curNode.right != null) queue.offer(curNode.right);

            if(nextNum == needPrint) {
                if(r){
                    lists.add(new ArrayList<>(reverse(list)));
                }else lists.add(new ArrayList<>(list));

                needPrint = queue.size();
                nextNum = 0;
                list.clear();
                if(!r) {
                    r=true;
                }else {
                    r = false;
                }
            }
        }

        return lists;
    }

    public ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList;
    }
}
