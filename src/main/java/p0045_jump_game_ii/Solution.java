package p0045_jump_game_ii;

/**
 * <a href="https://leetcode.com/problems/jump-game-ii/">45. Jump Game II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int jump(int[] nums) {
        int[] distances = new int[nums.length];
        boolean[] bVisitedArr = new boolean[nums.length];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = -1;
            bVisitedArr[i] = false;
        }

        distances[0] = 0;
        int currentIdx;
        while ((currentIdx = selectSmallestUnvisited(distances, bVisitedArr)) != -1) {
            int current = distances[currentIdx];
            int neighbours = nums[currentIdx];
            for (int offset = 1; offset <= neighbours; offset++) {
                int idx = currentIdx + offset;
                if (idx < distances.length) {
                    int newCost = current + 1;
                    if (distances[idx] == -1 || distances[idx] > newCost) {
                        distances[idx] = newCost;
                    }
                }
            }

            bVisitedArr[currentIdx] = true;
        }

        return distances[distances.length - 1];
    }

    private int selectSmallestUnvisited(int[] distances, boolean[] bVisited) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < distances.length; i++) {
            if (!bVisited[i] && distances[i] != -1 && distances[i] < min) {
                min = distances[i];
                idx = i;
            }
        }

        return idx;
    }
}