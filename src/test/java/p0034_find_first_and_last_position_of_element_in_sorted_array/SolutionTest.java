package p0034_find_first_and_last_position_of_element_in_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[] {5,7,7,8,8,10};
        int target = 8;

        int[] result = solution.searchRange(nums, target);

        assertThat(result).containsExactly(3,4);
    }

    @Test
    void test2() {
        int[] nums = new int[] {2,2};
        int target = 2;

        int[] result = solution.searchRange(nums, target);

        assertThat(result).containsExactly(0,1);
    }
}