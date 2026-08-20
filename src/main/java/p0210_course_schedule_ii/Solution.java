package p0210_course_schedule_ii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/course-schedule-ii/">210. Course Schedule II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (prerequisites == null) {
            return new int[0];
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

        List<Integer> coursesTaken = new ArrayList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            coursesTaken.add(current);

            for (int nextCourse : graph.get(current)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }

        int[] result = coursesTaken.stream().mapToInt(i -> i).toArray();

        return result.length == numCourses ? result : new int[0];
    }
}