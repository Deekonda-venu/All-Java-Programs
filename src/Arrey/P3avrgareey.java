package Arrey;

import java.util.Scanner;

public class P3avrgareey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] n = new int[length];
        int count =0;
        for(int i=0; i<length; i++){
            n[i] = sc.nextInt();
            count = count +n[i];

        }

        double avg = count/length;
        System.out.println(avg);



    }
}
