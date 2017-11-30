/*
    Given a non-empty array of integers, return the k most frequent elements.

    For example,
    Given [1,1,1,2,2,3] and k = 2, return [1,2].

    Note:
    You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
    Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

import java.util.ArrayList;
import java.util.List;

public class TopKFrequentElement {
    public static void main(String[] args) {
        TopKFrequentElement solution = new TopKFrequentElement();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(solution.topKFrequent(nums, k));
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> frequent = new ArrayList();

        return frequent;
    }
}
