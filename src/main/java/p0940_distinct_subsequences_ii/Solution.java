package p0940_distinct_subsequences_ii;

/**
 * <a href="https://leetcode.com/problems/distinct-subsequences-ii/">940. Direct Subsequeces II</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public int distinctSubseqII(String s) {
        int n = s.length();
        long counter = 1;
        long[] chars = new long[26];
        long mod = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            long temp = counter;
            counter = (counter * 2 - chars[idx] + mod) % mod;
            chars[idx] = temp;
        }

        return (int) ((counter - 1 + mod) % mod);
    }
}