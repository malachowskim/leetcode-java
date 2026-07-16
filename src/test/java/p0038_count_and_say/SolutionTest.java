package p0038_count_and_say;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int n = 4;

        String result = solution.countAndSay(n);

        assertThat(result).isEqualTo("1211");
    }

    @Test
    void test2() {
        int n = 5;

        String result = solution.countAndSay(n);

        assertThat(result).isEqualTo("111221");
    }
}