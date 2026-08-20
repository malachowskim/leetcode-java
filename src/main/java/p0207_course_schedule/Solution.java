package p0207_course_schedule;

/**
 * <a href="https://leetcode.com/problems/course-schedule/">207. Course Schedule</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }

        boolean[][] requirements = new boolean[numCourses][numCourses];
        boolean[] visited = new boolean[numCourses];
        for (int[] arr : prerequisites) {
            requirements[arr[0]][arr[1]] = true;
        }

        int prev_x = 0, x = 0;
        do {
            if (!visited[x]) {
                boolean flag = false;
                for (int y = 0; y < numCourses; y++) {
                    if (requirements[x][y] && !visited[y]) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    visited[x] = true;
                    prev_x = x;
                }
            }

            x = (x + 1) % numCourses;
        } while (x != prev_x);

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }
}