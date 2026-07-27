package p0047_permutations_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1, 1, 2};

        List<List<Integer>> result = solution.permuteUnique(nums);

        assertThat(result).usingRecursiveComparison().ignoringCollectionOrder().isEqualTo(List.of(
                List.of(1, 1, 2),
                List.of(1, 2, 1),
                List.of(2, 1, 1)
        ));
    }
}