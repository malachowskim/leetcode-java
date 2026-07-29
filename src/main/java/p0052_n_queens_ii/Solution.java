package p0052_n_queens_ii;

/**
 * <a href="https://leetcode.com/problems/n-queens-ii/">52. N-Queens II</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        recurse(0, n, new int[n][n]);

        return count;
    }

    private void recurse(int row, int n, int[][] validityMatrix) {
        if (row == n) {
            this.count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (validityMatrix[row][i] == 0) {
                invalidateFields(row, i, 1, validityMatrix);
                recurse(row + 1, n, validityMatrix);
                invalidateFields(row, i, -1, validityMatrix);
            }
        }
    }

    private void invalidateFields(int x, int y, int change, int[][] validMatrix) {
        int n = validMatrix.length;
        for (int i = 0; i < n; i++) {
            validMatrix[x][i] += change;
            validMatrix[i][y] += change;
            int diagIdx = x - y + i;
            if (diagIdx >= 0 && diagIdx < n) {
                validMatrix[diagIdx][i] += change;
            }

            diagIdx = x + y - i;
            if (diagIdx >= 0 && diagIdx < n) {
                validMatrix[diagIdx][i] += change;
            }
        }
    }
}