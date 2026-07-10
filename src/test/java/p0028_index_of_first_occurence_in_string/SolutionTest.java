package p0028_index_of_first_occurence_in_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = solution.strStr(haystack, needle);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void test2() {
        String haystack = "mississippi";
        String needle = "issip";

        int result = solution.strStr(haystack, needle);

        assertThat(result).isEqualTo(4);
    }
}