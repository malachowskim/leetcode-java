package p0030_substring_with_concatenation_of_all_words;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">30. Substring with Concatenation of All Words</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        int wordLength = words[0].length();
        int totalWords = words.length;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            int matchedWords = 0;

            Map<String, Integer> windowCount = new HashMap<>();

            while (right + wordLength <= s.length()) {
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordCount.containsKey(word)) {
                    windowCount.put(word, windowCount.getOrDefault(word, 0) + 1);
                    matchedWords++;

                    while (windowCount.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        windowCount.put(leftWord, windowCount.getOrDefault(leftWord, 0) - 1);
                        matchedWords--;
                        left += wordLength;
                    }

                    if (matchedWords == totalWords) {
                        result.add(left);
                    }
                } else {
                    windowCount.clear();
                    matchedWords = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}