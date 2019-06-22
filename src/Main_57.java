
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}


public class Main_57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null)
            return pNode;
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }

        while(pNode.next != null) {
            TreeLinkNode root = pNode.next;
            if(root.left == pNode)
                return root;
            pNode = pNode.next;
        }

        return null;
    }
}
