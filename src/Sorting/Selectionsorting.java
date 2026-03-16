package Sorting;

import java.util.Scanner;

public class Selectionsorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arrey = new int[len];
        for(int i=0; i<len; i++){
            arrey[i] = sc.nextInt();
        }
        for(int i=0; i<len; i++){
            System.out.print(arrey[i] + " ");
        }
        System.out.println();
        for(int i=0; i<len; i++){
            int temp =arrey[i];
            int index = 0;
            for (int j=i; j<len; j++){
                if(arrey[j]>temp){
                    temp = arrey[j];
                    index = j;
                }
            }
            arrey[index] = arrey[i];
            arrey[i] = temp;


        }
        for(int i=0; i<len; i++){
            System.out.print(arrey[i] + " ");
        }

    }
}
