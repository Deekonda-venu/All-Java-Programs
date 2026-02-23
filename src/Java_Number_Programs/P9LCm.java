package Java_Number_Programs;

import java.util.Scanner;

public class P9LCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = lcm(a, b);
        System.out.println(lcm);
    }

    static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int g = gcd(Math.abs(a), Math.abs(b));
        return Math.abs(a / g * b);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
