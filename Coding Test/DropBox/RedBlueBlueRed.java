import java.util.*;

public class RedBlueBlueRed {

    static int wordpattern(String pattern, String input) {
        int patternSize = 1;
        boolean res = findPattern(pattern, input, new HashMap<Character, String>(), patternSize);
        while (!res && patternSize < input.length()) {
            patternSize++;
            res = findPattern(pattern, input, new HashMap<Character, String>(), patternSize);
        }
        return res ? 1 : 0;
    }

    private static boolean findPattern(String pattern, String input, Map<Character, String> charToValue, int patternSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (charToValue.containsKey(c)) {
                sb.append(charToValue.get(c));
            } else {
                // new character in pattern
                if (sb.length() + patternSize > input.length()) {
                    return false;
                } else {
                    String substring = input.substring(sb.length(), sb.length() + patternSize);
                    charToValue.put(c, substring);
                    int newPatternSize = 1;
                    boolean res = findPattern(pattern, input, new HashMap<>(charToValue), newPatternSize);
                    while (!res && newPatternSize + sb.length() + substring.length() < input.length() - 1) {
                        newPatternSize++;
                        res = findPattern(pattern, input, new HashMap<>(charToValue), newPatternSize);
                    }
                    return res;
                }
            }
        }
        return sb.toString().equals(input) && allValuesUniq(charToValue.values());
    }

    private static boolean allValuesUniq(Collection<String> values) {
        Set<String> set = new HashSet<>();
        for (String v : values) {
            if (!set.add(v)) {
                return false;
            }
        }
        return true;
    }

}
