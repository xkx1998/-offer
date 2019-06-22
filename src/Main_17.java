

public class Main_17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return isSame(root1, root2) || isSame(root1.right, root2) || isSame(root1.left, root2);
    }

    public boolean isSame(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null)
            return false;

        if (root1.val == root2.val) {
            return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
        } else {
            return false;
        }
    }
}
