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

        if (n < 0) {
            n = -1 * n;
            x = 1.0 / x;
        }

        double result = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                result = result * x;
                n -= 1;
            }

            x *= x;
            n /= 2;
        }

        return result;
    }
}