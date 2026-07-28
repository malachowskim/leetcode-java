package p0052_n_queens_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int n = 4;

        int result = solution.totalNQueens(n);

        assertThat(result).isEqualTo(2);
    }
}