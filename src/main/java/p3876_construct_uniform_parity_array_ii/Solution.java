package p3876_construct_uniform_parity_array_ii;

/**
 * <a href="https://leetcode.com/problems/construct-uniform-parity-array-ii/">3876. Construct Uniform Parity Array II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        for (int j : nums1) {
            if (j % 2 == 1 && (j < minOdd)) {
                minOdd = j;
            }
        }

        boolean bOdd = true;
        boolean bEven = true;

        for (int j : nums1) {
            if (bOdd && !(j % 2 == 1 || j > minOdd)) {
                bOdd = false;
            }

            if (bEven && !(j % 2 == 0) || j % 2 == 1 && j > minOdd) {
                bEven = false;
            }

            if (!(bEven || bOdd)) {
                break;
            }
        }

        return bOdd | bEven;
    }
}