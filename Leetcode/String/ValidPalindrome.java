package String;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        String result = s.replaceAll("[-+.^:,;~` @#$%&'*\"()!?|<>\\=//]", "");
        result = result.toLowerCase();
        for (int i = 0, j = result.length() - 1; i < result.length() / 2; i++, j--) {
            if (result.charAt(i) != result.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Marge, let's \"went.\" I await news telegram.";
        System.out.println(isPalindrome(str));
    }

}
