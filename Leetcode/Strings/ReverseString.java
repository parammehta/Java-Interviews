/*
    Write a function that takes a string as input and returns the string reversed.

    Example:
    Given s = "hello", return "olleh".
 */
public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello";
        ReverseString reverse = new ReverseString();
        System.out.println(reverse.reverseString(str));

    }

    public String reverseString(String s) {
        if (s.length() == 0 || s == null) return "";


        char[] array = s.toCharArray();

        int left = 0, right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        return new String(array);
    }

}
