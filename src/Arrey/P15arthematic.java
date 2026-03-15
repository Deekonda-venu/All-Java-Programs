package Arrey;

import java.util.Scanner;

public class P15arthematic {

    public void arthematicoperation(int[][] a , int[][] b){
        int[][] sum = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        int[][] sub = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
        int[][] malti = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                malti[i][j] = a[i][j] * b[i][j];
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(malti[i][j] + " ");
            }
            System.out.println();
        }
        int[][] divi = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                divi[i][j] = a[i][j] % b[i][j];
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(divi[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] twod1 = new int[a][a];
        int[][] twod2 = new int[a][a];

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
                twod2[i][j] = sc.nextInt();

            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                System.out.print(twod2[i][j] + " ");

            }

            System.out.println();
        }

        P15arthematic obj = new P15arthematic();
        obj.arthematicoperation(twod1, twod2);



    }
}
