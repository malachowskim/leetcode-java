package p0169_majority_element;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/majority-element/">169. Majority Element</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int maxNum = nums[0];

        for (int num : nums) {
            int cur = map.getOrDefault(num, 0) + 1;
            map.put(num, cur);
            if (cur > max) {
                maxNum = num;
                max = cur;
            }
        }

        return maxNum;
    }
}