package p0059_spiral_matrix_ii;

/**
 * <a href="https://leetcode.com/problems/spiral-matrix-ii/">59. Spiral Matrix II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int row = 0, col = 0, up = 0, down = n, left = -1, right = n, counter = 1;

        while (left < right && up < down) {
            if (!(col < right)) {
                break;
            }
            while (col < right) {
                result[row][col++] = counter++;
            }
            right--;
            col--;
            row++;

            if (!(row < down)) {
                break;
            }
            while (row < down) {
                result[row++][col] = counter++;
            }
            down--;
            row--;
            col--;

            if (!(col > left)) {
                break;
            }
            while (col > left) {
                result[row][col--] = counter++;
            }
            left++;
            col++;
            row--;

            if (!(row > up)) {
                break;
            }
            while (row > up) {
                result[row--][col] = counter++;
            }
            up++;
            row++;
            col++;
        }

        return result;
    }
}