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

class LC0145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        postorder(root, traversal);

        return traversal;
    }

    private void postorder (TreeNode n, List<Integer> l)
    {
        if (n == null)
        {
            return;
        }
        postorder(n.left, l);
        postorder(n.right, l);
        l.add(n.val);
    }
}