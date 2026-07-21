package p0239_sliding_window_maximum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] result = solution.maxSlidingWindow(nums, k);

        assertThat(result).containsExactly(3,3,5,5,6,7);
    }
}