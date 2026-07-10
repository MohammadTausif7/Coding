import java.util.*;

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

class LC0144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        preorder(root, traversal);

        return traversal;
    }

    private void preorder (TreeNode n, List<Integer> l)
    {
        if (n == null)
        {
            return;
        }
        l.add(n.val);
        preorder(n.left, l);
        preorder(n.right, l);
    }
}