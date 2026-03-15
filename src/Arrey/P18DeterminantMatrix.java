package Arrey;

import java.util.Scanner;

public class P18DeterminantMatrix {

    private static int determinant(int[][] m) {
        int n = m.length;
        if (n == 1) {
            return m[0][0];
        }
        if (n == 2) {
            return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
        }

        int det = 0;
        for (int col = 0; col < n; col++) {
            det += (col % 2 == 0 ? 1 : -1) * m[0][col] * determinant(minor(m, 0, col));
        }
        return det;
    }

    private static int[][] minor(int[][] m, int rowToRemove, int colToRemove) {
        int n = m.length;
        int[][] res = new int[n - 1][n - 1];

        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) {
                continue;
            }
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) {
                    continue;
                }
                res[r][c] = m[i][j];
                c++;
            }
            r++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println(determinant(m));
    }
}
