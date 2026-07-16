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

        int left = 0;
        int right = candidates.length - 1;
        while (left < right) {
            int temp = candidates[left];
            candidates[left++] = candidates[right];
            candidates[right--] = temp;
        }

        List<List<Integer>> result = new ArrayList<>();
        recurse(candidates, target, new ArrayList<>(), 0, 0, result);

        return result;
    }

    private void recurse(int[] candidates, int target, List<Integer> current, int currentSum, int left, List<List<Integer>> result) {
        if (left >= candidates.length) {
            if (currentSum == target) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = left; i < candidates.length; i++) {
            int chosenNum = candidates[i];
            currentSum += chosenNum;
            current.add(chosenNum);
            int diff = target - currentSum;
            int newLeft = i;
            while (newLeft < candidates.length && diff < candidates[newLeft]) {
                newLeft++;
            }
            recurse(candidates, target, current, currentSum, newLeft, result);
            currentSum -= chosenNum;
            current.removeLast();
        }
    }
}