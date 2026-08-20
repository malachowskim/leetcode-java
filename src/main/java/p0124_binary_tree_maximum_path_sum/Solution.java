package p0124_binary_tree_maximum_path_sum;

/**
 * <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/">124. Binary Tree Maximum Path Sum</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {
    public int max;

    public int maxPathSum(TreeNode root) {
        max = root.val;
        recurse(root);

        return max;
    }

    private int recurse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, recurse(root.left));
        int right = Math.max(0, recurse(root.right));

        int currentMax = root.val + left + right;
        max = Math.max(currentMax, max);

        return root.val + Math.max(left, right);
    }
}