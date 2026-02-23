package Advance_number;

import java.util.Scanner;

public class P5Firstdigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        while(a!=0){
            int a1 = a%10;
            a = a/10;
            if(a==0){
                System.out.println(a1);
            }

        }
    }
}
