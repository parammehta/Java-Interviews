package String;

public class ReverseInteger {

    public static int reverse(int x) {
        double result = 0;
        while (x != 0) {
            int temp = x % 10;
            result = result * 10 + temp;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        return (int) result;
    }

    public static void main(String[] args) {
        int i = -321;
        System.out.println(reverse(i));
    }

}
