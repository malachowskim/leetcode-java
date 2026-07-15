package p0037_sudoku_solver;

/**
 * <a href="https://leetcode.com/problems/sudoku-solver/">37. Sudoku Solver</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public void solveSudoku(char[][] board) {
        recurse(board);
    }

    private boolean recurse(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValidNum(board, i, j, num)) {
                            board[i][j] = num;
                            if (recurse(board)) {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidNum(char[][] board, int x, int y, char num) {
        int boxRowStart = (x / 3) * 3;
        int boxColStart = (y / 3) * 3;

        for (int i = 0; i < 9; i++) {
            if (board[x][i] == num) {
                return false;
            }

            if (board[i][y] == num) {
                return false;
            }

            if (board[boxRowStart + i / 3][boxColStart + i % 3] == num) {
                return false;
            }
        }

        return true;
    }
}