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
        int[] buckets = new int[n + 1];

        for (int c : citations) {
            if (c >= n) {
                buckets[n]++;
            } else {
                buckets[c]++;
            }
        }

        int paperCount = 0;
        for (int i = n; i >= 0; i--) {
            paperCount += buckets[i];

            if (paperCount >= i) {
                return i;
            }
        }

        return 0;
    }
}