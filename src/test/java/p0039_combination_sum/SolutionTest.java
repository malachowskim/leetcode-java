package p0039_combination_sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = solution.combinationSum(candidates, target);

        assertThat(result).containsExactlyInAnyOrder(List.of(2,2,3), List.of(7));
    }

    @Test
    void test2() {
        int[] candidates = {2,3,5};
        int target = 8;

        List<List<Integer>> result = solution.combinationSum(candidates, target);

        assertThat(result).containsExactlyInAnyOrder(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5));
    }

    @Test
    void test3() {
        int[] candidates = {2};
        int target = 1;

        List<List<Integer>> result = solution.combinationSum(candidates, target);

        assertThat(result).isEmpty();
    }
}