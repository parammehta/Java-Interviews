/*
    Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

    Note:
    The given integer is guaranteed to fit within the range of a 32-bit signed integer.
    You could assume no leading zero bit in the integer’s binary representation.
 */
public class NumberComplement {

    public static void main(String[] args) {
        int number = 8;
        NumberComplement complement = new NumberComplement();
        System.out.println("Number " + number + "'s " + "Complement is: " + complement.findComplement(number));
    }

    public int findComplement(int num) {
        String numbin = Integer.toBinaryString(num);
        char c[] = numbin.toCharArray();
        for (int i = 0; i < c.length; i++)
            if (c[i] == '0')
                c[i] = '1';
            else
                c[i] = '0';
        return Integer.parseInt(String.valueOf(c), 2);
    }
}
