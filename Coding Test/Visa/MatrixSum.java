package Visa;

import java.util.*;

public class MatrixSum {

    static long maxSum(int[][] mat) {
        if (mat.length <= 0) {
            return 0;
        }
        TreeMap<Integer, Integer> indexMap = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < mat[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < mat.length; j++) {
                colSum += mat[j][i];
            }
            if (colSum <= 0) {
                indexMap.put(i, colSum);
            }
        }

        ArrayList<Integer> keys = new ArrayList<Integer>(indexMap.keySet());

        Collections.sort(keys,
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer e1, Integer e2) {
                        return indexMap.get(e1).compareTo(indexMap.get(e2));
                    }
                }
        );

        long totalSum = 0;
        HashSet<Integer> visited = new HashSet<>();

        if (keys.size() > 1) {
            for (int i = 0; i < keys.size(); i += 2) {
                int index1 = keys.get(i);
                int index2 = keys.get(i + 1);

                totalSum += indexMap.get(index1) * -1;
                totalSum += indexMap.get(index2) * -1;

                visited.add(index1);
                visited.add(index2);
            }
        }

        for (int j = 0; j < mat[0].length; j++) {
            if (visited.contains(j)) {
                continue;
            }
            for (int i = 0; i < mat.length; i++) {
                totalSum += mat[i][j];
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[][]{{0, -3, 3}, {0, -2, 2}, {0, -1, 1}};
//        int matrix [][] = new int[][]{{-10}};
        System.out.println(maxSum(matrix));
    }

}
