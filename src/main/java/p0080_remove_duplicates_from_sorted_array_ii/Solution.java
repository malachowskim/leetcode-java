package p0080_remove_duplicates_from_sorted_array_ii;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">80. Remove Duplicates from Sorted Array II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        int left = 2;

        for (int right = 2; right < n; right++) {
            if (nums[right] != nums[left - 2]) {
                nums[left++] = nums[right];
            }
        }

        return left;
    }
}