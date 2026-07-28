package p0051_n_queens;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/n-queens/">51. N-Queens</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        recurse(result, new ArrayList<>(), n, new int[n][n]);

        return result;
    }

    private void recurse(List<List<String>> result, List<String> current, int n, int[][] validityMatrix) {
        int s = current.size();
        if (s == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (validityMatrix[s][i] == 0) {
                invalidateFields(s, i, 1, validityMatrix);
                StringBuilder sb = new StringBuilder(n);
                sb.repeat('.', n);
                sb.replace(i, i + 1, "Q");
                current.add(sb.toString());
                recurse(result, current, n, validityMatrix);
                invalidateFields(s, i, -1, validityMatrix);
                current.removeLast();
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