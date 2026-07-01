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

public class LC0104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
        {
            return 0;
        }
        int result = maxdepth(root, 1);
        return result;
    }
    private int maxdepth (TreeNode n, int d)
    {
        int maxdepth = d;
        if (n.left != null)
        {
            int curdepth = maxdepth(n.left, d + 1);
            maxdepth = Math.max(curdepth, maxdepth);
            
        }
        if (n.right != null)
        {
            int curdepth = maxdepth(n.right, d + 1);
            maxdepth = Math.max(curdepth, maxdepth);
        }
        return maxdepth;
    }
}