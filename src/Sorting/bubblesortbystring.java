package Sorting;

import java.util.Scanner;

public class bubblesortbystring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] arrey = new String[len];
        for(int i=0; i<len; i++){
            arrey[i] = sc.next();
        }
        for(int i=0; i<len; i++){
            System.out.print(arrey[i] + " ");
        }
        System.out.println();
        for(int i=0; i<len-1; i++){
            boolean swapped = false;
            for(int j=0; j<len-1-i; j++){
                if(arrey[j].compareTo(arrey[j+1]) > 0){
                    String temp = arrey[j];
                    arrey[j] = arrey[j+1];
                    arrey[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int i=0; i<len; i++){
            System.out.print(arrey[i] + " ");
        }
        sc.close();
    }
}
