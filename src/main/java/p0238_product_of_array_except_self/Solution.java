package p0238_product_of_array_except_self;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/">238. Product of Array Except Self</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int mult = 1;

        for (int i = 0; i < n; i++) {
            result[i] = mult;
            mult *= nums[i];
        }

        mult = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= mult;
            mult *= nums[i];
        }

        return result;
    }
}