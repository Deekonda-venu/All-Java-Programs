package Advance_number;

import java.util.Scanner;

public class Addtwobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int binary1 = 0;
        int binary2 = 0;

        while (a!=0 || b!=0){
            if(a!=0) {
                a = a / 2;
                int a1 = a % 2;
                binary1 = binary1 * 10;
                binary1 = binary1 + a1;
            }
            if(b!=0) {
                b = b / 2;
                int b1 = b % 2;
                binary2 = binary2 * 10;
                binary2 = binary2 + b1;
            }
        }


        System.out.println(binary1);
        System.out.println(binary2);

        int Sum = binary1+binary2;
        System.out.println(Sum);
    }
}
