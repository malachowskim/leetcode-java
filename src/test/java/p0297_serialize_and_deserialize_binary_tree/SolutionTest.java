package p0297_serialize_and_deserialize_binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Codec solution = new Codec();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String serialize = solution.serialize(root);

        assertThat(serialize).isEqualTo("1,2,#,#,3,4,#,#,5,#,#");

        TreeNode deserialize = solution.deserialize(serialize);

        assertThat(solution.serialize(deserialize)).isEqualTo(serialize);
    }
}