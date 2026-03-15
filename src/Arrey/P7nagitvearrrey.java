package Arrey;

import java.util.Scanner;

public class P7nagitvearrrey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter lemgth of arreuy ");
        int lenght = sc.nextInt();
        int[] arrey = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.println("Emter value of arreuy " + i);
            arrey[i] = sc.nextInt();
        }
        for (int i = 0; i < lenght; i++) {
            System.out.print(arrey[i]+" ");

        }
        System.out.println(" ");
        for(int i=0; i<lenght; i++)
        {
            if(arrey[i]<0){
                System.out.println(arrey[i] + " ");
            }
        }





    }
}
