import java.util.Scanner;

public class judgeCircle {
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

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(judgeCircle(str));
    }
}
