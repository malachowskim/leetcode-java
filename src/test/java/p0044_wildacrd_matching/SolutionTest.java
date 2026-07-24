package p0044_wildacrd_matching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "aa" , p = "a";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isFalse();
    }

    @Test
    void test2() {
        String s = "aa" , p = "*";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isTrue();
    }

    @Test
    void test3() {
        String s = "cb" , p = "?a";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isFalse();
    }

    @Test
    void test4() {
        String s = "acdcb" , p = "a*c?b";

        boolean result = solution.isMatch(s, p);

        assertThat(result).isFalse();
    }
}