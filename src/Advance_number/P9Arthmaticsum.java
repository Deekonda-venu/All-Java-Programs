package Advance_number;

import java.util.Scanner;

public class P9Arthmaticsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = add(a,b);
        int sum2 = add(a,b,sum1);
        int sum3 = add(a,b,sum1,sum2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
    public static int add(int a,int b){
        int a1 = a+b;
        return a1;
    }
    public static int add(int a,int b, int c){
        int a1 = a+b+c;
        return a1;
    }
    public static int add(int a,int b, int c, int d){
        int a1 = a+b+c+d;
        return a1;
    }

}
