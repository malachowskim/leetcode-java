package p0122_best_time_to_buy_and_sell_stock_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = {7, 1, 5, 3, 6, 4};

        int result = solution.maxProfit(nums);

        assertThat(result).isEqualTo(7);
    }
}