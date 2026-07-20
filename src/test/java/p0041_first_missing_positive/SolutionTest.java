package p0041_first_missing_positive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1,2,0};

        int result = solution.firstMissingPositive(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        int[] nums = {3,4,-1,1};

        int result = solution.firstMissingPositive(nums);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        int[] nums = {7,8,9,11,12};

        int result = solution.firstMissingPositive(nums);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void test4() {
        int[] nums = {1};

        int result = solution.firstMissingPositive(nums);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test5() {
        int[] nums = {-1,4,2,1,9,10};

        int result = solution.firstMissingPositive(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test6() {
        int[] nums = {2,1};

        int result = solution.firstMissingPositive(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test7() {
        int[] nums = {1,2,6,3,5,4};

        int result = solution.firstMissingPositive(nums);

        assertThat(result).isEqualTo(7);
    }
}