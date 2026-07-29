package p0054_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/spiral-matrix/">54. Spiral Matrix</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = 0, up = 0, down = rows, left = -1, right = cols;
        List<Integer> result = new ArrayList<>();

        while (left < right && up < down) {
            if (!(col < right)) {
                break;
            }
            while (col < right) {
                result.add(matrix[row][col++]);
            }
            right--;
            col--;
            row++;

            if (!(row < down)) {
                break;
            }
            while (row < down) {
                result.add(matrix[row++][col]);
            }
            down--;
            row--;
            col--;

            if (!(col > left)) {
                break;
            }
            while (col > left) {
                result.add(matrix[row][col--]);
            }
            left++;
            col++;
            row--;

            if (!(row > up)) {
                break;
            }
            while (row > up) {
                result.add(matrix[row--][col]);
            }
            up++;
            row++;
            col++;
        }

        return result;
    }
}