package p0056_merge_intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] result = solution.merge(intervals);

        assertThat(result).isDeepEqualTo(new int[][]{{1, 6}, {8, 10}, {15, 18}});
    }

    @Test
    void test2() {
        int[][] intervals = new int[][]{{1, 4}, {4, 5}};

        int[][] result = solution.merge(intervals);

        assertThat(result).isDeepEqualTo(new int[][]{{1, 5}});
    }

    @Test
    void test3() {
        int[][] intervals = new int[][]{{1, 4}, {1, 4}};

        int[][] result = solution.merge(intervals);

        assertThat(result).isDeepEqualTo(new int[][]{{1, 4}});
    }

    @Test
    void test4() {
        int[][] intervals = new int[][]{{1, 4}, {0, 0}};

        int[][] result = solution.merge(intervals);

        assertThat(result).isDeepEqualTo(new int[][]{{0, 0}, {1, 4}});
    }

    @Test
    void test5() {
        int[][] intervals = new int[][]{{2, 3}, {5, 5}, {2, 2}, {3, 4}, {3, 4}};

        int[][] result = solution.merge(intervals);

        assertThat(result).isDeepEqualTo(new int[][]{{2, 4}, {5, 5}});
    }

    @Test
    void test6() {
        int[][] intervals = new int[][]{{0, 2}, {2, 3}, {4, 4}, {0, 1}, {5, 7}, {4, 5}, {0, 0}};

        int[][] result = solution.merge(intervals);

        assertThat(result).isDeepEqualTo(new int[][]{{0, 3}, {4, 7}});
    }
}