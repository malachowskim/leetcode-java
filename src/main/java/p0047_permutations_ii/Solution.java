package p0047_permutations_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/permutations-ii/">47. Permutations II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        recurse(result, new ArrayList<>(), nums, new boolean[nums.length]);

        return result;
    }

    private void recurse(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
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