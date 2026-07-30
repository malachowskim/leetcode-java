package p0058_length_of_last_word;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "Hello World";

        int result = solution.lengthOfLastWord(s);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void test2() {
        String s = "   fly me   to   the moon  ";

        int result = solution.lengthOfLastWord(s);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void test3() {
        String s = "luffy is still joyboy";

        int result = solution.lengthOfLastWord(s);

        assertThat(result).isEqualTo(6);
    }
}