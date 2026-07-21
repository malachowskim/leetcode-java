package p0136_single_number;

/**
 * <a href="https://leetcode.com/problems/single-number/">136. Single Number</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}