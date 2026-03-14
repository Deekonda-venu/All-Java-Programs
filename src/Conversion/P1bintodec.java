package Conversion;

import java.util.Scanner;

public class P1bintodec {
    int n = 32;

    P1bintodec(int n){
        this.n = n;

    }

    public int Dectobin(int n){
        int a =0;
        int i = 0;
        while (n >0) {

            a = a + (n % 2) * (int) Math.pow(10, i);
            i++;
            n= n/2;


        }
        int a1 = bintodec(a);
        return a1;

    }
    public int bintodec(int a)

    {
        int temp = a;
        int sum = 0;
        int i=0;
        while(a!=0){
            int lastdight = a%10;
            a = a/10;

            sum = sum + (lastdight * (int) Math.pow(2, i));
            i++;
        }
        System.out.println(sum);
        return sum;

    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        P1bintodec p1 = new P1bintodec(a);
        System.out.println(p1.Dectobin(a));
    }
}

