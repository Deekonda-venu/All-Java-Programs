package Java_Number_Programs;

import java.util.Scanner;

public class P7withoutlop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        method(a);
    }
    static public void method(int a){

        if (a==100){
            System.out.print(a);
        }
        else {
            System.out.println(a);
            a++;
            method(a);
        }


    }
}
