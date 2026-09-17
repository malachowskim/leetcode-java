package p0392_is_subsequence;

/**
 * <a href="https://leetcode.com/problems/is-subsequence/">392. Is Subsequence</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n > m) {
            return false;
        }

        if (n == 0) {
            return true;
        }

        int left = 0;
        for (int i = 0; i < m; i++) {
            if (t.charAt(i) == s.charAt(left)) {
                left++;
            }

            if (left == n) {
                return true;
            }
        }

        return false;
    }
}