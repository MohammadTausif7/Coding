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

public class LC0094_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        inorder(root, traversal);

        return traversal;
    }

    private void inorder (TreeNode n, List<Integer> l)
    {
        if (n == null)
        {
            return;
        }
        inorder(n.left, l);
        l.add(n.val);
        inorder(n.right, l);
    }
}