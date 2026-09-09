package p0169_majority_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {3, 2, 3};

        int result = solution.majorityElement(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = solution.majorityElement(nums);

        assertThat(result).isEqualTo(2);
    }
}