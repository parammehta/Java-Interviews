/*
    Implement atoi to convert a string to an integer.

    Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

    Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.



    Requirements for atoi:

    The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

    The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

    If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

    If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
*/
package String;

import java.util.HashSet;
import java.util.Set;

public class StringToInteger {
    public static int myAtoi(String str) {
        Set<Character> set = new HashSet<>();
        set.add('0');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');

        double result = 0;
        boolean flag = true;
        boolean minus = false;

        if (str.length() < 1)
            return 0;

        for (char c : str.toCharArray())
            if (set.contains(c)) {
                result = result * 10 + Character.getNumericValue(c);
                flag = false;
            } else if (c == ' ' && flag) {
            } else if (c == '+' && flag) {
                flag = false;
            } else if (c == '-' && flag) {
                minus = true;
                flag = false;
            } else break;

        if (minus)
            result = -result;

        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return (int) result;
    }

    public static void main(String[] args) {
        String str = "         +1    23";
        System.out.println(myAtoi(str));
    }
}
