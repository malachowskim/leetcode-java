package p0033_search_in_rotated_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void test2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test3() {
        int[] nums = {1};
        int target = 0;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void test4() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 1;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test5() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void test6() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void test7() {
        int[] nums = {3,1};
        int target = 3;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test8() {
        int[] nums = {5,1,3};
        int target = 3;

        int result = solution.search(nums, target);
        assertThat(result).isEqualTo(2);
    }
}