package p0239_sliding_window_maximum;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/sliding-window-maximum/">239. Sliding Window Maximum</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int [nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }

            deque.offerLast(nums[i]);
        }

        result[0] = deque.peekFirst();

        for (int i = 0; i < nums.length - k; i++) {
            if (deque.peekFirst() == nums[i]) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && deque.peekLast() < nums[i + k]) {
                deque.removeLast();
            }

            deque.offerLast(nums[i + k]);
            result[i + 1] = deque.peekFirst();
        }

        return result;
    }
}