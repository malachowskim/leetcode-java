package p0274_h_index;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/h-index/">274. H-Index</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            int len = n - i;

            if (citations[i] >= len) {
                return len;
            }
        }

        return 0;
    }
}