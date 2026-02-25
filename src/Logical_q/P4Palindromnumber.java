package Logical_q;

import java.util.Scanner;

public class P4Palindromnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revser=0;
        while(n!=0){
                int r = n%10;
                n = n/10;
                revser = revser*10 + r;
        }
        System.out.println(revser);

    }
}
