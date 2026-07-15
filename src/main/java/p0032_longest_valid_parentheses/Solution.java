package p0032_longest_valid_parentheses;

/**
 * <a href="https://leetcode.com/problems/longest-valid-parentheses/">32. Longest Valid Parentheses</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public int longestValidParentheses(String s) {
        int longest = 0;
        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                longest = Math.max(longest, 2 * right);
            } else if (right > left) {
                left = 0;
                right = 0;
            }
        }

        left = 0;
        right = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                longest = Math.max(longest, 2 * left);
            } else if (left > right) {
                left = 0;
                right = 0;
            }
        }

        return longest;
    }
}