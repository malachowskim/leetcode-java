package p0136_single_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {2, 2, 1};

        int result = solution.singleNumber(nums);

        assertThat(result).isEqualTo(1);
    }
}