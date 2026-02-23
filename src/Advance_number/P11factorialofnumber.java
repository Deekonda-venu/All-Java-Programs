package Advance_number;

import java.util.Scanner;

public class P11factorialofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = 1;
        for(int i=1; i<=a; i++){
            a1 = a1*i;

        }
        System.out.println(a1);
    }
}
