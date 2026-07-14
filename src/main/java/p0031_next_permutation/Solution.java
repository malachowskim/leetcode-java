package p0031_next_permutation;

/**
 * <a href="https://leetcode.com/problems/next-permutation/description/">31. Next Permutation</a>
 * <br><br>
 * Difficulty: Medium
 */
public class Solution {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot != -1) {
            for (int j = nums.length - 1; j > pivot; j--) {
                if (nums[j] > nums[pivot]) {
                    int temp = nums[pivot];
                    nums[pivot] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }

        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}