package Arrey;

import java.util.Scanner;

public class P17CheckMatricesEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        boolean equal = true;
        for (int i = 0; i < rows && equal; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] != b[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
