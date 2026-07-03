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

public class LC0112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathsum(root, targetSum, 0);
    }
    private boolean pathsum(TreeNode n, int t, int s)
    {
        if (n == null)
        {
            return false;
        }
        s += n.val;
        if (n.left == null && n.right == null)
        {
            return s == t;
        }
        return pathsum(n.left, t, s) || pathsum(n.right, t, s);
    }
}