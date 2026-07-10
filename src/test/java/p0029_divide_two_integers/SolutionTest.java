package p0029_divide_two_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int dividend = 10, divisor = 3;

        int result = solution.divide(dividend, divisor);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        int dividend = 7, divisor = -3;

        int result = solution.divide(dividend, divisor);

        assertThat(result).isEqualTo(-2);
    }

    @Test
    void test3() {
        int dividend = Integer.MIN_VALUE, divisor = 1;

        int result = solution.divide(dividend, divisor);

        assertThat(result).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    void test4() {
        int dividend = -16, divisor = 1;

        int result = solution.divide(dividend, divisor);

        assertThat(result).isEqualTo(-16);
    }

    @Test
    void test5() {
        int divident = Integer.MAX_VALUE, divisor = 3;

        int result = solution.divide(divident, divisor);

        assertThat(result).isEqualTo(715827882);
    }
}