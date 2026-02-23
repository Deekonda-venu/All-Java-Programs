package Java_Number_Programs;

import java.util.Scanner;

public class P6Largest_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        P6Largest_two p6 = new P6Largest_two();
        int LN= p6.method1(a,b,c);


    }
    int method1(int a , int b , int c){
        if(a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }


        return a;
    }
}
