import java.util.Arrays;

public class RotateImage {

    static int[][] rotateImage(int[][] a) {

        int n, i, j;
        n = a.length;

        for (i = 0; i < n / 2; i++) {
            for (j = i; j < n - i - 1; j++) {
                int temp = a[i][j];
                a[i][j] = a[n - j - 1][i];
                a[n - j - 1][i] = a[n - 1 - i][n - 1 - j];
                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
                a[j][n - 1 - i] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        System.out.println(Arrays.deepToString(rotateImage(arr)));
    }

}
