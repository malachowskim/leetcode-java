package p0056_merge_intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/merge-intervals/">56. Merge Intervals</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int[][] merge(int[][] intervals) {
        int max = 0;
        for (int[] interval : intervals) {
            if (interval[1] > max) {
                max = interval[1];
            }
        }

        if (max == 0) {
            return new int[][]{{0, 0}};
        }

        int[] ranges = new int[max + 1];
        for (int[] interval : intervals) {
            int a = interval[0];
            int b = interval[1];

            if (a == b && ranges[a] == 0) {
                ranges[a] = 4;
            } else if (a != b) {
                if (ranges[a] == 0) {
                    ranges[a] = 2;
                } else if (ranges[a] == 3) {
                    ranges[a] = 1;
                } else if (ranges[a] == 4) {
                    ranges[a] = 2;
                }

                if (ranges[b] == 0) {
                    ranges[b] = 3;
                } else if (ranges[b] == 2) {
                    ranges[b] = 1;
                } else if (ranges[b] == 4) {
                    ranges[b] = 3;
                }
            }

            for (int i = a + 1; i < b; i++) {
                ranges[i] = 1;
            }
        }

        List<int[]> result = new ArrayList<>();
        int n = ranges.length, left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            int a = ranges[i];
            if (a == 2) {
                left = i;
            } else if (a == 3 || a == 4) {
                if (left == -1) {
                    left = i;
                }
                right = i;
                result.add(new int[]{left, right});
                left = -1;
            } else if (a == 0) {
                left = -1;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
