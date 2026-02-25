package Logical_q;

import java.util.Scanner;

public class P6SPynumber {
    int n;
    int sum1;
    int product;

    P6SPynumber(int n){
        this.n = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enter = sc.nextInt();

        P6SPynumber p6 = new P6SPynumber(enter);

//        P6SPynumber p7 = new P6SPynumber(enter);
        mainmethod(p6);
    }

    private static void mainmethod(P6SPynumber p6) {
        P6SPynumber sum = sum(p6);
        P6SPynumber product1 = product1(p6);

        System.out.println("Sum = " + sum.sum1);        // ✅ Better print
        System.out.println("Product = " + product1.product); // ✅ Better print

        if(sum.sum1 == product1.product){
            System.out.println("Given number is Spy");
        }else{
            System.out.println("Not Spy");
        }
    }

    static public P6SPynumber sum(P6SPynumber obj){

        P6SPynumber su = new P6SPynumber(0);

        int temp = obj.n;
        while(temp != 0){
            int a = temp % 10;
            temp = temp / 10;
            su.sum1 = su.sum1 + a;
        }
        return su;
    }

    static public P6SPynumber product1(P6SPynumber obj){

        P6SPynumber po = new P6SPynumber(1);

        int temp = obj.n;

        po.product = 1;

        while(temp != 0){
            int a = temp % 10;
            temp = temp / 10;
            po.product = po.product * a;
        }

        return po;
    }
}
