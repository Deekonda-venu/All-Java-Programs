package Logical_q;

import java.util.Scanner;

public class P1Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp1 =a,temp2 = a;
        int count =0;
        int Sum =0;
        while(a>0){
            a =a/10;
            count = count+1;
        }

        for(int i=1; i<=count; i++){
            int lastdigit = temp1%10;
            temp1 = temp1/10;
            Sum = Sum + (int)Math.pow(lastdigit,3);

        }

        System.out.println(Sum);

        if(temp2 == Sum){
            System.out.println("given is Armstrng");
        }else{
            System.out.println("not");
        }

    }
}
