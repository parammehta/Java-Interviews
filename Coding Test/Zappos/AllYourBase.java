import java.util.HashMap;

public class AllYourBase {

    public static int allYourBase(String cryptic) {
        HashMap<Character, Integer> unique = new HashMap<>();
        unique.put(cryptic.charAt(0), 1);
        boolean flag = false;
        int count = 1;
        for (int i = 1; i < cryptic.length(); i++) {
            if (!unique.containsKey(cryptic.charAt(i))) {
                if (!flag) {
                    unique.put(cryptic.charAt(i), 0);
                    flag = true;
                    count = 2;
                } else {
                    unique.put(cryptic.charAt(i), count);
                    count++;
                }
            }
        }
        String s = "";
        for (char c : cryptic.toCharArray()) {
            s = s + unique.get(c);
            System.out.println(s);
        }
        int base = unique.size();
        System.out.println(unique);
        return other_to_decimal(s, base);
    }

    public static int other_to_decimal(String s, int base) {
        int g, num = 0, a = 0;
        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 70) {
                c -= 55;
                g = c;
                num = num + (g * ((int) Math.pow(base, a)));
            } else {
                c -= 48;
                g = c;

                num = num + (g * ((int) Math.pow(base, a)));
            }
            a++;
        }
        return num;
    }

    public static void main(String[] args) {
        String cryptic = "11001001";
        AllYourBase base = new AllYourBase();
        System.out.println(allYourBase(cryptic));
    }

}
