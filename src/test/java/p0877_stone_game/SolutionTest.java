package p0877_stone_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] piles = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean result = solution.stoneGame(piles);

        assertThat(result).isTrue();
    }
}