package Arrey;

import java.util.Scanner;

public class P5largestarreynumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Emter lemgth of arreuy ");
        int lenght = sc.nextInt();
        int[] arrey = new int[lenght];

        for(int i=0; i<lenght; i++){
            System.out.println("Emter value of arreuy " + i);
            arrey[i] = sc.nextInt();
        }

        int hightestvalue =0;
        for(int i=0; i<lenght; i++){
            if(hightestvalue<arrey[i]){
                hightestvalue = arrey[i];
            }
        }
        System.out.println(hightestvalue);

    }
}
