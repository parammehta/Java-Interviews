package SixthSense;

public class WordSeek1 {

    public static void main(String[] args) {

        char matrix[][] = new char[][]
                {
                        "ABCD".toCharArray(),
                        "PRAT".toCharArray(),
                        "KITA".toCharArray(),
                        "ANDY".toCharArray()
                };
        String words[] = {"ANDY", "CAT", "DOG"};
        new WordSeek1().findOccurences(matrix, words);
    }

    void findOccurences(char[][] matrix, String[] words) {
        int m = 0;
        char[] word = {};
        while (m < words.length) {
            word = words[m].toCharArray();
            m++;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    char c = matrix[i][j];
                    if (word[0] == c) {
                        for (Direction direction : Direction.values()) {
                            if (!matchFound(matrix, word, direction, i, j))
                                continue;
                        }
                    }
                }
            }
        }
    }

    private boolean matchFound(char[][] matrix, char[] word, Direction direction, int row, int column) {

        int tmpRow = row;
        int tmpColumn = column;

        for (int i = 0; i < word.length; i++) {
            if (tmpRow < 0 ||
                    tmpColumn < 0 ||
                    tmpRow >= matrix.length ||
                    tmpColumn >= matrix[tmpRow].length ||
                    matrix[tmpRow][tmpColumn] != word[i]) {
                return false;
            }
            tmpRow += direction.rowMove;
            tmpColumn += direction.columnMove;
        }
        System.out.print(word);
        System.out.println(" " + (row) + " " + (column));
        return true;
    }

    enum Direction {
        UP_LEFT(-1, -1), UP(-1, 0), UP_RIGHT(-1, 1), LEFT(0, -1),
        DOWN_LEFT(1, -1), DOWN_RIGHT(1, 1), DOWN(1, 0), RIGHT(0, 1);

        private int rowMove, columnMove;

        Direction(int row, int column) {
            this.rowMove = row;
            this.columnMove = column;
        }
    }
}
