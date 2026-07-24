package p0044_wildacrd_matching;

/**
 * <a href="https://leetcode.com/problems/wildcard-matching/">44. Wildcard Matching</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public boolean isMatch(String s, String p) {
        int pLength = p.length();
        int sLength = s.length();
        int pIdx = 0;
        int sIdx = 0;
        int starIdx = -1;
        int sTempIdx = -1;

        while (sIdx < sLength) {
            if (pIdx < pLength) {
                char pChar = p.charAt(pIdx);
                char sChar = s.charAt(sIdx);
                if (pChar == sChar || pChar == '?') {
                    pIdx++;
                    sIdx++;
                    continue;
                }

                if (pChar == '*') {
                    starIdx = pIdx;
                    sTempIdx = sIdx;
                    pIdx++;
                    continue;
                }
            }

            if (starIdx == -1) {
                return false;
            }

            pIdx = starIdx + 1;
            sIdx = sTempIdx + 1;
            sTempIdx = sIdx;
        }

        while (pIdx < pLength && p.charAt(pIdx) == '*') {
            pIdx++;
        }

        return pIdx == pLength;
    }
}