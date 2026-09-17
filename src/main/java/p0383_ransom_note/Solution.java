package p0383_ransom_note;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/ransom-note/">383. Ransom Note</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}