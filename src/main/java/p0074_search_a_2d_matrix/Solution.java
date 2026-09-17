package p0074_search_a_2d_matrix;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        if (matrix[0][0] == target) {
            return true;
        }

        int left = 0, right = m - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            int val = matrix[mid][0];

            if (val == target) {
                return true;
            }

            if (val < target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        int row = left;
        left = 0;
        right = n - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            int val = matrix[row][mid];

            if (val == target) {
                return true;
            }

            if (val < target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}