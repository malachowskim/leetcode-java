package p0076_minimum_window_substring;

/**
 * <a href="https://leetcode.com/problems/minimum-window-substring/">76. Minimum Window Substring</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (n > m) {
            return "";
        }

        int[] targetFreq = new int[128];
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }

        int left = 0;
        int minLeft = 0;
        int minLen = Integer.MAX_VALUE;
        int charsNeeded = t.length();

        for (int right = 0; right < m; right++) {
            char rightChar = s.charAt(right);

            if (targetFreq[rightChar] > 0) {
                charsNeeded--;
            }

            targetFreq[rightChar]--;

            while (charsNeeded == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                targetFreq[leftChar]++;

                if (targetFreq[leftChar] > 0) {
                    charsNeeded++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}