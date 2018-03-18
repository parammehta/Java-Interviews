package String;

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
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            sb.append(s.charAt(i));

        return sb.toString();
    }
}
