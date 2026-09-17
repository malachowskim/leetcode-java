package p0074_search_a_2d_matrix;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;
            int val = matrix[row][col];

            if (val == target) {
                return true;
            }

            if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}