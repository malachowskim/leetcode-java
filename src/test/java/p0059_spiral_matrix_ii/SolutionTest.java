package p0059_spiral_matrix_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int n = 3;

        int[][] result = solution.generateMatrix(n);

        assertThat(result).isDeepEqualTo(new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}});
    }
}