/*
    Rotate an array of n elements to the right by k steps.

    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

    Note:
    Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

    Could you do it in-place with O(1) extra space?
*/

import java.util.Arrays;

public class RotateArray {

    //O(1) space O(n*k) Complexity. Using bubble sort.
    static void rotate(int[] nums, int k) {
        if (nums == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
        //print array
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int steps = 3;
        rotate(arr, steps);

    }
}
