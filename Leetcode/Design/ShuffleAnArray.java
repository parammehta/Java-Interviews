package Design;

/*
    Shuffle a set of numbers without duplicates.

    Example:

    // Init an array with set 1, 2, and 3.
    int[] nums = {1,2,3};
    Solution solution = new Solution(nums);

    // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
    solution.shuffle();

    // Resets the array back to its original configuration [1,2,3].
    solution.reset();

    // Returns the random shuffling of array [1,2,3].
    solution.shuffle();
*/

import java.util.Arrays;
import java.util.Random;

class ShuffleAnArray {

    int[] original;
    int[] shuffled;
    Random r;

    public ShuffleAnArray(int[] nums) {

        original = nums;
        shuffled = Arrays.copyOf(nums, nums.length);
        r = new Random();

    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        shuffled = Arrays.copyOf(original, original.length);
        return shuffled;

    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int len = shuffled.length;

        for (int i = 0; i < len; i++) {
            int si = r.nextInt(len - i);
            int temp = shuffled[i];
            shuffled[i] = shuffled[si + i];
            shuffled[si + i] = temp;
        }

        return shuffled;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
