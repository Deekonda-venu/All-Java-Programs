package Logical_q;

import java.util.Scanner;

public class P2Peterson_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total =0;
        while( n!= 0){
            int lastdigit = n%10;
            n = n/10;
            int sum =1;
           for(int i=1 ; i<=lastdigit; i++){
               sum = sum*i;

           }
            System.out.println(sum);
           total = total+sum;
        }
        System.out.println(total);

    }
}
