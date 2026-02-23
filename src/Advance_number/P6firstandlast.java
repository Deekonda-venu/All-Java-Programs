package Advance_number;

import java.util.Scanner;

public class P6firstandlast {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int lastdigit = a%10;
        while(a!=0){
            int a1 = a%10;
            a = a/10;
            if(a==0){
                System.out.println(a1);
            }

        }
        System.out.println(lastdigit);
    }
}
