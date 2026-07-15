package p0034_find_first_and_last_position_of_element_in_sorted_array;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">34. Find First and Last Position of Element in Sorted Array</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }

        int lb = -1, rb = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (left == right && nums[left] == target) {
                lb = left;
                break;
            }

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            if (left == right && nums[left] == target) {
                rb = left;
                break;
            }

            int mid = left + (int) Math.ceil((right - left) / 2.0);

            if (nums[mid] == target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[] {lb, rb};
    }
}