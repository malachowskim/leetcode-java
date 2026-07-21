package p0043_multiply_strings;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/multiply-strings/">43. Multiply Strings</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public String multiply(String num1, String num2) {
        if ((num1.length() == 1 && Integer.parseInt(num1) == 0) || (num2.length() == 1 && Integer.parseInt(num2) == 0)) {
            return "0";
        }

        char[] ans = new char[num1.length() + num2.length()];
        Arrays.fill(ans, '0');

        for (int i = num2.length() - 1; i >= 0; i--) {
            int digit2 = Character.getNumericValue(num2.charAt(i));
            for (int j = num1.length() - 1; j >= 0; j--) {
                int digit1 = Character.getNumericValue(num1.charAt(j));
                int toAdd = digit1 * digit2;
                for (int k = j + i + 1; toAdd > 0; k--) {
                    int toAddDigit = toAdd % 10;
                    int current = Character.getNumericValue(ans[k]);
                    current += toAddDigit;
                    if (current > 9) {
                        toAdd += 10;
                        current %= 10;
                    }
                    ans[k] = Character.forDigit(current, 10);
                    toAdd /= 10;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean bNonZero = false;
        for (char an : ans) {
            if (an != '0' && !bNonZero) {
                bNonZero = true;
            }

            if (bNonZero) {
                sb.append(an);
            }
        }

        return sb.toString();
    }
}