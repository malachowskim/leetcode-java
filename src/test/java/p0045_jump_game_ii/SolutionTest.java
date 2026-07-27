package p0045_jump_game_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {2, 3, 1, 1, 4};

        int result = solution.jump(nums);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = {2, 3, 0, 1, 4};

        int result = solution.jump(nums);

        assertThat(result).isEqualTo(2);
    }
}