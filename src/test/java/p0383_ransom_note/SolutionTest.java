package p0383_ransom_note;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String ransomNote = "a";
        String magazine = "b";

        boolean result = solution.canConstruct(ransomNote, magazine);

        assertThat(result).isFalse();
    }

    @Test
    void test2() {
        String ransomNote = "aa";
        String magazine = "ab";

        boolean result = solution.canConstruct(ransomNote, magazine);

        assertThat(result).isFalse();
    }

    @Test
    void test3() {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = solution.canConstruct(ransomNote, magazine);

        assertThat(result).isTrue();
    }
}