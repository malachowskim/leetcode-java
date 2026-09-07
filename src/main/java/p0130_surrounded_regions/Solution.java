package p0130_surrounded_regions;

/**
 * <a href="https://leetcode.com/problems/surrounded-regions/">130. Surrounded Regions</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O') {
                recurse(board, 0, i);
            }
        }

        for (int i = 1; i < m; i++) {
            if (board[i][n - 1] == 'O') {
                recurse(board, i, n - 1);
            }
        }

        if (m > 1) {
            for (int i = n - 2; i >= 0; i--) {
                if (board[m - 1][i] == 'O') {
                    recurse(board, m - 1, i);
                }
            }
        }

        if (n > 1) {
            for (int i = m - 2; i >= 0; i--) {
                if (board[i][0] == 'O') {
                    recurse(board, i, 0);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board[i][j] == 'V' ? 'O' : 'X';
            }
        }
    }

    private void recurse(char[][] board, int x, int y) {
        board[x][y] = 'V';

        if (x > 0 && board[x - 1][y] == 'O') {
            recurse(board, x - 1, y);
        }

        if (x < board.length - 1 && board[x + 1][y] == 'O') {
            recurse(board, x + 1, y);
        }

        if (y > 0 && board[x][y - 1] == 'O') {
            recurse(board, x, y - 1);
        }

        if (y < board[0].length - 1 && board[x][y + 1] == 'O') {
            recurse(board, x, y + 1);
        }
    }
}