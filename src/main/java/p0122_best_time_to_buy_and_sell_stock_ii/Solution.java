package p0122_best_time_to_buy_and_sell_stock_ii;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int sum = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                sum += prices[i] - prices[i - 1];
            }
        }

        return sum;
    }
}