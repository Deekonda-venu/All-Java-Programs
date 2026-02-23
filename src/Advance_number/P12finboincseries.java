package Advance_number;

import java.util.Scanner;

public class P12finboincseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstvalue = 0;
        int secondvalue =1;
        System.out.println(firstvalue);
        System.out.println(secondvalue);
        for(int i=2; i<=n; i++){
            int thirdvalue = firstvalue+secondvalue;
            firstvalue = secondvalue;
            secondvalue = thirdvalue;
            System.out.println(thirdvalue);

        }



    }
}
