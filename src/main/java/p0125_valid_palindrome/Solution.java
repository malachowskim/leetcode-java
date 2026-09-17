package p0125_valid_palindrome;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public boolean isPalindrome(String s) {
        int n = s.length(), left = 0, right = n - 1;
        s = s.toLowerCase();

        while (left < n && right >= 0) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (!Character.isDigit(l) && (l > 'z' || l < 'a')) {
                left++;
            } else if (!Character.isDigit(r) && (r > 'z' || r < 'a')) {
                right--;
            } else if (l !=r) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}