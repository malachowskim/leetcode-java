package p0053_maximum_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = solution.maxSubArray(nums);

        assertThat(result).isEqualTo(6);
    }
}