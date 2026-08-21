package p0139_word_break;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "leetcode";
        List<String> words = new ArrayList<>(List.of("leet", "code"));

        boolean result = solution.wordBreak(s, words);

        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        String s = "applepenapple";
        List<String> words = new ArrayList<>(List.of("apple", "pen"));

        boolean result = solution.wordBreak(s, words);

        assertThat(result).isTrue();
    }

    @Test
    void test3() {
        String s = "catsandog";
        List<String> words = new ArrayList<>(List.of("cats", "dog", "sand", "and", "cat"));

        boolean result = solution.wordBreak(s, words);

        assertThat(result).isFalse();
    }
}