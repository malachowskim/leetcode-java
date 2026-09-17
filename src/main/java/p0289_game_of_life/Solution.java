package p0289_game_of_life;

/**
 * <a href="https://leetcode.com/problems/game-of-life/">289. Game of Life</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    private final static int[][] DIRS = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int neighbours = getNeighbours(board, i, j);
                if (board[i][j] == 0) {
                    if (neighbours == 3) {
                        board[i][j] = 2;
                    }
                } else {
                    if (neighbours < 2 || neighbours > 3) {
                        board[i][j] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    private int getNeighbours(int[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;

        for (int[] dir : DIRS) {
            int x = i + dir[0];
            int y = j + dir[1];

            if (x >= 0 && x < m && y >= 0 && y < n && (board[x][y] == 1 || board[x][y] == -1)) {
                count++;
            }
        }

        return count;
    }
}