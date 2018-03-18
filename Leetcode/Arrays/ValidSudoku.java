package Arrays;/*
    Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

    The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

    A partially filled sudoku which is valid.

    Note:
    A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 */

public class ValidSudoku {

    public static void main(String[] args) {
        char sudoku[][] = new char[][]{{'.', '8', '7', '6', '5', '4', '3', '2', '1'}, {'2', '.', '.', '.', '.', '.', '.', '.', '.'}, {'3', '.', '.', '.', '.', '.', '.', '.', '.'}, {'4', '.', '.', '.', '.', '.', '.', '.', '.'}, {'5', '.', '.', '.', '.', '.', '.', '.', '.'}, {'6', '.', '.', '.', '.', '.', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {'8', '.', '.', '.', '.', '.', '.', '.', '.'}, {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};
        ValidSudoku valid = new ValidSudoku();
        System.out.println(valid.isValidSudoku(sudoku));
    }

    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        }
        boolean[][] isRowValids = new boolean[9][9];
        boolean[][] isColumnValids = new boolean[9][9];
        boolean[][] isSubMatrixValids = new boolean[9][9];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int k = i / 3 * 3 + j / 3;
                    if (isRowValids[i][num] || isColumnValids[j][num] || isSubMatrixValids[k][num]) {
                        return false;
                    }
                    isRowValids[i][num] = isColumnValids[j][num] = isSubMatrixValids[k][num] = true;
                }
            }
        }
        return true;
    }
}
