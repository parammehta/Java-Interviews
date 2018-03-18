package GoldmanSachs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RunLengthEncoding {

    static String runLengthEncode(String input) {
        char[] chars = input.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int runLength = 1;
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                runLength++;
                i++;
            }
            builder
                    .append(runLength)
                    .append(chars[i]);
        }

        return builder.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }

        res = runLengthEncode(_input);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}
