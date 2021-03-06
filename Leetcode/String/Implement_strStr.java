/*
    Implement strStr()

    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Example 1:

    Input: haystack = "hello", needle = "ll"
    Output: 2
    Example 2:

    Input: haystack = "aaaaa", needle = "bba"
    Output: -1
 */
package String;

public class Implement_strStr {

    public static int strStr(String haystack, String needle) {

        if (needle == null || haystack == null)
            return -1;
        if (needle.length() > haystack.length())
            return -1;

        int nlength = needle.length();

        for (int i = 0; i <= haystack.length() - nlength; i++) {
            if (haystack.substring(i, i + nlength).equalsIgnoreCase(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }

}
