package p0297_serialize_and_deserialize_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/serialize-and-deserialize-binary-tree/">297. Serialize and Deserialize Binary Tree</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        recurseSerialize(root, sb);

        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private void recurseSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append('#').append(",");
            return;
        }

        sb.append(root.val).append(",");
        recurseSerialize(root.left, sb);
        recurseSerialize(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();

        for (String s : data.split(",")) {
            queue.offer(s);
        }

        return recurseDeserialize(queue);
    }

    private TreeNode recurseDeserialize(Queue<String> queue) {
        if (queue.isEmpty()) {
            return null;
        }

        String s = queue.poll();
        if (s.equals("#")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(s));

        root.left = recurseDeserialize(queue);
        root.right = recurseDeserialize(queue);

        return root;
    }
}