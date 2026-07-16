package p0039_combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum/">39. Combination Sum</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        recurse(candidates, target, new ArrayList<>(), 0, result);

        return result;
    }

    private void recurse(int[] candidates, int target, List<Integer> current, int left, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = left; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                break;
            }

            current.add(candidates[i]);
            recurse(candidates, target - candidates[i], current, i, result);
            current.removeLast();
        }
    }
}