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
        if (k == 0) {
            return;
        }

        int[] copy = nums.clone();
        int idxCopy = n - k;
        int idxNums = 0;
        do {
            nums[idxNums++] = copy[idxCopy++];
            if (idxCopy == n) {
                idxCopy = 0;
            }
        } while (idxCopy != n - k);
    }
}