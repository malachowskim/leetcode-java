package p0038_count_and_say;

/**
 * <a href="https://leetcode.com/problems/count-and-say/">38. Count and Say</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int left = 0, counter = 0;
        char currentNum, previousNum = s.charAt(0);
        while (left < s.length()) {
            currentNum = s.charAt(left);
            if (currentNum != previousNum) {
                sb.append(counter).append(previousNum);
                counter = 1;
            } else {
                counter++;
            }

            previousNum = currentNum;
            left++;
        }

        return sb.append(counter).append(previousNum).toString();
    }
}