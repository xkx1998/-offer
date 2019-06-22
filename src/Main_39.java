public class Main_39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) return true;
        else {
            if(Math.abs(getDepth(root.right) - getDepth(root.left)) > 1)
                return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int getDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
}
