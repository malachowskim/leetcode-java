package p0080_remove_duplicates_from_sorted_array_ii;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">80. Remove Duplicates from Sorted Array II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 1;
        boolean bTolerance = true;

        for (int right = 1; right < n; right++) {
            if (nums[right] != nums[right - 1]) {
                bTolerance = true;
                nums[left++] = nums[right];
            } else if (bTolerance) {
                bTolerance = false;
                nums[left++] = nums[right];
            }
        }

        return left;
    }
}