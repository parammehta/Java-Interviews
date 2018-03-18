package Google;

import java.util.TreeSet;

public class KEmptySlots {

    public int kEmptySlots(int[] flowers, int k) {

        int n = flowers.length;// we have n days
        if (n == 1 && k == 0) return 1;
        TreeSet<Integer> sort = new TreeSet<>();
        //from the first blooming flower to the last blooming flower, so currently blooming flower is the last one,
        // other existing have already blooming
        for (int i = 0; i < n; i++) {
            sort.add(flowers[i]);//sort based on the position
            //find two close position
            //each lower and higher operation has O(log(n)) time complexity
            Integer min = sort.lower(flowers[i]);
            Integer max = sort.higher(flowers[i]);
            int mi = min == null ? -1111111 : min;
            int ma = max == null ? -1111111 : max;
            if (valid(flowers[i], k, mi, ma)) return i + 1;
        }
        return -1;
    }

    private boolean valid(int x, int k, int min, int max) {
        return max - x == k + 1 || x - min == k + 1;
    }

}
