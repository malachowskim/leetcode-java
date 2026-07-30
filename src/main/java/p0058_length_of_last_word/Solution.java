package p0058_length_of_last_word;

/**
 * <a href="https://leetcode.com/problems/length-of-last-word/">58. Length of Last Word</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        boolean bFoundWord = false;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result++;
                bFoundWord = true;
            } else if (bFoundWord) {
                break;
            }
        }

        return result;
    }
}