package p3871_count_commas_in_range_ii;

/**
 * <a href="https://leetcode.com/problems/count-commas-in-range-ii/">3871. Count Commas in Range II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public long countCommas(long n) {
        long count = 0;
        long commas = 1;
        long mod = 1000;
        long numbersInBlock = 999000;

        while (mod * 1000 <= n) {
            count += (numbersInBlock * commas);
            mod *= 1000;
            numbersInBlock *= 1000;
            commas++;
        }

        count += Math.max(n - mod + 1, 0) * commas;
        return count;
    }
}