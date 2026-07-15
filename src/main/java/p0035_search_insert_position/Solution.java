package p0035_search_insert_position;

/**
 * <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}