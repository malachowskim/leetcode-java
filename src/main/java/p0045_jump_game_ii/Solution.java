package p0045_jump_game_ii;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/jump-game-ii/">45. Jump Game II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int jump(int[] nums) {
        int current = 0;
        int[] distances = new int[nums.length];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[0] = 0;

        while (current < nums.length) {
            for (int i = 1; i <= nums[current] && current + i < nums.length; i++) {
                distances[current + i] = Math.min(distances[current + i], distances[current] + 1);
            }

            current++;
        }

        return distances[distances.length - 1];
    }
}