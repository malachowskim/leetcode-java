package p0043_multiply_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String num1 = "2", num2 = "3";

        String result = solution.multiply(num1, num2);

        assertThat(result).isEqualTo("6");
    }

    @Test
    void test2() {
        String num1 = "123", num2 = "456";

        String result = solution.multiply(num1, num2);

        assertThat(result).isEqualTo("56088");
    }

    @Test
    void test3() {
        String num1 = "6913259244", num2 = "71103343";

        String result = solution.multiply(num1, num2);

        assertThat(result).isEqualTo("491555843274052692");
    }
}