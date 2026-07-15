package p0032_longest_valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "(()";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() {
        String s = ")()())";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void test3() {
        String s = "()(()";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test4() {
        String s = "()()";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void test5() {
        String s = "(()()";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void test6() {
        String s = ")";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void test7() {
        String s = "())";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test8() {
        String s = "((()))())";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(8);
    }

    @Test
    void test9() {
        String s = ")()(((())))(";

        int result = solution.longestValidParentheses(s);

        assertThat(result).isEqualTo(10);
    }
}