/*
    Note: Write a solution that only iterates over the string once and uses O(1) additional memory, since this is what you would be asked to do during a real interview.

    Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

    Example

    For s = "abacabad", the output should be
    firstNotRepeatingCharacter(s) = 'c'.

    There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

    For s = "abacabaabacaba", the output should be
    firstNotRepeatingCharacter(s) = '_'.

    There are no characters in this string that do not repeat.

    Input/Output

    [time limit] 3000ms (java)
    [input] string s

    A string that contains only lowercase English letters.

    Guaranteed constraints:
    1 ≤ s.length ≤ 105.

    [output] char

    The first non-repeating character in s, or '_' if there are no characters that do not repeat.
*/

import java.util.HashMap;

class FirstNonRepeatingCharacter {

    static char character(String s) {

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = s.length();
        for (i = 0; i < length; i++) {
            c = s.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else
                charMap.put(c, 1);
        }

        for (i = 0; i < length; i++) {
            c = s.charAt(i);
            if (charMap.get(c) == 1)
                return c;
        }
        return '_';

    }

    public static void main(String[] args) {
        String str = "abacabaabacaba";
        System.out.println(character(str));
    }

}
