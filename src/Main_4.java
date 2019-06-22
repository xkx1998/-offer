
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main_4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //根结点已经确定是前序遍历序列的第一个数
        TreeNode root = new TreeNode(pre[0]);
        int len = pre.length;

        //若序列的长度为1,说明只有根结点
        if (len == 1) {
            root.left = null;
            root.right = null;
            return root;
        }

        int i;
        //在中序遍历序列中查找根结点的位置
        for (i = 0; i < len; i++) {
            if (in[i] == root.val)
                break;
        }

        //i>0说明有左子树,并要得到前序遍历序列和中序遍历序列的左子树
        if (i > 0) {
            int[] pre_ = new int[i];
            int[] in_ = new int[i];
            for (int j = 0; j < i; j++) {
                pre_[j] = pre[j + 1];
                in_[j] = in[j];
            }
            root.left = reConstructBinaryTree(pre_, in_);
        }
        //否则说明根结点没有左子树
        else {
            root.left = null;
        }

        //若len - i - 1 > 0说明根结点有右子树
        if (len - i - 1 > 0) {
            int[] pre_ = new int[len - i - 1];
            int[] in_ = new int[len - i - 1];
            for (int j = i + 1; j < len; j++) {
                pre_[j - i - 1] = pre[j];
                in_[j - i - 1] = in[j];
            }
            root.right = reConstructBinaryTree(pre_, in_);
        } else {
            root.right = null;
        }

        return root;
    }
}
