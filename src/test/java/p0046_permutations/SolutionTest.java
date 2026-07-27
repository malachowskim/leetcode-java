package p0046_permutations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {1,2,3};

        List<List<Integer>> result = solution.permute(nums);

        assertThat(result).usingRecursiveComparison().ignoringCollectionOrder().isEqualTo(List.of(
                List.of(1,2,3),
                List.of(1,3,2),
                List.of(2,1,3),
                List.of(2,3,1),
                List.of(3,1,2),
                List.of(3,2,1)
        ));
    }
}