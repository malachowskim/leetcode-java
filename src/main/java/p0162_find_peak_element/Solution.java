package p0162_find_peak_element;

/**
 * <a href="https://leetcode.com/problems/find-peak-element/">162. Find Peak Element</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }

        int left = 0, right = n - 1;
        int dir = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean bRightGreater = mid + 1 < n && nums[mid + 1] > nums[mid];
            boolean bLeftGreater = mid - 1 >= 0 && nums[mid - 1] > nums[mid];

            if (!bRightGreater && !bLeftGreater) {
                return mid;
            }

            if (dir == 1 && bRightGreater) {
                left = mid + 1;
            } else if (dir == -1 && bRightGreater) {
                dir = 1;
                left = mid + 1;
            } else if (dir == -1 && bLeftGreater) {
                right = mid - 1;
            } else if (dir == 1 && bLeftGreater) {
                dir = -1;
                right = mid - 1;
            } else if (dir == 0) {
                if (bRightGreater) {
                    left = mid + 1;
                    dir = 1;
                } else {
                    right = mid - 1;
                    dir = -1;
                }
            }
        }

        return left;
    }
}