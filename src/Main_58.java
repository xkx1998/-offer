public class Main_58 {
    static boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null)
            return true;
        return isMirror(pRoot.left,pRoot.right);
    }

    static boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 ==null)
            return true;
        else if ((root1 == null && root2 != null) || (root1 != null && root2 == null)){
            return false;
        }
        else if(root1.val != root2.val){
            return false;
        }else {
            return isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        System.out.println(isSymmetrical(root));

    }
}
