package SortingAndSearching;

import java.util.Arrays;

class MergeSortedArray {
    public static void main(String[] args) {

        MergeSortedArray sortmerge = new MergeSortedArray();

        int[] array1 = new int[]{3, 4, 6, 10, 11, 15};
        int[] array2 = new int[]{1, 5, 8, 12, 14, 19};
        int[] tempArray1 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, tempArray1, 0, array1.length);
        int m = array1.length, n = array2.length;

        sortmerge.merge(tempArray1, m, array2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while (j >= 0)
            nums1[k--] = nums2[j--];
        System.out.println(Arrays.toString(nums1));
    }
}