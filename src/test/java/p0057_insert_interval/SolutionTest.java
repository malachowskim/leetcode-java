package p0057_insert_interval;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] result = solution.insert(intervals, newInterval);

        assertThat(result).isDeepEqualTo(new int[][]{{1, 5}, {6, 9}});
    }
}