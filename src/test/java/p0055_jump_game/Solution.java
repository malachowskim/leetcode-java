package p0055_jump_game;

/**
 * <a href="https://leetcode.com/problems/jump-game/">55. Jump Game</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean canJump(int[] nums) {
        int left = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > left) {
                return false;
            }

            int range = nums[i] + i;
            if (range > left) {
                left = range;
            }
        }

        return true;
    }
}