package p0051_n_queens;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int n = 4;

        List<List<String>> result = solution.solveNQueens(n);

        assertThat(result).containsExactlyInAnyOrder(
                List.of(".Q..", "...Q", "Q...", "..Q."),
                List.of("..Q.", "Q...", "...Q", ".Q.."));
    }
}