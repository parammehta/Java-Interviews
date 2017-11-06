public class NonDecreasingArray {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 3};
        NonDecreasingArray check = new NonDecreasingArray();
        System.out.println(check.checkPossibility(nums));
    }

    public boolean checkPossibility(int[] nums) {
        int count = 0;                                                                    //the number of changes
        for (int i = 1; i < nums.length && count <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];                    //modify nums[i-1] of a priority
                else
                    nums[i] = nums[i - 1];                                                //have to modify nums[i]
            }
        }
        return count <= 1;
    }
}
