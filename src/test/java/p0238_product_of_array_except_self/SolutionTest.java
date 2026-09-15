package p0238_product_of_array_except_self;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4};

        int[] result = solution.productExceptSelf(nums);

        assertThat(result).containsExactly(24, 12, 8, 6);
    }
}