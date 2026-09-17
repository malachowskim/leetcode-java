package p0073_set_matrix_zeroes;

/**
 * <a href="https://leetcode.com/problems/set-matrix-zeroes/">73. Set Matrix Zeroes</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int zero_row = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zero_row = i;
                    break;
                }
            }
        }

        if (zero_row == -1) {
            return;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[zero_row][j] = 0;
                }
            }
        }

        int row = (zero_row + 1) % m;
        do {
            boolean bZeroRow = row == zero_row;
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 0 && !bZeroRow) {
                    bZeroRow = true;
                    col = -1;
                    continue;
                }

                if (bZeroRow || matrix[zero_row][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            row = (row + 1) % m;
        } while (row != (zero_row + 1) % m);
    }
}