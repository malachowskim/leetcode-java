package p0189_rotate_array;

/**
 * <a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int c = gcd(n, k);

        for (int i = 0; i < c; i++) {
            int idx = k + i;
            int prev = nums[idx - k];

            do {
                int curr = nums[idx];
                nums[idx] = prev;
                prev = curr;

                idx = (idx + k) % n;
            } while (idx != k + i);
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}