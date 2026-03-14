package String;

import java.util.Scanner;

public class P6ConcatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String c = a.concat(b);
        System.out.println(c);
    }
}
