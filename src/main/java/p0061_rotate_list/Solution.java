package p0061_rotate_list;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/rotate-list/">61. Rotate List</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);

        List<Integer> order = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            order.add(current.val);
            current = current.next;
        }

        k = order.size() - (k % order.size());
        if (k == order.size()) {
            return head;
        }

        int idx = k;
        current = dummy;

        do {
            current.next = new ListNode(order.get(idx++));
            current = current.next;
            if (idx >= order.size()) {
                idx = 0;
            }
        } while (idx != k);
        return dummy.next;
    }
}