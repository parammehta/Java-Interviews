package Arrays;

/*
    Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

    You may assume the integer do not contain any leading zero, except the number 0 itself.

    The digits are stored such that the most significant digit is at the head of the list.
*/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int j = length;
        for (int i = length; i > 0; i--) {
            if (digits[i - 1] < 9) {
                digits[i - 1] = digits[i - 1] + 1;
                return digits;
            }
            digits[i - 1] = 0;
        }
        int[] newNumber = new int[length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
