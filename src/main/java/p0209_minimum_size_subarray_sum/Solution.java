package p0209_minimum_size_subarray_sum;

/**
 * <a href="https://leetcode.com/problems/minimum-size-subarray-sum/">209. Minimum Size Subarray Sum</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int min = n + 1;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                }

                sum -= nums[left++];
            }
        }

        return min > n ? 0 : min;
    }
}