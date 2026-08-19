package p0079_word_search;

/**
 * <a href="https://leetcode.com/problems/word-search/">79. Word Search</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (board[x][y] == word.charAt(0)) {
                    if (recurse(board, x, y, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean recurse(char[][] board, int x, int y, String word, int current) {
        if (current >= word.length()) {
            return true;
        }

        if (x >= board.length || y >= board[0].length || x < 0 || y < 0 || board[x][y] != word.charAt(current)) {
            return false;
        }

        board[x][y] = '.';
        boolean result = recurse(board, x, y - 1, word, current + 1) ||
                recurse(board, x - 1, y, word, current + 1) ||
                recurse(board, x, y + 1, word, current + 1) ||
                recurse(board, x + 1, y, word, current + 1);
        board[x][y] = word.charAt(current);

        return result;
    }
}