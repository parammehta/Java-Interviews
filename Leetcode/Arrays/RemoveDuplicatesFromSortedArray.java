package Arrays;/*
    Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    Example:

        Given nums = [1,1,2],

        Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
        It doesn't matter what you leave beyond the new length.
*/

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

        /*Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i<nums.length; i++)
            mySet.add(nums[i]);
        return mySet.size();*/
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        int n = removeDuplicates(arr);
        System.out.println(n + " - " + Arrays.toString(arr));
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
