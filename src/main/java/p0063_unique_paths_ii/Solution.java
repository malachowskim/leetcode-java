package p0063_unique_paths_ii;

/**
 * <a href="https://leetcode.com/problems/unique-paths-ii/">63. Unique Paths II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if (obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = 1;

        int row = m - 1;
        int col = n - 2;
        int colLimit = n - 1;
        int rowLimit = m - 1;
        boolean bRow = true;
        while (colLimit >= 0 || rowLimit >= 0) {
            if (bRow) {
                if (col >= 0 && row >= 0) {
                    if (row == m - 1) {
                        dp[row][col] = obstacleGrid[row][col] == 1 ? 0 : dp[row][col + 1];
                    } else {
                        dp[row][col] = obstacleGrid[row][col] == 1 ? 0 : dp[row][col + 1] + dp[row + 1][col];
                    }
                }

                col--;

                if (col < 0) {
                    bRow = false;
                    col = colLimit;
                    row = --rowLimit;
                }
            } else {
                if (row >= 0 && col >= 0) {
                    if (col == n - 1) {
                        dp[row][col] = obstacleGrid[row][col] == 1 ? 0 : dp[row + 1][col];
                    } else {
                        dp[row][col] = obstacleGrid[row][col] == 1 ? 0 : dp[row + 1][col] + dp[row][col + 1];
                    }
                }

                row--;
                if (row < 0) {
                    bRow = true;
                    row = rowLimit;
                    col = --colLimit;
                }
            }
        }

        return dp[0][0];
    }
}