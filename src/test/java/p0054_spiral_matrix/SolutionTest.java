package p0054_spiral_matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<Integer> result = solution.spiralOrder(matrix);

        assertThat(result).containsExactly(1, 2, 3, 6, 9, 8, 7, 4, 5);
    }
}