import java.util.Scanner;

public class JudgeCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

    }

    public boolean judgeCircle(String moves) {

        char move[] = moves.toCharArray();
        int countUD = 0, countLR = 0;
        for (int i = 0; i < move.length; i++) {

            if (move[i] == 'U')
                countUD++;
            else if (move[i] == 'D')
                countUD--;
            else if (move[i] == 'L')
                countLR++;
            else
                countLR--;
        }
        return countUD == 0 && countLR == 0;

    }
}
