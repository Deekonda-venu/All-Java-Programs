package Advance_number;

import java.util.Scanner;

public class P7Genricroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int temp = a;

        int count = 0;

        while(a!=0){
            int a1 = a%10;
            a = a/10;
            count = count + a1;
            if(count>9 && a==0){
                a = count;
                System.out.println(count);
                count = 0;
            }

        }
        System.out.println(count);

    }
}

//Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//
//        while (a > 9) {   // Repeat until single digit
//int sum = 0;
//
//            while (a != 0) {
//sum = sum + (a % 10);
//a = a / 10;
//        }
//
//a = sum;   // Assign sum back to a
//        }
//
//                System.out.println("Generic Root: " + a);
//    }