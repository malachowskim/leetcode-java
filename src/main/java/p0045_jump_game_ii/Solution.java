package p0045_jump_game_ii;

/**
 * <a href="https://leetcode.com/problems/jump-game-ii/">45. Jump Game II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int jump(int[] nums) {
        int counter = 0, n = nums.length;
        int left = 0, right = 0;

        for (int i = 0; i < n - 1; i++) {
            right = Math.max(right, i + nums[i]);

            if (i == left) {
                counter++;
                left = right;
            }
        }

        return counter;
    }
}