package p0036_valid_sudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> columnSet = new HashSet<>();
            Set<Character> squareSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (rowSet.contains(board[i][j])) {
                    return false;
                } else if (board[i][j] != '.') {
                    rowSet.add(board[i][j]);
                }

                if (columnSet.contains(board[j][i])) {
                    return false;
                } else if (board[j][i] != '.') {
                    columnSet.add(board[j][i]);
                }

                if (squareSet.contains(board[(i * 3 + j / 3) % 9][j % 3 + (i / 3) * 3])) {
                    return false;
                } else if (board[(i * 3 + j / 3) % 9][j % 3 + (i / 3) * 3] != '.') {
                    squareSet.add(board[(i * 3 + j / 3) % 9][j % 3 + (i / 3) * 3]);
                }
            }
        }

        return true;
    }
}