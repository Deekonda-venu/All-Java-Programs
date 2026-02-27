package Logical_q;

import java.util.Scanner;

public class P9Polidromstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String n = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            n = n + a.charAt(i);
        }
        if (n.equals(a)) {
            System.out.println("polidrom");
        }else{
            System.out.println("not polidrom");
        }

    }
}
