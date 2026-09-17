package p0073_set_matrix_zeroes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        solution.setZeroes(matrix);

        assertThat(matrix).isDeepEqualTo(new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        });
    }
}