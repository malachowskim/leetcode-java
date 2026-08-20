package p0236_lowest_common_ancestor_of_a_binary_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/">236. Lowest Common Ancestor of a Binary Tree</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pTree = recurse(root, new ArrayList<>(), p.val);
        List<TreeNode> qTree = recurse(root, new ArrayList<>(), q.val);

        int maxSize = Math.min(pTree.size(), qTree.size());
        int i;
        for (i = 1; i < maxSize; i++) {
            if (pTree.get(i) != qTree.get(i)) {
                return pTree.get(i - 1);
            }
        }

        return pTree.get(i - 1);
    }

    private List<TreeNode> recurse(TreeNode current, List<TreeNode> history, int target) {
        history.add(current);
        if (current.val == target) {
            return new ArrayList<>(history);
        }

        if (current.left != null) {
            List<TreeNode> list = recurse(current.left, history, target);
            if (list != null) {
                return list;
            }
        }

        if (current.right != null) {
            List<TreeNode> list = recurse(current.right, history, target);
            if (list != null) {
                return list;
            }
        }
        history.remove(current);

        return null;
    }
}