package Math;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        PowerOfThree isTrue = new PowerOfThree();
        System.out.println(isTrue.isPowerOfThree(n));
    }

    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }
}
