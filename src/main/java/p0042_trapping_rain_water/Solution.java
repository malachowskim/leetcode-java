package p0042_trapping_rain_water;

/**
 * <a href="https://leetcode.com/problems/trapping-rain-water/">42. Trapping Rain Water</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public int trap(int[] height) {
        int result = 0;
        int lb = 0, rb = 0;

        while (rb < height.length) {
            if (height[rb] >= height[lb]) {
                int maxHeight = Math.min(height[lb], height[rb]);
                while (lb < rb) {
                    result += maxHeight - height[lb++];
                }
            }

            rb++;
        }

        int max_lb = lb;
        lb = height.length - 1;
        rb = height.length - 1;
        while (lb >= max_lb) {
            if (height[lb] >= height[rb]) {
                int maxHeight = Math.min(height[rb], height[lb]);
                while (rb > lb) {
                    result += maxHeight - height[rb--];
                }
            }

            lb--;
        }

        return result;
    }
}