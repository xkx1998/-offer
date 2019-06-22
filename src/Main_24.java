import java.util.ArrayList;

public class Main_24 {
   static ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
   static ArrayList<Integer> path = new ArrayList<Integer>();
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
            return  pathList;
        path.add(root.val);
        if(root.left == null && root.right == null && target == root.val)
        {
            pathList.add(new ArrayList<Integer>(path));
        }
        if(root.val <= target && root.left != null){
            FindPath(root.left,target-root.val);
        }
        if(root.val <= target && root.right != null)
        {
            FindPath(root.right,target-root.val);
        }
        path.remove(path.size()-1);//回退到父节点
        return pathList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(12);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        System.out.println(FindPath(root, 22));
    }
}
