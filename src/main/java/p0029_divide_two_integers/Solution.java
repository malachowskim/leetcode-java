package p0029_divide_two_integers;

/**
 * <a href="https://leetcode.com/problems/divide-two-integers/">29. Divide Two Integers</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int negatives = 2;
        if (dividend > 0) {
            dividend = -dividend;
            negatives--;
        }
        if (divisor > 0) {
            divisor = -divisor;
            negatives--;
        }

        int count = 1, current = divisor, half_min = Integer.MIN_VALUE >> 1;

        while (current >= half_min && current + current > dividend) {
            current <<= 1;
            count <<= 1;
        }

        int quotient = 0;
        while (divisor >= dividend) {
            if (dividend <= current) {
                quotient -= count;
                dividend -= current;
            }

            current >>= 1;
            count = Math.max(count >> 1, 1);
        }

        return negatives == 2 || negatives == 0 ? -quotient : quotient;
    }
}