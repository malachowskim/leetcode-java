package p0088_merge_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertThat(nums1).containsExactly(1, 2, 2, 3, 5, 6);
    }
}