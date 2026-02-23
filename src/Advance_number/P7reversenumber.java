package Advance_number;

import java.util.Scanner;

public class P7reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int revsere = 0;
        while(a!=0){
            revsere = (revsere*10)+(a%10);
            a = a/10;
        }
        System.out.println(revsere);
    }
}
