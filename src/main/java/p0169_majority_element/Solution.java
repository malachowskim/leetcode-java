package p0169_majority_element;

/**
 * <a href="https://leetcode.com/problems/majority-element/">169. Majority Element</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}