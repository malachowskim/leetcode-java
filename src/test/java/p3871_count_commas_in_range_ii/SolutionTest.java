package p3871_count_commas_in_range_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        long n = 1002;

        long result = solution.countCommas(n);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        long n = 998;

        long result = solution.countCommas(n);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void test3() {
        long n = 9002;

        long result = solution.countCommas(n);

        assertThat(result).isEqualTo(8003);
    }

    @Test
    void test4() {
        long n = 1000000;

        long result = solution.countCommas(n);

        assertThat(result).isEqualTo(999002);
    }

    @Test
    void test5() {
        long n = 1000000;

        long result = solution.countCommas(n);

        assertThat(result).isEqualTo(999002);
    }
}