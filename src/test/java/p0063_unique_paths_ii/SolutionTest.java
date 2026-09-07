package p0063_unique_paths_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        int result = solution.uniquePathsWithObstacles(grid);

        assertThat(result).isEqualTo(2);
    }
}