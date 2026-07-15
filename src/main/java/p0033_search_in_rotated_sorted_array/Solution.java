package p0033_search_in_rotated_sorted_array;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">33. Search in Rotated Sorted Array</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int search(int[] nums, int target) {
        int firstIdx = 0;

        while (true) {
            if (nums.length == 0 || (nums.length == 1 && nums[0] != target)) {
                return -1;
            }

            int first = nums[0];
            int mid = nums[nums.length / 2];
            if (mid == target) {
                return firstIdx + nums.length / 2;
            } else if (first == target) {
                return firstIdx;
            }

            if (mid > target) {
                if (mid > first) {
                    if (target < first) {
                        firstIdx += nums.length / 2;
                        nums = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
                    } else {
                        nums = Arrays.copyOfRange(nums, 0, nums.length / 2);
                    }
                } else {
                    nums = Arrays.copyOfRange(nums, 0, nums.length / 2);
                }
            } else {
                if (mid > first) {
                    firstIdx += nums.length / 2;
                    nums = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
                } else {
                    if (target < first) {
                        firstIdx += nums.length / 2;
                        nums = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
                    } else {
                        nums = Arrays.copyOfRange(nums, 0, nums.length / 2);
                    }
                }
            }
        }
    }
}