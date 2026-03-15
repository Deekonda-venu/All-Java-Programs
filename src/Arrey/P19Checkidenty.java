package Arrey;

public class P19Checkidenty {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        boolean identity = true;
        for (int i = 0; i < n && identity; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (m[i][j] != 1) {
                        identity = false;
                        break;
                    }
                } else {
                    if (m[i][j] != 0) {
                        identity = false;
                        break;
                    }
                }
            }
        }

        if (identity) {
            System.out.println("Identity");
        } else {
            System.out.println("Not Identity");
        }
    }
}
