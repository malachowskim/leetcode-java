package p0042_trapping_rain_water;

/**
 * <a href="https://leetcode.com/problems/trapping-rain-water/">42. Trapping Rain Water</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public int trap(int[] height) {
        int result = 0;
        int left = 0, right = height.length - 1;
        int lb = 0, rb = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= lb) {
                    lb = height[left];
                } else {
                    result += lb - height[left];
                }
                left++;
            } else {
                if (height[right] >= rb) {
                    rb = height[right];
                } else {
                    result += rb - height[right];
                }
                right--;
            }
        }

        return result;
    }
}