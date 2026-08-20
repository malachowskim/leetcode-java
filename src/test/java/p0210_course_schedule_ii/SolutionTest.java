package p0210_course_schedule_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        int[] result = solution.findOrder(numCourses, prerequisites);

        assertThat(result).containsExactly(0, 1);
    }
}