package Java_Number_Programs;

import java.util.Scanner;

public class P10quaerdic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double root1 = meethod1(a,b,c,n);
        System.out.println(root1);
        double roo2 = meethod1(a,b,c,n);
        System.out.println(roo2);

    }
    static public double meethod1(int a, int b, int c ,int n){
        double a1 = b*b - 4*a*c;
        double a2 = 2*a;
        double a3 = b*b;

        double a4 = mehtdo2(a1,a2,a3,n);

        return  a4;

    }
    static public double mehtdo2(double a1, double a2, double a3, int n){
        double a =0;
        if (n ==0){
            a = a3-Math.sqrt(a1);
            a = a/a2;
            n++;
        }else{

            a = a3+Math.sqrt(a1);
            a = a/a2;

        }


        return a;
    }
}
