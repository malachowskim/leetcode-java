package p0076_minimum_window_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = solution.minWindow(s, t);

        assertThat(result).isEqualTo("BANC");
    }

    @Test
    void test2() {
        String s = "aaaaaaaaaaaabbbbbcdd";
        String t = "abcdd";

        String result = solution.minWindow(s, t);

        assertThat(result).isEqualTo("abbbbbcdd");
    }
}