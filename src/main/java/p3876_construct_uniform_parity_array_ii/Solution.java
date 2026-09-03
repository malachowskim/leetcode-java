package p3876_construct_uniform_parity_array_ii;

/**
 * <a href="https://leetcode.com/problems/construct-uniform-parity-array-ii/">3876. Construct Uniform Parity Array II</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public boolean uniformArray(int[] nums1) {
        Integer minEven = null;
        Integer minOdd = null;

        for (int j : nums1) {
            if (j % 2 == 0 && (minEven == null || j < minEven)) {
                minEven = j;
            } else if (j % 2 == 1 && (minOdd == null || j < minOdd)) {
                minOdd = j;
            }
        }

        boolean bOdd = true;
        boolean bEven = true;

        for (int j : nums1) {
            if (bOdd && !(j % 2 == 1 || (minOdd != null && j > minOdd))) {
                bOdd = false;
            }

            if (bEven && !(j % 2 == 0) || j % 2 == 1 && minOdd != null && j > minOdd) {
                bEven = false;
            }
        }

        return bOdd | bEven;
    }
}