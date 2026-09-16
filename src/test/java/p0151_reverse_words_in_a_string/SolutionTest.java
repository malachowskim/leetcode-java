package p0151_reverse_words_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "the sky is blue";

        String result = solution.reverseWords(s);

        assertThat(result).isEqualTo("blue is sky the");
    }
}