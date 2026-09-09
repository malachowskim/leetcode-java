package p0080_remove_duplicates_from_sorted_array_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int result = solution.removeDuplicates(nums);

        assertThat(result).isEqualTo(5);
        assertThat(nums).containsSubsequence(1, 1, 2, 2, 3);
    }
}