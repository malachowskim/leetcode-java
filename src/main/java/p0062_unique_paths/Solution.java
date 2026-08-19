package p0062_unique_paths;

/**
 * <a href="https://leetcode.com/problems/unique-paths/">62. Unique Paths</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int k = m - 1;

        if (k > N - k) {
            k = N - k;
        }

        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (N - i + 1) / i;
        }

        return (int) result;
    }
}