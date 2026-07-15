package p0035_search_insert_position;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = solution.searchInsert(nums, target);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int result = solution.searchInsert(nums, target);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void test3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        int result = solution.searchInsert(nums, target);

        assertThat(result).isEqualTo(4);
    }
}