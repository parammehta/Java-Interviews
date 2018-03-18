public class BinaryToDecimal {

    public static void main(String[] args) {
        int binary = 10101010;
        BinaryToDecimal b2d = new BinaryToDecimal();
        System.out.println(b2d.getDecimalFromBinary(binary));
    }

    public int getDecimalFromBinary(int binary) {

        int decimal = 0;
        int power = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int tmp = binary % 10;
                decimal += tmp * Math.pow(2, power);
                binary = binary / 10;
                power++;
            }
        }
        return decimal;
    }
}
