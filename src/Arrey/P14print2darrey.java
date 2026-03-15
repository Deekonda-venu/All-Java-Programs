package Arrey;

import java.util.Scanner;

public class P14print2darrey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] twod = new int[a][a];

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                twod[i][j] = sc.nextInt();

            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                System.out.print(twod[i][j] + " ");

            }

            System.out.println();
        }

    }
}
