package p0046_permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/permutations/">46. Permutations</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        recurse(result, new ArrayList<>(), nums, new boolean[nums.length]);

        return result;
    }

    private void recurse(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            current.add(nums[i]);
            used[i] = true;
            recurse(result, current, nums, used);
            current.removeLast();
            used[i] = false;
        }
    }
}