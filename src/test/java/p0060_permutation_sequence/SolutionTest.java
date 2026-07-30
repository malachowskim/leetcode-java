package p0060_permutation_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int n = 3, k = 3;

        String result = solution.getPermutation(n, k);

        assertThat(result).isEqualTo("213");
    }

    @Test
    void test2() {
        int n = 4, k = 9;

        String result = solution.getPermutation(n, k);

        assertThat(result).isEqualTo("2314");
    }

    @Test
    void test3() {
        int n = 3, k = 1;

        String result = solution.getPermutation(n, k);

        assertThat(result).isEqualTo("123");
    }
}