package Logical_q;

import java.security.spec.ECField;
import java.util.Scanner;


public class P7Strongnumber {
    int number;
    P7Strongnumber(int number){
        this.number = number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        P7Strongnumber p7 =  new P7Strongnumber(a);
        P7Strongnumber p8 =  Eachnumber(p7);
        System.out.println(p8.number);



    }
    public static P7Strongnumber Eachnumber(P7Strongnumber p7){
        P7Strongnumber p8 = new P7Strongnumber(0);
        int temp = p7.number;
        while(temp!=0){
            int lastdigit = temp%10;
            temp = temp/10;
            p8.number = p8.number+factoriual(lastdigit);

        }

        return p8 ;

    }
    public  static  int factoriual(int a){
        int sum=1;
        for(int i=1; i<=a; i++){
            sum = sum*i;
        }

        return sum;
    }
}
