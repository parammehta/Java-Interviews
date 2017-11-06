/*
    Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

    For example,
    Given nums = [0, 1, 3] return 2.

    Note:
    Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int number[] = new int[]{0, 1, 3};
        MissingNumber miss = new MissingNumber();
        System.out.println("nums: " + Arrays.toString(number) + ", missing number: " + miss.missingNumber(number));
    }

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;

        return ((nums.length * (nums.length + 1)) - 2 * sum) / 2;
    }

}
