import sun.reflect.generics.tree.Tree;

public class Main_18 {

    public void Mirror(TreeNode root) {
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left !=null){
            Mirror(root.left);
        }
        if(root.right !=null){
            Mirror(root.right);
        }
    }
}
