package p0048_rotate_image;

/**
 * <a href="https://leetcode.com/problems/rotate-image/">48. Rotate Image</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int row = 0; row < n / 2; row++) {
            for (int col = row; col < n - row - 1; col++) {
                int oldRow = row, newRow = col;
                int oldCol = col, newCol = n - row - 1;
                int oldTemp = matrix[oldRow][oldCol], newTemp;

                do {
                    newTemp = matrix[newRow][newCol];
                    matrix[newRow][newCol] = oldTemp;

                    oldRow = newRow;
                    oldCol = newCol;
                    oldTemp = newTemp;
                    newRow = oldCol;
                    newCol = n - oldRow - 1;
                } while (!(oldRow == row && oldCol == col));
            }
        }
    }
}