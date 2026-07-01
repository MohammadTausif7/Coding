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

public class LC0108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length - 1);
    }
    private TreeNode bst(int[] nums, int start, int end)
    {
        if (start > end)
        {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = bst(nums, start, mid - 1);
        n.right = bst(nums, mid + 1, end);
        return n;
    }
}