package Math_cal;

import java.util.Scanner;

public class P8Claclater {
    public static void main(String[] args) {
        Boolean FT = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int A = sc.nextInt();
        while (FT){
            System.out.println("Enter a another number : ");
            int B = sc.nextInt();
            System.out.println("Enter Cammand : ");
            char operator = sc.next().charAt(0);
            switch (operator){
                case '+':
                    A= A+B;
                    break;
                case '-':
                    A=A-B;
                    break;
                case '*':
                    A= A*B;
                    break;
                case '%':
                    A=A%B;
                    break;
                default:
                    FT = false;
                    System.out.println("Enter corredct cammond");

            }

            System.out.println("Total value : " + A);
        }




    }
}
