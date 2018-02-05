/*
    Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

    We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 */
public class NonDecreasingArray {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 3};
        NonDecreasingArray check = new NonDecreasingArray();
        System.out.println(check.checkPossibility(nums));
    }

    public boolean checkPossibility(int[] nums) {
        //the number of changes
        int count = 0;
        for (int i = 1; i < nums.length && count <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i])
                    //modify nums[i-1] of a priority
                    nums[i - 1] = nums[i];
                else
                    //have to modify nums[i]
                    nums[i] = nums[i - 1];
            }
        }
        return count <= 1;
    }
}
