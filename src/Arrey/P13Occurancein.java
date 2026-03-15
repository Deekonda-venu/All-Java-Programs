package Arrey;

import java.util.Scanner;

public class P13Occurancein {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Emter lemgth of arreuy ");
            int lenght = sc.nextInt();
            if (lenght < 2) {
                System.out.println("Need at least 2 elements");
                return;
            }
            int[] arrey = new int[lenght];

            for (int i = 0; i < lenght; i++) {
                System.out.println("Emter value of arreuy " + i);
                arrey[i] = sc.nextInt();
            }
            for (int i = 0; i < lenght; i++) {
                System.out.print(arrey[i]+" ");

            }
        System.out.println();
            for(int i=0; i<lenght; i++){
                int count = 1;
                for(int j=i; j<lenght; j++ ){

                    if(arrey[i]==arrey[j] && arrey[i]!=0 && i!=j){
                        count++;
                        arrey[j]=0;


                    }

                }
                if(arrey[i]!=0){
                    System.out.println(arrey[i]+" Ocuuarnce "+ count);
                }

            }
    }
}
