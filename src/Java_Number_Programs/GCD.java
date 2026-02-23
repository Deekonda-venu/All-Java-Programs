package Java_Number_Programs;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int GCD  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nter a : ");
        int a = sc.nextInt();
        System.out.println("Nter b : ");
        int b = sc.nextInt();

        for(int i=1; i<=a || i<=b; i++){

            int a1 = a%i;
            int b1 = b%i;
//            System.out.println(a1);
//            System.out.println(b1);
            if(a1 == b1 && b1 ==0){

                GCD = i;
//                System.out.println(i);

            }
        }
        System.out.println(GCD);

    }
}
