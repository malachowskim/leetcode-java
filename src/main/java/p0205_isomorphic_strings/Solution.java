package p0205_isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/isomorphic-strings/">205. Isomorphic Strings</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c_s = s.charAt(i);
            char c_t = t.charAt(i);

            if (map.containsKey(c_s) && map.get(c_s) != c_t) {
                return false;
            }

            if (!map.containsKey(c_s) && map.containsValue(c_t)) {
                return false;
            }

            map.put(c_s, c_t);
        }

        return true;
    }
}