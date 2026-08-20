package p0210_course_schedule_ii;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/course-schedule-ii/">210. Course Schedule II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int required = pre[1];
            graph.get(required).add(course);
            inDegree[course]++;
        }

        int[] result = new int[numCourses];
        int head = 0;
        int tail = 0;

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                result[tail++] = i;
            }
        }

        while (head < tail) {
            int current = result[head++];

            for (int nextCourse : graph.get(current)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    result[tail++] = nextCourse;
                }
            }
        }

        return tail == numCourses ? result : new int[0];
    }
}