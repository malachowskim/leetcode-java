package p0209_minimum_size_subarray_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int result = solution.minSubArrayLen(target, nums);

        assertThat(result).isEqualTo(2);
    }
}