package p0135_candy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/candy/">135. Candy</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int candy : candies) {
            sum += candy;
        }

        return sum;
    }
}