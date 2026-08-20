package p0207_course_schedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        List<List<Integer>> graph = new ArrayList<>();
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

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int coursesTaken = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            coursesTaken++;

            for (int nextCourse : graph.get(current)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }

        return coursesTaken == numCourses;
    }
}