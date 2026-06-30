// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LC0101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        boolean result = symmetric(root.left, root.right);
        return result;
    }
    private boolean symmetric (TreeNode a, TreeNode b)
    {
        if (a == null && b == null)
        {
            return true;
        }
        if (a == null || b == null)
        {
            return false;
        }
        if (a.val != b.val)
        {
            return false;
        }
        return symmetric(a.left, b.right) && symmetric(a.right, b.left);
    }
}