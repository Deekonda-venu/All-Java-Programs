package Arrey;

import java.util.Scanner;

public class P4incrementarreyone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        for (int i=0; i<n.length; i++){
            n[i] = sc.nextInt();
            n[i] = n[i]+1;
            System.out.println(n[i]);
        }
    }
}
