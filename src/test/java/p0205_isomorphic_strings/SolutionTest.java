package p0205_isomorphic_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "egg";
        String t = "add";

        boolean result = solution.isIsomorphic(s, t);

        assertThat(result).isTrue();
    }
}