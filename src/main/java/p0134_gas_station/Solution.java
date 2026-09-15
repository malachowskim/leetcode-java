package p0134_gas_station;

/**
 * <a href="https://leetcode.com/problems/gas-station/">134. Gas Station</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startIdx = 0;

        for (int i = 0; i < n; i++) {
            int netGas = gas[i] - cost[i];

            totalSurplus += netGas;
            currentSurplus += netGas;

            if (currentSurplus < 0) {
                startIdx = i + 1;
                currentSurplus = 0;
            }
        }

        return totalSurplus < 0 ? -1 : startIdx;
    }
}