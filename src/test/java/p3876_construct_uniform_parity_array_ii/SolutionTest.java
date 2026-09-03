package p3876_construct_uniform_parity_array_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums1 = {1, 4, 7};

        boolean result = solution.uniformArray(nums1);

        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        int[] nums1 = {2, 3};

        boolean result = solution.uniformArray(nums1);

        assertThat(result).isFalse();
    }
}