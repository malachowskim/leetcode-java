package p0037_sudoku_solver;

/**
 * <a href="https://leetcode.com/problems/sudoku-solver/">37. Sudoku Solver</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    private final int[] rows = new int[9];
    private final int[] cols = new int[9];
    private final int[] boxes = new int[9];

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    int bit = 1 << val;
                    int boxIndex = (i / 3) * 3 + j / 3;

                    rows[i] |= bit;
                    cols[j] |= bit;
                    boxes[boxIndex] |= bit;
                }
            }
        }

        recurse(board, 0, 0);
    }

    private boolean recurse(char[][] board, int r, int c) {
        if (r == 9) {
            return true;
        }

        if (c == 9) {
            return recurse(board, r + 1, 0);
        }

        if (board[r][c] != '.') {
            return recurse(board, r, c + 1);
        }

        int boxIndex = (r / 3) * 3 + c / 3;
        for (int val = 0; val < 9; val++) {
            int bit = 1 << val;

            if ((rows[r] & bit) == 0 && (cols[c] & bit) == 0 && (boxes[boxIndex] & bit) == 0) {
                board[r][c] = (char) (val + '1');
                rows[r] |= bit;
                cols[c] |= bit;
                boxes[boxIndex] |= bit;

                if (recurse(board, r, c + 1)) {
                    return true;
                }

                board[r][c] = '.';
                rows[r] ^= bit;
                cols[c] ^= bit;
                boxes[boxIndex] ^= bit;
            }
        }

        return false;
    }
}