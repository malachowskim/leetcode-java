package p0053_maximum_subarray;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int sum = 0, n = nums.length, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}