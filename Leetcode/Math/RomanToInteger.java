/*
* Given a roman numeral, convert it to an integer.
* Input is guaranteed to be within the range from 1 to 3999.
*/
package Math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "DCXXI";
        RomanToInteger rToi = new RomanToInteger();
        System.out.println(rToi.romanToInt(roman));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] ch = s.toCharArray();
        int result = 0;
        for (int i = 1; i < ch.length; i++)
            if (map.get(ch[i]) > map.get(ch[i - 1]))
                result = result - map.get(ch[i - 1]);
            else
                result = result + map.get(ch[i - 1]);
        result = result + map.get(ch[ch.length - 1]);
        return result;
    }
}
