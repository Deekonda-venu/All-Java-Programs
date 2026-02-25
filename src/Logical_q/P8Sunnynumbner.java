package Logical_q;

import java.util.Scanner;

public class P8Sunnynumbner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        a = a+1;
        for(int i=1; i<=a; i++){
            if (i*i==a){
                System.out.println(a);
            }
        }
    }
}
