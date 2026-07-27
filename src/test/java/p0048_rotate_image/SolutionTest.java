package p0048_rotate_image;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        solution.rotate(matrix);

        assertThat(matrix).isEqualTo(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
    }
}