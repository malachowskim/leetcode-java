package p0151_reverse_words_in_a_string;

/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/">151. Reverse Words in a String</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public String reverseWords(String s) {
        int n = s.length();
        boolean bWord = false;
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                if (!bWord) {
                    bWord = true;
                    word.setLength(0);
                }

                word.append(c);
            } else {
                if (bWord) {
                    bWord = false;
                    word.reverse();
                    result.append(word).append(' ');
                }
            }
        }

        if (bWord) {
            word.reverse();
            result.append(word);
        } else {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}