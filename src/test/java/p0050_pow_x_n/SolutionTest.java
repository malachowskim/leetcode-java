package p0050_pow_x_n;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        double x = 2.00000;
        int n = 10;

        double result = solution.myPow(x, n);

        assertThat(result).isEqualTo(1024.00000);
    }

    @Test
    void test2() {
        double x = 2.10000;
        int n = 3;

        double result = solution.myPow(x, n);

        assertThat(result).isCloseTo(9.26100, within(0.0001));
    }

    @Test
    void test3() {
        double x = 2.00000;
        int n = -2;

        double result = solution.myPow(x, n);

        assertThat(result).isEqualTo(0.25000);
    }
}