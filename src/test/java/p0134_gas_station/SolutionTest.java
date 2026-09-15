package p0134_gas_station;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int result = solution.canCompleteCircuit(gas, cost);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};

        int result = solution.canCompleteCircuit(gas, cost);

        assertThat(result).isEqualTo(-1);
    }
}