package p0076_minimum_window_substring;

import java.util.*;

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

        int left = 0;
        int right = 0;
        Map<Character, Integer> expected = new HashMap<>();
        for (char c : t.toCharArray()) {
            expected.put(c, expected.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        String minWindow = "";
        int minLen = Integer.MAX_VALUE;
        while (right < m) {
            char current = s.charAt(right);
            if (expected.containsKey(current)) {
                window.put(current, window.getOrDefault(current, 0) + 1);

                // 1. We might complete the word (maps are equal) - in this case we keep sliding left until the maps are not equal
                while (areMapsEqual(window, expected)) {
                    if (right - left + 1 < minLen) {
                        minWindow = s.substring(left, right + 1);
                        minLen = right - left + 1;
                    }
                    if (expected.containsKey(s.charAt(left))) {
                        window.put(s.charAt(left), window.getOrDefault(s.charAt(left), 0) - 1);
                    }
                    left++;
                }
            }
            right++;
        }

        return minWindow;
    }

    private boolean areMapsEqual(Map<Character, Integer> window, Map<Character, Integer> expected) {
        if (window.size() != expected.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : window.entrySet()) {
            if (!expected.containsKey(entry.getKey())) {
                return false;
            }

            if (expected.get(entry.getKey()) > entry.getValue()) {
                return false;
            }
        }

        return true;
    }
}