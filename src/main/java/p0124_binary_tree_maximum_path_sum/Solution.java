package p0124_binary_tree_maximum_path_sum;

/**
 * <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/">124. Binary Tree Maximum Path Sum</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {
    public int maxClosed;

    public int maxPathSum(TreeNode root) {
        maxClosed = root.val;
        int result = recurse(root);

        return Math.max(result, maxClosed);
    }

    private int recurse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = recurse(root.left);
        int right = recurse(root.right);

        maxClosed = Math.max(root.val, Math.max(maxClosed, Math.max(left + root.val, Math.max(right + root.val, left + right + root.val))));
        root.val = Math.max(root.val, Math.max(left + root.val, right + root.val));

        return root.val;
    }
}