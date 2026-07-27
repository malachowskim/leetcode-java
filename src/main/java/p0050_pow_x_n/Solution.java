package p0050_pow_x_n;

/**
 * <a href="https://leetcode.com/problems/powx-n/">50. Pow(x, n)</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        long N = n;

        if (n < 0) {
            N = -N;
            x = 1.0 / x;
        }

        double result = 1;
        while (N != 0) {
            if (N % 2 == 1) {
                result = result * x;
                N -= 1;
            }

            x *= x;
            N /= 2;
        }

        return result;
    }
}