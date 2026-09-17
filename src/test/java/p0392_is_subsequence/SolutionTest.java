package p0392_is_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "abc";
        String t = "ahbgdc";

        boolean result = solution.isSubsequence(s, t);

        assertThat(result).isTrue();
    }
}