package p0028_index_of_first_occurence_in_string;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurence in a String</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        int left = 0, right = 0, idx = 0;

        while (right < haystack.length()) {
            if (haystack.charAt(right) == needle.charAt(idx)) {
                right++;
                idx++;
            } else {
                idx = 0;
                left++;
                right = left;
            }

            if (idx == needle.length()) {
                return left;
            }
        }

        return -1;
    }
}