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

class LC0110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private int height(TreeNode n)
    {
        if (n == null)
        {
            return 0;
        }
        int leftheight = height(n.left);
        if (leftheight == -1)
        {
            return -1;
        }
        int rightheight = height(n.right);
        if (rightheight == -1)
        {
            return -1;
        }
        if (Math.abs(leftheight - rightheight) > 1)
        {
            return -1;
        }
        return Math.max(leftheight, rightheight) + 1;
    }
}