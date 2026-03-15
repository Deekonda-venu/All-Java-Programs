package Arrey;

import java.util.Scanner;

public class P20Upperandlowermatrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] twod1 = new int[a][a];


        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                twod1[i][j] = sc.nextInt();

            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                System.out.print(twod1[i][j] + " ");

            }

            System.out.println();
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                if(i>=j){
                    System.out.println(twod1[i][j] + " ");
                }else {
                    System.out.println("0");
                }
            }
            System.out.println();
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                if(i<=j){
                    System.out.print(" " + twod1[i][j]);
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
