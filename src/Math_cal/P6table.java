package Math_cal;

import java.util.Scanner;

public class P6table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextByte();

        for(int i=1; i<=10; i++){
            System.out.println(a + " * " + i +" = " + a*i);
        }
    }
}
