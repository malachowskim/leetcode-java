package p0274_h_index;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] citations = {3, 0, 6, 1, 5};

        int result = solution.hIndex(citations);

        assertThat(result).isEqualTo(3);
    }
}