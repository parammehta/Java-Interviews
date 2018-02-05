/*
    Given an array of integers, find if the array contains any duplicates. Your function should return true if any value
    appears at least twice in the array, and it should return false if every element is distinct.
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i]))
                return true;
            else
                numsSet.add(nums[i]);
        }
        return false;
    }
}
