package p0940_distinct_subsequences_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "abc";

        int result = solution.distinctSubseqII(s);

        assertThat(result).isEqualTo(7);
    }
}