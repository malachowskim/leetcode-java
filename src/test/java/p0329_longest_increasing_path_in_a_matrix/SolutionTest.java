package p0329_longest_increasing_path_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    public final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};

        int result = solution.longestIncreasingPath(matrix);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void test2() {
        int[][] matrix = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};

        int result = solution.longestIncreasingPath(matrix);

        assertThat(result).isEqualTo(4);
    }
}