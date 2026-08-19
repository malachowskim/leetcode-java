package p0399_evaluate_division;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/evaluate-division/">399. Evaluate Division</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];

            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());

            graph.get(u).put(v, val);
            graph.get(v).put(u, 1.0 / val);
        }

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);

            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                result[i] = -1.0;
            } else {
                result[i] = dfs(graph, start, end, new HashSet<>(), 1.0);
            }
        }

        return result;
    }

    private double dfs(Map<String, Map<String, Double>> graph, String current, String target, Set<String> visited, double currentProduct) {
        if (current.equals(target)) {
            return currentProduct;
        }

        visited.add(current);

        for (Map.Entry<String, Double> neighbor : graph.get(current).entrySet()) {
            if (!visited.contains(neighbor.getKey())) {

                double result = dfs(graph, neighbor.getKey(), target, visited, currentProduct * neighbor.getValue());

                if (result != -1.0) {
                    return result;
                }
            }
        }

        return -1.0;
    }
}