package p0329_longest_increasing_path_in_a_matrix;

/**
 * <a href="https://leetcode.com/problems/longest-increasing-path-in-a-matrix/">329. Longest Increasing Path in a Matrix</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] visited = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = -1;
            }
        }

        int max = 0;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                max = Math.max(max, recurse(matrix, visited, x, y));
            }
        }

        return max;
    }

    private int recurse(int[][] matrix, int[][] visited, int x, int y) {
        if (visited[x][y] != -1) {
            return visited[x][y];
        }

        int currentVal = matrix[x][y];
        int maxLen = 1;

        if (y > 0 && matrix[x][y - 1] > currentVal) {
            maxLen = Math.max(maxLen, recurse(matrix, visited, x, y - 1) + 1);
        }

        if (x > 0 && matrix[x - 1][y] > currentVal) {
            maxLen = Math.max(maxLen, recurse(matrix, visited, x - 1, y) + 1);
        }

        if (y < matrix[0].length - 1 && matrix[x][y + 1] > currentVal) {
            maxLen = Math.max(maxLen, recurse(matrix, visited, x, y + 1) + 1);
        }

        if (x < matrix.length - 1 && matrix[x + 1][y] > currentVal) {
            maxLen = Math.max(maxLen, recurse(matrix, visited, x + 1, y) + 1);
        }

        visited[x][y] = maxLen;
        return maxLen;
    }
}