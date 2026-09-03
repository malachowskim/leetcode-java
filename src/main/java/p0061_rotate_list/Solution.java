package p0061_rotate_list;

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
        ListNode last = dummy;
        int count = 0;
        while (last.next != null) {
            count++;
            last = last.next;
        }

        k = k % count;
        if (k == 0) {
            return head;
        }

        int idx = count - k - 1;

        head = dummy.next;
        for (int i = 0; i < idx; i++) {
            head = head.next;
        }

        ListNode temp = head.next;
        head.next = null;
        last.next = dummy.next;
        dummy.next = temp;
        return dummy.next;
    }
}