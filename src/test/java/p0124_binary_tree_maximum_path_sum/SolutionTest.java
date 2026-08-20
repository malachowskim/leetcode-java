package p0124_binary_tree_maximum_path_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int result = solution.maxPathSum(root);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-2);

        int result = solution.maxPathSum(root);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-2);
        root.left.left = new TreeNode(-6);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(-3);
        root.right.right = new TreeNode(-6);

        int result = solution.maxPathSum(root);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void test4() {
        TreeNode root = new TreeNode(-1);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(-6);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(-2);

        int result = solution.maxPathSum(root);

        assertThat(result).isEqualTo(12);
    }
}