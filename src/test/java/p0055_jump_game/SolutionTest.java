package p0055_jump_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {2, 3, 1, 1, 4};

        boolean result = solution.canJump(nums);

        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        int[] nums = {3, 2, 1, 0, 4};

        boolean result = solution.canJump(nums);

        assertThat(result).isFalse();
    }
}