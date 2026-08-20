package p0207_course_schedule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        boolean result = solution.canFinish(numCourses, prerequisites);

        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        int numCourses = 3;
        int[][] prerequisites = {{1, 0}, {1, 2}, {0, 1}};

        boolean result = solution.canFinish(numCourses, prerequisites);

        assertThat(result).isFalse();
    }

    @Test
    void test3() {
        int numCourses = 2;
        int[][] prerequisites = {{0, 1}};

        boolean result = solution.canFinish(numCourses, prerequisites);

        assertThat(result).isTrue();
    }
}