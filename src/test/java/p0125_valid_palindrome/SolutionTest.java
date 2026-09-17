package p0125_valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "A man, a plan, a canal: Panama";

        boolean result = solution.isPalindrome(s);

        assertThat(result).isTrue();
    }
}