package p0162_find_peak_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 1};

        int result = solution.findPeakElement(nums);

        assertThat(result).isEqualTo(2);
    }
}