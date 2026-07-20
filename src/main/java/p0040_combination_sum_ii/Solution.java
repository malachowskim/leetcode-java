package p0040_combination_sum_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum-ii/">40. Combination Sum II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        recurse(candidates, target, new ArrayList<>(), 0, result);
        return result;
    }

    private void recurse(int[] candidates, int target, List<Integer> current, int left, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = left; i < candidates.length; i++) {
            if (i > left && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);
            recurse(candidates, target - candidates[i], current, i + 1, result);
            current.removeLast();
        }
    }
}