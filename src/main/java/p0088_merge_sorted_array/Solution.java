package p0088_merge_sorted_array;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 * <br><br>
 * Difficulty: Easy
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = nums1.clone();

        int p1 = 0;
        int p2 = 0;
        int idx = 0;

        while (p1 < m || p2 < n) {
            if (p1 < m && p2 < n) {
                nums1[idx++] = copy[p1] < nums2[p2] ? copy[p1++] : nums2[p2++];
            } else if (p1 < m) {
                nums1[idx++] = copy[p1++];
            } else {
                nums1[idx++] = nums2[p2++];
            }
        }
    }
}