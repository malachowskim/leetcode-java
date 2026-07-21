package p0042_trapping_rain_water;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = solution.trap(height);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void test2() {
        int[] height = {4,2,0,3,2,5};

        int result = solution.trap(height);

        assertThat(result).isEqualTo(9);
    }

    @Test
    void test3() {
        int[] height = {2,0,2};

        int result = solution.trap(height);

        assertThat(result).isEqualTo(2);
    }
}