package p0139_word_break;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/word-break/">139. Word Break</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for (int x = 0; x < n; x++) {
            for (String word : wordDict) {
                int m = word.length();
                int y = x + m - 1;
                if (y >= n) {
                    continue;
                }

                if (substringMatch(s, x, y, word)) {
                    dp[x][y] = true;
                }
            }
        }

        return recurse(dp, 0, new boolean[n]);
    }

    private boolean substringMatch(String s, int start, int end, String word) {
        if (end - start + 1 != word.length()) {
            return false;
        }

        for (int i = start; i < end + 1; i++) {
            if (s.charAt(i) != word.charAt(i - start)) {
                return false;
            }
        }

        return true;
    }

    private boolean recurse(boolean[][] dp, int x, boolean[] failed) {
        int n = dp.length;

        if (x == n) {
            return true;
        }

        if (failed[x]) {
            return false;
        }

        for (int y = x; y < n; y++) {
            if (dp[x][y]) {
                if (recurse(dp, y + 1, failed)) {
                    return true;
                }
            }
        }

        failed[x] = true;
        return false;
    }
}