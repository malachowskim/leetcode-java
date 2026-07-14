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

        int pivot = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot != nums.length - 1) {
            int smallest = pivot + 1;

            for (int j = pivot + 2; j < nums.length; j++) {
                if (nums[j] > nums[pivot] && nums[j] <= nums[smallest]) {
                    smallest = j;
                }
            }

            int temp = nums[pivot];
            nums[pivot] = nums[smallest];
            nums[smallest] = temp;
        }

        int left = pivot == nums.length - 1 ? 0 : pivot + 1, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}