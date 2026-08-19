package p0062_unique_paths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int m = 3, n = 7;

        int result = solution.uniquePaths(m, n);

        assertThat(result).isEqualTo(28);
    }

    @Test
    void test2() {
        int m = 3, n = 2;

        int result = solution.uniquePaths(m, n);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test3() {
        int m = 80, n = 2;

        int result = solution.uniquePaths(m, n);

        assertThat(result).isEqualTo(80);
    }
}