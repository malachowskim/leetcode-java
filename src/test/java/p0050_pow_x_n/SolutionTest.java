package p0050_pow_x_n;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        double x = 2.00000;
        int n = 10;

        double result = solution.myPow(x, n);

        assertThat(result).isEqualTo(1024.00000);
    }
}