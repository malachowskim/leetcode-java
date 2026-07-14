package p0031_next_permutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 2, 3};

        solution.nextPermutation(nums);

        assertThat(nums).containsExactly(1, 3, 2);
    }

    @Test
    void test2() {
        int[] nums = {3, 2, 1};

        solution.nextPermutation(nums);

        assertThat(nums).containsExactly(1, 2, 3);
    }

    @Test
    void test3() {
        int[] nums = {1, 1, 5};

        solution.nextPermutation(nums);

        assertThat(nums).containsExactly(1, 5, 1);
    }

    @Test
    void test4() {
        int[] nums = {1, 3, 2};

        solution.nextPermutation(nums);

        assertThat(nums).containsExactly(2, 1, 3);
    }

    @Test
    void test5() {
        int[] nums = {2, 3, 1, 3, 3};

        solution.nextPermutation(nums);

        assertThat(nums).containsExactly(2, 3, 3, 1, 3);
    }
}