package String;

import java.util.Scanner;

public class P2ASCII_values {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            int a1 =  a.charAt(i);
            System.out.println(a1);
        }

    }
}
