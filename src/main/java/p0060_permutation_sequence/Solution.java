package p0060_permutation_sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/permutation-sequence/">60. Permutation Sequence</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        int l = k - 1;
        for (int i = 0; i < n; i++) {
            int n_factorial = getFactorial(n - i - 1);
            int idx = l / n_factorial;
            sb.append(nums.get(idx));
            nums.remove(idx);
            l %= n_factorial;
        }

        return sb.toString();
    }

    private int getFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}