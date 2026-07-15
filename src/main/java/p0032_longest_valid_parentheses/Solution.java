package p0032_longest_valid_parentheses;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/longest-valid-parentheses/">32. Longest Valid Parentheses</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public int longestValidParentheses(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int longest = 0;
        int left = -1;
        int leftmost = -1;
        Stack<Integer> stack = new Stack<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (ch == '(') {
                stack.push(right);
            } else {
                if (stack.isEmpty()) {
                    if (leftmost != -1) {
                        int length = right - leftmost;
                        if (length > longest) {
                            longest = length;
                        }
                    }
                    leftmost = -1;
                } else {
                    left = stack.pop();
                    if (leftmost == -1 || left < leftmost) {
                        leftmost = left;
                    }
                    int length = right - left + 1;
                    if (length > longest) {
                        longest = length;
                    }
                }
            }
        }

        if (leftmost != -1 && !stack.isEmpty()) {
            int rb = s.length();

            while (!stack.isEmpty()) {
                int lb = stack.pop();
                int length = rb - lb - 1;
                if (length > longest) {
                    longest = length;
                }

                rb = lb;
            }

            int length = rb - leftmost;
            if (length > longest) {
                longest = length;
            }

        } else if (leftmost != -1) {
            int length = s.length() - leftmost;
            if (length > longest) {
                longest = length;
            }
        }

        return longest;
    }
}