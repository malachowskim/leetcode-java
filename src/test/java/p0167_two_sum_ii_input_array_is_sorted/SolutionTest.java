package p0167_two_sum_ii_input_array_is_sorted;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] numbers = {2,7,11,15};
        int target = 9;

        int[] result = solution.twoSum(numbers, target);

        assertThat(result).containsExactly(1, 2);
    }
}