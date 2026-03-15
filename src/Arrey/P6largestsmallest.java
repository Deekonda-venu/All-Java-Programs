package Arrey;

import java.util.Scanner;

public class P6largestsmallest {
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

        int largest = 0;
        int smalles = arrey[0];

        for(int i=0; i<lenght; i++){
            if(largest <arrey[i]){
                largest = arrey[i];
            }
            if (smalles > arrey[i]) {
                smalles = arrey[i];

            }
        }
        System.out.println();
        System.out.println(largest);
        System.out.println(smalles);

    }
}
